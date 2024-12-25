package  ZE_BancoDeDadosEscola ;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciamentoAlunos {
    private static final String ARQUIVO = "alunos.txt"; // Arquivo onde os dados serão armazenados

    public static void main(String[] args) {
        List<Aluno> alunos = carregarAlunos(); // Carrega os alunos existentes
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Remover Aluno");
            System.out.println("3. Listar Alunos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o '\n' após a opção

            switch (opcao) {
                case 1 -> { // Adicionar aluno
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir o '\n' após a idade
                    System.out.print("Digite a turma do aluno: ");
                    String turma = scanner.nextLine();
                    int id = gerarId(alunos); // Gera um ID único para o aluno
                    alunos.add(new Aluno(id, nome, idade, turma)); // Adiciona o aluno à lista
                    salvarAlunos(alunos); // Salva no arquivo
                    System.out.println("Aluno adicionado com ID: " + id);
                }
                case 2 -> { // Remover aluno
                    System.out.print("Digite o ID do aluno a remover: ");
                    int id = scanner.nextInt();
                    boolean removido = alunos.removeIf(aluno -> aluno.getId() == id); // Remove aluno pelo ID
                    if (removido) {
                        salvarAlunos(alunos); // Atualiza o arquivo
                        System.out.println("Aluno removido.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                }
                case 3 -> { // Listar alunos
                    System.out.println("\n=== Lista de Alunos ===");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno aluno : alunos) {
                            System.out.println(aluno); // Mostra os alunos com nome, idade, turma e ID
                        }
                    }
                }
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    // Classe para representar o aluno
    static class Aluno {
        private int id;
        private String nome;
        private int idade;
        private String turma;

        public Aluno(int id, String nome, int idade, String turma) {
            this.id = id;
            this.nome = nome;
            this.idade = idade;
            this.turma = turma;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade + ", Turma: " + turma;
        }
    }

    // Gerar um ID único para o aluno
    private static int gerarId(List<Aluno> alunos) {
        return alunos.size() + 1; // ID baseado no número de alunos (incremental)
    }

    // Carregar alunos do arquivo
    private static List<Aluno> carregarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./Área de Trabalho/"+ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(", ");
                if (dados.length == 4) {
                    int id = Integer.parseInt(dados[0].split(": ")[1]);
                    String nome = dados[1].split(": ")[1];
                    int idade = Integer.parseInt(dados[2].split(": ")[1]);
                    String turma = dados[3].split(": ")[1];
                    alunos.add(new Aluno(id, nome, idade, turma)); // Cria o aluno e adiciona à lista
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar alunos: " + e.getMessage());
        }
        return alunos;
    } 

    // Salvar alunos no arquivo
    private static void salvarAlunos(List<Aluno> alunos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Aluno aluno : alunos) {
                bw.write("ID: " + aluno.getId() + ", Nome: " + aluno.nome + ", Idade: " + aluno.idade + ", Turma: " + aluno.turma);
                bw.newLine(); // Adiciona uma nova linha para o próximo aluno
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos: " + e.getMessage());
        }
    }
}

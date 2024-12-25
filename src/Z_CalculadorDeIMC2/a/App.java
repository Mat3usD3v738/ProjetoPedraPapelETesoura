package Z_CalculadorDeIMC2.a;
/*Codigo feito por Mateus Oliveira
 * data : 15/12/2024
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String Mr, Mi, Mc, Mgo, Mrd, Md;

            /*
            * ____________________relatorio____________________

Seu imc é 17.301037
Classificação : Magro ou Baixo
Grau de obesidade 0
Risco de doenças :Normal ou elevado
Treine com Pesos
_________________________________________________*/
            /*
             * O IMC é calculado por meio da divisão do peso
             * do indivíduo pela estatura, em
             * metros, ao quadrado. De forma simplificada,
             * temos: peso/(altura x altura).
             */
            /* Instancia random */
            Random geradorRandom = new Random();
            /* Variaveis peso e altura */
            float peso = 0;
            /* Altura sempre em metros */

            float altura = 0;
            /* Calculo = peso / alturaAoQuadrado */

            /* Intancia cliente */
            /* Calculo do indice de massa corporal */
            System.out.println("_________________________________________________");
            System.out.println();
            System.out.println();
            System.out.println("Digite sua altura e peso calcularemos o seu imc");
            System.out.println("Digite seu peso em kilogramas");
            peso = input.nextFloat();
            System.out.println("Digite sua altura em metros exemplo : 1,50");
            altura = input.nextFloat();

            boolean IsNaturalOuZerado = altura > 0 && peso > 0;
            float alturaAoQuadrado = altura * altura;
            float imc = peso / alturaAoQuadrado;

            if (IsNaturalOuZerado) {

                if (altura <= 2.72 && altura >= 0.5406 && peso >= 0.002 / 1000 && peso <= 635) {

                    if (imc >= 40) {
                        System.out.println();
                        System.out.println("____________________relatorio____________________");
                        System.out.println();
                        System.out.println("Seu imc é " + imc);
                        Mc = "Obesidade Grave";
                        System.out.println("Classificação : Obesidade Grave ");
                        Mgo = "III";
                        System.out.println("Grau de obesidade : III ");
                        Mrd = "multissimo elevado";
                        System.out.println("Risco de doenças : multissimo elevado");
                        switch (geradorRandom.nextInt(5)) {
                            case 1:
                                Md = "Pratique Atividade Física Regular";
                                System.out.println("Pratique Atividade Física Regular");
                                break;
                            case 2:
                                Md = " Mantenha-se Hidratado";
                                System.out.println(" Mantenha-se Hidratado");
                                break;
                            case 3:
                                Md = " Faça Refeições Equilibradas";
                                System.out.println(" Faça Refeições Equilibradas");
                                break;
                            case 4:
                                Md = " Desenvolva uma Relação Saudável com a Comida";
                                System.out.println(" Desenvolva uma Relação Saudável com a Comida");
                                break;
                            case 5:
                                Md = "Considere o Acompanhamento Profissional";
                                System.out.println("Considere o Acompanhamento Profissional");
                                break;
                            default:
                                Md = "Varie Seus Exercícios";
                                System.out.println("Varie Seus Exercícios");
                                break;
                        }
                        EscreverORelatorio(imc, Mc, Mgo, Mrd, Md);

                        System.out.println("_________________________________________________");

                    }

                    if (imc >= 30 && imc <= 39.9) {
                        System.out.println();
                        System.out.println("____________________relatorio____________________");
                        System.out.println();
                        System.out.println("Seu imc é " + imc);
                        Mc = "Obesidade";
                        System.out.println("Classificação : Obesidade ");
                        Mgo = "II";
                        System.out.println("Grau de obesidade II ");
                        Mrd = "muito elevado";
                        System.out.println("Risco de doenças : muito elevado");
                        switch (geradorRandom.nextInt(5)) {
                            case 1:
                                Md = "Pratique Atividade Física Regular";
                                System.out.println("Pratique Atividade Física Regular");
                                break;
                            case 2:
                                Md = " Mantenha-se Hidratado";
                                System.out.println(" Mantenha-se Hidratado");
                                break;
                            case 3:
                                Md = " Faça Refeições Equilibradas";
                                System.out.println(" Faça Refeições Equilibradas");
                                break;
                            case 4:
                                Md = " Desenvolva uma Relação Saudável com a Comida";
                                System.out.println(" Desenvolva uma Relação Saudável com a Comida");
                                break;
                            case 5:
                                Md = "Considere o Acompanhamento Profissional";
                                System.out.println("Considere o Acompanhamento Profissional");
                                break;
                            default:
                                Md = "Varie Seus Exercícios";
                                System.out.println("Varie Seus Exercícios");
                                break;
                        }
                        EscreverORelatorio(imc, Mc, Mgo, Mrd, Md);

                        System.out.println("_________________________________________________");
                        /* Obesidade 5 */
                        /* Grau de obesidade II */

                    }
                    if (imc >= 30 && imc <= 34.9) {
                        System.out.println();
                        System.out.println("____________________relatorio____________________");
                        System.out.println();
                        System.out.println("Seu imc é " + imc);
                        Mc = "Obesidade";
                        System.out.println("Classificação : Obesidade ");
                        Mgo = "I";
                        System.out.println("Grau de obesidade I ");
                        Mrd = "elevado";
                        System.out.println("Risco de doenças : elevado");
                        switch (geradorRandom.nextInt(5)) {
                            case 1:
                                Md = "Pratique Atividade Física Regular";
                                System.out.println("Pratique Atividade Física Regular");
                                break;
                            case 2:
                                Md = " Mantenha-se Hidratado";
                                System.out.println(" Mantenha-se Hidratado");
                                break;
                            case 3:
                                Md = "Faça Refeições Equilibradas";
                                System.out.println(" Faça Refeições Equilibradas");
                                break;
                            case 4:
                                Md = " Desenvolva uma Relação Saudável com a Comida";
                                System.out.println(" Desenvolva uma Relação Saudável com a Comida");
                                break;
                            case 5:
                                Md = "Considere o Acompanhamento Profissional";
                                System.out.println("Considere o Acompanhamento Profissional");
                                break;
                            default:
                                Md = "Varie Seus Exercícios";
                                System.out.println("Varie Seus Exercícios");
                                break;
                        }
                        EscreverORelatorio(imc, Mc, Mgo, Mrd, Md);

                        System.out.println("_________________________________________________");
                        /* Obesidade 4 */
                        /* Grau de obesidade I */

                    }
                    if (imc >= 25 && imc <= 29.9) {
                        System.out.println();
                        System.out.println("____________________relatorio____________________");
                        System.out.println();
                        System.out.println("Seu imc é " + imc);
                        Mc = "Sobrepeso ou pré-obeso";
                        System.out.println("Classificação : Sobrepeso ou pré-obeso ");
                        Mgo = "0";
                        System.out.println("Grau de obesidade 0 ");
                        Mrd = "pouco elevado";
                        System.out.println("Risco de doenças : pouco elevado");
                        switch (geradorRandom.nextInt(5)) {
                            case 1:
                                Md = "Faça Pequenos Ajustes Alimentares";
                                System.out.println("Faça Pequenos Ajustes Alimentares");
                                break;
                            case 2:
                                Md = "Foco no Bem-Estar Geral, Não Apenas no Peso";
                                System.out.println("Foco no Bem-Estar Geral, Não Apenas no Peso");
                                break;
                            case 3:
                                Md = "Substitua Alimentos Processados por Integrais";
                                System.out.println("Substitua Alimentos Processados por Integrais");
                                break;
                            case 4:
                                Md = "Inclua Alimentos Ricos em Proteínas";
                                System.out.println("Inclua Alimentos Ricos em Proteínas");
                                break;
                            case 5:
                                Md = "Evite Comer Tarde da Noite";
                                System.out.println("Evite Comer Tarde da Noite");
                                break;
                            default:
                                Md = "Varie Seus Exercícios";
                                System.out.println("Varie Seus Exercícios");
                                break;
                        }
                        /* Sobrepeso ou pré-obeso 3 */
                        /* Grau de obesidade 0 */
                        EscreverORelatorio(imc, Mc, Mgo, Mrd, Md);

                        System.out.println("_________________________________________________");

                    }
                    if (imc >= 18.5 && imc <= 24.9) {
                        System.out.println();
                        System.out.println("____________________relatorio____________________");
                        System.out.println();
                        System.out.println("Seu imc é " + imc);
                        Mc = "Normal ou eutrófico";
                        System.out.println("Classificação : Normal ou eutrófico");
                        Mgo = "0";
                        System.out.println("Grau de obesidade 0 ");
                        Mrd = "normal";
                        System.out.println("Risco de doenças : normal");

                        switch (geradorRandom.nextInt(5)) {
                            case 1:
                                Md = "Melhor Qualidade do Sono";
                                System.out.println("Melhor Qualidade do Sono");
                                break;
                            case 2:
                                Md = "Facilidade em Manter a Mobilidade e Flexibilidade";
                                System.out.println("Facilidade em Manter a Mobilidade e Flexibilidade");
                                break;
                            case 3:
                                Md = "Melhor Função Digestiva";
                                System.out.println("Melhor Função Digestiva");
                                break;
                            case 4:
                                Md = "Maior Controle sobre o Peso";
                                System.out.println("Maior Controle sobre o Peso");
                                break;
                            case 5:
                                Md = "Melhor Saúde Cardiovascular ";
                                System.out.println("Melhor Saúde Cardiovascular ");
                                break;
                            default:
                                Md = "Sistema Imunológico Mais Forte";
                                System.out.println("Sistema Imunológico Mais Forte");
                                break;
                        }
                        EscreverORelatorio(imc, Mc, Mgo, Mrd, Md);

                        System.out.println("_________________________________________________");
                        /* Normal ou eutrófico 2 */
                        /* Grau de obesidade 0 */

                    }
                    if (imc < 18.5) {
                        System.out.println();
                        System.out.println("____________________relatorio____________________");
                        System.out.println();
                        System.out.println("Seu imc é " + imc);
                        Mc = "Magro ou Baixo";
                        System.out.println("Classificação : Magro ou Baixo ");
                        Mgo = "0";
                        System.out.println("Grau de obesidade 0 ");
                        Mrd = "Normal ou elevado";
                        System.out.println("Risco de doenças :Normal ou elevado");

                        switch (geradorRandom.nextInt(5)) {
                            case 1:
                                Md = "Inclua Proteínas em Todas as Refeições";
                                System.out.println("Inclua Proteínas em Todas as Refeições");
                                break;
                            case 2:
                                Md = "Treine com Pesos";
                                System.out.println("Treine com Pesos");
                                break;
                            case 3:
                                Md = "Evite Alimentos Processados e Açucarados";
                                System.out.println("Evite Alimentos Processados e Açucarados");
                                break;
                            case 4:
                                Md = "Inclua Alimentos Ricos em Proteínas";
                                System.out.println("Inclua Alimentos Ricos em Proteínas");
                                break;
                            case 5:
                                Md = " Hidrate-se com Bebidas Calóricas ";
                                System.out.println(" Hidrate-se com Bebidas Calóricas");
                                break;
                            default:
                                Md = "Crie um Ambiente Favorável para Comer";
                                System.out.println("Crie um Ambiente Favorável para Comer");
                                break;


                        }
                        EscreverORelatorio(imc, Mc, Mgo, Mrd, Md);
                        //EscreverORelatorio("Relatorio.txt");
                        System.out.println("_________________________________________________");
                        /* magro ou baixo 1 */
                        /* Grau de obesidade 0 */
                    }
                } else {
                    System.out.println("Altura ou peso inválido");
                }


            } else {

                if (peso != 0 && altura != 0) {
                    System.out.println("Altura ou peso inválido");
                    System.out.println("Não podemos usar numeros negativos");

                } else {
                    System.out.println("Altura ou peso inválido");
                    System.out.println("Não podemos usar o  numero 0 ");
                    input.close();

                }
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Erro");
        }


    }


    private static void EscreverORelatorio(float imc, String Mc, String Mgo, String Mrd, String Md) {
        File file = new File("/home/mateus/Área de Trabalho/Relatorio.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
            bw.newLine();
            bw.write("____________________relatorio____________________");
           bw.newLine();
            bw.write("seu IMC é : " + imc);
           bw.newLine();
            bw.write("Classificação : " + Mc);
           bw.newLine();
            bw.write("Grau de obesidade : " + Mgo);
           bw.newLine();
            bw.write("Risco de doenças : " + Mrd);
           bw.newLine();
            bw.write(Md);
           bw.newLine();
            bw.write("_________________________________________________");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}


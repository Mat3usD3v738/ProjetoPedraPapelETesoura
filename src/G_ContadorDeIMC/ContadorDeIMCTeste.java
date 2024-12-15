package G_ContadorDeIMC;
/*Codigo feito por Mateus Oliveira
 * data : 02/10/2024
 * Projeto no github : https://github.com/Mateusmaker099/Contador-de-IMC-java3
 */

import java.util.Random;
import java.util.Scanner;

public class ContadorDeIMCTeste {
    public static void main(String[] args) {
        /*
         * O IMC é calculado por meio da divisão do peso
         * do indivíduo pela estatura, em
         * metros, ao quadrado. De forma simplificada,
         * temos: peso/(altura x altura).
         */
        /* Instancia random */
        Random geradorRandom = new Random();
        /* Intancia scanner */
        Scanner input = new Scanner(System.in);
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
        /*
         * 635
         * 2
         * 54,6 cm
         * 2,72m
         */
        boolean IsNaturalOuZerado = altura > 0 && peso > 0;
        float alturaAoQuadrado = altura * altura;
        float imc = peso / alturaAoQuadrado;

        if (IsNaturalOuZerado) {

            /* .5406 */
            if (altura <= 2.72 && altura >= 0.5406 && peso >= 0.002 / 1000 && peso <= 635) {

                if (imc >= 40) {
                    System.out.println();
                    System.out.println("____________________relatorio____________________");
                    System.out.println();
                    System.out.println("Seu imc é " + imc);
                    System.out.println("Classificação : Obesidade Grave ");
                    System.out.println("Grau de obesidade III ");
                    System.out.println("Risco de doenças : multissimo elevado");
                    switch (geradorRandom.nextInt(5)) {
                        case 1:
                            System.out.println("Pratique Atividade Física Regular");
                            break;
                        case 2:
                            System.out.println(" Mantenha-se Hidratado");
                            break;
                        case 3:
                            System.out.println(" Faça Refeições Equilibradas");
                            break;
                        case 4:
                            System.out.println(" Desenvolva uma Relação Saudável com a Comida");
                            break;
                        case 5:
                            System.out.println("Considere o Acompanhamento Profissional");
                            break;
                        default:
                            System.out.println("Varie Seus Exercícios");
                            break;
                    }
                    System.out.println("_________________________________________________");

                }

                if (imc >= 30 && imc <= 39.9) {
                    System.out.println();
                    System.out.println("____________________relatorio____________________");
                    System.out.println();
                    System.out.println("Seu imc é " + imc);
                    System.out.println("Classificação : Obesidade ");
                    System.out.println("Grau de obesidade II ");
                    System.out.println("Risco de doenças : muito elevado");
                    switch (geradorRandom.nextInt(5)) {
                        case 1:
                            System.out.println("Pratique Atividade Física Regular");
                            break;
                        case 2:
                            System.out.println(" Mantenha-se Hidratado");
                            break;
                        case 3:
                            System.out.println(" Faça Refeições Equilibradas");
                            break;
                        case 4:
                            System.out.println(" Desenvolva uma Relação Saudável com a Comida");
                            break;
                        case 5:
                            System.out.println("Considere o Acompanhamento Profissional");
                            break;
                        default:
                            System.out.println("Varie Seus Exercícios");
                            break;
                    }
                    System.out.println("_________________________________________________");
                    /* Obesidade 5 */
                    /* Grau de obesidade II */

                }
                if (imc >= 30 && imc <= 34.9) {
                    System.out.println();
                    System.out.println("____________________relatorio____________________");
                    System.out.println();
                    System.out.println("Seu imc é " + imc);
                    System.out.println("Classificação : Obesidade ");
                    System.out.println("Grau de obesidade I ");
                    System.out.println("Risco de doenças : elevado");
                    switch (geradorRandom.nextInt(5)) {
                        case 1:
                            System.out.println("Pratique Atividade Física Regular");
                            break;
                        case 2:
                            System.out.println(" Mantenha-se Hidratado");
                            break;
                        case 3:
                            System.out.println(" Faça Refeições Equilibradas");
                            break;
                        case 4:
                            System.out.println(" Desenvolva uma Relação Saudável com a Comida");
                            break;
                        case 5:
                            System.out.println("Considere o Acompanhamento Profissional");
                            break;
                        default:
                            System.out.println("Varie Seus Exercícios");
                            break;
                    }
                    System.out.println("_________________________________________________");
                    /* Obesidade 4 */
                    /* Grau de obesidade I */

                }
                if (imc >= 25 && imc <= 29.9) {
                    System.out.println();
                    System.out.println("____________________relatorio____________________");
                    System.out.println();
                    System.out.println("Seu imc é " + imc);
                    System.out.println("Classificação : Sobrepeso ou pré-obeso ");
                    System.out.println("Grau de obesidade 0 ");
                    System.out.println("Risco de doenças : pouco elevado");
                    switch (geradorRandom.nextInt(5)) {
                        case 1:
                            System.out.println("Faça Pequenos Ajustes Alimentares");
                            break;
                        case 2:
                            System.out.println("Foco no Bem-Estar Geral, Não Apenas no Peso");
                            break;
                        case 3:
                            System.out.println("Substitua Alimentos Processados por Integrais");
                            break;
                        case 4:
                            System.out.println("Inclua Alimentos Ricos em Proteínas");
                            break;
                        case 5:
                            System.out.println("Evite Comer Tarde da Noite");
                            break;
                        default:
                            System.out.println("Varie Seus Exercícios");
                            break;
                    }
                    /* Sobrepeso ou pré-obeso 3 */
                    /* Grau de obesidade 0 */
                    System.out.println("_________________________________________________");

                }
                if (imc >= 18.5 && imc <= 24.9) {
                    System.out.println();
                    System.out.println("____________________relatorio____________________");
                    System.out.println();
                    System.out.println("Seu imc é " + imc);
                    System.out.println("Classificação : Normal ou eutrófico");
                    System.out.println("Grau de obesidade 0 ");
                    System.out.println("Risco de doenças : normal");

                    switch (geradorRandom.nextInt(5)) {
                        case 1:
                            System.out.println("Melhor Qualidade do Sono");
                            break;
                        case 2:
                            System.out.println("Facilidade em Manter a Mobilidade e Flexibilidade");
                            break;
                        case 3:
                            System.out.println("Melhor Função Digestiva");
                            break;
                        case 4:
                            System.out.println("Maior Controle sobre o Peso");
                            break;
                        case 5:
                            System.out.println("Melhor Saúde Cardiovascular ");
                            break;
                        default:
                            System.out.println("Sistema Imunológico Mais Forte");
                            break;
                    }
                    System.out.println("_________________________________________________");
                    /* Normal ou eutrófico 2 */
                    /* Grau de obesidade 0 */

                }
                if (imc < 18.5) {
                    System.out.println();
                    System.out.println("____________________relatorio____________________");
                    System.out.println();
                    System.out.println("Seu imc é " + imc);
                    System.out.println("Classificação : Magro ou Baixo ");
                    System.out.println("Grau de obesidade 0 ");
                    System.out.println("Risco de doenças :Normal ou elevado");

                    switch (geradorRandom.nextInt(5)) {
                        case 1:
                            System.out.println("Inclua Proteínas em Todas as Refeições");
                            break;
                        case 2:
                            System.out.println("Treine com Pesos");
                            break;
                        case 3:
                            System.out.println("Evite Alimentos Processados e Açucarados");
                            break;
                        case 4:
                            System.out.println("Inclua Alimentos Ricos em Proteínas");
                            break;
                        case 5:
                            System.out.println(" Hidrate-se com Bebidas Calóricas");
                            break;
                        default:
                            System.out.println("Crie um Ambiente Favorável para Comer");
                            break;
                    }
                    System.out.println("_________________________________________________");
                    /* magro ou baixo 1 */
                    /* Grau de obesidade 0 */
                }
            } else {
                System.out.println("Altura ou peso inválido");
            }

            input.close();
        } else {

            if (peso != 0 && altura != 0) {
                System.out.println("Altura ou peso inválido");
                System.out.println("Não podemos usar numeros negativos");
                input.close();
            } else {
                System.out.println("Altura ou peso inválido");
                System.out.println("Não podemos usar o  numero 0 ");
                input.close();
            }
        }
    }

}

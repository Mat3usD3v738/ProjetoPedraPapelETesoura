package M_GraficoDeEsportes ;
import java.util.*;


import java.io.*;



    public class App /*extends Object*/ {
public static void main(String[] args) throws InputMismatchException{
  

        // Armazenando o HTML completo em uma variável String
       

        // Imprimir o conteúdo HTML armazenado na variável

/*Variaveis */
         
int NPS_Flamengo  = 3;
int NPS_Palmeiras  = 3;
int NPS_Corinthians  = 3;
int NPS_SãoPaulo  = 3;
int NPS_SportRecife  = 3;
int NPS_SantaCruz  = 3;
int NPS_Náutico  = 3;
int outros  = 3;
Integer total   = 3;

String NPS_Flamengo_PorCento = "jifjgik" ;
String NPS_Palmeiras_PorCento = "jifjgik";
String NPS_Corinthians_PorCento = "jifjgik";
String NPS_SãoPaulo_PorCento = "jifjgik";
String NPS_SportRecife_PorCento = "jifjgik";
String NPS_SantaCruz_PorCento = "jifjgik";
String NPS_Náutico_PorCento = "jifjgik";
String outros_PorCento = "jifjgik";



/*Instanias Scanner e File*/

Scanner in = new Scanner(System.in) ;

/*********************************** */

try {
System.out.println("_____________________________________________");
System.out.println("Digite o total de pessoas");
total = in.nextInt();
System.out.println("Digite o numero de pessoas que votaram em flamengo");
NPS_Flamengo = in.nextInt();
System.out.println("Digite o numero de pessoas que votaram em palmeiras");
NPS_Palmeiras = in.nextInt();
System.out.println("Digite o numero de pessoas que votaram em corinthias");
NPS_Corinthians = in.nextInt();
System.out.println("Digite o numero de pessoas que votaram em São Paulo");
NPS_SãoPaulo = in.nextInt();
System.out.println("Digite o numero de pessoas que votaram em Sport Recife");
NPS_SportRecife = in.nextInt();
System.out.println("Digite o numero de pessoas que votaram em Santa Cruz");
NPS_SantaCruz = in.nextInt();
System.out.println("Digite o numero de pessoas que votaram em Náutico");
NPS_Náutico = in.nextInt();
System.out.println("Digite o numero de pessoas que votaram em outros");
outros = in.nextInt();
in.close();

} catch (InputMismatchException e) {
    System.out.println("Você deve usar numeros");
    System.out.println('\n');
   e.printStackTrace();


}
 NPS_Flamengo_PorCento = CalcularPorcentagem(NPS_Flamengo, total);
 NPS_Palmeiras_PorCento = CalcularPorcentagem(NPS_Palmeiras, total);
 NPS_Corinthians_PorCento = CalcularPorcentagem(NPS_Corinthians, total);
 NPS_SãoPaulo_PorCento = CalcularPorcentagem(NPS_SãoPaulo, total);
 NPS_SportRecife_PorCento = CalcularPorcentagem(NPS_SportRecife, total);
 NPS_SantaCruz_PorCento = CalcularPorcentagem(NPS_SantaCruz, total);
 NPS_Náutico_PorCento = CalcularPorcentagem(NPS_Náutico, total);
 outros_PorCento = CalcularPorcentagem(outros, total);



System.out.println("_____________________________________________");
System.out.println("Poncentagem Flamengo: "+NPS_Flamengo_PorCento + " ");
System.out.println("Poncentagem Palmeiras: "+NPS_Palmeiras_PorCento + " ");
System.out.println("Poncentagem Corinthians: "+NPS_Corinthians_PorCento + " ");
System.out.println("Poncentagem São Paulo: "+NPS_SãoPaulo_PorCento + " ");
System.out.println("Poncentagem Sport Recife: "+NPS_SportRecife_PorCento + " ");
System.out.println("Poncentagem SantaCruz: "+NPS_SantaCruz_PorCento + " ");
System.out.println("Poncentagem Náutico: "+NPS_Náutico_PorCento + " ");
System.out.println("Poncentagem outros: "+outros_PorCento + " ");
System.out.println("_____________________________________________");



        // Armazenando o HTML completo em uma variável String com substituição das porcentagens
        String htmlContent = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "  <meta charset=\"UTF-8\">\n"
                + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "  <title>Gráfico de Barras - Torcidas</title>\n"
                + "  <style>\n"
                + "    h3{\n"
                + "        left: 45%;\n"
                + "      position: absolute;\n"
                + "    }\n"
                + "    body {\n"
                + "      font-family: Arial, sans-serif;\n"
                + "    }\n"
                + "    .chart {\n"
                + "      display: flex;\n"
                + "      align-items: flex-end;\n"
                + "      height: 300px;\n"
                + "      width: 100%;\n"
                + "      border-left: 2px solid black;\n"
                + "      border-bottom: 2px solid black;\n"
                + "      margin: 20px 0;\n"
                + "    }\n"
                + "    .chart .bar {\n"
                + "      flex: 1;\n"
                + "      margin: 0 5px;\n"
                + "      text-align: center;\n"
                + "      position: relative;\n"
                + "    }\n"
                + "    .chart .bar span {\n"
                + "      display: block;\n"
                + "      height: 100%;\n"
                + "      width: 100%;\n"
                + "      background-color: #3498db;\n"
                + "      position: absolute;\n"
                + "      bottom: 0;\n"
                + "      color: white;\n"
                + "      font-weight: bold;\n"
                + "      display: flex;\n"
                + "      justify-content: center;\n"
                + "      align-items: center;\n"
                + "    }\n"
                + "    .labels {\n"
                + "      display: flex;\n"
                + "      justify-content: space-between;\n"
                + "      margin-top: 10px;\n"
                + "    }\n"
                + "    .label {\n"
                + "      text-align: center;\n"
                + "      flex: 1;\n"
                + "      padding: 0 10px; /* Adiciona espaçamento entre os nomes */\n"
                + "    }\n"
                + "  </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <h3>Total de pessoas : "+total+"</h3>\n"  // Corrigido o fechamento da tag
                + "  <h1>Gráfico de Barras - Torcidas</h1>\n"
                + "\n"
                + "  <div class=\"chart\">\n"
                + "    <div class=\"bar\" style=\"height: " + NPS_Flamengo_PorCento + "\">\n"
                + "      <span>" + NPS_Flamengo_PorCento + "</span>\n"
                + "    </div>\n"
                + "    <div class=\"bar\" style=\"height: " + NPS_Palmeiras_PorCento + "\">\n"
                + "      <span>" + NPS_Palmeiras_PorCento + "</span>\n"
                + "    </div>\n"
                + "    <div class=\"bar\" style=\"height: " + NPS_Corinthians_PorCento + "\">\n"
                + "      <span>" + NPS_Corinthians_PorCento + "</span>\n"
                + "    </div>\n"
                + "    <div class=\"bar\" style=\"height: " + NPS_SãoPaulo_PorCento + "\">\n"
                + "      <span>" + NPS_SãoPaulo_PorCento + "</span>\n"
                + "    </div>\n"
                + "    <div class=\"bar\" style=\"height: " + NPS_SportRecife_PorCento + "\">\n"
                + "      <span>" + NPS_SportRecife_PorCento + "</span>\n"
                + "    </div>\n"
                + "    <div class=\"bar\" style=\"height: " + NPS_SantaCruz_PorCento + "\">\n"
                + "      <span>" + NPS_SantaCruz_PorCento + "</span>\n"
                + "    </div>\n"
                + "    <div class=\"bar\" style=\"height: " + NPS_Náutico_PorCento + "\">\n"
                + "      <span>" + NPS_Náutico_PorCento + "</span>\n"
                + "    </div>\n"
                + "    <div class=\"bar\" style=\"height: " + outros_PorCento + "\">\n"
                + "      <span>" + outros_PorCento + "</span>\n"
                + "    </div>\n"
                + "  </div>\n"
                + "\n"
                + "  <div class=\"labels\">\n"
                + "    <div class=\"label\">Flamengo</div>\n"
                + "    <div class=\"label\">Palmeiras</div>\n"
                + "    <div class=\"label\">Corinthians</div>\n"
                + "    <div class=\"label\">São Paulo</div>\n"
                + "    <div class=\"label\">Sport</div>\n"
                + "    <div class=\"label\">Santa Cruz</div>\n"
                + "    <div class=\"label\">Náutico</div>\n"
                + "    <div class=\"label\">Outros</div>\n"
                + "  </div>\n"
                + "</body>\n"
                + "</html>";


       
String caminho =  "index.html" ; 

try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(caminho)))) {
            // Escreve o conteúdo HTML no arquivo
            writer.write(htmlContent);
            System.out.println("Arquivo HTML criado com sucesso em: " +caminho);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo HTML: " + e.getMessage());
        }

System.out.println("Caminho : http://127.0.0.1:3000/GraficoDeEsportes/src/index.html");
System.out.println("Caminho do html : /home/mateus/Área de Trabalho/ProjetosJava/Execicios/GraficoDeEsportes/src/index.html");

}
    
private static String CalcularPorcentagem(int numTime, int total) {
        if (total == 0) {
            return "0.0"; // Evita divisão por zero
        }
        double porcentagem = ((double) numTime / total) * 100;
        return String.format(Locale.US,"%.1f", porcentagem) +"%"; 
    }
    

   
    
}

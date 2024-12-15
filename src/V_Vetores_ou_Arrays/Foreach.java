package V_Vetores_ou_Arrays ;

public class Foreach {

    public static void main(String[] args) {
        char[] arrayChar = new char[] { 'L', 'G', 'N', 'Z', 'D' };
        String[] arrayString = new String[] { "Luffy", "Goku", "Naruto", "Zoro", "Dojo" };
        short cont = 0;
        int[] num = new int[] { 12, 23, 45, 67, 89, 90 };
        for (int i : num) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("________________________________________________________________________________");
        System.out.println("");
        /*
         * A condição é vdd , executa as chaves , se for falsa para
         * 
         */
        while (cont <= 10) {
            System.out.println(cont++);
        }

        System.out.println("");
        System.out.println("___________________________________________________________________________________");
        System.out.println("");
        System.out.println("Personagens de anime");
        for (String mensagem : arrayString) {
            System.out.println(mensagem);
        }
        System.out.println("");
        System.out.println("___________________________________________________________________________________");
        System.out.println("");

        for (char mensagemChar : arrayChar) {
            System.out.println(mensagemChar);
        }

    }

}

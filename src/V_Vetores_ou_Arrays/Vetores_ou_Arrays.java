package V_Vetores_ou_Arrays ;


public class Vetores_ou_Arrays {
    /*
     * Por meio de array, em uma escola do 1 ano até o 9 ano, cada sala do
     * fundamental 1 tem 45 alunos, e cada sala do fundamental 2 tem 63
     */
    public static void main(String[] args) {
        String[] sala = new String[9];
        sala[0] = "Primeiro ano";
        sala[1] = "Segundo ano";
        sala[2] = "Terceiro ano";
        sala[3] = "Quarto ano";
        sala[4] = "Quinto ano";
        sala[5] = "Sexto ano";
        sala[6] = "Sétimo ano";
        sala[7] = "Oitavo ano";
        sala[8] = "Nono ano";

        long[] cont = new long[9];
        cont[0] = 45;
        cont[1] = 45;
        cont[2] = 45;
        cont[3] = 45;
        cont[4] = 45;
        cont[5] = 63;
        cont[6] = 63;
        cont[7] = 63;
        cont[8] = 63;

        for (int j = 0; j < 9; j++) { // Corrigido para j < 9
            System.out.println("");
            System.out.println(sala[j]);
            System.out.println(cont[j]);
            System.out.println("");
        }
            
        }
    }


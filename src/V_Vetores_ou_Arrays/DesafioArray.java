package V_Vetores_ou_Arrays ;
public class DesafioArray {
    public static void main(String[] args) {
        final byte tam = 4;
        byte[] num = new byte[tam];
        num[0] = 23;
        num[1] = 45;
        num[2] = 56;
        num[3] = 67;
        num[4] = 90;
        for (byte i = tam; i <= 0; i--) {
            System.out.println(num[i]);
        }
        /*
         * for(byte n : num){
         * System.out.println(n);
         * }
         */

    }
}

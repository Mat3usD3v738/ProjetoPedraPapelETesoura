package O_LacosDeRepeticao ;


public class ExercicioLacosDeRepeticao {
    public static void main(String[] args) {
        long cont = 0;

        for (cont = 0; cont <= 1000; cont++) {
            if (cont % 2 == 0) {
                System.out.println("For" + cont);
            }
        }
    }
}

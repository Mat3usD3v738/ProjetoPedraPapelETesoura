package W_Polimorfismo.domino;

public final class Tomate extends Produto{

public  String TipoDeTomate ;

    @Override
    public String toString() {
        return "Produto{" +
                "nomeDoProduto='" + nomeDoProduto + '\'' +
                ", valorDoProduto='" + valorDoProduto + '\'' +
                ", corDoProduto='" + corDoProduto + '\'' +
                '}';
    }

    @Override
    public void infor() {
        super.infor();
        System.out.println(getTipoDeTomate());
    }

    public String getTipoDeTomate() {
        return TipoDeTomate;
    }

    public void setTipoDeTomate(String tipoDeTomate) {
        TipoDeTomate = tipoDeTomate;
    }

}

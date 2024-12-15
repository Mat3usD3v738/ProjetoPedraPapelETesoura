package W_Polimorfismo.domino;

public abstract class Produto  {
   protected String nomeDoProduto ;
   protected String valorDoProduto ;
   protected String corDoProduto ;

public void compreiUmProduto(){

    System.out.println("Comprei um : "+this.nomeDoProduto);
}
    public void infor(){
        System.out.println("Objeto Criado");
        System.out.println(nomeDoProduto);
        System.out.println(valorDoProduto);
        System.out.println(corDoProduto);

    }
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(String valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public String getCorDoProduto() {
        return corDoProduto;
    }

    public void setCorDoProduto(String corDoProduto) {
        this.corDoProduto = corDoProduto;
    }
}

package R_Polimorfismo.dominnio.ClasseMãe ; 
public abstract class Produto {
    protected String nomeDoProduto , nomeDoVendedor , nomeDoConsumidor ; 
    protected double preco; 
    
    @Override
    public String toString() {
        return nomeDoProduto ;
    }

public void print(){
    System.out.println("__________________________________________________-");
    System.out.println("Produto.print()");
    System.out.println("\n");
    this.comprar();
    System.out.println("\n");
    System.out.println("Nome do produto : "+nomeDoProduto);
    System.out.println("Nome do vendedor : "+nomeDoVendedor);
    System.out.println("Nome do consumidor : "+nomeDoConsumidor);
    System.out.println("Preço : "+preco);
    System.out.println("\n");
    System.out.println("__________________________________________________-");

}

    public  abstract void comprar();
/*
public Produto(String nomeDoProduto ){
    this.nomeDoProduto = nomeDoProduto ; 
}
* 
*/
    public String getNome() {
        return nomeDoProduto;
    }

    public void setNome(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = (double) preco;
    }

    public String getNomeDoVendedor() {
        return nomeDoVendedor;
    }

    public void setNomeDoVendedor(String nomeDoVendedor) {
        this.nomeDoVendedor = nomeDoVendedor;
    }

    public String getNomeDoConsumidor() {
        return nomeDoConsumidor;
    }

    public void setNomeDoConsumidor(String nomeDoConsumidor) {
        this.nomeDoConsumidor = nomeDoConsumidor;
    }
}

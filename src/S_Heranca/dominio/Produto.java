package S_Heranca.dominio;


public class Produto {
    protected String nome ;
    protected int preço ;
protected String cliente ;
    @Override
    public String toString() {
        return "Produto [nome=" + nome + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    } 
    
}

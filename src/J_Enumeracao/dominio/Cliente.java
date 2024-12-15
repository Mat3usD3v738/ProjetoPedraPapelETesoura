package J_Enumeracao.dominio ;

public final class Cliente extends Pessoa {
    private float salario;
    private String nomeDoProdutoString;

    @Override
    public String toString() {
        return "Cliente [salario=" + salario + ", nomeDoProdutoString=" + nomeDoProdutoString + "]";
    }

    public Cliente(float salario, String nomeDoProdutoString) {
        this.salario = salario;
        this.nomeDoProdutoString = nomeDoProdutoString;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialização() {
        return nomeDoProdutoString;
    }

    public void setEspecialização(String nomeDoProdutoString) {
        this.nomeDoProdutoString = nomeDoProdutoString;
    }

}

package J_Enumeracao.dominio ;

public class Pessoa {
    private String nome;
    private short idade;

    @Override
    public String toString() {
        return "Pessoa nome=" + nome;
    }

    public Pessoa(String nome, short idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    private char sexo;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

}

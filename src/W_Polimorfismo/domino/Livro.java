package W_Polimorfismo.domino;


public final class Livro extends Produto  {
    @Override
    public String toString() {
        return "Livro{" +
                "autorDoLivro='" + autorDoLivro + '\'' +
                '}';
    }




    public String autorDoLivro ="Steven K. Scot" ;;

@Override
    public void infor(){
        corDoProduto = "Azul" ;
    nomeDoProduto = "Salomao o homem mais rico que existiu";
    valorDoProduto ="R$30,00";
        System.out.println("Objeto Criado");
        System.out.println(nomeDoProduto);
        System.out.println(autorDoLivro);
        System.out.println(valorDoProduto);
        System.out.println(corDoProduto);
    }



    public String getAutorDoLivro() {
        return autorDoLivro;
    }

    public void setAutorDoLivro(String autorDoLivro) {
        this.autorDoLivro = autorDoLivro;
    }


}

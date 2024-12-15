package J_Enumeracao.teste;

import J_Enumeracao.dominio.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(20000, "Carro");

        cliente.setNome("Mateus");
        System.out.println(cliente);
    }
}

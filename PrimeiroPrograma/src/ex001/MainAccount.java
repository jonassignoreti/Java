package ex001;

public class MainAccount {
    public static void main(String[] args) {
        Account fulano = new Account(); // Declaração do objeto
        fulano.setName("Jonas Signoreti"); // Utilizando um método, entrando um valor no objeto
        System.out.println(fulano.getName()); // Objeto retornando valores
    }
}

package canetateste;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setCor("Azul");
        c1.setMarca("Bic");
        c1.setTamanho((float) 0.7);
        System.out.println(c1);
    }
}

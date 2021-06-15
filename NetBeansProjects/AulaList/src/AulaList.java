import java.util.ArrayList;

public class AulaList {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("A"); //Adiciona no ArrayList
        lista.add("C"); //Adiciona no ArrayList
        
        System.out.println(lista);
        
        lista.add(1, "B"); //Adiciona no ArrayList na posição 1
        
        System.out.println(lista);
        
        boolean existe = lista.contains("A");
        if (existe) {
            System.out.println("O Elemento existe no Array");
        } else {
            System.out.println("O Elemento NÃO existe no Array");
        }
    }
        
}

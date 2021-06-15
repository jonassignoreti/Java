package exemplogenericos;

public class Tipos<T, S> {
    private final T ob;
    private final S ob2;
    
    public Tipos(T ob, S ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }
    
    public void mostrarTipos(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
    
    @Override
    public String toString(){
        return this.ob + ", " + this.ob2;
    }
    
    public static void main(String[] args) {
        Tipos<Integer, String> obj1 = new Tipos<>(4, "quatro");
        Tipos<Integer, String> obj2 = new Tipos(7, "sete");
        obj1.mostrarTipos();
        obj2.mostrarTipos();
        
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

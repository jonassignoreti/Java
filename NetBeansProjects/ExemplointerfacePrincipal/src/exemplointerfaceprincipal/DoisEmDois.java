
package exemplointerfaceprincipal;

public class DoisEmDois implements InterfaceNossa{
    int valor;
    
    DoisEmDois() {
        valor = 0;
    }
    
    @Override
    public int proximo() {
        valor = valor + 2;
        return valor;
    }
    
    
}

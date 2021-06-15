
package exemplointerfaceprincipal;

public class ExemplointerfacePrincipal {

    public static void main(String[] args) {
        UmEmUm vaium = new UmEmUm();
        DoisEmDois vaidois = new DoisEmDois();
        
        for (int i = 0; i < 4; i++){
            System.out.println(vaium.proximo());
        }
        for (int i = 0; i < 8; i++){
            System.out.println(vaidois.proximo());
        }
    }
}

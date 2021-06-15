/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerfaceprincipal;

/**
 *
 * @author J0N45
 */
public class UmEmUm implements InterfaceNossa{
    //incremento de 1 em 1
    int valor;
    //metodo construtor
    UmEmUm() {
        valor = 0;
    }
    @Override
    public int proximo() {
        valor += 1;
        return valor;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash2list;

/**
 *
 * @author javiv
 */
public class MostrarClaseLista {
    public static void mostrar(InterfaceList lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " " + lista.getElemento(i));
        }
    }

}
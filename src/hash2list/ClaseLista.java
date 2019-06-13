/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash2list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author javiv
 */
public class ClaseLista implements InterfaceList {

    ArrayList<String> list;

    public ClaseLista() {
        this.list = new ArrayList<>();
    }

    /**
     * @return the list
     */
    public ArrayList<String> getLista() {
        return list;
    }

    @Override
    public void putElemento(String elemento) {
        getLista().add(elemento);
    }

    @Override
    public String getElemento(int indejemplo) {
        return getLista().get(indejemplo);
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }

}
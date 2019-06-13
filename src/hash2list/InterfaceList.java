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
public interface InterfaceList {

    public ArrayList<String> list = new ArrayList<>();

    public void putElemento(String elemento);

    public String getElemento(int indejemplo);

    public Iterator iterator();

    public int size();

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Problema {
    int cantidadNodos;   
    public void recorrerArbolInOrden(Nodo nodo){
        if(nodo!=null){
            recorrerArbolInOrden(nodo.getNodoIzq());
            System.out.print(nodo.getDato()+",");
            cantidadNodos++;
            recorrerArbolInOrden(nodo.getNodoDer());
        }
    }
}

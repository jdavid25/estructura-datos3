/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String args[]){
        Nodo principal = new  Nodo(6);
        Nodo derecho = new Nodo(8);
        principal.setNodoDer(derecho);
        Nodo izquierdo = new Nodo(3);
        principal.setNodoIzq(izquierdo);
        Problema problema = new Problema();
        problema.recorrerArbolInOrden(principal);
        System.out.println("\n la cantidad de nodos es" + problema.cantidadNodos);
    }
}
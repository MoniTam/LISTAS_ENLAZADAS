/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_enlazada;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class LISTA {
       protected NODO inicio, fin;   
       public LISTA(){
        inicio = null;
        fin    = null;
    }
    
    public void agregarAlInicio(String nombre){
        inicio = new NODO(nombre, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    public void mostrarListaEnlazada(){
        NODO recorrer = inicio;
        System.out.println("");
        while (recorrer != null){
            System.out.print("["+ recorrer.name+"] -->");
            recorrer = recorrer.siguiente;
        }
        System.out.println("");
    }
    
    // Metodo para eliminar un nodo del inicio
    public int borrarDelInicio(){
        String nombre = inicio.name;
        if (inicio == fin){
            inicio = null;
            fin    = null;
        } else {
            inicio = inicio.siguiente;
        }
           return 0;
        }
    }
    

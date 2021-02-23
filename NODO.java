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
public class NODO {
    
    public String name;    // Valor a almacenar 
    public NODO siguiente;  // Puntero, del mismo tipo de la clase
    
    // Constructor para insertar el dato
    public NODO (String d){
        this.name = d;
    }
    // Constructor para insertar al inicio de la lista
    public NODO(String d, NODO n){
        name = d;
        siguiente = n;
    }
}

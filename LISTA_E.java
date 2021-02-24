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
public class LISTA_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LISTA listaenlazada = new LISTA();
        listaenlazada.agregarAlInicio("Frida");
        listaenlazada.agregarAlInicio("Darlin");
        listaenlazada.agregarAlInicio("Eduardo");
        listaenlazada.agregarAlInicio("Edwin");
        listaenlazada.agregarAlInicio("Victor");
        listaenlazada.agregarAlInicio("Brian ");
        listaenlazada.agregarAlInicio("William");
        listaenlazada.agregarAlInicio("Gustavo");
        listaenlazada.agregarAlInicio("Cecilia");
        listaenlazada.agregarAlInicio("Cinthia");
        listaenlazada.mostrarListaEnlazada();
        listaenlazada.borrarDelInicio();
        listaenlazada.mostrarListaEnlazada();
        
        LISTA listaenlazada_2 = new LISTA();
        listaenlazada_2.agregarAlInicio("20");
        listaenlazada_2.agregarAlInicio("20");
        listaenlazada_2.agregarAlInicio("20");
        listaenlazada_2.agregarAlInicio("21");
        listaenlazada_2.agregarAlInicio("21");
        listaenlazada_2.agregarAlInicio("21");
        listaenlazada_2.agregarAlInicio("22");
        listaenlazada_2.agregarAlInicio("22");
        listaenlazada_2.agregarAlInicio("22");
        listaenlazada_2.agregarAlInicio("23");
        listaenlazada_2.mostrarListaEnlazada();
        listaenlazada_2.borrarDelInicio();
        listaenlazada_2.mostrarListaEnlazada();

    }
    
}

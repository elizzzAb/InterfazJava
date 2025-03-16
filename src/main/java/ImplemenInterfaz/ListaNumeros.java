/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazOrdenable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Elizabeth
 */
public class ListaNumeros implements IInterfazOrdenable<String>{
    private List<Integer> numeros; // para almacenar números
    
    public ListaNumeros() {
        this.numeros = new ArrayList<>();
    }
    // agregar números a la lista
    public void agregarNumero(Integer numero) {
        numeros.add(numero);
    }

    @Override
    public String ordenar() {
        Collections.sort(numeros);
         return "Lista ordenada: " + numeros;
    }

    @Override
    public String mostrarLista() {
        return "Lista original: " + numeros;
    }

    
    
}

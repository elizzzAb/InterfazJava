/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazTrabajador;

/**
 *
 * @author Elizabeth
 */
public class Desarrollador implements IInterfazTrabajador<String>{

    @Override
    public String trabajar() {
        return "El desarrollador escribe y prueba código para crear aplicaciones funcionales.";
    }
    
}

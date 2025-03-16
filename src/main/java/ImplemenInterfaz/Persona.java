/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazAlimentacion;

/**
 *
 * @author Elizabeth
 */
public class Persona implements IInterfazAlimentacion<String>{

    @Override
    public String comer() {
        return "La persona disfruta de una cena gourmet en un restaurante.";
    }
    
    
}

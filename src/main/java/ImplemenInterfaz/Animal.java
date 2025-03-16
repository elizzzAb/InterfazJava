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
public class Animal implements IInterfazAlimentacion<String>{

    @Override
    public String comer() {
        return "El animal se alimenta de carne cruda.";
    }
    
    
}

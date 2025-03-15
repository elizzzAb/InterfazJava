/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

//import Interfaces.IInterfazAnimal;

import Interfaz.IInterfazAnimal;

/**
 *
 * @author Elizabeth
 */
public class Gato implements IInterfazAnimal<String>{

    @Override
    public String hacerSonido() {
        return "El gato puede maullar así: Miau Miau...";
    }

    @Override
    public String mover() {
        return "El gato se mueve sigilosamente.";
    }
    
    
}

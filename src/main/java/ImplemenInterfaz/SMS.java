/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazNotificacion;

/**
 *
 * @author Elizabeth
 */
public class SMS implements IInterfazNotificacion<String>{

    @Override
    public String enviarNotificacion() {
        return "SMS enviado: 'Código 1234'.";
    }
    
    
}

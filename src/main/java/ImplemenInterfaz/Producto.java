/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplemenInterfaz;

import Interfaz.IInterfazCompObjetos;

/**
 *
 * @author Elizabeth
 */
public class Producto implements IInterfazCompObjetos<String>{
    private double precio;
    
    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    
    @Override
    public String comparar(Object o) {
        if (!(o instanceof Producto)) {
            return "Error: El objeto a comparar no es un producto válido.";
        }

        Producto otroProducto = (Producto) o;
        if (this.precio > otroProducto.getPrecio()) {
            return "El primer producto es más caro.";
        } else if (this.precio < otroProducto.getPrecio()) {
            return "El segundo producto es más caro.";
        } else {
            return "Ambos productos tienen el mismo precio.";
        }
    }
    
}

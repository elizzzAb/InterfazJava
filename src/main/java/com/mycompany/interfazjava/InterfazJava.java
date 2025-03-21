/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfazjava;

import ImplemenInterfaz.Animal;
import ImplemenInterfaz.Bicicleta;
import ImplemenInterfaz.Circulo;
import ImplemenInterfaz.Coche;
import ImplemenInterfaz.CorreoElectronico;
import ImplemenInterfaz.Desarrollador;
import ImplemenInterfaz.DescuentoFijo;
import ImplemenInterfaz.DescuentoPorcentaje;
import ImplemenInterfaz.Diseñador;
import ImplemenInterfaz.Gato;
import ImplemenInterfaz.ListaNumeros;
import ImplemenInterfaz.PagoConEfectivo;
import ImplemenInterfaz.PagoConTarjeta;
import ImplemenInterfaz.Perro;
import ImplemenInterfaz.Persona;
import ImplemenInterfaz.Producto;
import ImplemenInterfaz.Rectangulo;
import ImplemenInterfaz.SMS;
import Interfaz.IInterfazAlimentacion;
import Interfaz.IInterfazAnimal;
import Interfaz.IInterfazCalcDescuento;
import Interfaz.IInterfazFiguraGeometrica;
import Interfaz.IInterfazNotificacion;
import Interfaz.IInterfazPago;
import Interfaz.IInterfazTrabajador;
import Interfaz.IInterfazVehiculo;

/**
 *
 * @author Elizabeth
 */
public class InterfazJava {

    public static void main(String[] args) {
        // -----------------------Animal-----------------------------
        IInterfazAnimal<String> perro = new Perro();
        IInterfazAnimal<String> gato = new Gato();
        // Perro
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comportamiento del perro:");
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());       
        // Gato
        System.out.println("\nComportamiento del gato:");
        System.out.println(gato.hacerSonido());
        System.out.println(gato.mover());
        
        // -----------------------Vehículo-----------------------------
        IInterfazVehiculo<String> coche = new Coche();
        IInterfazVehiculo<String> bicicleta = new Bicicleta();

        // Coche
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comportamiento del coche:");
        System.out.println(coche.arrancar());
        System.out.println(coche.detener());

        // Bicicleta
        System.out.println("\nComportamiento de la bicicleta:");
        System.out.println(bicicleta.arrancar());
        System.out.println(bicicleta.detener());
        
        // -----------------------Pago-----------------------------
        IInterfazPago<String> pagoEfectivo = new PagoConEfectivo();
        IInterfazPago<String> pagoTarjeta = new PagoConTarjeta();

        // Pago en efectivo
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Procesando pagos:");
        System.out.println(pagoEfectivo.procesarPago(109.50));

        // Pago con tarjeta
        System.out.println(pagoTarjeta.procesarPago(243.75));
        
        // ----------------------- Figura Geométrica-----------------------------
        IInterfazFiguraGeometrica<Double> circulo = new Circulo(5.0);
        IInterfazFiguraGeometrica<Double> rectangulo = new Rectangulo(4.0, 6.0);

        // Círculo
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Cálculos para el círculo:");
        System.out.println("Área: " + circulo.Area());
        System.out.println("Perímetro: " + circulo.Perimetro());

        // Rectángulo
        System.out.println("\nCálculos para el rectángulo:");
        System.out.println("Área: " + rectangulo.Area());
        System.out.println("Perímetro: " + rectangulo.Perimetro());
        
        // -----------------------Trabajador-----------------------------
        IInterfazTrabajador<String> desarrollador = new Desarrollador();
        IInterfazTrabajador<String> diseñador = new Diseñador();

        // Desarrollador
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Trabajo del desarrollador:");
        System.out.println(desarrollador.trabajar());

        // Diseñador
        System.out.println("\nTrabajo del diseñador:");
        System.out.println(diseñador.trabajar());
        
        // -----------------------Ordenable-----------------------------
        ListaNumeros lista = new ListaNumeros();

        // Agregar números a la lista
        lista.agregarNumero(5);
        lista.agregarNumero(2);
        lista.agregarNumero(8);
        lista.agregarNumero(1);
        lista.agregarNumero(3);

        // Mostrar lista original
        System.out.println("------------------------------------------------------------------------");
        System.out.println(lista.mostrarLista());

        // Ordenar y mostrar lista ordenada
        System.out.println(lista.ordenar());
        
        // -----------------------Alimentación-----------------------------
        IInterfazAlimentacion<String> animal = new Animal();
        IInterfazAlimentacion<String> persona = new Persona();

        // Animal
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comportamiento alimenticio del animal:");
        System.out.println(animal.comer());

        // Persona
        System.out.println("\nComportamiento alimenticio de la persona:");
        System.out.println(persona.comer());
        
        // -----------------------Notificación-----------------------------
        IInterfazNotificacion<String> sms = new SMS();
        IInterfazNotificacion<String> correo = new CorreoElectronico();

        // SMS
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Envío de notificación por SMS:");
        System.out.println(sms.enviarNotificacion());

        // Correo Electrónico
        System.out.println("\nEnvío de notificación por correo electrónico:");
        System.out.println(correo.enviarNotificacion());
        
        // -----------------------Comparación de Objetos-----------------------------
        Producto producto1 = new Producto(100.0);
        Producto producto2 = new Producto(150.0);
        //String noEsProducto = "Esto no es un producto"; // Un objeto que no es Producto

        // Comparación entre dos productos
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comparando productos...");
        System.out.println("Producto 1 vs Producto 2:");
        System.out.println(producto1.comparar(producto2)); // Producto 1 vs Producto 2
        System.out.println("Producto 2 vs Producto 1:");
        System.out.println(producto2.comparar(producto1)); // Producto 2 vs Producto 1

        // Intento de comparación con un objeto no válido
        //System.out.println("\nIntentando comparar con un objeto que no es un producto:");
        //System.out.println(producto1.comparar(noEsProducto));
        
        // -----------------------Calculadora de Descuento-----------------------------
        IInterfazCalcDescuento<Double> descuentoPorcentaje = new DescuentoPorcentaje(30);  
        IInterfazCalcDescuento<Double> descuentoFijo = new DescuentoFijo(10); 
        
        // Precio original
        double precio = 90.0;  

        // Descuentos
        double descuento1 = descuentoPorcentaje.calcularDescuento(precio);
        double descuento2 = descuentoFijo.calcularDescuento(precio);
        
        // Mostrar resultados
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Precio original: $" + precio);
        System.out.println("\nDescuento por porcentaje (30%) en el precio de $" + precio + ": $" + descuento1);
        System.out.println("Descuento fijo de 10 dólares en el precio de $" + precio + ": $" + descuento2);

    }
}

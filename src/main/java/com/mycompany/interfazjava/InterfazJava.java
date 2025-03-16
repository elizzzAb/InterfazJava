/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfazjava;

import ImplemenInterfaz.Animal;
import ImplemenInterfaz.Bicicleta;
import ImplemenInterfaz.Circulo;
import ImplemenInterfaz.Coche;
import ImplemenInterfaz.Desarrollador;
import ImplemenInterfaz.Diseñador;
import ImplemenInterfaz.Gato;
import ImplemenInterfaz.ListaNumeros;
import ImplemenInterfaz.PagoConEfectivo;
import ImplemenInterfaz.PagoConTarjeta;
import ImplemenInterfaz.Perro;
import ImplemenInterfaz.Persona;
import ImplemenInterfaz.Rectangulo;
import Interfaz.IInterfazAlimentacion;
import Interfaz.IInterfazAnimal;
import Interfaz.IInterfazFiguraGeometrica;
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
        

    }
}

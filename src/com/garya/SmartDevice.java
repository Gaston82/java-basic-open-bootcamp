package com.garya;

/*
En este ejercicio tendréis que crear una clase SmartDevice.

Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */

public class SmartDevice {
    String brand ;
    double price;
    int year;

    public SmartDevice(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public  SmartDevice(){

    }

}

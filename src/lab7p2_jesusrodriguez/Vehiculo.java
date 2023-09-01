/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jesusrodriguez;

import java.awt.Color;


public class Vehiculo {
private String Marca;
private Color color;
private String Modelo;
private String año;
private double precio;
private int id;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, Color color, String Modelo, String año, double precio, int id) {
        this.Marca = Marca;
        this.color = color;
        this.Modelo = Modelo;
        this.año = año;
        this.precio = precio;
        this.id = id;
    }





    public Vehiculo(String Marca, Color color, String Modelo, String año, double precio) {
        this.Marca = Marca;
        this.color = color;
        this.Modelo = Modelo;
        this.año = año;
        this.precio = precio;
        
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    @Override
    public String toString() {
        return   Marca ;
    }
    
    


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jesusrodriguez;


public class Vendedor {
    private String Nombre;
    private int cantidad;
    private double generado;

    public Vendedor() {
    }
    
    
    

    public Vendedor(String Nombre, int cantidad, double generado) {
        this.Nombre = Nombre;
        this.cantidad = cantidad;
        this.generado = generado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getGenerado() {
        return generado;
    }

    public void setGenerado(double generado) {
        this.generado = generado;
    }

    @Override
    public String toString() {
        return  Nombre  ;
    }
    
    
    
}

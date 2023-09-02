/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jesusrodriguez;


public class Venta {
private String vendedor1;
private String comprador1;
private double costotrans;
private String carro;
private int a;

    public Venta(String vendedor1, String comprador1, double costotrans, String carro,int a) {
        this.vendedor1 = vendedor1;
        this.comprador1 = comprador1;
        this.costotrans = costotrans;
        this.carro = carro;
        this.a= a;
    }

    public Venta() {
    }

    public String getVendedor1() {
        return vendedor1;
    }

    public void setVendedor1(String vendedor1) {
        this.vendedor1 = vendedor1;
    }

    public String getComprador1() {
        return comprador1;
    }

    public void setComprador1(String comprador1) {
        this.comprador1 = comprador1;
    }

    public double getCostotrans() {
        return costotrans;
    }

    public void setCostotrans(double costotrans) {
        this.costotrans = costotrans;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    

    @Override
    public String toString() {
        return "Venta{" + "costotrans=" + costotrans + ", carro=" + carro + '}';
    }




}

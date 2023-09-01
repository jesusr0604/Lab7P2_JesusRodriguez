
package lab7p2_jesusrodriguez;

public class Cliente {
    private String nombre;
    private int edad;
    private String profesion;
    private int cars;
    private double sueldo;

    public Cliente(String nombre, int edad, String profesion, int cars, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.cars = cars;
        this.sueldo = sueldo;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + ", cars=" + cars + ", sueldo=" + sueldo ;
    }
    
    
    
    
    
}

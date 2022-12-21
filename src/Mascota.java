import java.sql.SQLOutput;

public class Mascota {

    String especie;
    String nombre;
    String raza;
    String color;
    int edad;

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        Mascota mascota2 = new Mascota();

        mascota1.especie = "Gato";
        mascota1.nombre = "Solem";
        mascota1.raza = "Azul";
        mascota1.color = "Gris";
        mascota1.edad = 5;

        mascota2.especie = "Perra";
        mascota2.nombre = "Arya";
        mascota2.raza = "Doberman";
        mascota2.color = "negro";
        mascota2.edad = 1;

        System.out.println("El " + mascota1.especie + " se llama " + mascota1.nombre + " su raza es " + mascota1.raza + ", su color es " + mascota1.color + " y tiene " + mascota1.edad + " años");

        System.out.println("La " + mascota2.especie + " se llama " + mascota2.nombre + " su raza es " + mascota2.raza + ", su color es " + mascota2.color + " y tiene " + mascota2.edad + " años");

    }
}
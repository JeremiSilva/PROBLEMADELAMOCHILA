package problemadelamochila;

import java.util.Scanner;

class Objeto {
    String nombre;
    String forma;
    int peso;
    int precio;

    public Objeto(String nombre, String forma, int peso, int precio) {
        this.nombre = nombre;
        this.forma = forma;
        this.peso = peso;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println(nombre + " - Forma: " + forma + ", Peso: " + peso + " kg, Precio: S/" + precio);
    }
}

public class PROBLEMADELAMOCHILA {
    public static void main(String[] args) {
        Objeto[] objetos = new Objeto[20];
        objetos[0] = new Objeto("Laptop", "Rectangular", 5, 1500);
        objetos[1] = new Objeto("Libro", "Rectangular", 2, 15);
        objetos[2] = new Objeto("Binoculares", "Cilindrico", 3, 59);
        objetos[3] = new Objeto("Camara", "Cubo", 4, 800);
        objetos[4] = new Objeto("Tienda de campaña", "Cilindrico", 10, 109);
        objetos[5] = new Objeto("Bidon de agua", "Cilindrico", 10, 42);
        objetos[6] = new Objeto("Taperes de comida", "Rectangular", 4, 34);
        objetos[7] = new Objeto("Caja con zapatos", "Rectangular", 2, 250);
        objetos[8] = new Objeto("Cajon", "Rectangular", 2, 67);
        objetos[9] = new Objeto("Cartuchera", "Rectangular", 1, 21);
        objetos[10] = new Objeto("Linterna", "Cilindrico", 3, 68);
        objetos[11] = new Objeto("Mapa", "Rectangular", 1, 36);
        objetos[12] = new Objeto("GPS", "Rectangular", 2, 350);
        objetos[13] = new Objeto("Brujula", "Circular", 2, 50);
        objetos[14] = new Objeto("Gorra", "Circular", 1, 10);
        objetos[15] = new Objeto("Celular", "Rectangular", 1, 1000);
        objetos[16] = new Objeto("Saco de dormir", "Cilindrico", 7, 450);
        objetos[17] = new Objeto("Cantimplora", "Cilindrica", 2, 120);
        objetos[18] = new Objeto("Guantes", "Rectangular", 1, 70);
        objetos[19] = new Objeto("Cargador", "Rectangular", 2, 55);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad de peso de la mochila (kg): ");
        int capacidad = scanner.nextInt();

        int pesoActual = 0;
        int precioTotal = 0;

        for (Objeto objeto : objetos) {
            if (pesoActual + objeto.peso <= capacidad) {
                objeto.mostrar();
                pesoActual += objeto.peso;
                precioTotal += objeto.precio;
            }
        }

        System.out.println("Peso total en la mochila: " + pesoActual + " kg");
        System.out.println("Precio total de los objetos en la mochila: S/" + precioTotal);
        scanner.close();
    }
}


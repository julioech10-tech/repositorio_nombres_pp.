package Programas;

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args){

        double venta1, venta2, venta3, total, promedio;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Creación de mi primer programa");

        System.out.print("Ingresar venta1: ");
        venta1 = lectura.nextDouble();

        System.out.print("Ingresar venta2: ");
        venta2 = lectura.nextDouble();

        System.out.print("Ingresar venta3: ");
        venta3 = lectura.nextDouble();

        total = venta1 + venta2 + venta3;

        promedio = total / 3;

        System.out.println("El total de ventas es: " + total);
        System.out.println("El promedio de ventas es: " + promedio);

    }

}
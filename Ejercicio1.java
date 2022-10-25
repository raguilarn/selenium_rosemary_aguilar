//Escribir un método que reciba un número y retorne su doble

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        int num= 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese número");
        num = input.nextInt();

        int doble = calcularDoble (num);

        System.out.println("El doble de " + num + " es: " + doble);
    }
        public static int calcularDoble (int num) {
        return num * 2;
    }



}

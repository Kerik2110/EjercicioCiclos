package com.mycompany.ejerciciosciclos;

import java.util.Scanner;

public class EjerciciosCiclos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;

        while (menu == 0) {
            System.out.println("Bienvenido a su programa");
            System.out.println("1- Calculo de medidas");
            System.out.println("2- Numero del 1 al 10");
            System.out.println("3- Suma del 1 al 10");
            System.out.println("4- Verificar par impar");
            System.out.println("5- Promedio de 30 numeros");
            System.out.println("6- Numero pares del 1 al 20");
            System.out.println("7- Suma del 1 al 400");
            System.out.println("8- Calcular area de un circulo");
            System.out.println("9- Calcular perimetro de un circulo");
            System.out.println("10- Calcular area de un rectangulo");
            System.out.println("11- Calcular volumen de una esfera");
            System.out.println("12- Calcular area y perimetro de un cubo");
            System.out.println("13- Numero del 1 al 100, saltando los multiplos de 3");
            System.out.println("14- Numero del 1 al 100, saltando los multiplos de 5");
            System.out.println("15- Numero del 1 al 100, saltando los multiplos de 3 y 5");
            System.out.println("16- Reemplazando por Cueck");
            System.out.println("17- Calcular el factorial");
            System.out.println("18- Contar digitos");
            System.out.println("19- Calcular area y perimetro de un cuadrado");
            System.out.println("20- Calcular la potencia de un numero");
            System.out.println("21- Salir");
            System.out.println("Ingrese una opcion: ");

            while (!leer.hasNextInt()) {
                System.out.println("Error. Ingrese un numero entero.");
                leer.next();
            }

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Metodos mostrarMetodo1 = new Metodos();
                    mostrarMetodo1.metodo1();
                    break;
                case 2:
                    Metodos mostrarMetodo2 = new Metodos();
                    mostrarMetodo2.metodo2();
                    break;
                case 3:
                    Metodos mostrarMetodo3 = new Metodos();
                    mostrarMetodo3.metodo3();
                    break;
                case 4:
                    Metodos mostrarMetodo4 = new Metodos();
                    mostrarMetodo4.metodo4();
                    break;
                case 5:
                    Metodos mostrarMetodo5 = new Metodos();
                    mostrarMetodo5.metodo5();
                    break;
                case 6:
                    Metodos mostrarMetodo6 = new Metodos();
                    mostrarMetodo6.metodo6();
                    break;
                case 7:
                    Metodos mostrarMetodo7 = new Metodos();
                    mostrarMetodo7.metodo7();
                    break;
                case 8:
                    Metodos mostrarMetodo8 = new Metodos();
                    mostrarMetodo8.metodo8();
                    break;
                case 9:
                    Metodos mostrarMetodo9 = new Metodos();
                    mostrarMetodo9.metodo9();
                    break;
                case 10:
                    Metodos mostrarMetodo10 = new Metodos();
                    mostrarMetodo10.metodo10();
                    break;
                case 11:
                    Metodos mostrarMetodo11 = new Metodos();
                    mostrarMetodo11.metodo11();
                    break;
                case 12:
                    Metodos mostrarMetodo12 = new Metodos();
                    mostrarMetodo12.metodo12();
                    break;
                case 13:
                    Metodos mostrarMetodo13 = new Metodos();
                    mostrarMetodo13.metodo13();
                    break;
                case 14:
                    Metodos mostrarMetodo14 = new Metodos();
                    mostrarMetodo14.metodo14();
                    break;
                case 15:
                    Metodos mostrarMetodo15 = new Metodos();
                    mostrarMetodo15.metodo15();
                    break;
                case 16:
                    Metodos mostrarMetodo16 = new Metodos();
                    mostrarMetodo16.metodo16();
                    break;
                case 17:
                    Metodos mostrarMetodo17 = new Metodos();
                    mostrarMetodo17.metodo17();
                    break;
                case 18:
                    Metodos mostrarMetodo18 = new Metodos();
                    mostrarMetodo18.metodo18();
                    break;
                case 19:
                    Metodos mostrarMetodo19 = new Metodos();
                    mostrarMetodo19.metodo19();
                    break;
                case 20:
                    Metodos mostrarMetodo20 = new Metodos();
                    mostrarMetodo20.metodo20();
                    break;
                default:
                    System.out.println("Opcion invalida. Ingrese una opcion valida");
                    break;
            }
        }
    }
}

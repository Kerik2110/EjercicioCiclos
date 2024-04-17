package com.mycompany.ejerciciosciclos;

import java.util.Scanner;

public class Metodos {

    public static void metodo1() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una medida en centimetros: ");
        int medida = leer.nextInt();

        int centimetros = medida % 100;
        int metros = (medida % 100000) / 100;
        int kilometros = medida / 100000;

        System.out.println("La medida: " + medida + " , en kilometros son: " + kilometros + "km, en metros son: " + metros + "m , y en centimetros son: " + centimetros + "cm.");
    }

    public static void metodo2() {
        int numero = 1;

        System.out.println("Los numeros del 1 al 10 son: ");
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
    }

    public static void metodo3() {
        int numero = 1;
        int suma = 0;

        while (numero <= 10) {
            suma += numero;
            numero++;
        }

        System.out.println("La suma del 1 al 10 es: " + suma);
    }

    public static void metodo4() {
        Scanner leer = new Scanner(System.in);
        char opcion;

        while (true) {
            System.out.print("Ingrese un numero: ");
            int numero = leer.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
            System.out.print("Desea ingresar otro numero? (S/N): ");
            opcion = leer.next().charAt(0);

            if (opcion == 'N') {
                System.out.println("Gracias por utilizar el progrma");
                break;
            }
        }
    }

    public static void metodo5() {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int promedio;

        for (int i = 1; i <= 30; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = leer.nextInt();
            suma += numero;
        }
        promedio = suma / 30;
        System.out.println("El promedio de los 30 numeros es: " + promedio);
    }

    public static void metodo6() {
        int numero = 1;
        
        System.out.println("Los numeros pares son: ");
        while (numero <= 20) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
    
    public static void metodo7(){
        int suma = 0;
        int numero = 1;
        
        while (numero <= 400){
            if (numero % 2 == 0){
                suma += numero;
            }
            numero++;
        }
        System.out.println("La suma del 1 al 400 es: " + suma);
    }
    
    public static void metodo8(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while(true){
            System.out.println("Ingrese el radio del circulo: ");
            double radio = leer.nextInt();
            
            if (radio <= 0){
                System.out.println("El radio debe ser positivo");
                leer.next();
            }
            
            double area = 3.14 * (radio*radio);
            
            System.out.println("El area del circulo es: "+ area);
            
            System.out.println("Desea calcular otro radio? (S/N): ");
            opcion = leer.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("Gracias por utilizar el programa");
                break;
            }
        }
    }
    
    public static void metodo9(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while (true){
            System.out.println("Ingrese el diametro del circulo: ");
            double diametro = leer.nextDouble();
            
            if (diametro <= 0){
                System.out.println("Ingrese un diametro positivo: ");
                leer.next();
            }
            
            double perimetro = 3.14 * diametro;
            
            System.out.println("El perimetro del circulo es: "+ perimetro);
            
            System.out.println("Desea calcular otro perimetro? (S/N): ");
            opcion = leer.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("Gracias por utilizar el programa");
                break;
            }
        }
    }
    
    public static void metodo10(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while (true){
            int a, b;
            System.out.println("Ingrese el lado A del rectangulo: ");
            a = leer.nextInt();
            if(a <= 0){
                System.out.println("El lado A debe ser positivo");
                leer.next();
            }
            
            System.out.println("Ingrese el lado B del rectangulo: ");
            b = leer.nextInt();
            if(b <= 0){
                System.out.println("El lado B debe ser positivo");
                leer.next();
            }
            
            int area = a*b;
            
            System.out.println("El area del rectangulo es: " + area);
        
            System.out.println("Desea calcular otra area? (S/N): ");
            opcion = leer.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("Gracias por utilizar el programa");
                break;
            }
        }
    }
    
    public static void metodo11(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while (true){
            double radio;
            System.out.println("Ingrese el radio de la esfera: ");
            radio = leer.nextDouble();
            
            if (radio <= 0){
                System.out.println("El radio debe ser positivo:");
                leer.next();
            }
            
            double volumen = (4/3) * 3.14 * (radio*radio*radio);
            System.out.println("El volumen de la esfera es: " + volumen);
            
            System.out.println("Desea calcular el volumen de otra esfera? (S/N):");
            opcion = leer.next().charAt(0);
            
            if(opcion == 'N'){
                System.out.println("Gracias por utilizar el programa.");
                break;
            }
        }
    }
    
    public static void metodo12(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while(true){
            System.out.println("Ingrese un lado de el cubo:");
            int lado = leer.nextInt();
            
            if (lado <= 0){
                System.out.println("El lado debe ser positivo:");
                leer.next();
            }
            
            int area = 6 * (lado*lado);
            System.out.println("El area del cubo es: "+ area);
            
            int perimetro = 12 * lado;
            System.out.println("El perimetro del cubo es: " + perimetro);
        
            System.out.println("Desea calcular otro cubo? (S/N):");
            opcion = leer.next().charAt(0);
            
            if(opcion == 'N'){
                System.out.println("Gracias por utilizar el programa.");
                break;
            }
        }
    }
    
    public static void metodo13(){
        System.out.println("Los numeros son: ");
        for(int i = 1; i <= 100; i++){
            if (i % 3 != 0){
                System.out.println(i);
            }
        }
    }
    
    public static void metodo14(){
        System.out.println("Los numeros son: ");
        int contador = 1;
        
        while(contador <= 100){
            if(contador % 5 != 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
    
    public static void metodo15(){
        System.out.println("Los numeros son: ");
        int contador = 1;
        
        while(contador <= 100){
            if(contador % 3 != 0 && contador % 5 != 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
    
    public static void metodo16(){
        System.out.println("Los numero son:");
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println("Cuek");
            } else{
                System.out.println(i);
            }
        }
    }
    
    public static void metodo17(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while (true){
            System.out.println("Ingrese un numero:");
            int numero = leer.nextInt();
            
            int factorial = 1;
            for (int i = 1; i <= numero; i++){
                factorial *= i; 
            }
            
            System.out.println("El factorial es: "+ factorial);
            
            System.out.println("Desea calcular otro factorial? (S/N):");
            opcion = leer.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("Gracias por utilizar el programa");
                break;
            }
        }
    }
    
    public static void metodo18(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while (true){
            System.out.println("Ingrese un numero:");
            int numero = leer.nextInt();
            
            int contador = 0;
            int numeroDos = numero;
            
            while(numeroDos != 0){
                numeroDos /= 10;
                contador++;
            }
            System.out.println("La cantidad de digitos es: "+contador);
            
            System.out.println("Desea contar otro numero? (S/N):");
            opcion = leer.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("Gracias por utilizar el programa");
                break;
            }
        }
    }
    
    public static void metodo19(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while (true){
            int lado;
            System.out.println("Ingrese un lado del cuadrado:");
            lado = leer.nextInt();
            
            if (lado <= 0){
                System.out.println("El lado debe ser positivo:");
                leer.next();
            }
            
            int area = lado*lado;
            System.out.println("El area del cuadrado es: "+area);
            
            int perimetro = lado * 4;
            System.out.println("El perimetro del cuadrado es: "+perimetro);
            
            System.out.println("Desea calcular con otro cuadrado? (S/N):");
            opcion = leer.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("Gracias por utilizar el programa");
                break;
            }
        }
    }
    
    public static void metodo20(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        
        while (true){
            System.out.println("Ingrese un numero:");
            int numero = leer.nextInt();
            if(numero <= 0){
                System.out.println("EL numero debe ser positivo:");
                leer.next();
            }
            
            System.out.println("A cuanto lo desea elevar?:");
            int exponente = leer.nextInt();
            if(exponente <= 0){
                System.out.println("El exponente debe ser positivo");
                leer.next();
            }
            
            int resultado = 1;
            for(int i = 0; i < exponente; i++){
                resultado *= numero;
            }
            
            System.out.println("El resultado de elevar: "+numero+", al exponente: "+ exponente+ ", es: "+ resultado);
            
            System.out.println("Desea calcular otra potencia? (S/N):");
            opcion = leer.next().charAt(0);
            
            if (opcion == 'N'){
                System.out.println("Gracias por utilizar el programa");
                break;
            }
        }
    }
}

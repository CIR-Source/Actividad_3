/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1.clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Practica1Clase2 {
    
    public static void sumaConsecutiva() {
        //1.- Imprimir la suma consecutiva del 0 al 10
        System.out.println("Suma consecutiva del 0 al 10");
        
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("El resultado de la suma consecutiva del 0 al 10 es " + sum);
    }
    
    public static void factorial() {
        
        //2.- Calcular el factorial del 1 al 10
        System.out.println("Factorial del 1 al 10");
        
        int fact = 1;
        for (int i = 2; i <= 10; i++) {
            fact *= i;
        }
        System.out.println("El factorial de 10 es " + fact);
    }
    
    public static void factUser(){

        //3.- Factorial de un numero del usuario
        Scanner factU = new Scanner(System.in);
        
        System.out.println("Introduzca el número al que desea sacarle el factorial");
        double num = factU.nextDouble();
        
        double fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println("El factorial de " + num + " es " + fact);
        
    }
    
    public static void sumMedUser() {
    
        //4.- Calcular la media de la suma del número introducido por el usuario
        Scanner med = new Scanner(System.in);
        
        System.out.println("Introduzca un número, para que se calcule la media de su suma consecutiva desde el 0");
        
        double num = med.nextDouble();
        double media = 0;
        
        int sum = 0;
        for(int i = 0; i <= num; i++) {
            sum += i;
            if (i == num){
                media = sum / num;
            }
        }
        System.out.println("El resultado de la media de la suma del 0 al " + num + " es " + media);
        
    }
    
    public static void numUser() {
    
        //Pedir un número y leer n veces números, realizar la suma 
        //de los números, sacar el promedio y determinar cuál número
        //introducido es el mayor y cuál el menor, y la distancia numérica entre ellos
        
        Scanner numU = new Scanner(System.in);
        Scanner sum = new Scanner(System.in);
                
        System.out.println("Introduzca la cantidad de numeros que quiere sumar");
        int numero = sum.nextInt();
        
        int suma = 0;
        double promedio;
        int diferencia;
        int arrays[] = new int[numero];
        
        for (int i = 0; i < arrays.length; i++) {
            
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            arrays[i] = numU.nextInt();
        }
        
        int mayor, menor;
        mayor = menor = arrays[0];
        
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] > mayor){
                mayor = arrays[i];
            } else if(arrays[i] < menor){
                menor = arrays[i];
            }
            
            suma += arrays[i];   
        }
        
        promedio = (double)suma / (double)numero;
        diferencia = mayor - menor;
        
        System.out.println("Se introdujeron " + numero + " números");
        System.out.println("El promedio de la suma de los números es " + promedio);
        System.out.println("El número mas alto fue " + mayor);
        System.out.println("El número mas bajo fue " + menor);
        System.out.println("La diferencia entre el número mayor y el menor es " + diferencia);
    }
   
    public static void daysArray(){
    
        //6.- Imprima un arreglo que tenga los nombres de los días de la semana.
        
        String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        System.out.println("Los días de la semana son:");
        
        for (int i = 0; i <= 6; i++) {
            System.out.print(dias[i]);
            System.out.println("");
        }
    }
     
    public static void tickTackToe(){
    
        //7.- Imprima un arreglo de 2 dimensiones de 3 X 3 que dibuje el modelo del juego gato.    
        System.out.println("Este es un arreglo de 2 dimensiones de 3 por 3");
        
        String cat[][] = new String[3][3];
        cat[0][0] = "[C]";
        cat[0][1] = "[A]";
        cat[0][2] = "[T]";
        cat[1][0] = "[A]";
        cat[1][1] = "[A]";
        cat[1][2] = "[ ]";
        cat[2][0] = "[T]";
        cat[2][1] = "[ ]";
        cat[2][2] = "[T]";
        
        for (int i = 0; i <= 2; i++) {
            System.out.print(cat[0][i]);
        }
        
        System.out.println("");
        for (int i = 0; i <= 2; i++) {
            System.out.print(cat[1][i]);
        }
        
        System.out.println("");
        for (int i = 0; i <= 2; i++) {
            System.out.print(cat[2][i]);
        }
        
        System.out.println("");
        }
    
    public static void opcion(){
     
        //Deja elegir al usuario que ejercicio se ejecutara
        Scanner option = new Scanner(System.in);
        
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("");
        System.out.println("Imprimir la suma consecutiva del 0 al 10 [1]");
        System.out.println("Calcular el factorial del 1 al 10 [2]");
        System.out.println("Calcular el factorial de un numero del usuario [3]");
        System.out.println("Calcular la media de la suma del número introducido por el usuario [4]");
        System.out.println("Promedio de n numeros introducidos [5]");
        System.out.println("Imprime los dias de la semana [6]");
        System.out.println("Imprima un arreglo de 2 dimensiones de 3 X 3 que dibuje el modelo del juego gato. [7]");
        int opcion = option.nextInt();
        
        switch (opcion){
            case 1 -> sumaConsecutiva();
            case 2 -> factorial();
            case 3 -> factUser();
            case 4 -> sumMedUser();
            case 5 -> numUser();
            case 6 -> daysArray();
            case 7 -> tickTackToe();
            default -> System.out.println("Esa opción no existe");
        }
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        
     opcion();
     
    }
    
}

package com.mycompany.ej;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        personas persona;
        tabla tablita = new tabla();
        Scanner scan = new Scanner(System.in);
        int op=0;
        double dni;
        while(op!=5)
        {
            menu();
            op = scan.nextInt();
            switch(op)
            {
                case 1->
                {
                    persona = new personas();
                    tablita.insertar(persona);
                }
                case 2->
                {
                    System.out.println("Ingrese el dni de la persona a buscar : ");
                    dni = scan.nextDouble();
                    tablita.buscar(dni);
                }

                case 3->
                {   
                    tablita.muestraTabla();
                }
            }
        }
        
        
    }
    
    public static void menu()
    {
        System.out.println("Para probar la colision ingrese dos veces el mismo dni...");
        System.out.println("1) Ingresar una persona a la tabla");
        System.out.println("2) Buscar una persona");
        System.out.println("3) Imprimir toda la tabla");
        System.out.println("4) Salir");
        
    }
}

package com.mycompany.ej;
import java.util.Scanner;


public class personas {
    public String name;
    public String surname;
    public Double dni;
    public String adress;
    
    public personas()
    {
        datos();
    }
    
    public double getDni()
    {
        return dni;
    }
    
    public void datos()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre : ");
        name = scan.nextLine();
        System.out.println("Apellido: ");
        surname = scan.nextLine();
        System.out.println("Dni : ");
        dni = scan.nextDouble();
        scan.nextLine();
        System.out.println("Direccion : ");
        adress = scan.nextLine();
    }
    
        public void muestra(personas S)
    {
        if(S!=null)
        {
            System.out.println("Nombre : " + S.name);
            System.out.println("Apellido: " + S.surname);
            System.out.println("Dni : " + S.dni);
            System.out.println("Adress : " + S.adress);
        }
    }
        
    
}

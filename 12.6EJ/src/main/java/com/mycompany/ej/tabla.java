/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej;

public class tabla {
    private final int tam = 51;
    public elemento[] Tabla;
    private int numElementos=0;
    double R = 0.618034;
    
    
    public tabla()
    {
        Tabla = new elemento[tam];
    }
    
    public int dispersion(double dni) {
    double t;
    int v;
    t = R * dni - Math.floor(R * dni); // parte decimal
    v = (int) (tam * t);
    return v;
  }
    
    public void insertar(personas s) {
    //En posicion guardo el valor de dispersion para el socio nuevo
    int posicion = this.dispersion(s.getDni());
    //Creo un nuevo Elemento con los datos del socio.
    elemento nuevo = new elemento(s);
    System.out.println(posicion);
    nuevo.sgte = Tabla[posicion];
    Tabla[posicion] = nuevo;
    this.numElementos++;
  }
    
    public void muestraTabla()
    {
        elemento t = new elemento();
        int i;
        for(i=0;i<51;i++)
        {        
            t = Tabla[i];
            System.out.println("TABLA [" + i + "]");
            while(t!=null)
            {
                t.persona.muestra(t.persona);
                t = t.sgte;
                System.out.println("\t|");
                System.out.println("\t|");
                System.out.println("\tV");
            }
            System.out.println("       NULL");
        }   
    }
    
    public void buscar(double id)
    {
        int posicion = dispersion(id);
        elemento t = new elemento();
        t = Tabla[posicion];
        if(t!=null)
        {
            while(t.persona.dni!=id && t!=null)
            {
                t=t.sgte;
            }
            if(t.persona.dni==id)
            {   
                t.persona.muestra(t.persona);
            }
            else
            {
                System.out.println("No se encontro la persona...");
            }
        }
    }
    
}

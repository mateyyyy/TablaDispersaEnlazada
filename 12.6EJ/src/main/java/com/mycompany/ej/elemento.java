/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej;

/**
 *
 * @author matia
 */
public class elemento {
    public personas persona;
    public elemento sgte;
    
    public elemento() {
  }

    
    public elemento(personas e) {
    //Almacenamos el socio recibido por parámetro en el espacio reservado.
    persona = e;
    //Por defecto, el elemento no está conectado con un nodo siguiente.
    sgte = null;
  }

}

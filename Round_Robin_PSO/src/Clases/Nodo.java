/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author julio
 */
public class Nodo 
{
    Nodo izq;
    Nodo der;
    Proceso datos;
    
    public Nodo (Proceso p)
    {
        izq = null;
        der = null;
        datos = p;
    }
}

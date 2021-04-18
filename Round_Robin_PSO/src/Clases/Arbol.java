/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julio
 */
public class Arbol {

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    // Metodos
    @SuppressWarnings("null")
    public void insertar(Proceso p) {
        Nodo n;
        if (raiz == null) {     //Si no hay raiz
            n = new Nodo(p);    //Se crea un nodo
            raiz = n;           //Se vuelve la raiz
        } else {                //sí tiene raiz
            n = new Nodo(p);    //se crea el nodo
            Nodo ant = null, aux = raiz; //se pone la raiz en un auxiliar
            while (aux != null) {        //Mientras que el auxiliar no sea nulo
                ant = aux;               //se movera 
                if (p.getNumProceso() >= aux.datos.getNumProceso()) { //si el proceso a ingresar es mayor que el auxiliar
                    aux = aux.der;       //se movera a la serecha
                } else {                 //si es menor
                    aux = aux.izq;       //se movera a la izquierda
                }
            }
            if (p.getNumProceso() >= ant.datos.getNumProceso()) {//si al llegar al final el proceso a ingresar es mayor
                ant.der = n;             //se asignara a su derecha
            } else {                     //si es menor
                ant.izq = n;             //a su izquierda
            }
        }
    }
    
    //Muestra el arbol en preorden
    public void preorden(Nodo r, DefaultTableModel mod) {
        if (r == null) {
            return;
        } else {
            r.datos.mostrarProceso(mod, r.datos);
            preorden(r.izq, mod);
            preorden(r.der, mod);
        }
    }
    
    //Muestra el arbol en inorden
    public void inorden(Nodo r, DefaultTableModel mod) {
        if (r == null) {
            return;
        } else {
            inorden(r.izq, mod);
            r.datos.mostrarProceso(mod, r.datos);
            inorden(r.der, mod);

        }
    }

    //muestra el arbol en inorden
    public void posorden(Nodo r, DefaultTableModel mod) {
        if (r == null) {
            return;
        } else {
            posorden(r.izq, mod);
            posorden(r.der, mod);
            raiz.datos.mostrarProceso(mod, r.datos);
        }
    }
    
    //Metodo para buscar un nodo
    public boolean buscarNodo(char p, Nodo[] ne) {
        Nodo aux = raiz;                            //Se asigna la raiz a un auxiliar

        while (aux != null) {                       //y mientras el auxiliar no sea nulo, verifica
            if (aux.datos.getNumProceso() == p) {   //si el numero de Proceso es igual, entonces
                ne[0] = aux;                        //el nodo se inserta en el arreglo
                return true;                        //regresa un valor booleano verdadero, y
            }
            if (p >= aux.datos.getNumProceso()) {   //si es mayor el numero de procesoa buscar que en el que stamos
                aux = aux.der;                      //seguira hacia su derecha
            } else {                                //pero si es menor
                aux = aux.izq;                      //ira a su izquierda
            }
        }
        return false;                               //si no existe regresa un valor booleano falso
    }

    //Metodo de eliminacion de nodos
    public void eliminarNodo(Nodo e) {
        Nodo aux = raiz;                            //Se inicia buscando por la raiz guardandolo como auxiliar
        Nodo ant = null;                            //se crea una variable para guardar el anterior

        //mientras que los datos del auxiliar sean diferentes a los del nodo que buscamos
        while (aux.datos.getNumProceso() != e.datos.getNumProceso()) {
            //se movera
            ant = aux;
            //si los datos son mayores
            if (e.datos.getNumProceso()>= aux.datos.getNumProceso()) {
                //se movera a la derecha
                aux = aux.der;
                //si son menores
            } else {
                //a la izquierda
                aux = aux.izq;
            }
        }

        //Nodo Hoja
        //si el nodo no tiene mas hijos
        if (aux.izq == null && aux.der == null)
        {
            //si el arbol solo tiene un Nodo, se elimina
            if (ant == null) {
                raiz = null;
                //si no
            } else {
                //y si los datos del nodo som mayores
                if (aux.datos.getNumProceso() >= ant.datos.getNumProceso()) {
                    //se eliminara el de la derecha
                    ant.der = null;
                    //si son menores
                } else {
                    //el de la izquierda
                    ant.izq = null;
                }
            }
        }

        //Nodo con Hijos
        if (aux.izq != null && aux.der != null) {
            Nodo t = e.der;
            Nodo a = e;

            while (t.izq != null) {
                a = t;
                t = t.izq;
            }

            aux.datos = t.datos;

            if (a == e) {
                a.der = t.der;
            } else if (t.der != null) {
                a.izq = t.der;
            } else {
                a.izq = t.izq;
            }
        } //Nodo tiene un hijo derecho
        else if (aux.der != null && aux.izq == null) {
            if (ant == null) {
                raiz = e.der;
            } else if (ant.der == e) {
                ant.der = e.der;
            } else if (ant.izq == e) {
                ant.izq = e.der;
            }
        } //Tiene Hijo Izquierdo
        else if (aux.der == null && aux.izq != null) {
            if (ant == null) {
                raiz = e.izq;
            } else if (ant.der == e) {
                ant.der = e.izq;
            } else if (ant.izq == e) {
                ant.izq = e.izq;
            }
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }
}
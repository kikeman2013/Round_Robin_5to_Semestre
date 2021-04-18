package Clases;

/*------------------------------------------------------------------------------------------
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*
:*                           SEMESTRE: AGO-DIC/2019
:*
:*                 Clase que maneja las proipiedadesd el circulo
:*        
:*  Archivo     : Usuario.java
:*  Autor       : Julio Mendez Lira 17130806
:*  Fecha       : 3 dic. 2019
:*  Compilador  : JAVA J2SE v1.8.0
:*  Descripción : Clase Java que maneja las propiedades simples del circulo(radio) y 
    en base a estas obtiene las propiedades derivadas(area, circunferencia y diametro)
:*  
:*------------------------------------------------------------------------------------------*/

public class Usuario {

    private String nombre;
    private String contraseña;
    private int modo;
    
    public Usuario(){
    
        nombre = "";
        contraseña="";
        modo = 2;
    }
    
    public Usuario(String nom, String contra, int mod){
    
        nombre = nom;
        contraseña = contra;
        modo = mod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }
    
    
}

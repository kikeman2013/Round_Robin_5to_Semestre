package Clases;

import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Proceso {
        // Atributos
    char numProceso;
    int tiempoLlegada;
    int tiempoEjecucion;
    int quantum;
    int residuo;
    int npaginas;
    
    Random n;
    // Constructores
    public Proceso() {
        this.numProceso=0;
        this.tiempoLlegada=0;
        this.tiempoEjecucion = 0;
        this.quantum = 0;
        this.npaginas =0;
    }
    public Proceso(char numProceso,int tiempoLlegada, int tiempoEjecucion, int quantum , int residuo) {
        this.numProceso= numProceso;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoEjecucion = tiempoEjecucion;
        this.quantum = quantum;  
        this.residuo = residuo;
        n = new Random();
        this.npaginas = n.nextInt(4)+2;

    }
    
    public void mostrarProceso(DefaultTableModel tab, Proceso m)
    {
        Object arrObj[] = new Object[6];
        
        arrObj[0] = m.numProceso;
        arrObj[1] = m.tiempoLlegada;
        arrObj[2] = m.tiempoEjecucion;
        arrObj[3] = m.quantum;
        
        tab.addRow(arrObj);        
        
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }
    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getResiduo() {
        return residuo;
    }

    public void setResiduo(int residuo) {
        this.residuo = residuo;
    }
    
    // Propiedades
    public void setNumProceso(char numProceso){
        this.numProceso = numProceso;
    }
    public char getNumProceso(){
        return numProceso;
    }
    public void setTiempoEjecucion(int tiempoEjecucion){
        this.tiempoEjecucion = tiempoEjecucion;
    }
    public int getTiempoEjecucion(){
        return tiempoEjecucion;
    }
    public void setQuantum(int quantum){
        this.quantum = quantum;
    }
    public int getQuantum(){
        return quantum;
    }
    
    // Metodos


}

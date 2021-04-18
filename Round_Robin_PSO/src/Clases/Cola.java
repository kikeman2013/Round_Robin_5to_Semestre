package Clases;

import java.util.ArrayList;

public class Cola {
    ArrayList<Proceso> _elems;
    int _capacidad;
    
    public Cola()
    {
        _elems = new ArrayList<>();
        _capacidad = 0;//Cola sin limites
    }
    
    public Cola(int capacidad)
    {
        _elems = new ArrayList<>();
        _capacidad = capacidad <= 0? 0:capacidad;
    }
    
    public boolean Full()
    {
        return _capacidad > 0 && _elems.size() == _capacidad;
    }
    
    public boolean Empty()
    {
        return _elems.isEmpty();
    }
    
    public void  Insert(Proceso elem)
    {
        if (!Full()) {
            _elems.add(elem);
        } 
    }
    public void ordenar()
    {
     if (_elems.size()>1){    
            for (int i = 0; i < _elems.size()-1; i++) {
                for (int j = 0; j < _elems.size()-1; j++) {  
                   if(_elems.get(i).tiempoLlegada>_elems.get(j).tiempoLlegada)
             {     
                 _elems.add(_elems.remove(i));
             } 
            }     
         }
     }
    }   
    
    public Proceso Remove()
    {
        return !Empty()? _elems.remove(0):new Proceso();
    }
    public Proceso Front()
    {
        return !Empty()? _elems.get(0):new Proceso();
    }
    public Proceso Rear()
    {
        return !Empty()? _elems.get(_elems.size()-1):new Proceso();
    }
    public int Length()
    {
        return _elems.size();
    }
    public Proceso getProceso(int i){
        return _elems.get(i);
    }
    public void RemoveSelect(int i){
        for (int j = 0; j < _elems.size()-1; j++) {
            if(_elems.get(j).numProceso==_elems.get(i).numProceso)
                _elems.remove(i);
        }
    }
}
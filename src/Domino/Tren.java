/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domino;

/**
 *
 * @author chuca
 */
public class Tren 
{
    private String id;
    private int capacidad;
    

    public Tren(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        
    }

    public Tren() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
    
     @Override
    public String toString()
    {
        String info="***INFORMACION DEL TREN***";
         
        info+="\nID: "+this.getId()
            +"\nCapacidad"+this.getCapacidad();
        return info;
    }
    
    Tren tren1=new Tren ("1",50);
    Tren tren2=new Tren ("2",50);
    Tren tren3=new Tren ("3",50);
}

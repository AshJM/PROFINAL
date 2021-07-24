package Domino;


public class Bus 
{
    private String id;
    private int capacidad;
    

    public Bus(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        
    }

    public Bus() {
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
        String info="***INFORMACION DEL BUS***";
         
        info+="\nID: "+this.getId()
            +"\nCapacidad"+this.getCapacidad();
        return info;
    }
    
    Bus bus1=new Bus ("1",40);
    Bus bus2=new Bus ("2",40);
    Bus bus3=new Bus ("3",40);
    
    public void estadoActual()
    {
        
    }
    
    
    
    
    
}

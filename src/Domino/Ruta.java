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
public class Ruta 
{
    import Dominio.Bus;
import Dominio.Tren;

public class Ruta 
{
    private String id;
    private String salida;
    private String destino;
    private String horario;

    public Ruta(String id, String salida, String destino, String horario) {
        this.id = id;
        this.salida = salida;
        this.destino = destino;
        this.horario = horario;
    }

    public Ruta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    Ruta ruta300= new Ruta ("300","Salida: Cartago","Destino: Pavas","Horarios de salida: 6:00am, 7:00am, 5:00pm, 6:00pm");
    
    Ruta ruta301= new Ruta ("301","Salida: San Jose","Destino: Alajuela","Horario de salida: 6:00am, 8:00am, 4:00pm, 6:00pm");
    
    Ruta ruta299= new Ruta ("299","Salida: Cartago","Destino: Limon","Horario de salida: 7:00am, 12:00pm, 3:00pm, 6:00pm");
    
    Ruta ruta3000=new Ruta ("3000","Salida: San Jose","Destino: Puntarenas","Horarios de salida: 8:00am, 10:00am, 4:00pm, 6:00pm");
    
    Ruta ruta3001=new Ruta ("3001","Salida: San Jose","Destino: Guanacaste","Horarios de salida: 9:00am, 12:00pm, 3:00pm, 6:00pm");
    
    Ruta ruta3002=new Ruta ("3002","Salida: San Jose","Destino: Puerto Viejo","Horarios de salida: 7:00am, 10:00am, 3:00pm, 7:00pm");
}

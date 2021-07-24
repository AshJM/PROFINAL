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
public class Usuario {
    
     private int id;
    private String Nombre;
    private String Apellidos;
    private String Estado;
    private int telefono;
    private String Tiquetes;

    public Usuario(int id, String Nombre, String Apellidos, String Estado, int telefono, String Tiquetes) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Estado = Estado;
        this.telefono = telefono;
        this.Tiquetes = Tiquetes;
    }
    
    public Usuario() {
        this.id = 0;
        this.Nombre = null;
        this.Apellidos = null;
        this.Estado = null;
        this.telefono = 0;
        this.Tiquetes = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTiquetes() {
        return Tiquetes;
    }

    public void setTiquetes(String Tiquetes) {
        this.Tiquetes = Tiquetes;
    }
    
       @Override
    public String toString() {
        String info = "";
        
        info+="Carne: "+this.id
                +"\nNombre: "+this.Nombre
                +"\nApellidos: "+this.Apellidos
                +"\nDirrecion: "+this.Estado
                +"\nTelefono: "+this.telefono
                +"\nCarrera: "+this.Tiquetes;
        
        return info;
    }//toString
    
    
}

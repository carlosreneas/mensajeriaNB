/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mensajeria.model;

/**
 *
 * @author canga
 */ 
public class Usuario {
    
    private String email;
    
    private String pass;
    
    private String nombre;

    public Usuario() {
    }

    public Usuario(String email, String pass, String nombre) {
        this.email = email;
        this.pass = pass;
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

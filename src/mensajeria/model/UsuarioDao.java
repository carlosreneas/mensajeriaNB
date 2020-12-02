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
public class UsuarioDao {
    
    public void crear(Usuario usuario) {
        
    }
    
    public void actualizar(Usuario usuario) {
        
    }
    
    public void eliminar(Usuario usuario) {
        
    }
    
    public Usuario consultar(Usuario usuario) {
        
        
        return null;
    }
     
    public Boolean login (Usuario usuario) {
        
        if(usuario.getEmail().contentEquals("pepe@gmail.com") && usuario.getPass().contentEquals("1234")) {
            return true;
        }
        
        return false;
    }
}

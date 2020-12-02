/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeria;

import mensajeria.vistas.Login;

/**
 *
 * @author canga
 */
public class Mensajeria {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login vistaLogin = new Login();
        vistaLogin.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        vistaLogin.setVisible(true);
    }
    
}

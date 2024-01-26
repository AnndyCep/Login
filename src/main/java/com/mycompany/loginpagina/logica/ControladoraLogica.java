
package com.mycompany.loginpagina.logica;

import com.mycompany.loginpagina.persistencia.ControladoraPersistecia;
import java.util.List;


public class ControladoraLogica {
    
    Usuario usser = new Usuario();
    ControladoraPersistecia controlPersis;

    public ControladoraLogica() {
        controlPersis =  new ControladoraPersistecia();
    }
    

    public String validarUsser(String usser, String password) {
        
        String mensaje ="";
        //taer los usuario
        List <Usuario> listaUsuarios = controlPersis.traerUsuarios();
        //recorrer la lista para determinar si esta la contraseña y user
        for (Usuario use : listaUsuarios) {
            
            if (use.getName().equalsIgnoreCase(usser)) {
                System.out.println(use.getName());
                if (use.getPassword().equalsIgnoreCase(password)) {
                    mensaje = "El usuario y contraseña coinciden.. Bienvenido/a";
                    return mensaje; 
                } else {
                    mensaje = "La contraseña es incorrecta ";
                    return mensaje; 
                }
            } else {
                mensaje = "El usuario es incorrecto";
                
            }
        }
        return mensaje; 
    }
    
}

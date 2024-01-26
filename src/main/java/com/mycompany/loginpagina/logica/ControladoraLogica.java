
package com.mycompany.loginpagina.logica;

import com.mycompany.loginpagina.persistencia.ControladoraPersistecia;
import java.util.List;


public class ControladoraLogica {
    
    
    ControladoraPersistecia controlPersis;

    public ControladoraLogica() {
        controlPersis =  new ControladoraPersistecia();
    }
    

    public boolean  validarUsser(String usser, String password) {
        
        boolean ok = false;
        //taer los usuario
        List <Usuario> listaUsuarios = controlPersis.traerUsuarios();
        //recorrer la lista para determinar si esta la contraseña y user
        for (Usuario use : listaUsuarios) {
            //Actcedmos al objeto  al nombre y se iguala al usuario ingresado desde el Jframe
            if (use.getName().equalsIgnoreCase(usser)) {
                //Accedemos al objeto y determinamos si la clave es igual a la que ingreso por Jframe
                if (use.getPassword().equalsIgnoreCase(password)) {
                    //Si es igual y se cumplen las condiciones retornamos true, para determinar el rol
                    ok = true;
                    return ok; 
                } else {
                    ok = false;
                    return ok; 
                }
            } else {
                ok = false;
                return ok;
                
            }
        }
        return ok; 
    }

    public String validarRol(String usser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

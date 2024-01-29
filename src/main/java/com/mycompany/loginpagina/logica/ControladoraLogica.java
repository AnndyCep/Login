
package com.mycompany.loginpagina.logica;

import com.mycompany.loginpagina.persistencia.ControladoraPersistecia;
import java.util.List;


public class ControladoraLogica {
    
    
    ControladoraPersistecia controlPersis;

    public ControladoraLogica() {
        controlPersis =  new ControladoraPersistecia();
    }
    

    public Usuario  validarUsser(String usser, String password) {
        
        Usuario usr = null;
        //taer los usuario
        List <Usuario> listaUsuarios = controlPersis.traerUsuarios();
        //recorrer la lista para determinar si esta la contraseña y user
        for (Usuario use : listaUsuarios) {
            //Actcedmos al objeto  al nombre y se iguala al usuario ingresado desde el Jframe
            if (use.getName().equalsIgnoreCase(usser)) {
                //Accedemos al objeto y determinamos si la clave es igual a la que ingreso por Jframe
                if (use.getPassword().equalsIgnoreCase(password)) {
                    //Si es igual y se cumplen las condiciones retornamos el obejto, para determinar el rol
                    usr = use;
                    return usr; 
                } else {
                    usr = null;
                    return usr; 
                }
            } else {
                usr = null;
                    
                
            }
        }
        return usr; 
    }

    
}

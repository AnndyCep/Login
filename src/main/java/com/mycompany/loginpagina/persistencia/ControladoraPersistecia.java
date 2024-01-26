
package com.mycompany.loginpagina.persistencia;

import com.mycompany.loginpagina.logica.Usuario;
import java.util.List;


public class ControladoraPersistecia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }
    
}

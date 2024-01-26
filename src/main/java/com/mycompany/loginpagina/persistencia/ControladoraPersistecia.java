
package com.mycompany.loginpagina.persistencia;

import com.mycompany.loginpagina.logica.Usuario;
import java.util.List;


public class ControladoraPersistecia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }
    
}

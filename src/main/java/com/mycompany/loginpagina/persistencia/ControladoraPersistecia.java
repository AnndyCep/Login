
package com.mycompany.loginpagina.persistencia;

import com.mycompany.loginpagina.logica.Rol;
import com.mycompany.loginpagina.logica.Usuario;
import java.util.List;


public class ControladoraPersistecia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities(); // Select * From roles trae todas los elementos de la bd
    }

    public void crearUsuario(Usuario usuario) {
        usuarioJpa.create(usuario);
    }
    
}

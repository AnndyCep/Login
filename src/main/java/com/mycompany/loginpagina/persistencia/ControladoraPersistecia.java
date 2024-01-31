
package com.mycompany.loginpagina.persistencia;

import com.mycompany.loginpagina.logica.Rol;
import com.mycompany.loginpagina.logica.Usuario;
import com.mycompany.loginpagina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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

    public void eliminarUsuario(int id_usuario) {
        try {
            usuarioJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistecia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id_user) {
        return usuarioJpa.findUsuario(id_user);
    }

    public void editarDatos(Usuario usu) {
        try {
            usuarioJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistecia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}


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

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearRol(String nombreUsuario, String password, String tipoUser) {
        //creamo un obteno usuario para setiar los valores que ingresaron 
        Usuario usuario = new Usuario();
        usuario.setName(nombreUsuario);
        usuario.setPassword(password);
        
        
        //Como tipoUser un string pero rol es un objeto dentro de user debemos acceder de una formo distinta
        //Creamos un objeto rol vacio
        Rol rol = new Rol();
        //Asignamos al objeto, un metodo que treera el rol, y se enviara por parametro el rol que se encontrara
        rol = this.traerRol(tipoUser);
        
        //validamos que el rol no este vacio
        if (rol!= null) {
            //Al objeto usuario se le envia el rol
            usuario.setUnRol(rol);
        }
        // se crea variable para tomar el id disponible,, se crea metodo con el fin de consultar cual es el Id disponible
        int id = this.encontrarIdusuario();
        // Enviamos al objeto usuario la pocision disponible sumandole uno mas.
        usuario.setId_usser(id + 1); 
        
        controlPersis.crearUsuario(usuario);
        
        
    }

    private Rol traerRol(String tipoUser) {
        //Creamos una lista, que retorna objetos con los roles
        List<Rol> listaRoles = controlPersis.traerRoles();
        
        if (listaRoles != null) {
            //Iteramos sobre cada objeto, para confirmar si coincide con el que ingreso en la creacion
            for (Rol rol : listaRoles) {
                //consultamos por cada objeto
                if (rol.getNombreUsiario().equalsIgnoreCase(tipoUser)) {
                    return rol;
                }
            }
        }
        return null;
    }

    private int encontrarIdusuario() {
        //Creamos una lista donde traemos los datos del los usuarios
        List <Usuario> listaUsuario = this.traerUsuarios();
        //creamos un obejeto usu, donde guarmados el ultimo objeto de la lista
        Usuario usu = listaUsuario.get(listaUsuario.size()-1);
        //retornamos el Id del ultimo obejto guardado
        return usu.getId_usser();
        
    }

    public void eliminarUsuario(int id_usuario) {
        controlPersis.eliminarUsuario(id_usuario);
    }

    
}


package com.mycompany.loginpagina.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_rol;
    private String nombreUsiario;
    private String descripcion;
    @OneToMany (mappedBy = "unRol") //Un rol puede tener mucho usuarios, se debe mapear a la claje Usario con el objeto creado.
    private List<Usuario> listaUsuarios;
    
    public Rol() {
    }

    public Rol(int id_rol, String nombreUsiario, String descripcion, List<Usuario> listaUsuarios) {
        this.id_rol = id_rol;
        this.nombreUsiario = nombreUsiario;
        this.descripcion = descripcion;
        this.listaUsuarios = listaUsuarios;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    

   

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombreUsiario() {
        return nombreUsiario;
    }

    public void setNombreUsiario(String nombreUsiario) {
        this.nombreUsiario = nombreUsiario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}

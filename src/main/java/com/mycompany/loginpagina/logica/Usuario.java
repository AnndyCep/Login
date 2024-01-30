
package com.mycompany.loginpagina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Usuario implements Serializable{
    
    @Id
    /*@GeneratedValue(strategy = GenerationType.AUTO)*/
    private int id_usser;
    
    
    private String name;
    private String password;
    @ManyToOne //Un usuario puede tener un solo usuario, se debe referencia la tabla rol
    @JoinColumn(name = "Fk_id")
    private Rol unRol;

    public Usuario(int id_usser, String name, String password, Rol unRol) {
        this.id_usser = id_usser;
        this.name = name;
        this.password = password;
        this.unRol = unRol;
    }

       
   
    public Usuario() {
    }

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }
    

    public int getId_usser() {
        return id_usser;
    }

    public void setId_usser(int id_usser) {
        this.id_usser = id_usser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usser=" + id_usser + ", name=" + name + ", password=" + password + '}';
    }
    
    
}

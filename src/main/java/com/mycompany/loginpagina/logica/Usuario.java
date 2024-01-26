
package com.mycompany.loginpagina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_usser;
    
    
    private String name;
    private String password;

    public Usuario(int id_usser, String name, String password) {
        this.id_usser = id_usser;
        this.name = name;
        this.password = password;
    }

    public Usuario() {
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

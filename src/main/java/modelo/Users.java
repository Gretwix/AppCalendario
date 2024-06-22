/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alehe
 */
@Entity
@Table(name = "usuario")
public class Users implements Serializable {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "telefono")
    private String number;
    @Column(name = "apellidos")
    private String lastName;
    @Column(name = "correo")
    private String email;
    @Column(name = "nombre_usuario")
    private String userName;
     @Column(name = "contrase\u00f1a")
    private String password;
     @Column(name = "carnet")
    private String carnet;

    public Users(int id, String name, String number, String lastName, String email, String userName, String password, String carnet) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.carnet = carnet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", name=" + name + ", number=" + number + ", lastName=" + lastName + ", email=" + email + ", userName=" + userName + ", password=" + password + ", carnet=" + carnet + '}';
    }
    

   
}

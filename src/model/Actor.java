/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.ActorDAO;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

public class Actor {
    
    String name;
    String nationality;
    String gender;
    Date birthDate;

    public Actor(String name, String nationality, String gender, Date birthDate) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public void registerActor(Actor actor) {
        new ActorDAO().registerActor(actor);
    }
    
    public ArrayList<Actor> listActor(Actor actor) {
        return new ActorDAO().listActor();
    }
    
    public void updateActor(Actor actor) {
        new ActorDAO().updateActor(actor);
    }
    
    public void deleteActor(Actor actor) {
        new ActorDAO().deleteActor(actor);
    }
}

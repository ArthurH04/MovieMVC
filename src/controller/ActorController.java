/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.ActorDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Actor;

public class ActorController {

    public boolean registerActor(String name, String gender, String nationality, String birthDate) throws ParseException {
        
        if (name != null && name.length() > 0 && gender != null && gender.length() > 0 && nationality != null && nationality.length() > 0 && verifyDate(birthDate)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = simpleDateFormat.parse(birthDate);
            
            Actor actor = new Actor(name, nationality, gender, date);
            actor.registerActor(actor);
            
            return true;
        }
        return false;

    };  
    
    
    public ArrayList<Actor> listActors(String name)  {
        return new ActorDAO().listActor(name);
    }
    
    public boolean deleteActor(int id)  {
        if (id == 0) {
            return false;
        }else{
            Actor actor = new Actor();
            actor.setId(id);
            actor.deleteActor(actor);
            return true;
        }
    }
    
    public boolean updateActor(int id, String name, String gender, String nationality, String birthDate) throws ParseException{
        if (name != null && name.length() > 0 && gender != null && gender.length() > 0 && nationality != null && nationality.length() > 0 && verifyDate(birthDate)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = simpleDateFormat.parse(birthDate);
            
            Actor actor = new Actor(name, nationality, gender, date);
            actor.setId(id);
            actor.updateActor(actor);
            
            return true;
        }
        return false;
    }
    
    
    private boolean verifyDate(String birthDate) {
        for (int i = 0; i < birthDate.length(); i++) {
            if (!Character.isDigit(birthDate.charAt(i))) {
                if (!(i == 2 || i == 5)) {
                    return false;
                }
            }
        }
        return true;
    }
}

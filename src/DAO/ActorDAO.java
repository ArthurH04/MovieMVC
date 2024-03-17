/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import infra.ConnectionFactory;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import model.Actor;

public class ActorDAO implements IActorDAO{

    @Override
    public void registerActor(Actor actor) {
        
        PreparedStatement ps = null;
        Connection connection = null;
        
        String sql = "INSERT INTO actor (name, gender, nationality, birthDate) VALUES (?,?,?,?)";
        
        try {
            connection = ConnectionFactory.getConnection();
            ps = connection.prepareStatement(sql);
            
            ps.setString(1, actor.getName());
            ps.setString(2, actor.getGender());
            ps.setString(3, actor.getNationality());
            ps.setDate(4, new Date(actor.getBirthDate().getTime()));
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }  
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public ArrayList<Actor> listActor() {
        return null;
    }
    
    @Override
    public void updateActor(Actor actor) {
    }

    @Override
    public void deleteActor(Actor actor) {
    }
    
}

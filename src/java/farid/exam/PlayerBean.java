/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farid.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Farid
 */
@ManagedBean
@RequestScoped
public class PlayerBean {

    private Player SelectedPlayer;
    private List<String> players = new ArrayList<String>();
    public PlayerBean() {
    }
    public List complete(String query) {   
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farid", "root", "");
            PreparedStatement stm = con.prepareStatement("select * from player");
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                players.add(rs.getString(2));
                System.out.println(rs.getString(2));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        return players;
    }

    public Player getSelectedPlayer() {
        return SelectedPlayer;
    }

    public void setSelectedPlayer(Player SelectedPlayer) {
        this.SelectedPlayer = SelectedPlayer;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
       
    }
    
}

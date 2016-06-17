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
public class DBBean {

    private List<Player> players;
    private Player selectedPlayer;

    public DBBean() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farid", "root", "");
            PreparedStatement stm = con.prepareStatement("select * from player");
            ResultSet rs = stm.executeQuery();
            players = new ArrayList<Player>();
            while (rs.next()) {
                players.add(new Player(rs.getString(1), rs.getInt(2), rs.getString(3)));

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getSelectedPlayer() {
        return selectedPlayer;
    }

    public void setSelectedPlayer(Player selectedPlayer) {
        this.selectedPlayer = selectedPlayer;
    }

    


    
}

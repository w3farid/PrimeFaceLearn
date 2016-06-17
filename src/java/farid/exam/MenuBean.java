/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farid.exam;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Farid
 */
@ManagedBean
@RequestScoped
public class MenuBean {
    private List<Player> players;
    private Player selectedPlayer;
    public MenuBean(){
        players=new ArrayList<Player>();
        players.add(new Player("farid", 30, "farid.jpg"));
        players.add(new Player("farid", 27, "farid.jpg"));
        
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

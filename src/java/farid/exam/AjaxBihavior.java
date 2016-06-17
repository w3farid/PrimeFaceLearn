/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farid.exam;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Farid
 */
@ManagedBean
@RequestScoped
public class AjaxBihavior {

    private String text;
    private int count;

    public AjaxBihavior() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void incriment(){
        count=Integer.parseInt(text);
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}

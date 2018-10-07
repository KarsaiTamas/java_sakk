/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakk;

/**
 *
 * @author Karsa
 */
public class Pozicio {
        private int x;
    private int y;
    
    public Pozicio(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Pozicio(){
        
    }
     public int Get_X(){
        return x;
    }
    
    public void Set_X(int x){
        this.x= x;
    }
     
     public int Get_Y(){
        return y;
    }
     
    public void Set_Y(int y){
        this.y= y;
    }
    
}

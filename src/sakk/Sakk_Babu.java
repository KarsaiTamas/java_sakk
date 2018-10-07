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
public class Sakk_Babu {

    private String nev;
    private int x_helye;//lép
    private int y_helye;//lép
    private Pozicio babu_helye;
    public Sakk_Babu(){
        
    }
    public Sakk_Babu(String nev,int x_helye,int y_helye){
         
        
        this.nev=nev;
        this.x_helye=x_helye;
        this.y_helye=y_helye;
        
    }
 
  
     public String Get_Nev(){
        return nev;
    }
     
    public void Set_Nev(String nev){
        this.nev= nev;
    }
    
    public int Get_X_Helye(){
        return x_helye;
    }
    
    public void Set_X_Helye(int x_helye){
        this.x_helye= x_helye;
    }
    
     public int Get_Y_Helye(){
        return y_helye;
    }
     
    public void Set_Y_Helye(int y_helye){
        this.y_helye= y_helye;
    }
    
}

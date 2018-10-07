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
public class Jatekos {
    private final Sakk_Babu[] babu=new Sakk_Babu[16];
    private Boolean tud_lepni;
    private String szin;
    public Jatekos(Boolean tud_lepni,String szin){
        this.tud_lepni=tud_lepni;
        this.szin=szin;
    }
    
    public Boolean Get_Tud_Lepni(){
        return tud_lepni;
    }
    public void Set_Tud_Lepni(Boolean tud_lepni){
        this.tud_lepni= tud_lepni;
    }
    public String Get_Szin(){
        return szin;
    }
    public void Set_szin(String szin){
        this.szin= szin;
    }
    
    
    
    
    
}

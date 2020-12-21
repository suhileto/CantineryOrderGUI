/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantinuygulama;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class kantinaltsinif extends Kantin {
    
    
  
    
    @Override
     public double Fiyattopla(){
        
       toplamfiyat=hamburger+pizza+tost+sosisli+pogaca+simit+polo+kraker+biskuvi+cikolata+cay+kahve+cola+icetea+limonata+portakalsuyu+su+sprite ;
        
        
   return toplamfiyat; }
  
        
     
  
    @Override
    public double cfindtax(double cfiyat){
        
        double findtax=cfiyat-(cfiyat * tax);
        return findtax;
    }     
        
        
}

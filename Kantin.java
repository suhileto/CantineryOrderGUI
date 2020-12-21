/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantinuygulama;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Kantin {
    
    public double hamburger;
    public double pizza;
    public double tost;
    public double sosisli;
    public double pogaca;
    public double simit;
    public double polo;
    public double kraker;
    public double biskuvi;
    public double cikolata;
    public double cay;
    public double kahve;
    public double cola;
    public double icetea;
    public double limonata;
    public double portakalsuyu;
    public double su;
    public double sprite;
    public double toplam;
    public double toplamfiyat;
    
    
    
    public double Fiyattopla(){
        
       toplamfiyat=hamburger+pizza+tost+sosisli+pogaca+simit+polo+kraker+biskuvi+cikolata+cay+kahve+cola+icetea+limonata+portakalsuyu+su+sprite ;
        
        
   return toplamfiyat; }
    
    private JFrame frame;

    /**
     *
     */
    public void iExitSystem(){
       
        frame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"ÇIKIŞ YAPMAK İSTİYOR MUSUNUZ?","KANTİN SİPARİŞ UYGULAMASI", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
   ///*********************************************FİYATLAR*********************************************
   
    public double Fhamburger=8;
    public double Fpizza=12.5;
    public double Ftost=4;
    public double Fsosisli=5;
    public double Fpogaca=2.5;
    public double Fsimit=1.5;
    public double Fpolo=2.25;
    public double Fkraker=2;
    public double Fbiskuvi=3.5;
    public double Fcikolata=2;
    public double Fcay=1.5;
    public double Fkahve=3;
    public double Fcola=5;
    public double Ficetea=4;
    public double Flimonata=7;
    public double Fportakalsuyu=7;
    public double Fsu=1.25;
    public double Fsprite=5;
    
   
    
    public double tax=0.6;
    public double cfindtax(double cfiyat){
        
        double findtax=cfiyat-(cfiyat * tax);
        return findtax;
    }
}


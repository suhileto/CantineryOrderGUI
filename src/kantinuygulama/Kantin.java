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

    Kantin() {
        
    }
    
    
    
    public double Fiyattopla(){
        
       toplamfiyat=hamburger+pizza+tost+sosisli+pogaca+simit+polo+kraker+biskuvi+cikolata+cay+kahve+cola+icetea+limonata+portakalsuyu+su+sprite ;
        
        
   return toplamfiyat; }

    public Kantin(double hamburger, double pizza, double tost, double sosisli, double pogaca, double simit, double polo, double kraker, double biskuvi, double cikolata, double cay, double kahve, double cola, double icetea, double limonata, double portakalsuyu, double su, double sprite, double toplam, double toplamfiyat) {
        this.hamburger = hamburger;
        this.pizza = pizza;
        this.tost = tost;
        this.sosisli = sosisli;
        this.pogaca = pogaca;
        this.simit = simit;
        this.polo = polo;
        this.kraker = kraker;
        this.biskuvi = biskuvi;
        this.cikolata = cikolata;
        this.cay = cay;
        this.kahve = kahve;
        this.cola = cola;
        this.icetea = icetea;
        this.limonata = limonata;
        this.portakalsuyu = portakalsuyu;
        this.su = su;
        this.sprite = sprite;
        this.toplam = toplam;
        this.toplamfiyat = toplamfiyat;
    }
    
   

    public double getHamburger() {
        return hamburger;
    }

    public void setHamburger(double hamburger) {
        this.hamburger = hamburger;
    }

    public double getPizza() {
        return pizza;
    }

    public void setPizza(double pizza) {
        this.pizza = pizza;
    }

    public double getTost() {
        return tost;
    }

    public void setTost(double tost) {
        this.tost = tost;
    }

    public double getSosisli() {
        return sosisli;
    }

    public void setSosisli(double sosisli) {
        this.sosisli = sosisli;
    }

    public double getPogaca() {
        return pogaca;
    }

    public void setPogaca(double pogaca) {
        this.pogaca = pogaca;
    }

    public double getSimit() {
        return simit;
    }

    public void setSimit(double simit) {
        this.simit = simit;
    }

    public double getPolo() {
        return polo;
    }

    public void setPolo(double polo) {
        this.polo = polo;
    }

    public double getKraker() {
        return kraker;
    }

    public void setKraker(double kraker) {
        this.kraker = kraker;
    }

    public double getBiskuvi() {
        return biskuvi;
    }

    public void setBiskuvi(double biskuvi) {
        this.biskuvi = biskuvi;
    }

    public double getCikolata() {
        return cikolata;
    }

    public void setCikolata(double cikolata) {
        this.cikolata = cikolata;
    }

    public double getCay() {
        return cay;
    }

    public void setCay(double cay) {
        this.cay = cay;
    }

    public double getKahve() {
        return kahve;
    }

    public void setKahve(double kahve) {
        this.kahve = kahve;
    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public double getIcetea() {
        return icetea;
    }

    public void setIcetea(double icetea) {
        this.icetea = icetea;
    }

    public double getLimonata() {
        return limonata;
    }

    public void setLimonata(double limonata) {
        this.limonata = limonata;
    }

    public double getPortakalsuyu() {
        return portakalsuyu;
    }

    public void setPortakalsuyu(double portakalsuyu) {
        this.portakalsuyu = portakalsuyu;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getSprite() {
        return sprite;
    }

    public void setSprite(double sprite) {
        this.sprite = sprite;
    }

    public double getFhamburger() {
        return Fhamburger;
    }

    public void setFhamburger(double Fhamburger) {
        this.Fhamburger = Fhamburger;
    }

    public double getFpizza() {
        return Fpizza;
    }

    public void setFpizza(double Fpizza) {
        this.Fpizza = Fpizza;
    }

    public double getFtost() {
        return Ftost;
    }

    public void setFtost(double Ftost) {
        this.Ftost = Ftost;
    }

    public double getFsosisli() {
        return Fsosisli;
    }

    public void setFsosisli(double Fsosisli) {
        this.Fsosisli = Fsosisli;
    }

    public double getFpogaca() {
        return Fpogaca;
    }

    public void setFpogaca(double Fpogaca) {
        this.Fpogaca = Fpogaca;
    }

    public double getFsimit() {
        return Fsimit;
    }

    public void setFsimit(double Fsimit) {
        this.Fsimit = Fsimit;
    }

    public double getFpolo() {
        return Fpolo;
    }

    public void setFpolo(double Fpolo) {
        this.Fpolo = Fpolo;
    }

    public double getFkraker() {
        return Fkraker;
    }

    public void setFkraker(double Fkraker) {
        this.Fkraker = Fkraker;
    }

    public double getFbiskuvi() {
        return Fbiskuvi;
    }

    public void setFbiskuvi(double Fbiskuvi) {
        this.Fbiskuvi = Fbiskuvi;
    }

    public double getFcikolata() {
        return Fcikolata;
    }

    public void setFcikolata(double Fcikolata) {
        this.Fcikolata = Fcikolata;
    }

    public double getFcay() {
        return Fcay;
    }

    public void setFcay(double Fcay) {
        this.Fcay = Fcay;
    }

    public double getFkahve() {
        return Fkahve;
    }

    public void setFkahve(double Fkahve) {
        this.Fkahve = Fkahve;
    }

    public double getFcola() {
        return Fcola;
    }

    public void setFcola(double Fcola) {
        this.Fcola = Fcola;
    }

    public double getFicetea() {
        return Ficetea;
    }

    public void setFicetea(double Ficetea) {
        this.Ficetea = Ficetea;
    }

    public double getFlimonata() {
        return Flimonata;
    }

    public void setFlimonata(double Flimonata) {
        this.Flimonata = Flimonata;
    }

    public double getFportakalsuyu() {
        return Fportakalsuyu;
    }

    public void setFportakalsuyu(double Fportakalsuyu) {
        this.Fportakalsuyu = Fportakalsuyu;
    }

    public double getFsu() {
        return Fsu;
    }

    public void setFsu(double Fsu) {
        this.Fsu = Fsu;
    }

    public double getFsprite() {
        return Fsprite;
    }

    public void setFsprite(double Fsprite) {
        this.Fsprite = Fsprite;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    } 
    
    
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
    
    
    public double paraustuu(double toplam,double odenen){
        
        double paraust=(double)(toplam-odenen);
        return paraust;
    }
    
    public double paraustuu(String toplam,String odenen){
        
        
        Integer toplamint = Integer.valueOf(toplam);
        Integer odenenint= Integer.valueOf(odenen);
        int paraust=toplamint-odenenint;
        
        return paraust;
    }
}


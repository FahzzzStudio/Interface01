/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carnivora;

import interface01.Implementasi;

/**
 *
 * @author ASUS
 */
public class Kucing implements Implementasi {

    @Override
    public void bersuara() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kucing bersuara meonggg");
    }

    @Override
    public void berjalan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kucing bersuara lucu dan menggemaskan");
    }

    @Override
    public void bernafas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kucing bernafas dengan paru-paru");
    }

    @Override
    public void bergerak() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kucing bergerak dengan hati-hati dan lincah");
    }
    
}

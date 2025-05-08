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
public class Harimau implements Implementasi{

    @Override
    public void bersuara() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Harimau bersuaraGroarrrr");
    }

    @Override
    public void berjalan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Harimau berjalan gagah ditengah hutan");
    }

    @Override
    public void bernafas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Harimau bernafas dengan paru-paru");
    }
    

    @Override
    public void bergerak() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Harimau bergarak dengan cepat");
    }
    
}

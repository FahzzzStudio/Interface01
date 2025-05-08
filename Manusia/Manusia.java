/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manusia;

import interface01.Implementasi;

/**
 *
 * @author ASUS
 */
public class Manusia implements Implementasi{

    @Override
    public void bersuara() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Hehey");
    }

    @Override
    public void berjalan() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Berjalan dengan dua kaki");
    }

    @Override
    public void bernafas() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Menggunakan paru paru");
    }

    @Override
    public void bergerak() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Bergerak bebas");
    }
    
}

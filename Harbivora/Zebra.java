/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harbivora;

import interface01.Implementasi;

/**
 *
 * @author ASUS
 */
public class Zebra implements Implementasi {

    @Override
    public void bersuara() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Zebra bersuara iihaaa iihaaa");
    }

    @Override
    public void berjalan() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Zebra berjalan beriringan dalam kawanan");
    }

    @Override
    public void bernafas() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Zebra bernafas menggunakan paru-paru");
    }

    @Override
    public void bergerak() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Zebra bergerak zig zag menghindari predator");
    }
    
}

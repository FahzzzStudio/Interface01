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
public class Kerbau implements Implementasi {

    @Override
    public void bersuara() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kerbau bersuara Mooooo");
    }

    @Override
    public void berjalan() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kerbau berjalan pelan ketika dilumpur");
    }

    @Override
    public void bernafas() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Kerbau bernafas dengan paru-paru");
    }

    @Override
    public void bergerak() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("kerbau bergerak dengan kuat sehingga untuk membantu petani");
    }
    
}

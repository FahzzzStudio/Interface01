/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface01;

//Harbivora
import Manusia.Manusia;
import Harbivora.Kerbau;
import Harbivora.Kudanil;
import Harbivora.Zebra;

//Carnivora
import Carnivora.Harimau;
import Carnivora.Kucing;
import Carnivora.Serigala;


/**
 *
 * @author ASUS
 */
public class Interface01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Tes
        Manusia objectManusia = new Manusia();
        objectManusia.bergerak();
        objectManusia.bersuara();
        
        //Harbivora
        Kerbau Kerbau = new Kerbau();
        Kerbau.bergerak();
        Kerbau.berjalan();
        Kerbau.bernafas();
        Kerbau.bersuara();
        
        Kudanil Kudanil = new Kudanil();
        Kudanil.bergerak();
        Kudanil.berjalan();
        Kudanil.bernafas();
        Kudanil.bersuara();
        
        Zebra Zebra = new Zebra();
        Zebra.bergerak();
        Zebra.berjalan();
        Zebra.bernafas();
        Zebra.bersuara();
        
        //Carnivora
        Harimau harimau = new Harimau();
        harimau.bergerak();
        harimau.berjalan();
        harimau.bernafas();
        harimau.bersuara();
        
        Kucing kucing = new Kucing();
        kucing.bergerak();
        kucing.berjalan();
        kucing.bernafas();
        kucing.bersuara();
        
        Serigala serigala = new Serigala();
        serigala.bergerak();
        serigala.berjalan();
        serigala.bernafas();
        serigala.bersuara();
    }
    
}

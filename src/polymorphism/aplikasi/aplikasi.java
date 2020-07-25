/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.aplikasi;

import polymorphism.jelajah;
import polymorphism.movie;

/**
 *
 * @author Acer
 */
public class aplikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        movie m = new jelajah();
        m.setJudul("Hutan Rimba");
        m.negara();
        
        System.out.println(m.getJudul());
    }
    
}

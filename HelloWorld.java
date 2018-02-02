/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.io.IOException;

/**
 *
 * @author Marc
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            lire.read();
        } catch (IOException ex) {
            System.out.println("Erreur : " + ex.getLocalizedMessage());
        }
    }
    
}

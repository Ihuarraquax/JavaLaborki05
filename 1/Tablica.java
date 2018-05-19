/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5_1;

import java.io.*;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hubii
 */
public class Tablica {

    private int[] tab;

    public Tablica(int x) {

        tab = new int[x];

    }

    public void wypelnij() {
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {

            tab[i] = rand.nextInt(100000000) + 1;
        }
    }
    
    public void wyswietl(){
        for (int i = 0; i < tab.length; i++) {

            System.out.print(tab[i]+" ");
        }
    }
    
    public void licznosc(Tablica tablica) throws IOException {
        int licznosc = tab.length + tablica.tab.length;
        System.out.println(licznosc);
        try {
            FileWriter f = new FileWriter("licznosc.txt");
            
            try (BufferedWriter br = new BufferedWriter(f)) {
                br.write(Integer.toString(licznosc));
            }
        } catch (FileNotFoundException ex) {
        }


    }
    



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5_2;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hubii
 */
class Indeks implements Serializable {

    protected String[] przedmioty = {"Programowanie", "Matematyka", "Fizyka", "Angielski", "Elektronika"};
    protected String[][] oceny;

    public Indeks() {
        oceny = new String[przedmioty.length][5];
        int i = 0;
        for (String x : przedmioty) {
            oceny[i][0] = x;
            i++;
        }
    }

    public void dodajOcene() {
        Scanner userInput = new Scanner(System.in);
        for (int i = 1; i <= przedmioty.length; i++) {
            System.out.println(i + ": " + przedmioty[i - 1]);
        }
        System.out.print("Wybierz przedmiot: ");
        int wybor = userInput.nextInt();
        for (int i = 1; i < oceny.length; i++) {
            if (oceny[wybor - 1][i] == null) {
                int ocena = userInput.nextInt();
                oceny[wybor - 1][i] = Integer.toString(ocena);
                break;
            }
        }

    }

    public void randomOceny() {
        Random rand = new Random();
        int ocena;

        for (int i = 0; i < oceny.length; i++) {
            for (int j = 1; j < oceny.length; j++) {
                ocena = rand.nextInt(6) + 1;
                oceny[i][j] = Integer.toString(ocena);

            }
        }
    }

}

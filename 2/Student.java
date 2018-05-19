/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5_2;

import java.io.*;

/**
 *
 * @author Hubii
 */
public class Student implements Serializable {

    private String imie, nazwisko;
    public Indeks index = new Indeks();

    public Student() throws IOException {
        InputStreamReader userInput = new InputStreamReader(System.in);
        BufferedReader BufUserInput = new BufferedReader(userInput);
        System.out.print("Imię: ");
        imie = BufUserInput.readLine();
        System.out.print("Nazwisko: ");
        nazwisko = BufUserInput.readLine();
    }

    public void wypisz() {
        System.out.println();
        System.out.print(this.imie + " ");
        System.out.println(this.nazwisko);
        for (String[] oceny1 : this.index.oceny) {

            for (int j = 0; j < this.index.oceny.length; j++) {
                if (oceny1[j] != null) {

                    System.out.print(oceny1[j] + " ");
                }
            }
            System.out.println();

        }
    }

    public void zapisz() throws IOException, ClassNotFoundException {

        //jesli plik jest pusty
        File file = new File("db.dat");
        boolean empty = !file.exists() || file.length() == 0;
        if (!empty) {

            Student[] tab = new Student[100];
            ObjectInputStream obj = null;

            try {
                obj = new ObjectInputStream(new FileInputStream("db.dat"));
                int i = 0;
                while (true) {
                    tab[i++] = (Student) obj.readObject();
                }
            } catch (EOFException ex) {
                if (obj != null) {
                    obj.close();
                }
                ObjectOutputStream obj2 = null;
                try {
                    obj2 = new ObjectOutputStream(new FileOutputStream("db.dat"));

                    for (int i = 0; tab[i] != null; i++) {
                        obj2.writeObject(tab[i]);
                    }
                    obj2.writeObject(this);
                    obj2.flush();

                } finally {
                    if (obj2 != null) {
                        obj2.close();
                    }
                }

            }
        } else {
            ObjectOutputStream pl = null;
            try {
                pl = new ObjectOutputStream(new FileOutputStream("db.dat"));
                pl.writeObject(this);
                pl.flush();
            } finally {
                if (pl != null) {
                    pl.close();
                }
            }
        }
    }

    public static Student[] odczyt() throws IOException, ClassNotFoundException {
        Student[] tab = new Student[100];
        int i = 0;
        ObjectInputStream odczyt = new ObjectInputStream(new FileInputStream("db.dat"));
        try {
            while (true) {
                tab[i] = (Student) odczyt.readObject();
                i++;
            }
        } catch (EOFException ex) {
            odczyt.close();
        }
//        for (int j = 0; j < i; j++) {
//            tab[j].wypisz();
//        }
        return tab;
    }
    
    

}

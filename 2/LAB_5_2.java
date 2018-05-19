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
public class LAB_5_2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        
        Student stud = new Student();
        stud.index.randomOceny();
        stud.zapisz();
        
        Student[] studenci;
        studenci = Student.odczyt();
//        int i=0;
//        while(studenci[i]!=null){
//            studenci[i++].wypisz();
//        }
        

    }
    
}

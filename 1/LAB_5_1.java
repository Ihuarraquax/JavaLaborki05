/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5_1;

import java.io.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Hubii
 */
public class LAB_5_1 {
     public static void main(String[] args) throws IOException {
        
         InputStreamReader iread = new InputStreamReader(System.in);
         BufferedReader buf = new BufferedReader(iread);
         String a = buf.readLine();
         String b = buf.readLine();
         Tablica tablica1 = new Tablica(Integer.parseInt(a));
         Tablica tablica2 = new Tablica(Integer.parseInt(b));
         tablica1.wypelnij();
         tablica2.wypelnij();
         
         tablica1.licznosc(tablica2);
         
         
         
         
         
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empresa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author PRUEBAS
 */
public class Empresa {

    public static void main(String[] args) throws IOException {
           BufferedReader br = null;
      
      try {
         
         br =new BufferedReader(new FileReader("C:\\Users\\LUISA\\Documents\\estructura de datos\\junio.dat"));
         String line = br.readLine();
         while (null!=line) {
            String [] fields = line.split("\n");
            System.out.println(Arrays.toString(fields));
            
         
            System.out.println(Arrays.toString(fields));
            
            line = br.readLine();
         }
         
      } catch (IOException e) {
      
      } finally {
         if (null!=br) {
            br.close();
         }
    }
}

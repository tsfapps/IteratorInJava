/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexapmle;

import java.io.*; 
import java.util.*; 
public class IteratorExapmle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        ArrayList<String> list = new ArrayList<String>(); 
  
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        list.add("E"); 
  
        // Iterator to traverse the list 
        Iterator iterator = list.iterator(); 
  
        System.out.println("List elements : "); 
  
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
  
       // list.add("G");
        System.out.println(); 
    } 
} 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Timka
 */
public class Laba4_Test {

     public static void main(String[] args) {
 
         boolean quit = false;
 
         // Example problem:
         // maximize 3x + 5y
         // subject to x +  y = 4 and
         //            x + 3y = 6
         float[][] standardized =  {
                 { 1,  1,  1,  0,  4},
                 { 1,  3,  0,  1,  6},
                 {-3, -5,  0,  0,  0}
         };
 
         // row and column do not include
         // right hand side values
         // and objective row
         Laba4_Test Laba4_Test = new Laba4_Test(2, 4);
 
         Laba4_Test.fillTable(standardized);
 
         // print it out
         System.out.println("Starting");
         Laba4_Test.print();
 
         // if table is not optimal re-iterate
         while(!quit){
             Laba4_Test.ERROR err = Laba4_Test.compute();
 
             if(err == Laba4_Test.ERROR.IS_OPTIMAL){
                 Laba4_Test.print();
                 quit = true;
             }
             else if(err == Laba4_Test.ERROR.UNBOUNDED){
                 System.out.println("unbounded");
                 quit = true;
             }
         }
     }
 }

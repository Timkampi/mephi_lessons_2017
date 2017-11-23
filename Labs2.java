/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timka
 */
public class Labs2 /* #2 */ {
  
 
     double function(double x, int i) {
         switch (i) {
             case 1:
                 return Math.pow(x, 1);
             case 2:
                 return Math.pow(x, 2);
             case 3:
                 return Math.exp(x);
             case 4:
                 return Math.pow(x, 2) - Math.pow(x, 1);
             case 5:
                 return Math.pow(x, 3) + Math.pow(x, 2);
             case 6:
                 return Math.sin(x);
             case 7:
                 return Math.cos(x);
             case 8:
                 return Math.abs(Math.sin(x));
             case 9:
                 return Math.pow(x, 3) + 1;
             case 10:
                 return Math.pow(x, 3) + Math.sin(x);
             default:
                 return x;
         }
 
 
     }
 
     double rectangleMethod(int i,double a, double b, int n) {
         double h = (b - a) / n, sum = 0;
         for (double x = a + 0.5 * h; x <= b; x += h) {
             sum += function(x,i);
         }
         return h * sum;
     }
 
     double trapezMethod(int i,double a, double b, int n) {
         double h = (b - a) / n, sum = 0;
         for (double x = a + h; x <= b + h; x += h) {
             sum += function(x,i);
         }
         return h * (sum - 0.5 * (function(a,i) + function(b,i)));
     }
 
     double parabolaMethod(int i,double a, double b, int n) {
         double h = (b - a) / n, sum = 0;
         for (double x = a; x <= b - 2 * h; x += 2 * h) {
             sum += 2 * function(x+2*h,i) +
                     +4 * function(x + h,i);
         }
         return h / 3 * (sum + function(a,i) - function(b,i));
     }
 }
   


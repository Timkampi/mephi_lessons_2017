/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba.pkg1;

/**
 *
 * @author lenovo
 */
public class Laba1 {

 double function(double x, int i)
 {
 switch (i) 
 {
           case 1:  return Math.pow(x,1);
           case 2:  return Math.pow(x, 2);
           case 3:  return Math.exp(x);
           case 4:  return Math.pow(x, 2)- Math.pow(x, 1);
           case 5:  return Math.pow(x, 3) + Math.pow(x, 2);
           case 6:  return Math.sin(x);
           case 7:  return Math.cos(x);
           case 8:  return Math.abs(Math.sin(x));
           case 9:  return Math.pow(x,3)+ 1;
           case 10: return Math.pow(x,3)+ Math.sin(x);
           default: return x;
 }
       
      
 }
 
 double Bisection(double a, double b, double e, double delta, int i) 
 {
       
 {     
 while ((b - a) / 2 >= e) 
 {
 double x1 = ((a + b - delta) / 2);
 double x2 = ((a + b + delta) / 2);
 
 if (function(x1,i) > function(x2,i)) 
 {
     a = x1;
 } 
    else 
 {
     b = x2;
 }
 }
 return /* x'= */((a + b) / 2); 
 }
 }
     
     
 public double Golden_Section(double a, double b, double e, int i) 
 {
 double phi = (1 + Math.sqrt(5)) / 2;
        
 double x1 = (b - (b - a) / phi);
        
 double x2 = (a + (b - a) / phi);
 
 while ((b - a) / 2 >= e) 
 {
 if (function(x1,i) > function(x2,i)) 
 {
 a = x1;
 x1 = x2;
 x2 = (b - (x1 - a));
 } 
 else 
 {
 b = x2;
 x2 = x1;
 x1 = (a + (b - x2));
 }
 }
  return /* x'= */(a + b) / 2;
 }

    int Golden_Section(int i, int i0, double e, double delta, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double Golden_Section(int i, double PI, double e, double delta, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
 


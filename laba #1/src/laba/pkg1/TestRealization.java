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
public class TestRealization {

    private static Laba1 Laba1;
  public static void main(String[] args) 
  {
  Laba1 = new Laba1();
  double delta = 0.01;
  double e = 0.01;
    


 if (Math.abs(Laba1.Bisection(1, 4, e, delta, 1)-1) >e) 
     System.out.println("Не верно для ф 1");
 else
 {
 System.out.println("Верно для 1");
 }
 if (Math.abs(Laba1.Bisection(-2, 2, e, delta, 2)-0) >e) 
     System.out.println("Не верно для ф 2");
 else
 {
 System.out.println("Верно для 2");
 }
 if (Math.abs(Laba1.Bisection(0, 5, e, delta, 3)-0) >e) 
     System.out.println("Не верно для ф 3");
 else
 {
 System.out.println("Верно для 3");
 }
 if (Math.abs(Laba1.Bisection(-5, 5, e, delta, 4)-0.5) >e) 
     System.out.println("Не верно для ф 4");
 else
 {
 System.out.println("Верно для 4");
 }
 if (Math.abs(Laba1.Bisection(-1, 1, e, delta, 5) -2/3) >e) 
     System.out.println("Не верно для ф 5");
 else
 {
 System.out.println("Верно для 5");
 }
 if (Math.abs(Laba1.Bisection(1, Math.PI, e, delta, 6)-Math.PI)-Math.PI >e) 
     System.out.println("Не верно для ф 6");
 else
 {
 System.out.println("Верно для 6");
 }
 if (Math.abs(Laba1.Bisection(0, 5, e, delta, 7)-0.290)-Math.PI >e) 
     System.out.println("Не верно для ф 7");
 else
 {
 System.out.println("Верно для 7");
 }
 if (Math.abs(Laba1.Bisection(0, 2*Math.PI, e, delta, 8)-Math.PI) >e) 
     System.out.println("Не верно для ф 8");
 else
 {
 System.out.println("Верно для 8");
 }
 if (Math.abs(Laba1.Bisection(2, 10, e, delta, 9))-12 >e) 
     System.out.println("Не верно для ф 9" );
 else
 {
 System.out.println("Верно для 9");
 }
 if (Math.abs(Laba1.Bisection(0, Math.PI, e, delta, 10)- 0) >e) 
     System.out.println("Не верно для ф 10");
 else
 {
 System.out.println("Верно для 10");
 }
 
 
 
 
if (Math.abs(Laba1.Golden_Section(1, 4, e, 1)-1) >e) 
    System.out.println("Не верно для ф 1");
 else
{
System.out.println("Верно для 1");

}
 if (Math.abs(Laba1.Golden_Section(-2, 2, e, 2)-0) >e) 
     System.out.println("Не верно для ф 2");
 else
 {
 System.out.println("Верно для 2");
 }
 if (Math.abs(Laba1.Golden_Section(0, 5, e, 3)-0) >e) 
     System.out.println("Не верно для ф 3");
 else
 {
 System.out.println("Верно для 3");
 }
 if (Math.abs(Laba1.Golden_Section(-5, 5, e, 4)-0.5) >e) 
     System.out.println("Не верно для ф 4");
 else
 {
 System.out.println("Верно для 4");
 }
 if (Math.abs(Laba1.Golden_Section(-1, 1, e, 5) -2/3) >e) 
     System.out.println("Не верно для ф 5");
 else
 {
 System.out.println("Верно для 5");
 }
 if (Math.abs(Laba1.Golden_Section(1, Math.PI, e, 6)-Math.PI)-Math.PI >e) 
     System.out.println("Не верно для ф 6");
 else
 {
 System.out.println("Верно для 6");
 }
 if (Math.abs(Laba1.Golden_Section(0, 5, e, 7)-0.290)-Math.PI >e) 
     System.out.println("Не верно для ф 7");
 else
 {
 System.out.println("Верно для 7");
 }
 if (Math.abs(Laba1.Golden_Section(0, 2*Math.PI, e, 8)-Math.PI) >e) 
     System.out.println("Не верно для ф 8");
 else
 {
 System.out.println("Верно для 8");
 }
 if (Math.abs(Laba1.Golden_Section(2, 10, e, 9))-12 >e) 
     System.out.println("Не верно для ф 9" );
 else
 {
 System.out.println("Верно для ф 9");
 }
 if (Math.abs(Laba1.Golden_Section(0, Math.PI, e, 10)- 0) >e) 
     System.out.println("Верно для 10");
 else
 {
 System.out.println("Верно для ф 10");
 }
}
}
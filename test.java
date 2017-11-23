/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timka
 */
public class test {
     public static void main(String[] args) {
 
         Labs2 NI = new Labs2();
         double e = 0.01;
         if (Math.abs(NI.rectangleMethod(1, 1, 5, (int) Math.pow(10, 5))) - 12 > e)
            System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 1");
         else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 1");
         }
         if (Math.abs(NI.rectangleMethod(2, 1, 5, (int) Math.pow(10, 5))) - 41.333 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 2");
         else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 2");
         }
        if (Math.abs(NI.rectangleMethod(3, 1, 5, (int) Math.pow(10, 5))) - 145.69 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 3");
        else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 3");
         }
         if (Math.abs(NI.rectangleMethod(4, 1, 5, (int) Math.pow(10, 5))) - 29.33 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 4");
         else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 4");
         }
         if (Math.abs(NI.rectangleMethod(5, 1, 5, (int) Math.pow(10, 5))) - 197.33 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 5");
         else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 5");
         }
         if (Math.abs(NI.rectangleMethod(6, 1, 5, (int) Math.pow(10, 5))) - 0.2566 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 6");
         else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 6");
         }
         if (Math.abs(NI.rectangleMethod(7, 1, 5, (int) Math.pow(10, 5))) - 1.8004 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 7");
         else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 7");
        }
         if (Math.abs(NI.rectangleMethod(8, 1, 5, (int) Math.pow(10, 5))) - 2.825 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 8");
         else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 8");
         }
         if (Math.abs(NI.rectangleMethod(9, 1, 5, (int) Math.pow(10, 5))) - 160 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 9");
        else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 9");
         }
        if (Math.abs(NI.rectangleMethod(10, 1, 5, (int) Math.pow(10, 5))) - 156.26 > e)
             System.out.println("В пределах погрешности метод средних прямоугольников дает неверное значение для функции 10");
         else {
             System.out.println("В пределах погрешности метод средних прямоугольников дает верное значение для функции 10");
         }
 
 
         if (Math.abs(NI.trapezMethod(1, 1, 5, (int) Math.pow(10, 5))) - 12 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 1");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 1");
         }
         if (Math.abs(NI.trapezMethod(2, 1, 5, (int) Math.pow(10, 5))) - 41.333 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 2");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 2");
         }
         if (Math.abs(NI.trapezMethod(3, 1, 5, (int) Math.pow(10, 5))) - 145.696 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 3");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 3");
         }
         if (Math.abs(NI.trapezMethod(4, 1, 5, (int) Math.pow(10, 5))) - 29.33 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 4");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 4");
         }
         if (Math.abs(NI.trapezMethod(5, 1, 5, (int) Math.pow(10, 5))) - 197.33 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 5");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 5");
         }
        if (Math.abs(NI.trapezMethod(6, 1, 5, (int) Math.pow(10, 5))) - 0.2566 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 6");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 6");
         }
         if (Math.abs(NI.trapezMethod(7, 1, 5, (int) Math.pow(10, 5))) - 1.8004 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 7");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 7");
        }
         if (Math.abs(NI.trapezMethod(8, 1, 5, (int) Math.pow(10, 5))) - 2.825 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 8");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 8");
         }
         if (Math.abs(NI.trapezMethod(9, 1, 5, (int) Math.pow(10, 5))) - 160 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 9");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 9");
         }
         if (Math.abs(NI.trapezMethod(10, 1, 5, (int) Math.pow(10, 5))) - 156.26 > e)
             System.out.println("В пределах погрешности метод трапеций дает неверное значение для функции 10");
         else {
             System.out.println("В пределах погрешности метод трапеций дает верное значение для функции 10");
         }
 
         if (Math.abs(NI.parabolaMethod(1, 1, 5, (int) Math.pow(10, 5))) - 12 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 1");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 1");
         }
         if (Math.abs(NI.parabolaMethod(2, 1, 5, (int) Math.pow(10, 5))) - 41.333 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 2");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 2");
         }
         if (Math.abs(NI.parabolaMethod(3, 1, 5, (int) Math.pow(10, 5))) - 145.696 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 3");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 3");
         }
         if (Math.abs(NI.parabolaMethod(4, 1, 5, (int) Math.pow(10, 5))) - 29.33 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 4");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 4");
         }
         if (Math.abs(NI.parabolaMethod(5, 1, 5, (int) Math.pow(10, 5))) - 197.33 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 5");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 5");
         }
         if (Math.abs(NI.parabolaMethod(6, 1, 5, (int) Math.pow(10, 5))) - 0.2566 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 6");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 6");
         }
         if (Math.abs(NI.parabolaMethod(7, 1, 5, (int) Math.pow(10, 5))) - 1.8004 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 7");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 7");
         }
         if (Math.abs(NI.parabolaMethod(8, 1, 5, (int) Math.pow(10, 5))) - 2.825 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 8");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 8");
         }
         if (Math.abs(NI.parabolaMethod(9, 1, 5, (int) Math.pow(10, 5))) - 160 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 9");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 9");
         }
         if (Math.abs(NI.parabolaMethod(10, 1, 5, (int) Math.pow(10, 5))) - 156.26 > e)
             System.out.println("В пределах погрешности метод парабол дает неверное значение для функции 10");
         else {
             System.out.println("В пределах погрешности метод парабол дает верное значение для функции 10");
         }
     }
 }

package com.kastik.ergastirio5;
public class Main {
    public static void main(String[] args){
        Sugar white = new Sugar(1);
        Sugar brown = new Sugar(2);
        Cream xoris = new Cream(0);
        Cream afrogala = new Cream(1);
        Cream fitiki = new Cream(2);
        Cream gala = new Cream(3);
        Espresso pelatis1 = new Espresso(1,1,1,1.2f,white,gala,"fountouki",1);
        Capuccino pelatis2 = new Capuccino(2,2,1,1.8f,brown,fitiki,"banana",2,2);
        Frappe pelatis3 = new Frappe(1,2,1,4.8f,white,xoris,"fraoula",1);
        Filtrou pelatis4 = new Filtrou(2,1,2,1.9f,white,afrogala,"vanilia");
        Ellinikos pelatis5 = new Ellinikos(1,1,1,1.8f,white,xoris);
        printCoffee.printEspresso(pelatis1);
        printCoffee.printCapuccino(pelatis2);
        printCoffee.printFrappe(pelatis3);
        printCoffee.printFiltrou(pelatis4);
        printCoffee.printEllinikos(pelatis5);
    }
}
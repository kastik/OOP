package com.kastik.ergastirio5;
public class printCoffee {
    public static void printCoffe(Coffee temp){
        System.out.println("Coffee Name: "+temp.getCoffeeName());
        System.out.println("Typos Kafe: "+temp.getTyposKafe());
        System.out.println("Sweetnes: "+temp.getSweetnes());
        System.out.println("Dosi: "+temp.getDosi());
        System.out.println("Typos Sug: "+temp.typosSug.gettyposSug());
        System.out.println("Typos Cre: "+temp.typosCre.getTyposCre());
        System.out.println("Price: "+temp.getPrice());
        System.out.println();
    }
    public static void printEspresso(Espresso espresso){
        System.out.println("Gefsi: "+espresso.getGefsi());
        System.out.println("Iced: "+espresso.getIced());
        printCoffe(espresso);
    }
    public static void printCapuccino(Capuccino capuccino){
        System.out.println("Gefsi: "+capuccino.getGefsi());
        System.out.println("Iced: "+capuccino.getIced());
        System.out.println("Kanela: "+capuccino.getKanela());
        printCoffe(capuccino);
    }
    public static void printFrappe(Frappe frappe){
        System.out.println("Iced : " +frappe.getIced());
        System.out.println("Gefsi: "+ frappe.getGefsi());
        printCoffe(frappe);
    }
    public static void printFiltrou(Filtrou filtrou){
        System.out.println("Gefsi: "+filtrou.getGefsi());
        printCoffe(filtrou);
    }
    public static void printEllinikos(Ellinikos ellinikos){
        printCoffe(ellinikos);
    }
}

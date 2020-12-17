package com.kastik.ergastirio5.Tilefono;
public class Main{
    public static void main(String[] args){
        StatheroTilefono customer1 = new StatheroTilefono();
        customer1.klisiKinitou(23);
        customer1.klisiKinitou(2);
        System.out.println(customer1.getSinKostos());
    }
}

package com.kastik.askisi4;
import java.util.Scanner;
public class TestEmployee {
    public static void main(String[] args){
    Employee[] arr = new Employee[5];
    arr[0] = new Employee("abc","ab",12,300);
    arr[1] = new Employee("def","ef",23,300);
    arr[2] = new Employee("ghi","cd",34,300);
    arr[3] = new Employee("gkl","ig",45,300);
    arr[4] = new Employee("mno","gh",56,300);
    Scanner isodos = new Scanner(System.in);
    boolean sinexia=true;
    do{
    System.out.println("Dose 1 gia anazitisi me eponimo");
    System.out.println("Dose 2 gia anazitisi me kodiko");
    System.out.println("H 0 gia eksodo");
    int epilogi = isodos.nextInt();
    isodos.nextLine();
    switch(epilogi){
        case 0:
            System.out.println("Exodos...");
            sinexia=false;
            break;
        case 1: try{
            System.out.println("Dose eponimo gia anazitisi");
            int thesiAnazitisEponimo= MyUtils.AnazitisiMeEpwnymo(arr,isodos.nextLine());
            System.out.println(arr[thesiAnazitisEponimo].toString());
            break;}
        catch(Exception e){
            System.out.println("Den brethike");
            break;}
        case 2: try{
                MyUtils.bSort(arr,arr.length);
                System.out.println("Dose kodiko gia diadiki anazitisi");
                int AnadromikiAnazitisiKodikou=MyUtils.AnadromikiAnazitisiMeKodiko(arr,0,arr.length,(int)isodos.nextLong());
                System.out.println(arr[AnadromikiAnazitisiKodikou].toString());
                break;}
        catch(Exception e){
            System.out.println("Den brethike");
            break;}
        default: System.out.println("Lathos epilogi");
        break;   
    }
    }while(sinexia);
    }
}


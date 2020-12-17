package com.kastik.ergasia1;
public class TestAntiprosopoi {
    public static void main(String args[]){
        Antiprosopoi_Poliseon arr[] = new Antiprosopoi_Poliseon[3];
        arr[0]= new Antiprosopos_Athinas("Papas",400,1,200,50);
        arr[1]= new Antiprosopos_Salonikis("Papado",700,0,200);
        arr[2]= new Antiprosopos_OtherCity("Nabrozi",200,1);
        for(int i=0; i<3; i++){
        System.out.println(arr[i].toString()); 
        arr[i].TelikoPosoPromitheias(); //h methodos telikoPosoPromithias() ine void kai den mporei na mpei stin toString()
        }
//              ### Paralagi 1 Ektiposi tis polis me xrisi tis instance of###
        System.out.println("\n###Arxi tis instanceof###");
        for(int i=0; i<arr.length; i++){
            if(arr[i] instanceof Antiprosopos_Athinas){
                System.out.println("\nO/H "+arr[i].getEponimo()+"Einai apo Athina");
            }
            else if(arr[i] instanceof Antiprosopos_Salonikis){
                System.out.println("O/H "+arr[i].getEponimo()+"Einai apo Thessaloniki");
            }
            else{
                System.out.println("O/H "+arr[i].getEponimo()+"Einai apo Ali poli");
            }
        }
    
        //               ### Paralagi 2 me Obj factory###
        int objNum;
        do{
        System.out.println("\nDose ton arithmo obj pou thes na dimiourgisis h 0 gia exit");
        objNum=UserInput.getInteger();
        }while(objNum<0);
        Antiprosopoi_Poliseon[] arr2 = new Antiprosopoi_Poliseon[objNum];
        int typosNeouAntiprosopou;
        for(int i=0; i<objNum; i++){
           do{
           System.out.println("Dose 1 gia antiprosopo Athinas\n2 Gia thessalonikis\nh 3 gia allo");
           typosNeouAntiprosopou = UserInput.getInteger();
           }while(typosNeouAntiprosopou!=1 && typosNeouAntiprosopou !=2 && typosNeouAntiprosopou !=3);
           arr2[i]=ObjFactory.neoObj(typosNeouAntiprosopou);
        }
        for(int i=0; i<objNum; i++){
            System.out.println("\nKenourgio obj"+i);
            System.out.println(arr2[i].toString());
            arr[i].TelikoPosoPromitheias(); //h methodos telikoPosoPromithias() ine void kai den mporei na mpei stin toString()
        }
    }
}
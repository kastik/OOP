package com.kastik.theoerg1;
public class MyUtils {
    public static int numOfBoats=0; //Metritis dimiourgimenon skafon
    public static void seqSearch(double x,Vessel[] arr){
        boolean found_any=false;
        for(int i=0; i<numOfBoats; i++){
            if(arr[i].getEktopisma()==x){
                System.out.println(arr[i].toString());
                found_any=true;
            }
        }
        if(!found_any){
                System.out.println("Den brethike");
        }
    }
    public static void seqSearch(int x,Vessel[] arr){
        boolean found_any = false;
        for(int i=0; i<numOfBoats; i++){
            if(arr[i].getEtos()==x){
                System.out.println(arr[i].toString());
                found_any = true;
            }
        }
        if(!found_any){
            System.out.println("Den brethikan skafi");
        }
    }
    public static int seqSearch(String x,Vessel[] arr){
        for(int i=0; i<numOfBoats; i++){
            if(arr[i].getName().equals(x)){
                return i;
            }
        }
        return -1;
    }
    public static int binSearch(Vessel[] arr, int begin, int end, String x){
        if (begin < end) {
            int middle = begin + (end - begin) / 2;
            if(x.equals(arr[middle].getName())) {
                return binSearch(arr, begin, middle, x);
            } 
            else if (x.equals(arr[middle].getName())) {
                return binSearch(arr, middle+1, end, x);
            }
            else {
                return middle;
            }
        }
    return -1;
    }
    public static int binSearch(Vessel[] arr, int begin, int end, double x){
        if (begin < end) {
            int middle = begin + (end - begin) / 2;
            if(x<arr[middle].getEktopisma()){
                return binSearch(arr, begin, middle, x);
            } 
            else if (x>(arr[middle].getEktopisma())) {
                return binSearch(arr, middle+1, end, x);
            }
            else {
                return middle;
            }
        }
    return -1;
    }
    public static int binSearch(Vessel[] arr, int begin, int end, int x){
        if (begin < end) {
            int middle = begin + (end - begin) / 2;
            if(x<arr[middle].getEtos()){
                return binSearch(arr, begin, middle, x);
            } 
            else if (x>(arr[middle].getEtos())) {
                return binSearch(arr, middle+1, end, x);
            }
            else {
                return middle;
            }
        }
    return -1;
    }
    public static void build(Vessel[] arr){
        double temp;
        System.out.println("Dose onoma skafous");
        String name=UserInput.getString();
        System.out.println("Dose Onoma Katoxou");
        String owner_name=UserInput.getString();
        do{
        System.out.println("Dose mikos");
        temp=UserInput.getDouble();
        }while(temp<0 && temp>1000);
        double mikos=temp;
        System.out.println("Dose platos");
        double platos=UserInput.getDouble();
        System.out.println("Dose max speed");
        double max_speed= UserInput.getDouble();
        System.out.println("Dose to etos kataskevis");
        int etos_kataskevis=UserInput.getInteger();
        do{
        System.out.println("Dose to ektopisma");
        temp=UserInput.getDouble();
        }while(temp<0 && temp>150000);
        double ektopisma=temp;
        arr[numOfBoats] = new Vessel(name,owner_name,mikos,platos,max_speed,etos_kataskevis,ektopisma);
        numOfBoats=numOfBoats+1; //Metritis dimiourgimenon skafon
    }
    public static void printArray(Vessel[] arr){
        for(int i=0; i<numOfBoats; i++){
            System.out.println(arr[i].toString());
                }
    }
    public static void megMikos(Vessel[] arr){
        double max=arr[0].getMikos();
        int thesi_max=0;
        for(int i=1; i<numOfBoats; i++){
            if(arr[i].getMikos()>max){
                max=arr[i].getMikos();
                thesi_max=i;
            }
        }
        System.out.println(arr[thesi_max].toString());
    }
    public static void AnazitisiMeOnoma(Vessel[] arr){
        System.out.println("    Lista epilogon\n1. Siriaki Anazitisi(Prosoxi o pinakas prepei na einai taxinomimenos\n2. Diadiki Anazitisi\n3. Epistrofi\n  Doste epilogi (1-3):");
        try{    
            switch(UserInput.getInteger()){
                case 1:
                    System.out.println("Dose onoma skafous");
                    seqSearch(UserInput.getString(),arr);
                    return;
                case 2:
                    System.out.println(arr[binSearch(arr,0,numOfBoats,UserInput.getString())].toString());
                    return;
                default:
                    return;
            }
        }catch(Exception ArrayIndexOutOfBoundsException){
            System.out.println("\nDen brethike");
            return;
        }
    }
    public static void AnazitisiMeEtos(Vessel[] arr){
        System.out.println("    Lista epilogon\n1. Siriaki Anazitisi\n2. Diadiki Anazitisi\n3. Epistrofi\n  Doste epilogi (1-3):");
        try{
            switch(UserInput.getInteger()){
                case 1:
                  System.out.println("Dose To etos kataskevis");
                      seqSearch(UserInput.getInteger(),arr);
                    return;
               case 2:
                    System.out.println(arr[binSearch(arr,0,numOfBoats,UserInput.getInteger())].toString());
                    return;
                default: 
                    return;
            }
        }catch(Exception ArrayIndexOutOfBoundsException){
            System.out.println("Den brethike");
            return;
        }
    }
    public static void AnazitisiMeEktopisma(Vessel[] arr){
        System.out.println("    Lista epilogon\n1. Siriaki Anazitisi\n2. Diadiki Anazitisi\n3. Epistrofi\n  Doste epilogi (1-3):");
        try{
            switch(UserInput.getInteger()){
                case 1:
                    System.out.println("Dose To Ektopisma ");
                    seqSearch(UserInput.getDouble(),arr);
                    return;
                case 2:
                    System.out.println(arr[binSearch(arr,0,numOfBoats,UserInput.getDouble())].toString());
                    return;
                default:
                    return;
            }
        }catch(Exception ArrayIndexOutOfBoundsException){
            System.out.println("Den brethike");
            return;
        }
    }
    
    public static void menu(Vessel[] arr){
        boolean exit = false;
        while(!exit){
            System.out.println("    Lista epilogon\n1. Eisagogi Stoixion Skafous\n2. Emfanisi Stixion Skafous\n3. Emfanisi Olou tou Pinaka\n4. Telos\n  Doste epilogi (1-4):");
            switch(UserInput.getInteger()){
                case 1:
                    build(arr); //ftiaxnei ena antikimeno tin fora
                    break;
                case 2:
                    System.out.println("    Lista epilogon\n1. Onoma Skafous\n2. Etos kataskevis \n3. Ektopisma\n4. Megisto mikos Skafous\n5.Epistrofi stin arxiki lista\n  Doste epilogi (1-5):");
                    switch(UserInput.getInteger()){
                        case 1:
                            AnazitisiMeOnoma(arr);
                            break;
                        case 2:
                            AnazitisiMeEtos(arr);
                            break;
                        case 3:
                            AnazitisiMeEktopisma(arr);
                            break;
                        case 4:
                            megMikos(arr);
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Lathos epilogi");
                            break;
                    }
            case 3:
                printArray(arr);
                break;
            case 4: 
                exit=true;
                break;
            default:
                System.out.println("Lathos epilogi");
            }
        }
    }
    
    public static void main(String[] args){
        Vessel arr[] = new Vessel[10];
        menu(arr);
    }
}

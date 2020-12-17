//H main() Briskete sto telos aftou tou arxeiou 
package com.kastik.theoerg2;
public class MyUtils {
    
    public static int numOfBoats=0; //Metritis dimiourgimenon skafon
    public static boolean isSortedByName=false; 
    public static boolean isSortedByYear=false;
    public static boolean isSortedByEktopisma=false;
    
    public static int seqSearch(double x,Vessel[] arr){
        for(int i=0; i<numOfBoats; i++){
            if(arr[i].getEktopisma()==x){
                return i;
            }
        }
    return -1;
    }
    
    public static int seqSearch(int x,Vessel[] arr){
        for(int i=0; i<numOfBoats; i++){
            if(arr[i].getEtos()==x){
                return i;
            }
        }
    return -1;
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
    
    public static void bubbleSort(Vessel[] arr,int x){
        int n = numOfBoats;
        Vessel temp;
        for(int i=0; i<n; i++){  
            for(int j=1; j<(n-i); j++){  
                if(arr[j-1].getEtos()>arr[j].getEtos()){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;
                }
            }
        }
    isSortedByName=false; 
    isSortedByYear=true;
    isSortedByEktopisma=false;
    }
    
    public static void bubbleSort(Vessel[] arr,String x){
        int n = numOfBoats;
        Vessel temp;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1].getName().compareTo(arr[j].getName())>1){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;
                }
            }
        }
    isSortedByName=true; 
    isSortedByYear=false;
    isSortedByEktopisma=false;
    }
    
    public static void bubbleSort(Vessel[] arr,double x){
        int n = numOfBoats;
        Vessel temp;
        for(int i=0; i<n; i++){  
            for(int j=1; j<(n-i); j++){  
                if(arr[j-1].getEktopisma()>arr[j].getEktopisma()){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;
                }
            }
        }
    isSortedByName=false; 
    isSortedByYear=true;
    isSortedByEktopisma=true;
    }
    
    public static void insertionSort(Vessel[] arr,int x){
        for (int i=1; i < numOfBoats; i++) {
            Vessel current = arr[i];
            int j=i;
            while (j>0 && arr[j-1].getEtos() > current.getEtos()) {
                arr[j] = arr[j-1];
                j--;}
                arr[j] = current;
        }
    isSortedByName=false; 
    isSortedByYear=true;
    isSortedByEktopisma=false;
    }
    
    public static void insertionSort(Vessel[] arr,String x){
        for (int i=1; i < numOfBoats; i++) {
            Vessel current = arr[i];
            int j=i;
            while (j>0 && arr[j-1].getName().compareTo(current.getName())>0) {
                arr[j] = arr[j-1];
                j--;}
                arr[j] = current;
        }
    isSortedByName=true; 
    isSortedByYear=false;
    isSortedByEktopisma=false;
    }
    
    public static void insertionSort(Vessel[] arr,double x){
        for (int i=1; i < numOfBoats; i++) {
            Vessel current = arr[i];
            int j=i;
            while (j>0 && arr[j-1].getEktopisma() > current.getEktopisma()) {
                arr[j] = arr[j-1];
                j--;}
                arr[j] = current;
        }
    isSortedByName=false; 
    isSortedByYear=false;
    isSortedByEktopisma=true;
    }
    
    public static void selectionSort(Vessel[] arr,int x){
    int pos;
    Vessel temp;
    for (int i = 0; i < numOfBoats; i++){
        pos=i;
        for (int k=i+1; k<numOfBoats; k++)
            if (arr[k].getEtos() < arr[pos].getEtos())
                pos=k;
                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp; 
        }
    isSortedByName=false; 
    isSortedByYear=true;
    isSortedByEktopisma=false;
    }
    
    public static void selectionSort(Vessel[] arr,String x){
    int pos;
    Vessel temp;
    for (int i = 0; i < numOfBoats; i++){
        pos=i;
        for (int k=i+1; k<numOfBoats; k++)
            if (arr[k].getName().compareTo(arr[pos].getName())>0)
                pos=k;
                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp; 
        }
    isSortedByName=true; 
    isSortedByYear=false;
    isSortedByEktopisma=false;
    }
    
    public static void selectionSort(Vessel[] arr,double x){
    int pos;
    Vessel temp;
    for (int i = 0; i < numOfBoats; i++){
        pos=i;
        for (int k=i+1; k<numOfBoats; k++)
            if (arr[k].getEktopisma() < arr[pos].getEktopisma())
                pos=k;
                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp; 
        }
    isSortedByName=false; 
    isSortedByYear=false;
    isSortedByEktopisma=true;
    }
    
    public static int partition(Vessel[] arr, int low, int high,int x) 
    { 
        Vessel pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j].getEtos() < pivot.getEtos()) 
            { 
                i++; 
                Vessel temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }
        Vessel temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
    public static void quickSort(Vessel[] arr, int low, int high,int x) 
    {
    isSortedByName=false; 
    isSortedByYear=true;
    isSortedByEktopisma=false;
        if (low < high) 
        {
            int pi = partition(arr, low, high,x); 
            quickSort(arr, low, pi-1,x); 
            quickSort(arr, pi+1, high,x); 
        } 
    } 
    
    public static int partition(Vessel[] arr, int low, int high,String x) 
    { 
        Vessel pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j].getName().compareTo(pivot.getName())<0) 
            { 
                i++; 
                Vessel temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }
        Vessel temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
    public static void quickSort(Vessel[] arr, int low, int high,String x) 
    {
    isSortedByName=true; 
    isSortedByYear=false;
    isSortedByEktopisma=false;
        if (low < high) 
        {
            int pi = partition(arr, low, high,x); 
            quickSort(arr, low, pi-1,x); 
            quickSort(arr, pi+1, high,x); 
        } 
    }
    public static int partition(Vessel[] arr, int low, int high,double x) 
    { 
        Vessel pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j].getEktopisma() < pivot.getEktopisma()) 
            { 
                i++; 
                Vessel temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }
        Vessel temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
    public static void quickSort(Vessel[] arr, int low, int high,double x) 
    {
    isSortedByName=false; 
    isSortedByYear=false;
    isSortedByEktopisma=true;
        if (low < high) 
        {
            int pi = partition(arr, low, high,x); 
            quickSort(arr, low, pi-1,x); 
            quickSort(arr, pi+1, high,x); 
        } 
    }
    
    public static void mergeSort(Vessel[] a, int n,int x) {
    isSortedByName=false; 
    isSortedByYear=true;
    isSortedByEktopisma=false;
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    Vessel[] l = new Vessel[mid];
    Vessel[] r = new Vessel[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid,x);
    mergeSort(r, n - mid,x);
 
    merge(a, l, r, mid, n - mid);
}
    public static void merge(
  Vessel[] a, Vessel[] l, Vessel[] r, int left, int right) {
  
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i].getEtos() <= r[j].getEtos()) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
    public static void mergeSort(Vessel[] a, int n,String x) {
    isSortedByName=true; 
    isSortedByYear=false;
    isSortedByEktopisma=false;
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    Vessel[] l = new Vessel[mid];
    Vessel[] r = new Vessel[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid,x);
    mergeSort(r, n - mid,x);
 
    merge(a, l, r, mid, n - mid,x);
}
    public static void merge(
  Vessel[] a, Vessel[] l, Vessel[] r, int left, int right,String x) {
  
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i].getName().compareTo(r[j].getName())>0) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
    public static void mergeSort(Vessel[] a, int n,double x) {
    isSortedByName=false; 
    isSortedByYear=false;
    isSortedByEktopisma=true;
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    Vessel[] l = new Vessel[mid];
    Vessel[] r = new Vessel[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid,x);
    mergeSort(r, n - mid,x);
 
    merge(a, l, r, mid, n - mid,x);
}
    public static void merge(
  Vessel[] a, Vessel[] l, Vessel[] r, int left, int right,double x) {
  
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i].getEktopisma() <= r[j].getEktopisma()) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
    public static void mainMenu(Vessel[] arr){
        boolean exit = false;
        while(!exit){
            System.out.println("    Lista epilogon\n1. Eisagogi Stoixion Skafous\n2. Emfanisi Stixion Skafous\n3. Taxinomisi skafon\n4. Emfanisi Olou tou Pinaka\n5. Telos\n  Doste epilogi (1-4):");
            switch(UserInput.getInteger()){
                case 1:
                    BoatBuild(arr); //ftiaxnei ena antikimeno tin fora
                    break;
                case 2:
                    if(numOfBoats!=0){
                        menuAnazitisis(arr);
                        break;
                    }
                    else{
                        System.out.println("O pinakas ine adios");
                    }
                case 3:
                    if(numOfBoats!=0){
                        MenuTaxinomisis(arr);
                        break;
                    }
                    else{
                        System.out.println("O pinakas ine adios");
                    }
                case 4:
                    if(numOfBoats!=0){
                        printArray(arr);
                        break;
                    }
                    else{
                        System.out.println("O pinakas ine adios");
                    }
                case 5: 
                    exit=true;
                    break;
                default:
                    System.out.println("Lathos epilogi");
                    break;
            }
        }
    }
    
    public static void menuAnazitisis(Vessel[] arr){
        System.out.println("\n1. Onoma Skafous\n2. Etos Kataskevis\n3. Ektopisma\n4. Megisto Mikos\n5. Epistrofi Stin Arxiki Lista");
        while(true){
            switch(UserInput.getInteger()){
                case 1:
                    System.out.println("Dose onoma skafous pros anazitisi");
                    if(isSortedByName){
                        try{
                            System.out.println(arr[binSearch(arr,0,numOfBoats,UserInput.getString())].toString());
                            return;
                        }
                        catch(Exception IndexOutofbounds){
                            System.out.println("Den brethike");
                            return;
                        }
                    }
                    else{
                        try{
                            System.out.println(arr[seqSearch(UserInput.getString(),arr)].toString());
                            return;
                        }
                        catch(Exception IndexOutofbounds){
                            System.out.println("Den brethike");
                            return;
                        }
                    }
                case 2:
                    System.out.println("Dose xronologia skafous pros anazitisi");
                    if(isSortedByYear){
                        try{
                            System.out.println(arr[binSearch(arr,0,numOfBoats,UserInput.getInteger())].toString());
                            return;
                        }
                        catch(Exception IndexOutofbounds){
                            System.out.println("Den brethike");
                            return;
                        }
                    } 
                    else{
                        try{
                            System.out.println(arr[seqSearch(UserInput.getInteger(),arr)]);
                            return;
                        }
                        catch(Exception IndexOutofbounds){
                            System.out.println("Den brethike");
                            return;
                        }
                    }
                case 3:
                    System.out.println("Dose ektopisma skafous pros anazitisi");
                    if(isSortedByEktopisma){
                        try{
                            System.out.println(arr[binSearch(arr,0,numOfBoats,UserInput.getDouble())].toString());
                            return;
                        }
                        catch(Exception IndexOutofbounds){
                            System.out.println("Den brethike");
                            return;
                        }
                    }
                    else{
                        try{
                            System.out.println(arr[seqSearch(UserInput.getDouble(),arr)]);
                            return;
                        }
                        catch(Exception IndexOutofbounds){
                            System.out.println("Den brethike");
                            return;
                        }
                    }
                case 4:
                    megMikos(arr);
                    return;
                case 5:
                    return;
                default:
                    System.out.println("Lathos Epilogi");
            }
        }
    }
    
    public static void MenuTaxinomisis(Vessel[] arr){
        while(true){
            System.out.println("    Epilogi pediou taxinomisis\n1. Onoma Skafous\n2. Etos Kataskevis\n3. Ektopisma\n4. Epistrofi Stin Arxiki Lista");
            switch(UserInput.getInteger()){
                case 1:
                    while(true){
                        System.out.println("Epilogi Methodou\n1. Bubble Sort\n2. Taxinomisi Me isagogi\n3. Taxinomisi me epilogi\n4. Grigori Taxinomisi\n5. Taxinomisi me sinxonefsi\n6. Epistrofi Stin epilogi Pediou Taxinomisis");
                        switch(UserInput.getInteger()){
                            case 1:
                                bubbleSort(arr,"");
                                return;
                            case 2:
                                insertionSort(arr,"");
                                return;
                            case 3:
                                selectionSort(arr,"");
                                return;
                            case 4:
                                quickSort(arr,0,numOfBoats-1,"");
                                return;
                            case 5:
                                mergeSort(arr,numOfBoats-1,"");
                                return;
                            case 6:
                                MenuTaxinomisis(arr);
                                return;
                            default:
                                System.out.println("Lathos epilogi");
                        }
                    }
                case 2:
                    while(true){
                        System.out.println("Epilogi Methodou\n1. Bubble Sort\n2. Taxinomisi Me isagogi\n3. Taxinomisi me epilogi\n4.Grigori Taxinomisi\n5. Taxinomisi me sinxonefsi\n6. Epistrofi Stin epilogi Pediou Taxinomisis");
                        switch(UserInput.getInteger()){
                            case 1:
                                bubbleSort(arr,0);
                                return;
                            case 2:
                                insertionSort(arr,0);
                                return;
                            case 3:
                                selectionSort(arr,0);
                                return;
                            case 4:
                                quickSort(arr,0,numOfBoats-1,0);
                                return;
                            case 5:
                                mergeSort(arr,numOfBoats-1,0);
                                return;
                            case 6:
                                MenuTaxinomisis(arr);
                                return;
                            default:
                                System.out.println("Lathos epilogi");
                        }
                    }
                case 3:
                    while(true){
                    System.out.println("Epilogi Methodou\n1. Bubble Sort\n2. Taxinomisi Me isagogi\n3. Taxinomisi me epilogi\n4.Grigori Taxinomisi\n5. Taxinomisi me sinxonefsi\n6. Epistrofi Stin epilogi Pediou Taxinomisis");
                        switch(UserInput.getInteger()){
                            case 1:
                                bubbleSort(arr,0f);
                                return;
                            case 2:
                                insertionSort(arr,0f);
                                return;
                            case 3:
                                selectionSort(arr,0f);
                                return;
                            case 4:
                                quickSort(arr,0,numOfBoats-1,0f);
                                return;
                            case 5:
                                mergeSort(arr,numOfBoats-1,0f);
                                return;
                            case 6:
                                MenuTaxinomisis(arr);
                                return;
                            default:
                                System.out.println("Lathos epilogi");
                        }
                    }
                    case 4:
                        return;
                    default:
                        System.out.println("Lathos epilogi");
            }
        }
    }
    
    public static void BoatBuild(Vessel[] arr){
        if(numOfBoats<10){
            String name,owner_name;
            double mikos,platos,max_speed,ektopisma;
            int etos_kataskevis;
            System.out.println("Dose onoma skafous");
            name=UserInput.getString();
            System.out.println("Dose Onoma Katoxou");
            owner_name=UserInput.getString();
            do{
                System.out.println("Dose mikos");
                mikos=UserInput.getDouble();
            }while(mikos<0 || mikos>1000 || mikos==-1); //H UserInput dini -1 se periptosi pou dothi String anti arithmou
            do{
                System.out.println("Dose platos");
                platos=UserInput.getDouble();
            }while(platos==-1);
            do{
                System.out.println("Dose max speed");
                max_speed= UserInput.getDouble();
            }while(max_speed==-1);
            do{
                System.out.println("Dose to etos kataskevis");
                etos_kataskevis=UserInput.getInteger();
            }while(etos_kataskevis==-1);
            do{
                System.out.println("Dose to ektopisma");
                ektopisma=UserInput.getDouble();
            }while(ektopisma<0 || ektopisma>150000 || ektopisma==-1);
            arr[numOfBoats] = new Vessel(name,owner_name,mikos,platos,max_speed,etos_kataskevis,ektopisma);
            numOfBoats=numOfBoats+1; //Metritis dimiourgimenon skafon
            isSortedByName=false; //Ginontai pla reset se periptosi dimiourgias neou antikimenou
            isSortedByYear=false;
            isSortedByEktopisma=false;
        }
        else{
            System.out.println("\nH lista exi ftasei sto megisto megethos (10)");
        }
    }
    
    public static void megMikos(Vessel[] arr){
        double max=arr[0].getMikos();
        int thesi_max=0;
        for(int i=0; i<numOfBoats; i++){
            if(arr[i].getMikos()>max){
                max=arr[i].getMikos();
                thesi_max=i;
            }
        }
        System.out.println(arr[thesi_max].toString());
    }
    
    public static void printArray(Vessel[] arr){
        for(int i=0; i<numOfBoats; i++){
            System.out.println(arr[i].toString());
        }
    }
    public static void main(String[] args){
        Vessel arr[] = new Vessel[10];
        MyUtils.mainMenu(arr);
    }
}

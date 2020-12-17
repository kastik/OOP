package com.kastik.askisi4;
public class MyUtils {
    public static int AnazitisiMeEpwnymo(Employee[] arr,String a){
        for(int i=0; i<arr.length; i++){
            if(arr[i].getEponimo().equals(a)){
                return i;}
            }
        return -1;
        }
    public static int AnazitisiMeKodiko(Employee[] arr, Long kodikos){
        for (int i=0; i<arr.length; i++){
            if(arr[i].getKodikos()==kodikos){
                return i;
            }}
        return -1;
    }
    public static int AnadromikiAnazitisiMeKodiko(Employee[] arr, int arxi, int telos, int kodikos) {
        if (arxi<telos){
            int mesi=arxi+(telos-arxi)/2;
            if (kodikos < arr[mesi].getKodikos()){
                return AnadromikiAnazitisiMeKodiko(arr,arxi,mesi,kodikos);}
            else if(kodikos > arr[mesi].getKodikos()){
                return AnadromikiAnazitisiMeKodiko(arr, mesi+1,telos,kodikos);}
            else{
                return mesi;}}
        return -1;}
    static void bSort(Employee[] arr, int n) 
    {
        if (n == 1){
            return;}
        else{
            for (int i=0; i<n-1; i++) 
                if (arr[i].getKodikos() > arr[i+1].getKodikos()){
                    Employee temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp;}}
        bSort(arr, n-1); 
    }
}
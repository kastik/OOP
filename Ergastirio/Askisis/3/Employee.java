
public class Employee {
    public String onoma,eponimo;
    public long afm;
    public double misthos;
    Employee(String onoma,String eponimo,long afm, double misthos){
        this.onoma=onoma;
        this.eponimo=eponimo;
        this.afm=afm;
        this.misthos=misthos;
    }
    public String getOnoma(){
        return onoma;
    }
    public String getEponimo(){
        return eponimo;
    }
    public Long getAfm(){
        return afm;
    }
    public double getMisthos(){
        return misthos;
    }
    @Override
    public String toString(){
        return onoma+" " +eponimo+" " +afm+" "+misthos;
    }
        public static class MyUtils {
    public static int AnazitisiMeEpwnymo(Employee[] arr,String a){
        for(int i=0; i<arr.length; i++){
            if(arr[i].getOnoma().equals(a)){
                return i;}
            }
        return -1;
        }
    public static int AnazitisiMeAFM(Employee[] arr, Long afm){
         for (int i=0; i<arr.length; i++)
             if(arr[i].getAfm().equals(afm)){
                 return i;
             }
         return -1;
     }
    public static int AnadromikiAnazitisiMeAFM(Employee[] arr,int arxi,int telos, int x){
        if(arxi<telos){
            int mesi = arxi+(telos-arxi)/2;
            if(x<arr[mesi].getAfm()){
                return AnadromikiAnazitisiMeAFM(arr,arxi,mesi,x);
            }
            else if(x>arr[mesi].getAfm()){
                return AnadromikiAnazitisiMeAFM(arr,mesi+1,telos,x);
            }
            else{
                return mesi;
            }
        }
        else{
        return -1;
        }
    }
    }
}
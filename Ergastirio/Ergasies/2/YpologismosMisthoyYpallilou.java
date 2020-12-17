public class YpologismosMisthoyYpallilou {
    public static void main(String[] args){
        System.out.println("Dose n gia dimiourgia objs");
        Employee[] arr = new Employee[UserInput.getInteger()];
        for(int i=0; i<arr.length; i++){
            arr[i]=Factory.factory();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }
}

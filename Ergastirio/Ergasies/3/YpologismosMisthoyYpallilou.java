public class YpologismosMisthoyYpallilou {
    public static void main(String[] args)throws PayTypeException,BonusException{
        System.out.println("Dose n gia dimiourgia objs");
        Employee[] arr = new Employee[UserInput.getInteger()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Factory.factory(); //Throws PayTypeException
        }
        // Print Array
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }
}

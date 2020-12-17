package Askisi_1;
public class Main {
    public static void main(String[] args){
        System.out.println("Dose N arithmo mathimaton");
        Course[] arr = new Course[UserInput.getInteger()];
        for(int i=0; i<arr.length; i++){
            System.out.println("Dose 1 gia theoritiko,2 gia ergastirio,3 gia mikto h 4 gia mikto me ergasia");
            switch(UserInput.getInteger()){
                case 1:
                    System.out.println("Dose to onoma mathimatos,ton bathmo ergasias kai ton bathmo eksetasis");
                    arr[i]=new Theoritiko(UserInput.getString(),UserInput.getFloat(),UserInput.getFloat());
                    continue;
                case 2:
                    System.out.println("Dose ton bathmo ergastiriou");
                    arr[i]=new Ergastiriako(UserInput.getString(),UserInput.getFloat());
                    continue;
                case 3:
                    System.out.println("Dose ton bathmo theorias, bathmo ergastiriou");
                    arr[i]=new Meikto(UserInput.getString(),UserInput.getFloat(),UserInput.getFloat());
                    continue;
                case 4:
                    System.out.println("Dose ton bathmo theorias,ergastiriou,ergasias");
                    arr[i]=new MeiktoMeErgasia(UserInput.getString(),UserInput.getFloat(),UserInput.getFloat(),UserInput.getFloat());
                    continue;
                default:
                    i=i-1;
                    System.out.println("Lathos epilogi");
            }
        }
    }
}

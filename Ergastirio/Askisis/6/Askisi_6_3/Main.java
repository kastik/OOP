package Askisi_6_3;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        System.out.println("Dose n stixia gia dimiourgia");
        GeometricObject objs[] = new GeometricObject[UserInput.getInteger()];
        Random rand = new Random();
        for(int i=0; i<(int)(0.4*objs.length); i++){
            System.out.println("Dimiourgia Rectangle Dose xroma");
            objs[i] = new Rectangle(rand.nextInt(),rand.nextInt(),UserInput.getString(),rand.nextBoolean());
        }
        for(int i=(int)(0.4*objs.length); i<(int)(0.7*objs.length); i++){
            System.out.println("Dimiourgia Circle Dose xroma");
            objs[i] = new Circle(rand.nextDouble(),UserInput.getString(),rand.nextBoolean());
        }
        for(int i=(int)(0.7*objs.length); i<objs.length; i++){
            System.out.println("Dimiourgia Cylinder Dose xroma");
            objs[i] = new Cylinder(rand.nextInt(),rand.nextDouble(),rand.nextBoolean(),UserInput.getString());
        }
        for(int i=0; i<objs.length; i++){
            System.out.println(objs[i].toString());
        }
    }
}

package Askisi_6_1;
import java.util.Random; 
public class Main {
    
    public static void main(String[] args){
        System.out.println("Dose n stixia gia dimiourgia");
        Katoikia spiti[] = new Katoikia[UserInput.getInteger()];
        Random rand = new Random();
        for(int i=0; i<((6.0/spiti.length)*10); i++){
            spiti[i] = new Diamerisma(rand.nextInt(2),rand.nextInt(6),rand.nextDouble()*100,"Tsimiski "+(i+1),rand.nextDouble()*100);
        }
        for(int i=(int)((6.0/spiti.length)*10); i<((6.0/spiti.length)*10)+((2.0/spiti.length)*10); i++){
            spiti[i] = new Diamerisma(rand.nextInt(2),rand.nextInt(6),rand.nextDouble()*100,"Tsimiski "+(i+1),rand.nextDouble()*100);
        }
        for(int i=(int)((8.0/spiti.length)*10); i<spiti.length; i++){
            spiti[i] = new Diamerisma(rand.nextInt(2),rand.nextInt(6),rand.nextDouble()*100,"Tsimiski "+(i+1),rand.nextDouble()*100);
        }
        for(int i=0; i<spiti.length; i++){
            System.out.println(spiti[i].toString());
        }
    }
}

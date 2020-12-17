package Askisi_1;
public class Meikto extends Course{
    float bath_theorias,bath_ergastiriou;
    Meikto(String courseName,float bath_ergasias,float bath_exetasis){
        super(courseName);
        this.bath_theorias=bath_theorias;
        this.bath_ergastiriou=bath_ergastiriou;
    }
    public float TelikosVathmos(){
        return((0.6f*bath_theorias)+(0.4f*bath_ergastiriou));
    }
}

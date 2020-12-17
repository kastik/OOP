package Askisi_1;
public class Ergastiriako extends Course{
    float bath_exetasis;
    Ergastiriako(String courseName,float bath_exetasis){
        super(courseName);
        this.bath_exetasis=bath_exetasis;
    }
    public float TelikosVathmos(){
        return(bath_exetasis);
    }
}

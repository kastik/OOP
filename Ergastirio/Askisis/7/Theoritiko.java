package Askisi_1;
public class Theoritiko extends Course{
    float bath_ergasias,bath_exetasis;
    Theoritiko(String courseName,float bath_ergasias,float bath_exetasis){
        super(courseName);
        this.bath_ergasias=bath_ergasias;
        this.bath_exetasis=bath_exetasis;
    }
    @Override
    public float TelikosVathmos(){
        return((0.7f*bath_ergasias)+(0.3f*bath_exetasis));
    }
}

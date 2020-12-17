package Askisi_1;
public class MeiktoMeErgasia extends Course{
    float bath_theorias,bath_ergastiriou,bath_ergasias;
    MeiktoMeErgasia(String courseName,float bath_theorias,float bath_ergastiriou,float bath_ergasias){
        super(courseName);
        this.bath_ergasias=bath_ergasias;
        this.bath_ergastiriou=bath_ergastiriou;
        this.bath_theorias=bath_theorias;
    }
    @Override
    public float TelikosVathmos(){
        return((0.4f*bath_theorias)+(0.4f*bath_ergastiriou)+(0.2f*bath_ergasias));
    }
}

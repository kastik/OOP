public class Oromisthios extends Employee implements iOromisthios{
    private double ores_ergasias,oromisthio;
    Oromisthios(String eponymia,double ores_ergasias,double oromisthio){
        super(eponymia,1);


        this.ores_ergasias=ores_ergasias;
        this.oromisthio=oromisthio;
    }
    @Override
    public void Katharos_Oromisthiou(){
        System.out.println("Katharos Misthos: "+(ores_ergasias*oromisthio-(ores_ergasias*oromisthio)*0.10));
    }
    @Override
    public String getPayType(){
        return "Oromisthios";
    }
}

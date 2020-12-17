public class Symvasiouhos extends Employee implements  iSymvasiouhos{
    double akatharistos,kratiseis;
    int Diarkeia_symvasis;
    Symvasiouhos(String eponymia,double akatharistos,double kratiseis,int Diarkeia_symvasis){
        super(eponymia,2);
        this.akatharistos=akatharistos;
        this.kratiseis=kratiseis;
        this.Diarkeia_symvasis=Diarkeia_symvasis;
    }
    @Override
    public void Katharos_Symvasiouhou(){
        System.out.println("Katharos Misthos: "+(akatharistos-kratiseis-(akatharistos-kratiseis)*Diarkeia_symvasis/100));
    }
    @Override
    public String getPayType(){
        return "Symvasiouhos";
    }
}

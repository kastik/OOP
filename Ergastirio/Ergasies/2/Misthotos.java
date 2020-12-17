public class Misthotos extends Employee implements  iMisthotos{
    double akatharistos,kratiseis,bonus_paidion;

    public Misthotos(String eponymia,double akatharistos,double kratiseis,double bonus_paidion){
        super(eponymia,0);
        this.akatharistos=akatharistos;
        this.kratiseis=kratiseis;
        this.bonus_paidion=bonus_paidion;
    }
    @Override
    public void Katharos_Misthotou(){
        System.out.println("Katharos Misthos: "+(akatharistos-kratiseis+bonus_paidion));
    }
    @Override
    public String getPayType(){
        return "Misthotos";
    }

}

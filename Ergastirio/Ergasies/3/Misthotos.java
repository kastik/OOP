public class Misthotos extends Employee implements  iMisthotos{
    private double akatharistos,kratiseis,bonus_paidion;
    private boolean bonus;

    public Misthotos(String eponymia,double akatharistos,double kratiseis,double bonus_paidion){
        super(eponymia,0);
        this.akatharistos=akatharistos;
        this.kratiseis=kratiseis;
        this.bonus_paidion=bonus_paidion;
        if(bonus_paidion<=0){
            bonus=false;
        }
        else{
            bonus=true;
        }
    }
    @Override
    public void Katharos_Misthotou(){
        try{
            if(!bonus){
                throw new BonusException("To paidio bonus einai false");
            }
            else{
                System.out.println("Katharos Misthos: "+(akatharistos-kratiseis+bonus_paidion));
            }
        }catch(BonusException BonusException){
            System.out.println("Katharos Misthos: "+(akatharistos-kratiseis));
        }
    }
    @Override
    public String getPayType(){
        return "Misthotos";
    }
    public boolean getBonus(){
        return bonus;
    }

}

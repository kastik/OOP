package Askisi_6_1;
public class Katoikia {
    private int kodikos,pl_domation;
    private double tetragonika;
    private String diefthinsi;
    Katoikia(int kodikos, int pl_domation, double tetragonika,String diefthinsi){
        this.kodikos=kodikos;
        this.pl_domation=pl_domation;
        this.tetragonika=tetragonika;
        this.diefthinsi=diefthinsi;
    }
    public String TyposSynalagis(){
        return ""; //Ginete Override Stis ypoklasis
    }
    public double Poso(){
        return -1; //Ginete Override Stis ypoklasis
    }
    public int getKodikos(){
        return kodikos;
    }
    public int getPl(){
        return pl_domation;
    }
    public double getTet(){
        return tetragonika;
    }
    public String getDie(){
        return diefthinsi;
    }
    @Override
    public String toString(){
        return "\nTypos Synalagis: " + TyposSynalagis() + "\nPlithos Domation: " + getPl()+ "\nTetragonika: " +(int)getTet()+ "\nDiefthisni: " +getDie()+ "\nTimi: "+(int)Poso();
    
    }
}

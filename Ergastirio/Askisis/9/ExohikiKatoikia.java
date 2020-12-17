public abstract class ExohikiKatoikia {
    private String TypeName,Periohi_poli;
    private int TypeId,NrOfDays,TimiHmeras;
    abstract String getEnoikioType();
    abstract double calcEnoikio();
    abstract int getDomatia();
    ExohikiKatoikia(String TypeName,String Periohi_poli,int TypeId,int NrOfDays,int TimiHmeras){
        if(this instanceof Bungalow && NrOfDays<7){
            throw new IllegalArgumentException();
        }
        else if(this instanceof Villa && NrOfDays<=30){
            throw new IllegalArgumentException();
        }
        this.TypeName=TypeName;
        this.Periohi_poli=Periohi_poli;
        this.TypeId=TypeId;
        this.NrOfDays=NrOfDays;
        this.TimiHmeras=TimiHmeras;
    }
    public int getTimiHmeras(){
        return TimiHmeras;
    }
    public int getNrOfDays(){
        return NrOfDays;
    }
    @Override
    public String toString(){
        return "\nTypos: "+TypeName+"\nPerioxi: "+Periohi_poli+"\nDomatia: "+getDomatia()+"\nTypos Enikiou: "+getEnoikioType()+"\nMeres Enikiasis: "+NrOfDays+"\nTimiHmeras: "+TimiHmeras+"\nTekiki Timi: "+calcEnoikio();
    }
}

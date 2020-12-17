public class Domatio extends ExohikiKatoikia{
    private int DomatioTypeID;
    Domatio(String Periohi_poli,int NrOfDays,int TimiHmeras,int DomatioTypeID){
        super("Domatio",Periohi_poli,1,NrOfDays,TimiHmeras);
        this.DomatioTypeID=DomatioTypeID;
    }
    @Override
    String getEnoikioType(){
        return "Day";
    }
    @Override
    double calcEnoikio(){
        return (getTimiHmeras()*getNrOfDays());
    }
    public int getDomatia(){
        return DomatioTypeID;
    }
}

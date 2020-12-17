public class Bungalow extends ExohikiKatoikia{
    private int PlithosDomation;
    Bungalow(String Periohi_poli,int NrOfDays,int TimiHmeras,int PlithosDomation){
        super("Bungalow",Periohi_poli,2,NrOfDays,TimiHmeras);
        this.PlithosDomation=PlithosDomation;
    }
    @Override
    String getEnoikioType(){
        return "Week";
    }
    @Override
    double calcEnoikio(){
        return (getTimiHmeras()*getNrOfDays());
    }
    public int getDomatia(){
        return PlithosDomation;
    }
}

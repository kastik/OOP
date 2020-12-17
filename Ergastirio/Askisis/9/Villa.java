public class Villa extends ExohikiKatoikia{
    private int PlithosDomation;
    Villa(String Periohi_poli,int NrOfDays,int TimiHmeras,int PlithosDomation){
        super("Villa",Periohi_poli,3,NrOfDays,TimiHmeras);
        this.PlithosDomation=PlithosDomation;
    }
    @Override
    String getEnoikioType(){
        return "Month";
    }
    @Override
    double calcEnoikio(){
        return ((getTimiHmeras()*getNrOfDays())*0.9); // Polaplasiasmos me to 0.9 gia na aferesoume 10%
    }
    public int getDomatia(){
        return PlithosDomation;
    }
}

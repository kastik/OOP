public class TestExohikiKatoikia {
    static int i=0;
    public static void main(String[] args){
        System.out.println("Dose n gia dimiourgia pinaka");
        ExohikiKatoikia[] arr = new ExohikiKatoikia[UserInput.getInteger()];
        System.out.println("Dimiourgia Domation");
        for(i=0; i<(arr.length*.4); i++){
            System.out.println("Dose perioxi,Imeres Enikiasis,Timi meras kai Plithos Domation");
            arr[i]= new Domatio(UserInput.getString(),UserInput.getInteger(),UserInput.getInteger(),UserInput.getInteger());
        }
        System.out.println("Dimiourgia Bungalow");
        for(int i=(int)(arr.length*.4); i<(int)(arr.length*.7); i++){
            System.out.println("Dose perioxi,Imeres Enikiasis,Timi meras kai Plithos Domation");
            arr[i]= new Bungalow(UserInput.getString(),UserInput.getInteger(),UserInput.getInteger(),UserInput.getInteger());
        }
        System.out.println("Dimiourgia Villon");
        for(int i=(int)(arr.length*.7); i<arr.length; i++){
            System.out.println("Dose perioxi,Imeres Enikiasis,Timi meras kai Plithos Domation");
            arr[i]= new Villa(UserInput.getString(),UserInput.getInteger(),UserInput.getInteger(),UserInput.getInteger());
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }
}

public class Factory {
    public static Employee factory(){
        System.out.println("Dimiourgia objs");
        int epilogi;
        do {
            System.out.println("1:Misthotos 2:Oromisthios 3:Symvasiouhos");
            epilogi= UserInput.getInteger();
            switch (epilogi) {
                case 1:
                    System.out.println("Dose eponymia, akatharisto, kratiseis kai bonus paidion");
                    return new Misthotos(UserInput.getString(), UserInput.getDouble(), UserInput.getDouble(), UserInput.getDouble());
                case 2:
                    System.out.println("Dose eponymia, ores ergasias kai oromisthio");
                    return new Oromisthios(UserInput.getString(), UserInput.getDouble(), UserInput.getDouble());
                case 3:
                    System.out.println("Dose eponymia, akatharisto mistho, kratiseis kai diarkeia symvasis");
                    return new Symvasiouhos(UserInput.getString(), UserInput.getDouble(), UserInput.getDouble(), UserInput.getInteger());
                default:
                    System.out.println("Lathos epilogi");
                    continue;
            }
        }while(epilogi<0 || epilogi>3);
        return null;
    }
}

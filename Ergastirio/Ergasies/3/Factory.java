public class Factory {
    public static Employee factory() throws PayTypeException{
        System.out.println("Dimiourgia objs");
        int epilogi;
        System.out.println("1:Misthotos 2:Oromisthios 3:Symvasiouhos");
        epilogi= UserInput.getInteger();
        switch (epilogi) {
            case 1:{
                System.out.println("Dose eponymia, akatharisto, kratiseis, bonus paidion");
                String eponymia=UserInput.getString();
                double akatharstos=UserInput.getDouble();
                if(akatharstos<=0){
                    throw new PayTypeExceptionMisthotos("O akatharistos misthos den mporei na einai <=0");
                }
                double kratiseis=UserInput.getDouble();
                if(kratiseis<=0){
                    throw new PayTypeExceptionMisthotos("Oi kratiseis den ginete na einai <0");
                }
                double bonus_paidion=UserInput.getDouble();
                return new Misthotos(eponymia,akatharstos,kratiseis,bonus_paidion);
            }
            case 2: {
                System.out.println("Dose eponymia, ores ergasias kai oromisthio");
                String eponymia = UserInput.getString();
                double ores_ergasias=UserInput.getDouble();
                if(ores_ergasias<=0){
                    throw new PayTypeExceptionOromisthios("Oi ores ergasias den mporei na einai <0");
                }
                double oromisthio=UserInput.getDouble();
                if(oromisthio<=0){
                    throw new PayTypeExceptionOromisthios("To oromisthio den mporei na einai <0");
                }
                return new Oromisthios(eponymia,ores_ergasias,oromisthio);
            }
            case 3: {
                System.out.println("Dose eponymia, akatharisto mistho, kratiseis kai diarkeia symvasis");
                String eponymia=UserInput.getString();
                double akatharistos=UserInput.getDouble();
                if(akatharistos<=0){
                    throw new PayTypeExceptionMeSymvasi("O akatharistos den mporei na einai <=0");
                }
                double kratiseis=UserInput.getDouble();
                if(kratiseis<=0){
                    throw new PayTypeExceptionMeSymvasi("Oi kratiseis den mporei na einai <=0");
                }
                int diarkia_symva=UserInput.getInteger();
                return new Symvasiouhos(eponymia,akatharistos,kratiseis,diarkia_symva);
            }
            default: {
                throw new PayTypeException("Epelekse 1, 2 H 3 gia dimiourgia typou");
            }
        }
    }
}

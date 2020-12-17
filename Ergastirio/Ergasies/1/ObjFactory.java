//                    ### Paralagi 2 Factory###
package com.kastik.ergasia1;
public class ObjFactory {
    static Antiprosopoi_Poliseon neoObj(int x){
        String eponymia;
        double posoPoliseon,exoda_diafimisis,exoda_MetakinisisTaxidion;
        int kodikos_Bonus;
        System.out.println("Dose eponimo");
        eponymia=UserInput.getString();
        System.out.println("Dose poso poliseon");
        posoPoliseon=UserInput.getDouble();
        do{
        System.out.println("Dose 1 gia bonus h 0 gia no bonus ");
        kodikos_Bonus=UserInput.getInteger();
        }while(kodikos_Bonus !=0 && kodikos_Bonus != 1);
        switch(x){
            case 1: 
                System.out.println("Dose ta dose exoda diafimisis");
                exoda_diafimisis=UserInput.getDouble();
                System.out.println("Dose ta exoda metakinisis taxidion");
                exoda_MetakinisisTaxidion=UserInput.getDouble();
                return new Antiprosopos_Athinas(eponymia,posoPoliseon,kodikos_Bonus,exoda_diafimisis,exoda_MetakinisisTaxidion);
            case 2:
                System.out.println("Dose ta exoda metakinisis taxidion");
                exoda_MetakinisisTaxidion=UserInput.getDouble();
                return new Antiprosopos_Salonikis(eponymia,posoPoliseon,kodikos_Bonus,exoda_MetakinisisTaxidion);
            case 3:
                return new Antiprosopos_OtherCity(eponymia,posoPoliseon,kodikos_Bonus);
            default:
                System.out.println("Lathos epilogi");
                return null; //Den tha xrisimopiithi ta apotelesmata filtraronte sthn main()
        }
    }
}

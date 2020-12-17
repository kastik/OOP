public abstract class Employee {
    private String eponymia;
    private int PayType;

    Employee(String eponymia, int PayType) {
        this.eponymia = eponymia;
        this.PayType = PayType;
    }

    public String getEponymia() {
        return eponymia;
    }

    @Override
    public String toString() {
        if (this instanceof Misthotos) {
            ((Misthotos) this).Katharos_Misthotou();
            return "Eponymia: " + getEponymia() + "\nPayType: " + getPayType() + "\nBonusType: " +((Misthotos)this).getBonus()+"\n";
        } else if (this instanceof Oromisthios) {
            ((Oromisthios) this).Katharos_Oromisthiou();
            return "Eponymia: " + getEponymia() + "\nPayType: " + getPayType() + "\n";
        } else {
            ((Symvasiouhos) this).Katharos_Symvasiouhou();
            return "Eponymia: " + getEponymia() + "\nPayType: " + getPayType() + "\n";
        }
    }
    abstract String getPayType();
}
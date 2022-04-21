public class Hero {
    
    private int pv;
    private double Degats;
    private double Armor;

    public Hero() {
        pv = 30;
        Degats = 5;
        Armor = 0;
    }

    public Hero(int pv, double Degats, double Armor) {
        this.pv = pv;
        this.Degats = Degats;
        this.Armor = Armor;
    }

    public Hero(int pv) {
        this.pv = pv;
    }

    public int getPv() {
        return this.pv;
    }

    public double getDegat() {
        return this.Degats;
    }

    public double getArmor() {
        return this.Armor;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setDegat(double Degats) {
        this.Degats = Degats;
    }

    public void setArmor(double Armor) {
        this.Armor = Armor;
    }

}

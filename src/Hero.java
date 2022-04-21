public class Hero {

    private int pvHero;
    private double degatHero;
    private double armorHero;

    public Hero() {
        pvHero = 30;
        degatHero = 5;
        armorHero = 0;
    }

    public Hero(int pv, double Degats, double Armor) {
        this.pvHero = pv;
        this.degatHero = Degats;
        this.armorHero = Armor;
    }

    public Hero(int pv) {
        this.pvHero = pv;
    }

    public int getPv() {
        return this.pvHero;
    }

    public double getDegat() {
        return this.degatHero;
    }

    public double getArmor() {
        return this.armorHero;
    }

    public void setPv(int pvHero) {
        this.pvHero = pvHero;
    }

    public void setDegat(double Degats) {
        this.degatHero = Degats;
    }

    public void setArmor(double Armor) {
        this.armorHero = Armor;
    }

}

public class Hero {

    private int pvHero;
    private double degatHero;
    private double armorHero;
    
    public Hero() {
        pvHero = 30;
        degatHero = 4;
        armorHero = 5;
    }

    public Hero(int pvHero, double degatHero, double armorHero) {
        this.pvHero = pvHero;
        this.degatHero = degatHero;
        this.armorHero = armorHero;
    }

    public Hero(int pvHero) {
        this.pvHero = pvHero;
    }

    public int getPvHero() {
        return this.pvHero;
    }

    public double getDegatHero() {
        return this.degatHero;
    }

    public double getArmorHero() {
        return this.armorHero;
    }

    public void setPvHero(int pvHero) {
        this.pvHero = pvHero;
    }

    public void setDegatHero(double degatHero) {
        this.degatHero = degatHero;
    }

    public void setArmorHero(double armorHero) {
        this.armorHero = armorHero;
    }

   

    public void heroAttack(Monster a) {

        double degatHero = a.getpvMonster() - (this.getDegatHero() - a.getArmorMonster());
        a.setPvMonster((int) degatHero);
        System.out.println(" Votre hero attack!! ");
        System.out.println(a);
    }

    

   
}

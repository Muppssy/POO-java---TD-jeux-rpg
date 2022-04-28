import java.util.*;

public class Hero {

    private int pvHero;
    private double degatHero;
    private double armorHero;
    private double paradHero;

    public Hero() {
        pvHero = 30;
        degatHero = 4;
        armorHero = 10;
        paradHero = armorHero;
    }

    public Hero(int pvHero, double degatHero, double armorHero, double paradHero) {
        this.pvHero = pvHero;
        this.degatHero = degatHero;
        this.armorHero = armorHero;
        this.paradHero = armorHero;
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

    public double getParadHero() {
        return this.paradHero;
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

    public void setParadHero() {
        this.paradHero = armorHero;
    }

    public void heroAttack(Monster a) {

        double degatHero = a.getpvMonster() - (this.getDegatHero() - a.getArmorMonster());
        a.setPvMonster((int) degatHero);
        System.out.println(" Votre hero attack!! ");
        System.out.println(a);
        paradHero = armorHero;
    }

    public void playGame(Monster a) {
        System.out.println(" Choisir 1 pour attaquer, Choisir 2 pour parer ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Hero attaque");
            heroAttack(a);
        }

        if (choice == 2) {
            System.out.println("Hero se defends");
            paradHero();
        }
        //  else {
        //     System.out.println("C'est 1 ou 2 tête de gland");
        //     choice = input.nextInt();
        // }

    }

    public void paradHero() {
        paradHero = armorHero * 2;
    }

    public String toString() {
        return "Pv " + pvHero + " Degats " + degatHero + " Armures " + armorHero;
    }

}

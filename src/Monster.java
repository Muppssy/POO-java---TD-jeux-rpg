import java.util.Random;

public class Monster {

    private int pvMonster;
    private double degatsMonster;
    private double monsterArmor;
    private boolean lifeMonster;
    private double paradMonster;

    public Monster() {
        pvMonster = 30;
        degatsMonster = 8;
        monsterArmor = 1;
        paradMonster = monsterArmor;
    }

    public Monster(int pvMonster, double degatsMonster, double monsterArmor, double paradMonster) {
        this.pvMonster = pvMonster;
        this.degatsMonster = degatsMonster;
        this.monsterArmor = monsterArmor;
        this.paradMonster = monsterArmor;
        this.lifeMonster = true;
    }

    public Monster(int pvMonster) {
        this.pvMonster = pvMonster;
    }

    public int getpvMonster() {
        return this.pvMonster;
    }

    public double getDegatMonster() {
        return this.degatsMonster;
    }

    public double getArmorMonster() {
        return this.monsterArmor;
    }

    public boolean getlifeMonster() {
        return this.lifeMonster;
    }

    public double getParadMonster() {
        return this.paradMonster;
    }

    public void setPvMonster(int pvMonster) {
        this.pvMonster = pvMonster;
    }

    public void setDegat(double degatMonster) {
        this.degatsMonster = degatMonster;
    }

    public void setArmor(double monsterArmor) {
        this.monsterArmor = monsterArmor;
    }

    public void setLife() {
        this.lifeMonster = true;
    }

    public void setParadMonster() {
        this.paradMonster = monsterArmor;
    }

    public void monsterPlay(Hero m) {
        Random randomMonster = new Random();
        int de = randomMonster.nextInt(20);

        if (de >= 10) {
            System.out.println("Le Monstre attaque");
            monsterAttack(m);
        }

        if (de < 10) {
            System.out.println(" Le Monstre fait  sa parade");
            monsterParade();
        }
    }

    public void monsterAttack(Hero m) {
        double degatMonster = m.getPvHero() - (this.getDegatMonster() - m.getArmorHero());

        m.setPvHero((int) degatMonster);
        System.out.println(" Le Monstre attack!! ");
        System.out.println(m);
        paradMonster = monsterArmor;

        int neg = degatMonster - m.getArmorHero();

        if (neg <= 0) {
            neg = 1;

        } 
    }

    public void monsterParade() {
        paradMonster = monsterArmor * 2;
    }

    public String toString() {
        return " Pv " + pvMonster + " Degats " + degatsMonster + " Armures" + monsterArmor;
    }

}
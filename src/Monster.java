public class Monster {

    private int pvMonster;
    private double degatsMonster;
    private double monsterArmor;
    private boolean lifeMonster;

    public Monster() {
        pvMonster = 30;
        degatsMonster = 8;
        monsterArmor = 2;
    }

    public Monster(int pvMonster, double degatsMonster, double monsterArmor) {
        this.pvMonster = pvMonster;
        this.degatsMonster = degatsMonster;
        this.monsterArmor = monsterArmor;
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

    public void monsterPlay() {

    }

    public void monsterAttack(Hero m) {
        double degatMonster = m.getPvHero() - (this.getDegatMonster() - m.getArmorHero());

        m.setPvHero((int) degatMonster);
        System.out.println(" Le Monstre attack!! ");
        System.out.println(m);

    }

    public void monsterParade() {

     
    }

   
}

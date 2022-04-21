public class Monster {

    private int pvMonster;
    private double degatsMonster;
    private double monsterArmor;
    private boolean lifeMonster;

    public Monster() {
        pvMonster = 40;
        degatsMonster = 10;
        monsterArmor = 5;
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

    public void setpvMonster(int pvMonster) {
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
}

public class Monster {
    
    private int pvMonster;
    private double degatsMonster;
    private double monsterArmor;

    public Monster() {
        pvMonster = 30;
        degatsMonster = 5;
        monsterArmor = 0;
    }

    public Monster(int pvMonster, double degatsMonster, double Armor) {
        this.pvMonster = pvMonster;
        this.degatsMonster = degatsMonster;
        this.monsterArmor = Armor;
    }

    public Monster(int pvMonster) {
        this.pvMonster = pvMonster;
    }

    public int getpvMonster() {
        return this.pvMonster;
    }

    public double getDegat() {
        return this.degatsMonster;
    }

    public double getArmor() {
        return this.monsterArmor;
    }

    public void setpvMonster(int pvMonster) {
        this.pvMonster = pvMonster;
    }

    public void setDegat(double degatMonster) {
        this.degatsMonster = degatMonster;
    }

    public void setArmor(double Armor) {
        this.monsterArmor = Armor;
    }
}

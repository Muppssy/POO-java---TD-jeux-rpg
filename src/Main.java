
public class Main {
    public static void main(String[] args) throws Exception {
        Hero player1 = new Hero();
        Monster monster1 = new Monster();

        System.out
                .println(" Point de vie du Hero "
                        + player1.getPv() + ": "
                        + " Points d'armure Hero "
                        + player1.getArmor() + ": "
                        + " Dégats du Hero "
                        + player1.getDegat() + ": "
                        );

        System.out
                .println("  Point de vie du Monstre "
                        + monster1.getpvMonster() + ": "
                        + " Points d'armure Monstre "
                        + monster1.getArmorMonster() + ": "
                        + " Dégats du Monstre "
                        + monster1.getDegatMonster() + ": "
                        );
    }
}

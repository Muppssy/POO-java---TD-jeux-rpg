// import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {

                Hero player1 = new Hero();
                Monster monster1 = new Monster();

                System.out
                                .println(" Point de vie du Hero "
                                                + player1.getPvHero() + ": "
                                                + " Points d'armure Hero "
                                                + player1.getArmorHero() + ": "
                                                + " Dégats du Hero "
                                                + player1.getDegatHero() + ": ");

                System.out
                                .println("  Point de vie du Monstre "
                                                + monster1.getpvMonster() + ": "
                                                + " Points d'armure Monstre "
                                                + monster1.getArmorMonster() + ": "
                                                + " Dégats du Monstre "
                                                + monster1.getDegatMonster());

                player1.playGame(monster1);

                int counter = 1;

                while ((monster1.getpvMonster() > 0) && (player1.getPvHero() > 0)) {

                        if ((counter % 2) == 1) {
                                player1.playGame(monster1);

                        }

                        if ((counter % 2) == 0) {
                                monster1.monsterPlay(player1);
                        }

                        counter++;

                }

        }

}

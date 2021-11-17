package Mano;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "Mano";
//        player.health = 20;
//        player.weapon = "Sniper";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Mano", 50, "Sniper");
        System.out.println("Initial health is " + player.getHealth());
        }
}

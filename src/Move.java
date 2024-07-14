import java.util.List;
import java.util.Scanner;

public class Move {
    
    public static void main(String[] args) {
        String filePath = "../asset/carte.txt";
        Map map1 = new Map();
        map1.createMap(filePath);
        List<String> carte1 = map1.getMap();
        
        System.out.println("test 1");
        System.out.println("x: 3");
        System.out.println("y : 0");

        Adventurer  adventurer1 = new Adventurer(3, 0);

        //Afficher la carte avec le personnage à sa position de départ
        map1.showMap(adventurer1);

        String listMovement1 = "SSSSEEEEEENN";

        //déplace l'aventurier selon les mouvements donnés
        for (int i=0; i<listMovement1.length(); i++) {
            char move = listMovement1.charAt(i);
            adventurer1.moveAdventurer(move, carte1);
        }

        int expectedX1 = 9;
        int expectedY1= 2;
        if (adventurer1.getX() == expectedX1 && adventurer1.getY() == expectedY1) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }


        Map map2 = new Map();
        map2.createMap(filePath);
        List<String> carte2 = map2.getMap();
        
        System.out.println("test 2");
        System.out.println("x: 6");
        System.out.println("y : 9");

        Adventurer  adventurer2 = new Adventurer(6, 9);

        //Afficher la carte avec le personnage à sa position de départ
        map2.showMap(adventurer2);

        String listMovement2 = "OONOOOSSO";

        //déplace l'aventurier selon les mouvements donnés
        for (int i=0; i<listMovement2.length(); i++) {
            char move = listMovement2.charAt(i);
            adventurer2.moveAdventurer(move, carte2);
        }

        int expectedX2 = 7;
        int expectedY2 = 5;
        if (adventurer2.getX() == expectedX2 && adventurer2.getY() == expectedY2) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

    }
}
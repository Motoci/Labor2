package com;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Benutzer athlete = new Benutzer();
        Mannschaftssport basketBall = new Basketball();
        Mannschaftssport fussBall = new Fussball();
        Leichtathletik hindernissLauf = new Hindernisslauf();
        Leichtathletik hochSprung = new Hochsprung();

        ArrayList<Sport> lieblingsport = new ArrayList<Sport>();
        lieblingsport.add(basketBall);
        lieblingsport.add(fussBall);
        lieblingsport.add(hindernissLauf);
        lieblingsport.add(hochSprung);
        athlete.setFirstName("Anthony");
        athlete.setLastName("Smith");
        athlete.setSportList(lieblingsport);
        System.out.println(athlete.getLastName() + " " + athlete.getFirstName() + " needs: " + athlete.calculateTime() + " minutes for his favorite sports");
        System.out.println(athlete.getLastName() + " " + athlete.getFirstName() + " needs on average: " + athlete.calculateAverageTime() + "minutes for his favorite sports");
        System.out.println(athlete.getLastName() + " " + athlete.getFirstName() + " needs: " + athlete.calculateTime(fussBall) + "minutes for soccer");
    }
}

package Lesson8;

import java.util.List;
import Lesson9.SalesTxnPk.Predicate;

/**
 *
 * @author Mano
 */
public class RoboCallTest07 {

    public static void main(String[] args) {

        List<Person> pl = Person.createShortList();
        RoboCall05 robo = new RoboCall05();

        System.out.println("\n=== Calling all Drivers Lambda ===");
        pl.stream()
                .filter(p -> p.getAge() >= 16)
                .forEach(p -> robo.roboCall(p));

        System.out.println("\n=== Calling all Draftees Lambda ===");
        pl.stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE)
                .forEach(p -> robo.roboEmail(p));

        System.out.println("\n=== Calling all Pilots Lambda ===");
        pl.stream()
                .filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
                .forEach(p -> robo.roboMail(p));

    }
}

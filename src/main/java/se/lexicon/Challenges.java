package se.lexicon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class Challenges {



    public static void main(String[] args) {

        //1. Create an empty set and populate it with all the days of the week.
        //   Next create a second set and populate it with ONLY the weekend days (SATURDAY and SUNDAY).
        //   Lastly, compare the two sets and retain in the first set only those days that are the same in both sets.

        System.out.println("1.");

        HashSet<String> newDaysOfTheWeek = new HashSet<>();

        newDaysOfTheWeek.add("Monday");
        newDaysOfTheWeek.add("Tuesday");
        newDaysOfTheWeek.add("Wednesday");
        newDaysOfTheWeek.add("Thursday");
        newDaysOfTheWeek.add("Friday");
        newDaysOfTheWeek.add("Saturday");
        newDaysOfTheWeek.add("Sunday");

        HashSet<String> weekendDays = new HashSet<>();

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        Iterator<String> checkDays = newDaysOfTheWeek.iterator();
        while (checkDays.hasNext()){
            if(newDaysOfTheWeek.containsAll(weekendDays)){
                newDaysOfTheWeek.clear();
                newDaysOfTheWeek.addAll(weekendDays);
                break;
            }
        }

        System.out.println(newDaysOfTheWeek);

        System.out.println("----------------------------------");

        //2. Create a new hashMap of types <String,String> and populate it with elements containing an email (String),
        //   and a name (String). Next, create a new Set and populate it with the keys from the hashMap you created.

        System.out.println("2.");

        HashMap<String, String > profiles = new HashMap<>();
        profiles.put("leo@email.com", "Leo");
        profiles.put("sophie@email.com", "Sophie");
        profiles.put("noelle@email.com", "Noelle");
        profiles.put("philip@email.com", "Philip");

        HashSet<String> emails = new HashSet<>(profiles.keySet());

        System.out.println(emails);
        System.out.println("----------------------------------");

        //3. Create a new class and call it SuperHero. Add fields for Id, Name and Age + getters and setters.
        //   Have the class implement the Comparable interface. Implement the override method and have it compare the AGE of the superhero.
        //   Next, create a new arrayList of type SuperHero. Sort the list by age and print out each element.







    }
}

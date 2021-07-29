package se.lexicon;


import sun.security.x509.OtherName;

import java.util.*;

public class App
{
    public static void main( String[] args ) {

        //1. Create a new list and populate it with the days of the week. Lastly, print out the list.
        System.out.println("1.");
        ArrayList<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        System.out.println("daysOfTheWeek List = " + daysOfTheWeek);
        System.out.println("------------------------------");

        //2. Create a new list and populate it with the days of the week.
        //   Lastly, iterate through the list and print out each element separately.
        System.out.println("2.");

        System.out.println("Two different ways of doing this.");

        Iterator<String> itr = daysOfTheWeek.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---------------");

        for (String days : daysOfTheWeek) {
            System.out.println(days);
        }

        System.out.println("---------------------------------");

        //3. Create a new list and populate it with the days of the week excluding THURSDAY.
        //   Lastly, insert the weekday THURSDAY into the right position in the list.

        System.out.println("3.");
        ArrayList<String> daysWoutThur = new ArrayList<>();
        daysWoutThur.add("Monday");
        daysWoutThur.add("Tuesday");
        daysWoutThur.add("Wednesday");
        daysWoutThur.add("Friday");
        daysWoutThur.add("Saturday");
        daysWoutThur.add("Sunday");

        System.out.println("Before adding Thursday. " + daysWoutThur);

        daysWoutThur.add(3, "Thursday");

        System.out.println("After adding Thursday. " + daysWoutThur);

        System.out.println("-------------------------------");

        //4. Create a new list and populate it with the days of the week.
        //   Then create a new list out of the first three elements of the first list using a subList.

        System.out.println("4.");
        List<String> firstThreeDays = daysOfTheWeek.subList(0, 3);

        System.out.println(firstThreeDays);

        System.out.println("-------------------------------");

        //5. Create a new hashset and populate it with the days of the week.
        //   Lastly, print the set out and pay attention to the order of the elements.

        System.out.println("5.");

        HashSet<String> daysOfTheWeekHash = new HashSet<>();
        daysOfTheWeekHash.add("Monday");
        daysOfTheWeekHash.add("Tuesday");
        daysOfTheWeekHash.add("Wednesday");
        daysOfTheWeekHash.add("Thursday");
        daysOfTheWeekHash.add("Friday");
        daysOfTheWeekHash.add("Saturday");
        daysOfTheWeekHash.add("Sunday");

        System.out.println(daysOfTheWeekHash);

        System.out.println("-------------------------------");

        //6. Create a new hashSet and populate it with the days of the week.
        //   Then convert the hashSet to an arrayList.

        System.out.println("6.");

        HashSet<String> daysOfTheWeekHash2 = new HashSet<>();
        daysOfTheWeekHash2.add("Monday");
        daysOfTheWeekHash2.add("Tuesday");
        daysOfTheWeekHash2.add("Wednesday");
        daysOfTheWeekHash2.add("Thursday");
        daysOfTheWeekHash2.add("Friday");
        daysOfTheWeekHash2.add("Saturday");
        daysOfTheWeekHash2.add("Sunday");

        ArrayList<String> daysOfTheWeekList = new ArrayList<>(daysOfTheWeekHash2);

        System.out.println(daysOfTheWeekList);

        System.out.println(daysOfTheWeekList.size());

        System.out.println("-------------------------------");

        //7. Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList.
        //   Lastly, manually sort the list in alphabetical order and print it out.

        System.out.println("7.");

        HashSet<String> names = new HashSet<>();
        names.add("Leo");
        names.add("Sophie");
        names.add("Noelle");
        names.add("Philip");

        ArrayList<String> namesToSort = new ArrayList<>(names);
        System.out.println(namesToSort);
        Collections.sort(namesToSort);
        System.out.println(namesToSort);
        System.out.println("------------------------");

        //8. Create a new hashSet and populate it with random names.
        //   Lastly, sort the list in alphabetical order using only a Set or a child of Set.

        System.out.println("8.");

        HashSet<String> otherNames = new HashSet<>();
        otherNames.add("Leo");
        otherNames.add("Sophie");
        otherNames.add("Noelle");
        otherNames.add("Philip");

        TreeSet<String> otherNamesSort = new TreeSet<>(otherNames);
        System.out.println(otherNamesSort);
        System.out.println("-----------------------------");

        //9. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer),
        //   and a car brand(String). Lastly, print out the entire hashMap.

        System.out.println("9.");

        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "BMW");
        cars.put(2, "Audi");
        cars.put(3, "Porsche");
        cars.put(4, "Ferrari");

        for(Map.Entry m : cars.entrySet()){
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }

        System.out.println("-----------------------------");

        //10. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer),
        //    and a car brand(String). Lastly, print out only the keys.
        System.out.println("10.");















    }
}

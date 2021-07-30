package se.lexicon;

public class SuperHero implements Comparable<SuperHero> {

    public int id;
    public String name;
    public int age;

    public SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(SuperHero o) {
        if (age == o.age) {
            return 0;
        } else if (age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }


}

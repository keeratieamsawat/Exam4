package org.example;

public class Lion implements Info {
    public String name;
    public int age;
    public int Id;
    public Lion(String name, int age, int Id) {
        this.name = name;
        this.age = age;
        this.Id = Id;
    }

    @Override
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public int getID() {
        return Id;
    }

}


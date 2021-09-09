package com.otus.Loskutov.HomeWork2;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  void say(){
        System.out.println("Я говорю");
    }

    public static void drink(){
        System.out.println("Я пью");
    }

    public static void eat(){
        System.out.println("Я ем");
    }

    public static void go(){
        System.out.println("Я иду");
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ", мне " + age + " года, я вешу " + weight + " кг, мой цвет - " + color;
    }
}


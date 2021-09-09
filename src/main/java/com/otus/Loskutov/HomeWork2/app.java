package com.otus.Loskutov.HomeWork2;

import com.otus.Loskutov.HomeWork2.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
    enum Command { ADD, LIST, EXIT }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(3);
        animal.setName("Барсик");
        animal.setColor("белый");
        animal.setWeight(5);

        System.out.println(animal.toString());

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();
        Duck myduck = new Duck();

        cat.say();
        dog.say();
        duck.say();
        myduck.fly();

        ArrayList<Animal> animals = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        Command menuItem = Command.ADD;

        while (!menuItem.equals(Command.EXIT)){
            System.out.println("Введите add для добавления");
            System.out.println("Введите list для печати");
            System.out.println("Введите exit для выхода");
            menuItem = Command.valueOf(s.nextLine().toUpperCase().trim()) ;

            switch (menuItem){
                case ADD:
                    System.out.println("Какое животное ты хочешь выбрать?" + "dog/cat/duck");
                    String str = s.nextLine().toUpperCase().trim();
                    switch (str){
                    case "DOG":
                        Dog mydog = new Dog();
                        System.out.println("Как зовут твою собаку?");
                        mydog.setName(s.nextLine());
                        System.out.println("Какой возраст у собаки?");
                        mydog.setAge(Integer.parseInt(s.nextLine()));
                        System.out.println("Сколько весит твоя собака?");
                        mydog.setWeight(Integer.parseInt(s.nextLine()));
                        System.out.println("Какого цвета твоя собака?");
                        mydog.setColor(s.nextLine());
                        mydog.say();
                        animals.add(mydog);
                        break;
                        case "CAT":
                            Cat mycat = new Cat();
                            System.out.println("Как зовут твою кошку?");
                            mycat.setName(s.nextLine());
                            System.out.println("Какой возраст у кошки?");
                            mycat.setAge(Integer.parseInt(s.nextLine()));
                            System.out.println("Сколько весит твоя кошка?");
                            mycat.setWeight(Integer.parseInt(s.nextLine()));
                            System.out.println("Какого цвета твоя кошка?");
                            mycat.setColor(s.nextLine());
                            mycat.say();
                            animals.add(mycat);
                            break;
                        case "DUCK":
                            Duck thisduck = new Duck();
                            System.out.println("Как зовут твою утку?");
                            thisduck.setName(s.nextLine());
                            System.out.println("Какой возраст у утки?");
                            thisduck.setAge(Integer.parseInt(s.nextLine()));
                            System.out.println("Сколько весит твоя утка?");
                            thisduck.setWeight(Integer.parseInt(s.nextLine()));
                            System.out.println("Какого цвета твоя утка?");
                            thisduck.setColor(s.nextLine());
                            thisduck.say();
                            animals.add(thisduck);
                            break;

                        default:
                            System.out.println("Такого животного нет в списке доступных");

                    }



                    break;

                case EXIT:
                    System.out.println("Пока!");
                    break;

                case LIST:
                    for (Animal item: animals)
                        System.out.println(item.toString());



            }
        }




    }


}

package com.github.stazxr.gof23.行为型.对象行为.访问者;

public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Cat());
        home.addAnimal(new Dog());
        home.action(new Owner());
    }
}

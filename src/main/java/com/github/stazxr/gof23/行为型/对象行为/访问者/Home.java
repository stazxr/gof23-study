package com.github.stazxr.gof23.行为型.对象行为.访问者;

import java.util.ArrayList;
import java.util.List;

public class Home {
    // 包含一组元素角色对象
    private final List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void action(Person person) {
        // 遍历集合，让访问者对象访问每一个元素
        for (Animal animal : animalList) {
            // person.feed(animal);
            animal.accept(person);
        }
    }
}

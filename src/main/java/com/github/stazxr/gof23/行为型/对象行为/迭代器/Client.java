package com.github.stazxr.gof23.行为型.对象行为.迭代器;

public class Client {
    public static void main(String[] args) {
        StudentAggregate aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("张三"));
        aggregate.addStudent(new Student("李四"));
        aggregate.addStudent(new Student("王五"));

        StudentIterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

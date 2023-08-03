package com.github.stazxr.gof23.行为型.对象行为.迭代器;

public interface StudentAggregate {
    void addStudent(Student stu);

    void removeStudent(Student stu);

    StudentIterator iterator();
}

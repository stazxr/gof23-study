package com.github.stazxr.gof23.行为型.对象行为.迭代器;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator {
    private final List<Student> list;

    // 用来记录遍历时的位置
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}

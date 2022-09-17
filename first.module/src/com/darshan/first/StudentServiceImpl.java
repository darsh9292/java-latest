package com.darshan.first;

import com.darshan.pojo.Student;

public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(Student student) {
        System.out.println("Calling addStudent method");
    }
}

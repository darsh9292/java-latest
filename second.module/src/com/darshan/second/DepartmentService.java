package com.darshan.second;

import com.darshan.first.StudentServiceImpl;
import com.darshan.pojo.Student;

public class DepartmentService {

    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.addStudent(new Student());
    }
}

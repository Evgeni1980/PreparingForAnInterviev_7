package ru.kremenia.dao;

import ru.kremenia.entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}

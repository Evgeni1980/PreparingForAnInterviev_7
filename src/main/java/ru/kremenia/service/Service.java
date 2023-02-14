package ru.kremenia.service;

import ru.kremenia.entity.Student;

import java.util.List;

public interface Service {
    public List<Student> getAllStudents();

    public void saveStudent(Student employee);

    public Student getStudent(int id);

    public void deleteStudent(int id);
}

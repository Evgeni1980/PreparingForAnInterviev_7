package ru.kremenia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ru.kremenia.dao.StudentDAO;
import ru.kremenia.entity.Student;

import java.util.List;

@EnableTransactionManagement(proxyTargetClass = true)

public class StudentService implements Service{
    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}

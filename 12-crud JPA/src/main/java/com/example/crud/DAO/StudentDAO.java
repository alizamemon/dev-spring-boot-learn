package com.example.crud.DAO;

import com.example.crud.entity.Student;

import java.util.List;

public interface StudentDAO {

void save (Student thestudent);

Student findById(Integer id);

List<Student> findAll();

void update(Student theStudent);

void delete(Integer id);

int deleteAll();
}

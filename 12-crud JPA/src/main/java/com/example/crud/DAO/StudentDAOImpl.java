package com.example.crud.DAO;

import com.example.crud.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//this class will interact with db
@Repository
public class StudentDAOImpl implements StudentDAO {

    //define fields fir entity manager
private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    //implements save method
    @Override
    @Transactional
    public void save(Student theStudent){
    entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ", Student.class);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    //whenever modifying the database
    @Transactional
    @Override
    public void delete(Integer id) {

        //retrieve the student
        Student  theStudent = entityManager.find(Student.class, id);

        //delete the student
        entityManager.remove(theStudent);
    }

    @Transactional
    @Override
    public int deleteAll() {

        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDeleted;
    }
}

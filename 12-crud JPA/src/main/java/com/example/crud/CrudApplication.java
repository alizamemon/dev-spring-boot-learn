package com.example.crud;

import com.example.crud.DAO.StudentDAO;
import com.example.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//System.out.println("Hello World");
			//createStudent(studentDAO);
		    createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudent(studentDAO);


		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: "+numRowsDeleted);
		studentDAO.deleteAll();

	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId = 3;
		System.out.println("Deleting student with id " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
	//retrieve student based on id:pk
		int studentId = 1;
		System.out.println("Updating student with id " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change first name
		System.out.println("Updating student with id ");
		myStudent.setFirstName("liza");

		//Update the student
		studentDAO.update(myStudent);

		//display the updated student
		System.out.println("Updated student" + myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents= studentDAO.findAll();

		//display the list
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}

	}

	private void readStudent(StudentDAO studentDAO) {

	//create a student object
		System.out.println("creating new student object");
		Student tempStudent = new Student("Duck", "Dow","duck@gmail.com");


		//save the student
		System.out.println("saving the student");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("saved student. generated id:" + theId);

		//retrieve student based on the id: pk
		System.out.println("retrieving student with id:" + theId);
		Student myStudent = studentDAO.findById(theId);

		//display student
		System.out.println("Found the student: " + myStudent); //implicit calling of toString from student class
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		//create multiple students
		System.out.println("Creating new student object");
		Student tempStudent1 = new Student("test", "db", "test@gmail.com");
		Student tempStudent2 = new Student("abc", "def", "uu@gmail.com");
		Student tempStudent3 = new Student("stu", "vwx", "ts@gmail.com");
		Student tempStudent4 = new Student("to", "dub", "tyyt@gmail.com");

		//save the student objects
		System.out.println("saving the students");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);

	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student object");
		Student tempStudent = new Student("aliza", "nisar", "alizanisar11@gmail.com");

		//save the student object
		System.out.println("Saving student object");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student/Generated id: " + tempStudent.getId());
	}
	
}

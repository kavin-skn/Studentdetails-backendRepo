package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
@Autowired
  private StudentRepository repo;


public Optional<Student> getTasks(int id){
	return repo.findById( id);
}
public String updateTodo(Student d) {
	repo.save( d);
	return "updated";
}

public String delete(int id) {
	repo.deleteById(id);
	return "Deleted";
}

}
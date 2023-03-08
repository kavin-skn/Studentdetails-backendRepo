package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;


@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
private StudentService studentservice;
@Autowired
private StudentRepository repo;

   @PostMapping("/post")
	public Student create (@RequestBody Student d) {
		return repo.save( d);
	}

    @GetMapping("/get")
    public List<Student> list(){
        return repo.findAll();
    }
    
    @PutMapping("/update")
	public Student updateTodo(@RequestBody Student d)
	{
		return repo.save(d);
	}
	
	@DeleteMapping("/delete")
	public String deletesol(@RequestParam int id) {
		return studentservice.delete(id);
	}
}

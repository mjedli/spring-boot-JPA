/**
 * 
 */
package com.example.springbootjpa.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mjedli
 *
 */
@Service
@Transactional
public class ToDoService {
	
	@Autowired
	ToDoRepositoryInt toDorepository;

	public List<ToDo> getAllToDo() {
		return (List<ToDo>) toDorepository.findAll();
	}

	public ToDo saveToDo(ToDo todo) {
		return toDorepository.save(todo);
	}
	
	public void deleteToDo(ToDo todo) {
		toDorepository.delete(todo);
	}

	public Optional<ToDo> findById(long id) {
		return toDorepository.findById(id);
	}

}

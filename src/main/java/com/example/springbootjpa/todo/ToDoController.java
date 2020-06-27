/**
 * 
 */
package com.example.springbootjpa.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjedli
 *
 */
@RestController
public class ToDoController {

	@Autowired
	ToDoService toDoService;
	
	@GetMapping(value= {"/", ""})
	private List<ToDo> getAllTodo() {
		return toDoService.getAllToDo();
	}
	
	@PostMapping(value= {"/", ""})
	private ToDo saveToDo(@RequestBody ToDo todo) {
		return toDoService.saveToDo(todo);
	}
	
	@DeleteMapping(value= {"/", ""})
	private void deleteToDo(@RequestBody ToDo todo) {
		toDoService.deleteToDo(todo);
	}
	
	@GetMapping(value="/id/{id}")
	private Optional<ToDo> findById(@PathVariable long id) {
		return toDoService.findById(id);
	}
	
	@GetMapping(value="/name/{name}")
	private Optional<ToDo> findByName(@PathVariable String name) {
		return toDoService.findByName(name);
	}
}

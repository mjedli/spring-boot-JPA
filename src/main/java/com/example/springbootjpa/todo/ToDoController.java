/**
 * 
 */
package com.example.springbootjpa.todo;

import java.util.ArrayList;
import java.util.List;

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
	
	public static List<ToDo> data = new ArrayList<ToDo>();
	
	@GetMapping(value= {"/", ""})
	private List<ToDo> getAllTodo() {
		ToDo todo = new ToDo();
		todo.setId(0);
		todo.setName("name");
		todo.setDescription("description");
		data.add(todo);
		return data;
	}

	
	@PostMapping(value= {"/", ""})
	private ToDo saveToDo(@RequestBody ToDo todo) {
		data.add(todo);
		return todo;
	}
	
}

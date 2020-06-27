/**
 * 
 */
package com.example.springbootjpa.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mjedli
 *
 */
@Repository
public interface ToDoRepositoryInt extends CrudRepository<ToDo, Long> {

}

/**
 * 
 */
package com.example.springbootjpa.todo;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * @author mjedli
 *
 */
public class ToDoRepository implements ToDoRepositoryInt {

	private static final String ID_MUST_NOT_BE_NULL = "Id must be not null";
	
	@Autowired
	private EntityManager em;

	@Override
	public Optional<ToDo> findByName(String name) {

		Assert.notNull(name, ID_MUST_NOT_BE_NULL);

		return Optional.ofNullable(em.find(ToDo.class, name));
	}
	
	@Override
	public <S extends ToDo> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ToDo> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ToDo> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<ToDo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ToDo> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ToDo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends ToDo> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}

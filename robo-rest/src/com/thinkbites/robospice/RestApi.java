package com.thinkbites.robospice;

import java.util.List;

/**
 * Base interface holding the basic 5 REST method
 * {@link #index()}, {@link #show(String)}, {@link #create(Object)},
 * {@link #update(String, Object)}, {@link #destroy(String)}
 * @author mono
 *
 * @param <T> the data type (POJO) that this method handles (i.e. User)
 */
public interface RestApi<T> {

	/**
	 * makes a GET request to /resource-name
	 * @return returns a list of type T objects
	 */
	public List<T> index();
	
	/**
	 * makes a GET request to /resource-name/{id}
	 * @param id the id of the RESTful resource that will be retreived
	 * @return an instance of type T
	 */
	public T show(String id);
	
	/**
	 * Creates a T object by making a POST to /resource-name
	 * @param object the object to create
	 * @return the created object
	 */
	public T create(T object);
	
	/**
	 * Updates the object residing at /resource-name/{id}
	 * with the new object by making a PUT to /resource-name/{id}
	 * @param id the id of the object to update
	 * @param object the new object
	 * @return an instance of the updated object
	 */
	public T update(String id,T object);
	
	/**
	 * makes a DELETE request to /resource-name/{id} effectively destroying
	 * the object residing at said location
	 * @param id the id of the object that wishes to be destroyed
	 * @return ???
	 */
	public Object destroy(String id);
}

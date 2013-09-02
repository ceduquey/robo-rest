package com.thinkbites.roborest.helpers;

import java.util.List;

import com.thinkbites.roborest.RestApi;
import com.thinkbites.roborest.requests.RequestCreate;
import com.thinkbites.roborest.requests.RequestDelete;
import com.thinkbites.roborest.requests.RequestIndex;
import com.thinkbites.roborest.requests.RequestShow;
import com.thinkbites.roborest.requests.RequestUpdate;

/**
 * Helper class to construct the different request objects.
 * Currently only {@link RequestCreate}, {@link RequestDelete}, {@link RequestShow}
 * {@link RequestIndex} and {@link RequestUpdate} are supported (the default RESTful actions)
 * @author mono
 *
 * @param <T>
 */
public class RequestFactory<T, RestInterface extends RestApi<T>> {

	private String serverUrl;
	private Class<T> pojoClazz;
	private Class<List<T>> pojoListClazz;
	private Class<RestInterface> restApiClazz;
	
	public RequestFactory(Class<T> pojoClazz,
			Class<RestInterface> restApiClazz, String serverUrl) {
		super();
		this.pojoClazz = pojoClazz;
		this.pojoListClazz = ApiHelper.getServicesListClass(pojoClazz);
		this.restApiClazz = restApiClazz;
		this.serverUrl = serverUrl;
	}

	/**
	 * Constructs a {@link RequestCreate} object with the data parameter
	 * @param data
	 * @return returns an instance of {@link RequestCreate} 
	 */
	@SuppressWarnings("unchecked")
	public RequestCreate<T,RestInterface> create(T data){
		RequestCreate<T, RestInterface> request =  new RequestCreate<T,RestInterface>(pojoClazz, restApiClazz, data);
		request.setService((RestInterface)ApiHelper.create(restApiClazz, serverUrl));
		return request;
	}
	
	/**
	 * 
	 * @param id
	 * @return returns an instance 
	 */
	public RequestDelete<T,RestInterface> delete(String id){
		return new RequestDelete<T,RestInterface>(restApiClazz, id);
	}
	
	public RequestIndex<T,RestInterface> index(){
		return new RequestIndex<T,RestInterface>(pojoListClazz, restApiClazz);
	}
	
	public RequestShow<T,RestInterface> show(String id){
		return new RequestShow<T,RestInterface>(pojoClazz, restApiClazz, id);
	}
	
	public RequestUpdate<T,RestInterface> update(String id, T data){
		return new RequestUpdate<T,RestInterface>(pojoClazz, restApiClazz, data);
	}
	
	
	
}

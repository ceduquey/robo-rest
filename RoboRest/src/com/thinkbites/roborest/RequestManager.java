package com.thinkbites.roborest;


import java.util.List;

import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.request.SpiceRequest;
import com.octo.android.robospice.request.listener.RequestListener;
import com.thinkbites.roborest.helpers.RequestFactory;

/**
 * The RequestManager is simply a wrapper around the {@link SpiceManager} to consume
 * {@link SpiceRequest} with ease
 * @author mono
 *
 * @param <T>
 */
public class RequestManager<T,RestInterface extends RestApi<T>> {
	
	/**
	 * reference to the current spice manager
	 */
	protected SpiceManager manager;
	protected RequestFactory<T,RestInterface> requestFactory;
	
	public RequestManager(SpiceManager manager, RequestFactory<T,RestInterface> requestFactory) {
		this.manager = manager;
		this.requestFactory = requestFactory;
	}
	
	/**
	 * 
	 * @return returns an instance of the current spice manager
	 */
	public SpiceManager getSpiceManager(){
		return manager;
	}
	
	/**
	 * REST create action, creates a data object in the server
	 * @param requestListener
	 * @param data
	 */
	public void create(RequestListener<T> requestListener, T data){
		throw new RuntimeException("operation not implemented yet");
	}
	
	/**
	 * REST destroy action: destroys the restful resource with the given id
	 * @param requestListener
	 * @param id
	 */
	public void delete(RequestListener<Object> requestListener, String id){
		throw new RuntimeException("operation not implemented yet");
	}
	
	/**
	 * REST index action: by default returns all objects of the given resource type
	 * @param requestListener
	 */
	public void index(RequestListener<List<T>> requestListener){
		throw new RuntimeException("operation not implemented yet");
	}
	
	/**
	 * returns the restful resource with the given id
	 * @param requestListener
	 * @param id
	 */
	public void show(RequestListener<T> requestListener, String id){
		throw new RuntimeException("operation not implemented yet");
	}
	
	/**
	 * Updates (and replaces) the restful resource with the given id
	 * with the new data
	 * @param requestListener handler that will be executed when the request is done
	 * being processed
	 * @param id the id of the original resource
	 * @param data the new resource
	 */
	public void update(RequestListener<T> requestListener, String id, T data){
		throw new RuntimeException("operation not implemented yet");
	}

}

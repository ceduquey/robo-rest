package com.thinkbites.robospice;

import java.util.List;

import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.request.listener.RequestListener;
import com.thinkbites.robospice.helpers.RequestFactory;
import com.thinkbites.robospice.requests.RequestCreate;
import com.thinkbites.robospice.requests.RequestDelete;
import com.thinkbites.robospice.requests.RequestIndex;
import com.thinkbites.robospice.requests.RequestShow;
import com.thinkbites.robospice.requests.RequestUpdate;

/**
 * 
 * @author mono
 *
 * @param <T>
 */
public class RequestManager<T,RestInterface extends RestApi<T>> {
	
	protected SpiceManager manager;
	protected RequestFactory<T,RestInterface> requestFactory;
	
	public RequestManager(SpiceManager manager, RequestFactory<T,RestInterface> requestFactory) {
		this.manager = manager;
		this.requestFactory = requestFactory;
	}
	
	public SpiceManager getSpiceManager(){
		return manager;
	}
	
	/**
	 * REST create action, creates a data object in the server
	 * @param requestListener
	 * @param data
	 */
	public void create(RequestListener<T> requestListener, T data){
		RequestCreate<T,RestInterface> create = requestFactory.create(data);
		manager.execute(create, requestListener);
	}
	
	/**
	 * REST destroy action: destroys the restful resource with the given id
	 * @param requestListener
	 * @param id
	 */
	public void delete(RequestListener<Object> requestListener, String id){
		RequestDelete<T,RestInterface> request = requestFactory.delete(id);
		manager.execute(request, requestListener);
	}
	
	/**
	 * REST index action: by default returns all objects of the given resource type
	 * @param requestListener
	 */
	public void index(RequestListener<List<T>> requestListener){
		RequestIndex<T,RestInterface> index = requestFactory.index();
		manager.execute(index, requestListener);
	}
	
	/**
	 * returns the restful resource with the given id
	 * @param requestListener
	 * @param id
	 */
	public void show(RequestListener<T> requestListener, String id){
		RequestShow<T,RestInterface> show = requestFactory.show(id);
		manager.execute(show, requestListener);
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
		RequestUpdate<T,RestInterface> dupdate = requestFactory.update(id, data);
		manager.execute(dupdate, requestListener);
	}

}

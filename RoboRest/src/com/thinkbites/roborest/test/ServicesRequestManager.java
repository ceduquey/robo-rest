package com.thinkbites.roborest.test;

import java.util.Collections;
import java.util.List;

import com.octo.android.robospice.SpiceManager;
import com.thinkbites.roborest.RequestManager;
import com.thinkbites.roborest.helpers.RequestFactory;

public class ServicesRequestManager extends RequestManager<Service, ServicesApi>{

	public ServicesRequestManager(SpiceManager manager) {
		super(manager, getRequestFactory());
	}

	private static Class<List<Service>> getServicesListClass() {
		List<Service> services = Collections.emptyList();
		return (Class<List<Service>>) services.getClass();
	}
	
	private static RequestFactory<Service, ServicesApi> getRequestFactory() {
		return new RequestFactory<Service, ServicesApi>(Service.class, getServicesListClass(), ServicesApi.class, "http://taxi-touch-development.herokuapp.com/api/v1");
		
	}
	
	
	
	

}

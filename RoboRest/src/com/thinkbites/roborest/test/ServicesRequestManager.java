package com.thinkbites.roborest.test;

import com.octo.android.robospice.SpiceManager;
import com.thinkbites.roborest.RequestManager;
import com.thinkbites.roborest.helpers.RequestFactory;

public class ServicesRequestManager extends RequestManager<Service, ServicesApi>{

	public ServicesRequestManager(SpiceManager manager) {
		super(manager, getRequestFactory());
	}

	
	
	private static RequestFactory<Service, ServicesApi> getRequestFactory() {
		return new RequestFactory<Service, ServicesApi>(Service.class, ServicesApi.class, "http://taxi-touch-development.herokuapp.com/api/v1");
	}
	
	
	
	

}

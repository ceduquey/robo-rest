package com.thinkbites.roborest.test;


import java.util.Collections;
import java.util.List;

import com.thinkbites.roborest.requests.RequestIndex;

public class ServicesIndex extends RequestIndex<Service, ServicesApi> {

	public ServicesIndex() {
		super(getServicesListClass(), ServicesApi.class);
		
	}

	private static Class<List<Service>> getServicesListClass() {
		List<Service> services = Collections.emptyList();
		return (Class<List<Service>>) services.getClass();
	}

	

}

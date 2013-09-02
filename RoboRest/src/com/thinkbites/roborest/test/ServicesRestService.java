package com.thinkbites.roborest.test;


import com.thinkbites.roborest.RestService;

public class ServicesRestService extends RestService<Service, ServicesApi> {

	public ServicesRestService() {
		super("http://taxi-touch-development.herokuapp.com/api/v1",ServicesApi.class);
	}

}

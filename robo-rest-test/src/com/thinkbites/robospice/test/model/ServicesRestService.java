package com.thinkbites.robospice.test.model;

import com.thinkbites.robospice.RestService;

public class ServicesRestService extends RestService<Service, ServicesApi> {

	public ServicesRestService() {
		super("taxi-touch-development.herokuapp.com/api/v1",ServicesApi.class);
	}

}

package com.thinkbites.roborest.test;


import java.util.List;

import retrofit.http.GET;

import com.thinkbites.roborest.RestApi;

public interface ServicesApi extends RestApi<Service> {

	@GET("/services")
	public List<Service> index();
	
}

package com.thinkbites.robospice.test;

import java.util.List;

import retrofit.http.GET;

import com.thinkbites.robospice.RestApi;

public interface ServicesApi extends RestApi<Service> {

	@GET("/services")
	public List<Service> index();
	
}

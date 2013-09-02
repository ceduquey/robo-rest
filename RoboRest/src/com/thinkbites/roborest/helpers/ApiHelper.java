package com.thinkbites.roborest.helpers;

import retrofit.RestAdapter;
import retrofit.RestAdapter.Builder;

import com.thinkbites.roborest.RestApi;

/**
 * Helper class to instantiate Api* classes using retrofit's RestAdapter.Builder
 * @author mono
 *
 */
public class ApiHelper {


	public static <T> RestApi<T> create(Class<? extends RestApi<T>> clazz, String serverUrl){
		Builder builder = new RestAdapter.Builder();
		RestAdapter adapter = builder.setServer(serverUrl)
		.setDebug(false)
		.build();
		return adapter.create(clazz);
	}
	
}

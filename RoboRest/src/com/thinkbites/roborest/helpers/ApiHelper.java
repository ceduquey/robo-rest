package com.thinkbites.roborest.helpers;

import java.util.Collections;
import java.util.List;

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
	
	/**
	 * Convenience method to generate a <code>Class&lt;List&lt;T&gt;&gt;<code> object
	 * given a <code>Class&lt;T&gt;<code> or <code>T.class</code>
	 * @param clazz
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	public static <T> Class<List<T>> getServicesListClass(Class<T> clazz) {
		List<T> services = Collections.emptyList();
		return (Class<List<T>>) services.getClass();
	}
	
}

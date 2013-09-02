package com.thinkbites.roborest.requests;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.thinkbites.roborest.RestApi;

public class RequestShow<T,RestInterface extends RestApi<T>> extends RetrofitSpiceRequest<T,RestInterface>{

	private String id;

	public RequestShow(Class<T> clazz,
			Class<RestInterface> retrofitedInterfaceClass, String id) {
		super(clazz, retrofitedInterfaceClass);
		this.id = id;
	}

	@Override
	public T loadDataFromNetwork() throws Exception {
		return getService().show(id);
	}
}
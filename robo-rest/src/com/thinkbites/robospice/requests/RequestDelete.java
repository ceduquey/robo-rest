package com.thinkbites.robospice.requests;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.thinkbites.robospice.RestApi;

public class RequestDelete<T,RestInterface extends RestApi<T>> extends RetrofitSpiceRequest<Object, RestInterface>{

	private String id;

	public RequestDelete(Class<RestInterface> retrofitedInterfaceClass, String id) {
		super(Object.class, retrofitedInterfaceClass);
		this.id = id;
	}

	@Override
	public Void loadDataFromNetwork() throws Exception {
		getService().destroy(id);
		return null;
	}

}
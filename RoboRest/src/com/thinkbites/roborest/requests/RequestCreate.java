package com.thinkbites.roborest.requests;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.thinkbites.roborest.RestApi;

public class RequestCreate<T,RestInterface extends RestApi<T>> extends RetrofitSpiceRequest<T, RestInterface>{

	private T data;

	public RequestCreate(Class<T> clazz,
			Class<RestInterface> retrofitedInterfaceClass, T data) {
		super(clazz, retrofitedInterfaceClass);
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	@Override
	public T loadDataFromNetwork() throws Exception {
		return getService().create(data);
	}		
}
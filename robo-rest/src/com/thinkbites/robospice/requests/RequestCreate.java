package com.thinkbites.robospice.requests;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.thinkbites.robospice.RestApi;

public class RequestCreate<T,RestInterface extends RestApi<T>> extends RetrofitSpiceRequest<T, RestInterface>{

	private T data;

	public RequestCreate(Class<T> clazz,
			Class<RestInterface> retrofitedInterfaceClass, T data) {
		super(clazz, retrofitedInterfaceClass);
		this.data = data;
	}

	@Override
	public T loadDataFromNetwork() throws Exception {
		return getService().create(data);
	}		
}
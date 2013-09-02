package com.thinkbites.robospice.requests;

import java.util.List;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.thinkbites.robospice.RestApi;

public class RequestIndex<T,RestInterface extends RestApi<T>> extends RetrofitSpiceRequest<List<T>, RestInterface>
{
	public RequestIndex(Class<List<T>> clazz,Class<RestInterface> retrofitedInterfaceClass) {
		super(clazz, retrofitedInterfaceClass);
	}
	@Override
	public List<T> loadDataFromNetwork() throws Exception {
		return getService().index();
	}
}	
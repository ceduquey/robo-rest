package com.thinkbites.roborest;


import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

/**
 * {@link RetrofitGsonSpiceService} 
 * @author mono
 *
 * @param <T> the type of POJOS this service will handle
 * @param <RetrofitInterface> an subclass of {@link RestApi}
 */
public class RestService<T,RetrofitInterface extends RestApi<T>> extends RetrofitGsonSpiceService {

	/**
	 * The URL where the REST server lies
	 */
	private String serverUrl;
	/**
	 * An reference to the class object for your {@link RestApi}
	 */
	private Class<RetrofitInterface> retrofitInterface;
	
	/**
	 * 
	 * @param serverUrl the URL for the REST  
	 * @param retrofitInterface a reference to the class type of your {@link RestApi} subclass
	 */
	public RestService(String serverUrl, Class<RetrofitInterface> retrofitInterface) {
		this.serverUrl = serverUrl;
		this.retrofitInterface = retrofitInterface;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		addRetrofitInterface(retrofitInterface);
	}
	
	@Override
	protected String getServerUrl() {
		return serverUrl;
	}

}

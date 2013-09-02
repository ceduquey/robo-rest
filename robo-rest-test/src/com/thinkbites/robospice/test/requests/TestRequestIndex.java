package com.thinkbites.robospice.test.requests;

import java.util.List;

import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.SpiceRequest;
import com.octo.android.robospice.request.listener.RequestListener;
import com.thinkbites.robospice.test.model.Service;
import com.thinkbites.robospice.test.model.ServicesIndex;
import com.thinkbites.robospice.test.model.ServicesRestService;

import android.test.AndroidTestCase;

public class TestRequestIndex extends AndroidTestCase {

	
	private SpiceManager manager;
	
	@Override
	protected void setUp() throws Exception {
		manager = new SpiceManager(ServicesRestService.class);
		manager.start(getContext());
	}
	
	public void test1(){
		
		SpiceRequest<List<Service>> servicesIndex = new ServicesIndex();

		manager.execute(servicesIndex, new RequestListener<List<Service>>() {
			
			public void onRequestSuccess(List<Service> res) {
				
			}
			
			public void onRequestFailure(SpiceException e) {	
				fail(e.getMessage());
			}
		});
		
	}

}

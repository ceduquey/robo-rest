package com.thinkbites.roborest.test;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

import android.test.AndroidTestCase;

public class TestRequestManager extends AndroidTestCase{

	private SpiceManager manager;
	private ServicesRequestManager reqManager;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		manager = new SpiceManager(ServicesRestService.class);
		reqManager = new ServicesRequestManager(manager);
		
		reqManager.getSpiceManager().start(getContext());
		
	}
	
	public void testIndex() throws Exception{
		
		final CountDownLatch latch = new CountDownLatch(1);

		reqManager.index(new RequestListener<List<Service>>() {
			public void onRequestSuccess(List<Service> res) {
				System.out.println("response"+res);
				assertNotNull(res);
				latch.countDown();
				
			}
			public void onRequestFailure(SpiceException arg0) {
				fail();
				latch.countDown();
			}
		});
		latch.await();
		
	}
	
}

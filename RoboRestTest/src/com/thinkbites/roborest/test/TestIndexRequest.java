package com.thinkbites.roborest.test;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.LargeTest;

public class TestIndexRequest extends AndroidTestCase{

	private SpiceManager manager;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		manager = new SpiceManager(ServicesRestService.class);
		manager.start(getContext());
	}
	
	@LargeTest
	public void testIndex() throws InterruptedException{
		
		final CountDownLatch latch = new CountDownLatch(1);
		ServicesIndex index = new ServicesIndex();
		
		manager.execute(index, new RequestListener<List<Service>>() {
			public void onRequestSuccess(List<Service> res) {
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

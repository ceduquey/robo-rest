package com.thinkbites.roborest.test;

import java.util.List;

import junit.framework.TestCase;

import android.test.suitebuilder.annotation.SmallTest;

import com.thinkbites.roborest.helpers.ApiHelper;

public class TestApiHelper extends TestCase{

	@SmallTest
	public void testClassesMatch(){
		
		Class<List<Service>> services = ApiHelper.getServicesListClass(Service.class);
		assertNotNull(services);
		
	}
	
}

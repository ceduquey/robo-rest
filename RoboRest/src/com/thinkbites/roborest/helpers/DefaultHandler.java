package com.thinkbites.roborest.helpers;

import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

public abstract class DefaultHandler<T> implements RequestListener<T> {

	@Override
	public void onRequestFailure(SpiceException arg0) {
		throw new RuntimeException(arg0);
	}
	
}

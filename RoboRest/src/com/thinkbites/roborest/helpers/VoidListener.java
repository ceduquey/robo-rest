package com.thinkbites.roborest.helpers;

import android.util.Log;

import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

public class VoidListener<T> implements RequestListener<T>{	
	@Override
	public void onRequestSuccess(T result) {}

	@Override
	public void onRequestFailure(SpiceException e) {
		Log.d("RequestListener", "request listener failed" ,e);
	}

}

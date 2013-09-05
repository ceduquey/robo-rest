package com.thinkbites.roborest.helpers;

import android.util.Log;

import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

public abstract class DefaultHandler<T> implements RequestListener<T> {

	public final static String LOGTAG = "RequestListener";
	
	@Override
	public void onRequestFailure(SpiceException e) {
		Log.d(LOGTAG, "request failed",e);
	}
	
}

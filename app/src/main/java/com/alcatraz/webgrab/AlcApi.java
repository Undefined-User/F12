package com.alcatraz.webgrab;
import android.webkit.*;
import android.media.*;

public class AlcApi
{
	public native void WvInit(WebView wv);
	public native void WvTest();
	public native void WvLoadFunctionFrameWork();
	public native void WvReleaseRef();
	public native String hasBind();
	public native void WvStartElementPicking();
	public native void WvStopElementPicking();
	public native void WvStopEditMode();
	public native void WvStartEditMode();
	AudioManager a=g
	static{
		System.loadLibrary("alc_f12");
	}
}

package com.nursinghome.login;


import com.example.nursinghome.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class InterImageActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.inter_image_act);
	}
}

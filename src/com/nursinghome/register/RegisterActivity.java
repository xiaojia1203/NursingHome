package com.nursinghome.register;


import com.example.nursinghome.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class RegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_hello_world);
		
		RegisterFragment fragment = (RegisterFragment) getFragmentManager()
				.findFragmentById(R.id.contentFrame);
		
		if(fragment == null){
			fragment = RegisterFragment.getInstance();
			getFragmentManager().beginTransaction().add(R.id.contentFrame,fragment).commit();
		}
		
		new RegisterPresenter(fragment);
	}

	
	
}

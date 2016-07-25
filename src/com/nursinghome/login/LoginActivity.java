package com.nursinghome.login;

import com.example.nursinghome.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_hello_world);
		
		LoginFragment fragment = (LoginFragment) getFragmentManager()
				.findFragmentById(R.id.contentFrame);
		
		if(fragment == null){
			fragment = LoginFragment.getInstance();
			getFragmentManager().beginTransaction().add(R.id.contentFrame,fragment).commit();
		}
		
		new LoginPresenter(fragment);
	}

	
	
}

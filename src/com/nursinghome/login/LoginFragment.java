package com.nursinghome.login;

import com.example.nursinghome.R;
import com.nursinghome.login.LoginContract.Presenter;
import com.nursinghome.register.RegisterActivity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginFragment extends Fragment implements LoginContract.View,
		OnClickListener {

	LoginContract.Presenter mPresenter;

	public static LoginFragment getInstance() {
		LoginFragment fragment = new LoginFragment();
		return fragment;
	}

	@Override
	public void setPresenter(Presenter presenter) {
		// TODO Auto-generated method stub
		mPresenter = presenter;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View v = inflater.inflate(R.layout.fragment_login, container,
				false);
		Button loginBtn = (Button) v.findViewById(R.id.login);
		Button registerBtn = (Button) v.findViewById(R.id.register);
		Button closeBtn=(Button)v.findViewById(R.id.close);
		loginBtn.setOnClickListener(this);
		registerBtn.setOnClickListener(this);
		closeBtn.setOnClickListener(this);
		return v;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.close:
			getActivity().finish();
			break;	
		case R.id.login:
			Intent loadIntent = new Intent(getActivity(),
					InterImageActivity.class);
			startActivity(loadIntent);
			break;
		case R.id.register:
			Intent registerIntent = new Intent(getActivity(),RegisterActivity.class);
			startActivity(registerIntent);
			break;
		default:
			break;
		}
	}


}

package com.nursinghome.register;

import com.example.nursinghome.R;
import com.nursinghome.login.InterImageActivity;
import com.nursinghome.login.LoginActivity;
import com.nursinghome.register.RegisterContract.Presenter;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterFragment extends Fragment implements RegisterContract.View,
		OnClickListener {

	private Button getVCodeBtn;
	private Button loginBtn;
	private Button registerBtn;
	private Button closeBtn;
	private EditText phoneET;
	private EditText passwordET;
	private EditText vcodeET;
	private RegisterContract.Presenter mPresenter;

	public static RegisterFragment getInstance() {
		RegisterFragment fragment = new RegisterFragment();
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

		View v = inflater.inflate(R.layout.fragment_register, container,
				false);
		getVCodeBtn = (Button) v.findViewById(R.id.get_vcode);
		loginBtn = (Button)v.findViewById(R.id.login);
		registerBtn = (Button)v.findViewById(R.id.register);
		closeBtn =(Button)v.findViewById(R.id.close);
		phoneET = (EditText)v.findViewById(R.id.phone);
		passwordET=(EditText)v.findViewById(R.id.password);
		vcodeET=(EditText)v.findViewById(R.id.vcode);
		getVCodeBtn.setOnClickListener(this);
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
					LoginActivity.class);
			startActivity(loadIntent);
			break;
		case R.id.get_vcode:
			CountDownTimerUtil timer = new CountDownTimerUtil(getVCodeBtn, 60000, 1000);
			timer.start();
			Toast.makeText(getActivity(), "验证码已发送", Toast.LENGTH_SHORT).show();
		case R.id.register:
			Toast.makeText(getActivity(), "注册成功", Toast.LENGTH_SHORT).show();
		default:	
			break;
		}
	}

}

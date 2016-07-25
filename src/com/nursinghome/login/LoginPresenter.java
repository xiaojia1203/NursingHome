package com.nursinghome.login;

public class LoginPresenter implements LoginContract.Presenter{

	private LoginContract.View mView;
	
	public LoginPresenter(LoginContract.View view){
		mView = view;
		mView.setPresenter(this);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

}

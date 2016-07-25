package com.nursinghome.register;

public class RegisterPresenter implements RegisterContract.Presenter{

	private RegisterContract.View mView;
	
	public RegisterPresenter(RegisterContract.View view){
		mView = view;
		mView.setPresenter(this);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

}

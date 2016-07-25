package com.nursinghome.register;

import android.os.CountDownTimer;
import android.widget.TextView;

public class CountDownTimerUtil extends CountDownTimer {

	private TextView mTextView;
	
	public CountDownTimerUtil(TextView textView, long millisInFuture, long countDownInterval) {
		super(millisInFuture, countDownInterval);
		// TODO Auto-generated constructor stub
		mTextView = textView;
	}

	@Override
	public void onFinish() {
		// TODO Auto-generated method stub
		mTextView.setClickable(true);
		mTextView.setText("获取验证码");
	}

	
	
	@Override
	public void onTick(long millisUntilFinished) {
		// TODO Auto-generated method stub
		mTextView.setClickable(false);
		mTextView.setText(millisUntilFinished/1000+"秒后重获");
	}

}

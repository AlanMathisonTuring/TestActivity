package com.nutegg.testactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void click(View v){
		Intent intent = new Intent();
		intent.setClassName(this, "com.nutegg.testactivity.TheOtherActivity");
		startActivity(intent);
	}

}

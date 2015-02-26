package com.nutegg.testactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TheOtherActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
	}
	
	public void openNet(View v){
		ConnectivityManager cm = (ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo info = cm.getActiveNetworkInfo();
		if(info != null && info.isConnected()){
			Toast.makeText(this, "网络可用!", Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(this, "网络不可用!", Toast.LENGTH_SHORT).show();
			Intent intent = new Intent();
			//intent.setClassName("com.android.settings", "com.android.settings.WirelessSettings");
			//startActivity(intent);
			//以上为显式意图激活网络设置界面
			//已下为隐式意图激活网络设置界面
			//Android4.0以后的版本需要以下判断
			if(android.os.Build.VERSION.SDK_INT > 10 ){
				//Android3.0以前
				startActivity(new Intent(android.provider.Settings.ACTION_SETTINGS));
			}else {
				startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
			}
			
		}
			
	}

}

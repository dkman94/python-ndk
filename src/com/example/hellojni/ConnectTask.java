package com.example.hellojni;

import android.os.AsyncTask;
import android.widget.TextView;

public class ConnectTask extends AsyncTask<String, String, TcpClient> {

	@Override
	protected TcpClient doInBackground(String... params) {
		
		//we create a TCPClient object
		TcpClient mTcpClient;
		
		mTcpClient = new TcpClient(new TcpClient.OnMessageReceived() {
			
			@Override
			public void messageReceived(String message) {
				publishProgress(message);				
			}
		});
	
		mTcpClient.run();
		
		return null;
	}
	
	protected void onProgressUpdate(String... values) {
		super.onProgressUpdate(values);
	}		

}


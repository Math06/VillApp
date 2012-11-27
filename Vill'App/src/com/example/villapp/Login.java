package com.example.villapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;

public class Login extends Activity {
	EditText txtUserName;
	EditText txtPassword;
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_login);

		txtUserName = (EditText) findViewById(R.id.txtUserName);
		txtPassword = (EditText) findViewById(R.id.txtPassword);

		Button btnConnexion;
		btnConnexion = (Button) findViewById(R.id.connexion);

		btnConnexion.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {


				Context context = getApplicationContext();
				// TODO Auto-generated method stub
				String username = txtUserName.getText().toString();
				String password = txtPassword.getText().toString();

				if(username.equals("test") && password.equals("test")){

					Toast.makeText( context , "Identifiant correct", Toast.LENGTH_LONG).show();

				}else{
					// username / password doesn't match
					Toast.makeText( context, "Veuillez creer un compte", Toast.LENGTH_LONG).show();
				}
			}

		});
	}
}

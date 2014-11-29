package com.example.raul.doctorinterface;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by jordycuan on 29/11/2014.
 */
public class PatientSendCommentActivity extends Activity {

	@InjectView(R.id.comment_text)
	EditText mCommentText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.patient_send_comment);

		ButterKnife.inject(this);
	}

	@OnClick(R.id.btn_enviar)
	public void sendText() {
		// Send text
		// TODO: Terminar
		Toast.makeText(this, mCommentText.getText().toString(), Toast.LENGTH_LONG).show();
	}
}

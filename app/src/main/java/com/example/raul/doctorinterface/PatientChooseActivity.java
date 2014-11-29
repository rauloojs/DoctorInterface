package com.example.raul.doctorinterface;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jordycuan on 29/11/2014.
 */
public class PatientChooseActivity extends ActionBarActivity {

	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(com.usuariode.symacli.R.layout.patient_selection);

		ButterKnife.inject(this);
	}

	@OnClick(com.usuariode.symacli.R.id.btn_new_checkin)
	public void newCheckIn() {
		Intent intent = new Intent(this, NewCheckInActivity.class);
		startActivity(intent);
	}

	@OnClick(com.usuariode.symacli.R.id.btn_comment_to_doctor)
	public void sendComment() {
		Intent intent = new Intent(this, PatientSendCommentActivity.class);
		startActivity(intent);
	}

	@OnClick(com.usuariode.symacli.R.id.btn_set_reminders)
	public void setReminders() {
		Intent intent = new Intent(this, SetRemindersActivity.class);
		startActivity(intent);
	}
}

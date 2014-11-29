package com.example.raul.doctorinterface;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by jordycuan on 29/11/2014.
 */
public class NewCheckInActivity extends Activity
		implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

	String which = "";
	private DatePickerDialog datePickerDialog;
	private TimePickerDialog timePickerDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// TODO Crear layout dinámicamente según lo que nos envie como respuesta el servidor

		/** Empieza la parte de los pickers */
		final Calendar c = Calendar.getInstance();

		// Setteamos la hora y fecha actual
		int mYear = c.get(Calendar.YEAR);
		int mMonth = c.get(Calendar.MONTH);
		int mDay = c.get(Calendar.DAY_OF_MONTH);
		int mHour = c.get(Calendar.HOUR_OF_DAY);
		int mMinute = c.get(Calendar.MINUTE);

		datePickerDialog = new DatePickerDialog(this, this, mYear, mMonth, mDay);
		datePickerDialog.show();

		timePickerDialog = new TimePickerDialog(this, this, mHour, mMinute, false);
	}


	public void onDateSet(DatePicker view, int year,
	                      int monthOfYear, int dayOfMonth) {
		// Internamente: solo la fecha se indexa desde 0
		which += (dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
		timePickerDialog.show();
	}

	@Override
	public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
		which += "\n\n" + (hourOfDay + ":" + minute);
		muestraResultados();
	}

	public void muestraResultados() {
		Toast.makeText(this, which, Toast.LENGTH_LONG).show();
	}
}

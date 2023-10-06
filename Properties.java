package com.mycompany.School_timetable;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.view.*;
import android.view.inputmethod.*;
import android.graphics.*;
import java.io.*;
import java.nio.charset.*;
import java.util.*;

public class Properties extends Activity
{
	private SharedPreferences mSettings;
	
	private int year_frst,month_frst,day_frst; //первый день,месяц,год учёбы (начало четверти)
	private String day1_1_S,day1_1_time_S,
	day1_2_S,day1_2_time_S,
	day1_3_S,day1_3_time_S,
	day1_4_S,day1_4_time_S,
	day1_5_S,day1_5_time_S,
	day1_6_S,day1_6_time_S,
	day1_7_S,day1_7_time_S,
	day1_8_S,day1_8_time_S,
	//Кружки после уроков
	day1_9_S, day1_9_time_S,
	day1_10_S,day1_10_time_S,
	day1_11_S,day1_11_time_S,
	day1_12_S,day1_12_time_S,
	
	day2_1_S,day2_1_time_S,
	day2_2_S,day2_2_time_S,
	day2_3_S,day2_3_time_S,
	day2_4_S,day2_4_time_S,
	day2_5_S,day2_5_time_S,
	day2_6_S,day2_6_time_S,
	day2_7_S,day2_7_time_S,
	day2_8_S,day2_8_time_S,
	//Кружки после уроков
	day2_9_S, day2_9_time_S,
	day2_10_S,day2_10_time_S,
	day2_11_S,day2_11_time_S,
	day2_12_S,day2_12_time_S,

	day3_1_S,day3_1_time_S,
	day3_2_S,day3_2_time_S,
	day3_3_S,day3_3_time_S,
	day3_4_S,day3_4_time_S,
	day3_5_S,day3_5_time_S,
	day3_6_S,day3_6_time_S,
	day3_7_S,day3_7_time_S,
	day3_8_S,day3_8_time_S,
	//Кружки после уроков
	day3_9_S, day3_9_time_S,
	day3_10_S,day3_10_time_S,
	day3_11_S,day3_11_time_S,
	day3_12_S,day3_12_time_S,
	
	day4_1_S,day4_1_time_S,
	day4_2_S,day4_2_time_S,
	day4_3_S,day4_3_time_S,
	day4_4_S,day4_4_time_S,
	day4_5_S,day4_5_time_S,
	day4_6_S,day4_6_time_S,
	day4_7_S,day4_7_time_S,
	day4_8_S,day4_8_time_S,
	//Кружки после уроков
	day4_9_S, day4_9_time_S,
	day4_10_S,day4_10_time_S,
	day4_11_S,day4_11_time_S,
	day4_12_S,day4_12_time_S,
	
	day5_1_S,day5_1_time_S,
	day5_2_S,day5_2_time_S,
	day5_3_S,day5_3_time_S,
	day5_4_S,day5_4_time_S,
	day5_5_S,day5_5_time_S,
	day5_6_S,day5_6_time_S,
	day5_7_S,day5_7_time_S,
	day5_8_S,day5_8_time_S,
	//Кружки после уроков
	day5_9_S, day5_9_time_S,
	day5_10_S,day5_10_time_S,
	day5_11_S,day5_11_time_S,
	day5_12_S,day5_12_time_S,
	
	day6_1_S,day6_1_time_S,
	day6_2_S,day6_2_time_S,
	day6_3_S,day6_3_time_S,
	day6_4_S,day6_4_time_S,
	day6_5_S,day6_5_time_S,
	day6_6_S,day6_6_time_S,
	day6_7_S,day6_7_time_S,
	day6_8_S,day6_8_time_S,
	//Кружки после уроков
	day6_9_S, day6_9_time_S,
	day6_10_S,day6_10_time_S,
	day6_11_S,day6_11_time_S,
	day6_12_S,day6_12_time_S,
	
	//Кружки после уроков
	day7_9_S, day7_9_time_S,
	day7_10_S,day7_10_time_S,
	day7_11_S,day7_11_time_S,
	day7_12_S,day7_12_time_S;
	
	EditText
	day1_1,day1_1_time,
	day1_2,day1_2_time,
	day1_3,day1_3_time,
	day1_4,day1_4_time,
	day1_5,day1_5_time,
	day1_6,day1_6_time,
	day1_7,day1_7_time,
	day1_8,day1_8_time,
	//Кружки после уроков
	day1_9, day1_9_time,
	day1_10,day1_10_time,
	day1_11,day1_11_time,
	day1_12,day1_12_time,
	
	day2_1,day2_1_time,
	day2_2,day2_2_time,
	day2_3,day2_3_time,
	day2_4,day2_4_time,
	day2_5,day2_5_time,
	day2_6,day2_6_time,
	day2_7,day2_7_time,
	day2_8,day2_8_time,
	//Кружки после уроков
	day2_9, day2_9_time,
	day2_10,day2_10_time,
	day2_11,day2_11_time,
	day2_12,day2_12_time,
	
	day3_1,day3_1_time,
	day3_2,day3_2_time,
	day3_3,day3_3_time,
	day3_4,day3_4_time,
	day3_5,day3_5_time,
	day3_6,day3_6_time,
	day3_7,day3_7_time,
	day3_8,day3_8_time,
	//Кружки после уроков
	day3_9, day3_9_time,
	day3_10,day3_10_time,
	day3_11,day3_11_time,
	day3_12,day3_12_time,
	
	day4_1,day4_1_time,
	day4_2,day4_2_time,
	day4_3,day4_3_time,
	day4_4,day4_4_time,
	day4_5,day4_5_time,
	day4_6,day4_6_time,
	day4_7,day4_7_time,
	day4_8,day4_8_time,
	//Кружки после уроков
	day4_9, day4_9_time,
	day4_10,day4_10_time,
	day4_11,day4_11_time,
	day4_12,day4_12_time,
	
	day5_1,day5_1_time,
	day5_2,day5_2_time,
	day5_3,day5_3_time,
	day5_4,day5_4_time,
	day5_5,day5_5_time,
	day5_6,day5_6_time,
	day5_7,day5_7_time,
	day5_8,day5_8_time,
	//Кружки после уроков
	day5_9, day5_9_time,
	day5_10,day5_10_time,
	day5_11,day5_11_time,
	day5_12,day5_12_time,
	
	day6_1,day6_1_time,
	day6_2,day6_2_time,
	day6_3,day6_3_time,
	day6_4,day6_4_time,
	day6_5,day6_5_time,
	day6_6,day6_6_time,
	day6_7,day6_7_time,
	day6_8,day6_8_time,
	//Кружки после уроков
	day6_9, day6_9_time,
	day6_10,day6_10_time,
	day6_11,day6_11_time,
	day6_12,day6_12_time,
	
	//Кружки после уроков
	day7_9, day7_9_time,
	day7_10,day7_10_time,
	day7_11,day7_11_time,
	day7_12,day7_12_time, SaveLoadPath_edt;
	
	CheckBox isLightTheme_chkBx;
	TextView frst_date_studng_txtV, autumnHolidays_txtV, winterHolidays_txtV, springHolidays_txtV;
	DatePicker frst_date_studng_DtPck, autumnHolidays_DtPck, winterHolidays_DtPck, springHolidays_DtPck;
	
	//Добавляем меню с настройками
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.help_menu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		Intent intent = new Intent(this,Help.class);
		startActivity(intent);
		return super.onOptionsItemSelected(item);
	}
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
		mSettings = getSharedPreferences("mysettings", Context.MODE_PRIVATE);
		if (mSettings.getBoolean("isLightTheme", false)) setTheme(R.style.AppTheme_Light);
		else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
		setContentView(R.layout.properties);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		
		day1_1=(EditText) findViewById(R.id.day1_1);day1_1_time=(EditText) findViewById(R.id.day1_1_time);
		day1_2=(EditText) findViewById(R.id.day1_2);day1_2_time=(EditText) findViewById(R.id.day1_2_time);
		day1_3=(EditText) findViewById(R.id.day1_3);day1_3_time=(EditText) findViewById(R.id.day1_3_time);
		day1_4=(EditText) findViewById(R.id.day1_4);day1_4_time=(EditText) findViewById(R.id.day1_4_time);
		day1_5=(EditText) findViewById(R.id.day1_5);day1_5_time=(EditText) findViewById(R.id.day1_5_time);
		day1_6=(EditText) findViewById(R.id.day1_6);day1_6_time=(EditText) findViewById(R.id.day1_6_time);
		day1_7=(EditText) findViewById(R.id.day1_7);day1_7_time=(EditText) findViewById(R.id.day1_7_time);
		day1_8=(EditText) findViewById(R.id.day1_8);day1_8_time=(EditText) findViewById(R.id.day1_8_time);
		//Кружки после уроков
		day1_9 =(EditText) findViewById(R.id.day1_9); day1_9_time= (EditText) findViewById(R.id.day1_9_time);
		day1_10=(EditText) findViewById(R.id.day1_10);day1_10_time=(EditText) findViewById(R.id.day1_10_time);
		day1_11=(EditText) findViewById(R.id.day1_11);day1_11_time=(EditText) findViewById(R.id.day1_11_time);
		day1_12=(EditText) findViewById(R.id.day1_12);day1_12_time=(EditText) findViewById(R.id.day1_12_time);
		
		day2_1=(EditText) findViewById(R.id.day2_1);day2_1_time=(EditText) findViewById(R.id.day2_1_time);
		day2_2=(EditText) findViewById(R.id.day2_2);day2_2_time=(EditText) findViewById(R.id.day2_2_time);
		day2_3=(EditText) findViewById(R.id.day2_3);day2_3_time=(EditText) findViewById(R.id.day2_3_time);
		day2_4=(EditText) findViewById(R.id.day2_4);day2_4_time=(EditText) findViewById(R.id.day2_4_time);
		day2_5=(EditText) findViewById(R.id.day2_5);day2_5_time=(EditText) findViewById(R.id.day2_5_time);
		day2_6=(EditText) findViewById(R.id.day2_6);day2_6_time=(EditText) findViewById(R.id.day2_6_time);
		day2_7=(EditText) findViewById(R.id.day2_7);day2_7_time=(EditText) findViewById(R.id.day2_7_time);
		day2_8=(EditText) findViewById(R.id.day2_8);day2_8_time=(EditText) findViewById(R.id.day2_8_time);
		//Кружки после уроков
		day2_9 =(EditText) findViewById(R.id.day2_9); day2_9_time= (EditText) findViewById(R.id.day2_9_time);
		day2_10=(EditText) findViewById(R.id.day2_10);day2_10_time=(EditText) findViewById(R.id.day2_10_time);
		day2_11=(EditText) findViewById(R.id.day2_11);day2_11_time=(EditText) findViewById(R.id.day2_11_time);
		day2_12=(EditText) findViewById(R.id.day2_12);day2_12_time=(EditText) findViewById(R.id.day2_12_time);
		
		day3_1=(EditText) findViewById(R.id.day3_1);day3_1_time=(EditText) findViewById(R.id.day3_1_time);
		day3_2=(EditText) findViewById(R.id.day3_2);day3_2_time=(EditText) findViewById(R.id.day3_2_time);
		day3_3=(EditText) findViewById(R.id.day3_3);day3_3_time=(EditText) findViewById(R.id.day3_3_time);
		day3_4=(EditText) findViewById(R.id.day3_4);day3_4_time=(EditText) findViewById(R.id.day3_4_time);
		day3_5=(EditText) findViewById(R.id.day3_5);day3_5_time=(EditText) findViewById(R.id.day3_5_time);
		day3_6=(EditText) findViewById(R.id.day3_6);day3_6_time=(EditText) findViewById(R.id.day3_6_time);
		day3_7=(EditText) findViewById(R.id.day3_7);day3_7_time=(EditText) findViewById(R.id.day3_7_time);
		day3_8=(EditText) findViewById(R.id.day3_8);day3_8_time=(EditText) findViewById(R.id.day3_8_time);
		//Кружки после уроков
		day3_9 =(EditText) findViewById(R.id.day3_9); day3_9_time= (EditText) findViewById(R.id.day3_9_time);
		day3_10=(EditText) findViewById(R.id.day3_10);day3_10_time=(EditText) findViewById(R.id.day3_10_time);
		day3_11=(EditText) findViewById(R.id.day3_11);day3_11_time=(EditText) findViewById(R.id.day3_11_time);
		day3_12=(EditText) findViewById(R.id.day3_12);day3_12_time=(EditText) findViewById(R.id.day3_12_time);
		
		day4_1=(EditText) findViewById(R.id.day4_1);day4_1_time=(EditText) findViewById(R.id.day4_1_time);
		day4_2=(EditText) findViewById(R.id.day4_2);day4_2_time=(EditText) findViewById(R.id.day4_2_time);
		day4_3=(EditText) findViewById(R.id.day4_3);day4_3_time=(EditText) findViewById(R.id.day4_3_time);
		day4_4=(EditText) findViewById(R.id.day4_4);day4_4_time=(EditText) findViewById(R.id.day4_4_time);
		day4_5=(EditText) findViewById(R.id.day4_5);day4_5_time=(EditText) findViewById(R.id.day4_5_time);
		day4_6=(EditText) findViewById(R.id.day4_6);day4_6_time=(EditText) findViewById(R.id.day4_6_time);
		day4_7=(EditText) findViewById(R.id.day4_7);day4_7_time=(EditText) findViewById(R.id.day4_7_time);
		day4_8=(EditText) findViewById(R.id.day4_8);day4_8_time=(EditText) findViewById(R.id.day4_8_time);
		//Кружки после уроков
		day4_9 =(EditText) findViewById(R.id.day4_9); day4_9_time= (EditText) findViewById(R.id.day4_9_time);
		day4_10=(EditText) findViewById(R.id.day4_10);day4_10_time=(EditText) findViewById(R.id.day4_10_time);
		day4_11=(EditText) findViewById(R.id.day4_11);day4_11_time=(EditText) findViewById(R.id.day4_11_time);
		day4_12=(EditText) findViewById(R.id.day4_12);day4_12_time=(EditText) findViewById(R.id.day4_12_time);
		
		day5_1=(EditText) findViewById(R.id.day5_1);day5_1_time=(EditText) findViewById(R.id.day5_1_time);
		day5_2=(EditText) findViewById(R.id.day5_2);day5_2_time=(EditText) findViewById(R.id.day5_2_time);
		day5_3=(EditText) findViewById(R.id.day5_3);day5_3_time=(EditText) findViewById(R.id.day5_3_time);
		day5_4=(EditText) findViewById(R.id.day5_4);day5_4_time=(EditText) findViewById(R.id.day5_4_time);
		day5_5=(EditText) findViewById(R.id.day5_5);day5_5_time=(EditText) findViewById(R.id.day5_5_time);
		day5_6=(EditText) findViewById(R.id.day5_6);day5_6_time=(EditText) findViewById(R.id.day5_6_time);
		day5_7=(EditText) findViewById(R.id.day5_7);day5_7_time=(EditText) findViewById(R.id.day5_7_time);
		day5_8=(EditText) findViewById(R.id.day5_8);day5_8_time=(EditText) findViewById(R.id.day5_8_time);
		//Кружки после уроков
		day5_9 =(EditText) findViewById(R.id.day5_9); day5_9_time= (EditText) findViewById(R.id.day5_9_time);
		day5_10=(EditText) findViewById(R.id.day5_10);day5_10_time=(EditText) findViewById(R.id.day5_10_time);
		day5_11=(EditText) findViewById(R.id.day5_11);day5_11_time=(EditText) findViewById(R.id.day5_11_time);
		day5_12=(EditText) findViewById(R.id.day5_12);day5_12_time=(EditText) findViewById(R.id.day5_12_time);
		
		day6_1=(EditText) findViewById(R.id.day6_1);day6_1_time=(EditText) findViewById(R.id.day6_1_time);
		day6_2=(EditText) findViewById(R.id.day6_2);day6_2_time=(EditText) findViewById(R.id.day6_2_time);
		day6_3=(EditText) findViewById(R.id.day6_3);day6_3_time=(EditText) findViewById(R.id.day6_3_time);
		day6_4=(EditText) findViewById(R.id.day6_4);day6_4_time=(EditText) findViewById(R.id.day6_4_time);
		day6_5=(EditText) findViewById(R.id.day6_5);day6_5_time=(EditText) findViewById(R.id.day6_5_time);
		day6_6=(EditText) findViewById(R.id.day6_6);day6_6_time=(EditText) findViewById(R.id.day6_6_time);
		day6_7=(EditText) findViewById(R.id.day6_7);day6_7_time=(EditText) findViewById(R.id.day6_7_time);
		day6_8=(EditText) findViewById(R.id.day6_8);day6_8_time=(EditText) findViewById(R.id.day6_8_time);
		//Кружки после уроков
		day6_9 =(EditText) findViewById(R.id.day6_9); day6_9_time= (EditText) findViewById(R.id.day6_9_time);
		day6_10=(EditText) findViewById(R.id.day6_10);day6_10_time=(EditText) findViewById(R.id.day6_10_time);
		day6_11=(EditText) findViewById(R.id.day6_11);day6_11_time=(EditText) findViewById(R.id.day6_11_time);
		day6_12=(EditText) findViewById(R.id.day6_12);day6_12_time=(EditText) findViewById(R.id.day6_12_time);
		
		//Кружки после уроков
		day7_9 =(EditText) findViewById(R.id.day7_9); day7_9_time= (EditText) findViewById(R.id.day7_9_time);
		day7_10=(EditText) findViewById(R.id.day7_10);day7_10_time=(EditText) findViewById(R.id.day7_10_time);
		day7_11=(EditText) findViewById(R.id.day7_11);day7_11_time=(EditText) findViewById(R.id.day7_11_time);
		day7_12=(EditText) findViewById(R.id.day7_12);day7_12_time=(EditText) findViewById(R.id.day7_12_time);
		
		isLightTheme_chkBx = (CheckBox) findViewById(R.id.isLightTheme_chkBx);
		frst_date_studng_txtV=(TextView) findViewById(R.id.frst_date_studng_txtV);
		frst_date_studng_DtPck=(DatePicker) findViewById(R.id.frst_date_studng_DtPck);
		autumnHolidays_txtV = (TextView) findViewById(R.id.autumnHolidays_txtV);
		autumnHolidays_DtPck = (DatePicker) findViewById(R.id.autumnHolidays_DtPck);
		winterHolidays_txtV = (TextView) findViewById(R.id.winterHolidays_txtV);
		winterHolidays_DtPck = (DatePicker) findViewById(R.id.winterHolidays_DtPck);
		springHolidays_txtV = (TextView) findViewById(R.id.springHolidays_txtV);
		springHolidays_DtPck = (DatePicker) findViewById(R.id.springHolidays_DtPck);
		
		SaveLoadPath_edt=(EditText) findViewById(R.id.SaveLoadPath_edt);
	}
	
	@Override
    protected void onResume() {
        super.onResume();
		isLightTheme_chkBx.setChecked(mSettings.getBoolean("isLightTheme", false));
		year_frst=mSettings.getInt("year_frst",frst_date_studng_DtPck.getYear());
		month_frst=mSettings.getInt("month_frst",frst_date_studng_DtPck.getMonth());
		day_frst=mSettings.getInt("day_frst",frst_date_studng_DtPck.getDayOfMonth());
		frst_date_studng_DtPck.init(year_frst,month_frst,day_frst,null);
		frst_date_studng_txtV.setText("Начало четверти: "+day_frst+"-"+(month_frst+1)+"-"+year_frst); //т.к. месяц отсчитывается с нуля,то надо "+1"
		autumnHolidays_DtPck.init(mSettings.getInt("autumnHolidays_year", autumnHolidays_DtPck.getYear()), mSettings.getInt("autumnHolidays_month", autumnHolidays_DtPck.getMonth()), mSettings.getInt("autumnHolidays_day", autumnHolidays_DtPck.getDayOfMonth()), null);
		autumnHolidays_txtV.setText("Начало осенних каникул: " + autumnHolidays_DtPck.getDayOfMonth() + "-" + (autumnHolidays_DtPck.getMonth() + 1) + "-" + autumnHolidays_DtPck.getYear());
		winterHolidays_DtPck.init(mSettings.getInt("winterHolidays_year", winterHolidays_DtPck.getYear()), mSettings.getInt("winterHolidays_month", winterHolidays_DtPck.getMonth()), mSettings.getInt("winterHolidays_day", winterHolidays_DtPck.getDayOfMonth()), null);
		winterHolidays_txtV.setText("Начало зимних каникул: " + winterHolidays_DtPck.getDayOfMonth() + "-" + (winterHolidays_DtPck.getMonth() + 1) + "-" + winterHolidays_DtPck.getYear());
		springHolidays_DtPck.init(mSettings.getInt("springHolidays_year", springHolidays_DtPck.getYear()), mSettings.getInt("springHolidays_month", springHolidays_DtPck.getMonth()), mSettings.getInt("springHolidays_day", springHolidays_DtPck.getDayOfMonth()), null);
		springHolidays_txtV.setText("Начало весенних каникул: " + springHolidays_DtPck.getDayOfMonth() + "-" + (springHolidays_DtPck.getMonth() + 1) + "-" + springHolidays_DtPck.getYear());
		
	  	//Получаем число из настроек
		day1_1_S = mSettings.getString("day1_1", "");day1_1.setText(day1_1_S); day1_1_time_S = mSettings.getString("day1_1_time", "");day1_1_time.setText(day1_1_time_S);
		day1_2_S = mSettings.getString("day1_2", "");day1_2.setText(day1_2_S); day1_2_time_S = mSettings.getString("day1_2_time", "");day1_2_time.setText(day1_2_time_S);
		day1_3_S = mSettings.getString("day1_3", "");day1_3.setText(day1_3_S); day1_3_time_S = mSettings.getString("day1_3_time", "");day1_3_time.setText(day1_3_time_S);
		day1_4_S = mSettings.getString("day1_4", "");day1_4.setText(day1_4_S); day1_4_time_S = mSettings.getString("day1_4_time", "");day1_4_time.setText(day1_4_time_S);
		day1_5_S = mSettings.getString("day1_5", "");day1_5.setText(day1_5_S); day1_5_time_S = mSettings.getString("day1_5_time", "");day1_5_time.setText(day1_5_time_S);
		day1_6_S = mSettings.getString("day1_6", "");day1_6.setText(day1_6_S); day1_6_time_S = mSettings.getString("day1_6_time", "");day1_6_time.setText(day1_6_time_S);
		day1_7_S = mSettings.getString("day1_7", "");day1_7.setText(day1_7_S); day1_7_time_S = mSettings.getString("day1_7_time", "");day1_7_time.setText(day1_7_time_S);
		day1_8_S = mSettings.getString("day1_8", "");day1_8.setText(day1_8_S); day1_8_time_S = mSettings.getString("day1_8_time", "");day1_8_time.setText(day1_8_time_S);
		//Кружки
		day1_9_S  = mSettings.getString("day1_9",  "");day1_9.setText(day1_9_S);   day1_9_time_S  = mSettings.getString("day1_9_time", ""); day1_9_time.setText(day1_9_time_S);
		day1_10_S = mSettings.getString("day1_10", "");day1_10.setText(day1_10_S); day1_10_time_S = mSettings.getString("day1_10_time", "");day1_10_time.setText(day1_10_time_S);
		day1_11_S = mSettings.getString("day1_11", "");day1_11.setText(day1_11_S); day1_11_time_S = mSettings.getString("day1_11_time", "");day1_11_time.setText(day1_11_time_S);
		day1_12_S = mSettings.getString("day1_12", "");day1_12.setText(day1_12_S); day1_12_time_S = mSettings.getString("day1_12_time", "");day1_12_time.setText(day1_12_time_S);
		
		day2_1_S = mSettings.getString("day2_1", "");day2_1.setText(day2_1_S); day2_1_time_S = mSettings.getString("day2_1_time", "");day2_1_time.setText(day2_1_time_S);
		day2_2_S = mSettings.getString("day2_2", "");day2_2.setText(day2_2_S); day2_2_time_S = mSettings.getString("day2_2_time", "");day2_2_time.setText(day2_2_time_S);
		day2_3_S = mSettings.getString("day2_3", "");day2_3.setText(day2_3_S); day2_3_time_S = mSettings.getString("day2_3_time", "");day2_3_time.setText(day2_3_time_S);
		day2_4_S = mSettings.getString("day2_4", "");day2_4.setText(day2_4_S); day2_4_time_S = mSettings.getString("day2_4_time", "");day2_4_time.setText(day2_4_time_S);
		day2_5_S = mSettings.getString("day2_5", "");day2_5.setText(day2_5_S); day2_5_time_S = mSettings.getString("day2_5_time", "");day2_5_time.setText(day2_5_time_S);
		day2_6_S = mSettings.getString("day2_6", "");day2_6.setText(day2_6_S); day2_6_time_S = mSettings.getString("day2_6_time", "");day2_6_time.setText(day2_6_time_S);
		day2_7_S = mSettings.getString("day2_7", "");day2_7.setText(day2_7_S); day2_7_time_S = mSettings.getString("day2_7_time", "");day2_7_time.setText(day2_7_time_S);
		day2_8_S = mSettings.getString("day2_8", "");day2_8.setText(day2_8_S); day2_8_time_S = mSettings.getString("day2_8_time", "");day2_8_time.setText(day2_8_time_S);
		//Кружки
		day2_9_S  = mSettings.getString("day2_9",  "");day2_9.setText(day2_9_S);   day2_9_time_S  = mSettings.getString("day2_9_time", ""); day2_9_time.setText(day2_9_time_S);
		day2_10_S = mSettings.getString("day2_10", "");day2_10.setText(day2_10_S); day2_10_time_S = mSettings.getString("day2_10_time", "");day2_10_time.setText(day2_10_time_S);
		day2_11_S = mSettings.getString("day2_11", "");day2_11.setText(day2_11_S); day2_11_time_S = mSettings.getString("day2_11_time", "");day2_11_time.setText(day2_11_time_S);
		day2_12_S = mSettings.getString("day2_12", "");day2_12.setText(day2_12_S); day2_12_time_S = mSettings.getString("day2_12_time", "");day2_12_time.setText(day2_12_time_S);
		
		day3_1_S = mSettings.getString("day3_1", "");day3_1.setText(day3_1_S); day3_1_time_S = mSettings.getString("day3_1_time", "");day3_1_time.setText(day3_1_time_S);
		day3_2_S = mSettings.getString("day3_2", "");day3_2.setText(day3_2_S); day3_2_time_S = mSettings.getString("day3_2_time", "");day3_2_time.setText(day3_2_time_S);
		day3_3_S = mSettings.getString("day3_3", "");day3_3.setText(day3_3_S); day3_3_time_S = mSettings.getString("day3_3_time", "");day3_3_time.setText(day3_3_time_S);
		day3_4_S = mSettings.getString("day3_4", "");day3_4.setText(day3_4_S); day3_4_time_S = mSettings.getString("day3_4_time", "");day3_4_time.setText(day3_4_time_S);
		day3_5_S = mSettings.getString("day3_5", "");day3_5.setText(day3_5_S); day3_5_time_S = mSettings.getString("day3_5_time", "");day3_5_time.setText(day3_5_time_S);
		day3_6_S = mSettings.getString("day3_6", "");day3_6.setText(day3_6_S); day3_6_time_S = mSettings.getString("day3_6_time", "");day3_6_time.setText(day3_6_time_S);
		day3_7_S = mSettings.getString("day3_7", "");day3_7.setText(day3_7_S); day3_7_time_S = mSettings.getString("day3_7_time", "");day3_7_time.setText(day3_7_time_S);
		day3_8_S = mSettings.getString("day3_8", "");day3_8.setText(day3_8_S); day3_8_time_S = mSettings.getString("day3_8_time", "");day3_8_time.setText(day3_8_time_S);
		//Кружки
		day3_9_S  = mSettings.getString("day3_9",  "");day3_9.setText(day3_9_S);   day3_9_time_S  = mSettings.getString("day3_9_time", ""); day3_9_time.setText(day3_9_time_S);
		day3_10_S = mSettings.getString("day3_10", "");day3_10.setText(day3_10_S); day3_10_time_S = mSettings.getString("day3_10_time", "");day3_10_time.setText(day3_10_time_S);
		day3_11_S = mSettings.getString("day3_11", "");day3_11.setText(day3_11_S); day3_11_time_S = mSettings.getString("day3_11_time", "");day3_11_time.setText(day3_11_time_S);
		day3_12_S = mSettings.getString("day3_12", "");day3_12.setText(day3_12_S); day3_12_time_S = mSettings.getString("day3_12_time", "");day3_12_time.setText(day3_12_time_S);
		
		day4_1_S = mSettings.getString("day4_1", "");day4_1.setText(day4_1_S); day4_1_time_S = mSettings.getString("day4_1_time", "");day4_1_time.setText(day4_1_time_S);
		day4_2_S = mSettings.getString("day4_2", "");day4_2.setText(day4_2_S); day4_2_time_S = mSettings.getString("day4_2_time", "");day4_2_time.setText(day4_2_time_S);
		day4_3_S = mSettings.getString("day4_3", "");day4_3.setText(day4_3_S); day4_3_time_S = mSettings.getString("day4_3_time", "");day4_3_time.setText(day4_3_time_S);
		day4_4_S = mSettings.getString("day4_4", "");day4_4.setText(day4_4_S); day4_4_time_S = mSettings.getString("day4_4_time", "");day4_4_time.setText(day4_4_time_S);
		day4_5_S = mSettings.getString("day4_5", "");day4_5.setText(day4_5_S); day4_5_time_S = mSettings.getString("day4_5_time", "");day4_5_time.setText(day4_5_time_S);
		day4_6_S = mSettings.getString("day4_6", "");day4_6.setText(day4_6_S); day4_6_time_S = mSettings.getString("day4_6_time", "");day4_6_time.setText(day4_6_time_S);
		day4_7_S = mSettings.getString("day4_7", "");day4_7.setText(day4_7_S); day4_7_time_S = mSettings.getString("day4_7_time", "");day4_7_time.setText(day4_7_time_S);
		day4_8_S = mSettings.getString("day4_8", "");day4_8.setText(day4_8_S); day4_8_time_S = mSettings.getString("day4_8_time", "");day4_8_time.setText(day4_8_time_S);
		//Кружки
		day4_9_S  = mSettings.getString("day4_9",  "");day4_9.setText(day4_9_S);   day4_9_time_S  = mSettings.getString("day4_9_time", ""); day4_9_time.setText(day4_9_time_S);
		day4_10_S = mSettings.getString("day4_10", "");day4_10.setText(day4_10_S); day4_10_time_S = mSettings.getString("day4_10_time", "");day4_10_time.setText(day4_10_time_S);
		day4_11_S = mSettings.getString("day4_11", "");day4_11.setText(day4_11_S); day4_11_time_S = mSettings.getString("day4_11_time", "");day4_11_time.setText(day4_11_time_S);
		day4_12_S = mSettings.getString("day4_12", "");day4_12.setText(day4_12_S); day4_12_time_S = mSettings.getString("day4_12_time", "");day4_12_time.setText(day4_12_time_S);
		
		day5_1_S = mSettings.getString("day5_1", "");day5_1.setText(day5_1_S); day5_1_time_S = mSettings.getString("day5_1_time", "");day5_1_time.setText(day5_1_time_S);
		day5_2_S = mSettings.getString("day5_2", "");day5_2.setText(day5_2_S); day5_2_time_S = mSettings.getString("day5_2_time", "");day5_2_time.setText(day5_2_time_S);
		day5_3_S = mSettings.getString("day5_3", "");day5_3.setText(day5_3_S); day5_3_time_S = mSettings.getString("day5_3_time", "");day5_3_time.setText(day5_3_time_S);
		day5_4_S = mSettings.getString("day5_4", "");day5_4.setText(day5_4_S); day5_4_time_S = mSettings.getString("day5_4_time", "");day5_4_time.setText(day5_4_time_S);
		day5_5_S = mSettings.getString("day5_5", "");day5_5.setText(day5_5_S); day5_5_time_S = mSettings.getString("day5_5_time", "");day5_5_time.setText(day5_5_time_S);
		day5_6_S = mSettings.getString("day5_6", "");day5_6.setText(day5_6_S); day5_6_time_S = mSettings.getString("day5_6_time", "");day5_6_time.setText(day5_6_time_S);
		day5_7_S = mSettings.getString("day5_7", "");day5_7.setText(day5_7_S); day5_7_time_S = mSettings.getString("day5_7_time", "");day5_7_time.setText(day5_7_time_S);
		day5_8_S = mSettings.getString("day5_8", "");day5_8.setText(day5_8_S); day5_8_time_S = mSettings.getString("day5_8_time", "");day5_8_time.setText(day5_8_time_S);
		//Кружки
		day5_9_S  = mSettings.getString("day5_9",  "");day5_9.setText(day5_9_S);   day5_9_time_S  = mSettings.getString("day5_9_time", ""); day5_9_time.setText(day5_9_time_S);
		day5_10_S = mSettings.getString("day5_10", "");day5_10.setText(day5_10_S); day5_10_time_S = mSettings.getString("day5_10_time", "");day5_10_time.setText(day5_10_time_S);
		day5_11_S = mSettings.getString("day5_11", "");day5_11.setText(day5_11_S); day5_11_time_S = mSettings.getString("day5_11_time", "");day5_11_time.setText(day5_11_time_S);
		day5_12_S = mSettings.getString("day5_12", "");day5_12.setText(day5_12_S); day5_12_time_S = mSettings.getString("day5_12_time", "");day5_12_time.setText(day5_12_time_S);
		
		day6_1_S = mSettings.getString("day6_1", "");day6_1.setText(day6_1_S); day6_1_time_S = mSettings.getString("day6_1_time", "");day6_1_time.setText(day6_1_time_S);
		day6_2_S = mSettings.getString("day6_2", "");day6_2.setText(day6_2_S); day6_2_time_S = mSettings.getString("day6_2_time", "");day6_2_time.setText(day6_2_time_S);
		day6_3_S = mSettings.getString("day6_3", "");day6_3.setText(day6_3_S); day6_3_time_S = mSettings.getString("day6_3_time", "");day6_3_time.setText(day6_3_time_S);
		day6_4_S = mSettings.getString("day6_4", "");day6_4.setText(day6_4_S); day6_4_time_S = mSettings.getString("day6_4_time", "");day6_4_time.setText(day6_4_time_S);
		day6_5_S = mSettings.getString("day6_5", "");day6_5.setText(day6_5_S); day6_5_time_S = mSettings.getString("day6_5_time", "");day6_5_time.setText(day6_5_time_S);
		day6_6_S = mSettings.getString("day6_6", "");day6_6.setText(day6_6_S); day6_6_time_S = mSettings.getString("day6_6_time", "");day6_6_time.setText(day6_6_time_S);
		day6_7_S = mSettings.getString("day6_7", "");day6_7.setText(day6_7_S); day6_7_time_S = mSettings.getString("day6_7_time", "");day6_7_time.setText(day6_7_time_S);
		day6_8_S = mSettings.getString("day6_8", "");day6_8.setText(day6_8_S); day6_8_time_S = mSettings.getString("day6_8_time", "");day6_8_time.setText(day6_8_time_S);
		//Кружки
		day6_9_S  = mSettings.getString("day6_9",  "");day6_9.setText(day6_9_S);   day6_9_time_S  = mSettings.getString("day6_9_time", ""); day6_9_time.setText(day6_9_time_S);
		day6_10_S = mSettings.getString("day6_10", "");day6_10.setText(day6_10_S); day6_10_time_S = mSettings.getString("day6_10_time", "");day6_10_time.setText(day6_10_time_S);
		day6_11_S = mSettings.getString("day6_11", "");day6_11.setText(day6_11_S); day6_11_time_S = mSettings.getString("day6_11_time", "");day6_11_time.setText(day6_11_time_S);
		day6_12_S = mSettings.getString("day6_12", "");day6_12.setText(day6_12_S); day6_12_time_S = mSettings.getString("day6_12_time", "");day6_12_time.setText(day6_12_time_S);
		
		//Кружки
		day7_9_S  = mSettings.getString("day7_9",  "");day7_9.setText(day7_9_S);   day7_9_time_S  = mSettings.getString("day7_9_time", ""); day7_9_time.setText(day7_9_time_S);
		day7_10_S = mSettings.getString("day7_10", "");day7_10.setText(day7_10_S); day7_10_time_S = mSettings.getString("day7_10_time", "");day7_10_time.setText(day7_10_time_S);
		day7_11_S = mSettings.getString("day7_11", "");day7_11.setText(day7_11_S); day7_11_time_S = mSettings.getString("day7_11_time", "");day7_11_time.setText(day7_11_time_S);
		day7_12_S = mSettings.getString("day7_12", "");day7_12.setText(day7_12_S); day7_12_time_S = mSettings.getString("day7_12_time", "");day7_12_time.setText(day7_12_time_S);
	}
	
	@Override
    protected void onPause() {
        super.onPause();
		// Запоминаем данные
		day1_1_S=correct_str(day1_1.getText().toString()); day1_1_time_S=correct_time(day1_1_time.getText().toString());
		day1_2_S=correct_str(day1_2.getText().toString()); day1_2_time_S=correct_time(day1_2_time.getText().toString());
		day1_3_S=correct_str(day1_3.getText().toString()); day1_3_time_S=correct_time(day1_3_time.getText().toString());
		day1_4_S=correct_str(day1_4.getText().toString()); day1_4_time_S=correct_time(day1_4_time.getText().toString());
		day1_5_S=correct_str(day1_5.getText().toString()); day1_5_time_S=correct_time(day1_5_time.getText().toString());
		day1_6_S=correct_str(day1_6.getText().toString()); day1_6_time_S=correct_time(day1_6_time.getText().toString());
		day1_7_S=correct_str(day1_7.getText().toString()); day1_7_time_S=correct_time(day1_7_time.getText().toString());
		day1_8_S=correct_str(day1_8.getText().toString()); day1_8_time_S=correct_time(day1_8_time.getText().toString());
		//Кружки
		day1_9_S =correct_str(day1_9.getText().toString());  day1_9_time_S =correct_time(day1_9_time.getText().toString());
		day1_10_S=correct_str(day1_10.getText().toString()); day1_10_time_S=correct_time(day1_10_time.getText().toString());
		day1_11_S=correct_str(day1_11.getText().toString()); day1_11_time_S=correct_time(day1_11_time.getText().toString());
		day1_12_S=correct_str(day1_12.getText().toString()); day1_12_time_S=correct_time(day1_12_time.getText().toString());
		
		day2_1_S=correct_str(day2_1.getText().toString()); day2_1_time_S=correct_time(day2_1_time.getText().toString());
		day2_2_S=correct_str(day2_2.getText().toString()); day2_2_time_S=correct_time(day2_2_time.getText().toString());
		day2_3_S=correct_str(day2_3.getText().toString()); day2_3_time_S=correct_time(day2_3_time.getText().toString());
		day2_4_S=correct_str(day2_4.getText().toString()); day2_4_time_S=correct_time(day2_4_time.getText().toString());
		day2_5_S=correct_str(day2_5.getText().toString()); day2_5_time_S=correct_time(day2_5_time.getText().toString());
		day2_6_S=correct_str(day2_6.getText().toString()); day2_6_time_S=correct_time(day2_6_time.getText().toString());
		day2_7_S=correct_str(day2_7.getText().toString()); day2_7_time_S=correct_time(day2_7_time.getText().toString());
		day2_8_S=correct_str(day2_8.getText().toString()); day2_8_time_S=correct_time(day2_8_time.getText().toString());
		//Кружки
		day2_9_S =correct_str(day2_9.getText().toString());  day2_9_time_S =correct_time(day2_9_time.getText().toString());
		day2_10_S=correct_str(day2_10.getText().toString()); day2_10_time_S=correct_time(day2_10_time.getText().toString());
		day2_11_S=correct_str(day2_11.getText().toString()); day2_11_time_S=correct_time(day2_11_time.getText().toString());
		day2_12_S=correct_str(day2_12.getText().toString()); day2_12_time_S=correct_time(day2_12_time.getText().toString());
		
		day3_1_S=correct_str(day3_1.getText().toString()); day3_1_time_S=correct_time(day3_1_time.getText().toString());
		day3_2_S=correct_str(day3_2.getText().toString()); day3_2_time_S=correct_time(day3_2_time.getText().toString());
		day3_3_S=correct_str(day3_3.getText().toString()); day3_3_time_S=correct_time(day3_3_time.getText().toString());
		day3_4_S=correct_str(day3_4.getText().toString()); day3_4_time_S=correct_time(day3_4_time.getText().toString());
		day3_5_S=correct_str(day3_5.getText().toString()); day3_5_time_S=correct_time(day3_5_time.getText().toString());
		day3_6_S=correct_str(day3_6.getText().toString()); day3_6_time_S=correct_time(day3_6_time.getText().toString());
		day3_7_S=correct_str(day3_7.getText().toString()); day3_7_time_S=correct_time(day3_7_time.getText().toString());
		day3_8_S=correct_str(day3_8.getText().toString()); day3_8_time_S=correct_time(day3_8_time.getText().toString());
		//Кружки
		day3_9_S =correct_str(day3_9.getText().toString());  day3_9_time_S =correct_time(day3_9_time.getText().toString());
		day3_10_S=correct_str(day3_10.getText().toString()); day3_10_time_S=correct_time(day3_10_time.getText().toString());
		day3_11_S=correct_str(day3_11.getText().toString()); day3_11_time_S=correct_time(day3_11_time.getText().toString());
		day3_12_S=correct_str(day3_12.getText().toString()); day3_12_time_S=correct_time(day3_12_time.getText().toString());
		
		day4_1_S=correct_str(day4_1.getText().toString()); day4_1_time_S=correct_time(day4_1_time.getText().toString());
		day4_2_S=correct_str(day4_2.getText().toString()); day4_2_time_S=correct_time(day4_2_time.getText().toString());
		day4_3_S=correct_str(day4_3.getText().toString()); day4_3_time_S=correct_time(day4_3_time.getText().toString());
		day4_4_S=correct_str(day4_4.getText().toString()); day4_4_time_S=correct_time(day4_4_time.getText().toString());
		day4_5_S=correct_str(day4_5.getText().toString()); day4_5_time_S=correct_time(day4_5_time.getText().toString());
		day4_6_S=correct_str(day4_6.getText().toString()); day4_6_time_S=correct_time(day4_6_time.getText().toString());
		day4_7_S=correct_str(day4_7.getText().toString()); day4_7_time_S=correct_time(day4_7_time.getText().toString());
		day4_8_S=correct_str(day4_8.getText().toString()); day4_8_time_S=correct_time(day4_8_time.getText().toString());
		//Кружки
		day4_9_S =correct_str(day4_9.getText().toString());  day4_9_time_S =correct_time(day4_9_time.getText().toString());
		day4_10_S=correct_str(day4_10.getText().toString()); day4_10_time_S=correct_time(day4_10_time.getText().toString());
		day4_11_S=correct_str(day4_11.getText().toString()); day4_11_time_S=correct_time(day4_11_time.getText().toString());
		day4_12_S=correct_str(day4_12.getText().toString()); day4_12_time_S=correct_time(day4_12_time.getText().toString());
		
		day5_1_S=correct_str(day5_1.getText().toString()); day5_1_time_S=correct_time(day5_1_time.getText().toString());
		day5_2_S=correct_str(day5_2.getText().toString()); day5_2_time_S=correct_time(day5_2_time.getText().toString());
		day5_3_S=correct_str(day5_3.getText().toString()); day5_3_time_S=correct_time(day5_3_time.getText().toString());
		day5_4_S=correct_str(day5_4.getText().toString()); day5_4_time_S=correct_time(day5_4_time.getText().toString());
		day5_5_S=correct_str(day5_5.getText().toString()); day5_5_time_S=correct_time(day5_5_time.getText().toString());
		day5_6_S=correct_str(day5_6.getText().toString()); day5_6_time_S=correct_time(day5_6_time.getText().toString());
		day5_7_S=correct_str(day5_7.getText().toString()); day5_7_time_S=correct_time(day5_7_time.getText().toString());
		day5_8_S=correct_str(day5_8.getText().toString()); day5_8_time_S=correct_time(day5_8_time.getText().toString());
		//Кружки
		day5_9_S =correct_str(day5_9.getText().toString());  day5_9_time_S =correct_time(day5_9_time.getText().toString());
		day5_10_S=correct_str(day5_10.getText().toString()); day5_10_time_S=correct_time(day5_10_time.getText().toString());
		day5_11_S=correct_str(day5_11.getText().toString()); day5_11_time_S=correct_time(day5_11_time.getText().toString());
		day5_12_S=correct_str(day5_12.getText().toString()); day5_12_time_S=correct_time(day5_12_time.getText().toString());
		
		day6_1_S=correct_str(day6_1.getText().toString()); day6_1_time_S=correct_time(day6_1_time.getText().toString());
		day6_2_S=correct_str(day6_2.getText().toString()); day6_2_time_S=correct_time(day6_2_time.getText().toString());
		day6_3_S=correct_str(day6_3.getText().toString()); day6_3_time_S=correct_time(day6_3_time.getText().toString());
		day6_4_S=correct_str(day6_4.getText().toString()); day6_4_time_S=correct_time(day6_4_time.getText().toString());
		day6_5_S=correct_str(day6_5.getText().toString()); day6_5_time_S=correct_time(day6_5_time.getText().toString());
		day6_6_S=correct_str(day6_6.getText().toString()); day6_6_time_S=correct_time(day6_6_time.getText().toString());
		day6_7_S=correct_str(day6_7.getText().toString()); day6_7_time_S=correct_time(day6_7_time.getText().toString());
		day6_8_S=correct_str(day6_8.getText().toString()); day6_8_time_S=correct_time(day6_8_time.getText().toString());
		//Кружки
		day6_9_S =correct_str(day6_9.getText().toString());  day6_9_time_S =correct_time(day6_9_time.getText().toString());
		day6_10_S=correct_str(day6_10.getText().toString()); day6_10_time_S=correct_time(day6_10_time.getText().toString());
		day6_11_S=correct_str(day6_11.getText().toString()); day6_11_time_S=correct_time(day6_11_time.getText().toString());
		day6_12_S=correct_str(day6_12.getText().toString()); day6_12_time_S=correct_time(day6_12_time.getText().toString());
		
		//Кружки
		day7_9_S =correct_str(day7_9.getText().toString());  day7_9_time_S =correct_time(day7_9_time.getText().toString());
		day7_10_S=correct_str(day7_10.getText().toString()); day7_10_time_S=correct_time(day7_10_time.getText().toString());
		day7_11_S=correct_str(day7_11.getText().toString()); day7_11_time_S=correct_time(day7_11_time.getText().toString());
		day7_12_S=correct_str(day7_12.getText().toString()); day7_12_time_S=correct_time(day7_12_time.getText().toString());
		
		year_frst=frst_date_studng_DtPck.getYear();month_frst=frst_date_studng_DtPck.getMonth();day_frst=frst_date_studng_DtPck.getDayOfMonth();

		SharedPreferences.Editor editor = mSettings.edit();
		editor.putString("day1_1", day1_1_S); editor.putString("day1_1_time", day1_1_time_S);
		editor.putString("day1_2", day1_2_S); editor.putString("day1_2_time", day1_2_time_S);
		editor.putString("day1_3", day1_3_S); editor.putString("day1_3_time", day1_3_time_S);
		editor.putString("day1_4", day1_4_S); editor.putString("day1_4_time", day1_4_time_S);
		editor.putString("day1_5", day1_5_S); editor.putString("day1_5_time", day1_5_time_S);
		editor.putString("day1_6", day1_6_S); editor.putString("day1_6_time", day1_6_time_S);
		editor.putString("day1_7", day1_7_S); editor.putString("day1_7_time", day1_7_time_S);
		editor.putString("day1_8", day1_8_S); editor.putString("day1_8_time", day1_8_time_S);
		//Кружки
		editor.putString("day1_9",  day1_9_S);  editor.putString("day1_9_time",  day1_9_time_S);
		editor.putString("day1_10", day1_10_S); editor.putString("day1_10_time", day1_10_time_S);
		editor.putString("day1_11", day1_11_S); editor.putString("day1_11_time", day1_11_time_S);
		editor.putString("day1_12", day1_12_S); editor.putString("day1_12_time", day1_12_time_S);
		
		editor.putString("day2_1", day2_1_S); editor.putString("day2_1_time", day2_1_time_S);
		editor.putString("day2_2", day2_2_S); editor.putString("day2_2_time", day2_2_time_S);
		editor.putString("day2_3", day2_3_S); editor.putString("day2_3_time", day2_3_time_S);
		editor.putString("day2_4", day2_4_S); editor.putString("day2_4_time", day2_4_time_S);
		editor.putString("day2_5", day2_5_S); editor.putString("day2_5_time", day2_5_time_S);
		editor.putString("day2_6", day2_6_S); editor.putString("day2_6_time", day2_6_time_S);
		editor.putString("day2_7", day2_7_S); editor.putString("day2_7_time", day2_7_time_S);
		editor.putString("day2_8", day2_8_S); editor.putString("day2_8_time", day2_8_time_S);
		//Кружки
		editor.putString("day2_9",  day2_9_S);  editor.putString("day2_9_time",  day2_9_time_S);
		editor.putString("day2_10", day2_10_S); editor.putString("day2_10_time", day2_10_time_S);
		editor.putString("day2_11", day2_11_S); editor.putString("day2_11_time", day2_11_time_S);
		editor.putString("day2_12", day2_12_S); editor.putString("day2_12_time", day2_12_time_S);
		
		editor.putString("day3_1", day3_1_S); editor.putString("day3_1_time", day3_1_time_S);
		editor.putString("day3_2", day3_2_S); editor.putString("day3_2_time", day3_2_time_S);
		editor.putString("day3_3", day3_3_S); editor.putString("day3_3_time", day3_3_time_S);
		editor.putString("day3_4", day3_4_S); editor.putString("day3_4_time", day3_4_time_S);
		editor.putString("day3_5", day3_5_S); editor.putString("day3_5_time", day3_5_time_S);
		editor.putString("day3_6", day3_6_S); editor.putString("day3_6_time", day3_6_time_S);
		editor.putString("day3_7", day3_7_S); editor.putString("day3_7_time", day3_7_time_S);
		editor.putString("day3_8", day3_8_S); editor.putString("day3_8_time", day3_8_time_S);
		//Кружки
		editor.putString("day3_9",  day3_9_S);  editor.putString("day3_9_time",  day3_9_time_S);
		editor.putString("day3_10", day3_10_S); editor.putString("day3_10_time", day3_10_time_S);
		editor.putString("day3_11", day3_11_S); editor.putString("day3_11_time", day3_11_time_S);
		editor.putString("day3_12", day3_12_S); editor.putString("day3_12_time", day3_12_time_S);
		
		editor.putString("day4_1", day4_1_S); editor.putString("day4_1_time", day4_1_time_S);
		editor.putString("day4_2", day4_2_S); editor.putString("day4_2_time", day4_2_time_S);
		editor.putString("day4_3", day4_3_S); editor.putString("day4_3_time", day4_3_time_S);
		editor.putString("day4_4", day4_4_S); editor.putString("day4_4_time", day4_4_time_S);
		editor.putString("day4_5", day4_5_S); editor.putString("day4_5_time", day4_5_time_S);
		editor.putString("day4_6", day4_6_S); editor.putString("day4_6_time", day4_6_time_S);
		editor.putString("day4_7", day4_7_S); editor.putString("day4_7_time", day4_7_time_S);
		editor.putString("day4_8", day4_8_S); editor.putString("day4_8_time", day4_8_time_S);
		//Кружки
		editor.putString("day4_9",  day4_9_S);  editor.putString("day4_9_time",  day4_9_time_S);
		editor.putString("day4_10", day4_10_S); editor.putString("day4_10_time", day4_10_time_S);
		editor.putString("day4_11", day4_11_S); editor.putString("day4_11_time", day4_11_time_S);
		editor.putString("day4_12", day4_12_S); editor.putString("day4_12_time", day4_12_time_S);
		
		editor.putString("day5_1", day5_1_S); editor.putString("day5_1_time", day5_1_time_S);
		editor.putString("day5_2", day5_2_S); editor.putString("day5_2_time", day5_2_time_S);
		editor.putString("day5_3", day5_3_S); editor.putString("day5_3_time", day5_3_time_S);
		editor.putString("day5_4", day5_4_S); editor.putString("day5_4_time", day5_4_time_S);
		editor.putString("day5_5", day5_5_S); editor.putString("day5_5_time", day5_5_time_S);
		editor.putString("day5_6", day5_6_S); editor.putString("day5_6_time", day5_6_time_S);
		editor.putString("day5_7", day5_7_S); editor.putString("day5_7_time", day5_7_time_S);
		editor.putString("day5_8", day5_8_S); editor.putString("day5_8_time", day5_8_time_S);
		//Кружки
		editor.putString("day5_9",  day5_9_S);  editor.putString("day5_9_time",  day5_9_time_S);
		editor.putString("day5_10", day5_10_S); editor.putString("day5_10_time", day5_10_time_S);
		editor.putString("day5_11", day5_11_S); editor.putString("day5_11_time", day5_11_time_S);
		editor.putString("day5_12", day5_12_S); editor.putString("day5_12_time", day5_12_time_S);
		
		editor.putString("day6_1", day6_1_S); editor.putString("day6_1_time", day6_1_time_S);
		editor.putString("day6_2", day6_2_S); editor.putString("day6_2_time", day6_2_time_S);
		editor.putString("day6_3", day6_3_S); editor.putString("day6_3_time", day6_3_time_S);
		editor.putString("day6_4", day6_4_S); editor.putString("day6_4_time", day6_4_time_S);
		editor.putString("day6_5", day6_5_S); editor.putString("day6_5_time", day6_5_time_S);
		editor.putString("day6_6", day6_6_S); editor.putString("day6_6_time", day6_6_time_S);
		editor.putString("day6_7", day6_7_S); editor.putString("day6_7_time", day6_7_time_S);
		editor.putString("day6_8", day6_8_S); editor.putString("day6_8_time", day6_8_time_S);
		//Кружки
		editor.putString("day6_9",  day6_9_S);  editor.putString("day6_9_time",  day6_9_time_S);
		editor.putString("day6_10", day6_10_S); editor.putString("day6_10_time", day6_10_time_S);
		editor.putString("day6_11", day6_11_S); editor.putString("day6_11_time", day6_11_time_S);
		editor.putString("day6_12", day6_12_S); editor.putString("day6_12_time", day6_12_time_S);
		
		//Кружки
		editor.putString("day7_9",  day7_9_S);  editor.putString("day7_9_time",  day7_9_time_S);
		editor.putString("day7_10", day7_10_S); editor.putString("day7_10_time", day7_10_time_S);
		editor.putString("day7_11", day7_11_S); editor.putString("day7_11_time", day7_11_time_S);
		editor.putString("day7_12", day7_12_S); editor.putString("day7_12_time", day7_12_time_S);
		
		editor.putBoolean("isLightTheme", isLightTheme_chkBx.isChecked());
		editor.putInt("year_frst",year_frst);
		editor.putInt("month_frst",month_frst);
		editor.putInt("day_frst",day_frst);
		editor.putInt("autumnHolidays_year", autumnHolidays_DtPck.getYear());
		editor.putInt("autumnHolidays_month", autumnHolidays_DtPck.getMonth());
		editor.putInt("autumnHolidays_day", autumnHolidays_DtPck.getDayOfMonth());
		editor.putInt("winterHolidays_year", winterHolidays_DtPck.getYear());
		editor.putInt("winterHolidays_month", winterHolidays_DtPck.getMonth());
		editor.putInt("winterHolidays_day", winterHolidays_DtPck.getDayOfMonth());
		editor.putInt("springHolidays_year", springHolidays_DtPck.getYear());
		editor.putInt("springHolidays_month", springHolidays_DtPck.getMonth());
		editor.putInt("springHolidays_day", springHolidays_DtPck.getDayOfMonth());
		
		editor.apply();
	}
	
	public String correct_str(String str)
	{
		if (str.length()==0) {return "";}
		else {return str;}
	}
	  
	public String correct_time(String time)  //проверяет время на корректность ввода: если неправильно,то в память запишет ""
	{
		String output_time="";
		int tmp_len=time.length();
		if ((tmp_len>5)|(tmp_len<3)) {return "";} //если больше 5 (06:00) или меньше 3 символов (6:0)
		if (!(time.contains(":"))) {return "";}  //если нет разделителя ":"
		if (time.indexOf(":")!=time.lastIndexOf(":")) {return "";} //если несколько символов ":"

		output_time=time.substring(0,time.indexOf(":"));
		 tmp_len=output_time.length();
		  if (!((tmp_len==1)|(tmp_len==2))) {return "";} //если количество часов не однозначное или двузначное число
		   if (tmp_len==1) {output_time="0"+output_time;}
		    if (Integer.parseInt(output_time)>23) {return "";} //если количество часов больше 23
		output_time+=time.substring(time.indexOf(":"),time.length());
		 tmp_len=output_time.length();
		  if (!((tmp_len==4)|(tmp_len==5))) {return "";} //если количество минут не однозначное или двузначное число
		   if (tmp_len==4) {output_time+="0";} //если количество минут-это однозначное число,то в конце приписываем ноль
		    if (Integer.parseInt(output_time.substring(3,5))>59) {return "";}  //если количество минут больше 59
		return output_time;
	}
	
	public void changeTheme(View v) { //Изменяет тему приложения
		if (((CheckBox) v).isChecked()) {setTheme(R.style.AppTheme_Light);}
		else setTheme(R.style.AppTheme);
		Intent intent = getIntent();
		finish();
		startActivity(intent);
	}
	
	public void SaveLoadTimetable(View v) { //Сохраняет или загружает расписание в файл
		InputMethodManager hide_clipboard = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
		hide_clipboard.hideSoftInputFromWindow(frst_date_studng_txtV.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
		//Чтение файла с расписанием
		if (new File(SaveLoadPath_edt.getText().toString()).exists()) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(SaveLoadPath_edt.getText().toString()), Charset.forName("Unicode")));
				day1_1.setText(correct_str(br.readLine())); day1_1_time.setText(correct_time(br.readLine()));
				day1_2.setText(correct_str(br.readLine())); day1_2_time.setText(correct_time(br.readLine()));
				day1_3.setText(correct_str(br.readLine())); day1_3_time.setText(correct_time(br.readLine()));
				day1_4.setText(correct_str(br.readLine())); day1_4_time.setText(correct_time(br.readLine()));
				day1_5.setText(correct_str(br.readLine())); day1_5_time.setText(correct_time(br.readLine()));
				day1_6.setText(correct_str(br.readLine())); day1_6_time.setText(correct_time(br.readLine()));
				day1_7.setText(correct_str(br.readLine())); day1_7_time.setText(correct_time(br.readLine()));
				day1_8.setText(correct_str(br.readLine())); day1_8_time.setText(correct_time(br.readLine()));
				//Кружки
				day1_9.setText(correct_str(br.readLine()));  day1_9_time.setText(correct_time(br.readLine()));
				day1_10.setText(correct_str(br.readLine())); day1_10_time.setText(correct_time(br.readLine()));
				day1_11.setText(correct_str(br.readLine())); day1_11_time.setText(correct_time(br.readLine()));
				day1_12.setText(correct_str(br.readLine())); day1_12_time.setText(correct_time(br.readLine()));
				
				day2_1.setText(correct_str(br.readLine())); day2_1_time.setText(correct_time(br.readLine()));
				day2_2.setText(correct_str(br.readLine())); day2_2_time.setText(correct_time(br.readLine()));
				day2_3.setText(correct_str(br.readLine())); day2_3_time.setText(correct_time(br.readLine()));
				day2_4.setText(correct_str(br.readLine())); day2_4_time.setText(correct_time(br.readLine()));
				day2_5.setText(correct_str(br.readLine())); day2_5_time.setText(correct_time(br.readLine()));
				day2_6.setText(correct_str(br.readLine())); day2_6_time.setText(correct_time(br.readLine()));
				day2_7.setText(correct_str(br.readLine())); day2_7_time.setText(correct_time(br.readLine()));
				day2_8.setText(correct_str(br.readLine())); day2_8_time.setText(correct_time(br.readLine()));
				//Кружки
				day2_9.setText(correct_str(br.readLine()));  day2_9_time.setText(correct_time(br.readLine()));
				day2_10.setText(correct_str(br.readLine())); day2_10_time.setText(correct_time(br.readLine()));
				day2_11.setText(correct_str(br.readLine())); day2_11_time.setText(correct_time(br.readLine()));
				day2_12.setText(correct_str(br.readLine())); day2_12_time.setText(correct_time(br.readLine()));
				
				day3_1.setText(correct_str(br.readLine())); day3_1_time.setText(correct_time(br.readLine()));
				day3_2.setText(correct_str(br.readLine())); day3_2_time.setText(correct_time(br.readLine()));
				day3_3.setText(correct_str(br.readLine())); day3_3_time.setText(correct_time(br.readLine()));
				day3_4.setText(correct_str(br.readLine())); day3_4_time.setText(correct_time(br.readLine()));
				day3_5.setText(correct_str(br.readLine())); day3_5_time.setText(correct_time(br.readLine()));
				day3_6.setText(correct_str(br.readLine())); day3_6_time.setText(correct_time(br.readLine()));
				day3_7.setText(correct_str(br.readLine())); day3_7_time.setText(correct_time(br.readLine()));
				day3_8.setText(correct_str(br.readLine())); day3_8_time.setText(correct_time(br.readLine()));
				//Кружки
				day3_9.setText(correct_str(br.readLine()));  day3_9_time.setText(correct_time(br.readLine()));
				day3_10.setText(correct_str(br.readLine())); day3_10_time.setText(correct_time(br.readLine()));
				day3_11.setText(correct_str(br.readLine())); day3_11_time.setText(correct_time(br.readLine()));
				day3_12.setText(correct_str(br.readLine())); day3_12_time.setText(correct_time(br.readLine()));
				
				day4_1.setText(correct_str(br.readLine())); day4_1_time.setText(correct_time(br.readLine()));
				day4_2.setText(correct_str(br.readLine())); day4_2_time.setText(correct_time(br.readLine()));
				day4_3.setText(correct_str(br.readLine())); day4_3_time.setText(correct_time(br.readLine()));
				day4_4.setText(correct_str(br.readLine())); day4_4_time.setText(correct_time(br.readLine()));
				day4_5.setText(correct_str(br.readLine())); day4_5_time.setText(correct_time(br.readLine()));
				day4_6.setText(correct_str(br.readLine())); day4_6_time.setText(correct_time(br.readLine()));
				day4_7.setText(correct_str(br.readLine())); day4_7_time.setText(correct_time(br.readLine()));
				day4_8.setText(correct_str(br.readLine())); day4_8_time.setText(correct_time(br.readLine()));
				//Кружки
				day4_9.setText(correct_str(br.readLine()));  day4_9_time.setText(correct_time(br.readLine()));
				day4_10.setText(correct_str(br.readLine())); day4_10_time.setText(correct_time(br.readLine()));
				day4_11.setText(correct_str(br.readLine())); day4_11_time.setText(correct_time(br.readLine()));
				day4_12.setText(correct_str(br.readLine())); day4_12_time.setText(correct_time(br.readLine()));
				
				day5_1.setText(correct_str(br.readLine())); day5_1_time.setText(correct_time(br.readLine()));
				day5_2.setText(correct_str(br.readLine())); day5_2_time.setText(correct_time(br.readLine()));
				day5_3.setText(correct_str(br.readLine())); day5_3_time.setText(correct_time(br.readLine()));
				day5_4.setText(correct_str(br.readLine())); day5_4_time.setText(correct_time(br.readLine()));
				day5_5.setText(correct_str(br.readLine())); day5_5_time.setText(correct_time(br.readLine()));
				day5_6.setText(correct_str(br.readLine())); day5_6_time.setText(correct_time(br.readLine()));
				day5_7.setText(correct_str(br.readLine())); day5_7_time.setText(correct_time(br.readLine()));
				day5_8.setText(correct_str(br.readLine())); day5_8_time.setText(correct_time(br.readLine()));
				//Кружки
				day5_9.setText(correct_str(br.readLine()));  day5_9_time.setText(correct_time(br.readLine()));
				day5_10.setText(correct_str(br.readLine())); day5_10_time.setText(correct_time(br.readLine()));
				day5_11.setText(correct_str(br.readLine())); day5_11_time.setText(correct_time(br.readLine()));
				day5_12.setText(correct_str(br.readLine())); day5_12_time.setText(correct_time(br.readLine()));
				
				day6_1.setText(correct_str(br.readLine())); day6_1_time.setText(correct_time(br.readLine()));
				day6_2.setText(correct_str(br.readLine())); day6_2_time.setText(correct_time(br.readLine()));
				day6_3.setText(correct_str(br.readLine())); day6_3_time.setText(correct_time(br.readLine()));
				day6_4.setText(correct_str(br.readLine())); day6_4_time.setText(correct_time(br.readLine()));
				day6_5.setText(correct_str(br.readLine())); day6_5_time.setText(correct_time(br.readLine()));
				day6_6.setText(correct_str(br.readLine())); day6_6_time.setText(correct_time(br.readLine()));
				day6_7.setText(correct_str(br.readLine())); day6_7_time.setText(correct_time(br.readLine()));
				day6_8.setText(correct_str(br.readLine())); day6_8_time.setText(correct_time(br.readLine()));
				//Кружки
				day6_9.setText(correct_str(br.readLine()));  day6_9_time.setText(correct_time(br.readLine()));
				day6_10.setText(correct_str(br.readLine())); day6_10_time.setText(correct_time(br.readLine()));
				day6_11.setText(correct_str(br.readLine())); day6_11_time.setText(correct_time(br.readLine()));
				day6_12.setText(correct_str(br.readLine())); day6_12_time.setText(correct_time(br.readLine()));
				
				//Кружки
				day7_9.setText(correct_str(br.readLine()));  day7_9_time.setText(correct_time(br.readLine()));
				day7_10.setText(correct_str(br.readLine())); day7_10_time.setText(correct_time(br.readLine()));
				day7_11.setText(correct_str(br.readLine())); day7_11_time.setText(correct_time(br.readLine()));
				day7_12.setText(correct_str(br.readLine())); day7_12_time.setText(correct_time(br.readLine()));
				
				try { //Начало года и каникул
					int year = Integer.parseInt(br.readLine());
					int month = Integer.parseInt(br.readLine());
					int day = Integer.parseInt(br.readLine());
					frst_date_studng_DtPck.init(year, month, day, null);
					frst_date_studng_txtV.setText("Начало четверти: "+day+"-"+(month+1)+"-"+year); //т.к. месяц отсчитывается с нуля,то надо "+1"
					
					year = Integer.parseInt(br.readLine());
					month = Integer.parseInt(br.readLine());
					day = Integer.parseInt(br.readLine());
					autumnHolidays_DtPck.init(year, month, day, null);
					autumnHolidays_txtV.setText("Начало четверти: "+day+"-"+(month+1)+"-"+year); //т.к. месяц отсчитывается с нуля,то надо "+1"

					year = Integer.parseInt(br.readLine());
					month = Integer.parseInt(br.readLine());
					day = Integer.parseInt(br.readLine());
					winterHolidays_DtPck.init(year, month, day, null);
					winterHolidays_txtV.setText("Начало четверти: "+day+"-"+(month+1)+"-"+year); //т.к. месяц отсчитывается с нуля,то надо "+1"

					year = Integer.parseInt(br.readLine());
					month = Integer.parseInt(br.readLine());
					day = Integer.parseInt(br.readLine());
					springHolidays_DtPck.init(year, month, day, null);
					springHolidays_txtV.setText("Начало четверти: "+day+"-"+(month+1)+"-"+year); //т.к. месяц отсчитывается с нуля,то надо "+1"
				}
				catch (Exception e) { Toast.makeText(this,"Не верно указаны даты начала года и каникул",Toast.LENGTH_SHORT).show();  }
				
				br.close();
			}
			catch (Exception e) { Toast.makeText(this,"Не удалось прочитать файл",Toast.LENGTH_LONG).show(); }
		}
		//Запись расписания в файл
	    else {
		    try {
				Writer wrt = new OutputStreamWriter(new FileOutputStream(SaveLoadPath_edt.getText().toString()),"Unicode");
			    wrt.append(
					correct_str(day1_1.getText().toString())+"\n"+ correct_time(day1_1_time.getText().toString())+"\n"+
					correct_str(day1_2.getText().toString())+"\n"+ correct_time(day1_2_time.getText().toString())+"\n"+
					correct_str(day1_3.getText().toString())+"\n"+ correct_time(day1_3_time.getText().toString())+"\n"+
					correct_str(day1_4.getText().toString())+"\n"+ correct_time(day1_4_time.getText().toString())+"\n"+
					correct_str(day1_5.getText().toString())+"\n"+ correct_time(day1_5_time.getText().toString())+"\n"+
					correct_str(day1_6.getText().toString())+"\n"+ correct_time(day1_6_time.getText().toString())+"\n"+
					correct_str(day1_7.getText().toString())+"\n"+ correct_time(day1_7_time.getText().toString())+"\n"+
					correct_str(day1_8.getText().toString())+"\n"+ correct_time(day1_8_time.getText().toString())+"\n"+
					//Кружки
					correct_str(day1_9.getText().toString())+"\n" + correct_time(day1_9_time.getText().toString())+"\n"+
					correct_str(day1_10.getText().toString())+"\n"+ correct_time(day1_10_time.getText().toString())+"\n"+
					correct_str(day1_11.getText().toString())+"\n"+ correct_time(day1_11_time.getText().toString())+"\n"+
					correct_str(day1_12.getText().toString())+"\n"+ correct_time(day1_12_time.getText().toString())+"\n"+
					
					correct_str(day2_1.getText().toString())+"\n"+ correct_time(day2_1_time.getText().toString())+"\n"+
					correct_str(day2_2.getText().toString())+"\n"+ correct_time(day2_2_time.getText().toString())+"\n"+
					correct_str(day2_3.getText().toString())+"\n"+ correct_time(day2_3_time.getText().toString())+"\n"+
					correct_str(day2_4.getText().toString())+"\n"+ correct_time(day2_4_time.getText().toString())+"\n"+
					correct_str(day2_5.getText().toString())+"\n"+ correct_time(day2_5_time.getText().toString())+"\n"+
					correct_str(day2_6.getText().toString())+"\n"+ correct_time(day2_6_time.getText().toString())+"\n"+
					correct_str(day2_7.getText().toString())+"\n"+ correct_time(day2_7_time.getText().toString())+"\n"+
					correct_str(day2_8.getText().toString())+"\n"+ correct_time(day2_8_time.getText().toString())+"\n"+
					//Кружки
					correct_str(day2_9.getText().toString())+"\n" + correct_time(day2_9_time.getText().toString())+"\n"+
					correct_str(day2_10.getText().toString())+"\n"+ correct_time(day2_10_time.getText().toString())+"\n"+
					correct_str(day2_11.getText().toString())+"\n"+ correct_time(day2_11_time.getText().toString())+"\n"+
					correct_str(day2_12.getText().toString())+"\n"+ correct_time(day2_12_time.getText().toString())+"\n"+
					
					correct_str(day3_1.getText().toString())+"\n"+ correct_time(day3_1_time.getText().toString())+"\n"+
					correct_str(day3_2.getText().toString())+"\n"+ correct_time(day3_2_time.getText().toString())+"\n"+
					correct_str(day3_3.getText().toString())+"\n"+ correct_time(day3_3_time.getText().toString())+"\n"+
					correct_str(day3_4.getText().toString())+"\n"+ correct_time(day3_4_time.getText().toString())+"\n"+
					correct_str(day3_5.getText().toString())+"\n"+ correct_time(day3_5_time.getText().toString())+"\n"+
					correct_str(day3_6.getText().toString())+"\n"+ correct_time(day3_6_time.getText().toString())+"\n"+
					correct_str(day3_7.getText().toString())+"\n"+ correct_time(day3_7_time.getText().toString())+"\n"+
					correct_str(day3_8.getText().toString())+"\n"+ correct_time(day3_8_time.getText().toString())+"\n"+
					//Кружки
					correct_str(day3_9.getText().toString())+"\n" + correct_time(day3_9_time.getText().toString())+"\n"+
					correct_str(day3_10.getText().toString())+"\n"+ correct_time(day3_10_time.getText().toString())+"\n"+
					correct_str(day3_11.getText().toString())+"\n"+ correct_time(day3_11_time.getText().toString())+"\n"+
					correct_str(day3_12.getText().toString())+"\n"+ correct_time(day3_12_time.getText().toString())+"\n"+
					
					correct_str(day4_1.getText().toString())+"\n"+ correct_time(day4_1_time.getText().toString())+"\n"+
					correct_str(day4_2.getText().toString())+"\n"+ correct_time(day4_2_time.getText().toString())+"\n"+
					correct_str(day4_3.getText().toString())+"\n"+ correct_time(day4_3_time.getText().toString())+"\n"+
					correct_str(day4_4.getText().toString())+"\n"+ correct_time(day4_4_time.getText().toString())+"\n"+
					correct_str(day4_5.getText().toString())+"\n"+ correct_time(day4_5_time.getText().toString())+"\n"+
					correct_str(day4_6.getText().toString())+"\n"+ correct_time(day4_6_time.getText().toString())+"\n"+
					correct_str(day4_7.getText().toString())+"\n"+ correct_time(day4_7_time.getText().toString())+"\n"+
					correct_str(day4_8.getText().toString())+"\n"+ correct_time(day4_8_time.getText().toString())+"\n"+
					//Кружки
					correct_str(day4_9.getText().toString())+"\n" + correct_time(day4_9_time.getText().toString())+"\n"+
					correct_str(day4_10.getText().toString())+"\n"+ correct_time(day4_10_time.getText().toString())+"\n"+
					correct_str(day4_11.getText().toString())+"\n"+ correct_time(day4_11_time.getText().toString())+"\n"+
					correct_str(day4_12.getText().toString())+"\n"+ correct_time(day4_12_time.getText().toString())+"\n"+
					
					correct_str(day5_1.getText().toString())+"\n"+ correct_time(day5_1_time.getText().toString())+"\n"+
					correct_str(day5_2.getText().toString())+"\n"+ correct_time(day5_2_time.getText().toString())+"\n"+
					correct_str(day5_3.getText().toString())+"\n"+ correct_time(day5_3_time.getText().toString())+"\n"+
					correct_str(day5_4.getText().toString())+"\n"+ correct_time(day5_4_time.getText().toString())+"\n"+
					correct_str(day5_5.getText().toString())+"\n"+ correct_time(day5_5_time.getText().toString())+"\n"+
					correct_str(day5_6.getText().toString())+"\n"+ correct_time(day5_6_time.getText().toString())+"\n"+
					correct_str(day5_7.getText().toString())+"\n"+ correct_time(day5_7_time.getText().toString())+"\n"+
					correct_str(day5_8.getText().toString())+"\n"+ correct_time(day5_8_time.getText().toString())+"\n"+
					//Кружки
					correct_str(day5_9.getText().toString())+"\n" + correct_time(day5_9_time.getText().toString())+"\n"+
					correct_str(day5_10.getText().toString())+"\n"+ correct_time(day5_10_time.getText().toString())+"\n"+
					correct_str(day5_11.getText().toString())+"\n"+ correct_time(day5_11_time.getText().toString())+"\n"+
					correct_str(day5_12.getText().toString())+"\n"+ correct_time(day5_12_time.getText().toString())+"\n"+
					
					correct_str(day6_1.getText().toString())+"\n"+ correct_time(day6_1_time.getText().toString())+"\n"+
					correct_str(day6_2.getText().toString())+"\n"+ correct_time(day6_2_time.getText().toString())+"\n"+
					correct_str(day6_3.getText().toString())+"\n"+ correct_time(day6_3_time.getText().toString())+"\n"+
					correct_str(day6_4.getText().toString())+"\n"+ correct_time(day6_4_time.getText().toString())+"\n"+
					correct_str(day6_5.getText().toString())+"\n"+ correct_time(day6_5_time.getText().toString())+"\n"+
					correct_str(day6_6.getText().toString())+"\n"+ correct_time(day6_6_time.getText().toString())+"\n"+
					correct_str(day6_7.getText().toString())+"\n"+ correct_time(day6_7_time.getText().toString())+"\n"+
					correct_str(day6_8.getText().toString())+"\n"+ correct_time(day6_8_time.getText().toString())+"\n"+
					//Кружки
					correct_str(day6_9.getText().toString())+"\n" + correct_time(day6_9_time.getText().toString())+"\n"+
					correct_str(day6_10.getText().toString())+"\n"+ correct_time(day6_10_time.getText().toString())+"\n"+
					correct_str(day6_11.getText().toString())+"\n"+ correct_time(day6_11_time.getText().toString())+"\n"+
					correct_str(day6_12.getText().toString())+"\n"+ correct_time(day6_12_time.getText().toString())+"\n"+
					
					//Кружки
					correct_str(day7_9.getText().toString())+"\n" + correct_time(day7_9_time.getText().toString())+"\n"+
					correct_str(day7_10.getText().toString())+"\n"+ correct_time(day7_10_time.getText().toString())+"\n"+
					correct_str(day7_11.getText().toString())+"\n"+ correct_time(day7_11_time.getText().toString())+"\n"+
					correct_str(day7_12.getText().toString())+"\n"+ correct_time(day7_12_time.getText().toString())+"\n"+
					
					//Начало года и каникул
					Integer.toString(frst_date_studng_DtPck.getYear())+"\n"+Integer.toString(frst_date_studng_DtPck.getMonth())+"\n"+Integer.toString(frst_date_studng_DtPck.getDayOfMonth())+"\n"+
					Integer.toString(autumnHolidays_DtPck.getYear())+"\n"  +Integer.toString(autumnHolidays_DtPck.getMonth())+"\n"  +Integer.toString(autumnHolidays_DtPck.getDayOfMonth())+"\n"+
					Integer.toString(winterHolidays_DtPck.getYear())+"\n"  +Integer.toString(winterHolidays_DtPck.getMonth())+"\n"  +Integer.toString(winterHolidays_DtPck.getDayOfMonth())+"\n"+
					Integer.toString(springHolidays_DtPck.getYear())+"\n"  +Integer.toString(springHolidays_DtPck.getMonth())+"\n"  +Integer.toString(springHolidays_DtPck.getDayOfMonth())+"\n"
				);
			    wrt.flush(); wrt.close();
		    }
		    catch (Exception e) { Toast.makeText(this,"Не удалось сохранить файл",Toast.LENGTH_LONG).show(); }
		}
	}
}

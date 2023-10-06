package com.mycompany.School_timetable;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;
import android.widget.DatePicker.*;
import android.content.*;
import android.provider.*;
import android.view.inputmethod.*;
import android.hardware.input.*;
import java.time.temporal.*;
import java.time.*;

public class MainActivity extends Activity
{
	private SharedPreferences mSettings;
	
	private int year_frst,month_frst,day_frst;
	private String day1_1_S,day1_1_time_S,
	day1_2_S,day1_2_time_S,
	day1_3_S,day1_3_time_S,
	day1_4_S,day1_4_time_S,
	day1_5_S,day1_5_time_S,
	day1_6_S,day1_6_time_S,
	day1_7_S,day1_7_time_S,
	day1_8_S,day1_8_time_S,
	//Кружки после уроков
	day1_9_S,day1_9_time_S,
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
	day2_9_S,day2_9_time_S,
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
	day3_9_S,day3_9_time_S,
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
	day4_9_S,day4_9_time_S,
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
	day5_9_S,day5_9_time_S,
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
	day6_9_S,day6_9_time_S,
	day6_10_S,day6_10_time_S,
	day6_11_S,day6_11_time_S,
	day6_12_S,day6_12_time_S,
	
	//Кружки после уроков
	day7_9_S,day7_9_time_S,
	day7_10_S,day7_10_time_S,
	day7_11_S,day7_11_time_S,
	day7_12_S,day7_12_time_S;
	
	Boolean UpperWeek=true;
	TextView weekNow_txtV, timetable_txtV;
	DatePicker DatePicker;
	Button future_day_B;

	Calendar first_date_of_studying,user_date, autumnHolidays, winterHolidays, springHolidays;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
		mSettings = getSharedPreferences("mysettings", Context.MODE_PRIVATE);
		if (mSettings.getBoolean("isLightTheme", false)) setTheme(R.style.AppTheme_Light);
		else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		weekNow_txtV = (TextView) findViewById(R.id.weekNow_txtV);
		timetable_txtV=(TextView) findViewById(R.id.timetable_txtV);
		DatePicker = (DatePicker) findViewById(R.id.DatePicker);
		future_day_B=(Button) findViewById(R.id.future_day_B);
    }
	
	//Добавляем меню с настройками
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		Intent intent = new Intent(this,Properties.class);
		startActivity(intent);
		return super.onOptionsItemSelected(item);
	}
	
 	//Действия,которые нужны при запуске программы,надо помещать в onResume(),а не в onCreate(),т.к. onResume()-выполняется,если свернули-развернули,а onCreate()-только при запуске
	@Override
    protected void onResume() {
        super.onResume();
		user_date = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		// Получаем данные из настроек
		year_frst=mSettings.getInt("year_frst",user_date.get(Calendar.YEAR));
		month_frst=mSettings.getInt("month_frst",user_date.get(Calendar.MONTH));
		day_frst=mSettings.getInt("day_frst",user_date.get(Calendar.DAY_OF_MONTH));
		
		day1_1_S = mSettings.getString("day1_1", ""); day1_1_time_S = mSettings.getString("day1_1_time", "");
		day1_2_S = mSettings.getString("day1_2", ""); day1_2_time_S = mSettings.getString("day1_2_time", "");
		day1_3_S = mSettings.getString("day1_3", ""); day1_3_time_S = mSettings.getString("day1_3_time", "");
		day1_4_S = mSettings.getString("day1_4", ""); day1_4_time_S = mSettings.getString("day1_4_time", "");
		day1_5_S = mSettings.getString("day1_5", ""); day1_5_time_S = mSettings.getString("day1_5_time", "");
		day1_6_S = mSettings.getString("day1_6", ""); day1_6_time_S = mSettings.getString("day1_6_time", "");
		day1_7_S = mSettings.getString("day1_7", ""); day1_7_time_S = mSettings.getString("day1_7_time", "");
		day1_8_S = mSettings.getString("day1_8", ""); day1_8_time_S = mSettings.getString("day1_8_time", "");
		//Кружки
		day1_9_S  = mSettings.getString("day1_9",  ""); day1_9_time_S  = mSettings.getString("day1_9_time",  "");
		day1_10_S = mSettings.getString("day1_10", ""); day1_10_time_S = mSettings.getString("day1_10_time", "");
		day1_11_S = mSettings.getString("day1_11", ""); day1_11_time_S = mSettings.getString("day1_11_time", "");
		day1_12_S = mSettings.getString("day1_12", ""); day1_12_time_S = mSettings.getString("day1_12_time", "");

		day2_1_S = mSettings.getString("day2_1", ""); day2_1_time_S = mSettings.getString("day2_1_time", "");
		day2_2_S = mSettings.getString("day2_2", ""); day2_2_time_S = mSettings.getString("day2_2_time", "");
		day2_3_S = mSettings.getString("day2_3", ""); day2_3_time_S = mSettings.getString("day2_3_time", "");
		day2_4_S = mSettings.getString("day2_4", ""); day2_4_time_S = mSettings.getString("day2_4_time", "");
		day2_5_S = mSettings.getString("day2_5", ""); day2_5_time_S = mSettings.getString("day2_5_time", "");
		day2_6_S = mSettings.getString("day2_6", ""); day2_6_time_S = mSettings.getString("day2_6_time", "");
		day2_7_S = mSettings.getString("day2_7", ""); day2_7_time_S = mSettings.getString("day2_7_time", "");
		day2_8_S = mSettings.getString("day2_8", ""); day2_8_time_S = mSettings.getString("day2_8_time", "");
		//Кружки
		day2_9_S  = mSettings.getString("day2_9",  ""); day2_9_time_S  = mSettings.getString("day2_9_time",  "");
		day2_10_S = mSettings.getString("day2_10", ""); day2_10_time_S = mSettings.getString("day2_10_time", "");
		day2_11_S = mSettings.getString("day2_11", ""); day2_11_time_S = mSettings.getString("day2_11_time", "");
		day2_12_S = mSettings.getString("day2_12", ""); day2_12_time_S = mSettings.getString("day2_12_time", "");
		
		day3_1_S = mSettings.getString("day3_1", ""); day3_1_time_S = mSettings.getString("day3_1_time", "");
		day3_2_S = mSettings.getString("day3_2", ""); day3_2_time_S = mSettings.getString("day3_2_time", "");
		day3_3_S = mSettings.getString("day3_3", ""); day3_3_time_S = mSettings.getString("day3_3_time", "");
		day3_4_S = mSettings.getString("day3_4", ""); day3_4_time_S = mSettings.getString("day3_4_time", "");
		day3_5_S = mSettings.getString("day3_5", ""); day3_5_time_S = mSettings.getString("day3_5_time", "");
		day3_6_S = mSettings.getString("day3_6", ""); day3_6_time_S = mSettings.getString("day3_6_time", "");
		day3_7_S = mSettings.getString("day3_7", ""); day3_7_time_S = mSettings.getString("day3_7_time", "");
		day3_8_S = mSettings.getString("day3_8", ""); day3_8_time_S = mSettings.getString("day3_8_time", "");
		//Кружки
		day3_9_S  = mSettings.getString("day3_9",  ""); day3_9_time_S  = mSettings.getString("day3_9_time",  "");
		day3_10_S = mSettings.getString("day3_10", ""); day3_10_time_S = mSettings.getString("day3_10_time", "");
		day3_11_S = mSettings.getString("day3_11", ""); day3_11_time_S = mSettings.getString("day3_11_time", "");
		day3_12_S = mSettings.getString("day3_12", ""); day3_12_time_S = mSettings.getString("day3_12_time", "");
		
		day4_1_S = mSettings.getString("day4_1", ""); day4_1_time_S = mSettings.getString("day4_1_time", "");
		day4_2_S = mSettings.getString("day4_2", ""); day4_2_time_S = mSettings.getString("day4_2_time", "");
		day4_3_S = mSettings.getString("day4_3", ""); day4_3_time_S = mSettings.getString("day4_3_time", "");
		day4_4_S = mSettings.getString("day4_4", ""); day4_4_time_S = mSettings.getString("day4_4_time", "");
		day4_5_S = mSettings.getString("day4_5", ""); day4_5_time_S = mSettings.getString("day4_5_time", "");
		day4_6_S = mSettings.getString("day4_6", ""); day4_6_time_S = mSettings.getString("day4_6_time", "");
		day4_7_S = mSettings.getString("day4_7", ""); day4_7_time_S = mSettings.getString("day4_7_time", "");
		day4_8_S = mSettings.getString("day4_8", ""); day4_8_time_S = mSettings.getString("day4_8_time", "");
		//Кружки
		day4_9_S  = mSettings.getString("day4_9",  ""); day4_9_time_S  = mSettings.getString("day4_9_time",  "");
		day4_10_S = mSettings.getString("day4_10", ""); day4_10_time_S = mSettings.getString("day4_10_time", "");
		day4_11_S = mSettings.getString("day4_11", ""); day4_11_time_S = mSettings.getString("day4_11_time", "");
		day4_12_S = mSettings.getString("day4_12", ""); day4_12_time_S = mSettings.getString("day4_12_time", "");
		
		day5_1_S = mSettings.getString("day5_1", ""); day5_1_time_S = mSettings.getString("day5_1_time", "");
		day5_2_S = mSettings.getString("day5_2", ""); day5_2_time_S = mSettings.getString("day5_2_time", "");
		day5_3_S = mSettings.getString("day5_3", ""); day5_3_time_S = mSettings.getString("day5_3_time", "");
		day5_4_S = mSettings.getString("day5_4", ""); day5_4_time_S = mSettings.getString("day5_4_time", "");
		day5_5_S = mSettings.getString("day5_5", ""); day5_5_time_S = mSettings.getString("day5_5_time", "");
		day5_6_S = mSettings.getString("day5_6", ""); day5_6_time_S = mSettings.getString("day5_6_time", "");
		day5_7_S = mSettings.getString("day5_7", ""); day5_7_time_S = mSettings.getString("day5_7_time", "");
		day5_8_S = mSettings.getString("day5_8", ""); day5_8_time_S = mSettings.getString("day5_8_time", "");
		//Кружки
		day5_9_S  = mSettings.getString("day5_9",  ""); day5_9_time_S  = mSettings.getString("day5_9_time",  "");
		day5_10_S = mSettings.getString("day5_10", ""); day5_10_time_S = mSettings.getString("day5_10_time", "");
		day5_11_S = mSettings.getString("day5_11", ""); day5_11_time_S = mSettings.getString("day5_11_time", "");
		day5_12_S = mSettings.getString("day5_12", ""); day5_12_time_S = mSettings.getString("day5_12_time", "");
		
		day6_1_S = mSettings.getString("day6_1", ""); day6_1_time_S = mSettings.getString("day6_1_time", "");
		day6_2_S = mSettings.getString("day6_2", ""); day6_2_time_S = mSettings.getString("day6_2_time", "");
		day6_3_S = mSettings.getString("day6_3", ""); day6_3_time_S = mSettings.getString("day6_3_time", "");
		day6_4_S = mSettings.getString("day6_4", ""); day6_4_time_S = mSettings.getString("day6_4_time", "");
		day6_5_S = mSettings.getString("day6_5", ""); day6_5_time_S = mSettings.getString("day6_5_time", "");
		day6_6_S = mSettings.getString("day6_6", ""); day6_6_time_S = mSettings.getString("day6_6_time", "");
		day6_7_S = mSettings.getString("day6_7", ""); day6_7_time_S = mSettings.getString("day6_7_time", "");
		day6_8_S = mSettings.getString("day6_8", ""); day6_8_time_S = mSettings.getString("day6_8_time", "");
		//Кружки
		day6_9_S  = mSettings.getString("day6_9",  ""); day6_9_time_S  = mSettings.getString("day6_9_time",  "");
		day6_10_S = mSettings.getString("day6_10", ""); day6_10_time_S = mSettings.getString("day6_10_time", "");
		day6_11_S = mSettings.getString("day6_11", ""); day6_11_time_S = mSettings.getString("day6_11_time", "");
		day6_12_S = mSettings.getString("day6_12", ""); day6_12_time_S = mSettings.getString("day6_12_time", "");
		
		//Кружки
		day7_9_S  = mSettings.getString("day7_9",  ""); day7_9_time_S  = mSettings.getString("day7_9_time",  "");
		day7_10_S = mSettings.getString("day7_10", ""); day7_10_time_S = mSettings.getString("day7_10_time", "");
		day7_11_S = mSettings.getString("day7_11", ""); day7_11_time_S = mSettings.getString("day7_11_time", "");
		day7_12_S = mSettings.getString("day7_12", ""); day7_12_time_S = mSettings.getString("day7_12_time", "");
		
		first_date_of_studying = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());first_date_of_studying.set(year_frst,month_frst,day_frst);
		autumnHolidays = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault()); autumnHolidays.set(mSettings.getInt("autumnHolidays_year", autumnHolidays.get(Calendar.YEAR)), mSettings.getInt("autumnHolidays_month", autumnHolidays.get(Calendar.MONTH)), mSettings.getInt("autumnHolidays_day", autumnHolidays.get(Calendar.DAY_OF_MONTH)));
		winterHolidays = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault()); winterHolidays.set(mSettings.getInt("winterHolidays_year", winterHolidays.get(Calendar.YEAR)), mSettings.getInt("winterHolidays_month", winterHolidays.get(Calendar.MONTH)), mSettings.getInt("winterHolidays_day", winterHolidays.get(Calendar.DAY_OF_MONTH)));
		springHolidays = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault()); springHolidays.set(mSettings.getInt("springHolidays_year", springHolidays.get(Calendar.YEAR)), mSettings.getInt("springHolidays_month", springHolidays.get(Calendar.MONTH)), mSettings.getInt("springHolidays_day", springHolidays.get(Calendar.DAY_OF_MONTH)));
		
		//если сегодня кончились занятия, то показываем расписание для следующего дня
		for (int i = 0; i < 7; i++) {
			int day_of_week = user_date.get(Calendar.DAY_OF_WEEK);
			if 		(day_of_week==2) {if (!IsEndOfLessons(day1_1_time_S, day1_2_time_S, day1_3_time_S, day1_4_time_S, day1_5_time_S, day1_6_time_S, day1_7_time_S, day1_8_time_S, day1_9_time_S, day1_10_time_S, day1_11_time_S, day1_12_time_S)) break;}
			else if (day_of_week==3) {if (!IsEndOfLessons(day2_1_time_S, day2_2_time_S, day2_3_time_S, day2_4_time_S, day2_5_time_S, day2_6_time_S, day2_7_time_S, day2_8_time_S, day2_9_time_S, day2_10_time_S, day2_11_time_S, day2_12_time_S)) break;}
			else if (day_of_week==4) {if (!IsEndOfLessons(day3_1_time_S, day3_2_time_S, day3_3_time_S, day3_4_time_S, day3_5_time_S, day3_6_time_S, day3_7_time_S, day3_8_time_S, day3_9_time_S, day3_10_time_S, day3_11_time_S, day3_12_time_S)) break;}
			else if (day_of_week==5) {if (!IsEndOfLessons(day4_1_time_S, day4_2_time_S, day4_3_time_S, day4_4_time_S, day4_5_time_S, day4_6_time_S, day4_7_time_S, day4_8_time_S, day4_9_time_S, day4_10_time_S, day4_11_time_S, day4_12_time_S)) break;}
			else if (day_of_week==6) {if (!IsEndOfLessons(day5_1_time_S, day5_2_time_S, day5_3_time_S, day5_4_time_S, day5_5_time_S, day5_6_time_S, day5_7_time_S, day5_8_time_S, day5_9_time_S, day5_10_time_S, day5_11_time_S, day5_12_time_S)) break;}
			else if (day_of_week==7) {if (!IsEndOfLessons(day6_1_time_S, day6_2_time_S, day6_3_time_S, day6_4_time_S, day6_5_time_S, day6_6_time_S, day6_7_time_S, day6_8_time_S, day6_9_time_S, day6_10_time_S, day6_11_time_S, day6_12_time_S)) break;}
			else if (day_of_week==1) {if (!IsEndOfLessons("", "", "", "", "", "", "", "", day7_9_time_S, day7_10_time_S, day7_11_time_S, day7_12_time_S)) break;}
		}
		
		start_timetable();
	}
	
	public void hideClipBoard() {
		InputMethodManager hide_clipboard = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
		hide_clipboard.hideSoftInputFromWindow(future_day_B.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
	}
	
	public void next_day() { //переключает на следующий день на календаре
		user_date.set(DatePicker.getYear(),DatePicker.getMonth(),DatePicker.getDayOfMonth()+1,0,0,0);
		DatePicker.init(user_date.get(Calendar.YEAR),user_date.get(Calendar.MONTH),user_date.get(Calendar.DAY_OF_MONTH),null); //но, напр. если по этой недели нет последней пары (с макс. временем), а на след. есть, то всё равно будет считаться, что она сегодня есть, и переключится, только когда наступит ее время
	}
	
	public boolean IsEndOfLessons(String time1_S, String time2_S, String time3_S, String time4_S, String time5_S, String time6_S, String time7_S, String time8_S, String time9_S, String time10_S, String time11_S, String time12_S) {  //переставляет дату в DatePicker на следующий день, если сегодня занятия закончились
		Calendar time_max = user_date.getInstance(); time_max.setTime(user_date.getTime());
		time_max.set(Calendar.HOUR_OF_DAY,0); time_max.set(Calendar.MINUTE,0);
		Calendar today = user_date.getInstance(); today.setTime(user_date.getTime());
		
		if (time1_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time1_S.substring(0,time1_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time1_S.substring(time1_S.indexOf(":")+1,time1_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time2_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time2_S.substring(0,time2_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time2_S.substring(time2_S.indexOf(":")+1,time2_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time3_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time3_S.substring(0,time3_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time3_S.substring(time3_S.indexOf(":")+1,time3_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time4_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time4_S.substring(0,time4_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time4_S.substring(time4_S.indexOf(":")+1,time4_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time5_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time5_S.substring(0,time5_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time5_S.substring(time5_S.indexOf(":")+1,time5_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time6_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time6_S.substring(0,time6_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time6_S.substring(time6_S.indexOf(":")+1,time6_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time7_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time7_S.substring(0,time7_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time7_S.substring(time7_S.indexOf(":")+1,time7_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time8_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time8_S.substring(0,time8_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time8_S.substring(time8_S.indexOf(":")+1,time8_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		//Кружки
		if (time9_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time9_S.substring(0,time9_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time9_S.substring(time9_S.indexOf(":")+1,time9_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time10_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time10_S.substring(0,time10_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time10_S.substring(time10_S.indexOf(":")+1,time10_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time11_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time11_S.substring(0,time11_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time11_S.substring(time11_S.indexOf(":")+1,time11_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		if (time12_S!="") {
			today.set(Calendar.HOUR_OF_DAY,Integer.parseInt(time12_S.substring(0,time12_S.indexOf(":")))); today.set(Calendar.MINUTE,Integer.parseInt(time12_S.substring(time12_S.indexOf(":")+1,time12_S.length()))); 
			if (today.after(time_max)) {time_max = today;}
		}
		//если этот день без уроков, то показывает следующий
		if ((time1_S+time2_S+time3_S+time4_S+time5_S+time6_S+time7_S+time8_S+time9_S+time10_S+time11_S+time12_S).length()  == 0) {
			next_day();
			return true;
		}
		
		if (user_date.after(time_max)) { //если сегодня кончились уроки, то следующий день
			next_day();
			return true;
		} else return false;
	}	
	
	public String lesson_parse(String txt) //определяет какой предмет будет на этой неделе (учитывая верхнюю и нижнюю)
	{
		String output_lesson="";
		if (txt.contains("/"))
	    {
			if (UpperWeek) {output_lesson=txt.substring(0,txt.indexOf('/'));}
			else {output_lesson=txt.substring(txt.indexOf('/')+1,txt.length());}
		}
		else {output_lesson=txt;}
		return output_lesson;
	}
	
	public void day_parse(int day_of_week)  //определяет для какого дня показывать расписание
	{
		String lesson1="";String lesson2="";String lesson3="";String lesson4="";String lesson5="";String lesson6="";String lesson7="";String lesson8="";String lesson9="";String lesson10="";String lesson11="";String lesson12="";
		String time1="";String time2="";String time3="";String time4="";String time5="";String time6="";String time7="";String time8="";String time9="";String time10="";String time11="";String time12="";
		if (day_of_week==2) {
			lesson1=day1_1_S;lesson2=day1_2_S;lesson3=day1_3_S;lesson4=day1_4_S;lesson5=day1_5_S;lesson6=day1_6_S;lesson7=day1_7_S;lesson8=day1_8_S;lesson9=day1_9_S;lesson10=day1_10_S;lesson11=day1_11_S;lesson12=day1_12_S;
			time1=day1_1_time_S;time2=day1_2_time_S;time3=day1_3_time_S;time4=day1_4_time_S;time5=day1_5_time_S;time6=day1_6_time_S;time7=day1_7_time_S;time8=day1_8_time_S;time9=day1_9_time_S;time10=day1_10_time_S;time11=day1_11_time_S;time12=day1_12_time_S;}
		if (day_of_week==3) {
			lesson1=day2_1_S;lesson2=day2_2_S;lesson3=day2_3_S;lesson4=day2_4_S;lesson5=day2_5_S;lesson6=day2_6_S;lesson7=day2_7_S;lesson8=day2_8_S;lesson9=day2_9_S;lesson10=day2_10_S;lesson11=day2_11_S;lesson12=day2_12_S;
			time1=day2_1_time_S;time2=day2_2_time_S;time3=day2_3_time_S;time4=day2_4_time_S;time5=day2_5_time_S;time6=day2_6_time_S;time7=day2_7_time_S;time8=day2_8_time_S;time9=day2_9_time_S;time10=day2_10_time_S;time11=day2_11_time_S;time12=day2_12_time_S;}
		if (day_of_week==4) {
			lesson1=day3_1_S;lesson2=day3_2_S;lesson3=day3_3_S;lesson4=day3_4_S;lesson5=day3_5_S;lesson6=day3_6_S;lesson7=day3_7_S;lesson8=day3_8_S;lesson9=day3_9_S;lesson10=day3_10_S;lesson11=day3_11_S;lesson12=day3_12_S;
			time1=day3_1_time_S;time2=day3_2_time_S;time3=day3_3_time_S;time4=day3_4_time_S;time5=day3_5_time_S;time6=day3_6_time_S;time7=day3_7_time_S;time8=day3_8_time_S;time9=day3_9_time_S;time10=day3_10_time_S;time11=day3_11_time_S;time12=day3_12_time_S;}
		if (day_of_week==5) {
			lesson1=day4_1_S;lesson2=day4_2_S;lesson3=day4_3_S;lesson4=day4_4_S;lesson5=day4_5_S;lesson6=day4_6_S;lesson7=day4_7_S;lesson8=day4_8_S;lesson9=day4_9_S;lesson10=day4_10_S;lesson11=day4_11_S;lesson12=day4_12_S;
			time1=day4_1_time_S;time2=day4_2_time_S;time3=day4_3_time_S;time4=day4_4_time_S;time5=day4_5_time_S;time6=day4_6_time_S;time7=day4_7_time_S;time8=day4_8_time_S;time9=day4_9_time_S;time10=day4_10_time_S;time11=day4_11_time_S;time12=day4_12_time_S;}
		if (day_of_week==6) {
			lesson1=day5_1_S;lesson2=day5_2_S;lesson3=day5_3_S;lesson4=day5_4_S;lesson5=day5_5_S;lesson6=day5_6_S;lesson7=day5_7_S;lesson8=day5_8_S;lesson9=day5_9_S;lesson10=day5_10_S;lesson11=day5_11_S;lesson12=day5_12_S;
			time1=day5_1_time_S;time2=day5_2_time_S;time3=day5_3_time_S;time4=day5_4_time_S;time5=day5_5_time_S;time6=day5_6_time_S;time7=day5_7_time_S;time8=day5_8_time_S;time9=day5_9_time_S;time10=day5_10_time_S;time11=day5_11_time_S;time12=day5_12_time_S;}
		if (day_of_week==7) {
			lesson1=day6_1_S;lesson2=day6_2_S;lesson3=day6_3_S;lesson4=day6_4_S;lesson5=day6_5_S;lesson6=day6_6_S;lesson7=day6_7_S;lesson8=day6_8_S;lesson9=day6_9_S;lesson10=day6_10_S;lesson11=day6_11_S;lesson12=day6_12_S;
			time1=day6_1_time_S;time2=day6_2_time_S;time3=day6_3_time_S;time4=day6_4_time_S;time5=day6_5_time_S;time6=day6_6_time_S;time7=day6_7_time_S;time8=day6_8_time_S;time9=day6_9_time_S;time10=day6_10_time_S;time11=day6_11_time_S;time12=day6_12_time_S;}
		if (day_of_week==1) {
			lesson1="";lesson2="";lesson3="";lesson4="";lesson5="";lesson6="";lesson7="";lesson8="";lesson9=day7_9_S;lesson10=day7_10_S;lesson11=day7_11_S;lesson12=day7_12_S;
			time1="";time2="";time3="";time4="";time5="";time6="";time7="";time8="";time9=day7_9_time_S;time10=day7_10_time_S;time11=day7_11_time_S;time12=day7_12_time_S;}
		timetable_show(lesson1,lesson2,lesson3,lesson4,lesson5,lesson6,lesson7,lesson8,lesson9,lesson10,lesson11,lesson12,time1,time2,time3,time4,time5,time6,time7,time8,time9,time10,time11,time12);
	}
	
	public String IsLesson(String time,String lessn,String number)  //возвращает какая пара в это время
	{
		if ((lessn.length()!=0)&(time.length()==0)) {return lessn;} //если есть урок без времени
		if ((lessn.length()!=0)&(time.length()!=0)) {return (number+") "+time+" : "+lessn);}
		return ""; //если время и/или урока нет,то ничего не выводит на экран
	}
	
	public int weekNumber() { //находит какая по счёту неделя идёт с начала четверти/года
		int result = 0;
		Calendar firstDateOfStudying = first_date_of_studying.getInstance(); firstDateOfStudying.setTime(first_date_of_studying.getTime());
		firstDateOfStudying.add(Calendar.DATE, -Math.abs(1 - first_date_of_studying.get(Calendar.DAY_OF_WEEK))); //ставим на одинаковый день недели
		while (user_date.after(firstDateOfStudying)) {
			result++;
			if (firstDateOfStudying.get(Calendar.WEEK_OF_YEAR) == autumnHolidays.get(Calendar.WEEK_OF_YEAR) || firstDateOfStudying.get(Calendar.WEEK_OF_YEAR) == winterHolidays.get(Calendar.WEEK_OF_YEAR) || firstDateOfStudying.get(Calendar.WEEK_OF_YEAR) == springHolidays.get(Calendar.WEEK_OF_YEAR))
				result--; //не учитываем недели с каникулами
			firstDateOfStudying.add(Calendar.DATE, 7);
		}
		return result;
	}
	
	public void timetable_show(String lessn1,String lessn2,String lessn3,String lessn4,String lessn5,String lessn6,String lessn7,String lessn8,String lessn9,String lessn10,String lessn11,String lessn12,String time1,String time2,String time3,String time4,String time5,String time6,String time7,String time8,String time9,String time10,String time11,String time12)  //показывает расписание на заданный день
	{
		Calendar today = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		String output_txt="";
		if ((today.get(Calendar.DAY_OF_MONTH) == user_date.get(Calendar.DAY_OF_MONTH))&(today.get(Calendar.MONTH) == user_date.get(Calendar.MONTH))&(today.get(Calendar.YEAR) == user_date.get(Calendar.YEAR)) )
			{output_txt="Сегодня: ";}
		else {
			user_date.add(Calendar.DAY_OF_MONTH,1); //проверяем вчерашний день
			if ((today.get(Calendar.DAY_OF_MONTH) == user_date.get(Calendar.DAY_OF_MONTH))&(today.get(Calendar.MONTH) == user_date.get(Calendar.MONTH))&(today.get(Calendar.YEAR) == user_date.get(Calendar.YEAR)) )
				{output_txt="Вчера: ";}
			else {
				user_date.set(DatePicker.getYear(),DatePicker.getMonth(),DatePicker.getDayOfMonth());
				user_date.add(Calendar.DAY_OF_MONTH,-1); //проверяем завтрашний день
				if ((today.get(Calendar.DAY_OF_MONTH) == user_date.get(Calendar.DAY_OF_MONTH))&(today.get(Calendar.MONTH) == user_date.get(Calendar.MONTH))&(today.get(Calendar.YEAR) == user_date.get(Calendar.YEAR)) )
					 {output_txt="Завтра: ";}
				else {output_txt="В этот день: ";}
			}
		}
		user_date.set(DatePicker.getYear(),DatePicker.getMonth(),DatePicker.getDayOfMonth());
		if (UpperWeek) {weekNow_txtV.setText(output_txt + "(Верхняя неделя №" + weekNumber() + ")");}
		else {weekNow_txtV.setText(output_txt + "(Нижняя неделя №" + weekNumber() + ")");}
		output_txt = IsLesson(time1,lesson_parse(lessn1),"1")+'\n'+IsLesson(time2,lesson_parse(lessn2),"2")+'\n'+IsLesson(time3,lesson_parse(lessn3),"3")+'\n'+IsLesson(time4,lesson_parse(lessn4),"4")+'\n'+IsLesson(time5,lesson_parse(lessn5),"5")+'\n'+IsLesson(time6,lesson_parse(lessn6),"6")+'\n'+IsLesson(time7,lesson_parse(lessn7),"7")+'\n'+IsLesson(time8,lesson_parse(lessn8),"8");
		timetable_txtV.setText(output_txt);
		output_txt = IsLesson(time9, lesson_parse(lessn9),"1") + '\n' + IsLesson(time10, lesson_parse(lessn10),"2") + '\n' + IsLesson(time11, lesson_parse(lessn11),"3") + '\n' + IsLesson(time12, lesson_parse(lessn12),"4");
		if (output_txt.length() > 3) {timetable_txtV.setText(timetable_txtV.getText() + "\n    Кружки:\n" + output_txt);}
	}
	
	public void start_timetable()
	{
		user_date.set(DatePicker.getYear(),DatePicker.getMonth(),DatePicker.getDayOfMonth());
		if ((first_date_of_studying.get(Calendar.WEEK_OF_YEAR)%2)!=(user_date.get(Calendar.WEEK_OF_YEAR)%2)) //если сейчас не верхняя неделя
		   {UpperWeek=false;}
		else {UpperWeek=true;}
		day_parse(user_date.get(Calendar.DAY_OF_WEEK));
		onClick_DtPckr(DatePicker); //зачем-то нужно, без этого не работает
	}
	
	public void past_day(View v)  //нажали на кнопку "Вчера"
	{
		hideClipBoard();
		Calendar c = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		DatePicker.init(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)-1, null);
		start_timetable();
	}
	
	public void today(View v)  //нажали на кнопку "Сегодня"
	{
		hideClipBoard();
		Calendar c = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		DatePicker.init(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), null);
		start_timetable();
	}	
	
	public void future_day(View v) //нажали на кнопку "Завтра"
	{
		hideClipBoard();
		Calendar c = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		DatePicker.init(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)+1, null);
    	start_timetable();
	}
	
	public void onClick_DtPckr(View v)
	{DatePicker.init(user_date.get(Calendar.YEAR), user_date.get(Calendar.MONTH),user_date.get(Calendar.DAY_OF_MONTH), new OnDateChangedListener() {
		@Override
		public void onDateChanged(DatePicker view, int year,int monthOfYear, int dayOfMonth)
		{start_timetable();}
	});}
}

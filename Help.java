package com.mycompany.School_timetable;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;

public class Help extends Activity
{
	private SharedPreferences mSettings;
	
	TextView hints_txtV;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
		mSettings = getSharedPreferences("mysettings", Context.MODE_PRIVATE);
		if (mSettings.getBoolean("isLightTheme", false)) setTheme(R.style.AppTheme_Light);
		else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
		hints_txtV=(TextView) findViewById(R.id.hints_txtV);hints_txtV.setText("  Напишите расписание:"+'\n'+"    -чтобы разделить предметы на нижнюю и верхнюю неделю используйте символ '/', например:"+'\n'+"      Верхняя неделя/Нижняя неделя"+'\n'+"  Выберети по календарю начало четверти"+'\n'+"  При закрывании/сворачивании приложения эти данные сохраняться"+"\n\n"+"  Можно сохранить/загрузить файл с расписанием: для этого укажите путь к файлу и нажмите на кнопку, при этом, если файл существует, то расписание загрузится с него, если нет, то запишется в этот файл"+"\n"+"  Также вы можете сделать файл с расписанием вне этой программы (при этом нужно сохранять файл в кодировке Unicode) и загрузить его"+"\n\n"+"  Автор: Пшеничных Александр (galaxid3d@mail.ru)");
	}
}

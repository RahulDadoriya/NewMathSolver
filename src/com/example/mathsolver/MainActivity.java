package com.example.mathsolver;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost tabHost = getTabHost();
		//Tab for Calculator
		TabSpec specs = tabHost.newTabSpec("Calculator");
		
		//specs.setIndicator("Calculator");
		specs.setIndicator("", getResources().getDrawable(R.drawable.icon_cal));
        Intent calIntent = new Intent(this, Calculator.class);
		specs.setContent(calIntent);
		
		//Tab for Convertor
		TabSpec conspecs = tabHost.newTabSpec("Converter");
		//conspecs.setIndicator("Converter");
		conspecs.setIndicator("", getResources().getDrawable(R.drawable.icon_con));
		Intent conIntent = new Intent(this, Convertor.class);
		conspecs.setContent(conIntent);
		
		//Tab for Area
		TabSpec areaspec = tabHost.newTabSpec("Area");
		//areaspec.setIndicator("Area");
		areaspec.setIndicator("", getResources().getDrawable(R.drawable.icon_area));
		Intent areaIntent  =  new Intent(this, Area.class);
		areaspec.setContent(areaIntent);
		
				
		//adding tabs
		tabHost.addTab(specs);
		tabHost.addTab(conspecs);
		tabHost.addTab(areaspec);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

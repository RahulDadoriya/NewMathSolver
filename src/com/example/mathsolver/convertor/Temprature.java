package com.example.mathsolver.convertor;

import com.example.mathsolver.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class Temprature extends Fragment{
	Spinner sp1, sp2;
	EditText edt1, edt2;
	Button btn1;
	
	ArrayAdapter<String> adp1, adp2;
	String array1[] = {"Celsius","Fahrenheit","Kelvin"};
	String array2[] = {"Celsius","Fahrenheit","Kelvin"};
	
	int nspin1, nspin2;
	Double no1, no2;
	
	String str = new String();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		final ViewGroup view = (ViewGroup) inflater.inflate(R.layout.temp, container, false);	
		sp1 = (Spinner) view.findViewById(R.id.spin1);
		sp2 = (Spinner) view.findViewById(R.id.spin2);
		btn1 = (Button) view.findViewById(R.id.btn);
		
		adp1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,array1);
		adp2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,array2);
		
		adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		sp1.setAdapter(adp1);
		sp1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				nspin1 = Integer.parseInt(String.valueOf(arg2));
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		sp2.setAdapter(adp2);
		sp2.setOnItemSelectedListener(new OnItemSelectedListener(){

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				nspin2 = Integer.parseInt(String.valueOf(arg2));
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}});
		
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				edt1 =  (EditText) view.findViewById(R.id.number1);
				
				if(edt1.getText().toString().equals(""))
				{
					edt1.setError("Please Enter number");
				}
				
				switch(nspin1)
				{
				case 0:
					if (nspin2 == 0)
					{
						
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						
						edt2.setText(edt1.getText().toString());
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*33.8);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*274);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					
					break ;
				case 1:
					if (nspin2 == 0)
					{
						
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*(-17.2222));
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						
						edt2.setText(edt1.getText().toString());
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*255.7778);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					
					break ;
				case 2:
					if (nspin2 == 0)
					{
						
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*(-272));
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*(-457.6));
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						
						edt2.setText(edt1.getText().toString());
					}
					
					break ;
				}
				
			}});
		
		return view;
	}
}

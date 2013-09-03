package com.example.mathsolver.convertor;

import com.example.mathsolver.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class Length extends Fragment{

	Spinner sp1, sp2;
	EditText edt1, edt2;
	Button btn1;
	
	ArrayAdapter<String> adp1, adp2;
	String array1[] = {"Meters","Centimeter","Kilometer","Feet","Inches","Miles","Millimeters","Yards","Nautical Miles"};
	String array2[] = {"Meters","Centimeter","Kilometer","Feet","Inches","Miles","Millimeters","Yards","Nautical Miles"};
	
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
		
		final ViewGroup view = (ViewGroup) inflater.inflate(R.layout.length, container, false);	
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
		
		btn1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					edt1 =  (EditText) view.findViewById(R.id.number1);
					
					if(edt1.getText().toString().equals(""))
					{
						edt1.setError("Please Enter number");
					}
					
					switch(nspin1){
					
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
							no2 = Double.valueOf(no1*100);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1/1000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3.2808);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*39.3701);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000621371192);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.0936);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000539956803);
							
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
							no2 = Double.valueOf(no1*0.01);
							
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
							no2 = Double.valueOf(no1/100000	);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.032808399);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.393700787);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*6.21371192E-06);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*10);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.010936133);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*5.39956803E-06);
							
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
							no2 = Double.valueOf(no1*1000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*100000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							
							edt2.setText(edt1.getText().toString());
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3280.8399);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*39370.0787);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.621371192);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1000000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1093.6133);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.539956803);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						break ;
					case 3:
						if (nspin2 == 0)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.304799999536704);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*30.48);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000304799999536704);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							
							edt2.setText(edt1.getText().toString());
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*12);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000189393939033721);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*304.8);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.333333333333333);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00016457883330424);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						break ;
					case 4:
						if (nspin2 == 0)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.025400000025908);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.54);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.5400000025908E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.083333333545);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							
							edt2.setText(edt1.getText().toString());
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.57828282928985E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*25.4);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0277777778483333);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.37149028101892E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						break ;
					case 5:
						if (nspin2 == 0)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1609.344);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*160934.4001);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.6093	);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*5280);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*63360);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							
							edt2.setText(edt1.getText().toString());
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1609344.0006);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1760);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.868976241499139);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						break ;
					case 6:
						if (nspin2 == 0)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.001);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.1);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1E-06);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0032808399);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0393700787);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*6.21371192E-07);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							
							edt2.setText(edt1.getText().toString());
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0010936133);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*5.39956803E-07);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						break ;
					case 7:
						if (nspin2 == 0)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.91499998610112);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*91.44);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00091499998610112);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*36);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000568181817101164);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*914.4);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							
							edt2.setText(edt1.getText().toString());
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000493736499912721);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						break ;
					case 8:
						if (nspin2 == 0)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1852);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*185200.0002);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.852);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*6076.1155);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*72913.3858);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.1508);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1852000.0016);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2025.3718);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							
							edt2.setText(edt1.getText().toString());
						}
						break ;
						
					}
				}
			});
			return view;
		
	}

}

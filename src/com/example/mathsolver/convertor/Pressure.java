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

public class Pressure extends Fragment{
	Spinner sp1, sp2;
	EditText edt1, edt2;
	Button btn1;
	
	ArrayAdapter<String> adp1, adp2;
	String array1[] = {"Pounds/Sq Inch","Pounds/Sq Foot","Atmospheres","Bars","Inches of Mercury","Centimeters of Mercury","Kilogram/Sq Meters","Kilogram/Sq Centimeters","Pascals"};
	String array2[] = {"Pounds/Sq Inch","Pounds/Sq Foot","Atmospheres","Bars","Inches of Mercury","Centimeters of Mercury","Kilogram/Sq Meters","Kilogram/Sq Centimeters","Pascals"};
	
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
		final ViewGroup view = (ViewGroup) inflater.inflate(R.layout.pressure, container, false);	
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
						no2 = Double.valueOf(no1*144.0225);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0680590717299578);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0689662447257384);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.0366);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*5.173);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*703.2349);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.070323488045007);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*6896.3783);
						
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
						no2 = Double.valueOf(no1*0.006943359375);
						
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
						no2 = Double.valueOf(no1*0.00047255859375);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000478857421875);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.014140625);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.03591796875);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4.8828);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00048828125);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*47.884);
						
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
						no2 = Double.valueOf(no1*14.6931);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2116.1397);
						
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
						no2 = Double.valueOf(no1*1.0133);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*29.9235);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*76.0074);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*10332.7134);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.0333);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*101329.3036);
						
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
						no2 = Double.valueOf(no1*14.4998);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2088.3043);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.986846130315081);
						
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
						no2 = Double.valueOf(no1*29.5299);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*75.0076);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*10196.7982);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.0197);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*99996.4311);
						
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
						no2 = Double.valueOf(no1*0.491022099447514);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*70.7182);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0334185082872928);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0338639502762431);
						
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
						no2 = Double.valueOf(no1*2.5401);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*345.3039);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0345303867403315);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3386.2742);
						
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
						no2 = Double.valueOf(no1*0.193311582381729);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*27.8412);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0131566068515498);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0133319738988581);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.393692224034802);
						
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
						no2 = Double.valueOf(no1*135.9434);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0135943447525829);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1333.1498);
						
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
						no2 = Double.valueOf(no1*0.001422);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.2048);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9.678E-05);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9.807E-05);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.002896);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.007356);
						
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
						no2 = Double.valueOf(no1*0.0001);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9.8066);
						
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
						no2 = Double.valueOf(no1*14.22);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2048);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.9678);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.9807);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*28.96);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*73.56);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*10000);
						
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
						no2 = Double.valueOf(no1*98066.5);
						
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
						no2 = Double.valueOf(no1*0.000145003645485461);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.020883788041788);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9.86881350920039E-06);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.00003569006745E-05);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000295309815278408);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000750103246266564);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.101971621297793);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.0197161297793E-05);
						
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

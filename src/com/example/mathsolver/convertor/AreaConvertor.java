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

public class AreaConvertor extends Fragment{

	Spinner sp1, sp2;
	EditText edt1, edt2;
	Button btn1;
	
	ArrayAdapter<String> adp1, adp2;
	String array1[] = {"Sq.Meters","Sq.Centimeter","Sq.Kilometer","Sq.Feet","Sq.Inches","Sq.Miles","Sq.Millimeters","Sq.Yards","Acres","Hectares"};
	String array2[] = {"Sq.Meters","Sq.Centimeter","Sq.Kilometer","Sq.Feet","Sq.Inches","Sq.Miles","Sq.Millimeters","Sq.Yards","Acres","Hectares"};
	
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
		final ViewGroup view = (ViewGroup) inflater.inflate(R.layout.area, container, false);	
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
						no2 = Double.valueOf(no1*10000);
						
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
						no2 = Double.valueOf(no1*10.7639);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1550.0031);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3.86102159E-07);
						
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
						no2 = Double.valueOf(no1*1.196);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000247105381);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0001);
						
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
						no2 = Double.valueOf(no1*0.0001);
						
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
						no2 = Double.valueOf(no1*1E-10);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00107639104);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.15500031);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3.86102159E-11);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*100);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000119599005);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.47105381E-08);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1E-08);
						
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
						no2 = Double.valueOf(no1*1000000);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1000000000);//need one more zero
						
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
						no2 = Double.valueOf(no1*10763910.4);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1550003100);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.386102159);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1000000000);//more three zero
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1195990.05);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*247.1054);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*100);
						
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
						no2 = Double.valueOf(no1*0.0929030401442212);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*929.0304);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9.29030401442212E-08);
						
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
						no2 = Double.valueOf(no1*144);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3.58700643773475E-08);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*92903.0401);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.111111111627239);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.29568411308961E-05);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9.29030401442212E-06);
						
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
						no2 = Double.valueOf(no1*0.000645160000002581);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*6.4516);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*6.451600000002581E-10);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00694444443369178);
						
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
						no2 = Double.valueOf(no1*2.49097668901436-10);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*645.16);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000771604949661087);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.59422507606598E-07);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
						
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*6.4510000002581E-08);
						
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
						no2 = Double.valueOf(no1*2589988.1073);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*25899881072.6671);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.59);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*27878399.9237);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4014489595.2265);
						
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
						no2 = Double.valueOf(no1*2589988107266.71);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3097600.0059);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*640);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*258.9988);
						
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
						no2 = Double.valueOf(no1*1E-06);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.01);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1E-12);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.07639104E-05);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0015500031);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3.86102159E-13);
						
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
						no2 = Double.valueOf(no1*1.19599005E-06);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.47105381E-10);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1E-10);
						
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
						no2 = Double.valueOf(no1*0.836127357414052);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*8361.2736);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*8.36127357414052E-07);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1296);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3.2283057789653E-07);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*836127.3574);
						
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
						no2 = Double.valueOf(no1*0.00020661156218323);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*8.36127357414052E-05);
						
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
						no2 = Double.valueOf(no1*4046.8564);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*40468564.3005);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00404685643005079);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*43560);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*6272640.0118);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00156250000480564);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4046856430.0508);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4840);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						
						edt2.setText(edt1.getText().toString());
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.404685643005079);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					break ;
				case 9:
					if (nspin2 == 0)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*10000);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*100000000);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.01);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*107639.104);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*15500031);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00386102159);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1000000000);//one more zero
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*11959.9005);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.4711);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
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

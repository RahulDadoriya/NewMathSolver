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

public class Time extends Fragment{
	Spinner sp1, sp2;
	EditText edt1, edt2;
	Button btn1;
	
	ArrayAdapter<String> adp1, adp2;
	String array1[] = {"Miliseconds","Seconds","Minutes","Hours","Days","Weeks","Years"};
	String array2[] = {"Miliseconds","Seconds","Minutes","Hours","Days","Weeks","Years"};
	
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
		final ViewGroup view = (ViewGroup) inflater.inflate(R.layout.time, container, false);	
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
							no2 = Double.valueOf(no1*0.001);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.66666666667E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.7777777778E-07);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.15740741E-08);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.65343915E-09);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3.16887646E-11);
							
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
							no2 = Double.valueOf(no1*1000);
							
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
							no2 = Double.valueOf(no1*0.01666666666667);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00027777777778);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.15740741E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.65343915E-06);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3.16887646E-08);
							
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
							no2 = Double.valueOf(no1*60000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*60);
							
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
							no2 = Double.valueOf(no1*0.0166666666667967);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000694444445999861);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*9.92063489999802E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.90132587599962E-06);
							
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
							no2 = Double.valueOf(no1*3600000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3600);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*60);
							
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
							no2 = Double.valueOf(no1*0.0416666667596667);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00595238093995238);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000114079552559087);
							
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
							no2 = Double.valueOf(no1*86399999.8065);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*86399.9998);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1440);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*24);
							
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
							no2 = Double.valueOf(no1*0.14285714224);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00273790925530708);
							
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
							no2 = Double.valueOf(no1*604800001.258);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*604800.0013);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*10080);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*168);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*7);
							
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
							no2 = Double.valueOf(no1*0.019165364869944);
							
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
							no2 = Double.valueOf(no1*31556926015.3487);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*31556926.0153);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*525948.7669);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*8765.8128);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*365.2422);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*52.1775);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
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

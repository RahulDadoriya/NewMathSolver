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

public class Energy extends Fragment{
	Spinner sp1, sp2;
	EditText edt1, edt2;
	Button btn1;
	
	ArrayAdapter<String> adp1, adp2;
	String array1[] = {"British Thermal(BTU)","Foot-Pounds","Ergs","Kilowatt Hours","Watt Hours","Dietary Calories","Thermochemical Clories","Kilogram Meters","Newton Meters","Joules"};
	String array2[] = {"British Thermal(BTU)","Foot-Pounds","Ergs","Kilowatt Hours","Watt Hours","Dietary Calories","Thermochemical Clories","Kilogram Meters","Newton Meters","Joules"};
	
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
		final ViewGroup view = (ViewGroup) inflater.inflate(R.layout.energy, container, false);	
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
						no2 = Double.valueOf(no1*778.1693);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1055055852.9688);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000293094515954723);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.293094515954723);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.25218348859535);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*252.1583);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*107.6157);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1055.0559);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1055.0559);
						
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
						no2 = Double.valueOf(no1*0.00128506746351486);
						
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
						no2 = Double.valueOf(no1*1355817.9488);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3.76646226188051E-07);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000376646226188052);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000324040489773019);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.324040489773018);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.13849343078179);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.3558);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.3558);
						
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
						no2 = Double.valueOf(no1*9.4781712E-10);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*7.37562149E-07);
						
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
						no2 = Double.valueOf(no1*2.778E-13);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.778E-10);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.39E-10);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.39E-07);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.02E-07);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1E-06);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1E-06);
						
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
						no2 = Double.valueOf(no1*3411.8687);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2655011.3355);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3599712023038.16);
						
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
						no2 = Double.valueOf(no1*1000);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*860.3312);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*860331.1735);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*367170.6263);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3599172.023);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3599172.023);
						
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
						no2 = Double.valueOf(no1*3.4119);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2655.0113);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3599712023.0382);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.001);
						
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
						no2 = Double.valueOf(no1*0.86033117350612);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*860.3312);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*367.1706);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3599.712);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
						
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3599.712);
						
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
						no2 = Double.valueOf(no1*3.9658);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3086.0341);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4184100418.41);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00116234309623431);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.1623);
						
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
						no2 = Double.valueOf(no1*1000);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*426.7782);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4184.1004);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4184.1004);
						
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
						no2 = Double.valueOf(no1*0.0039657620083682);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*3.086);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4184100.4184);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1.16234309623431E-06);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00116234309623431);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.001);
						
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
						no2 = Double.valueOf(no1*0.426778242677824);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4.1841);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*4.1841);
						
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
						no2 = Double.valueOf(no1*0.00929232470588235);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*7.231);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9803921.5686);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.72352941176471E-06);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00272352941176471);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.00234313725490196);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.3431);
						
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
						no2 = Double.valueOf(no1*9.8039);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 9)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*9.8039);
						
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
						no2 = Double.valueOf(no1*0.00094781712);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.737562149);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1000000);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.778E-07);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0002778);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000239);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.239);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.102);
						
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
						no2 = Double.valueOf(no1*1);
						
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
						no2 = Double.valueOf(no1*0.00094781712);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 1)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.737562149);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 2)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1000000);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 3)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*2.778E-07);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 4)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.0002778);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 5)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.000239);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 6)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.239);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 7)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*0.102);
						
						str = String.valueOf(no2);
						
						edt2.setText(str);
					}
					if (nspin2 == 8)
					{
						edt1 =  (EditText) view.findViewById(R.id.number1);
						edt2 =  (EditText) view.findViewById(R.id.result);
						
						no1 = Double.valueOf(edt1.getText().toString());
						no2 = Double.valueOf(no1*1);
						
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

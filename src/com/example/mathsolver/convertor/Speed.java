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

public class Speed extends Fragment{
	Spinner sp1, sp2;
	EditText edt1, edt2;
	Button btn1;
	
	ArrayAdapter<String> adp1, adp2;
	String array1[] = {"Feet/Seconds","Feet/Minute","Miles/Minute","Miles/Hour","Meter/Second","Kilometer/Minute","Kilometer/Hour","Knots"};
	String array2[] = {"Feet/Seconds","Feet/Minute","Miles/Minute","Miles/Hour","Meter/Second","Kilometer/Minute","Kilometer/Hour","Knots"};
	
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
		final ViewGroup view = (ViewGroup) inflater.inflate(R.layout.speed, container, false);	
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
							no2 = Double.valueOf(no1*60);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0113636363359273);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.681818180155636);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.304799999536704);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0182879999722022);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.0973);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.592483799651425);
							
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
							no2 = Double.valueOf(no1*0.0166666666666667);
							
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
							no2 = Double.valueOf(no1*0.000189393938932121);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0113636363359273);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0050799999922784);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000304799999536704);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0182879999722022);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00987472999419041);
							
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
							no2 = Double.valueOf(no1*88);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*5280);
							
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
							no2 = Double.valueOf(no1*60);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*26.8224);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.6093);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*96.5606);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*52.1386);
							
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
							no2 = Double.valueOf(no1*1.4667);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*88);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0166666666666667);
							
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
							no2 = Double.valueOf(no1*0.447040000410562);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0268224000246337);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.6093);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.868976241607668);
							
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
							no2 = Double.valueOf(no1*3.2808);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*196.8504);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0372822715);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.2369);
							
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
							no2 = Double.valueOf(no1*0.06);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3.6);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.9438);
							
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
							no2 = Double.valueOf(no1*54.6807);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3280.8399);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.621371191666667);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*37.2823);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*16.6667);
							
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
							no2 = Double.valueOf(no1*60);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*32.3974);
							
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
							no2 = Double.valueOf(no1*0.911344416666667);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*54.6807);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0103561865277778);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.621371191666667);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.2777777777777778);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0166666666666667);
							
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
							no2 = Double.valueOf(no1*0.539956802777778);
							
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
							no2 = Double.valueOf(no1*1.6878);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*101.2686);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0191796574735256);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.1508);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.514444445090358);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0308666667054215);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.852);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
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

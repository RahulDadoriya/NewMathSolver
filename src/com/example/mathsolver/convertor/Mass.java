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

public class Mass extends Fragment{

	Spinner sp1, sp2;
	EditText edt1, edt2;
	Button btn1;
	
	ArrayAdapter<String> adp1, adp2;
	String array1[] = {"Grams","Milligrams","Stones","Long Tons","Pounds","Ounces","Kilograms","Short Ton","Centigrams"};
	String array2[] = {"Grams","Milligrams","Stones","Long Tons","Pounds","Ounces","Kilograms","Short Ton","Centigrams"};
	
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
		final ViewGroup view = (ViewGroup) inflater.inflate(R.layout.mass, container, false);	
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
							no2 = Double.valueOf(no1*1000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000157473044);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*9.84206528E-07);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00220462262);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0352739619);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.001);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.0231131E-06);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*100);
							
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
							no2 = Double.valueOf(no1*0.001);
							
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
							no2 = Double.valueOf(no1*1.5743044E-07);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*9.84206528E-10);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.20462262E-06);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*3.52739619E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1E-06);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.0231131E-09);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.1);
							
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
							no2 = Double.valueOf(no1*6350.2932);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*6350293.1968);
							
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
							no2 = Double.valueOf(no1*0.00625000001905088);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*14);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*224);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*6.3503);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00649706815853512);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*635029.3197);
							
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
							no2 = Double.valueOf(no1*1016046.9084);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1016046908.3985);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*160);
							
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
							no2 = Double.valueOf(no1*2240);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*35839.9999);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1016.0469);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.0395);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*101604690.8398);
							
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
							no2 = Double.valueOf(no1*453.5924);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*453592.3704);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0714285712989736);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000446428571979362);
							
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
							no2 = Double.valueOf(no1*16);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.453592370380378);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000464076296196217);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*45359.237);
							
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
							no2 = Double.valueOf(no1*28.3495);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*28349.5232);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.00446428570871706);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.79017857645302E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.0625000000354369);
							
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
							no2 = Double.valueOf(no1*0.0283495231648476);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.9004768528709E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2834.9523);
							
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
							no2 = Double.valueOf(no1*1000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1000000);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.157473044);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000984206528);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.2046);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*35.274);
							
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
							no2 = Double.valueOf(no1*0.0010231131);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 8)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*100000);
							
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
							no2 = Double.valueOf(no1*977409.047);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*977409046.9568);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*153.9156);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.961972364541124);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2154.8181);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*34477.0895);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*977.409);
							
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
							no2 = Double.valueOf(no1*97740904.6957);
							
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
							no2 = Double.valueOf(no1*0.01);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 1)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*10);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 2)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.57473044E-06);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 3)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*9.84206528E-09);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 4)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*2.20462262E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 5)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*0.000352739619);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 6)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1E-05);
							
							str = String.valueOf(no2);
							
							edt2.setText(str);
						}
						if (nspin2 == 7)
						{
							edt1 =  (EditText) view.findViewById(R.id.number1);
							edt2 =  (EditText) view.findViewById(R.id.result);
							
							no1 = Double.valueOf(edt1.getText().toString());
							no2 = Double.valueOf(no1*1.0231131E-08);
							
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

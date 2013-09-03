package area_vol;

import com.example.mathsolver.R;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
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

public class Cylinder extends Fragment {
	Spinner choice;
	EditText radius,result,height;
	double showResult;
	Button calculate,show;
	ArrayAdapter<String> adp1;
	String array1[] = {"Curved Surface Area","Total Surface Area","Volume"};
	String formula[]={"2πrh","2πrh + πr²","πr²h"};
	String unit;
	int nspin1;
	double no1,no2;
	double pie=Math.PI;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		ViewGroup view = (ViewGroup) inflater.inflate(R.layout.cylinder, container, false);
		choice = (Spinner) view.findViewById(R.id.choice);
		radius =(EditText)view.findViewById(R.id.radius);
		height=(EditText)view.findViewById(R.id.height);
		result =(EditText)view.findViewById(R.id.result);
		calculate=(Button)view.findViewById(R.id.calculate);
		show=(Button)view.findViewById(R.id.show);
		
		
		adp1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,array1);
		adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		choice.setAdapter(adp1);
		
		choice.setOnItemSelectedListener(new OnItemSelectedListener() {

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
		
		calculate.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(radius.getText().toString().equals(""))
				{
					radius.setError("Please Enter Radius.");
				}
				else if(height.getText().toString().equals(""))
				{
					height.setError("Please Enter Height.");
				}
				else
				{
				no1=Double.valueOf(radius.getText().toString());
				no2=Double.valueOf(height.getText().toString());
				switch(nspin1)
				{
				case 0:
					showResult=(2*pie*no1*no2);
					result.setText(String.valueOf(showResult));
					break;
					
				case 1:
					showResult=(2*pie*no1*no2)+(2*pie*no1*no1);
					result.setText(String.valueOf(showResult));
					break;
					
				case 2:
					showResult=(pie*no1*no1*no2);
					result.setText(String.valueOf(showResult));
					break;
				}
				
				show.setVisibility(View.VISIBLE);
				
				}// else ends here
			}// switch ends here
			
		});
		
		show.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder dialog=new AlertDialog.Builder(getActivity());
				dialog.setTitle(array1[nspin1]);
				if(nspin1==2)
				{
					unit="Cubic Uniits";
				}
				else
				{
					unit="Square Units";
				}
				dialog.setMessage("Formula Used : "+formula[nspin1]+".\nWhere, r = Radius of Cylinder.\nAnd, h = Height of Cylinder."+"\nr = "+no1+" Units"+"\nh = "+no2+" Units"+"\n"+array1[nspin1]+" = "+showResult+" "+unit);
				dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() 
		        {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}	
		        	
				}						
		        );	
				dialog.show();
			}
			
		});

		


		return view;
	}

}

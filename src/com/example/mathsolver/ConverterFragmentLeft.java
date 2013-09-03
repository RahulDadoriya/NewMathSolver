package com.example.mathsolver;

import com.example.mathsolver.convertor.*;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class ConverterFragmentLeft extends ListFragment {
	
	
	
	String[] unit_converter = {"Length","Mass","Energy","Data","Pressure","Speed","Power","Time","Area","Volume","Temprature"};
	
	
	
	
	@Override
	 public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  
	 
	  
	  ListAdapter mylistadapter = new ArrayAdapter<String>(
			getActivity(),
			android.R.layout.simple_selectable_list_item, unit_converter
			  );
	  setListAdapter(mylistadapter);
	  
	  	  
	  
	  
	}
	

	
	
	
	@Override
	 public void onListItemClick(ListView l, View v, int position, long id) {
	  // TODO Auto-generated method stub
		
			
		
	 // Toast.makeText(getActivity(), getListView().getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
	  Fragment fg = null;
	  FragmentManager fm = getFragmentManager();
	  
	  switch(position)
	  {
	  case 0:
		  fg = new Length();
		   break ;
	  case 1:
		  fg = new Mass();
		  break ;
	  case 2:
		  fg = new Energy();
		  break ;
	  case 3:
		  fg = new Data();
		  break ;
	  case 4:
		  fg = new Pressure();
		  break ;
	  case 5:
		  fg = new Speed();
		  break ;
	  case 6:
		  fg = new Power();
		  break ;
	  case 7:
		  fg = new Time();
		  break ;
	  case 8:
		  fg = new AreaConvertor();
		  break ;
	  case 9:
		  fg = new VolumeConvertor();
		  break ;
	  case 10:
		  fg = new Temprature();
		  break ;
	  default :
		  fg = new Length();
		  break ;
	  }
	  
	  FragmentTransaction ft = fm.beginTransaction();
	  
	  ft.replace(R.id.con_frag_right, fg).commit();
		
	
	}
	@Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	   Bundle savedInstanceState) {
	  return inflater.inflate(R.layout.con_frag_left, container, false);
	  
	  
	 }

	}




package com.example.mathsolver;

import area_vol.*;
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
public class AreaFragmentLeft extends ListFragment{

	String[] Area_Vol = {"Sphere","Hemisphere","Cuboid","Cone","Cyclinder","Cube"};

	
	@Override
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		
		
		ListAdapter mylist = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_selectable_list_item, Area_Vol);
				setListAdapter(mylist);
				
				
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			   Bundle savedInstanceState) {
		
			  	
			  return inflater.inflate(R.layout.area_left, container, false);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id){
		// TODO Auto-generated method stub
		
		Fragment fg = null;
		FragmentManager fm = getFragmentManager();
		switch(position)
		{
		case 0:
			fg = new Sphere();
			break;
		case 1:
			fg = new Hemisphere();
			break ;
		case 2:
			fg = new Cuboid();
			break ;
		case 3:
			fg = new Cone();
			break ;
		case 4:
			fg = new Cylinder();
			break;
		case 5:
			fg = new Cube();
			break;
		
		}
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(R.id.area_right, fg).commit();
		
	}
}



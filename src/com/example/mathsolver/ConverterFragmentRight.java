package com.example.mathsolver;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class ConverterFragmentRight extends Fragment {
	
	

	
	@Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	   Bundle savedInstanceState) {
		 // TODO Auto-generated method stub
		
		
	  return inflater.inflate(R.layout.con_frag_right, container, false);
	  
	 }
}

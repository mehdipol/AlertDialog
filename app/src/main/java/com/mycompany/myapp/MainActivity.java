package com.mycompany.myapp;

import android.*;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;



public class MainActivity extends Activity 
{
 @Override
 protected void onCreate(Bundle savedInstanceState)
 {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);
   Button btnalert = findViewById(R.id.btn); 
		
   //ALERT DIALOG button clicked 
   btnalert.setOnClickListener(new View.OnClickListener() 
   { 
	 @Override 
	 public void onClick(View view) 
	 { 
	    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this); 
		//set title
		alert.setTitle("Alert Dialog");
		//set message
		alert.setMessage("Exit from the app"); 
		//set Yes Button to exit from the app
		alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() 
		{ 
	       @Override 
		   public void onClick(DialogInterface dialogInterface, int i) 
		   { 
			  MainActivity.this.finish(); 
		   } 
		}); 
		//set no button to stay in the app
		alert.setNegativeButton("No", new DialogInterface.OnClickListener() 
		{ 
		   @Override 
		   public void onClick(DialogInterface dialogInterface, int i) { 
		   dialogInterface.cancel(); 
		   //show toast whene no button clicked
		   Toast.makeText(MainActivity.this,"so you want to stay here",Toast.LENGTH_SHORT).show();
		} 
		}); 
		//create and show the alert
		alert.create(); 
		alert.show(); 		
	  } 
	}); 
 }
}

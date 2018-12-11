package com.example.checkboxdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	CheckBox cb1,cb2,cb3,cb4;
	StringBuffer sb=new StringBuffer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=(CheckBox) findViewById(R.id.checkBox1);
        cb2=(CheckBox) findViewById(R.id.checkBox2);
        cb3=(CheckBox) findViewById(R.id.checkBox3);
        cb4=(CheckBox) findViewById(R.id.checkBox4);
    }


    public  void check(View v) {
		if (cb1.isChecked()) {
			sb.append(cb1.getText());
		}
		if (cb2.isChecked()) {
			sb.append("\n"+cb2.getText());
		}
		if (cb3.isChecked()) {
			sb.append("\n"+cb3.getText());
		}
		if (cb4.isChecked()) {
			sb.append("\n"+cb4.getText());
		}
		Toast.makeText(this, sb, Toast.LENGTH_SHORT).show();
	}
}

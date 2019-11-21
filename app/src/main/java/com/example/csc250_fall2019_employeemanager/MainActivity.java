package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddEmployeeClick(View v)
    {
        Intent i = new Intent(this, EmployeeEntryActivity.class);
        //i.putExtra("myValue", 15);
        Core.myValue = 15;
        this.startActivity(i);
        //this.startActivityForResult(i, 1);
    }

    @Override
    protected void onResume()
    {
        super.onResume();


        if(!Core.theEmployees.isEmpty())
        {
            Toast.makeText(this, "Name: " + Core.theEmployees.get(Core.theEmployees.size()-1).toString() + " " +Core.theEmployees.size() +"", Toast.LENGTH_LONG).show();

        }

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) //this gets called automatically when a result was provided by the another screen
    {
        String employeeName = data.getStringExtra("employee_name");
        Toast.makeText(this, "Received result: " + employeeName + "", Toast.LENGTH_LONG).show();
    }

    public void onEmployeeListClick(View v)
    {
        Intent i = new Intent(this, EmployeeListActivity.class);
        this.startActivity(i);
    }
}

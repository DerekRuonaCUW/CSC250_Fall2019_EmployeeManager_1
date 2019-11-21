package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EmployeeListActivity extends AppCompatActivity
{
    private ListView employeeLV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        //capable of showing a collection of things on the screen
        this.employeeLV = this.findViewById(R.id.employeeLV);


        //created a collection of 1000 unique strings

        ArrayList<String> theStrings = new ArrayList<String>();
        for(int i = 0; i < Core.theEmployees.size(); i++)
        {
            theStrings.add(Core.theEmployees.get(i).toString());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, theStrings);

        this.employeeLV.setAdapter(adapter);
    }
}
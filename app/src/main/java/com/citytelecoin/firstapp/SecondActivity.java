package com.citytelecoin.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SecondActivity extends AppCompatActivity {

    //My buttons for the screen, (or activity rather), are declared here.
    //Noting their naming schemes from their existence on the SecondActivity.xml code page

    Button button5;
    ToggleButton toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myNewMethod();





     //Here the toggle button is coded for use with a very simple if/else statement
     //All this code does is change the text for the button to on or off while displaying a toast message.


     toggle = (ToggleButton) findViewById(R.id.toggleButton);
     toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                           @Override
                                           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                               if (isChecked) {
                                                   Toast.makeText(SecondActivity.this, "I AM ON", Toast.LENGTH_SHORT).show();
                                               } else {
                                                   Toast.makeText(SecondActivity.this, "I AM OFF", Toast.LENGTH_SHORT).show();
                                               }
                                           }
                                       });



    //This creates a button that will bring me to a new Activity, (Screen).
    button5 = (Button) findViewById(R.id.button5);
    //Note that the OnClick now is set to make a new View when the user taps the button
        button5.setOnClickListener(new View.OnClickListener()
    {@Override
        public void onClick(View v)


        //Here an INTENT is created.  Here the Intent is called myIntent2, but can be whatever is wanted.
        //NOTE: As I am moving from this activity to my main page activity, the package context is reversed as it is on the MainActivity page.
        {Intent myIntent2 = new Intent(SecondActivity.this, MainActivity.class);
            // Here the intent I created is being asked to start.
            startActivity(myIntent2);
        }
    }





        );








}
    //The code below shows how to create a new method inside an activity
    //Please pay attention to the placement of this new method.
    //Note that the methods is OUTSIDE of the full @Override statement
    //with the final closing bracket above this denoting that.
    //Note that at the ON CREATE portion at the top of the code,
    //This method is called.  So it will display a toast message if the
    //user accesses this activity screen.
    private void myNewMethod (){
        Toast.makeText(this, "Second Screen Accessed!!!", Toast.LENGTH_SHORT).show();
    }

}




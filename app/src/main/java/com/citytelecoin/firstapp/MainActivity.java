// Following tutorial from https://www.youtube.com/watch?v=Slyo54ypNnE&t=209s


package com.citytelecoin.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Made Button in activity_main.xml. Here I am calling
    //Button in for use and making named place holders for the
    //ones I created.  Here I called them button1 and button2.
    Button button1, button2,button3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Note that the @Override does NOT see the Button details above so
        //I have to tell it what I am talking about.
        //Here is set button1 to equal the Button element.
        //The Override then uses the findViewById to see it from the layout
        //I then add the setOnClickListener addition to notice when the user taps it.

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action Goes Here
                //Here you can see I made a simple toast to show the user.
                //NOTE: You have to add the .show() at the end to make it actually display!
                Toast.makeText(getApplicationContext(),"TOASTY",Toast.LENGTH_LONG).show();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //This is for the second button on the screen
                //NOTE that in the above findViewByID I have to use button2
                //Otherwise if its still button, then the toast does not work right.
                Toast.makeText(getApplicationContext(),"I DO NOTHING",Toast.LENGTH_SHORT).show();
            }
        });




        //This creates a button that will bring me to a new Activity, (Screen).
        button3 = (Button) findViewById(R.id.button3);
        //Note that the OnClick now is set to make a new View when the user taps the button
        button3.setOnClickListener(new View.OnClickListener()
                                   {@Override
                                   public void onClick(View v)

                    //Here an INTENT is created.  Here is is called myIntent, but can be whatever is wanted.
                                   {Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                                   // Here the intent I created is being asked to start.  
                                   startActivity(myIntent);
                                   }
                                   }
        );


    }
}

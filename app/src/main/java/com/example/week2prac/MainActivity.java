package com.example.week2prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TITLE = "Main Activity";
    User user1;
    Button follow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "On Create:");
        user1 = new User("user1","hello",001,false);
        follow =findViewById(R.id.button);
        if (user1.Followed)
        {
            follow.setText("Unfollow");
        }
        else
        {
            follow.setText("Follow");
        }

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE, "On Start:");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TITLE, "On Resume:");
        follow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (user1.Followed)
                {
                    user1.Followed = false;
                    follow.setText("Follow");
                    Log.v(TITLE,"follow");

                }
                else {
                    user1.Followed = true;
                    follow.setText("Unfollow");
                    Log.v(TITLE,"Unfollow");
                }


            }

        }
        );

    }
    protected void onPause(){

        super.onPause();
        Log.v(TITLE, "On Pause:");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE, "On Stop:");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE, "On Destroy:");
    }

}
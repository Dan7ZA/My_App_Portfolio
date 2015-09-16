package com.appsteroid.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSpotifyStreamer(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Spotify Streamer App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickScoresApp(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Scores App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickLibraryApp(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Library App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickBuildItBigger(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Build It Bigger App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickXYZReader(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Click XYZ Reader App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickCapstone(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Capstone App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

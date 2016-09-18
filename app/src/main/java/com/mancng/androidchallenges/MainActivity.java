package com.mancng.androidchallenges;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnSubmit(View view) {

        EditText userName = (EditText) findViewById(R.id.txtName);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setImageResource(R.drawable.black);

        Toast.makeText(getApplicationContext(), "Hi " + userName.getText().toString() + "!", Toast.LENGTH_LONG).show();

        Log.i("Name", userName.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

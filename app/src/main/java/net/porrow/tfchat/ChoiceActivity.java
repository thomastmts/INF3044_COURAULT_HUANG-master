package net.porrow.tfchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void onClick(View v) {
        Intent intent3 = new Intent(this, RoomActivity.class);
        Intent intent2 = new Intent(this, LoginActivity.class);
        switch (v.getId()) {
            case R.id.porte1:
                startActivity(intent3);
            case R.id.porte2:
                startActivity(intent3);
            case R.id.porte3:
                startActivity(intent3);
            case R.id.imageButton2:
                startActivity(intent2);
        }
    }
}
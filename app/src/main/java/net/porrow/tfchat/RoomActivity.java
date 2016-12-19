package net.porrow.tfchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;

public class RoomActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_recording;
    private static final String TAG = "record";
    boolean isRecording = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        btn_recording = (Button) findViewById(R.id.btn_recording);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ChoiceActivity.class);
        switch (v.getId()) {
            case R.id.btn_recording:
                Button tiny = (Button)findViewById(R.id.btn_recording);
                tiny.setBackgroundResource(R.drawable.record2);
                if (isRecording) {
                    Toast.makeText(this, "Please stop the recording first", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        isRecording = true;
                        //software.bjtu.recorder.util.RecordUtil.start(globalData.fileName);
                        System.out.println("record start");
                        Toast.makeText(this, "Recording...", Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case R.id.btn_back:
                startActivity(intent);
                break;
        }
    }
}


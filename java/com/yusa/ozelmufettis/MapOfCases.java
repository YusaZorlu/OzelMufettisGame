package com.yusa.ozelmufettis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MapOfCases extends AppCompatActivity {
    Button buttonIs;
    Button buttonAk;
    Button buttonAt;
    Button buttonB;
    TextView numbers;
    int isNumber;
    int ankNumber;
    int antNumber;
    HomeWatcher mHomeWatcher;
    private boolean mIsBound = false;
    private MusicService mServ;
    private ServiceConnection Scon =new ServiceConnection(){

        public void onServiceConnected(ComponentName name, IBinder
                binder) {
            mServ = ((MusicService.ServiceBinder)binder).getService();
        }

        public void onServiceDisconnected(ComponentName name) {
            mServ = null;
        }
    };

    void doBindService(){
        bindService(new Intent(this,MusicService.class),
                Scon, Context.BIND_AUTO_CREATE);
        mIsBound = true;
    }

    void doUnbindService()
    {
        if(mIsBound)
        {
            unbindService(Scon);
            mIsBound = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_of_cases);
        doBindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        startService(music);
        mHomeWatcher = new HomeWatcher(this);
        mHomeWatcher.setOnHomePressedListener(new HomeWatcher.OnHomePressedListener() {
            @Override
            public void onHomePressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
            @Override
            public void onHomeLongPressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
        });
        mHomeWatcher.startWatch();
        buttonIs = findViewById(R.id.button65);
        buttonAk = findViewById(R.id.button3);
        buttonAt = findViewById(R.id.button4);
        buttonB = findViewById(R.id.button90);
        isNumber = 1;
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level2is",false)){
            isNumber =1;
        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level3is",false)){
            isNumber =2;
        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level4is",false)){
            isNumber =3;
        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level5is",false)){
            isNumber =4;
        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level6is",false)){
            isNumber =5;
        }
        else{isNumber =5;}
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level1ank",false)){
            ankNumber =0;
        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level2ank",false)){
            ankNumber =1;
        }
        else ankNumber =2;
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level1ant",false)){
            antNumber =0;
        }
        else antNumber =1;


        numbers = findViewById(R.id.textView3);
        numbers.setText("Keşfedilen Bölümler: \nİstanbul ("+isNumber+"/5) \nAnkara("+ankNumber+"/2)\n" +
                "Antalya("+antNumber+"/1)");
        buttonIs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Istanbul.class);
                startActivity(intent);
            }
        });
        buttonAk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ankara.class);
                startActivity(intent);

            }
        });
        buttonAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Antalya.class);
                startActivity(intent);

            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();

        if (mServ != null) {
            mServ.resumeMusic();
        }

    }
    @Override
    protected void onPause() {
        super.onPause();

        PowerManager pm = (PowerManager)
                getSystemService(Context.POWER_SERVICE);
        boolean isScreenOn = false;
        if (pm != null) {
            isScreenOn = pm.isScreenOn();
        }

        if (!isScreenOn) {
            if (mServ != null) {
                mServ.pauseMusic();
            }
        }

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        doUnbindService();
        Intent music = new Intent();
        music.setClass(this,MusicService.class);
        stopService(music);

    }

}
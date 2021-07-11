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

import java.util.List;

public class Istanbul extends AppCompatActivity {
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
        setContentView(R.layout.activity_istanbul);
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
        Button buttonLvl1 = findViewById(R.id.buttonIst);
        Button buttonLvl2 = findViewById(R.id.buttonIst2);
        Button buttonLvl3 = findViewById(R.id.buttonIst3);
        Button buttonLvl4 = findViewById(R.id.buttonIst4);
        Button buttonLvl5 = findViewById(R.id.buttonIst5);
        Button buttonLvl6 = findViewById(R.id.buttonIst6);
        Button toBack = findViewById(R.id.button85);


        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level2is",false)){
            buttonLvl2.setVisibility(View.GONE);
            buttonLvl3.setVisibility(View.GONE);
            buttonLvl4.setVisibility(View.GONE);
            buttonLvl5.setVisibility(View.GONE);
            buttonLvl6.setVisibility(View.GONE);

        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level3is",false)){
            buttonLvl2.setVisibility(View.VISIBLE);
            buttonLvl3.setVisibility(View.GONE);
            buttonLvl4.setVisibility(View.GONE);
            buttonLvl5.setVisibility(View.GONE);
            buttonLvl6.setVisibility(View.GONE);
        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level4is",false)){
            buttonLvl2.setVisibility(View.VISIBLE);
            buttonLvl3.setVisibility(View.VISIBLE);
            buttonLvl4.setVisibility(View.GONE);
            buttonLvl5.setVisibility(View.GONE);
            buttonLvl6.setVisibility(View.GONE);
        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level5is",false)){
            buttonLvl2.setVisibility(View.VISIBLE);
            buttonLvl3.setVisibility(View.VISIBLE);
            buttonLvl4.setVisibility(View.VISIBLE);
            buttonLvl5.setVisibility(View.GONE);
            buttonLvl6.setVisibility(View.GONE);
        }
        else if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("level6is",false)){
            buttonLvl2.setVisibility(View.VISIBLE);
            buttonLvl3.setVisibility(View.VISIBLE);
            buttonLvl4.setVisibility(View.VISIBLE);
            buttonLvl5.setVisibility(View.VISIBLE);
            buttonLvl6.setVisibility(View.GONE);
        }
        else {
            buttonLvl6.setVisibility(View.VISIBLE);
        }

        buttonLvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpOne.class);
                startActivity(intent);
            }
        });
        buttonLvl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpTwo.class);
                startActivity(intent);
            }
        });
        buttonLvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpThree.class);
                startActivity(intent);
            }
        });
        buttonLvl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpFour.class);
                startActivity(intent);
            }
        });
        buttonLvl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpFive.class);
                startActivity(intent);
            }
        });
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapOfCases.class);
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
    protected void onDestroy() {
        super.onDestroy();

        doUnbindService();
        Intent music = new Intent();
        music.setClass(this,MusicService.class);
        stopService(music);

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

}
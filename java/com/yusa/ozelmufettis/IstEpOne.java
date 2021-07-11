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

public class IstEpOne extends AppCompatActivity {
    Button hints;
    Button notes;
    Button question;
    Button investigate;
    Button blame;
    Button back;
    TextView upL;
    TextView midL;
    int upCount;
    int midCount;
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
                Scon,Context.BIND_AUTO_CREATE);
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
        setContentView(R.layout.activity_ist_ep_one);
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
        upCount = 2;
        if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("place3is1",false)){
            upCount++;
        }
        if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("place4is1",false)){
            upCount++;
        }
        midCount = 2;
        if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("IsSuspect3",false)){
            midCount++;
        }
        if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("IsSuspect4",false)){
            midCount++;
        }
        if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("IsSuspect5",false)){
            midCount++;
        }
        upL = findViewById(R.id.textView2);
        midL = findViewById(R.id.textView3);
        upL.setText("Keşfedilen Mekanlar: "+upCount+"/4");
        midL.setText("Keşfedilen Şüpheliler: "+midCount+"/5");
        hints= findViewById(R.id.button147);
        notes = findViewById(R.id.button148);
        question = findViewById(R.id.button149);
        investigate= findViewById(R.id.button150);
        blame= findViewById(R.id.button151);
        back= findViewById(R.id.button152);

        hints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpOneNotes.class);
                startActivity(intent);
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpOneHints.class);
                startActivity(intent);
            }
        });
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpOneQuestioning.class);
                startActivity(intent);
            }
        });
        investigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpOneInvestigate.class);
                startActivity(intent);
            }
        });
        blame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpOneBlame.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Istanbul.class);
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
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
import android.widget.TextView;

public class AnkEpTwo extends AppCompatActivity {

    TextView upL;
    TextView midL;
    int upC;
    int midC;

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
        setContentView(R.layout.activity_ank_ep_two);
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
        upC = 3;
        midC = 3 ;
        upL = findViewById(R.id.textView2);
        midL = findViewById(R.id.textView3);
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Suspect4",false)){
            midC++;
        }
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Suspect5",false)){
            midC++;
        }
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Suspect6",false)){
            midC++;
        }
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Suspect7",false)){
            midC++;
        }
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Suspect8",false)){
            midC++;
        }
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Suspect9",false)){
            midC++;
        }
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Place3",false)){
            upC++;
        }
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Place4",false)){
            upC++;
        }
        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                ("Ank2Place5",false)){
            upC++;
        }

        upL.setText("Keşfedilen Mekanlar: "+ upC+"/6");
        midL.setText("Keşfedilen Şüpheliler: " +midC+"/9");
    }
    public void toNotes(View view){
        Intent intent = new Intent(getApplicationContext(), AnkEpTwoNotes.class);
        startActivity(intent);
    }
    public void toHints(View view){
        Intent intent = new Intent(getApplicationContext(), AnkEpTwoHints.class);
        startActivity(intent);
    }
    public void toBlame(View view){
        Intent intent = new Intent(getApplicationContext(), AnkEpTwoBlame.class);
        startActivity(intent);
    }
    public void toInvestigate(View view){
        Intent intent = new Intent(getApplicationContext(), AnkEpTwoInvestigate.class);
        startActivity(intent);
    }
    public void toQuestioning(View view){
        Intent intent = new Intent(getApplicationContext(), AnkEpTwoQuestioning.class);
        startActivity(intent);
    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), Ankara.class);
        startActivity(intent);
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
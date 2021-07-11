package com.yusa.ozelmufettis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class AntEpOneBlame extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
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
        setContentView(R.layout.activity_ant_ep_one_blame);

        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,"AD HERE", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                Log.i("TAG", "onAdLoaded");
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.d("TAG", "The ad was dismissed.");
                        if (mServ != null) {
                            mServ.resumeMusic();
                        }
                        Intent intent = new Intent(getApplicationContext(), Antalya.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.d("TAG", "The ad failed to show.");
                        Intent intent = new Intent(getApplicationContext(), Antalya.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        // Called when fullscreen content is shown.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                        mInterstitialAd = null;
                        Log.d("TAG", "The ad was shown.");
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                Log.i("TAG", loadAdError.getMessage());
                mInterstitialAd = null;

            }
        });

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
        final TextView suspect = findViewById(R.id.textView24);
        final TextView tool = findViewById(R.id.textView59);
        final TextView hour = findViewById(R.id.textView60);


        Button t1 = findViewById(R.id.button162);
        Button t2 = findViewById(R.id.button163);
        Button t3 = findViewById(R.id.button164);
        Button t4 = findViewById(R.id.button165);
        Button t5 = findViewById(R.id.button166);
        Button t6 = findViewById(R.id.button167);

        Button s1 = findViewById(R.id.button155);
        Button s2 = findViewById(R.id.button156);
        Button s3 = findViewById(R.id.button157);
        Button s4 = findViewById(R.id.button158);
        Button s5 = findViewById(R.id.button159);
        Button s6 = findViewById(R.id.button160);
        Button s7 = findViewById(R.id.button161);
        Button s8 = findViewById(R.id.button183);
        Button s9 = findViewById(R.id.button184);

        Button h1 = findViewById(R.id.button168);
        Button h2 = findViewById(R.id.button169);
        Button h3 = findViewById(R.id.button170);
        Button h4 = findViewById(R.id.button171);


        Button checker = findViewById(R.id.button41);
        Button toBack = findViewById(R.id.button46);
        Button toHints = findViewById(R.id.button153);
        Button toNotes = findViewById(R.id.button98);

        s1.setVisibility(View.VISIBLE);
        s2.setVisibility(View.VISIBLE);
        s3.setVisibility(View.VISIBLE);

        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ant1Suspects",false)){
            s4.setVisibility(View.GONE);
            s5.setVisibility(View.GONE);
            s6.setVisibility(View.GONE);
            s7.setVisibility(View.GONE);
            s8.setVisibility(View.GONE);
            s9.setVisibility(View.GONE);
        }
        else {
            s4.setVisibility(View.VISIBLE);
            s5.setVisibility(View.VISIBLE);
            s6.setVisibility(View.VISIBLE);
            s7.setVisibility(View.VISIBLE);
            s8.setVisibility(View.VISIBLE);
            s9.setVisibility(View.VISIBLE);
        }

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tool.setText("Kasap Bıçağı");
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tool.setText("Av Bıçağı");
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tool.setText("Meyve Bıçağı");
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tool.setText("Yüksekten Atarak");
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tool.setText("Ustura");
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tool.setText("Cam Parçası");
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Otel Sahibi");
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Otel Temizlikçisi");
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Otel Güvenliği");
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("305. Oda Sakini");
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("306. Oda Sakini");
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("307. Oda Sakini");
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("308. Oda Sakini");
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("310. Oda Sakini");
            }
        });
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("311. Oda Sakini");
            }
        });
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("10.00");
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("11.00");
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("12.00");
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("13.00");
            }
        });

        checker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suspect.getText().toString().equals("307. Oda Sakini")&
                        hour.getText().toString().equals("11.00")&
                        tool.getText().toString().equals("Meyve Bıçağı")){
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                            .edit().putBoolean("level2ant",true).apply();
                    if (mInterstitialAd != null) {
                        mServ.pauseMusic();
                        mInterstitialAd.show(AntEpOneBlame.this);
                    }
                    else {
                        Intent intent = new Intent(getApplicationContext(), Antalya.class);
                        startActivity(intent);
                    }

                }
                else{
                    Toast.makeText(AntEpOneBlame.this,"Bilgilerden en az birisi" +
                            " hatalı tekrar dene", Toast.LENGTH_LONG).show();
                }

            }});
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AntEpOne.class);
                startActivity(intent);
            }
        });
        toHints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AntEpOneHints.class);
                startActivity(intent);
            }
        });
        toNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AntEpOneNotes.class);
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

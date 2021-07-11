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

public class IstEpFiveBlame extends AppCompatActivity {
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
        setContentView(R.layout.activity_ist_ep_five_blame);
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
                        Intent intent = new Intent(getApplicationContext(), Istanbul.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.d("TAG", "The ad failed to show.");
                        Intent intent = new Intent(getApplicationContext(), Istanbul.class);
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

        Button s1 = findViewById(R.id.button155);
        Button s2 = findViewById(R.id.button156);
        Button s3 = findViewById(R.id.button157);
        Button s4 = findViewById(R.id.button158);
        Button s5 = findViewById(R.id.button159);
        Button s6 = findViewById(R.id.button160);
        Button s7 = findViewById(R.id.button161);

        Button h1 = findViewById(R.id.button168);
        Button h2 = findViewById(R.id.button169);
        Button h3 = findViewById(R.id.button170);
        Button h4 = findViewById(R.id.button171);
        Button h5 = findViewById(R.id.button182);
        Button h6 = findViewById(R.id.button81);


        s1.setVisibility(View.VISIBLE);
        s2.setVisibility(View.VISIBLE);
        s3.setVisibility(View.VISIBLE);
        s4.setVisibility(View.VISIBLE);
        s5.setVisibility(View.VISIBLE);
        s6.setVisibility(View.VISIBLE);
        s7.setVisibility(View.VISIBLE);

        Button checker = findViewById(R.id.button41);
        Button toBack = findViewById(R.id.button46);
        Button toHints = findViewById(R.id.button153);
        Button toNotes = findViewById(R.id.button98);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tool.setText("?");
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Karısı");
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Kız Kardeşi");
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Erkek Kardeşi");
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("İş Arkadaşı");
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Yan Komşusu");
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Borçlu Olduğu Arkadaşı");
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suspect.setText("Askerlik Arkadaşı");
            }
        });
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("00.00");
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("07.30");
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("9.30");
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("11.00");
            }
        });
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("12.30");
            }
        });
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hour.setText("13.30");
            }
        });

        checker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suspect.getText().toString().equals("İş Arkadaşı")&
                        hour.getText().toString().equals("12.30")){
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                            .edit().putBoolean("level5is",true).apply();
                    if (mInterstitialAd != null) {
                        mServ.pauseMusic();
                        mInterstitialAd.show(IstEpFiveBlame.this);
                    }
                    else {
                        Intent intent = new Intent(getApplicationContext(), Istanbul.class);
                        startActivity(intent);
                    }

                }
                else{
                    Toast.makeText(IstEpFiveBlame.this,"Bilgilerden en az birisi" +
                            " hatalı tekrar dene", Toast.LENGTH_LONG).show();
                }

            }});
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpFive.class);
                startActivity(intent);
            }
        });
        toHints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpFiveHints.class);
                startActivity(intent);
            }
        });
        toNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpFiveNotes.class);
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

package com.yusa.ozelmufettis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnkEpOneInvestigate extends AppCompatActivity {
    TextView textViewR;
    Button i0;
    Button i1;
    Button i2;
    Button i3;
    Button i11;
    Button i12;
    Button i13;
    Button i21;
    Button i22;
    Button i23;
    Button i31;
    Button i32;
    Button i33;


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
        setContentView(R.layout.activity_ank_ep_one_investigate);
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
        textViewR = findViewById(R.id.textViewR5);
        i0 = findViewById(R.id.button101);
        i1 = findViewById(R.id.akE1I1);
        i2 = findViewById(R.id.akE1I2);
        i3 = findViewById(R.id.akE1I3);
        i11 = findViewById(R.id.akE1I11);
        i12 = findViewById(R.id.akE1I12);
        i13 = findViewById(R.id.akE1I13);
        i21 = findViewById(R.id.akE1I21);
        i22 = findViewById(R.id.akE1I22);
        i23 = findViewById(R.id.akE1I23);
        i31 = findViewById(R.id.akE1I31);
        i32 = findViewById(R.id.akE1I32);
        i33 = findViewById(R.id.akE1I33);

        i0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                textViewR.setText("Hadi başlayalım!");
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Dinlenme odası dişçinin girişine yakın ama tuvalete uzak. Odanın" +
                        " her tarafında dergiler var.");
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i11.setVisibility(View.VISIBLE);
                i12.setVisibility(View.VISIBLE);
                i13.setVisibility(View.VISIBLE);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Bekleme odası, dinlenme odasıyla muaynehaneler arasında");
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i21.setVisibility(View.VISIBLE);
                i22.setVisibility(View.VISIBLE);
                i23.setVisibility(View.VISIBLE);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Tuvalet dişçinin girişinden başlayan koridorun en sonunda." +
                        " Tuvaletteki kanıtları ise polis toplamış.");
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i31.setVisibility(View.VISIBLE);
                i32.setVisibility(View.VISIBLE);
                i33.setVisibility(View.VISIBLE);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Tuvalete telefondan müzik açıp koyunca ses çok az duyuluyor." +
                        " Bu odada olup da duymadım diyen birisinin yalan söyleme ihtimali düşük.");
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Dergiler İstanbul'la ve magazinle alakalı boş dergiler.");
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Bir kaç rahat koltuk ve ortada üzerinde bir kaç dergi " +
                        "olan bir masa.");
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Tuvalete telefondan müzik açıp koyunca ses biraz duyuluyor ancak" +
                        " gürültü olsa duyulmayabilir.");
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("2 koltuk, ortalarında bir sehpa, Bir kenarda masa ve 4 sandalye var" +
                        " bir de kahve makinesi var.");
            }
        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Odada anormal gözüken bir tek koltuğun arkasına saklanmış bir el" +
                        "diven kutusu var neden anlamadım.");
            }
        });
        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Herhangi bir parmak izine kurbanın eli dışında rastlanmamış." +
                        "Elinde kadın asistanın dna si tespit edilmiş ancak tokalaşmadan dolayı" +
                        " olabilir. ");
            }
        });
        i32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Çöpten kullanılmış eldivenler çıkmış ancak eldivenlerde yeni diş" +
                        "hekimi ve dişçide çalışmayan şüpheliler dışında herkesin parmak izi var.");
            }
        });
        i33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Oldukça dar bir tuvalet. Kurban hazırlıksız yakalandıysa müca" +
                        "dele edememesi normal.");
            }
        });

    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), AnkEpOne.class);
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
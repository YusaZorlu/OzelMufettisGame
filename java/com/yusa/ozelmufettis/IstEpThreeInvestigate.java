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

public class IstEpThreeInvestigate extends AppCompatActivity {
    TextView textViewR;
    Button i0;
    Button i1;
    Button i2;
    Button i3;
    Button i11;
    Button i12;
    Button i13;
    Button i131;
    Button i132;
    Button i133;
    Button i31;
    Button i32;
    Button i33;
    Button i331;
    Button i332;
    Button i333;
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
        setContentView(R.layout.activity_ist_ep_three_investigate);
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
        textViewR = findViewById(R.id.textViewR2);
        i0 = findViewById(R.id.is3i0);
        i1 = findViewById(R.id.is3i1);
        i2 = findViewById(R.id.is3i2);
        i3 = findViewById(R.id.is3i3);
        i11 = findViewById(R.id.is3i11);
        i12 = findViewById(R.id.is3i12);
        i13 = findViewById(R.id.is3i13);
        i131 = findViewById(R.id.is3i131);
        i132 = findViewById(R.id.is3i132);
        i133 = findViewById(R.id.is3i133);
        i31 = findViewById(R.id.is3i31);
        i32 = findViewById(R.id.is3i32);
        i33 = findViewById(R.id.is3i33);
        i331 = findViewById(R.id.is3i331);
        i332 = findViewById(R.id.is3i332);
        i333 = findViewById(R.id.is3i333);

        //Onclick methods
        i0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Olay olalı bir gün" +
                        " geçmiş. Bakalım kanıt olarak ne bulabileceğim.");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i131.setVisibility(View.GONE);
                i132.setVisibility(View.GONE);
                i133.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kıyafetleri, cüzdanı, saati ve telefonu bulunmuş");
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
                textViewR.setText("Otopsiye göre boğularak öldürülmüş.");
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Odaların hepsini polisler inceledikten sonra evdekiler temizlik" +
                        " yapıp evi toplamışlar.");
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
                textViewR.setText("Kıyafetlerinde kan lekesi ya da başka bir iz yok.");
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Saati pahalı ve cüzdanında para olduğuna göre öldüren kişi" +
                        " paraya dokunmamış.");
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Şifresiz olduğu için incelmeye müsait bir telefon.");
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i131.setVisibility(View.VISIBLE);
                i132.setVisibility(View.VISIBLE);
                i133.setVisibility(View.VISIBLE);
            }
        });
        i131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("En son babası ve kardeşiyle mesajlaşmış.");
            }
        });
        i132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kız arkadaşıyla 11 gibi görüşmüş");
            }
        });
        i133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Ölünün son oyun saati gece 3te onun " +
                        "dışında kayda değer bir şey gözükmüyor.");
            }
        });
        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Valizler salonda toplanmış galiba herkes gitmeye hazırlanıyor.");
            }
        });
        i32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Tuvalet temiz şekilde bırakılmış.");
            }
        });
        i33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Oda boşaltılmış içerisinde kişisel hiç bir eşya kalmamış." +
                        "Polislerden toplanan deliller hakkında bilgi isteyebilirim");
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i331.setVisibility(View.VISIBLE);
                i332.setVisibility(View.VISIBLE);
                i333.setVisibility(View.VISIBLE);
                if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                        getBoolean("is3placeQ1",false)){
                    i332.setText("Yastıktaki parmak izlerini incelemeye gönder.");
                }
                else {i332.setText("---Bu seçenek daha çok şüpheliyle konuşursan açılacak---");}

            }
        });
        i331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Salon ve Arifle Burağın odası bu odanın iki yanında bulunuyor" +
                        " diğer odalar çok da yakın değil.");
            }
        });
        i332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                        getBoolean("is3placeQ1",false)){
                    textViewR.setText("Parmak izlerinden Emir, Ersin ve ölünün parmak izleri çıktı.");
                }
                else {textViewR.setText("Aklımda sorular var ama dilimin ucundan çıkmıyor");}
            }
        });
        i333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Odanın kapısından Hayri'nin parmak izi hariç herkesin" +
                        " parmak izi çıktı.");
            }
        });


    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), IstEpThree.class);
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
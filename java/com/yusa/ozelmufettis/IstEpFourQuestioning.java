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
import android.widget.Toast;

public class IstEpFourQuestioning extends AppCompatActivity {
    TextView textViewM;
    TextView textViewR;
    Button s1;
    Button s2;
    Button s3;
    Button s4;
    Button s5;
    Button s6;
    Button s7;
    Button s8;
    Button q1;
    Button q2;
    Button q3;
    Button q11;
    Button q12;
    Button q13;
    Button q131;
    Button q132;
    Button q133;
    Button q21;
    Button q22;
    Button q23;
    Button q221;
    Button q222;
    Button q223;
    Button q31;
    Button q32;
    Button q33;
    Button q311;
    Button q312;
    Button q313;
    Button q331;
    Button q332;
    Button q333;
    Button q4;
    Button q5;
    Button q6;
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
        setContentView(R.layout.activity_ist_ep_four_questioning);
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
        textViewM = findViewById(R.id.textView20);
        textViewR = findViewById(R.id.textView19);

        q1 = findViewById(R.id.isE4Q1);
        q2 = findViewById(R.id.isE4Q2);
        q3 = findViewById(R.id.isE4Q3);
        q11 = findViewById(R.id.isE4Q11);
        q12 = findViewById(R.id.isE4Q12);
        q13 = findViewById(R.id.isE4Q13);
        q131 = findViewById(R.id.isE4Q131);
        q132 = findViewById(R.id.isE4Q132);
        q133 = findViewById(R.id.isE4Q133);
        q21 = findViewById(R.id.isE4Q21);
        q22 = findViewById(R.id.isE4Q22);
        q23 = findViewById(R.id.isE4Q23);
        q221 = findViewById(R.id.isE4Q221);
        q222 = findViewById(R.id.isE4Q222);
        q223 = findViewById(R.id.isE4Q223);
        q31 = findViewById(R.id.isE4Q31);
        q32 = findViewById(R.id.isE4Q32);
        q33 = findViewById(R.id.isE4Q33);
        q311 = findViewById(R.id.isE4Q311);
        q312 = findViewById(R.id.isE4Q312);
        q313 = findViewById(R.id.isE4Q313);
        q331 = findViewById(R.id.isE4Q331);
        q332 = findViewById(R.id.isE4Q332);
        q333 = findViewById(R.id.isE4Q333);
        q4 = findViewById(R.id.isE4Q4);
        q5 = findViewById(R.id.isE4Q5);
        q6 = findViewById(R.id.isE4Q6);

        s1 = findViewById(R.id.button73);
        s2 = findViewById(R.id.button74);
        s3 = findViewById(R.id.button75);
        s4 = findViewById(R.id.button76);
        s5 = findViewById(R.id.button77);
        s6 = findViewById(R.id.button78);
        s7 = findViewById(R.id.button79);
        s8 = findViewById(R.id.button80);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Alt Komşu");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Üst Komşu");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Falcının Kedisi");
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.VISIBLE);
                q5.setVisibility(View.VISIBLE);
                q6.setVisibility(View.VISIBLE);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Bakkal");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Falcının Yeğeni");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Sabah Fal Baktıran");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Öğlen Fal Baktıran");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("İkindi Fal Baktıran");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Suspect4",false)){
            s4.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Suspect5",false)){
            s5.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Suspect678",false)){
            s6.setVisibility(View.GONE);
            s7.setVisibility(View.GONE);
            s8.setVisibility(View.GONE);
        }
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q11.setVisibility(View.VISIBLE);
                q12.setVisibility(View.VISIBLE);
                q13.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Dün neredeydin?\n-Tüm gün evdeydim.");
                    q13.setText("Dün apartmanda ne gördün veya duydun");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Dün neredeydin?\n-Arkadaşta gündeydim. Sonra pazara gittim." +
                            " Pazardan sonra markete gittim.");
                    q13.setText("Ne zamandır falcılık yapıyordu");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Dün neredeydin?\n-Bakkaldaydım yeğenim.");
                    q13.setText("Dün şüpheli bir şey gördün mü");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place3",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place3",true).apply();
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Dün neredeydin?\n-Sabahtan halama gittim sonra işleri halle" +
                            "dip evdeki valizi hazırlamaya eve gittim.");
                    q13.setText("Valizi ne için hazırladın");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Dün neredeydin?\n-Sabah fal baktırdım, sonra pazara gittim," +
                            " sonra eve döndüm gittim.");
                    q13.setText("Evin buraya yakın mı");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Dün neredeydin?\n-Öğlen uyandım, fal baktırdım,sonra eve" +
                            " gittim yemek yiyip uyudum.");
                    q13.setText("Psikolojini anlamak için soru sorabilir miyim");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Dün neredeydin?\n-Sabah evi düzenledeim." +
                            "Öğleden sonra falcıdaydım");
                    q13.setText("Psikolojini anlamak için soru sorabilir miyim");
                }

            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q21.setVisibility(View.VISIBLE);
                q22.setVisibility(View.VISIBLE);
                q23.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Ölüyü ne kadar zamandır tanıyorsun?\n-Buraya " +
                            "taşıdığımdan beri komşuyuz.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Ölüyü ne kadar zamandır tanıyorsun?\n-3 yıl önce ben buraya" +
                            " taşındığım zaman tanışmıştık.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ölüyü ne kadar zamandır tanıyorsun?\n-Yedi sekiz yıldır.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Ölüyü ne kadar zamandır tanıyorsun?\n-Çocukluğumdan beri" +
                            " tanırdım.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Ölüyü ne kadar zamandır tanıyorsun?\n-1 aydır. Üçüncü fal" +
                            " baktırışımdı");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Ölüyü ne kadar zamandır tanıyorsun?\n-Bir yıl civarı" +
                            " diyebilirim.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Ölüyü ne kadar zamandır tanıyorsun?\n-Üç yıldır geleceğimi" +
                            " incelettiriyordum.");
                }

            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q31.setVisibility(View.VISIBLE);
                q32.setVisibility(View.VISIBLE);
                q33.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Çevresi onu sever miydi?\n-Falcılığını severlerdi ama" +
                            " sevmeyenleri de vardı.");
                    q33.setText("Dün müşteri gelmiş miydi");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Çevresi onu sever miydi?\n-Alt komşu severdi ben sevmezdim.");
                    q33.setText("Tek başına mı yaşar");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Çevresi onu sever miydi?\n-Ben sevmezdim, çevresini hiç " +
                            "bilmem.");
                    q33.setText("Apartmandaki boş daire senin mi");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Çevresi onu sever miydi?\n-Biz severdik ama çevrede " +
                            "sevmeyenleri varmış öldüğüne göre.");
                    q33.setText("Psikolojik rahatsızlığı var mıydı");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Çevresi onu sever miydi?\n-Bana bir arkadaş övdü. " +
                            "İyi olmasa övmezdi herhalde.");
                    q33.setText("Diğer fal baktıranları tanıyor musun");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Çevresi onu sever miydi?\n-Iıı.... Evet.");
                    q33.setText("Aranızda samimiyet var mıydı");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Çevresi onu sever miydi?\n-Evet çok spritual biriydi.");
                    q33.setText("Falcı, sen çıkarken sana bir şey dedi mi");
                }

            }
        });
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Başka bir adresim" +
                            " yok, burada yaşarım.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Benim mi?\n+Evet\n-Burası.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Karşı apartman ama dün gece" +
                            " bakkalda yattım gitmeye üşendim eve.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-İstanbuldaki evim Karaağaç" +
                            " Mahallesinde");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place4",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place4",true).apply();
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Hacı Mahallesi, Hoca Sokak, İmam" +
                            " Apartmanı 3. katta oturuyorum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place5",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place5",true).apply();
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Sarıyerde Yeşilyer Mahallesinde" +
                            " oturuyorum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place6",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place6",true).apply();
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Konum atayım hemen bir dakika.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place7",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place7",true).apply();
                }

            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Şahidin var mı?\n-Kocam var evde o şahit.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Şahidin var mı?\n-Pazarı bilmem ama gündeki herkes şahit" +
                            " olur.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Şahidin var mı?\n-Kameralarım var bi de gece sigara almaya" +
                            " gelen elemanları bulursan tamam.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Şahidin var mı?\n-İkindi vaktine kadar arkadaşlar şahit" +
                            " olur bana işteki.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Şahidin var mı?\n-Evdeki çocuklarla marketteki kasiyer.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Şahidin var mı?\n-Şahidim yok ya.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Şahidin var mı?\n-Falcıdan çıkınca kızlarla gezdim onlar " +
                            "şahit.");
                }

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.VISIBLE);
                q132.setVisibility(View.VISIBLE);
                q133.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Dün apartmanda neler gördün ya da duydun?\n-Anormal bir " +
                            "şeyler hayır.");
                    q131.setText("En son ne zaman gördün");
                    q132.setText("Herhangi bir ses duydun mu");
                    q133.setText("Apartmanın kamerası var mı");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Ne zamandır falcılık yapıyordu?\n-En azından ben" +
                            " taşındığımdan beri yaptığını biliyorum..");
                    q131.setText("Daha önce tehdit edildi mi");
                    q132.setText("Müşterileri sabit mi");
                    q133.setText("Yabancılar rahatsız eder miydi");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Şüpheli bir şey gördün mü?\n-Kadının birisi arabam şurada" +
                            " gel binelim dedi.");
                    q131.setText("Ne gördün");
                    q132.setText("Ne zaman gördün");
                    q133.setText("Başka bir şey oldu mu");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Valizi ne için hazırladın\n-Ankaraya gideceğim yarın.");
                    q131.setText("Daha çok nerede yaşarsın");
                    q132.setText("Saat kaçta evine döndün");
                    q133.setText("Bana uygun bi cinayet var mı");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Evin buraya yakın mı?\n-Evet ama hemen yan sokak da değil.");
                    q131.setText("Neyle gidip geldin");
                    q132.setText("Maddi durumun iyi mi");
                    q133.setText("Ölünün bulunduğu yeri biliyor musun");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Psikolojini anlamak için bir kaç soru soracağım uygun mudur?" +
                            "\n-Olur");
                    q131.setText("Normalde çok uyur musun");
                    q132.setText("Psikoloğa gittin mi");
                    q133.setText("Çabuk mu sinirlenirsin");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Psikolojini anlamak için bir kaç soru soracağım uygun mudur?" +
                            "\n-Tamam");
                    q131.setText("Psikolojik rahatsızlığın var mı");
                    q132.setText("Çabuk mu sinirlenirsin");
                    q133.setText("Hiç sabıkan var mı");
                }

            }
        });
        q131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+En son ne zaman gördün?\n-1 gibi konuştuk");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Daha önce tehdit edildi mi?\n-Beddua edenler oldu en fazla");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ne gördün?\n-Kadının birisi çok değişik hareketler yapıyordu.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Daha çok nerede yaşarsın?\n-Ankarada yaşarım.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Neyle gelip gittin?\n-Belediye otobüsüyle.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Normalde çok uyur musun?\n- Genellikle hayır.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Hiç psikolojik rahatsızlığınız var mı?\n-Azcık takıntılıyım" +
                            " canım.");
                }

            }
        });
        q132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Herhangi bir ses ya da yardım çığlığı duydun mu?\n-Hayır");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Müşterileri sabit mi yoksa değişken mi?\n-Valla ben benzer" +
                            " tipler sık sık gelir.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ne zaman gördün?\n- İkindi gördüm yeğenim.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Dün evine saat kaçta döndün evine?\n-Saat 20 de eve döndüm.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Maddi durumun iyi midir?\n-Evet zaten falımı zevkine ba" +
                            "ktırıyorum");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Herhangi bir psikolojik destek aldın mı?\n-Yok niye gidecek" +
                            "mişim ki?");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Çabuk sinirlenir misin?\n-Bazen, günümde değilken.");
                }

            }
        });
        q133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Apartman kamera kayıtları var mı?\n-Bakkalın var silmediyse.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Apartmana yabancıların girmesi rahatsız ediyor mu sizi?\n-" +
                            "Ben de bakkal da rahatsızız.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ne zaman gördün?\n-İkindi saatlerinde.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Benim için uygun cinayet var mı çözmelik?\n-Bunu çözebilirsen" +
                            " Ankara'da var.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Ölünün bulunduğu yeri biliyor musun?\n-Valla polisler söyle" +
                            "yince ilçeyi bile zor çıkardım.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Çabuk sinirlenen birisi misin?\n-Hayır değilim.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Hiç sabıkan var mı?\n-Yok ki. Niye olsun?");
                }

            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Senin öldürmemen için bir sebep söyle?\n-Evliyim, " +
                            "genç sayılırım.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Senin öldürmemen için bir sebep söyle?\n-Avukat tutacak" +
                            " param bile yok ki.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Senin öldürmemen için bir sebep söyle?\n-Yeğenim halime" +
                            " baksana nasıl öldüreyüm?");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Senin öldürmemen için bir sebep söyle?\n-Akrabamı niye" +
                            " öldüreyim Allah rızası için");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Senin öldürmemen için bir sebep söyle?\n-Çoluğum çocuğum " +
                            "var benim.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Senin öldürmemen için bir sebep söyle?\n-Param var benim.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Senin öldürmemen için bir sebep söyle?\n-Ay bende karıncayı" +
                            " incitecek kötü enerji yok ki.");
                }

            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    textViewR.setText("+İkinizin arası nasıldı?\n-Aramız iyiydi sık sık sohbet e" +
                            "derdik.");
                    q222.setText("Diğer komşularla arası nasıldı");
                    q223.setText("Esnafla arası nasıldı");
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+İkinizin arası nasıldı?\n-Anlaşamazdık ama kin beslemezdim.");
                    q222.setText("Senden daha çok sevmeyen var mı");
                    q223.setText("Apartmanda kaç daire dolu");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+İkinizin arası nasıldı?\n-Sevmiyordum, aramız kötüydü");
                    q222.setText("Alışverişi nereden yapardı");
                    q223.setText("Dün gürültü duydun mu");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+İkinizin arası nasıldı?\n-İyiydi ama arada kavga ettiğimiz" +
                            " olurdu");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q222.setText("Komşularını tanıyor musun");
                    q223.setText("Peki ölüm tehditi almış mıydı");
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+İkinizin arası nasıldı?\n-Çok bir aramız yoktu ama iyiydi.");

                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+İkinizin arası nasıldı?\n-Bir yıldır geldiğime göre iyiydi.");
                    q222.setText("Evli misiniz");
                    q223.setText("Bir yere davet ettin mi");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+İkinizin arası nasıldı?\n-Severdim ablam gibiydi.");
                }

            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+İyi para kazanır mıydı?\n-Evet");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+İyi para kazanır mıydı?\n-Günah olmasa ertesi gün başlarım.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+İyi para kazanır mıydı?\n-Galiba kazanıyor ama nedense bana" +
                            " olan borcunu hala ödememekte ısrarcı.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+İyi para kazanır mıydı?\n-İki üniversite okudum" +
                            " halam benden zengin");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+İyi para kazanır mıydı?\n-1 seansı 350 lira öyle diyeyim.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+İyi para kazanır mıydı?\n-Benden çıkan parayla voleyi" +
                            " vurmuştur.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+İyi para kazanır mıydı?\n-Ben sık gitmezdim ama sık gidip" +
                            " gelenler zengin etmiştir.");
                }

            }
        });
        q221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Hiç kavga ettiniz mi?\n-Hiç kavga etmedik.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Hiç kavga ettiniz mi?\n-Laf atmışımdır ama hiç kavga olmadı.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Hiç kavga ettiniz mi?\n-Borcunu ödeyene kadar gelme dedim.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Hiç kavga ettiniz mi?\n-Dediğim gibi en son dün laflı " +
                            "bir kavgamız oldu ama ciddi değildi.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Hiç kavga ettiniz mi?\n-Ciddi tartışmadık ya.");
                }

            }
        });
        q222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Diğer komşularla arası nasıldı?\n-Falcılık yapması rahatsız" +
                            " ederdi.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Senden daha çok sevmeyen birisi var mı?\n-Bakkal var.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Alışverişi nereden yapardı?\n-İleri sokaktaki zincir" +
                            " marketten.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Komşularını tanıyor musun?\n-Alt komşusunu tanıyorum bir tek.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Evli misiniz?\n-Hayır kocam olacaktan boşandım üç ay önce.");
                }

            }
        });
        q223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Buradaki esnafla araları bozuk muydu?\n-Hepsiyle değil ama" +
                            " aşşağıdaki bakkalla arası bozuktu.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Apartmanda sadece 3 daire mi dolu?\n-Evet 4. daire boş.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Dün apartmanda gürültü duydun mu?\n-TV açıktı dikkat etmedim.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Peki hiç ölüm tehditi aldığını duydun mu?\n-Lafta tehdit " +
                            "edildiğini biliyorum da ölümle tehdit eden duymadım.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Ölüyü bir yere davet etmiş miydin o gün?\n-Hayır etmedim.");
                }

            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Öldürdüğünden şüphelendiğin birsi var mı?\n-Apartmanın " +
                            "bakkalından.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Suspect4",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                    q311.setVisibility(View.VISIBLE);
                    q312.setVisibility(View.VISIBLE);
                    q313.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Öldürdüğünden şüphelendiğin birsi var mı?\n-Bilemiyorum ama" +
                            " bakkal öldürdüyse şaşırmam.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Suspect4",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                    q311.setVisibility(View.VISIBLE);
                    q312.setVisibility(View.VISIBLE);
                    q313.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Öldürdüğünden şüphelendiğin birsi var mı?\n-Yeğeni olabilir" +
                            " buraya gelip gidiyor arada.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpFourQuestioning.this).getBoolean("Is4Suspect5",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpFourQuestioning.this).
                            edit().putBoolean("Is4Suspect5",true).apply();
                    s5.setVisibility(View.VISIBLE);
                    q311.setVisibility(View.VISIBLE);
                    q312.setVisibility(View.VISIBLE);
                    q313.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Öldürdüğünden şüphelendiğin birsi var mı?\n-Yok. Bakkalı" +
                            " sevmezdi ama öldürdüğünü zannetmiyorum.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Öldürdüğünden şüphelendiğin birsi var mı?\n-Şüphelendiğim " +
                            "birisi yok.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Öldürdüğünden şüphelendiğin birsi var mı?\n-Hayır, yok.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Öldürdüğünden şüphelendiğin birsi var mı?\n- Benden önce fal" +
                            " baktıran kadın farklı davranıyordu.");
                    q311.setVisibility(View.VISIBLE);
                    q312.setVisibility(View.VISIBLE);
                    q313.setVisibility(View.VISIBLE);
                }

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Sık görüştüğü arkadaşları?\n-Benle sık görüşürdü.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Sık görüştüğü arkadaşları?\n-Alt komşu ve bir kaç akrabası.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Sık görüştüğü arkadaşları?\n-Samimiyetim yok bilmem.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Sık görüştüğü arkadaşları?\n-Alt komşusu, benim annem mesela.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Sık görüştüğü arkadaşları?\n-Ben çıkarken alt komşuyla konuşu" +
                            "yordu.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Sık görüştüğü arkadaşları?\n-Benle ve alt komşusu.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Sık görüştüğü arkadaşları?\n-Bilmiyorum ben ya.");
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.VISIBLE);
                q332.setVisibility(View.VISIBLE);
                q333.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Dün müşterisi gelmiş miydi?\n-Evet gördüm geldiğini.");
                    q331.setText("Peki fal bakmaya gelenlere nerden ulaşabilirim");
                    q332.setText("Müşterisi çok mudur");
                    q333.setText("Daha önce tehdit edildi mi");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Tek başına mı yaşıyor?\n-Eşi ölmüş zaten çocukları da yokmuş." +
                            "Yani evet.");
                    q331.setText("Başka akrabası var mı");
                    q332.setText("Tanıdığınız arkadaşı");
                    q333.setText("Ölünün sigara alışkanlığı var mı");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Apartmandaki boş daire senin mi?\n-Yok ama" +
                            " sahibini tanıyorum.");
                    q331.setText("Neden şu an boş");
                    q332.setText("Mahallenin maddi durumu nasıl");
                    q333.setText("İyi para kazanıyor musun");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Ölünün psikolojik rahatsızlığı var mıydı?\n-Yoktu neden" +
                            " sordun ki?");
                    q331.setText("Falcılığa ne zaman başladı");
                    q332.setText("\"Ünlü\" bir falcı mıydı");
                    q333.setText("Nasıl fal bakardı");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Fal bakmaya gelen diğerlerini tanıyor musun?\n-Hayır sadece" +
                            " tavsiye veren arkadaşımı biliyorum.");
                    q331.setText("Daha önceden fal baktırıyor muydunuz");
                    q332.setText("Falcıdan çıktığınızda saat kaçtı");
                    q333.setText("Sabah fal baktırırken bir yüzünde sıkıntı gördünüz mü");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Aranızda bir samimiyet var mıydı?\n-Evet.");
                    q331.setText("Beraber vakit geçirir misiniz");
                    q332.setText("O gün size şüphe verici davranışı oldu mu");
                    q333.setText("En son saat kaçta konuştunuz");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Falcıdan çıkarken sana bir şey dedi mi?\n-Biraz konuştuk" +
                            " aslında");
                    q331.setText("Ne konuda konuştunuz");
                    q332.setText("Saat konuştuğunuzda kaçtı");
                    q333.setText("Yüzünde korku gördün mü");
                }

            }
        });
        q311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Nerede yaşar?\n-Bilmiyorum ama bakkalda bulabilirsiniz.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Nerede yaşar?\n-Mahallede bir yerlerde.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Nerede yaşar?\n-Yakınlarda küçük bir evi var yeğeninin.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Nerede yaşar?\n-Tanımıyorum ki bileyim.");
                }

            }
        });
        q312.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Parası varken bile borcunu ona " +
                            "ödemezdi.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Galiba bakkala biraz borç takmış.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Sözlü de olsa kavga ettiler.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Dediğim gibi. Buluştuktan" +
                            " sonra öldürmüş olabilir.");
                }

            }
        });
        q313.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Fiziksel özellikleri nelerdir?\n-Yaşlı, şişman bir adam.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Fiziksel özellikleri nelerdir?\n-Yaşlı, ak saçlı bi abi.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Fiziksel özellikleri nelerdir?\n-Aslında çok hatırlamıyorum" +
                            " ama uzun saçlı, sakallı bir gençti.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Fiziksel özellikleri nelerdir?\n-Baya kalıplı maskülen bir " +
                            "kadındı. Kavga etsek beni kesin döverdi.");
                }

            }
        });
        q331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Peki gelenlere nereden ulaşabilirim?\n-Not aldığı bir defter" +
                            " vardı evinde.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Başka akrabasını tanıyor musun?\n-Hayır, tanımıyorum.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Daire neden boş şu an?\n-Ev sahibi pahalıdan kiraya koymuş" +
                            " bence normal.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Falcılığa ne zaman başladı?\n-10 yıl önce diyebilirim.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Daha önceden başkasına fal baktırıyor muydun?\n-Parayla hayır.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+Beraber vakit geçirir miydiniz?\n-Evet, bazen.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Ne konusunda konuştunuz?\n-Öğlen gelen kadınla yemeğe gide" +
                            "ceğini söyledi. Çok da samimi değillerdi anladığım.");
                }

            }
        });
        q332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Müşterisi çok mudur?\n-Çok diyemem ama sık gelir çoğu müş" +
                            "terisi.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Tanıdığınız arkadaşı?\n-Sadece iki alt kattaki komşum.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Mahallenin sosyoekonomik durumu yani mahalleli zengin mi?\n-" +
                            "Orta üst diyeyim yeğenim.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+\"Ünlü\" bir falcı mıydı?\n-Çok ünlü sayılmaz ama mahallede" +
                            ", civarda bilinirdi");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Falcıdan çıktığında saat kaçtı?\n-11 buçuk gibiydi saat.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+O gün size şüphe verici bir davranışı oldu mu?\n-Evet bir şey" +
                            "lerden korktuğu belliydi.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Çıktığınızda saat kaçtı?\n- 4 buçuk gibiydi.");
                }

            }
        });
        q333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Komşu")){
                    textViewR.setText("+Daha önce tehdit edildi mi?\n-Hayır, edilse söylerdi.");
                }
                else if(textViewM.getText().toString().equals("Üst Komşu")){
                    textViewR.setText("+Alakasız bir soru ama ölünün sigara gibi zaralı bir alışkan" +
                            "lığı var mı?\n-Hayır, yok.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Alakasız bir soru ama iyi para kazanıyor musun?\n-Yok yeğenim" +
                            " hiç sorma.");
                }
                else if(textViewM.getText().toString().equals("Falcının Yeğeni")){
                    textViewR.setText("+Nasıl fal bakardı?\n-Tam nasıl baktığını bilmiyorum ama " +
                            "birşeylere bakıp gelecek tahmin eden basit falcılardandı.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Baktıran")){
                    textViewR.setText("+Sabah fal baktırırken falcıda bir sıkıntı" +
                            " gördünüz mü?\n-Hayır görmedim.");
                }
                else if(textViewM.getText().toString().equals("Öğlen Fal Baktıran")){
                    textViewR.setText("+En son saat kaçta gördün falcıyı?\n -Öğlen 1 gibi gördüm.");
                }
                else if(textViewM.getText().toString().equals("İkindi Fal Baktıran")){
                    textViewR.setText("+Yüzünde korku gördün mü ölünün?\n- Hayır görmedim, mutluydu.");
                }

            }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Okşanmayı sever misin?\n-Miyav!\n+Sevelim bakalım");
            }
        });
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Sen mi öldürdün sahibini?\n-Tıssss. Meööööööv\n+Tamam saldırma b" +
                        "işi demedim");
            }
        });
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Mama sever misin?\n-Miyav miyav!\n+Al hepsi senin olsun.");
            }
        });
    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), IstEpFour.class);
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
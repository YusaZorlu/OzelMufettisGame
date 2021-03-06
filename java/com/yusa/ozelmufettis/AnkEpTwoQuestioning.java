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

public class AnkEpTwoQuestioning extends AppCompatActivity {
    TextView textViewR;
    TextView textViewM;
    Button s1;
    Button s2;
    Button s3;
    Button s4;
    Button s5;
    Button s6;
    Button s7;
    Button s8;
    Button s9;
    Button q1;
    Button q2;
    Button q3;
    Button q11;
    Button q12;
    Button q13;
    Button q121;
    Button q122;
    Button q123;
    Button q1231;
    Button q1232;
    Button q1233;
    Button q131;
    Button q132;
    Button q133;
    Button q31;
    Button q32;
    Button q33;
    Button q331;
    Button q332;
    Button q333;
    Button q332x;

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
        setContentView(R.layout.activity_ank_ep_two_questioning);
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

        textViewM = findViewById(R.id.textView30);
        textViewR = findViewById(R.id.textView29);

        s1 = findViewById(R.id.button99);
        s2 = findViewById(R.id.button100);
        s3 = findViewById(R.id.button102);
        s4 = findViewById(R.id.button103);
        s5 = findViewById(R.id.button104);
        s6 = findViewById(R.id.button105);
        s7 = findViewById(R.id.button106);
        s8 = findViewById(R.id.button107);
        s9 = findViewById(R.id.button108);

        q1 = findViewById(R.id.akE2Q1);
        q2 = findViewById(R.id.akE2Q2);
        q3 = findViewById(R.id.akE2Q3);
        q11 = findViewById(R.id.akE2Q11);
        q12 = findViewById(R.id.akE2Q12);
        q13 = findViewById(R.id.akE2Q13);
        q121 = findViewById(R.id.akE2Q121);
        q122 = findViewById(R.id.akE2Q122);
        q123 = findViewById(R.id.akE2Q123);
        q1231 = findViewById(R.id.akE2Q1231);
        q1232 = findViewById(R.id.akE2Q1232);
        q1233 = findViewById(R.id.akE2Q1233);
        q131 = findViewById(R.id.akE2Q131);
        q132 = findViewById(R.id.akE2Q132);
        q133 = findViewById(R.id.akE2Q133);
        q31 = findViewById(R.id.akE2Q31);
        q32 = findViewById(R.id.akE2Q32);
        q33 = findViewById(R.id.akE2Q33);
        q331 = findViewById(R.id.akE2Q331);
        q332 = findViewById(R.id.akE2Q332);
        q333 = findViewById(R.id.akE2Q333);
        q332x = findViewById(R.id.akE2Q332x);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Ya??l?? Teyze");
                textViewR.setText("+Merhabalar!\n-Merhaba.");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Ya??l?? Amca");
                textViewR.setText("+Merhabalar!\n-Merhaba ye??enim.");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Dedikoducu Teyze");
                textViewR.setText("+Merhabalar!\n-Sana da merhabalar.");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Ortamc?? Ahmet");
                textViewR.setText("+Merhabalar!\n-Merhaba, buran??n yabanc??s?? gibisin.");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Yanki Murat");
                textViewR.setText("+Merhabalar!\n-Greetings, dostum. Mahallemizden de??ilsin" +
                        " galiba homie.");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Fa??al?? Faruk");
                textViewR.setText("+Merhabalar!\n-Merhaba. Polis de??ilsin deme\n+ Pek say??lmaz ama" +
                        " beni soymaya kalkma.");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Rep??i Recep");
                textViewR.setText("+Merhabalar!\n-Mer... habalar.");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Sakin Sabri");
                textViewR.setText("+Merhabalar!\n-Buras?? turist mahallesi de??il biliyorsun de??il mi?" +
                        "\n+ Evet seninle cinayet hakk??nda konu??aca????z..");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Sak??z Engin");
                textViewR.setText("+Merhabalar!\n-Konu??urum, ancak bir paket ??ilekli sak??za patlar" +
                        "\n+Tamam al??r??m sak??z??n??.");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.GONE);
                q122.setVisibility(View.GONE);
                q123.setVisibility(View.GONE);
                q1231.setVisibility(View.GONE);
                q1232.setVisibility(View.GONE);
                q1233.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q332x.setVisibility(View.GONE);

            }
        });
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Suspect4",false)){
            s4.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Suspect5",false)){
            s5.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Suspect6",false)){
            s6.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Suspect7",false)){
            s7.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Suspect8",false)){
            s8.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Suspect9",false)){
            s9.setVisibility(View.GONE);
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
                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Ben ya??l?? bir teyzeyim." +
                            " Ad??m?? merak ediyorsan ad??m Ay??e");
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Ben Ali ama bana burada" +
                            " Hac?? Emmi derler.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Ben Fatma. Fatma Teyze de" +
                            " diyebilirsin ama ??evre beni Dedikoducu Fatma diye bilirler.");
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Ortamc?? Ahmet diyorlar" +
                            " bana. Bu mahalledeki iyi k??t?? her ortama girmi??li??im var.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Ben Yanki Murat. Baz??lar??" +
                            " Amerikan Murat da derler. Amerikan k??lt??r??ne bay??l??r??m.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Fa??al?? Faruk ya da Yaral??" +
                            " Y??z derler. Y??z??mden tahmin edebilece??in ??zere.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Ben Recep. Rap yapmay?? " +
                            "sevdi??im i??in Rep??i Recep diyorlar.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Ben Sabri. 28 ya????nday??m" +
                            " ,bekar??m. Sakin Sabri de derler buralarda bu arada.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Engin Enginar ad soyad??m." +
                            " Engin desen daha iyi olur ama buradakiler gibi Sak??z Engin de diyebil" +
                            "irsin.");
                }

            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-Bilmiyorum Japonun bi" +
                            "riymi?? galiba.");
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-Cesedin yan??na gittiyd" +
                            "im. Tipi Japona benziyordu.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-??inliymi?? diye dedi" +
                            "kodusu geldi.");
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-Yok ama ??in min bir" +
                            " ??eyler dedi polisler.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-Fikrim yok ama yabanc??.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-Elin biriymi?? ??yle " +
                            "dediler.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-??ekik g??zl?? iyi giyimli" +
                            " bir adamd??. Polis ??inli bu dediydi.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-Zengin, ????k giyimli," +
                            "??inliymi??. Tan??d??????m?? zannetmiyorum.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+??l??n??n kim oldu??unu biliyor musun?\n-Ben ??ok bilmiyorum. " +
                            "Ortamc??yla Recep g??rm????ler galiba.");
                }

            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n-Kocamla evdeydim, " +
                            "dizi izliyorduk.");
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n-Han??mla evde dizi izliyoduk. S" +
                            "onra ben cesede bakmaya indim a????a????ya.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n-Evde ??ocuklarla oturuyorduk." +
                            "En ba??tan s??yleyeyim evimi incelettirmem.");
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n-Yan sokakta parktayd??m.Bizim ek" +
                            "ipten arkada??lar vard?? ??ncesinde sonra onlar gidince ben parktayd??m" +
                            " yine. Ev adresimi de vereyim hemen ??uras??.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place3",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place3",true).apply();
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place5",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place5",true).apply();
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n-Fa??al?? Farukla eve ge??tiydik." +
                            " ekibin kalan?? d????ar??dayd??. Ev de ??urada i??te.");
                    // EV?? KE??FET
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n- Yankiyle eve d??nd??yd??k.");

                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n-Day??mlardan d??n??yordum. Ate?? " +
                            "sesi duydum 20 saniye sonra ??l??y?? g??rd??m ama katil ??oktan kaybolmu??tu.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n-Egoyla(otob??sle) K??z??lay tara" +
                            "f??na gidiyordum tam konum vermem m??mk??n de??il.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Olay s??ras??nda neredeydin?\n-Mahalle d??????ndaki sak??z satan" +
                            " bakkala gittim. Sak??z konusunda marka tak??nt??m var sana da sak??z??" +
                            " oradan ald??raca????m hatta.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }

            }
        });
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n-67 ya????nday??m 3 evlad??m" +
                            " 2 torunum var.");
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n- Emekliyim i??te. Fazla" +
                            " kurcalama ge??mi??mi.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n- Emekliyim. Kocam var ama" +
                            " ??u an ailesinin yan??nda Yozgatta.");
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n-??ok yasalara uyan bir" +
                            " adam de??ilim ama ben de ??evrem de yasad?????? madde kullanmaz baz??lar??" +
                            "n??n aksine.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n-S??rekli Amerikan filmleri" +
                            " izlerim ??ngilizcem iyidir. Lakers'?? tutar??m baskette.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n-Sana laz??m olanlar?? s??yle" +
                            "yeyim: Sab??kam var, bol kavga ederim, madde kullanmam.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n- 26 ya????nday??m amat??r " +
                            "boks yapar??m. Buradaki herkes gibi iyi d??v??????r??m.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n-Angaral??y??k i??te. Ama" +
                            " bu mahalleden ta????nmay?? d??????n??yorum.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Daha detayl?? tan??tabilir misin?\n-20 li ya??lar??n ba????nday??m" +
                            ", tahmin edebilece??in ??zere fakirim ondan burada ya????yorum.");
                }

            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q121.setVisibility(View.VISIBLE);
                q122.setVisibility(View.VISIBLE);
                q123.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n-Yirmi be?? y??ld??r.");
                    q123.setText("Olay zaman?? ses duydun mu");
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n-Yirmi be?? y??ld??r." +
                            " Dile kolay...");
                    q123.setText("Olay zaman?? ses duydun mu");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n-Do??du??umdan beri burday??m." +
                            " Buras?? de??i??ti ben de??i??medim.");
                    q123.setText("O g??n ses duydun mu");
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n- Do??du??umdan beri burda" +
                            " ya????yorum. Bir ka?? seneye ta????n??r??m bu gidi??e.");
                    q123.setText("Olay hakk??nda duydu??un dedikodular neler");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n- Bilmem ki ben ??ocukken ta" +
                            "????nm??????z aile evinden ????kt??m yine buralarday??m.");
                    q123.setText("Sana neden yanki diyorlar");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n- Evden kovulunca buraya" +
                            " geldim 2 y??l ??nce.");
                    q123.setText("Evden niye kovuldun");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n-Uzun s??redir burada ya??ar??m" +
                            " ev benim ??zerime.");
                    q123.setText("Cinayet nas??l i??lendi");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n- On y??la yak??nd??r bu " +
                            "mahalledeyim garda??.");
                    q123.setText("Olaydan bir ka?? saat ??nce neredeydin");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Ne zamand??r burada ya????yorsun?\n-3 y??ld??r. Evdekiler 18" +
                            " oldun git art??k dediler elin Amerikal??s?? gibi. Ben de buraya geldim.");
                    q123.setText("Ekipte kimlere g??venirsin");
                }

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n-Ahmet diye bir ??ocuk var." +
                            " Ortamc?? Ahmet diyorlar gen??ler. O de??ilse bile duymu??tur.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n-Han??m da demi??tir. Ortamc??" +
                            " Ahmet diye bi bebe var. Kime sorsan g??sterir bi tip. Onu sorgula" +
                            " derim. Evi ilerideki ??n??nde k??rm??z?? araba park eden gecekondu.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place3",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place3",true).apply();
                }

                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n-Ahmete sor. Ben o ortam" +
                            "lar??n dedikodusunu bilmem pek. Evi ??u ileriki sokaktaki de??i??ik" +
                            " gecekondu.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place3",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place3",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n-Yanki Murat ya da Fa??al??" +
                            " Faruk olabilir. ??kisi de ayn?? yerde ya??ar.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect5",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect5",true).apply();
                    s5.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect6",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect6",true).apply();
                    s6.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n-Cesedi Recep bulmu??. Re" +
                            "cep kendi ??ld??rm???? olabilir.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect7",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect7",true).apply();
                    s7.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n- Sabriden ????pheleniyorum." +
                            " Buralarda Sakin Sabri olarak bilinir.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect8",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect8",true).apply();
                    s8.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n-Sakin Sabri diye bir ar" +
                            "kada?? var. Ondan ????pheleniyorum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect8",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect8",true).apply();
                    s8.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n-Sak??z Engin var ya. Kesin" +
                            " o ??ld??rm????t??r.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect9",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect9",true).apply();
                    s9.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki ????phelendi??in biri var m???\n- Sabri abiden ????pheleniyor" +
                            "um. Sakin Sabri diyorlar o Sabri.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect8",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect8",true).apply();
                    s8.setVisibility(View.VISIBLE);
                }

            }
        });
        q121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n-Aya??a zor" +
                            " kalk??yorum ben.");
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n-Biz " +
                            "delili??imizi gen??ken yapt??k. Bir de elin Japonunu niye vuray??m.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n-Buran??n " +
                            "ad?? da iyice ????km????. Ya??l?? kad??n?? sorguluyorsun.");
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n-Ortaml" +
                            "ar?? severim ama tek bir istinas?? var. Hapishane ortam?? benim gibi" +
                            " sosyal birisini s??kar.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n-Denetimli" +
                            " serbestli??im var. Risk alacak bir durumda de??ilim.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n-H??rs??zl??k" +
                            " m??rs??zl??k yapm????l??????m var ama cana k??ymak ayn?? ??ey de??il.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n- M??zisyen" +
                            " olaca????m sicili temiz tutmak laz??m.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n-Olay saati" +
                            " beni mahallede g??ren yok, yani ben olamam.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Senin su??lu olmaman i??in sebep verebilir misin?\n-Bela" +
                            " aramaya gelmedim buraya. D??zg??n i?? bulana kadar tak??l??yorum sadece.");
                }

            }
        });
        q122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-Al bakal??m");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna1",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-Vereyim de" +
                            " poliste de vard??r yani.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna2",true).apply();
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-??yi vereyim de" +
                            " bo??a enerji harcamasan daha iyi.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna3",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-Verelim hemen" +
                            ". ??zerimde su?? ????phesi kalmas??n.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna4",true).apply();
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-??znin varsa " +
                            "vereyim. Yoksa da vereyim ne yapacaksan yap.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna5",true).apply();
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-Tamam hallede" +
                            "lim.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna6",true).apply();
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-Vereyim. Bir de" +
                            "imza vereyim,ben ??nl?? olunca hat??rlars??n.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna7",true).apply();
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-Vereyim, verme" +
                            "zsem arkamdan konu??urlar ??imdi.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna8",true).apply();
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Parmak izi ve dna ??rne??i verebilir misin?\n-Tamam vereyim.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna9",true).apply();
                }

            }
        });
        q123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewM.getText().toString().equals("Ya??l?? Teyze")){
                    textViewR.setText("+Olay zaman?? ses duydun mu?\n-Tabanca sesi duydum.");
                }
                else if (textViewM.getText().toString().equals("Ya??l?? Amca")){
                    textViewR.setText("+Olay zaman?? ses duydun mu?\n-Katil bir ka?? el tabanca ate?? " +
                            "etti.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Ses duydun mu o g??n?\n- 22:30 da bir ka?? el silah sesi duydum.");
                }
                else if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Olay hak??nda ne dedikodular?? duydun?\n-Olur. Sen sor" +
                            " ben ne duydu??umu s??yleyeyim.");
                    q1231.setText("Cinayet ??ncesinde kavga oldu mu");
                    q1232.setText("Kimin ??ld??rd?????? d??????n??l??yor");
                    q1233.setText("Buradan ak??am saatlerinde ge??sem ne olur");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Sana neden Yanki diyorlar?\n-I feel like American man! " +
                            "Seviyorum Amerikay??.");
                    q1231.setText("Ortamc?? Ahmetin lakab??");
                    q1232.setText("Fa??al?? Farukun lakab??");
                    q1233.setText("Amerikan d????man??y??m desem ne yapars??n");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Evden niye kovuldun?\n-Ben h??rs??za ??ocu??um demem dedi. Evde" +
                            " de bar??nd??rmam dedi. ");
                    q1231.setText("Babanla konu??sak evine al??r m??");
                    q1232.setText("H??rs??zl??ktan pi??man m??s??n");
                    q1233.setText("Ba??ka akraban yok mu");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Cinayete en yak??n sen vard??n. Peki cinayet nas??l i??lendi?\n-" +
                            "Tabancayla ate?? edildi ancak katili ya da tabancay?? g??rmedim olay " +
                            "yerinde.");
                    q1231.setText("Katilin ka??mas?? m??mk??n m??");
                    q1232.setText("Olay yerinde silah bulundu mu");
                    q1233.setText("Olay yerine polisten ??nce gelenler");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Olaydan 1-2 saat ??nce neredeydin?\n- Arkada??larla parktayd??m.");
                    q1231.setText("Parktayken adam soyal??m diyen oldu mu");
                    q1232.setText("Parktan kimler ayr??lmad??");
                    q1233.setText("Parktakilerden silah?? olan var m??");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Ekipte en g??vendi??in kimlerdir?\n- Yankiyle Recepe g??venirim.");
                    q1231.setText("Eviniz kira m?? sizin mi");
                    q1232.setText("Evin masraflar?? ne kadar");
                    q1233.setText("Kendi paran?? nas??l kazan??yorsun");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }

            }
        });
        q1231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Cinayet ??ncesinde kavga olmu?? mu?\n- Kavga duyan duymad??m " +
                            "ama ??l??rken yard??m istemi?? ??ngilizce, Recep ??yle diyordu.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Ortamc?? Ahmet'in lakab?? nereden geliyor?\n-Polisle de h??rs??z" +
                            "la da ayn?? ortamda tak??lan bir eleman ondan dolay??. ");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Babanla konu??sak evine geri al??r m???\n-Zor ama belki sen" +
                            " yard??mc?? olursan ikna olur.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Peki cinayet i??leyen biri sen g??rmeden nas??l ka??m????t??r?\n-" +
                            " Ko??arak evin birinin bah??esine atlam????t??r.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Parktayken adam soyal??m tarz?? konu??an var m??yd???\n-Recep" +
                            " para isteyece??im demi??ti.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Ev kira m?? sizin mi?\n- Birimizin galiba ama kim bilmiyorum.");
                }

            }
        });
        q1232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Kimin ??ld??rd?????? d??????n??l??yor dedikodularda" +
                            "?\n-Bence Murat ya da Faruk ama" +
                            " Rep??i Recep diyenler de duydum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect5",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect5",true).apply();
                    s5.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect6",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect6",true).apply();
                    s6.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect7",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect7",true).apply();
                    s7.setVisibility(View.VISIBLE);

                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Fa??al?? Faru??un lakab?? nereden geliyor?\n-Bir ara y??z??ne bak" +
                            " anlars??n.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+H??rs??zl??ktan pi??man m??s??n?\n-Evet, pi??man??m.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Olay yerinde silah bulundu mu?\n-Hay??r, yan??nda g??t??rm????" +
                            " galiba.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Parktan kimler ayr??lmad???\n-Ben baya erken ????kt??m ondan" +
                            " dolay?? bilmiyorum.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Evin masraflar?? yakla????k ne kadar?\n-A????r?? de??il ancak" +
                            " ??ok ????nk?? d????ar??dan s??k yeriz.");
                }

            }
        });
        q1233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Buradan ak??am saatlerinde ge??sem ne olur?\n-C??zdan??n?? " +
                            "al??rlar, bence deneme.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Amerikan d????man??y??m desem ne yapars??n?\n- Arkandan ??ngilizce" +
                            " s??verim.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Ba??ka akraban yok mu?\n-Ankarada yok. Olsa giderdim");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Olay yerine senin d??????nda polisten ??nce ba??ka kim geldi?\n-" +
                            "Ya??l?? bir amca geldi. Ondan sonra Ortamc?? Ahmet geldi.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Peki parktaki ekipten silah?? olan var m???\n-Ben silah bilmem.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Kendi paran?? nas??l kazan??yorsun?\n-Arada bro????r da????t??yorum." +
                            "Yaz??n otelde ??al????aca????m zaten.");
                }

            }
        });
        q131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Nerede ya??ar?\n-Yan sokakta. Park??n yan??ndaki ev");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place4",true).apply();
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Nerede ya??ar?\n-Bizim evde ya??ar Kocaev Apartman?? yani.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place4",true).apply();
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Nerede ya??ar?\n-Bizim evde ba??ka odada kal??r.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Nerede ya??ar?\n-Bizim evde ya????yor.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Nerede ya??ar?\n-Bizim evde kal??yor. Sak??z?? bitince sak??z" +
                            " almaya gidiyor.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Nerede ya??ar?\n-Bizim evde ama git??em yak??nda dedi bu sabah.");
                }

            }
        });
        q132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Sicilleri kabar??k arkada??lar" +
                            " ondan dolay?? akl??ma ilk onlar geldi eve girdiklerini g??rmeme ra??men.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Cesedi bulan o. Bence ??ld??r??p" +
                            " sonra birisi ??ld??rm???? dedi.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Kola bile alacak param yok diyordu" +
                            " ,paras??zl??k her ??eyi yapt??r??r.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Bir s??r?? borcu varken " +
                            "ta????nabilirim demeye ba??lad??.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Sak??zs??z kald?????? zaman kavgac??" +
                            " olur. O g??n de sak??z??m yok dediydi vurmu?? olabilir.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Lakab??n??n aksine kafas?? ??ok ko" +
                            "lay atar.");
                }

            }
        });
        q133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Fiziksel ??zellikleri nedir?\n-??kisi de uzun. Fa??al?? Farul'un" +
                            " y??z??nde yaralar var. Murat da hep Amerikan gibi giyinir.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Fiziksel ??zellikleri nedir?\n-K??sa boylu esmer ama iyi" +
                            " d??v????en bir arkada??. S??rekli siyahi rap ??ark??lar?? dinlerler Receple" +
                            " beraber.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Fiziksel ??zellikleri nedir?\n-Uzun boylu sporcu biri. Bir" +
                            " de sakin lakab??n??n ??abuk sinirlenmesinden geldi??ini s??ylemem laz??m.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Fiziksel ??zellikleri nedir?\n-Uzun boylu basket??i bir tip." +
                            " ??yi de ko??ar kendisi.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Fiziksel ??zellikleri nedir?\n-Koca kafal?? esmer bir arkada??." +
                            " Bir de aram??zdaki en gen?? o 21-22 ya??lar??nda.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Fiziksel ??zellikleri nedir?\n-Basket masket oynad??m diyordu." +
                            " Atletik, uzun boylu, siyah sa??l?? biri.");
                }

            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+??ahidin var m???\n- 20 dakika ??ncesine kadar ekip vard??." +
                            "Olaydan bir ka?? dakika sonra da Receple cesedin ba????ndayd??k.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+??ahidin var m???\n-Fa??al?? Faruk i??te.");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+??ahidin var m???\n-Yankiyle birbirimizin ??ahidiyiz.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+??ahidin var m???\n-Day??m ??ahit oraya kadar gitti??ime.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+??ahidin var m???\n-Yok, nas??l olsun?");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+??ahidin var m???\n-Var. Bakkal ve kameralar?? var.");
                }

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Olay yeri olan soka??a ne kadar uzakta bu yer?\n-Hemen" +
                            " yan sokakta ama oradan olay yerini g??rmek m??mk??n de??il.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Olay yeri olan soka??a ne kadar uzakta bu yer?\n-" +
                            "Yan soka????n di??er taraf?? yani yak??n");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Olay yeri olan soka??a ne kadar uzakta bu yer?\n-Yak??n say??l??r.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Olay yeri olan soka??a ne kadar uzakta bu yer?\n-" +
                            "Day??m??n evi mahallenin di??er ucunda.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Olay yeri olan soka??a ne kadar uzakta bu yer?\n-Otob??sle yak??n" +
                            " y??r??yerek uzak.");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Olay yeri olan soka??a ne kadar uzakta bu yer?\n-15 dakika" +
                            " gitmesi 15 dakika gelmesi yar??m saat uzakl??kta diyeyim.");
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Hemen cesedin yan??na gittin mi gittiysen nas??l farkettin" +
                            "?\n-Silah sesi duydum bir ka?? el, sonra Recep polisi aray??n diyince " +
                            "gittim oraya.");
                    q331.setText("Rep??i Recepin ??ld??rd??????ne dair ????phen var m??");
                    q332.setText("Cesette g??rd??????n farkl?? bir ??ey var m??");
                    q333.setText("Cinayet silah??n?? biliyor musun");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Di??erleri parktan ????kt??ktan sonra nereye gittiler?\n-" +
                            "Biz eve gittik, Ortamc?? parkta kald?? ba??ka kimi merak ediyorsun?");
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect7",false)){
                        q331.setText("Rep??i Recep ne demi??ti");
                    }
                    else q331.setText("bu se??enek i??in ??pheli ke??fet");
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect8",false)){
                        q332.setText("Sakin Sabri ne demi??ti");
                    }
                    else q332.setText("bu se??enek i??in ????pheli ke??fet");
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect9",false)){
                        q333.setText("Sak??z Engin ne demi??ti");
                    }
                    else q333.setText("bu se??enek i??in ????pheli ke??fet");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Arkada??lar??n hakk??nda ne d??????n??yorsun?\n-Arkada?? olunabilecek" +
                            " insanlar. Kim hakk??nda detayl?? bilgi istiyorsun.");
                    q331.setText("Ahmet hakk??nda ne d??????n??yorsun");
                    q332.setText("Murat hakk??nda ne d??????n??yorsun");
                    q333.setText("Recep hakk??nda ne d??????n??yorsun");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Cesette ne g??rd??n s??yleyebilir misin?\n-Daha net sorabilir" +
                            " misin ne ????renmek istedi??ini.");
                    q331.setText("??ld??r??l??rken sesini duymu?? muydunuz");
                    q332.setText("??zerinden ????kan ilgin?? bir ??ey");
                    q333.setText("Cesede dokunan oldu mu");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Hi?? yasad?????? bir ??ey yapt??n m???\n-Niye soruyorsun?");
                    q331.setText("Yani sab??kan var m??");
                    q332.setText("Elinde su??suz oldu??una kan??t var m??");
                    q333.setText("Aran??zda sab??kas?? olanlar kimler");
                }
                else if (textViewM.getText().toString().equals("Sak??z Engin")){
                    textViewR.setText("+Peki olay ??ncesinde ne yap??yordun?\n-Ekiple 15-20" +
                            " dakika ??ncesine kadar parkta oturuyorduk.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place5",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place5",true).apply();
                }

            }
        });
        q331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Peki Recep'in ??ld??rd??????ne dair bir ????phe duydun mu?\n-");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect7",false)){
                        textViewR.setText("Mesela Rep??i Recep nereye gitti?\n-Day??mdan para isteye" +
                                "ce??im dediydi o.");
                    }
                    else textViewR.setText("+Akl??ma ??u an gelmiyor daha ??ok ????pheli bulmam laz??m\n-Tamam");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Ahmet hakk??nda ne d??????n??yorsun?\n-??ok sosyal adam.S??k??nt??l??" +
                            " birisi olsa ??oktan b????aklarlard??.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+??ld??r??l??ken sesini duymu?? muydun?\n- Help melp bir ??eyler" +
                            " demeye ??al??????yordu ??l??rken.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Yani sab??kan var m???\n-Sanane");
                }


            }
        });
        q332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Cesette g??rd??????n farkl?? bir ??ey var m??yd???\n-T??rkiye'de " +
                            "olmas??na ra??men i??inde sadece de??i??ik bir para vard??");
                    q331.setVisibility(View.GONE);
                    q332.setVisibility(View.GONE);
                    q333.setVisibility(View.GONE);
                    q332x.setVisibility(View.VISIBLE);
                    q332x.setText("Nas??l Paralar");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect7",false)){
                        textViewR.setText("Sakin Sabri nereye gitti?\n-Bor?? almaya mahallenin" +
                                " di??er taraf??na teyzemin o??luna gidece??im demi??ti.");
                    }
                    else textViewR.setText("+Akl??ma ??u an gelmiyor daha ??ok ????pheli bulmam laz??m\n-Tamam");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Murat nas??l birisi?\n-Kader kurban?? ama asl??nda iyi birisi.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+??zerinden ????kan ilgin?? bir ??ey?\n-C??zdan??ndaki paralar ilgin??ti.");
                    q331.setVisibility(View.GONE);
                    q332.setVisibility(View.GONE);
                    q333.setVisibility(View.GONE);
                    q332x.setVisibility(View.VISIBLE);
                    q332x.setText("Nas??l yani");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("Peki elinde orda olmad??????n?? kan??tlayacak bir" +
                            " ??eyler var m???\n-Hay??r yok. Olsa senle u??ra??mam.");
                }


            }
        });
        q333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Cinayet silah?? ne biliyor musun?\n-Tabanca olmas?? laz??m ama" +
                            " silah?? g??rmedik sadece silah sesini duyduk.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect7",false)){
                        textViewR.setText("Sak??z Engin nereye gitti?\n-Bunun sak??z ald?????? bakkal " +
                                "mahalle d??????nda. Oraya gidece??im demi??ti");
                    }
                    else textViewR.setText("+Akl??ma ??u an gelmiyor daha ??ok ????pheli bulmam laz??m\n-Tamam");
                }
                else if (textViewM.getText().toString().equals("Fa??al?? Faruk")){
                    textViewR.setText("+Rep??i Recep nas??l birisi?\n-??akal bir adamd??r, kolay satar" +
                            " ama sokaktaki adam?? vuracak birisi de de??il.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Cesede dokunan oldu mu?\n- Meraktan dokunmu?? olabiliriz.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Aran??zda sab??kas?? olan kimler var?\n-Faruktan emin de??ilim" +
                            " ama Murat'??n vard?? kesin. Hem niye sab??kaya bu kadar tak??yorsun a" +
                            "nlamad??m.");
                }


            }
        });
        q332x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamc?? Ahmet")){
                    textViewR.setText("+Nas??l paralar?\n-Dolar, Lira de??il. ??in paras?? neyse" +
                            " ondan vard?? biraz.");
                }
                else if (textViewM.getText().toString().equals("Rep??i Recep")){
                    textViewR.setText("+Nas??l yani?\n-??in Yuan?? m?? bir ??eyi para vard?? sadece." +
                            "T??rk Liras?? yoktu.");
                }

            }
        });


    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), AnkEpTwo.class);
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
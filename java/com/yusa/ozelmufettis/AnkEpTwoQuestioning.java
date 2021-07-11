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
                textViewM.setText("Yaşlı Teyze");
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
                textViewM.setText("Yaşlı Amca");
                textViewR.setText("+Merhabalar!\n-Merhaba yeğenim.");
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
                textViewM.setText("Ortamcı Ahmet");
                textViewR.setText("+Merhabalar!\n-Merhaba, buranın yabancısı gibisin.");
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
                textViewR.setText("+Merhabalar!\n-Greetings, dostum. Mahallemizden değilsin" +
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
                textViewM.setText("Façalı Faruk");
                textViewR.setText("+Merhabalar!\n-Merhaba. Polis değilsin deme\n+ Pek sayılmaz ama" +
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
                textViewM.setText("Repçi Recep");
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
                textViewR.setText("+Merhabalar!\n-Burası turist mahallesi değil biliyorsun değil mi?" +
                        "\n+ Evet seninle cinayet hakkında konuşacağız..");
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
                textViewM.setText("Sakız Engin");
                textViewR.setText("+Merhabalar!\n-Konuşurum, ancak bir paket çilekli sakıza patlar" +
                        "\n+Tamam alırım sakızını.");
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
                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Ben yaşlı bir teyzeyim." +
                            " Adımı merak ediyorsan adım Ayşe");
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Ben Ali ama bana burada" +
                            " Hacı Emmi derler.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Ben Fatma. Fatma Teyze de" +
                            " diyebilirsin ama çevre beni Dedikoducu Fatma diye bilirler.");
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Ortamcı Ahmet diyorlar" +
                            " bana. Bu mahalledeki iyi kötü her ortama girmişliğim var.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Ben Yanki Murat. Bazıları" +
                            " Amerikan Murat da derler. Amerikan kültürüne bayılırım.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Façalı Faruk ya da Yaralı" +
                            " Yüz derler. Yüzümden tahmin edebileceğin üzere.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Ben Recep. Rap yapmayı " +
                            "sevdiğim için Repçi Recep diyorlar.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Ben Sabri. 28 yaşındayım" +
                            " ,bekarım. Sakin Sabri de derler buralarda bu arada.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Engin Enginar ad soyadım." +
                            " Engin desen daha iyi olur ama buradakiler gibi Sakız Engin de diyebil" +
                            "irsin.");
                }

            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Bilmiyorum Japonun bi" +
                            "riymiş galiba.");
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Cesedin yanına gittiyd" +
                            "im. Tipi Japona benziyordu.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Çinliymiş diye dedi" +
                            "kodusu geldi.");
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Yok ama Çin min bir" +
                            " şeyler dedi polisler.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Fikrim yok ama yabancı.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Elin biriymiş öyle " +
                            "dediler.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Çekik gözlü iyi giyimli" +
                            " bir adamdı. Polis Çinli bu dediydi.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Zengin, şık giyimli," +
                            "Çinliymiş. Tanıdığımı zannetmiyorum.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Ölünün kim olduğunu biliyor musun?\n-Ben çok bilmiyorum. " +
                            "Ortamcıyla Recep görmüşler galiba.");
                }

            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Olay sırasında neredeydin?\n-Kocamla evdeydim, " +
                            "dizi izliyorduk.");
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Olay sırasında neredeydin?\n-Hanımla evde dizi izliyoduk. S" +
                            "onra ben cesede bakmaya indim aşşağıya.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Olay sırasında neredeydin?\n-Evde çocuklarla oturuyorduk." +
                            "En baştan söyleyeyim evimi incelettirmem.");
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Olay sırasında neredeydin?\n-Yan sokakta parktaydım.Bizim ek" +
                            "ipten arkadaşlar vardı öncesinde sonra onlar gidince ben parktaydım" +
                            " yine. Ev adresimi de vereyim hemen şurası.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place3",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place3",true).apply();
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place5",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan keşfettin"
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
                    textViewR.setText("+Olay sırasında neredeydin?\n-Façalı Farukla eve geçtiydik." +
                            " ekibin kalanı dışarıdaydı. Ev de şurada işte.");
                    // EVİ KEŞFET
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Olay sırasında neredeydin?\n- Yankiyle eve döndüydük.");

                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Olay sırasında neredeydin?\n-Dayımlardan dönüyordum. Ateş " +
                            "sesi duydum 20 saniye sonra ölüyü gördüm ama katil çoktan kaybolmuştu.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Olay sırasında neredeydin?\n-Egoyla(otobüsle) Kızılay tara" +
                            "fına gidiyordum tam konum vermem mümkün değil.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Olay sırasında neredeydin?\n-Mahalle dışındaki sakız satan" +
                            " bakkala gittim. Sakız konusunda marka takıntım var sana da sakızı" +
                            " oradan aldıracağım hatta.");
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
                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n-67 yaşındayım 3 evladım" +
                            " 2 torunum var.");
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n- Emekliyim işte. Fazla" +
                            " kurcalama geçmişmi.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n- Emekliyim. Kocam var ama" +
                            " şu an ailesinin yanında Yozgatta.");
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n-Çok yasalara uyan bir" +
                            " adam değilim ama ben de çevrem de yasadışı madde kullanmaz bazıları" +
                            "nın aksine.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n-Sürekli Amerikan filmleri" +
                            " izlerim İngilizcem iyidir. Lakers'ı tutarım baskette.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n-Sana lazım olanları söyle" +
                            "yeyim: Sabıkam var, bol kavga ederim, madde kullanmam.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n- 26 yaşındayım amatör " +
                            "boks yaparım. Buradaki herkes gibi iyi dövüşürüm.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n-Angaralıyık işte. Ama" +
                            " bu mahalleden taşınmayı düşünüyorum.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Daha detaylı tanıtabilir misin?\n-20 li yaşların başındayım" +
                            ", tahmin edebileceğin üzere fakirim ondan burada yaşıyorum.");
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
                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n-Yirmi beş yıldır.");
                    q123.setText("Olay zamanı ses duydun mu");
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n-Yirmi beş yıldır." +
                            " Dile kolay...");
                    q123.setText("Olay zamanı ses duydun mu");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n-Doğduğumdan beri burdayım." +
                            " Burası değişti ben değişmedim.");
                    q123.setText("O gün ses duydun mu");
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n- Doğduğumdan beri burda" +
                            " yaşıyorum. Bir kaç seneye taşınırım bu gidişe.");
                    q123.setText("Olay hakkında duyduğun dedikodular neler");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n- Bilmem ki ben çocukken ta" +
                            "şınmışız aile evinden çıktım yine buralardayım.");
                    q123.setText("Sana neden yanki diyorlar");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n- Evden kovulunca buraya" +
                            " geldim 2 yıl önce.");
                    q123.setText("Evden niye kovuldun");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n-Uzun süredir burada yaşarım" +
                            " ev benim üzerime.");
                    q123.setText("Cinayet nasıl işlendi");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n- On yıla yakındır bu " +
                            "mahalledeyim gardaş.");
                    q123.setText("Olaydan bir kaç saat önce neredeydin");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Ne zamandır burada yaşıyorsun?\n-3 yıldır. Evdekiler 18" +
                            " oldun git artık dediler elin Amerikalısı gibi. Ben de buraya geldim.");
                    q123.setText("Ekipte kimlere güvenirsin");
                }

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n-Ahmet diye bir çocuk var." +
                            " Ortamcı Ahmet diyorlar gençler. O değilse bile duymuştur.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n-Hanım da demiştir. Ortamcı" +
                            " Ahmet diye bi bebe var. Kime sorsan gösterir bi tip. Onu sorgula" +
                            " derim. Evi ilerideki önünde kırmızı araba park eden gecekondu.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place3",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place3",true).apply();
                }

                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n-Ahmete sor. Ben o ortam" +
                            "ların dedikodusunu bilmem pek. Evi şu ileriki sokaktaki değişik" +
                            " gecekondu.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place3",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place3",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n-Yanki Murat ya da Façalı" +
                            " Faruk olabilir. İkisi de aynı yerde yaşar.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect5",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect5",true).apply();
                    s5.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect6",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
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
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n-Cesedi Recep bulmuş. Re" +
                            "cep kendi öldürmüş olabilir.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect7",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect7",true).apply();
                    s7.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n- Sabriden şüpheleniyorum." +
                            " Buralarda Sakin Sabri olarak bilinir.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect8",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect8",true).apply();
                    s8.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n-Sakin Sabri diye bir ar" +
                            "kadaş var. Ondan şüpheleniyorum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect8",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
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
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n-Sakız Engin var ya. Kesin" +
                            " o öldürmüştür.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect9",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect9",true).apply();
                    s9.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    q11.setVisibility(View.GONE);
                    q12.setVisibility(View.GONE);
                    q13.setVisibility(View.GONE);
                    q131.setVisibility(View.VISIBLE);
                    q132.setVisibility(View.VISIBLE);
                    q133.setVisibility(View.VISIBLE);
                    textViewR.setText("+Peki şüphelendiğin biri var mı?\n- Sabri abiden şüpheleniyor" +
                            "um. Sakin Sabri diyorlar o Sabri.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect8",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
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
                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n-Ayağa zor" +
                            " kalkıyorum ben.");
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n-Biz " +
                            "deliliğimizi gençken yaptık. Bir de elin Japonunu niye vurayım.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n-Buranın " +
                            "adı da iyice çıkmış. Yaşlı kadını sorguluyorsun.");
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n-Ortaml" +
                            "arı severim ama tek bir istinası var. Hapishane ortamı benim gibi" +
                            " sosyal birisini sıkar.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n-Denetimli" +
                            " serbestliğim var. Risk alacak bir durumda değilim.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n-Hırsızlık" +
                            " mırsızlık yapmışlığım var ama cana kıymak aynı şey değil.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n- Müzisyen" +
                            " olacağım sicili temiz tutmak lazım.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n-Olay saati" +
                            " beni mahallede gören yok, yani ben olamam.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Senin suçlu olmaman için sebep verebilir misin?\n-Bela" +
                            " aramaya gelmedim buraya. Düzgün iş bulana kadar takılıyorum sadece.");
                }

            }
        });
        q122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-Al bakalım");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna1",true).apply();
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-Vereyim de" +
                            " poliste de vardır yani.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna2",true).apply();
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-İyi vereyim de" +
                            " boşa enerji harcamasan daha iyi.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna3",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-Verelim hemen" +
                            ". Üzerimde suç şüphesi kalmasın.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna4",true).apply();
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-İznin varsa " +
                            "vereyim. Yoksa da vereyim ne yapacaksan yap.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna5",true).apply();
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-Tamam hallede" +
                            "lim.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna6",true).apply();
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-Vereyim. Bir de" +
                            "imza vereyim,ben ünlü olunca hatırlarsın.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna7",true).apply();
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-Vereyim, verme" +
                            "zsem arkamdan konuşurlar şimdi.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna8",true).apply();
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Parmak izi ve dna örneği verebilir misin?\n-Tamam vereyim.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Dna9",true).apply();
                }

            }
        });
        q123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewM.getText().toString().equals("Yaşlı Teyze")){
                    textViewR.setText("+Olay zamanı ses duydun mu?\n-Tabanca sesi duydum.");
                }
                else if (textViewM.getText().toString().equals("Yaşlı Amca")){
                    textViewR.setText("+Olay zamanı ses duydun mu?\n-Katil bir kaç el tabanca ateş " +
                            "etti.");
                }
                else if (textViewM.getText().toString().equals("Dedikoducu Teyze")){
                    textViewR.setText("+Ses duydun mu o gün?\n- 22:30 da bir kaç el silah sesi duydum.");
                }
                else if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Olay hakında ne dedikoduları duydun?\n-Olur. Sen sor" +
                            " ben ne duyduğumu söyleyeyim.");
                    q1231.setText("Cinayet öncesinde kavga oldu mu");
                    q1232.setText("Kimin öldürdüğü düşünülüyor");
                    q1233.setText("Buradan akşam saatlerinde geçsem ne olur");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Sana neden Yanki diyorlar?\n-I feel like American man! " +
                            "Seviyorum Amerikayı.");
                    q1231.setText("Ortamcı Ahmetin lakabı");
                    q1232.setText("Façalı Farukun lakabı");
                    q1233.setText("Amerikan düşmanıyım desem ne yaparsın");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Evden niye kovuldun?\n-Ben hırsıza çocuğum demem dedi. Evde" +
                            " de barındırmam dedi. ");
                    q1231.setText("Babanla konuşsak evine alır mı");
                    q1232.setText("Hırsızlıktan pişman mısın");
                    q1233.setText("Başka akraban yok mu");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Cinayete en yakın sen vardın. Peki cinayet nasıl işlendi?\n-" +
                            "Tabancayla ateş edildi ancak katili ya da tabancayı görmedim olay " +
                            "yerinde.");
                    q1231.setText("Katilin kaçması mümkün mü");
                    q1232.setText("Olay yerinde silah bulundu mu");
                    q1233.setText("Olay yerine polisten önce gelenler");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Olaydan 1-2 saat önce neredeydin?\n- Arkadaşlarla parktaydım.");
                    q1231.setText("Parktayken adam soyalım diyen oldu mu");
                    q1232.setText("Parktan kimler ayrılmadı");
                    q1233.setText("Parktakilerden silahı olan var mı");
                    q121.setVisibility(View.GONE);
                    q122.setVisibility(View.GONE);
                    q123.setVisibility(View.GONE);
                    q1231.setVisibility(View.VISIBLE);
                    q1232.setVisibility(View.VISIBLE);
                    q1233.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Ekipte en güvendiğin kimlerdir?\n- Yankiyle Recepe güvenirim.");
                    q1231.setText("Eviniz kira mı sizin mi");
                    q1232.setText("Evin masrafları ne kadar");
                    q1233.setText("Kendi paranı nasıl kazanıyorsun");
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
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Cinayet öncesinde kavga olmuş mu?\n- Kavga duyan duymadım " +
                            "ama ölürken yardım istemiş İngilizce, Recep öyle diyordu.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Ortamcı Ahmet'in lakabı nereden geliyor?\n-Polisle de hırsız" +
                            "la da aynı ortamda takılan bir eleman ondan dolayı. ");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Babanla konuşsak evine geri alır mı?\n-Zor ama belki sen" +
                            " yardımcı olursan ikna olur.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Peki cinayet işleyen biri sen görmeden nasıl kaçmıştır?\n-" +
                            " Koşarak evin birinin bahçesine atlamıştır.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Parktayken adam soyalım tarzı konuşan var mıydı?\n-Recep" +
                            " para isteyeceğim demişti.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Ev kira mı sizin mi?\n- Birimizin galiba ama kim bilmiyorum.");
                }

            }
        });
        q1232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Kimin öldürdüğü düşünülüyor dedikodularda" +
                            "?\n-Bence Murat ya da Faruk ama" +
                            " Repçi Recep diyenler de duydum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect5",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect5",true).apply();
                    s5.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect6",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect6",true).apply();
                    s6.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Suspect7",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Suspect7",true).apply();
                    s7.setVisibility(View.VISIBLE);

                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Façalı Faruğun lakabı nereden geliyor?\n-Bir ara yüzüne bak" +
                            " anlarsın.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Hırsızlıktan pişman mısın?\n-Evet, pişmanım.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Olay yerinde silah bulundu mu?\n-Hayır, yanında götürmüş" +
                            " galiba.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Parktan kimler ayrılmadı?\n-Ben baya erken çıktım ondan" +
                            " dolayı bilmiyorum.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Evin masrafları yaklaşık ne kadar?\n-Aşırı değil ancak" +
                            " çok çünkü dışarıdan sık yeriz.");
                }

            }
        });
        q1233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Buradan akşam saatlerinde geçsem ne olur?\n-Cüzdanını " +
                            "alırlar, bence deneme.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Amerikan düşmanıyım desem ne yaparsın?\n- Arkandan İngilizce" +
                            " söverim.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Başka akraban yok mu?\n-Ankarada yok. Olsa giderdim");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Olay yerine senin dışında polisten önce başka kim geldi?\n-" +
                            "Yaşlı bir amca geldi. Ondan sonra Ortamcı Ahmet geldi.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Peki parktaki ekipten silahı olan var mı?\n-Ben silah bilmem.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Kendi paranı nasıl kazanıyorsun?\n-Arada broşür dağıtıyorum." +
                            "Yazın otelde çalışacağım zaten.");
                }

            }
        });
        q131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Nerede yaşar?\n-Yan sokakta. Parkın yanındaki ev");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place4",true).apply();
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Nerede yaşar?\n-Bizim evde yaşar Kocaev Apartmanı yani.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place4",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Place4",true).apply();
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Nerede yaşar?\n-Bizim evde başka odada kalır.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Nerede yaşar?\n-Bizim evde yaşıyor.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Nerede yaşar?\n-Bizim evde kalıyor. Sakızı bitince sakız" +
                            " almaya gidiyor.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Nerede yaşar?\n-Bizim evde ama gitçem yakında dedi bu sabah.");
                }

            }
        });
        q132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Sicilleri kabarık arkadaşlar" +
                            " ondan dolayı aklıma ilk onlar geldi eve girdiklerini görmeme rağmen.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Cesedi bulan o. Bence öldürüp" +
                            " sonra birisi öldürmüş dedi.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Kola bile alacak param yok diyordu" +
                            " ,parasızlık her şeyi yaptırır.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Bir sürü borcu varken " +
                            "taşınabilirim demeye başladı.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Sakızsız kaldığı zaman kavgacı" +
                            " olur. O gün de sakızım yok dediydi vurmuş olabilir.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Şüphelenme sebebin nedir?\n-Lakabının aksine kafası çok ko" +
                            "lay atar.");
                }

            }
        });
        q133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Fiziksel özellikleri nedir?\n-İkisi de uzun. Façalı Farul'un" +
                            " yüzünde yaralar var. Murat da hep Amerikan gibi giyinir.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Fiziksel özellikleri nedir?\n-Kısa boylu esmer ama iyi" +
                            " dövüşen bir arkadaş. Sürekli siyahi rap şarkıları dinlerler Receple" +
                            " beraber.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Fiziksel özellikleri nedir?\n-Uzun boylu sporcu biri. Bir" +
                            " de sakin lakabının çabuk sinirlenmesinden geldiğini söylemem lazım.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Fiziksel özellikleri nedir?\n-Uzun boylu basketçi bir tip." +
                            " İyi de koşar kendisi.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Fiziksel özellikleri nedir?\n-Koca kafalı esmer bir arkadaş." +
                            " Bir de aramızdaki en genç o 21-22 yaşlarında.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Fiziksel özellikleri nedir?\n-Basket masket oynadım diyordu." +
                            " Atletik, uzun boylu, siyah saçlı biri.");
                }

            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Şahidin var mı?\n- 20 dakika öncesine kadar ekip vardı." +
                            "Olaydan bir kaç dakika sonra da Receple cesedin başındaydık.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Şahidin var mı?\n-Façalı Faruk işte.");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Şahidin var mı?\n-Yankiyle birbirimizin şahidiyiz.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Şahidin var mı?\n-Dayım şahit oraya kadar gittiğime.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Şahidin var mı?\n-Yok, nasıl olsun?");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Şahidin var mı?\n-Var. Bakkal ve kameraları var.");
                }

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Olay yeri olan sokağa ne kadar uzakta bu yer?\n-Hemen" +
                            " yan sokakta ama oradan olay yerini görmek mümkün değil.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    textViewR.setText("+Olay yeri olan sokağa ne kadar uzakta bu yer?\n-" +
                            "Yan sokağın diğer tarafı yani yakın");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Olay yeri olan sokağa ne kadar uzakta bu yer?\n-Yakın sayılır.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Olay yeri olan sokağa ne kadar uzakta bu yer?\n-" +
                            "Dayımın evi mahallenin diğer ucunda.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Olay yeri olan sokağa ne kadar uzakta bu yer?\n-Otobüsle yakın" +
                            " yürüyerek uzak.");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Olay yeri olan sokağa ne kadar uzakta bu yer?\n-15 dakika" +
                            " gitmesi 15 dakika gelmesi yarım saat uzaklıkta diyeyim.");
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Hemen cesedin yanına gittin mi gittiysen nasıl farkettin" +
                            "?\n-Silah sesi duydum bir kaç el, sonra Recep polisi arayın diyince " +
                            "gittim oraya.");
                    q331.setText("Repçi Recepin öldürdüğüne dair şüphen var mı");
                    q332.setText("Cesette gördüğün farklı bir şey var mı");
                    q333.setText("Cinayet silahını biliyor musun");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Diğerleri parktan çıktıktan sonra nereye gittiler?\n-" +
                            "Biz eve gittik, Ortamcı parkta kaldı başka kimi merak ediyorsun?");
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect7",false)){
                        q331.setText("Repçi Recep ne demişti");
                    }
                    else q331.setText("bu seçenek için üpheli keşfet");
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect8",false)){
                        q332.setText("Sakin Sabri ne demişti");
                    }
                    else q332.setText("bu seçenek için şüpheli keşfet");
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect9",false)){
                        q333.setText("Sakız Engin ne demişti");
                    }
                    else q333.setText("bu seçenek için şüpheli keşfet");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Arkadaşların hakkında ne düşünüyorsun?\n-Arkadaş olunabilecek" +
                            " insanlar. Kim hakkında detaylı bilgi istiyorsun.");
                    q331.setText("Ahmet hakkında ne düşünüyorsun");
                    q332.setText("Murat hakkında ne düşünüyorsun");
                    q333.setText("Recep hakkında ne düşünüyorsun");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Cesette ne gördün söyleyebilir misin?\n-Daha net sorabilir" +
                            " misin ne öğrenmek istediğini.");
                    q331.setText("Öldürülürken sesini duymuş muydunuz");
                    q332.setText("Üzerinden çıkan ilginç bir şey");
                    q333.setText("Cesede dokunan oldu mu");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    q31.setVisibility(View.GONE);
                    q32.setVisibility(View.GONE);
                    q33.setVisibility(View.GONE);
                    q331.setVisibility(View.VISIBLE);
                    q332.setVisibility(View.VISIBLE);
                    q333.setVisibility(View.VISIBLE);
                    textViewR.setText("+Hiç yasadışı bir şey yaptın mı?\n-Niye soruyorsun?");
                    q331.setText("Yani sabıkan var mı");
                    q332.setText("Elinde suçsuz olduğuna kanıt var mı");
                    q333.setText("Aranızda sabıkası olanlar kimler");
                }
                else if (textViewM.getText().toString().equals("Sakız Engin")){
                    textViewR.setText("+Peki olay öncesinde ne yapıyordun?\n-Ekiple 15-20" +
                            " dakika öncesine kadar parkta oturuyorduk.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Ank2Place5",false)){
                        Toast.makeText(AnkEpTwoQuestioning.this,"Yeni mekan keşfettin"
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
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Peki Recep'in öldürdüğüne dair bir şüphe duydun mu?\n-");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect7",false)){
                        textViewR.setText("Mesela Repçi Recep nereye gitti?\n-Dayımdan para isteye" +
                                "ceğim dediydi o.");
                    }
                    else textViewR.setText("+Aklıma şu an gelmiyor daha çok şüpheli bulmam lazım\n-Tamam");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Ahmet hakkında ne düşünüyorsun?\n-Çok sosyal adam.Sıkıntılı" +
                            " birisi olsa çoktan bıçaklarlardı.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Öldürülüken sesini duymuş muydun?\n- Help melp bir şeyler" +
                            " demeye çalışıyordu ölürken.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Yani sabıkan var mı?\n-Sanane");
                }


            }
        });
        q332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Cesette gördüğün farklı bir şey var mıydı?\n-Türkiye'de " +
                            "olmasına rağmen içinde sadece değişik bir para vardı");
                    q331.setVisibility(View.GONE);
                    q332.setVisibility(View.GONE);
                    q333.setVisibility(View.GONE);
                    q332x.setVisibility(View.VISIBLE);
                    q332x.setText("Nasıl Paralar");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect7",false)){
                        textViewR.setText("Sakin Sabri nereye gitti?\n-Borç almaya mahallenin" +
                                " diğer tarafına teyzemin oğluna gideceğim demişti.");
                    }
                    else textViewR.setText("+Aklıma şu an gelmiyor daha çok şüpheli bulmam lazım\n-Tamam");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Murat nasıl birisi?\n-Kader kurbanı ama aslında iyi birisi.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Üzerinden çıkan ilginç bir şey?\n-Cüzdanındaki paralar ilginçti.");
                    q331.setVisibility(View.GONE);
                    q332.setVisibility(View.GONE);
                    q333.setVisibility(View.GONE);
                    q332x.setVisibility(View.VISIBLE);
                    q332x.setText("Nasıl yani");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("Peki elinde orda olmadığını kanıtlayacak bir" +
                            " şeyler var mı?\n-Hayır yok. Olsa senle uğraşmam.");
                }


            }
        });
        q333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Cinayet silahı ne biliyor musun?\n-Tabanca olması lazım ama" +
                            " silahı görmedik sadece silah sesini duyduk.");
                }
                else if (textViewM.getText().toString().equals("Yanki Murat")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Suspect7",false)){
                        textViewR.setText("Sakız Engin nereye gitti?\n-Bunun sakız aldığı bakkal " +
                                "mahalle dışında. Oraya gideceğim demişti");
                    }
                    else textViewR.setText("+Aklıma şu an gelmiyor daha çok şüpheli bulmam lazım\n-Tamam");
                }
                else if (textViewM.getText().toString().equals("Façalı Faruk")){
                    textViewR.setText("+Repçi Recep nasıl birisi?\n-Çakal bir adamdır, kolay satar" +
                            " ama sokaktaki adamı vuracak birisi de değil.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Cesede dokunan oldu mu?\n- Meraktan dokunmuş olabiliriz.");
                }
                else if (textViewM.getText().toString().equals("Sakin Sabri")){
                    textViewR.setText("+Aranızda sabıkası olan kimler var?\n-Faruktan emin değilim" +
                            " ama Murat'ın vardı kesin. Hem niye sabıkaya bu kadar takıyorsun a" +
                            "nlamadım.");
                }


            }
        });
        q332x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Ortamcı Ahmet")){
                    textViewR.setText("+Nasıl paralar?\n-Dolar, Lira değil. Çin parası neyse" +
                            " ondan vardı biraz.");
                }
                else if (textViewM.getText().toString().equals("Repçi Recep")){
                    textViewR.setText("+Nasıl yani?\n-Çin Yuanı mı bir şeyi para vardı sadece." +
                            "Türk Lirası yoktu.");
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
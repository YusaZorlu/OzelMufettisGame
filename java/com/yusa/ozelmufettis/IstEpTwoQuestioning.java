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

public class IstEpTwoQuestioning extends AppCompatActivity {
    TextView textViewMid;
    TextView textViewRight;
    Button q1;
    Button q2;
    Button q3;
    Button q11;
    Button q12;
    Button q13;
    Button q12x;
    Button q131;
    Button q132;
    Button q133;
    Button q21;
    Button q22;
    Button q23;
    Button q211;
    Button q212;
    Button q213;
    Button q31;
    Button q32;
    Button q33;
    Button q321;
    Button q322;
    Button q323;
    Button sus1;
    Button sus2;
    Button sus3;
    Button sus4;
    Button sus5;
    Button sus6;
    Button sus7;
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
        setContentView(R.layout.activity_ist_ep_two_questioning);
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
        textViewMid = findViewById(R.id.textView6);
        textViewRight= findViewById(R.id.textView8);
        sus1 = findViewById(R.id.button50);
        sus2 = findViewById(R.id.button56);
        sus3 = findViewById(R.id.button60);
        sus4 = findViewById(R.id.button53);
        sus5 = findViewById(R.id.button55);
        sus6 = findViewById(R.id.button51);
        sus7 = findViewById(R.id.button52);

        q1 = findViewById(R.id.isE2Q1);
        q2 = findViewById(R.id.isE2Q2);
        q3 = findViewById(R.id.isE2Q3);
        q11 = findViewById(R.id.isE2Q11);
        q12 = findViewById(R.id.isE2Q12);
        q13 = findViewById(R.id.isE2Q13);
        q12x = findViewById(R.id.isE2Q12x);
        q131 = findViewById(R.id.isE2Q131);
        q132 = findViewById(R.id.isE2Q132);
        q133 = findViewById(R.id.isE2Q133);
        q21 = findViewById(R.id.isE2Q21);
        q22 = findViewById(R.id.isE2Q22);
        q23 = findViewById(R.id.isE2Q23);
        q211 = findViewById(R.id.isE2Q211);
        q212 = findViewById(R.id.isE2Q212);
        q213 = findViewById(R.id.isE2Q213);
        q31 = findViewById(R.id.isE2Q31);
        q32 = findViewById(R.id.isE2Q32);
        q33 = findViewById(R.id.isE2Q33);
        q321 = findViewById(R.id.isE2Q321);
        q322 = findViewById(R.id.isE2Q322);
        q323 = findViewById(R.id.isE2Q323);

        // suspect visibility
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is2Suspect4",false)){
            sus4.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is2Suspect5",false)){
            sus5.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is2Suspect6",false)){
            sus6.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is2Suspect7",false)){
            sus7.setVisibility(View.GONE);
        }

        // suspect onclick listeners
        sus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("??l??n??n Kar??s??");
                textViewRight.setText("+Merhaba, e??inizin ??l??m?? konusunda baz?? sorular sormam gerekiyor.");

            }
        });
        sus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Villa G??venli??i");
                textViewRight.setText("+Merhaba, i??lenen cinayet hakk??nda sormam gereken baz??" +
                        " sorular var");
            }
        });
        sus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Temizlik G??revlisi");
                textViewRight.setText("+Merhaba, ??l?? hakk??nda baz?? sorular sormam gerekiyor.");
            }
        });
        sus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("??l??n??n Karde??i");
                textViewRight.setText("+Merhaba, karde??inizin" +
                        " ??l??m?? konusunda baz?? sorular sormam gerekiyor.");
            }
        });
        sus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("??l??n??n Metresi");
                textViewRight.setText("+Merhaba, size yak??n zamanda i??lenen cinayet hakk??nda" +
                        " baz?? sorular sormam gerekiyor.");

            }
        });
        sus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("??l??n??n Kom??usu");
                textViewRight.setText("+Merhaba, kom??unuzun ??l??m?? konusunda" +
                        " baz?? sorular sormam gerekiyor.");
            }
        });
        sus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Metresin Karde??i");
                textViewRight.setText("+Merhaba, size baz?? sorular sormam gerekiyor.");
            }
        });

        // question button onclick listeners
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q11.setVisibility(View.VISIBLE);
                q12.setVisibility(View.VISIBLE);
                q13.setVisibility(View.VISIBLE);
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Olay zaman?? neredeydin?\n" +
                            "-??ocu??umla beraber annemlerdeydim.");
                    q13.setText("Kocan??z??n, annenizdeyken plan?? var m??yd??");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Olay zaman?? neredeydin?\n" +
                            "-Arkada??larla ma?? izledik sonra kriti??ini yapt??k.");
                    q13.setText("Neden ma???? ??l??yle izlemedin");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Olay zaman?? neredeydin?\n" +
                            "-Evimde uyuyordum.");
                    q13.setText("G??n??n hangi vaktinde giderdin");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Olay zaman?? neredeydin?\n" +
                            "-????ler birikti??i i??in ek mesaideydim.");
                    q13.setText("Neden kar??s??na ac??d??????n?? s??yledin");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Olay zaman?? neredeydin?\n" +
                            "-K??yafet almak i??in 4 gibi ????kt??m geceye kadar d????ar??dayd??m.");
                    q13.setText("Evde kimle ya????yorsun");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Olay zaman?? neredeydin?\n" +
                            "-Bah??emde kuzenlerimle mangal yap??yordum.");
                    q13.setText("Hakk??n??zda k??t?? konu??anlar varm????");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Olay zaman?? neredeydin?\n" +
                            "-Karde??imle evde tv izliyorduk.");
                    q13.setText("Karde??inizin ili??kisi hakk??nda d??????nceniz");
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
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+??l??yle alakan nedir?\n-6 y??ld??r evli kar??s??y??m");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+??l??yle alakan nedir?\n-Villan??n g??venli??i olmam d??????nda" +
                            " arada beraber ma?? izlerdik yani arkada??l??????m??z vard??.");

                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+??l??yle alakan nedir?\n-Bu villan??n temizlik i??leri" +
                            " uzun s??redir bende");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+??l??yle alakan nedir?\n-??z karde??iyim ama uzun s??redir" +
                            " g??r????m??yoruz.");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+??l??yle alakan nedir?\n-Sevgilisiyim diyelim.");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+??l??yle alakan nedir?\n-Yan kom??usu oluyorum.");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+??l??yle alakan nedir?\n-Karde??imin g??ya sevgilisi");

                }
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Birisinden ????pheleniyor musunuz?\n" +
                            "-E??imin karde??inden ????pheleniyorum");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect4",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect4",true).apply();
                    sus4.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Birisinden ????pheleniyor musunuz?\n" +
                            "-Yan villan??n sahibinden ????pheleniyorum.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect6",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect6",true).apply();
                    sus6.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Birisinden ????pheleniyor musunuz?\n" +
                            "-Metresi cad?? kad??ndan ????pheleniyorum.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect5",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect5",true).apply();
                    sus5.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Birisinden ????pheleniyor musunuz?\n" +
                            "-Metresi olma ihtimali y??ksek duyduysa kar??s?? da ??l??rm???? olabilir");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect5",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect5",true).apply();
                    sus5.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Birisinden ????pheleniyor musunuz?\n" +
                            "-Kar??s?? ??ld??rm????t??r.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Birisinden ????pheleniyor musunuz?\n" +
                            "-Adam zengindi paras?? i??in ??ld??rm????lerdir ama isim yok akl??mda.");
                    q1.setVisibility(View.VISIBLE);
                    q2.setVisibility(View.VISIBLE);
                    q3.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Birisinden ????pheleniyor musunuz?\n" +
                            "-Bu sa??mal????a katlanamay??p ??ld??rm????t??r kar??s??.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
            }
        });
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Villaya ne kadar uzakt??? \n -Bo??az??n kar???? taraf??nda");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Villaya ne kadar uzakt??? \n" +
                            " -15 ya da20 dakika olabilir emin de??ilim.");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Villaya ne kadar uzakt??? \n -Arabayla 45 dakika s??r??yor.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Villaya ne kadar uzakt??? \n -Baya uzak");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Villaya ne kadar uzakt??? \n -Gezdi??im yerler yak??n" +
                            " ama evim uzak");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Villaya ne kadar uzakt??? \n -Hocam seni" +
                            " kim dedektif yapt?? merak ettim de.");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Villaya ne kadar uzakt??? \n -Arabayla yar??m saat.");
                }
            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.VISIBLE);
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+??ahidin var m??? \n -Annem ve ??ocu??um var");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+??ahidin var m??? \n -Sabahlayan arkada??lar??m var");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+??ahidin var m??? \n -Hay??r tek ba????ma ya????yorum");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+??ahidin var m??? \n -???? yerindeki arkada??lar var.");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+??ahidin var m??? \n -Karde??im evden ????kt??????m?? g??rd??");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+??ahidin var m??? \n -Ailem kuzenlerim hepsi ??ahit olur");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+??ahidin var m??? \n -Karde??im");
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
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+O ak??am i??in kocan??z??n plan?? var m??yd???" +
                            " \n -Evde ma?? izleyecekti");
                    q131.setText("Ma?? izlemeye birini davet eder miydi");
                    q132.setText("Annenize s??k s??k gider misiniz");
                    q133.setText("Kocan??z yaln??z kalmay?? sever mi");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Onu neden ma?? izlemeye" +
                            " davet etmedin? \n -Arkada??lar??m?? tan??m??yordu");
                    q131.setText("Senden ba??kas??yla izler miydi");
                    q132.setText("Kameralara senin d??????nda ula??abilecek ki??iler kimler");
                    q133.setText("Ma?? izliyorum demesi yalan m??yd??");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+G??n??n hangi vakti temizli??e giderdin? \n" +
                            " -Sabah 9 gibi genellikle.");
                    q131.setText("Saat ka??ta ????kard??n");
                    q132.setText("Temizlik malzemelerinde eksik var m??yd??");
                    q133.setText("Villa yolu tenha m??d??r");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Kar??s??na ac??d??????n?? s??ylemi??sin, niye? \n" +
                            " -Bu sevgili/metres olaylar??ndan dolay??.");
                    q131.setText("Daha ??nce de e??ini aldatm???? m??yd??");
                    q132.setText("Kar??s??n??n cinayet i??leyecek akrabas?? var m??");
                    q133.setText("Metresin bu duruma al??nacak bir akrabas?? var m??");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Evde birisiyle mi ya????yorsun? \n -Karde??imle ya????yorum");
                    q131.setText("??li??kiniz oldu??unu kim biliyor");
                    q132.setText("Karde??inle iyi anla????r m??s??n??z");
                    q133.setText("S??k s??k o mekanlara gider miydiniz");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Hakk??n??zda k??t?? konu??anlar var? \n -??l??n??n itine ??ok s??vm??????md??r" +
                            " d??zg??n it olsa korurdu sahibini zaten");
                    q131.setText("Kom??unla ??ok kavga eder miydin");
                    q132.setText("Evlerinizin g??venlik sistemi benziyor mu");
                    q133.setText("Villa ??al????anlar?? hakk??nda ne d??????n??yorsun");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Karde??inizin ili??kiai hakk??nda ne d??????n??yorsunuz?" +
                            " \n -Bir ??ekilde bitmesi gerekiyordu bitti.");
                    q131.setText("Hi?? y??z y??ze tan????t??n??z m??");
                    q132.setText("Karde??iniz onun evine hi?? gitmi?? miydi");
                    q133.setText("Maddi durumunuz nas??l");
                }
            }
        });
        q12x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                   textViewRight.setText("+Peki kan??tlayabilir misin?\n-K??pr??den ge??tim yani evet");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Peki kan??tlayabilir misin?\n-Kan??t??m yok ama dedi??im gibi" +
                            " arkada??lar var.");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Peki kan??tlayabilir misin?\n-Villaya" +
                            " gitmedi??imi kan??tlayabilirim ??evredeki kameralardan");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Peki kan??tlayabilir misin?\n-Kesinlike, evet");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Peki kan??tlayabilir misin?\n-Gitti??im yerlerin kamera" +
                            " kay??tlar?? kan??tlar.");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Peki kan??tlayabilir misin?\n-Storyler say??l??rsa evet.");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Peki kan??tlayabilir misin?\n-Yok. ??ahit yetmiyor mu?");
                }
            }
        });
        q131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Ma?? izlemeye birini davet etmi?? miydi\n-" +
                            "Hay??r bazen g??velikle izlerlerdi ama.");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Senden ba??kas??yla ma?? izlermiydi?\n" +
                            " -Metres olaylar??ndan ??nce bazen karde??iyle izlerdi");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Bug??n temizlik malzemelerinde eksik g??rd??n??z m???\n-Hay??r.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+E??ini daha ??nceden aldat??r m??yd???\n-Hay??r.");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+??li??kiniz oldu??unu kimler biliyordu?\n-Karde??i,karde??im," +
                            "g??venlik,belki temizlik??i.");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+??ok kavga eder miydiniz?\n-Tak??m ve k??pe??i konusunda " +
                            "??ok tak??????rd??k ama fiziksel kavgam??z olmad??");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+??l??yle hi?? y??z y??ze g??r????t??n??z m??? \n-Hay??r");
                }
            }
        });
        q132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("Annenize s??k s??k ziyarete gider miydiniz?" +
                            "\n-Haftada iki kez genellikle");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Kameralara senden ba??ka eri??ebilecekler?\n-Kar??s??," +
                            "metresi,??ifresini hala de??i??tirmedi??ini biliyorlarsa kom??usu ve karde??i");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Peki saat ka??ta ????kard??n villadan?\n-13 gibi.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Kar??s??n??n cinayet i??lemek istese yard??m alabilece??i" +
                            " birisi var m???\n-Yok, olmad??????na emin say??l??r??m.");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Karde??inle iyi anla????r m??yd??n??z\n-Sevgilimden haz " +
                            "etmezdi ama pek kavga da etmedik");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Evlerinizin g??venlik sistemi benziyormu???\n Ayn??" +
                            " yere yapt??rd??k ??ifresini ayn?? koydularsa ??a????rmam," +
                            " ??ifreyi de??i??tirmem laz??m.");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Karde??iniz onun evine gitmi?? miydi?\n-Nadiren" +
                            " gidiyordu galiba ama daha ??ok d????ar??da bulu??uyorlard?? ben hi??" +
                            " b??rakmad??m onu");
                }
            }
        });
        q133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Kocan??z yaln??z kalmay?? seviyor gibi?\n-Evet,annene " +
                            "git istersen dedi??i de oluyor");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Ma?? izliyorum diye yalan s??yledi??i oluyor muydu?\n" +
                            "-Bazen metresiyle bulu??aca???? zamanlar");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Villa yolu tenha m??d??r?" +
                            "-??stanbul i??in kesinlikle.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Metresinin bu durumdan al??nacak bir" +
                            " akrabas??/eski sevgilisi var m??d??r?\n-Evet bir erkek karde??i var");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect7",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect7",true).apply();
                    sus7.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("S??k s??k o mekanlara gidermiydiniz ??zellikle sevgilinizle?" +
                            "Hay??r daha elit yerleri tercih ederim genellikle");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("Villa ??al????anlar?? hakk??nda ne d??????n??yorsunuz?" +
                            "\n-Normal insanlar ama g??venli??e biraz k??l??m.");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Maddi durumunuz nas??l?\n-Fakirim ama a?? gezmem");
                }
            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.VISIBLE);
                q212.setVisibility(View.VISIBLE);
                q213.setVisibility(View.VISIBLE);
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+En son ne konu??tunuz\n-Ma?? bitti ben yat??yorum dedi.");
                    q211.setText("22'den sonra ileti??iminiz oldu mu");
                    q212.setText("??ld??????n?? ne zaman ????rendin");
                    q213.setText("Daha sonra onla konu??mu?? olabilecek biri var m??");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+En son ne konu??tunuz\n-Ak??am yar??n erken gel" +
                            " dedi ben arkada??lara gitmeden");
                    q211.setText("Daha sonra ileti??iminiz oldu mu");
                    q212.setText("Ne zaman ??ld??????n?? ????rendin");
                    q213.setText("O gece onunla konu??mu?? olabilecek ba??kas?? var m??");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+En son ne konu??tunuz\n-Zam yapmak istemedi??ini s??yledi.");
                    q211.setText("Herkese kar???? cimri midir");
                    q212.setText("??al????anlar??na kar???? sayg??l?? m??d??r");
                    q213.setText("Ba??ka kad??nlara para yedirir mi");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+En son ne konu??tunuz\n-Bayramda bayramla??m????t??k.");
                    q211.setText("Kar??s?? biliyor mu");
                    q212.setText("Metresi tek ba????na m?? ya??ar");
                    q213.setText("Ortak konu??tu??unuz biri var m??");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+En son ne konu??tunuz\n-Can??ml?? cicimli konu??malar.");
                    q211.setText("Hi?? tart????m???? m??yd??n??z");
                    q212.setText("Karde??inle aras?? nas??ld??");
                    q213.setText("Kar??s??ndan bo??anmay?? d??????nm???? m??yd??");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+En son ne konu??tunuz\n-Evin bak??m??n?? kime yapt??rd??n" +
                            " ev ah??ra d??nm???? dedi ben de k??zd??m tabi.");
                    q211.setText("Sen de sinirlenip vurdun mu");
                    q212.setText("E??i konusunda ne d??????n??yorsun");
                    q213.setText("K??pe??i yabanc??lara kar???? g??r??lt??l?? m??d??r");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("Karde??imin telefonuna bakt??m bana sen kimsin dedi. ");
                    q211.setText("Karde??inle hi?? kavga ettiniz mi");
                    q212.setText("Sab??kan varm???? do??ru mu");
                    q213.setText("Peki o g??n birisiyle telefonda konu??tun mu");
                }
            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Bildi??iniz sosyal medyas?? var m???\n-Linkedin i var.");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Bildi??iniz sosyal medyas?? var m???\n-Benim feys" +
                            " var ama onu g??remedim bakt??????mda");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Bildi??iniz sosyal medyas?? var m???\n-Sosyal medya ne? " +
                            "??yle ??eyler kullanm??yorum.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Bildi??iniz sosyal medyas?? var m???\n-Linkedini" +
                            " ve twitter?? var");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Bildi??iniz sosyal medyas?? var m???\n-Twitterdan" +
                            " konu??uyorduk biz.");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Bildi??iniz sosyal medyas?? var m???\n-Hi?? dikkat etmedim");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Bildi??iniz sosyal medyas?? var m???\n-Umrumda de??il.");
                }
            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz?\n-Benimle eskisi kadar ??ok " +
                            "ilgilenmiyordu ama hala seviyorduk birbirimizi");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz?\n- Biraz ??akald?? ama" +
                            " maa?? vaktini geciktirmezdi muhabbeti de iyiydi");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz?\n- Birbirimize fazla" +
                            " kar????mazd??k e??ini aldatan pis biri olsa da zarars??zd??");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz?\n-Son bir ka?? y??ld??r eskisi" +
                            " gibi de??ildi ama ayn?? kar??ndan ????kt??k sonu??ta");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz?\n-Kocam olmal??yd?? ama olmad??.");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz?\n-Birbirimize s??ver dururduk.");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz?\n-Kar??s??n?? aldatan " +
                            "adam i??ren??tir. Karde??imle aldatmas?? daha i??ren??.");
                }
            }
        });
        q211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Daha sonra ileti??im kurdunuz mu?-Hay??r gece" +
                            " mesaj??ma d??nmedi");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Daha sonra ileti??im kurdunuz mu?-11 de " +
                            "gol oldu diye mesajla??t??k.");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Herkese kar???? cimri midir?\n-Cimrili??ini bilmem ama " +
                            "kar??s??ndan para saklamazd??");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Kar??s?? aldat??ld??????n?? bilmiyor de??il mi?\n" +
                            "-Bilmedi??ini d??????n??yorum");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Hi?? tart????m???? m??yd??n??z?\n -Bo??an o kad??ndan benimle evlen" +
                            " dedim kabul etmedi ama.");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+Sen de sinirlenip vurdun mu?\n-Yok can??m silah??m yok ki" +
                            "olsa da vuracak kadar salak de??ilim.");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Karde??inle bu konuda hi?? kavga ettiniz mi bu konuda?\n-S??zl?? evet.");
                }
            }
        });
        q212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+??ld??????n?? ne zaman ????rendin?\n-Sonraki sabah yani bug??n.");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+??ld??????n?? ne zaman ????rendin?\n-Daha yeni ????rendim.");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+??al????anlar??na kar???? sayg??l?? m??d??r?\n-Evet, kaba birisi " +
                            "de??ildi. Sayg??l?? davran??rd?? yani.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Metresi tek ba????na m?? ya????yor?\n-Hay??r karde??i var ve " +
                            "kavgac?? sab??kal?? birisi.");
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect7",true).apply();
                    sus7.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Karde??inle aras?? nas??ld???\n-Tan????m??yorlard?? sadece ismen biliyorlard?? birbirini.");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("+E??i hakk??nda ne d??????n??yorsun\n-Saf birisi karde??ime ??ok" +
                            " zeki olsa katlanamazd??");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Sab??kan var m???\n-Aileme k??fretmi??ti ben de b????aklad??m" +
                            " bir ka?? y??l ??nce. Allahtan ??lmediydi.");
                }
            }
        });
        q213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Daha sonra onla konu??mu?? olabilecek birisi?\n-Bildi??im" +
                            " birisi yok");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Daha sonra onla konu??mu?? olabilecek birisi?\n" +
                            "-Metresini aram????t??r ev bo??ken.");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Ba??kalar??na para yedirir miydi?\n-Metresine biraz.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+??kinizin de konu??tu??u birisi var m???\n-O " +
                            "villan??n temizlik??isi bir ka?? defa gelmi??ti benim eve de");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Kar??s??ndan bo??anmay?? hi?? d??????nd?? m???\n-Ben sordu??umda" +
                            " beni hep ge??i??tiriyordu");
                }
                else if (textViewMid.getText().equals("??l??n??n Kom??usu")){
                    textViewRight.setText("K??pe??i yabanc??lara g??r??lt??l?? m??d??r?\n-Evet d??n ak??amki" +
                            " g??r??lt??s?? ondan dolay?? olabilir");
                }
                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("Peki o g??n telefonda biriyle konu??tunuz mu? \n" +
                            "Hay??r me??guld??m.");
                }
            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Neden ondan ????pheleniyorsun?\n-??lgin?? bir ??ekilde" +
                            " bana ac??d??????n?? s??yl??yordu");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Neden ondan ????pheleniyorsun?\n" +
                            "-2 g??n ??nce k??pek g??r??lt??s??nden kavga etmi??lerdi");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Neden ondan ????pheleniyorsun?\n-Bo??anmazsan seni" +
                            " ??ld??r??r??m dedi??ini duydum.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Neden ondan ????pheleniyorsun?\n-K??skan?? bir kad??n evli " +
                            "biriyle ili??kisi olan??n kendisi oldu??u halde.");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Neden ondan ????pheleniyorsun?\n-K??skan??l??k?");
                }

                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Neden ondan ????pheleniyorsun?\n-D??z mant??k gittim.");
                }
            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q32.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("Detay verebilir misin?\n-Hangi konuda?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("Detay verebilir misin?\n-Nas??l detay?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("Detay verebilir misin?\n-Hangi konuda" +
                            "? Ad??n?? m?? istiyorsun?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("Detay verebilir misin?\n-Hangi konuda?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("Detay verebilir misin?\n- Nas??l? hangi konuda?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }

                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("Detay verebilir misin?\n-Senden daha az tan??yorum detay " +
                            "verebilece??im bir ??ey yok.");
                    q32.setVisibility(View.VISIBLE);
                    q31.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+Fiziksel ??zellikleri nedir?\n-Karde??ime ??ok benziyor" +
                            " sadece sa??lar?? daha g??r");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Fiziksel ??zellikleri nedir?\n- K??sa ??i??ko bir adam");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Fiziksel ??zellikleri nedir?\n-20lerinin ba????nda" +
                            " k??z??l sa??l??, zay??f say??l??r.");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Fiziksel ??zellikleri nedir?\n-Gen?? k??z??l sa???? " +
                            "vard?? en son.");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Fiziksel ??zellikleri nedir?\n-Sar??????n ve benden ??irkin.");
                }

                else if (textViewMid.getText().equals("Metresin Karde??i")){
                    textViewRight.setText("+Fiziksel ??zellikleri nedir?\n-Karde??ime sor.");
                }
            }
        });
        q321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Loc3",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni yer ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    textViewRight.setText("+Nerede ya??ar?\n-Kad??k??y taraflar??nda, adresini vereyim.");
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Loc3",true).apply();
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+Nerede ya??ar?\n-Hemen yan villa, g??stereyim");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Loc4",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni yer ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Loc4",true).apply();
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+Nerede ya??ar?\n- Bizim mahallede Do??ru apartmanda." +
                            " ???? apartman solumda.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Loc2",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni yer ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Loc5",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni yer ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Loc2",true).apply();
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Loc5",true).apply();
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+Nerede ya??ar?\n-Bilmiyorum villa ??al????anlar??na" +
                            " sorabilirsin");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+Nerede ya??ar?\n-Ayn?? evde ya??arlar.");
                }
            }
        });
        q322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("+??l??n??n tam olarak nesi olur?\n-??z karde??i");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("+??l??n??n tam olarak nesi olur?\n-Sadece kom??usu ba??ka" +
                            " ba??lar?? yok");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("+??l??n??n tam olarak nesi olur?\n- Sevgilisi??");
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("+??l??n??n tam olarak nesi olur?\n-Kar??s??n?? aldatt?????? kad??n");
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("+??l??n??n tam olarak nesi olur?\n-Tahmin et..." +
                            " ??pucu vereyim 6 harfli ba?? harfi k");
                }
            }
        });
        q323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("??l??n??n Kar??s??")){
                    textViewRight.setText("??nceden bir su??a kar????m???? m??d??r?\n-Hay??r ama bu devird" +
                            "e belli mi olur");
                }
                else if (textViewMid.getText().equals("Villa G??venli??i")){
                    textViewRight.setText("??nceden bir su??a kar????m???? m??d??r?\n-Tan??mam ama" +
                            " kar????m???? olabilir");
                }
                else if (textViewMid.getText().equals("Temizlik G??revlisi")){
                    textViewRight.setText("??nceden bir su??a kar????m???? m??d??r?\n-Kendisi de??il ama " +
                            "karde??inin adam yaralamas?? vard??.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect7",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect7",true).apply();
                    sus7.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Karde??i")){
                    textViewRight.setText("??nceden bir su??a kar????m???? m??d??r?\n-Doland??r??c?? olabilir" +
                            " onun d??????nda karde??i hakk??nda adam yaralama gibi bir ??eyler duydum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect7",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect7",true).apply();
                    sus7.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("??l??n??n Metresi")){
                    textViewRight.setText("??nceden bir su??a kar????m???? m??d??r?\n-K??skan????k" +
                            "cinayetleri sab??kaya ??ok bakm??yor ama duymad??m.");
                }
            }
        });

    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), IstEpTwo.class);
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
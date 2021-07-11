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

public class AnkEpTwoInvestigate extends AppCompatActivity {
    TextView textViewR;
    TextView textViewM;
    Button p1;
    Button p2;
    Button p3;
    Button p4;
    Button p5;
    Button p6;
    Button i1;
    Button i2;
    Button i3;
    Button i11;
    Button i12;
    Button i13;
    Button i111;
    Button i112;
    Button i113;
    Button i21;
    Button i22;
    Button i23;

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
        setContentView(R.layout.activity_ank_ep_two_investigate);
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

        textViewR = findViewById(R.id.textViewR6);
        textViewM = findViewById(R.id.textViewM10);

        p1 = findViewById(R.id.button111);
        p2 = findViewById(R.id.button112);
        p3 = findViewById(R.id.button113);
        p4 = findViewById(R.id.button114);
        p5 = findViewById(R.id.button115);
        p6 = findViewById(R.id.button116);

        i1 = findViewById(R.id.akE2I1);
        i2 = findViewById(R.id.akE2I2);
        i3 = findViewById(R.id.akE2I3);
        i11 = findViewById(R.id.akE2I11);
        i12 = findViewById(R.id.akE2I12);
        i13 = findViewById(R.id.akE2I13);
        i111 = findViewById(R.id.akE2I111);
        i112 = findViewById(R.id.akE2I112);
        i113 = findViewById(R.id.akE2I113);
        i21 = findViewById(R.id.akE2I21);
        i22 = findViewById(R.id.akE2I22);
        i23 = findViewById(R.id.akE2I23);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i1.setText("Katilin kaçtığı yeri incele");
                i2.setText("Ölüdeki kanıtları iste");
                i3.setText("Etrafta kamera ara");

                textViewM.setText("Olay yeri");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i111.setVisibility(View.GONE);
                i112.setVisibility(View.GONE);
                i113.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);

            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setText("Salonu incele");
                i2.setText("Yatak odasını incele");
                i3.setText("Apartmanı incele");

                textViewM.setText("Yaşlıların evi");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i111.setVisibility(View.GONE);
                i112.setVisibility(View.GONE);
                i113.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);

            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setText("Salonu incele");
                i2.setText("Yatak odasını incele");
                i3.setText("Evi incele");

                textViewM.setText("Ortamcının evi");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i111.setVisibility(View.GONE);
                i112.setVisibility(View.GONE);
                i113.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);

            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setText("Soldaki odaları incele");
                i2.setText("Sağdaki odaları incele");
                i3.setText("Kapının ilerisindeki odaları incele");

                textViewM.setText("Ekibin evi");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i111.setVisibility(View.GONE);
                i112.setVisibility(View.GONE);
                i113.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);

            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setText("Parktan olay yerine uzaklığı hesapla");
                i2.setText("Parkta kanıt topla");
                i3.setText("Çevredekilerle dün akşamı konuş");
                textViewM.setText("Yandaki park");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i111.setVisibility(View.GONE);
                i112.setVisibility(View.GONE);
                i113.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);

            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                        ("Ank2Pistol",false)) {
                    i1.setText("Tabancayla cüzdanı karşılaştır");
                }
                else i1.setText("Bu seçenek için kanıt topla");
                if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                        ("Ank2Jacket",false)) {
                    i2.setText("Ceketle cüzdanı karşılaştır");
                }
                else i2.setText("Bu seçenek için kanıt topla");
                i3.setText("Toplanan parmak izleriyle kanıtlardaki parmak izlerini karşılaştır.");
                textViewM.setText("Parmak izi ve Dna");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i111.setVisibility(View.GONE);
                i112.setVisibility(View.GONE);
                i113.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);

            }
        });

        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Place3",false)){
            p3.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Place4",false)){
            p4.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ank2Place5",false)){
            p5.setVisibility(View.GONE);
        }

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Window",false)){
                        textViewR.setText("Yaşlıların evinden baktığımda en mantıklı kaçılacak yer" +
                                " çapraz apartmanın bahçesi gözüküyor. Oraya bakayım.");
                        i11.setVisibility(View.VISIBLE);
                        i12.setVisibility(View.VISIBLE);
                        i13.setVisibility(View.VISIBLE);
                        i1.setVisibility(View.GONE);
                        i2.setVisibility(View.GONE);
                        i3.setVisibility(View.GONE);
                        i11.setText("Bahçede kanıt topla");
                        i12.setText("Bahçenin girişini incele");
                        i13.setText("Bahçenin etrafını incele");
                    }
                    else textViewR.setText("Bu seçenek için biraz daha keşif yap çünkü nereye" +
                            " kaçtığı belli değil");
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Salonda TV, koltuklar ve bir dolap var.");
                    i11.setText("Tv Yİ İNCELE");
                    i12.setText("Koltukları incele");
                    i13.setText("Dolabı incele");
                    i11.setVisibility(View.VISIBLE);
                    i12.setVisibility(View.VISIBLE);
                    i13.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Salonda bilgisayar, bir sürü koltuk ve masa var. Masanın" +
                            " etrafında sandalyeler var.");
                    i11.setText("Bilgisayarı incele");
                    i12.setText("Koltukları incele");
                    i13.setText("Masayı incele");
                    i11.setVisibility(View.VISIBLE);
                    i12.setVisibility(View.VISIBLE);
                    i13.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Solda salon, Yankiyle Façalının odası ve Sabrinin odası var.");
                    i11.setText("Salonu incele");
                    i12.setText("Yankiyle Façalının odasını incele");
                    i13.setText("Sabrisini incele");
                    i11.setVisibility(View.VISIBLE);
                    i12.setVisibility(View.VISIBLE);
                    i13.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Yandaki park")){
                    textViewR.setText("Parktan olay yerine uzaklık yaklaşık 200 metre ama tam" +
                            " olay yeri buradan gözükmüyor.");

                }
                else if (textViewM.getText().toString().equals("Parmak izi ve Dna")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Pistol",false)){
                        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                                ("Ank2Dna8",false)){
                            textViewR.setText("Tabancayla cüzdandaki dna lar uyuşuyor. İkisinde de" +
                                    " Sakin Sabri'nin dnası bulundu");
                        }
                        else textViewR.setText("Tabancayla cüzdandaki dna lar uyuşuyor.");

                    }
                    else textViewR.setText("Bu seçenek için biraz daha keşif yap çünkü nereye" +
                            " kaçtığı belli değil");
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Cüzdanı, telefonu ve kıyafetleri çıkmış ölünün üstünden.");
                    i21.setText("Cüzdanı incele");
                    i22.setText("Telefonu incele");
                    i23.setText("Kıyafetleri incele");
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Yatak odasında dolap, yatak ve komidin var.");
                    i21.setText("Dolabı incele");
                    i22.setText("Yatağı incele");
                    i23.setText("Komidini incele");
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Yatak odasında dolap, tek kişilik yatak ve çalışma masası" +
                            " var.");
                    i21.setText("Dolabı incele");
                    i22.setText("Yatağı incele");
                    i23.setText("Çalışma masasını incele");
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Sağdaki oda Repçi Recep'in odası. Diğer odalara kıyasla " +
                            "geniş bir oda.");
                    i21.setText("Recepin odasını incele");
                    i22.setText("Apartmanın girişini incele");
                    i23.setText("Apartmanın bahçesini incele");
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Yandaki park")){
                    textViewR.setText("Parkta kanıt olabilecek tek şey çekirdek çöpleri. " +
                            "Bir işe yaramaz onlar da.");
                }
                else if (textViewM.getText().toString().equals("Parmak izi ve Dna")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Jacket",false)){
                        textViewR.setText("Cüzdandaki dnalarla uyum sağlamadı. Ceketin olayla" +
                                " alakası yok");
                    }
                    else textViewR.setText("Daha çok kanıt toplanmalı.");
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Etraftaki en yakın kamera 500 metre uzaklıkta ve hiç işe" +
                            " yaramaz.");
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Yeni yapılmış ama lüks olmayan bir apartman.");
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Bir gecekonduya göre oldukça iyi durumda.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Kapının ilerisinde Sakız Enginin minik odası var. Odada " +
                            "sadece bir pencere ve bir yatak var. Kıyafetler yere yığılmış.");
                }
                else if (textViewM.getText().toString().equals("Yandaki park")){
                    textViewR.setText("Çevredekiler o akşam ekibi parkta gördüklerini söylediler.");
                }
                else if (textViewM.getText().toString().equals("Parmak izi ve Dna")){
                    String stringSus = "Eşleşen parmak izleri ve Dna lar sırasıyla= ";
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Dna2",false)){
                        stringSus = stringSus +" Yaşlı amca ";
                    }
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Dna4",false)){
                        stringSus = stringSus +" Ortamcı Ahmet ";
                    }
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Dna7",false)){
                        stringSus = stringSus +" Repçi Recep ";
                    }
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Dna8",false)){
                        stringSus = stringSus +" Sakin Sabri ";
                    }
                    textViewR.setText(stringSus);
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Bahçede hurda eşyalar, motorsiklet ve bir ceket var.");
                    i111.setText("Hurdaları incele");
                    i112.setText("Motorsikleti incele");
                    i113.setText("Ceketi incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i111.setVisibility(View.VISIBLE);
                    i112.setVisibility(View.VISIBLE);
                    i113.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("TV nin kendisinde bir şey yok ama TV yanındaki camın manzara" +
                            "sına bakılmalı.");
                    i111.setText("Olay yerini yukarıdan incele");
                    i112.setText("Camdan katilin kaçabileceği yerlere bak");
                    i113.setText("TV yi yine de incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i111.setVisibility(View.VISIBLE);
                    i112.setVisibility(View.VISIBLE);
                    i113.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Bilgisayar orta seviye bir laptop. Şifreli ancak şüpheli" +
                            " şifreyi açmayı yanındayken bakmak şartıyla kabul etti.");
                    i111.setText("İnternet geçmişini incele");
                    i112.setText("Belgeleri incele");
                    i113.setText("Oynadığı oyunları incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i111.setVisibility(View.VISIBLE);
                    i112.setVisibility(View.VISIBLE);
                    i113.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Salonda bir kaç kanepe, herkesin " +
                            "ismi ayrı ayrı yazan dolaplar ve bir TV var.");
                    i111.setText("Kanepeleri incele");
                    i112.setText("İsim yazan dolabı incele");
                    i113.setText("TV yi incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i111.setVisibility(View.VISIBLE);
                    i112.setVisibility(View.VISIBLE);
                    i113.setVisibility(View.VISIBLE);
                }
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Bahçenin girişi atlamaya müsait. İçeride ise köpek vs. yok.");
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Koltuklarda koltuk kılıfı var. İçinde de kışlık yorgan var.");
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Koltukların yayları bozulmuş. Üzerinde sigara söndürülmüş " +
                            "dandik ve eski koltuklar.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Odalarında masaüstü bir bilgisayar, içinde kıyafetler olan" +
                            " bir dolap ve 2 tek kişilik yatak var.");
                }
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Bahçeden diğer bahçelere atlayıp kaçmak oldukça kolay.");
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Dolapta bir tabanca var ama şarjorü takılmamış. Uzun s" +
                            "üredir kullanılmadığını düşünüyorum.");
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Masada dünden kalma yarısı yenmiş bir lahmacun var.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Sabrinin odasında sadece bir kanepe var. Kıyafetleri ise" +
                            " yerlere dağılmış. Bir miktar para da kıyafetlerin altında var.");
                }
            }
        });
        i111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Hurdaların içinde güzelce saklanmış bir tabanca var");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Pistol",true).apply();
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Olay yeri cinayet işleyip kaçmak için uygun gözüküyor ama" +
                            " planlı bir cinayet olsa daha ıssız sokaklar tercih edilebilirdi.");
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("İnternet geçmişinde şüphe çeken bir şey yok.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Kanepeler berbat durumda. Pislikten renkleri değişmiş ve" +
                            " içine doğru göçmüş.");
                }
            }
        });
        i112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Motorsikletin sahibi çıktı hırsızlıkla suçladı. Zor kurtulduk.");
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("En mantıklı kaçış yolu çapraz apartmanın bahçesine doğru.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Window",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Belgelerinde hep ortamlarda arkadaşlarıyla fotoğrafları var.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Herkesin ismi yazan dolapları açtırmadılar ancak içlerinde" +
                            " herkesin özel eşyaları varmış.");
                }
            }
        });
        i113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Ceketin katile ait olup olmadığını anlamak için incelemeye" +
                            "yollanması gerekiyor.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Jacket",true).apply();
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Güzel bir televizyon. Dekoderin üzerine dantel koymuşlar.");
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Oyunlarda sadece GTA ve Counter Strike var. Biraz ironik...");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("TV ye iptv bağlı. Ekip biraz korsancı galiba.");
                }
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Polis cüzdanda parmak izi toplamış ama kimseyle " +
                            "eşleştirememiş. Cüzdanda bir miktar Çin Yuan'ı ve ölünün kimliği " +
                            "bulunmuş.");
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Dolapta kıyafet ve ayakkabılar var. Bir de pompalı tüfek var.");
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Dolabında bir sürü kıyafet var. Ayrıca traş makinası ve" +
                            " parfüm gibi şeyler var.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Odada masaüstü bilgisayar, normal bir yatak ve içi gömlek " +
                            "dolu bir dolap var.");
                }
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Telefon Çince ve şifreli. İşime yarayacağını zannetmiyorum.");
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Yatakta yastık, yorgan var. Başka ne beklenir ki?");
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Yatakta farklı bir şey yok. Sadece yatak dağınık bir şekilde" +
                            " bırakılmış.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Apartman girişinde ilginç bir şey yok. Dairenin girişinde " +
                            "kapı dışında ayakkabı var.");
                }
            }
        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Kıyafetleri şık. Onun dışında cüzdandakinden farklı" +
                            " bir dna tespit edilemedi.");
                }
                else if (textViewM.getText().toString().equals("Yaşlıların evi")){
                    textViewR.setText("Komidinde bozuk paralar, şarj aleti ve traş makinesi gibi" +
                            " şeyler var.");
                }
                else if (textViewM.getText().toString().equals("Ortamcının evi")){
                    textViewR.setText("Çalışma masasında üniversite sınavı için test kitapları var.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Bahçe küçük ancak bir çardak var. Bahçenin kalanı otla dolu.");
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
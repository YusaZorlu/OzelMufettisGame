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

                i1.setText("Katilin ka??t?????? yeri incele");
                i2.setText("??l??deki kan??tlar?? iste");
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
                i2.setText("Yatak odas??n?? incele");
                i3.setText("Apartman?? incele");

                textViewM.setText("Ya??l??lar??n evi");
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
                i2.setText("Yatak odas??n?? incele");
                i3.setText("Evi incele");

                textViewM.setText("Ortamc??n??n evi");
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
                i1.setText("Soldaki odalar?? incele");
                i2.setText("Sa??daki odalar?? incele");
                i3.setText("Kap??n??n ilerisindeki odalar?? incele");

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
                i1.setText("Parktan olay yerine uzakl?????? hesapla");
                i2.setText("Parkta kan??t topla");
                i3.setText("??evredekilerle d??n ak??am?? konu??");
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
                    i1.setText("Tabancayla c??zdan?? kar????la??t??r");
                }
                else i1.setText("Bu se??enek i??in kan??t topla");
                if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                        ("Ank2Jacket",false)) {
                    i2.setText("Ceketle c??zdan?? kar????la??t??r");
                }
                else i2.setText("Bu se??enek i??in kan??t topla");
                i3.setText("Toplanan parmak izleriyle kan??tlardaki parmak izlerini kar????la??t??r.");
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
                        textViewR.setText("Ya??l??lar??n evinden bakt??????mda en mant??kl?? ka????lacak yer" +
                                " ??apraz apartman??n bah??esi g??z??k??yor. Oraya bakay??m.");
                        i11.setVisibility(View.VISIBLE);
                        i12.setVisibility(View.VISIBLE);
                        i13.setVisibility(View.VISIBLE);
                        i1.setVisibility(View.GONE);
                        i2.setVisibility(View.GONE);
                        i3.setVisibility(View.GONE);
                        i11.setText("Bah??ede kan??t topla");
                        i12.setText("Bah??enin giri??ini incele");
                        i13.setText("Bah??enin etraf??n?? incele");
                    }
                    else textViewR.setText("Bu se??enek i??in biraz daha ke??if yap ????nk?? nereye" +
                            " ka??t?????? belli de??il");
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Salonda TV, koltuklar ve bir dolap var.");
                    i11.setText("Tv Y?? ??NCELE");
                    i12.setText("Koltuklar?? incele");
                    i13.setText("Dolab?? incele");
                    i11.setVisibility(View.VISIBLE);
                    i12.setVisibility(View.VISIBLE);
                    i13.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Salonda bilgisayar, bir s??r?? koltuk ve masa var. Masan??n" +
                            " etraf??nda sandalyeler var.");
                    i11.setText("Bilgisayar?? incele");
                    i12.setText("Koltuklar?? incele");
                    i13.setText("Masay?? incele");
                    i11.setVisibility(View.VISIBLE);
                    i12.setVisibility(View.VISIBLE);
                    i13.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Solda salon, Yankiyle Fa??al??n??n odas?? ve Sabrinin odas?? var.");
                    i11.setText("Salonu incele");
                    i12.setText("Yankiyle Fa??al??n??n odas??n?? incele");
                    i13.setText("Sabrisini incele");
                    i11.setVisibility(View.VISIBLE);
                    i12.setVisibility(View.VISIBLE);
                    i13.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Yandaki park")){
                    textViewR.setText("Parktan olay yerine uzakl??k yakla????k 200 metre ama tam" +
                            " olay yeri buradan g??z??km??yor.");

                }
                else if (textViewM.getText().toString().equals("Parmak izi ve Dna")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Pistol",false)){
                        if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                                ("Ank2Dna8",false)){
                            textViewR.setText("Tabancayla c??zdandaki dna lar uyu??uyor. ??kisinde de" +
                                    " Sakin Sabri'nin dnas?? bulundu");
                        }
                        else textViewR.setText("Tabancayla c??zdandaki dna lar uyu??uyor.");

                    }
                    else textViewR.setText("Bu se??enek i??in biraz daha ke??if yap ????nk?? nereye" +
                            " ka??t?????? belli de??il");
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("C??zdan??, telefonu ve k??yafetleri ????km???? ??l??n??n ??st??nden.");
                    i21.setText("C??zdan?? incele");
                    i22.setText("Telefonu incele");
                    i23.setText("K??yafetleri incele");
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Yatak odas??nda dolap, yatak ve komidin var.");
                    i21.setText("Dolab?? incele");
                    i22.setText("Yata???? incele");
                    i23.setText("Komidini incele");
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Yatak odas??nda dolap, tek ki??ilik yatak ve ??al????ma masas??" +
                            " var.");
                    i21.setText("Dolab?? incele");
                    i22.setText("Yata???? incele");
                    i23.setText("??al????ma masas??n?? incele");
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Sa??daki oda Rep??i Recep'in odas??. Di??er odalara k??yasla " +
                            "geni?? bir oda.");
                    i21.setText("Recepin odas??n?? incele");
                    i22.setText("Apartman??n giri??ini incele");
                    i23.setText("Apartman??n bah??esini incele");
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                }
                else if (textViewM.getText().toString().equals("Yandaki park")){
                    textViewR.setText("Parkta kan??t olabilecek tek ??ey ??ekirdek ????pleri. " +
                            "Bir i??e yaramaz onlar da.");
                }
                else if (textViewM.getText().toString().equals("Parmak izi ve Dna")){
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Jacket",false)){
                        textViewR.setText("C??zdandaki dnalarla uyum sa??lamad??. Ceketin olayla" +
                                " alakas?? yok");
                    }
                    else textViewR.setText("Daha ??ok kan??t toplanmal??.");
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Etraftaki en yak??n kamera 500 metre uzakl??kta ve hi?? i??e" +
                            " yaramaz.");
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Yeni yap??lm???? ama l??ks olmayan bir apartman.");
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Bir gecekonduya g??re olduk??a iyi durumda.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Kap??n??n ilerisinde Sak??z Enginin minik odas?? var. Odada " +
                            "sadece bir pencere ve bir yatak var. K??yafetler yere y??????lm????.");
                }
                else if (textViewM.getText().toString().equals("Yandaki park")){
                    textViewR.setText("??evredekiler o ak??am ekibi parkta g??rd??klerini s??ylediler.");
                }
                else if (textViewM.getText().toString().equals("Parmak izi ve Dna")){
                    String stringSus = "E??le??en parmak izleri ve Dna lar s??ras??yla= ";
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Dna2",false)){
                        stringSus = stringSus +" Ya??l?? amca ";
                    }
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Dna4",false)){
                        stringSus = stringSus +" Ortamc?? Ahmet ";
                    }
                    if(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean
                            ("Ank2Dna7",false)){
                        stringSus = stringSus +" Rep??i Recep ";
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
                    textViewR.setText("Bah??ede hurda e??yalar, motorsiklet ve bir ceket var.");
                    i111.setText("Hurdalar?? incele");
                    i112.setText("Motorsikleti incele");
                    i113.setText("Ceketi incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i111.setVisibility(View.VISIBLE);
                    i112.setVisibility(View.VISIBLE);
                    i113.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("TV nin kendisinde bir ??ey yok ama TV yan??ndaki cam??n manzara" +
                            "s??na bak??lmal??.");
                    i111.setText("Olay yerini yukar??dan incele");
                    i112.setText("Camdan katilin ka??abilece??i yerlere bak");
                    i113.setText("TV yi yine de incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i111.setVisibility(View.VISIBLE);
                    i112.setVisibility(View.VISIBLE);
                    i113.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Bilgisayar orta seviye bir laptop. ??ifreli ancak ????pheli" +
                            " ??ifreyi a??may?? yan??ndayken bakmak ??art??yla kabul etti.");
                    i111.setText("??nternet ge??mi??ini incele");
                    i112.setText("Belgeleri incele");
                    i113.setText("Oynad?????? oyunlar?? incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i111.setVisibility(View.VISIBLE);
                    i112.setVisibility(View.VISIBLE);
                    i113.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Salonda bir ka?? kanepe, herkesin " +
                            "ismi ayr?? ayr?? yazan dolaplar ve bir TV var.");
                    i111.setText("Kanepeleri incele");
                    i112.setText("??sim yazan dolab?? incele");
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
                    textViewR.setText("Bah??enin giri??i atlamaya m??sait. ????eride ise k??pek vs. yok.");
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Koltuklarda koltuk k??l??f?? var. ????inde de k????l??k yorgan var.");
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Koltuklar??n yaylar?? bozulmu??. ??zerinde sigara s??nd??r??lm???? " +
                            "dandik ve eski koltuklar.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Odalar??nda masa??st?? bir bilgisayar, i??inde k??yafetler olan" +
                            " bir dolap ve 2 tek ki??ilik yatak var.");
                }
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Bah??eden di??er bah??elere atlay??p ka??mak olduk??a kolay.");
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Dolapta bir tabanca var ama ??arjor?? tak??lmam????. Uzun s" +
                            "??redir kullan??lmad??????n?? d??????n??yorum.");
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Masada d??nden kalma yar??s?? yenmi?? bir lahmacun var.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Sabrinin odas??nda sadece bir kanepe var. K??yafetleri ise" +
                            " yerlere da????lm????. Bir miktar para da k??yafetlerin alt??nda var.");
                }
            }
        });
        i111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Hurdalar??n i??inde g??zelce saklanm???? bir tabanca var");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Pistol",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Olay yeri cinayet i??leyip ka??mak i??in uygun g??z??k??yor ama" +
                            " planl?? bir cinayet olsa daha ??ss??z sokaklar tercih edilebilirdi.");
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("??nternet ge??mi??inde ????phe ??eken bir ??ey yok.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Kanepeler berbat durumda. Pislikten renkleri de??i??mi?? ve" +
                            " i??ine do??ru g????m????.");
                }
            }
        });
        i112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Motorsikletin sahibi ????kt?? h??rs??zl??kla su??lad??. Zor kurtulduk.");
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("En mant??kl?? ka?????? yolu ??apraz apartman??n bah??esine do??ru.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Window",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Belgelerinde hep ortamlarda arkada??lar??yla foto??raflar?? var.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Herkesin ismi yazan dolaplar?? a??t??rmad??lar ancak i??lerinde" +
                            " herkesin ??zel e??yalar?? varm????.");
                }
            }
        });
        i113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Ceketin katile ait olup olmad??????n?? anlamak i??in incelemeye" +
                            "yollanmas?? gerekiyor.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Ank2Jacket",true).apply();
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("G??zel bir televizyon. Dekoderin ??zerine dantel koymu??lar.");
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Oyunlarda sadece GTA ve Counter Strike var. Biraz ironik...");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("TV ye iptv ba??l??. Ekip biraz korsanc?? galiba.");
                }
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Polis c??zdanda parmak izi toplam???? ama kimseyle " +
                            "e??le??tirememi??. C??zdanda bir miktar ??in Yuan'?? ve ??l??n??n kimli??i " +
                            "bulunmu??.");
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Dolapta k??yafet ve ayakkab??lar var. Bir de pompal?? t??fek var.");
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Dolab??nda bir s??r?? k??yafet var. Ayr??ca tra?? makinas?? ve" +
                            " parf??m gibi ??eyler var.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Odada masa??st?? bilgisayar, normal bir yatak ve i??i g??mlek " +
                            "dolu bir dolap var.");
                }
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Telefon ??ince ve ??ifreli. ????ime yarayaca????n?? zannetmiyorum.");
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Yatakta yast??k, yorgan var. Ba??ka ne beklenir ki?");
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("Yatakta farkl?? bir ??ey yok. Sadece yatak da????n??k bir ??ekilde" +
                            " b??rak??lm????.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Apartman giri??inde ilgin?? bir ??ey yok. Dairenin giri??inde " +
                            "kap?? d??????nda ayakkab?? var.");
                }
            }
        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("K??yafetleri ????k. Onun d??????nda c??zdandakinden farkl??" +
                            " bir dna tespit edilemedi.");
                }
                else if (textViewM.getText().toString().equals("Ya??l??lar??n evi")){
                    textViewR.setText("Komidinde bozuk paralar, ??arj aleti ve tra?? makinesi gibi" +
                            " ??eyler var.");
                }
                else if (textViewM.getText().toString().equals("Ortamc??n??n evi")){
                    textViewR.setText("??al????ma masas??nda ??niversite s??nav?? i??in test kitaplar?? var.");
                }
                else if (textViewM.getText().toString().equals("Ekibin evi")){
                    textViewR.setText("Bah??e k??????k ancak bir ??ardak var. Bah??enin kalan?? otla dolu.");
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
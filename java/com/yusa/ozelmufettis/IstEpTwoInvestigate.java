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

public class IstEpTwoInvestigate extends AppCompatActivity {
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
    Button i21;
    Button i22;
    Button i23;
    Button i231;
    Button i232;
    Button i233;
    Button i31;
    Button i32;
    Button i33;
    Button i331;
    Button i332;
    Button i333;
    Button i4;
    Button i5;
    Button i6;
    TextView rightTextView;
    TextView midTextView;
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
        setContentView(R.layout.activity_ist_ep_two_investigate);
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
        i1 = findViewById(R.id.isE2I1);
        i2 = findViewById(R.id.isE2I2);
        i3 = findViewById(R.id.isE2I3);
        i11 = findViewById(R.id.isE2I11);
        i12 = findViewById(R.id.isE2I12);
        i13 = findViewById(R.id.isE2I13);
        i21 = findViewById(R.id.isE2I21);
        i22 = findViewById(R.id.isE2I22);
        i23 = findViewById(R.id.isE2I23);
        i231= findViewById(R.id.isE2I231);
        i232 = findViewById(R.id.isE2I232);
        i233 = findViewById(R.id.isE2I233);
        i31 = findViewById(R.id.isE2I31);
        i32 = findViewById(R.id.isE2I32);
        i33 = findViewById(R.id.isE2I33);
        i331 = findViewById(R.id.isE2I331);
        i332 = findViewById(R.id.isE2I332);
        i333 = findViewById(R.id.isE2I333);
        i4 = findViewById(R.id.isE2I4);
        i5 = findViewById(R.id.isE2I5);
        i6 = findViewById(R.id.isE2I6);

        p1 = findViewById(R.id.button48);
        p2 = findViewById(R.id.button49);
        p3 = findViewById(R.id.button61);
        p4 = findViewById(R.id.button62);
        p5 = findViewById(R.id.button64);
        p6 = findViewById(R.id.button66);

        midTextView = findViewById(R.id.textView7);
        rightTextView = findViewById(R.id.textView5);
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("Is2Loc2",false)){
            p2.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("Is2Loc3",false)){
            p3.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("Is2Loc4",false)){
            p4.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("Is2Loc5",false)){
            p5.setVisibility(View.GONE);
        }


        //OnClickMethods
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midTextView.setText("Villa");
                rightTextView.setText("hello");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.GONE);
                i6.setVisibility(View.GONE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i231.setVisibility(View.GONE);
                i232.setVisibility(View.GONE);
                i233.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midTextView.setText("Temizlik??inin evi");
                rightTextView.setText("hello");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.GONE);
                i6.setVisibility(View.GONE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i231.setVisibility(View.GONE);
                i232.setVisibility(View.GONE);
                i233.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midTextView.setText("Karde??inin evi");
                rightTextView.setText("hello");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.GONE);
                i6.setVisibility(View.GONE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i231.setVisibility(View.GONE);
                i232.setVisibility(View.GONE);
                i233.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midTextView.setText("Yan villa");
                rightTextView.setText("hello");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.GONE);
                i6.setVisibility(View.GONE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i231.setVisibility(View.GONE);
                i232.setVisibility(View.GONE);
                i233.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midTextView.setText("Metresinin evi");
                rightTextView.setText("hello");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i4.setVisibility(View.GONE);
                i5.setVisibility(View.GONE);
                i6.setVisibility(View.GONE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i231.setVisibility(View.GONE);
                i232.setVisibility(View.GONE);
                i233.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midTextView.setText("Sosyal medya");
                rightTextView.setText("hello");
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i4.setVisibility(View.VISIBLE);
                i5.setVisibility(View.VISIBLE);
                i6.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i231.setVisibility(View.GONE);
                i232.setVisibility(View.GONE);
                i233.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i11.setVisibility(View.VISIBLE);
                i12.setVisibility(View.VISIBLE);
                i13.setVisibility(View.VISIBLE);
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Salonda koltuklar televizyon, biblolar ve hal?? var.");
                    i11.setText("Koltuklar?? incele");
                    i12.setText("Tv yi incele");
                    i13.setText("Salonun kalan??n?? incele");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("????inde porselenler olan bir dolap, bir ??ekyat ve " +
                            " sehpa ??zerinde bir televizyon");
                    i11.setText("Dolab?? incele");
                    i12.setText("??ekyat?? incele");
                    i13.setText("Sehpay?? incele");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("2 Salon var biri b??y??k biri k??????k, arada da mutfak var");
                    i11.setText("B??y??k salonu incele");
                    i12.setText("K??????k salonu incele");
                    i13.setText("Mutfa???? incele");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Salon denilebilecek 3 oda var ilki televizyon odas?? iki" +
                            "ncisi misafir odas?? ??????nc??s?? ise TV siz oturma odas??");
                    i11.setText("TV odas??n?? incele");
                    i12.setText("Misafir odas??n?? incele");
                    i13.setText("Oturma odas??n incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Salonda koltuklar televizyon ve televizyon sehpas??" +
                            " var. Mutfak da salona ba??l??");
                    i11.setText("Koltuklar?? incele");
                    i12.setText("Televizyonu incele");
                    i13.setText("Mutfa???? incele");
                }

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i21.setVisibility(View.VISIBLE);
                i22.setVisibility(View.VISIBLE);
                i23.setVisibility(View.VISIBLE);
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Yatak odas??,??ocu??un odas?? ve kamera kay??tlar??n??n" +
                            " oldu??u depo odas?? var");
                    i21.setText("Yatak odas??n?? incele");
                    i22.setText("??ocuk odas??n?? incele");
                    i23.setText("Depo odas??n?? incele");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Tek oda var ayr??ca bir mutfak ve bir banyo da var.");
                    i21.setText("Oday?? incele");
                    i22.setText("Banyoyu incele");
                    i23.setText("Mutfa???? incele");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("3 oda var yatak odas?? ve 2 ??ocuk odas??.");
                    i21.setText("Yatak odas??n?? incele");
                    i22.setText("1. ??ocuk odas??n?? incele");
                    i23.setText("2. ??ocuk odas??n?? incele");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("2 banyo b??y??k bir mutfak ve yatak odas?? var.");
                    i21.setText("Banyolar?? incele");
                    i22.setText("Mutfa???? incele");
                    i23.setText("Yatak odas??n?? incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Kad??n??n odas??,banyo ve karde??inin odas?? var");
                    i21.setText("Kad??n??n ods??n?? incele");
                    i22.setText("Banyonun incele");
                    i23.setText("Erkek karde??in odas?? incele");
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i31.setVisibility(View.VISIBLE);
                i32.setVisibility(View.VISIBLE);
                i33.setVisibility(View.VISIBLE);
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Evin d??????nda geni?? bir bah??e var,bah??edeki ??amurlu" +
                            " alanda bot izi var, evin k??pe??i bo??u??mu?? gibi");
                    i33.setText("Bah??eyi incele");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Apartmanda farkl?? g??r??nen herhangi bir ??ey yok");
                    i33.setText("Apartmandakilerle konu??");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("L??ks sitenin geni?? daireleri olan bir apartman?? ol" +
                            "du??u belli.");
                    i33.setText("Sitedekilerle konu??");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Evin d??????nda ??i??ek yeti??tirilen bir bah??e var." +
                            " Kameralar evin tamam??n?? g??r??yor.");
                    i33.setText("Bah??eyi incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("K??????k bah??esi olan k??????k bir apartman." +
                            " Apartman??n kameras?? yok ancak" +
                            " yan apartmanlar??n giri??i g??ren kameralar?? var");
                    i33.setText("Apartmandakilerle konu??");
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Koltuklar??n alt??nda bir ka?? kutu oyunu d??????nda bir" +
                            " ??ey yok");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Dolapta porselenler ve aile foto??raflar?? var. Bir ka??" +
                            " tane de bardak");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("B??y??k salonda TV,TV ??nitesi ve ses sistemi var bir de" +
                            "??ekyat olmayan koltuklar");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("TV odas??ndaki dolaplar??n biri ??ifreli, ev sahibi i??er" +
                            "isinde 100 y??ll??k bir tabanca oldu??unu manevi de??eri oldu??unu ve g??s" +
                            "teremeyece??ini s??yledi.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Koltuklar??n alt??nda koltuk k??l??f?? ve bir ka?? defter var." +
                            "Bir de erkek karde??in ad??na avc??l??k lisans?? var.");
                }
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Televizyona oyun konsolu ba??l??. ??ekmecede filimler ve" +
                            " oyunlar var.");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("??ekyat??n alt??nda yorgan ve yast??k k??l??flar?? var.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("K??????k bir ka?? koltuk var ve duvarda bir t??fek ve" +
                            " avc??l??kla alakal?? g??rseller var.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Misafir odas??nda duvarda resimler var, koltuklar,TV" +
                            " ve k??????k bir masa var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Televizyona uydu al??c??s?? ba??l??, Televizyonun ??st??nde" +
                            " durdu??u sehpada ba??ka hi?? bir ??ey yok.");
                }
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Hal??n??n alt?? bo??. Biblolarda yabanc?? bir parmak izi yok" +
                            "dolab??n i??inde bir ka?? hat??ra e??yalar ve foto??raflar var.");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Sehpada dikkat ??ekici bir ??ey yok. Televizyona" +
                            " uydu al??c??s?? ba??l??.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Mutfakta beyaz e??yalar, masa ve sandalye var " +
                            "s??rad?????? herhangi bir ??ey yok dolapta " +
                            "d??n ak??amdan kalma yemekler var");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("TV siz oturma odas??nda b??y??k bir kenarda raflar ve raf" +
                            "lar??n ??zerinde ??ok ??e??itli kitaplar var raflar??n ??st??nde tavla var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Sdece beyaz e??yalar ve mutfak malzemeleri var, dolab??n" +
                            " i??i bo??.");
                }
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Yatak odas?? toplu bir halde ve olay yerine ilk gelenler" +
                            "burada herhangi bir kan izine rastlanmad??????n?? s??yl??yor");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Odada minik i??i bo?? bir dolap ve yatak var.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Odan??n k??z ??ocu??una ait oldu??u belli. Onun d??????nda bir" +
                            " ??ey dikkatimi ??ekmiyor.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Banyolarda di?? f??r??as?? tra?? b????a???? gibi" +
                            " olmas?? gereken ??eyler var");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Yatak, dolap ve diz??st?? bilgisayar" +
                            " var bilgisayar??n ge??mi??i silinmi??.");
                }
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("??ocu??un odas??nda her hangi bir bo??u??ma ya da kan izi yok");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Bany??da eski bir du?? ve klozet var, ilgi ??ekici ??eyler" +
                            " de??iller.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("??kinci odada oyuncak tabanca var. San??r??m su?? aletini " +
                            "buldum.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Mutfakta ??e??itli b????aklar, mutfak ara??lar??," +
                            " beyaz e??yalar, mikrodalga f??r??n ve geni?? bir masa var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Banyoda yeni y??kanm???? botlar var. Onun d????????nda s??radan" +
                            " bir banyo.");
                }
            }
        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i231.setVisibility(View.VISIBLE);
                i232.setVisibility(View.VISIBLE);
                i233.setVisibility(View.VISIBLE);
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Depo odas??nda yani burda bulunmu?? ??l??. ??lgin?? bir ??ekilde" +
                            " odan??n ses yal??t??m?? var Bilgisayar sand??k ve ??al????ma" +
                            " masas?? dikkat ??ekiyor");
                    i231.setText("Bilgisayar?? incele");
                    i232.setText("Sand?????? incele");
                    i233.setText("??al????ma masas??n?? incele");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Eldiven kutusu, buzdolab??, meyve dolab?? ve ocakl?? " +
                            " f??r??n var.");
                    i231.setText("Buzdolab??n?? incele");
                    i232.setText("Meyve dolab??n?? incele");
                    i233.setText("F??r??n?? incele");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Yatak odas?? da????n??k bir ??ekilde b??rak??lm????. Dolab??n," +
                            " ??zerinde bir kutu var ve yata????n yan??nda bir ??ekmece var.");
                    i231.setText("Dolab?? incele");
                    i232.setText("Dolab??n ??st??ndeki kutuyu incele");
                    i233.setText("??ekmeceleri incele");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Aynan??n alt??nda k??????k bir ??ekmece, b??y??k bir dolap" +
                            " ve yatak var");
                    i231.setText("Dolab?? incele");
                    i232.setText("??ekmeceyi incele");
                    i233.setText("Yata???? incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Masa??st?? bir bilgisayar, giysi dolab?? ve ??zeri bo?? olan " +
                            "bir silah ask??l?????? var.");
                    i231.setText("Bilgisayar?? incele");
                    i232.setText("Giysi dolab??n?? incele");
                    i233.setText("Silah ask??l??????n?? incele");
                }
            }
        });
        i231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Bilgisayarda kamera kay??tlar?? silinmi??. Kamera kay??tlar??" +
                            "na ??ifreli bir uygulamadan ula????l??yor. Bilgisayar daha ??ok i?? i??in" +
                            " kullan??lm????.");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Buzdolab??nda ??nceki g??nden kalma yiyecekler var.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Dolaptaki giysiler de da????n??k halde. Dolab??n dibinde " +
                            "i?? ile alakal?? belgeler var.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Dolab??n i??ersinden beyzbol sopas?? onlarca az giyilmi?? " +
                            "ayakkab?? tenis raketi ve toplar?? giysiler ve aile yadigar?? e??yalar " +
                            "????kt??.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Bilgisayarda internet ge??mi??i silinmi?? ama harita" +
                            " program??nda d??n ak??am ??l??n??n ev adresine bak??lm????.");
                }
            }
        });
        i232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Sand??kta ??o??u kullan??lm???? ??ama????r suyu var. ??i??enin" +
                            " i??inde bir ??ift k??pek ??ss??r?????? olan eldiven var." +
                            " Onun d??????nda eski giysiler var");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Meyve dolab??nda meyveler ve bir kutu i??inde meyve b??" +
                            "??aklar?? var.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Dolab??n ??zerindeki kutudan tablet kutusu ????kt??. Tablet" +
                            " kutusunu da a????nca i??inden h??yar ????kt??. Evdekilere sorunca internetten" +
                            " ald??k h??yar ????kt?? dediler.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("??ekmecenin i??inde e kitap okuyucu,bir ??ok makyaj " +
                            "malzemesi kad??n ve erkek parf??m?? ve pahal?? g??r??nen bir saat var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Giysi dolab??nda k??yafetler ve spor e??yalar?? d??????nda" +
                            " dikkate de??er bir ??ey yok ama dolab??n yan??ndaki ????p kutusunda i??inde " +
                            "eldivenler olan eldiven kutusu var.");
                }
            }
        });
        i233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("??al????ma masas??nda bir ka?? sa??ma mermisi var, sa??malar??n" +
                            "ait oldu??u silah ortal??kta yok masan??n ??zerinde ??zellikle farede" +
                            " kurumu?? kan var.");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Ocakl?? f??r??nda ekmek k??r??nt??lar?? var, yak??n zamanda " +
                            "ekmek yap??lm????.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("??ekmeceden tarak,??arj aleti, kitap ????kt??.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Yata????n ??zeinde bir ??ey yok ama yan??nda gizlenmi?? ??ek" +
                            "ilde villan??n kameralar??n??n ba??l?? oldu??u bir bilgisayar var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Silah ask??l?????? uzun bir t??fek i??in tasarlanm????. Tahminen" +
                            " av t??fe??i. Odan??n sahibi ge??en hafta silah?? satt??????n?? yenisini" +
                            " alaca????n?? s??yledi.");
                }
            }
        });
        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Kap??n??n kilidi sert bir cisimle a????lm????");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Kamera kay??d??na g??re saat 7 de eve girdikten sonra evden" +
                            " ????kmam???? ev sahibi.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Kamera kay??tlar?? eve 23:30 da girdi??ini g??steriyor.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Kamera kay??tlar?? ev sahibinin dediklerini do??ruluyor. " +
                            "Ayr??ca kar???? villay?? g??ren bir kamera,saat 12 de" +
                            " kap??onlu bir adam??n bah??eye kap??y?? zorlayarak girdi??ini g??steriyor.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Yan apartman??n kamera kayd??na g??re erkek karde??in" +
                            " gece 1 de metresin ise 1 bu??ukta eve d??nd??????n?? g??steriyor");
                }
            }
        });
        i32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Kap??n??n kilidi sert bir cisimle a????lm????.");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Kad??n botu ve terli??i var.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Kap??n??n ??n??nde ayakkab??l??k var i??inde spor ayakkab?? ve" +
                            " topuklu ayakkab??lar var.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Kap??n??n  ??n??nde bir paspas ve bir ka?? spor ayakkab?? var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Ayakkab?? yok ancak ??amurlu bir paspas var.");
                }
            }
        });
        i33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.VISIBLE);
                i332.setVisibility(View.VISIBLE);
                i333.setVisibility(View.VISIBLE);
                if (midTextView.getText().equals("Villa")){
                    i331.setText("??amurlu k??s??m?? incele");
                    i332.setText("D???? kap??y?? incele");
                    i333.setText("Garaj?? incele");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Bah??ede ??amurlu k??s??m, d???? kap?? ve garaj var.");
                    i331.setText("Yan kom??uyla konu??");
                    i332.setText("Alt kom??uyla konu??");
                    i333.setText("??st kom??uyla konu??");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Yan, alt ve ??st kom??ular m??sait olduklar??n?? s??yledi.");
                    i331.setText("Kap??c??yla konu??");
                    i332.setText("Alt katla konu??");
                    i333.setText("G??venlikle konu??");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Site sakinlerinden kap??c?? alt kat ve g??venlik konu??mak" +
                            " istedi");
                    i331.setText("??i??ekleri incele");
                    i332.setText("Mangal alan??n?? incele");
                    i333.setText("Garaj?? incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Kar???? kom??ular d??????nda konu??mak isteyen yok.");
                    i331.setText("??l??y?? sor");
                    i332.setText("Kavga edip etmediklerini sor");
                    i333.setText("Di??er kom??ular??n konu??mamas??n?? sor");
                }
            }
        });
        i331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("??amurlu k??s??mda bot izi var ve ilk incelemeyi yapan" +
                            " polisler burada herhangi bir kayd?? olmayan bir av t??fe??i bulmu??.");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Kar???? kom??usu, temizlik??inin kocas?? ??ld?????? i??in tek " +
                            "ya??ad??????n?? arada ??ocuklar??n??n buraya geldi??ini s??yledi.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Kap??c?? da saat 23:30 da binaya girerken g??rd??????n??" +
                            " s??yledi");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("??i??ekler g??zel kokuyor ve yeni sulanm????lar");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Kom??ular cinayetle alakal?? bir ??ey bilmediklerini" +
                            " s??ylediler");
                }
            }
        });
        i332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("D???? kap?? da sert bir cisimle a????lm????");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("Alt kom??u temizlik??inin g??zel k??s??r yapt?????? d??????nda " +
                            "kayda de??er bilgi vermedi.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("Alt kom??u ??l??y?? ??ok uzun s??redir g??rmedi??ini ayr??ca " +
                            "neden anla??amad??klar??n?? da bilmedi??ini s??yledi. Karde??inin sinirli biri" +
                            " olmad??????n?? da s??yledi.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Her t??rl?? et t??ketilmi?? gibi duruyor.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Kom??ular??, karde??lerin ??ok kavga ettiklerini ama" +
                            " birbirlerine ??iddet uygulad??klar??n?? g??rmediklerini s??yledi.");
                }
            }
        });
        i333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Garajda 2 araba var. Herhangi bir zorlama yok arabalar" +
                            " ??al??nmaya ??al??????lmam????.");
                }
                else if (midTextView.getText().equals("Temizlik??inin evi")){
                    rightTextView.setText("??st kom??u, kom??usunun kar??ncay?? bile incitmeyecek " +
                            "birisi oldu??unu s??yledi.");
                }
                else if (midTextView.getText().equals("Karde??inin evi")){
                    rightTextView.setText("G??venlik kamera saatlerinin do??ru oldu??una emin oldu??unu" +
                            " ve 23 den sonra ??l??n??n karde??inin siteye giri??ini g??rd??????n?? s??yledi.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Garajda spor araba ve SUV var. Arabalar d??????nda bir ??ok" +
                            " tamir aletleri ve bir jenerat??r var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Sizin d??????n??zda neden kimse konu??mad?? diye sordu??umda" +
                            " kar???? kom??unun ??ok kavgaya meyilli oldu??unu ve di??er kom??ular??n da" +
                            " biraz t??rsak oldu??unu s??ylediler.");
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightTextView.setText("Linkedinde en son 3 g??n ??nce g??nderi payla??m????. Mesajlarda" +
                        " cinayetle ba??lant??l?? olabilecek bir ??ey yok.");
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightTextView.setText("Twitterda en son 11:45 de metresiyle yaz????m????. Metresin" +
                        " yazd??klar??ndan endi??eli oldu??u anla????l??yor.");
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightTextView.setText("Saat 10 gibi kar??s??na mesaj atm???? ondan sonra sadece g??ve" +
                        "nli??e gol oldu diye bir mesaj atm????.");
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
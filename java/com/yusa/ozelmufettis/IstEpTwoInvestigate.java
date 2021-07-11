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
                midTextView.setText("Temizlikçinin evi");
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
                midTextView.setText("Kardeşinin evi");
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
                    rightTextView.setText("Salonda koltuklar televizyon, biblolar ve halı var.");
                    i11.setText("Koltukları incele");
                    i12.setText("Tv yi incele");
                    i13.setText("Salonun kalanını incele");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("İçinde porselenler olan bir dolap, bir çekyat ve " +
                            " sehpa üzerinde bir televizyon");
                    i11.setText("Dolabı incele");
                    i12.setText("Çekyatı incele");
                    i13.setText("Sehpayı incele");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("2 Salon var biri büyük biri küçük, arada da mutfak var");
                    i11.setText("Büyük salonu incele");
                    i12.setText("Küçük salonu incele");
                    i13.setText("Mutfağı incele");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Salon denilebilecek 3 oda var ilki televizyon odası iki" +
                            "ncisi misafir odası üçüncüsü ise TV siz oturma odası");
                    i11.setText("TV odasını incele");
                    i12.setText("Misafir odasını incele");
                    i13.setText("Oturma odasın incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Salonda koltuklar televizyon ve televizyon sehpası" +
                            " var. Mutfak da salona bağlı");
                    i11.setText("Koltukları incele");
                    i12.setText("Televizyonu incele");
                    i13.setText("Mutfağı incele");
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
                    rightTextView.setText("Yatak odası,çocuğun odası ve kamera kayıtlarının" +
                            " olduğu depo odası var");
                    i21.setText("Yatak odasını incele");
                    i22.setText("Çocuk odasını incele");
                    i23.setText("Depo odasını incele");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Tek oda var ayrıca bir mutfak ve bir banyo da var.");
                    i21.setText("Odayı incele");
                    i22.setText("Banyoyu incele");
                    i23.setText("Mutfağı incele");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("3 oda var yatak odası ve 2 çocuk odası.");
                    i21.setText("Yatak odasını incele");
                    i22.setText("1. çocuk odasını incele");
                    i23.setText("2. çocuk odasını incele");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("2 banyo büyük bir mutfak ve yatak odası var.");
                    i21.setText("Banyoları incele");
                    i22.setText("Mutfağı incele");
                    i23.setText("Yatak odasını incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Kadının odası,banyo ve kardeşinin odası var");
                    i21.setText("Kadının odsını incele");
                    i22.setText("Banyonun incele");
                    i23.setText("Erkek kardeşin odası incele");
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
                    rightTextView.setText("Evin dışında geniş bir bahçe var,bahçedeki çamurlu" +
                            " alanda bot izi var, evin köpeği boğuşmuş gibi");
                    i33.setText("Bahçeyi incele");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Apartmanda farklı görünen herhangi bir şey yok");
                    i33.setText("Apartmandakilerle konuş");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Lüks sitenin geniş daireleri olan bir apartmanı ol" +
                            "duğu belli.");
                    i33.setText("Sitedekilerle konuş");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Evin dışında çiçek yetiştirilen bir bahçe var." +
                            " Kameralar evin tamamını görüyor.");
                    i33.setText("Bahçeyi incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Küçük bahçesi olan küçük bir apartman." +
                            " Apartmanın kamerası yok ancak" +
                            " yan apartmanların girişi gören kameraları var");
                    i33.setText("Apartmandakilerle konuş");
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Koltukların altında bir kaç kutu oyunu dışında bir" +
                            " şey yok");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Dolapta porselenler ve aile fotoğrafları var. Bir kaç" +
                            " tane de bardak");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Büyük salonda TV,TV ünitesi ve ses sistemi var bir de" +
                            "çekyat olmayan koltuklar");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("TV odasındaki dolapların biri şifreli, ev sahibi içer" +
                            "isinde 100 yıllık bir tabanca olduğunu manevi değeri olduğunu ve gös" +
                            "teremeyeceğini söyledi.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Koltukların altında koltuk kılıfı ve bir kaç defter var." +
                            "Bir de erkek kardeşin adına avcılık lisansı var.");
                }
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Televizyona oyun konsolu bağlı. Çekmecede filimler ve" +
                            " oyunlar var.");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Çekyatın altında yorgan ve yastık kılıfları var.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Küçük bir kaç koltuk var ve duvarda bir tüfek ve" +
                            " avcılıkla alakalı görseller var.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Misafir odasında duvarda resimler var, koltuklar,TV" +
                            " ve küçük bir masa var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Televizyona uydu alıcısı bağlı, Televizyonun üstünde" +
                            " durduğu sehpada başka hiç bir şey yok.");
                }
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Halının altı boş. Biblolarda yabancı bir parmak izi yok" +
                            "dolabın içinde bir kaç hatıra eşyalar ve fotoğraflar var.");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Sehpada dikkat çekici bir şey yok. Televizyona" +
                            " uydu alıcısı bağlı.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Mutfakta beyaz eşyalar, masa ve sandalye var " +
                            "sıradışı herhangi bir şey yok dolapta " +
                            "dün akşamdan kalma yemekler var");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("TV siz oturma odasında büyük bir kenarda raflar ve raf" +
                            "ların üzerinde çok çeşitli kitaplar var rafların üstünde tavla var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Sdece beyaz eşyalar ve mutfak malzemeleri var, dolabın" +
                            " içi boş.");
                }
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Yatak odası toplu bir halde ve olay yerine ilk gelenler" +
                            "burada herhangi bir kan izine rastlanmadığını söylüyor");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Odada minik içi boş bir dolap ve yatak var.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Odanın kız çocuğuna ait olduğu belli. Onun dışında bir" +
                            " şey dikkatimi çekmiyor.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Banyolarda diş fırçası traş bıçağı gibi" +
                            " olması gereken şeyler var");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Yatak, dolap ve dizüstü bilgisayar" +
                            " var bilgisayarın geçmişi silinmiş.");
                }
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Çocuğun odasında her hangi bir boğuşma ya da kan izi yok");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Banyıda eski bir duş ve klozet var, ilgi çekici şeyler" +
                            " değiller.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("İkinci odada oyuncak tabanca var. Sanırım suç aletini " +
                            "buldum.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Mutfakta çeşitli bıçaklar, mutfak araçları," +
                            " beyaz eşyalar, mikrodalga fırın ve geniş bir masa var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Banyoda yeni yıkanmış botlar var. Onun dıışında sıradan" +
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
                    rightTextView.setText("Depo odasında yani burda bulunmuş ölü. İlginç bir şekilde" +
                            " odanın ses yalıtımı var Bilgisayar sandık ve çalışma" +
                            " masası dikkat çekiyor");
                    i231.setText("Bilgisayarı incele");
                    i232.setText("Sandığı incele");
                    i233.setText("Çalışma masasını incele");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Eldiven kutusu, buzdolabı, meyve dolabı ve ocaklı " +
                            " fırın var.");
                    i231.setText("Buzdolabını incele");
                    i232.setText("Meyve dolabını incele");
                    i233.setText("Fırını incele");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Yatak odası dağınık bir şekilde bırakılmış. Dolabın," +
                            " üzerinde bir kutu var ve yatağın yanında bir çekmece var.");
                    i231.setText("Dolabı incele");
                    i232.setText("Dolabın üstündeki kutuyu incele");
                    i233.setText("Çekmeceleri incele");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Aynanın altında küçük bir çekmece, büyük bir dolap" +
                            " ve yatak var");
                    i231.setText("Dolabı incele");
                    i232.setText("Çekmeceyi incele");
                    i233.setText("Yatağı incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Masaüstü bir bilgisayar, giysi dolabı ve üzeri boş olan " +
                            "bir silah askılığı var.");
                    i231.setText("Bilgisayarı incele");
                    i232.setText("Giysi dolabını incele");
                    i233.setText("Silah askılığını incele");
                }
            }
        });
        i231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Bilgisayarda kamera kayıtları silinmiş. Kamera kayıtları" +
                            "na şifreli bir uygulamadan ulaşılıyor. Bilgisayar daha çok iş için" +
                            " kullanılmış.");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Buzdolabında önceki günden kalma yiyecekler var.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Dolaptaki giysiler de dağınık halde. Dolabın dibinde " +
                            "iş ile alakalı belgeler var.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Dolabın içersinden beyzbol sopası onlarca az giyilmiş " +
                            "ayakkabı tenis raketi ve topları giysiler ve aile yadigarı eşyalar " +
                            "çıktı.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Bilgisayarda internet geçmişi silinmiş ama harita" +
                            " programında dün akşam ölünün ev adresine bakılmış.");
                }
            }
        });
        i232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Sandıkta çoğu kullanılmış çamaşır suyu var. Şişenin" +
                            " içinde bir çift köpek ıssırığı olan eldiven var." +
                            " Onun dışında eski giysiler var");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Meyve dolabında meyveler ve bir kutu içinde meyve bı" +
                            "çakları var.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Dolabın üzerindeki kutudan tablet kutusu çıktı. Tablet" +
                            " kutusunu da açınca içinden hıyar çıktı. Evdekilere sorunca internetten" +
                            " aldık hıyar çıktı dediler.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Çekmecenin içinde e kitap okuyucu,bir çok makyaj " +
                            "malzemesi kadın ve erkek parfümü ve pahalı görünen bir saat var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Giysi dolabında kıyafetler ve spor eşyaları dışında" +
                            " dikkate değer bir şey yok ama dolabın yanındaki çöp kutusunda içinde " +
                            "eldivenler olan eldiven kutusu var.");
                }
            }
        });
        i233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Çalışma masasında bir kaç saçma mermisi var, saçmaların" +
                            "ait olduğu silah ortalıkta yok masanın üzerinde özellikle farede" +
                            " kurumuş kan var.");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Ocaklı fırında ekmek kırıntıları var, yakın zamanda " +
                            "ekmek yapılmış.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Çekmeceden tarak,şarj aleti, kitap çıktı.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Yatağın üzeinde bir şey yok ama yanında gizlenmiş şek" +
                            "ilde villanın kameralarının bağlı olduğu bir bilgisayar var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Silah askılığı uzun bir tüfek için tasarlanmış. Tahminen" +
                            " av tüfeği. Odanın sahibi geçen hafta silahı sattığını yenisini" +
                            " alacağını söyledi.");
                }
            }
        });
        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Kapının kilidi sert bir cisimle açılmış");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Kamera kayıdına göre saat 7 de eve girdikten sonra evden" +
                            " çıkmamış ev sahibi.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Kamera kayıtları eve 23:30 da girdiğini gösteriyor.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Kamera kayıtları ev sahibinin dediklerini doğruluyor. " +
                            "Ayrıca karşı villayı gören bir kamera,saat 12 de" +
                            " kapşonlu bir adamın bahçeye kapıyı zorlayarak girdiğini gösteriyor.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Yan apartmanın kamera kaydına göre erkek kardeşin" +
                            " gece 1 de metresin ise 1 buçukta eve döndüğünü gösteriyor");
                }
            }
        });
        i32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Kapının kilidi sert bir cisimle açılmış.");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Kadın botu ve terliği var.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Kapının önünde ayakkabılık var içinde spor ayakkabı ve" +
                            " topuklu ayakkabılar var.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Kapının  önünde bir paspas ve bir kaç spor ayakkabı var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Ayakkabı yok ancak çamurlu bir paspas var.");
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
                    i331.setText("Çamurlu kısımı incele");
                    i332.setText("Dış kapıyı incele");
                    i333.setText("Garajı incele");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Bahçede çamurlu kısım, dış kapı ve garaj var.");
                    i331.setText("Yan komşuyla konuş");
                    i332.setText("Alt komşuyla konuş");
                    i333.setText("Üst komşuyla konuş");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Yan, alt ve üst komşular müsait olduklarını söyledi.");
                    i331.setText("Kapıcıyla konuş");
                    i332.setText("Alt katla konuş");
                    i333.setText("Güvenlikle konuş");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Site sakinlerinden kapıcı alt kat ve güvenlik konuşmak" +
                            " istedi");
                    i331.setText("Çiçekleri incele");
                    i332.setText("Mangal alanını incele");
                    i333.setText("Garajı incele");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Karşı komşular dışında konuşmak isteyen yok.");
                    i331.setText("Ölüyü sor");
                    i332.setText("Kavga edip etmediklerini sor");
                    i333.setText("Diğer komşuların konuşmamasını sor");
                }
            }
        });
        i331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Çamurlu kısımda bot izi var ve ilk incelemeyi yapan" +
                            " polisler burada herhangi bir kaydı olmayan bir av tüfeği bulmuş.");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Karşı komşusu, temizlikçinin kocası öldüğü için tek " +
                            "yaşadığını arada çocuklarının buraya geldiğini söyledi.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Kapıcı da saat 23:30 da binaya girerken gördüğünü" +
                            " söyledi");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Çiçekler güzel kokuyor ve yeni sulanmışlar");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Komşular cinayetle alakalı bir şey bilmediklerini" +
                            " söylediler");
                }
            }
        });
        i332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Dış kapı da sert bir cisimle açılmış");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Alt komşu temizlikçinin güzel kısır yaptığı dışında " +
                            "kayda değer bilgi vermedi.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Alt komşu ölüyü çok uzun süredir görmediğini ayrıca " +
                            "neden anlaşamadıklarını da bilmediğini söyledi. Kardeşinin sinirli biri" +
                            " olmadığını da söyledi.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Her türlü et tüketilmiş gibi duruyor.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Komşuları, kardeşlerin çok kavga ettiklerini ama" +
                            " birbirlerine şiddet uyguladıklarını görmediklerini söyledi.");
                }
            }
        });
        i333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midTextView.getText().equals("Villa")){
                    rightTextView.setText("Garajda 2 araba var. Herhangi bir zorlama yok arabalar" +
                            " çalınmaya çalışılmamış.");
                }
                else if (midTextView.getText().equals("Temizlikçinin evi")){
                    rightTextView.setText("Üst komşu, komşusunun karıncayı bile incitmeyecek " +
                            "birisi olduğunu söyledi.");
                }
                else if (midTextView.getText().equals("Kardeşinin evi")){
                    rightTextView.setText("Güvenlik kamera saatlerinin doğru olduğuna emin olduğunu" +
                            " ve 23 den sonra ölünün kardeşinin siteye girişini gördüğünü söyledi.");
                }
                else if (midTextView.getText().equals("Yan villa")){
                    rightTextView.setText("Garajda spor araba ve SUV var. Arabalar dışında bir çok" +
                            " tamir aletleri ve bir jeneratör var.");
                }
                else if (midTextView.getText().equals("Metresinin evi")){
                    rightTextView.setText("Sizin dışınızda neden kimse konuşmadı diye sorduğumda" +
                            " karşı komşunun çok kavgaya meyilli olduğunu ve diğer komşuların da" +
                            " biraz tırsak olduğunu söylediler.");
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightTextView.setText("Linkedinde en son 3 gün önce gönderi paylaşmış. Mesajlarda" +
                        " cinayetle bağlantılı olabilecek bir şey yok.");
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightTextView.setText("Twitterda en son 11:45 de metresiyle yazışmış. Metresin" +
                        " yazdıklarından endişeli olduğu anlaşılıyor.");
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightTextView.setText("Saat 10 gibi karısına mesaj atmış ondan sonra sadece güve" +
                        "nliğe gol oldu diye bir mesaj atmış.");
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
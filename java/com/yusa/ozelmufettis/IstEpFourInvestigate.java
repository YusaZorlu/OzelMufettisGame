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

public class IstEpFourInvestigate extends AppCompatActivity {
    TextView textViewM;
    TextView textViewR;
    Button p1;
    Button p2;
    Button p3;
    Button p4;
    Button p5;
    Button p6;
    Button p7;
    Button i1;
    Button i2;
    Button i3;
    Button i11;
    Button i12;
    Button i13;
    Button i11x;
    Button i131;
    Button i132;
    Button i133;
    Button i21;
    Button i22;
    Button i23;
    Button i211;
    Button i212;
    Button i213;
    Button i2121;
    Button i2122;
    Button i2123;
    Button i221;
    Button i222;
    Button i223;
    Button i2221;
    Button i2222;
    Button i2223;
    Button i23x;
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
        setContentView(R.layout.activity_ist_ep_four_investigate);
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
        textViewR = findViewById(R.id.textViewR3);
        textViewM = findViewById(R.id.textViewM6);
        p1 = findViewById(R.id.is4p1);
        p2 = findViewById(R.id.is4p2);
        p3 = findViewById(R.id.is4p3);
        p4 = findViewById(R.id.is4p4);
        p5 = findViewById(R.id.is4p5);
        p6 = findViewById(R.id.is4p6);
        p7 = findViewById(R.id.is4p7);



        i1 = findViewById(R.id.is4i1);
        i2 = findViewById(R.id.is4i2);
        i3 = findViewById(R.id.is4i3);
        i11 = findViewById(R.id.is4i11);
        i12 = findViewById(R.id.is4i12);
        i13 = findViewById(R.id.is4i13);
        i11x = findViewById(R.id.is4i11x);
        i21 = findViewById(R.id.is4i21);
        i22 = findViewById(R.id.is4i22);
        i23 = findViewById(R.id.is4i23);
        i211 = findViewById(R.id.is4i211);
        i212 = findViewById(R.id.is4i212);
        i213 = findViewById(R.id.is4i213);
        i2121 = findViewById(R.id.is4i2121);
        i2122 = findViewById(R.id.is4i2122);
        i2123 = findViewById(R.id.is4i2123);
        i221 = findViewById(R.id.is4i221);
        i222 = findViewById(R.id.is4i222);
        i223 = findViewById(R.id.is4i223);
        i2221 = findViewById(R.id.is4i2221);
        i2222 = findViewById(R.id.is4i2222);
        i2223 = findViewById(R.id.is4i2223);
        i23x = findViewById(R.id.is4i23x);
        i131 = findViewById(R.id.is4i131);
        i132 = findViewById(R.id.is4i132);
        i133 = findViewById(R.id.is4i133);
        i31 = findViewById(R.id.is4i31);
        i32 = findViewById(R.id.is4i32);
        i33 = findViewById(R.id.is4i33);
        i331 = findViewById(R.id.is4i331);
        i332 = findViewById(R.id.is4i332);
        i333 = findViewById(R.id.is4i333);

        //Onclick methods

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Olay yeri");
                textViewR.setText("Olay yerini inceleyeyim.");
                i1.setText("Sokağı incele");
                i2.setText("Kamera kayıtlarını iste");
                i3.setText("Çevredekilerle konuş");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i11x.setVisibility(View.GONE);
                i131.setVisibility(View.GONE);
                i132.setVisibility(View.GONE);
                i133.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i211.setVisibility(View.GONE);
                i212.setVisibility(View.GONE);
                i213.setVisibility(View.GONE);
                i2121.setVisibility(View.GONE);
                i2122.setVisibility(View.GONE);
                i2123.setVisibility(View.GONE);
                i221.setVisibility(View.GONE);
                i222.setVisibility(View.GONE);
                i223.setVisibility(View.GONE);
                i2221.setVisibility(View.GONE);
                i2222.setVisibility(View.GONE);
                i2223.setVisibility(View.GONE);
                i23x.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Falcının evi");
                textViewR.setText("Ölünün evini inceleyeyim.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odasını incele");
                i3.setText("Bina dışını incele");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i11x.setVisibility(View.GONE);
                i131.setVisibility(View.GONE);
                i132.setVisibility(View.GONE);
                i133.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i211.setVisibility(View.GONE);
                i212.setVisibility(View.GONE);
                i213.setVisibility(View.GONE);
                i2121.setVisibility(View.GONE);
                i2122.setVisibility(View.GONE);
                i2123.setVisibility(View.GONE);
                i221.setVisibility(View.GONE);
                i222.setVisibility(View.GONE);
                i223.setVisibility(View.GONE);
                i2221.setVisibility(View.GONE);
                i2222.setVisibility(View.GONE);
                i2223.setVisibility(View.GONE);
                i23x.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Bakkal");
                textViewR.setText("Bakkalı inceleyeyim.");
                i1.setText("Kasayı ve rafları incele");
                i2.setText("Dükkanın önünü incele");
                i3.setText("Kasanın arkasını incele");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i11x.setVisibility(View.GONE);
                i131.setVisibility(View.GONE);
                i132.setVisibility(View.GONE);
                i133.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i211.setVisibility(View.GONE);
                i212.setVisibility(View.GONE);
                i213.setVisibility(View.GONE);
                i2121.setVisibility(View.GONE);
                i2122.setVisibility(View.GONE);
                i2123.setVisibility(View.GONE);
                i221.setVisibility(View.GONE);
                i222.setVisibility(View.GONE);
                i223.setVisibility(View.GONE);
                i2221.setVisibility(View.GONE);
                i2222.setVisibility(View.GONE);
                i2223.setVisibility(View.GONE);
                i23x.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Yeğeninin evi");
                textViewR.setText("Ölünün yeğeninin evini inceleyeyim.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odasını incele");
                i3.setText("Bina dışını incele");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i11x.setVisibility(View.GONE);
                i131.setVisibility(View.GONE);
                i132.setVisibility(View.GONE);
                i133.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i211.setVisibility(View.GONE);
                i212.setVisibility(View.GONE);
                i213.setVisibility(View.GONE);
                i2121.setVisibility(View.GONE);
                i2122.setVisibility(View.GONE);
                i2123.setVisibility(View.GONE);
                i221.setVisibility(View.GONE);
                i222.setVisibility(View.GONE);
                i223.setVisibility(View.GONE);
                i2221.setVisibility(View.GONE);
                i2222.setVisibility(View.GONE);
                i2223.setVisibility(View.GONE);
                i23x.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("S. fal baktıranın evi");
                textViewR.setText("Sabah fal baktırmış. Şimdi ben senin evine bakacağım.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odasını incele");
                i3.setText("Bina dışını incele");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i11x.setVisibility(View.GONE);
                i131.setVisibility(View.GONE);
                i132.setVisibility(View.GONE);
                i133.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i211.setVisibility(View.GONE);
                i212.setVisibility(View.GONE);
                i213.setVisibility(View.GONE);
                i2121.setVisibility(View.GONE);
                i2122.setVisibility(View.GONE);
                i2123.setVisibility(View.GONE);
                i221.setVisibility(View.GONE);
                i222.setVisibility(View.GONE);
                i223.setVisibility(View.GONE);
                i2221.setVisibility(View.GONE);
                i2222.setVisibility(View.GONE);
                i2223.setVisibility(View.GONE);
                i23x.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Ö. fal baktıranın evi");
                textViewR.setText("Olay yerini inceleyeyim.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odasını incele");
                i3.setText("Bina dışını incele");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i11x.setVisibility(View.GONE);
                i131.setVisibility(View.GONE);
                i132.setVisibility(View.GONE);
                i133.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i211.setVisibility(View.GONE);
                i212.setVisibility(View.GONE);
                i213.setVisibility(View.GONE);
                i2121.setVisibility(View.GONE);
                i2122.setVisibility(View.GONE);
                i2123.setVisibility(View.GONE);
                i221.setVisibility(View.GONE);
                i222.setVisibility(View.GONE);
                i223.setVisibility(View.GONE);
                i2221.setVisibility(View.GONE);
                i2222.setVisibility(View.GONE);
                i2223.setVisibility(View.GONE);
                i23x.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("İ. fal baktıranın evi");
                textViewR.setText("Olay yerini inceleyeyim.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odasını incele");
                i3.setText("Bina dışını incele");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i11x.setVisibility(View.GONE);
                i131.setVisibility(View.GONE);
                i132.setVisibility(View.GONE);
                i133.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i211.setVisibility(View.GONE);
                i212.setVisibility(View.GONE);
                i213.setVisibility(View.GONE);
                i2121.setVisibility(View.GONE);
                i2122.setVisibility(View.GONE);
                i2123.setVisibility(View.GONE);
                i221.setVisibility(View.GONE);
                i222.setVisibility(View.GONE);
                i223.setVisibility(View.GONE);
                i2221.setVisibility(View.GONE);
                i2222.setVisibility(View.GONE);
                i2223.setVisibility(View.GONE);
                i23x.setVisibility(View.GONE);
                i31.setVisibility(View.GONE);
                i32.setVisibility(View.GONE);
                i33.setVisibility(View.GONE);
                i331.setVisibility(View.GONE);
                i332.setVisibility(View.GONE);
                i333.setVisibility(View.GONE);
            }
        });
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Place3",false)){
            p3.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Place4",false)){
            p4.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Place5",false)){
            p5.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Place6",false)){
            p6.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Place7",false)){
            p7.setVisibility(View.GONE);
        }
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.GONE);
                i3.setVisibility(View.GONE);
                i11.setVisibility(View.VISIBLE);
                i12.setVisibility(View.VISIBLE);
                i13.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Sokak merkezi sayılabilecek ancak fakir bir mahallede.Etrafta" +
                            "gecekondular ve market var.");
                    i11.setText("Dükkanı incele");
                    i12.setText("Gecekonduları incele");
                    i13.setText("Çöpü incele");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Salonda TV, TV sehpası, koltuklar ve tek bir dolap var");
                    i11.setText("TV sehpasını incele");
                    i12.setText("Koltukları incele");
                    i13.setText("Dolabı incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Kasa sıradan bir market kasası. Raflarda ise mahalle arası" +
                            " bir markette olan yiyecek içecek ve şarkuteri var.");
                    i11.setText("Kasayı incele");
                    i12.setText("Rafların doluluğunu incele");
                    i13.setText("Rafların içeriğini incele");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Salonda sadece 2 kanepe ve bir tekerlekli sehpa var.");
                    i11.setText("Kanepeleri incele");
                    i12.setText("Sehpayı incele");
                    i13.setText("Mutfağı incele");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Salonla mutfak iç içe. Salonda TV, koltuklar, oyun konsolu ve yemek" +
                            " masası var. ");
                    i11.setText("Tv ve oyun konsolunu incele");
                    i12.setText("Koltukları incele");
                    i13.setText("Mutfak kısmını incele");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Salon büyük ve şaşalı. İçerisinde bir sürü lüks eşya var. Tv" +
                            " ünitesinin rafları var ayrıca " +
                            "bir komidin ve süs eşyaları olan bir dolap var.");
                    i11.setText("TV ünitesini incele");
                    i12.setText("Komidini incele");
                    i13.setText("Dolabı incele");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Salonda koltuklar, TV ünitesi, masa ve sandalyeler var.");
                    i11.setText("Koltukları incele");
                    i12.setText("Tv ünitesini incele");
                    i13.setText("Masanın üzerini incele");
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
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Sokaktaki dükkanın çöpü gören bir kamera var iki kamera da" +
                            " sokak girişini ve çıkışını görüyor. Kamera kayıtlarını incelemek için" +
                            " sahibinden istemek lazım.");
                    i21.setText("Çöpü gören kamerayı incele");
                    i22.setText("Sokak girişini gören kamerayı incele");
                    i23.setText("Sokak çıkışını gören kamerayı incele");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Yatak odasında diz üstü bilgisayar, dolap ve yatak var.");
                    i21.setText("Diz üstü bilgisayarı incele");
                    i22.setText("Dolabı incele");
                    i23.setText("Yatağı incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    i21.setVisibility(View.GONE);
                    i22.setVisibility(View.GONE);
                    i23.setVisibility(View.GONE);
                    textViewR.setText("Dükkanın önünde bir masa var. Masanın üzerinde tavla yanında" +
                            " ise tabureler var.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Yatak odasında tek kişilik yatak, dolap ve çekmeceler var.");
                    i21.setText("Yatağı incele");
                    i22.setText("Dolabı incele");
                    i23.setText("Çekmeceleri incele");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Yatak odasında yatak ve dolap var. Bir de eksik ölçen bir tartı" +
                            "Yatak odası dışında çocukların odası ve banyo var.");
                    i21.setText("Dolabı incele");
                    i22.setText("Çocukların odasını incele");
                    i23.setText("Banyoyu incele");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Yatak odasında bir dolap, bir yatak ve çekmece var.");
                    i21.setText("Dolabı incele");
                    i22.setText("Yatağı incele");
                    i23.setText("Çekmeceyi incele");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Yatak odasında yatak dolap ve bir de çelik kasa var.");
                    i21.setText("Çelik kasayı incele");
                    i22.setText("Yatağı incele");
                    i23.setText("Dolabı incele");
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
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Dükkanın sahibi ve iki gecekondu sakini konuşmak istedi.");
                    i31.setText("Dükkan sahibi");
                    i32.setText("Aşşağı sokaktaki sakin");
                    i33.setText("Yan sokaktaki sakin");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Bina her katında bir daire olan ortalama bir apartman");
                    i31.setText("Apartmanın bahçesini incele");
                    i32.setText("Daire önlerini incele");
                    i33.setText("Apartmanın içini incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Kasanın arkasında bir kapı var ve arkasındaki koridor 3 " +
                            "ayrı odaya bağlanıyor.");
                    i31.setText("İlk odayı incele");
                    i32.setText("İkinci odayı incele");
                    i33.setText("Üçüncü odayı incele");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Apartman büyük bir sitenin içerisinde . Sitenin garajında " +
                            "şüphelinin arabası var.");
                    i31.setText("Site kameralarını incele");
                    i32.setText("Site sakinleriyle konuş");
                    i33.setText("Şüphelinin arabasını incelele");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Apartmanın dışında kamera yok. Normal bir apartman ve" +
                            " apartmanın önünde şüphelinin aile arabası var");
                    i31.setText("Apartmanın içini incele");
                    i32.setText("Komşularla konuş");
                    i33.setText("Aile arabasını incele");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Apartmanda ilgi çekici bir şey yok. Şüphelinin komşuları" +
                            " konuşmak istemiyor.Apartmanın girişinde iki kamera var. " +
                            "Şüphelinin arabası apartmanın önünde.");
                    i31.setText("Kameraları incele");
                    i32.setText("Arabanın bagajını incele");
                    i33.setText("Arabanın içini incele");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Apartman, lüks sayılabilecek bir apartman.Şüphelinin arabası" +
                            " yok ancak komşuları şüpheli hakkında konuşmaya uygun.");
                    i31.setText("Karşı komşuyla kısaca konuş");
                    i32.setText("Alt komşuyla  kısaca konuş");
                    i33.setText("Üst komşuyla kısaca konuş");
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i11x.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Küçük sıradan bir dükkan. Dışarda görülen kameralar buranın.");
                    i11x.setText("Kamera kayıtlarını iste");

                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Tv sehpasında uydu alıcı TV var. Onlar dışında bir de ajanda " +
                            "var.");
                    i11x.setText("Ajandayı incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Kasaının içerisinde çok fazla olmayan bir miktar para var");
                    i11x.setText("Parayı say");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Kanepeler eski ancak kaliteli. Üzerinde bir şey yok ama " +
                            "altında geniş boşluk var.");
                    i11x.setText("Kanepenin altına bak");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("TV ve oyun konsolunda farklı bir şey yok. Sadece kablolar " +
                            "biraz karışık.");
                    i11x.setText("Oyunları incele");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Tv ünitesinin raflarında bir çok film var. Ayrıca güzel bir" +
                            " doğa resmi de var.");
                    i11x.setText("Filmleri incele");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Koltukların üzerinde örtü var. İçinde ve altında bir şey yok.");
                    i11.setVisibility(View.VISIBLE);
                    i12.setVisibility(View.VISIBLE);
                    i13.setVisibility(View.VISIBLE);
                    i11x.setVisibility(View.GONE);

                }
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Gecekonduların neredeyse hepsi boşaltılmış. Galiba yakında" +
                            " burası da kentsel dönüşüme girecek.");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Koltuklarda koltuk örtüsü ve yastıklar var." +
                            " Koltuğa kahve dökülmüş");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Gıda rafları hariç diğer raflar neredeyse tamamen boş.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Sehpanın üzerinde telefon şarj aleti ve kulaklık bırakılmış");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Koltukları açınca içinden aile fotoğrafları ve bir sürü kablo" +
                            " çıktı.");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Komidinin üzerinde ce raflarında" +
                            " farklı farklı avcılık malzemeleri var");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("TV ünitesinde bol bol aşk filmleri ve kendini geliştirme " +
                            "kitapları var.");
                }
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Normal belediye çöpü. Cesedi polisler almış.");
                    i131.setText("Otopsi sonucunu iste");
                    i132.setText("Ölünün üstündeki dna testi sonuçlarını iste");
                    i133.setText("Ölüden çıkanları incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i131.setVisibility(View.VISIBLE);
                    i132.setVisibility(View.VISIBLE);
                    i133.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Dolapta biblolar,küçük çelik bir kasa ve kumanda var.");
                    i131.setText("Bibloları incele.");
                    i132.setText("Çelik kasayı incele");
                    i133.setText("Kumandanın ne işe yaradığını incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i131.setVisibility(View.VISIBLE);
                    i132.setVisibility(View.VISIBLE);
                    i133.setVisibility(View.VISIBLE);

                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Rafların içeriği genel olarak gıda ürünleri ancak bir kaç" +
                            " kırtasiye ürünü de var.");

                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Mutfakta küçük bir buzdolabı var. Buzdolabı içinde yumurta ve" +
                            " hazır gıdalar var.");

                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Mutfak kısmında beyaz eşyalar ve dolaplar var");
                    i131.setText("Buzdolabını incele");
                    i132.setText("Bulaşık makinasini incele");
                    i133.setText("Dolapları incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i131.setVisibility(View.VISIBLE);
                    i132.setVisibility(View.VISIBLE);
                    i133.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Dolaptaki süs eşyalarının hepsi av hayvanları ile ilgili" +
                            " ya da avlanmış hayvanların kürkünden yapılma.");

                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Masanın üzerinde çiçekler ve süsler var. Süslerin bazılarında" +
                            " yüksek enerji veren şekiller varmış diyor şüpheli.");
                }
            }
        });
        i11x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Dükkandan kamera kayıtlarını istedim dükkan sahibi de" +
                            " kayıtları verdi.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().
                            putBoolean("is4Cam",true).apply();
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Ajandada dün için üç müşterinin ismi var. Üçü de net " +
                            "kadın isimleri.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Suspect678",false)){
                        Toast.makeText(IstEpFourInvestigate.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().
                            putBoolean("Is4Suspect678",true).apply();

                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Kasada 175 lira civarı para var.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Kanepenin altında kilitli bir evrak çantası var. Şüpheliye" +
                            " sorunca açamam içinde iş belgeleri var ancak dedektörden geçirebiliriz" +
                            " dedi.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Oyunların tamamı futbol oyunu. Her yıl almışlar.");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Filmlerin türü çoğunlukla hayatta kalma türü.");
                }
            }
        });
        i131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Adli tıp raporuna göre dün öldürülmüş. Ölüm sebebi kan kaybı" +
                            " ve ölünün bedeninde bıçaklandığına dair izler var.");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Biblolar filli biblolardan ancak dandik gibi gözüküyorlar.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Buzdolabında bir sürü sebze ve meyve var.Dondurcu kısmında " +
                            "bir sürü et var.");
                }

            }
        });
        i132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean("is4Cam",false)){
                        textViewR.setText("Ölünün üzerindeki dnalar, alt komşu ve dün fal baktıran" +
                                " üç kişiyle eşleşiyor.");
                    }
                    else {
                        textViewR.setText("Ölünün üzerindeki dnalar, alt komşu ve üç kişiyle " +
                            "eşleşiyor. Biraz daha şüpheli keşfettikten sonra tekrar kontrol edilmeli.");}
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Çelik kasa kilitli ama şifreye 1234 yazınca açıldı.İçinde " +
                            "yaklaşık 30 bin lira ve bir kaç cumhuriyet altını var.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Bulaşık makinasında kan izi olan bir kaç kasap bıçağı var. Ge" +
                            "risi normal bıçaklar.");
                }
            }
        });
        i133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Ölüden çıkanlarda sadece kıyafetler var. Cüzdan ve benzeri" +
                            " eşyaların izine rastlanmamış.");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Kumanda televizyonnun kumandasıymış. Başka bir faydası yok.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Dolaplarda bir sürü tabak, bardak," +
                            " tencere, tava ve çatal bıçak var.");
                }

            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            getBoolean("is4Cam",false)){
                        i21.setVisibility(View.GONE);
                        i22.setVisibility(View.GONE);
                        i23.setVisibility(View.GONE);
                        i211.setVisibility(View.VISIBLE);
                        i212.setVisibility(View.VISIBLE);
                        i213.setVisibility(View.VISIBLE);
                        textViewR.setText("Çöpü gören kamera çalışıyor ve dünün kayıtları da duruyor");
                    }
                    else{
                        textViewR.setText("Kamera kayıtlarını kimden istemem lazım acaba");
                    }
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Diz üstü bilgisayarın geçmişinde dizi siteleri var.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Yatak dağnık bir şekilde bırakılmış. Yatağın hemen yanında" +
                            " bir beyzbol sopası var.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Dolapta kıyafetler ve kişisel bakım eşyaları var. Bir kaç" +
                            " tane yedek yorgan ve yastık da var.");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Dolabın içinde giysiler ve avcılık malzemeleri var. Şüphe" +
                            " uyandıran bir şey yok.");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Çelik kasanın içinde ruhsatlı bir tabanca var ve hiç" +
                            " kullanılmamış. Şüpheli tabancanın tılsımlı olduğu ve kötü ruhları" +
                            " öldürebileceğini söylüyor.");
                }
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            getBoolean("is4Cam",false)){
                        i21.setVisibility(View.GONE);
                        i22.setVisibility(View.GONE);
                        i23.setVisibility(View.GONE);
                        i221.setVisibility(View.VISIBLE);
                        i222.setVisibility(View.VISIBLE);
                        i223.setVisibility(View.VISIBLE);
                        textViewR.setText("Sokak girişini" +
                                " gören kamera çalışıyor ve dünün kayıtları da duruyor");
                    }
                    else{
                        textViewR.setText("Kamera kayıtlarını kimden istemem lazım acaba");
                    }
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Dolapta sadece fal yorumları" +
                            ", giysi, takı ve ayakkabılar var.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Dolapta ütülü bir takım, bir kaç pijama takımı ve " +
                            "traş makinası var.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Çocukların odasında oyuncaklar, iki yatak ve bir bilgisa" +
                            "yar var.");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Yatak normal bir yatak. Üzerinde yastık ve örtü dışında bir" +
                            " şey yok.");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Yatak üzerinde anormal bir şey yok.");
                }
            }

        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            getBoolean("is4Cam",false)){
                        i21.setVisibility(View.GONE);
                        i22.setVisibility(View.GONE);
                        i23.setVisibility(View.GONE);
                        i23x.setVisibility(View.VISIBLE);
                        textViewR.setText("Sokak çıkışını gören kamera yarım yamalak çalışıyor ve" +
                                " iki üç saatte bir kaydı silindiği için olay gününe " +
                                "dair bir kayıt yok.");
                    }
                    else{
                        textViewR.setText("Kamera kayıtlarını kimden istemem lazım acaba");
                    }
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Yatakta olmaması gereken bir şey yok.");
                }

                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Çekmecelerde kişisel bakım eşyaları ve okuma kitapları var.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Banyoda iki leğende kan kurumuş. Onun dışında sıradışı hiç " +
                            "bir şey yok.");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Çekmecenin içinde bir kutu var. Kutunun içinde av bıçak kol" +
                            "eksiyonu var ancak bir tanesinin eksik olduğu belli.");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Dolabın içerisinde bir sürü kıyafet ve kıyafetten daha da" +
                            " çok ayakkabı var.");
                }

            }
        });
        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Dükkan sahibi olay günü herhangi bir bağırış duymadığını" +
                            " söyledi.");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Apartman bahçesinde bir kaç ağaç ve çiçek var.");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("İlk oda tuvalet. Sıradışı hiç bir şey yok.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Kameralar şüphelinin dediği gibi 8 den sonra eve" +
                            " girdiğini doğruluyor.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Apartman boşluğunda bir şey yok. Apartmanda 8 daire var.");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Kameralara göre eve saat 9 gibi girmiş şüpheli.");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Karşı komşusu şüphelinin insan öldürecek birisi olmadığını" +
                            " düşünüyor.");
                }
            }
        });
        i32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Aşşağı sokaktaki gecekondu sakini bir şey bilmediğini ancak" +
                            " güzel çekirdeği olduğunu ve çıtlamak isteyene verebileceğini " +
                            "söyledi.");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Daire önlerinde şüphe uyandıran herhangi bir şey yok");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("İkinci oda depo odası gibi gözüküyor. Odanın sonunda ise " +
                            "bir yatak ve küçük bir TV var.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Site sakinlerinden kimse konuşmak istemedi.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Sadece karşı komşu konuşmak istedi. O da şüphelinin cinayet" +
                            " işlemeyecek birisi olduğunu düşünüyor.");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    textViewR.setText("Arabanın bagajında ilk yardım malzemeleri yedek lastik ve" +
                            " temiz bir havlu var.");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    textViewR.setText("Alt komşu, şüphelinin iyi biri olduğunu ama fal işlerini" +
                            " çok ciddiye aldığını parasının çoğunu o şekil işlere kaptırdığını an" +
                            "lattı.");
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
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Yan sokaktaki gecekondu sakini şüpheli siyah araç görmüş" +
                            " olay günü.");
                    i331.setText("Çöün yanında görüp görmediğini sor");
                    i332.setText("Saat kaçta gördüğünü sor");
                    i333.setText("İçindekini görüp görmediğini sor");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Apartmanın bodrum katında büyük bir depo var.");
                    i331.setText("Depo girişini incele");
                    i332.setText("Ölünün deposunu incele");
                    i333.setText("Üst ve alt komşunun depolarını incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("3. odada kameraların bağlı olduğu bir bilgisayar var. Onun dı" +
                            "şında burası da depo olarak kullanılıyor gibi.");
                    i331.setText("İlk kamerayı incele");
                    i332.setText("İkinci kamerayı incele");
                    i333.setText("Depodaki malzemeleri incele");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Şüpheli arabasını kendi göstermek istedi. Arabası siyah bir " +
                            "sedan.");
                    i331.setText("Arabanın bagajını incele");
                    i332.setText("Arabanın içini incele");
                    i333.setText("Arabanın durumunu değerlendir");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Aile arabası beyaz renkli, genellikle eniştelerin tercih" +
                            " ettiği geniş sayılabilecek bir araba.");
                    i331.setText("Arabanın bagajını incele");
                    i332.setText("Arabanın içini incele");
                    i333.setText("Arabanın durumunu değerlendir");
                }
                else if (textViewM.getText().toString().equals("Ö. fal baktıranın evi")){
                    i31.setVisibility(View.VISIBLE);
                    i32.setVisibility(View.VISIBLE);
                    i33.setVisibility(View.VISIBLE);
                    i331.setVisibility(View.GONE);
                    i332.setVisibility(View.GONE);
                    i333.setVisibility(View.GONE);
                    textViewR.setText("Arabanın içinde makyaj malzemeleri var. Galiba trafikte " +
                            "makyaj yapan arkadaşlardan.");
                }
                else if (textViewM.getText().toString().equals("İ. fal baktıranın evi")){
                    i31.setVisibility(View.VISIBLE);
                    i32.setVisibility(View.VISIBLE);
                    i33.setVisibility(View.VISIBLE);
                    i331.setVisibility(View.GONE);
                    i332.setVisibility(View.GONE);
                    i333.setVisibility(View.GONE);
                    textViewR.setText("Üst komşu, şüphelinin siprütüel kişilere çok saygı duyduğunu" +
                            " ve kendini kötü enerjilerden koruduğunu söyledi.");
                }
            }
        });
        i331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Arabanın çöpün yanında 3 dakika civarı durduğunu ondan sonra" +
                            " gittiğini söyledi.");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Depo girişindeki kilidi alt komşu açtı 4 daire ve bakkalın" +
                            " ayrı ayrı depoları var.");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("İlk kamera gelen arabaları gösteriyor ancak buradan hangi" +
                            " arabaya falcının bindiği vs. gözükmüyor.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Arabanın bagajında ilk yardım malzemeleri var. Bir kaç tane" +
                            " tamir eşyası da kenardaki kutuda duruyor.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Bagajda pek bir şey yok ancak koyun dışkısı var. İlginç...");
                }
            }
        });
        i332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Saat 6:30 da gördüğüne emin olduğunu çünkü saate" +
                            " baktığını söyledi ");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("Ölünün deposunda bir kaç çelik kasa var. Şifreleri 1453" +
                            " ya da 1234 bu kadar parayı gizlemenin amacını anlamadım.");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            getBoolean("Is4Suspect678",false)){
                        textViewR.setText("İkinci kameraya göre ölü öğlen fal baktıran kadının" +
                                " arabasına binmiş. Ve araba siyah renk bir sedan.");
                    }
                    else{
                        textViewR.setText("Ölü siyah bir sedana binmiş. Arabanın sürücüsü kadın.");
                    }

                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Arabanın içinde multimedya sistemi var. Araç uzun süredir" +
                            " temizlenmemiş.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Arabanın içinde bir tablet var. Koltuklardan birine bebek" +
                            " koltuğu yerleştirilmiş.");
                }

            }
        });
        i333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("İçindekini ya da içindekileri seçemedim. Ama korkmasam hemen" +
                            " gidip ne yaptığını incelerdim.");
                }
                else if (textViewM.getText().toString().equals("Falcının evi")){
                    textViewR.setText("İki komşu da göstermeye razı oldu. Üst komşunun deposunda" +
                            " eski eşyalar varken alt komşunun deposunda sadece bir kaç içi boş" +
                            " koli var.");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Depodaki malzemeler bakkalda satılanlarla aynı farklı bir " +
                            "şey yok.");
                }
                else if (textViewM.getText().toString().equals("Yeğeninin evi")){
                    textViewR.setText("Arabanın dışı içinden daha temiz bir halde. Herhangi bir" +
                            " kaza belirtisi yok.");
                }
                else if (textViewM.getText().toString().equals("S. fal baktıranın evi")){
                    textViewR.setText("Aracın bakıma ihtiyacı olduğu belli. Ayrıca araçtaki Osman" +
                            "lı tuğrası da biraz soyulmuş.");
                }

            }
        });
        i211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Çöpün önünde bir araba duruyor ancak arabadan çöpe herhangi bir" +
                        " şey atılmıyor");
            }
        });
        i212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Arabadan biri çıkıyor ve neredeyse kendi boyunda bir çöpü" +
                        " bagajından kaldırıp atıyor. ");
                i211.setVisibility(View.GONE);
                i212.setVisibility(View.GONE);
                i213.setVisibility(View.GONE);
                i2121.setVisibility(View.VISIBLE);
                i2122.setVisibility(View.VISIBLE);
                i2123.setVisibility(View.VISIBLE);
            }
        });
        i213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Akşam çöpçüler gelip çöpü boşaltacakken şüpheli çöp dikkatlerini" +
                        " çekiyor. Gerisini çözmek bana kaldı.");
            }
        });
        i2121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Arabanın siyah bir sedan olduğu açık. Plakası tam okunmuyor an" +
                        "cak 34 le başlıyor.");

            }
        });
        i2122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Arabadan çıkan kişi yüzünü kameraya hiç dönmeden çöpü atıyor." +
                        " Çöpü atanın kadın olduğunu çıkarabildim ancak güçsüz bir kadın olmadığı" +
                        " kendi kadar çöpü atışından belli.");

            }
        });
        i2123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Saat 18:29 da çöpe geliyor 18:32 de olay yerini terk ediyor.");

            }
        });
        i221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Öğle saatlerinde işe yarayabilecek bir şey yok");

            }
        });
        i222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("İkindi saatlerinde siyah bir sedan sokağa hızlı bir şekilde girip" +
                        " ilerideki çöpün yanında duruyor.");
                i221.setVisibility(View.GONE);
                i222.setVisibility(View.GONE);
                i223.setVisibility(View.GONE);
                i2221.setVisibility(View.VISIBLE);
                i2222.setVisibility(View.VISIBLE);
                i2223.setVisibility(View.VISIBLE);

            }
        });
        i223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Akşam bir çöp arabası sokağa giriyor. 15 dakika sonra bir " +
                        "ambulans 20 dakika sonra iki polis otosu sokağa giriyor.");

            }
        });
        i2221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Arabanın içinde bir kişi var. Arabanın arkasında ise büyük" +
                        " bir çöp poşeti sallanıyor. ");
            }
        });
        i2222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Arabanın sürücüsü buradan seçilmiyor ancak çok yaşlı olmayan" +
                        " bir kadın gibi duruyor.");
            }
        });
        i2223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Saat 18:28 de sokağa giriyor");

            }
        });
        i23x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Dükkan sahibi dikkat etmedim diyor");

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
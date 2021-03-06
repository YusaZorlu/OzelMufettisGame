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
                i1.setText("Soka???? incele");
                i2.setText("Kamera kay??tlar??n?? iste");
                i3.setText("??evredekilerle konu??");
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
                textViewM.setText("Falc??n??n evi");
                textViewR.setText("??l??n??n evini inceleyeyim.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odas??n?? incele");
                i3.setText("Bina d??????n?? incele");
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
                textViewR.setText("Bakkal?? inceleyeyim.");
                i1.setText("Kasay?? ve raflar?? incele");
                i2.setText("D??kkan??n ??n??n?? incele");
                i3.setText("Kasan??n arkas??n?? incele");
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
                textViewM.setText("Ye??eninin evi");
                textViewR.setText("??l??n??n ye??eninin evini inceleyeyim.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odas??n?? incele");
                i3.setText("Bina d??????n?? incele");
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
                textViewM.setText("S. fal bakt??ran??n evi");
                textViewR.setText("Sabah fal bakt??rm????. ??imdi ben senin evine bakaca????m.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odas??n?? incele");
                i3.setText("Bina d??????n?? incele");
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
                textViewM.setText("??. fal bakt??ran??n evi");
                textViewR.setText("Olay yerini inceleyeyim.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odas??n?? incele");
                i3.setText("Bina d??????n?? incele");
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
                textViewM.setText("??. fal bakt??ran??n evi");
                textViewR.setText("Olay yerini inceleyeyim.");
                i1.setText("Salonu incele");
                i2.setText("Yatak odas??n?? incele");
                i3.setText("Bina d??????n?? incele");
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
                    textViewR.setText("Sokak merkezi say??labilecek ancak fakir bir mahallede.Etrafta" +
                            "gecekondular ve market var.");
                    i11.setText("D??kkan?? incele");
                    i12.setText("Gecekondular?? incele");
                    i13.setText("????p?? incele");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Salonda TV, TV sehpas??, koltuklar ve tek bir dolap var");
                    i11.setText("TV sehpas??n?? incele");
                    i12.setText("Koltuklar?? incele");
                    i13.setText("Dolab?? incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Kasa s??radan bir market kasas??. Raflarda ise mahalle aras??" +
                            " bir markette olan yiyecek i??ecek ve ??arkuteri var.");
                    i11.setText("Kasay?? incele");
                    i12.setText("Raflar??n dolulu??unu incele");
                    i13.setText("Raflar??n i??eri??ini incele");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Salonda sadece 2 kanepe ve bir tekerlekli sehpa var.");
                    i11.setText("Kanepeleri incele");
                    i12.setText("Sehpay?? incele");
                    i13.setText("Mutfa???? incele");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Salonla mutfak i?? i??e. Salonda TV, koltuklar, oyun konsolu ve yemek" +
                            " masas?? var. ");
                    i11.setText("Tv ve oyun konsolunu incele");
                    i12.setText("Koltuklar?? incele");
                    i13.setText("Mutfak k??sm??n?? incele");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Salon b??y??k ve ??a??al??. ????erisinde bir s??r?? l??ks e??ya var. Tv" +
                            " ??nitesinin raflar?? var ayr??ca " +
                            "bir komidin ve s??s e??yalar?? olan bir dolap var.");
                    i11.setText("TV ??nitesini incele");
                    i12.setText("Komidini incele");
                    i13.setText("Dolab?? incele");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Salonda koltuklar, TV ??nitesi, masa ve sandalyeler var.");
                    i11.setText("Koltuklar?? incele");
                    i12.setText("Tv ??nitesini incele");
                    i13.setText("Masan??n ??zerini incele");
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
                    textViewR.setText("Sokaktaki d??kkan??n ????p?? g??ren bir kamera var iki kamera da" +
                            " sokak giri??ini ve ????k??????n?? g??r??yor. Kamera kay??tlar??n?? incelemek i??in" +
                            " sahibinden istemek laz??m.");
                    i21.setText("????p?? g??ren kameray?? incele");
                    i22.setText("Sokak giri??ini g??ren kameray?? incele");
                    i23.setText("Sokak ????k??????n?? g??ren kameray?? incele");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Yatak odas??nda diz ??st?? bilgisayar, dolap ve yatak var.");
                    i21.setText("Diz ??st?? bilgisayar?? incele");
                    i22.setText("Dolab?? incele");
                    i23.setText("Yata???? incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    i21.setVisibility(View.GONE);
                    i22.setVisibility(View.GONE);
                    i23.setVisibility(View.GONE);
                    textViewR.setText("D??kkan??n ??n??nde bir masa var. Masan??n ??zerinde tavla yan??nda" +
                            " ise tabureler var.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Yatak odas??nda tek ki??ilik yatak, dolap ve ??ekmeceler var.");
                    i21.setText("Yata???? incele");
                    i22.setText("Dolab?? incele");
                    i23.setText("??ekmeceleri incele");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Yatak odas??nda yatak ve dolap var. Bir de eksik ??l??en bir tart??" +
                            "Yatak odas?? d??????nda ??ocuklar??n odas?? ve banyo var.");
                    i21.setText("Dolab?? incele");
                    i22.setText("??ocuklar??n odas??n?? incele");
                    i23.setText("Banyoyu incele");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Yatak odas??nda bir dolap, bir yatak ve ??ekmece var.");
                    i21.setText("Dolab?? incele");
                    i22.setText("Yata???? incele");
                    i23.setText("??ekmeceyi incele");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Yatak odas??nda yatak dolap ve bir de ??elik kasa var.");
                    i21.setText("??elik kasay?? incele");
                    i22.setText("Yata???? incele");
                    i23.setText("Dolab?? incele");
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
                    textViewR.setText("D??kkan??n sahibi ve iki gecekondu sakini konu??mak istedi.");
                    i31.setText("D??kkan sahibi");
                    i32.setText("A????a???? sokaktaki sakin");
                    i33.setText("Yan sokaktaki sakin");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Bina her kat??nda bir daire olan ortalama bir apartman");
                    i31.setText("Apartman??n bah??esini incele");
                    i32.setText("Daire ??nlerini incele");
                    i33.setText("Apartman??n i??ini incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Kasan??n arkas??nda bir kap?? var ve arkas??ndaki koridor 3 " +
                            "ayr?? odaya ba??lan??yor.");
                    i31.setText("??lk oday?? incele");
                    i32.setText("??kinci oday?? incele");
                    i33.setText("??????nc?? oday?? incele");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Apartman b??y??k bir sitenin i??erisinde . Sitenin garaj??nda " +
                            "????phelinin arabas?? var.");
                    i31.setText("Site kameralar??n?? incele");
                    i32.setText("Site sakinleriyle konu??");
                    i33.setText("????phelinin arabas??n?? incelele");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Apartman??n d??????nda kamera yok. Normal bir apartman ve" +
                            " apartman??n ??n??nde ????phelinin aile arabas?? var");
                    i31.setText("Apartman??n i??ini incele");
                    i32.setText("Kom??ularla konu??");
                    i33.setText("Aile arabas??n?? incele");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Apartmanda ilgi ??ekici bir ??ey yok. ????phelinin kom??ular??" +
                            " konu??mak istemiyor.Apartman??n giri??inde iki kamera var. " +
                            "????phelinin arabas?? apartman??n ??n??nde.");
                    i31.setText("Kameralar?? incele");
                    i32.setText("Araban??n bagaj??n?? incele");
                    i33.setText("Araban??n i??ini incele");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Apartman, l??ks say??labilecek bir apartman.????phelinin arabas??" +
                            " yok ancak kom??ular?? ????pheli hakk??nda konu??maya uygun.");
                    i31.setText("Kar???? kom??uyla k??saca konu??");
                    i32.setText("Alt kom??uyla  k??saca konu??");
                    i33.setText("??st kom??uyla k??saca konu??");
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
                    textViewR.setText("K??????k s??radan bir d??kkan. D????arda g??r??len kameralar buran??n.");
                    i11x.setText("Kamera kay??tlar??n?? iste");

                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Tv sehpas??nda uydu al??c?? TV var. Onlar d??????nda bir de ajanda " +
                            "var.");
                    i11x.setText("Ajanday?? incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Kasa??n??n i??erisinde ??ok fazla olmayan bir miktar para var");
                    i11x.setText("Paray?? say");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Kanepeler eski ancak kaliteli. ??zerinde bir ??ey yok ama " +
                            "alt??nda geni?? bo??luk var.");
                    i11x.setText("Kanepenin alt??na bak");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("TV ve oyun konsolunda farkl?? bir ??ey yok. Sadece kablolar " +
                            "biraz kar??????k.");
                    i11x.setText("Oyunlar?? incele");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Tv ??nitesinin raflar??nda bir ??ok film var. Ayr??ca g??zel bir" +
                            " do??a resmi de var.");
                    i11x.setText("Filmleri incele");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Koltuklar??n ??zerinde ??rt?? var. ????inde ve alt??nda bir ??ey yok.");
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
                    textViewR.setText("Gecekondular??n neredeyse hepsi bo??alt??lm????. Galiba yak??nda" +
                            " buras?? da kentsel d??n??????me girecek.");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Koltuklarda koltuk ??rt??s?? ve yast??klar var." +
                            " Koltu??a kahve d??k??lm????");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("G??da raflar?? hari?? di??er raflar neredeyse tamamen bo??.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Sehpan??n ??zerinde telefon ??arj aleti ve kulakl??k b??rak??lm????");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Koltuklar?? a????nca i??inden aile foto??raflar?? ve bir s??r?? kablo" +
                            " ????kt??.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Komidinin ??zerinde ce raflar??nda" +
                            " farkl?? farkl?? avc??l??k malzemeleri var");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("TV ??nitesinde bol bol a??k filmleri ve kendini geli??tirme " +
                            "kitaplar?? var.");
                }
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Normal belediye ????p??. Cesedi polisler alm????.");
                    i131.setText("Otopsi sonucunu iste");
                    i132.setText("??l??n??n ??st??ndeki dna testi sonu??lar??n?? iste");
                    i133.setText("??l??den ????kanlar?? incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i131.setVisibility(View.VISIBLE);
                    i132.setVisibility(View.VISIBLE);
                    i133.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Dolapta biblolar,k??????k ??elik bir kasa ve kumanda var.");
                    i131.setText("Biblolar?? incele.");
                    i132.setText("??elik kasay?? incele");
                    i133.setText("Kumandan??n ne i??e yarad??????n?? incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i131.setVisibility(View.VISIBLE);
                    i132.setVisibility(View.VISIBLE);
                    i133.setVisibility(View.VISIBLE);

                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Raflar??n i??eri??i genel olarak g??da ??r??nleri ancak bir ka??" +
                            " k??rtasiye ??r??n?? de var.");

                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Mutfakta k??????k bir buzdolab?? var. Buzdolab?? i??inde yumurta ve" +
                            " haz??r g??dalar var.");

                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Mutfak k??sm??nda beyaz e??yalar ve dolaplar var");
                    i131.setText("Buzdolab??n?? incele");
                    i132.setText("Bula????k makinasini incele");
                    i133.setText("Dolaplar?? incele");
                    i11.setVisibility(View.GONE);
                    i12.setVisibility(View.GONE);
                    i13.setVisibility(View.GONE);
                    i131.setVisibility(View.VISIBLE);
                    i132.setVisibility(View.VISIBLE);
                    i133.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Dolaptaki s??s e??yalar??n??n hepsi av hayvanlar?? ile ilgili" +
                            " ya da avlanm???? hayvanlar??n k??rk??nden yap??lma.");

                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Masan??n ??zerinde ??i??ekler ve s??sler var. S??slerin baz??lar??nda" +
                            " y??ksek enerji veren ??ekiller varm???? diyor ????pheli.");
                }
            }
        });
        i11x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("D??kkandan kamera kay??tlar??n?? istedim d??kkan sahibi de" +
                            " kay??tlar?? verdi.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().
                            putBoolean("is4Cam",true).apply();
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Ajandada d??n i??in ???? m????terinin ismi var. ?????? de net " +
                            "kad??n isimleri.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Suspect678",false)){
                        Toast.makeText(IstEpFourInvestigate.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().
                            putBoolean("Is4Suspect678",true).apply();

                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Kasada 175 lira civar?? para var.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Kanepenin alt??nda kilitli bir evrak ??antas?? var. ????pheliye" +
                            " sorunca a??amam i??inde i?? belgeleri var ancak dedekt??rden ge??irebiliriz" +
                            " dedi.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Oyunlar??n tamam?? futbol oyunu. Her y??l alm????lar.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Filmlerin t??r?? ??o??unlukla hayatta kalma t??r??.");
                }
            }
        });
        i131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Adli t??p raporuna g??re d??n ??ld??r??lm????. ??l??m sebebi kan kayb??" +
                            " ve ??l??n??n bedeninde b????akland??????na dair izler var.");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Biblolar filli biblolardan ancak dandik gibi g??z??k??yorlar.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Buzdolab??nda bir s??r?? sebze ve meyve var.Dondurcu k??sm??nda " +
                            "bir s??r?? et var.");
                }

            }
        });
        i132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean("is4Cam",false)){
                        textViewR.setText("??l??n??n ??zerindeki dnalar, alt kom??u ve d??n fal bakt??ran" +
                                " ???? ki??iyle e??le??iyor.");
                    }
                    else {
                        textViewR.setText("??l??n??n ??zerindeki dnalar, alt kom??u ve ???? ki??iyle " +
                            "e??le??iyor. Biraz daha ????pheli ke??fettikten sonra tekrar kontrol edilmeli.");}
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("??elik kasa kilitli ama ??ifreye 1234 yaz??nca a????ld??.????inde " +
                            "yakla????k 30 bin lira ve bir ka?? cumhuriyet alt??n?? var.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Bula????k makinas??nda kan izi olan bir ka?? kasap b????a???? var. Ge" +
                            "risi normal b????aklar.");
                }
            }
        });
        i133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("??l??den ????kanlarda sadece k??yafetler var. C??zdan ve benzeri" +
                            " e??yalar??n izine rastlanmam????.");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Kumanda televizyonnun kumandas??ym????. Ba??ka bir faydas?? yok.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Dolaplarda bir s??r?? tabak, bardak," +
                            " tencere, tava ve ??atal b????ak var.");
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
                        textViewR.setText("????p?? g??ren kamera ??al??????yor ve d??n??n kay??tlar?? da duruyor");
                    }
                    else{
                        textViewR.setText("Kamera kay??tlar??n?? kimden istemem laz??m acaba");
                    }
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Diz ??st?? bilgisayar??n ge??mi??inde dizi siteleri var.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Yatak da??n??k bir ??ekilde b??rak??lm????. Yata????n hemen yan??nda" +
                            " bir beyzbol sopas?? var.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Dolapta k??yafetler ve ki??isel bak??m e??yalar?? var. Bir ka??" +
                            " tane yedek yorgan ve yast??k da var.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Dolab??n i??inde giysiler ve avc??l??k malzemeleri var. ????phe" +
                            " uyand??ran bir ??ey yok.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("??elik kasan??n i??inde ruhsatl?? bir tabanca var ve hi??" +
                            " kullan??lmam????. ????pheli tabancan??n t??ls??ml?? oldu??u ve k??t?? ruhlar??" +
                            " ??ld??rebilece??ini s??yl??yor.");
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
                        textViewR.setText("Sokak giri??ini" +
                                " g??ren kamera ??al??????yor ve d??n??n kay??tlar?? da duruyor");
                    }
                    else{
                        textViewR.setText("Kamera kay??tlar??n?? kimden istemem laz??m acaba");
                    }
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Dolapta sadece fal yorumlar??" +
                            ", giysi, tak?? ve ayakkab??lar var.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Dolapta ??t??l?? bir tak??m, bir ka?? pijama tak??m?? ve " +
                            "tra?? makinas?? var.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("??ocuklar??n odas??nda oyuncaklar, iki yatak ve bir bilgisa" +
                            "yar var.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Yatak normal bir yatak. ??zerinde yast??k ve ??rt?? d??????nda bir" +
                            " ??ey yok.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Yatak ??zerinde anormal bir ??ey yok.");
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
                        textViewR.setText("Sokak ????k??????n?? g??ren kamera yar??m yamalak ??al??????yor ve" +
                                " iki ???? saatte bir kayd?? silindi??i i??in olay g??n??ne " +
                                "dair bir kay??t yok.");
                    }
                    else{
                        textViewR.setText("Kamera kay??tlar??n?? kimden istemem laz??m acaba");
                    }
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Yatakta olmamas?? gereken bir ??ey yok.");
                }

                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("??ekmecelerde ki??isel bak??m e??yalar?? ve okuma kitaplar?? var.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Banyoda iki le??ende kan kurumu??. Onun d??????nda s??rad?????? hi?? " +
                            "bir ??ey yok.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("??ekmecenin i??inde bir kutu var. Kutunun i??inde av b????ak kol" +
                            "eksiyonu var ancak bir tanesinin eksik oldu??u belli.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Dolab??n i??erisinde bir s??r?? k??yafet ve k??yafetten daha da" +
                            " ??ok ayakkab?? var.");
                }

            }
        });
        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("D??kkan sahibi olay g??n?? herhangi bir ba????r???? duymad??????n??" +
                            " s??yledi.");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Apartman bah??esinde bir ka?? a??a?? ve ??i??ek var.");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("??lk oda tuvalet. S??rad?????? hi?? bir ??ey yok.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Kameralar ????phelinin dedi??i gibi 8 den sonra eve" +
                            " girdi??ini do??ruluyor.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Apartman bo??lu??unda bir ??ey yok. Apartmanda 8 daire var.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Kameralara g??re eve saat 9 gibi girmi?? ????pheli.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Kar???? kom??usu ????phelinin insan ??ld??recek birisi olmad??????n??" +
                            " d??????n??yor.");
                }
            }
        });
        i32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("A????a???? sokaktaki gecekondu sakini bir ??ey bilmedi??ini ancak" +
                            " g??zel ??ekirde??i oldu??unu ve ????tlamak isteyene verebilece??ini " +
                            "s??yledi.");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Daire ??nlerinde ????phe uyand??ran herhangi bir ??ey yok");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("??kinci oda depo odas?? gibi g??z??k??yor. Odan??n sonunda ise " +
                            "bir yatak ve k??????k bir TV var.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Site sakinlerinden kimse konu??mak istemedi.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Sadece kar???? kom??u konu??mak istedi. O da ????phelinin cinayet" +
                            " i??lemeyecek birisi oldu??unu d??????n??yor.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Araban??n bagaj??nda ilk yard??m malzemeleri yedek lastik ve" +
                            " temiz bir havlu var.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    textViewR.setText("Alt kom??u, ????phelinin iyi biri oldu??unu ama fal i??lerini" +
                            " ??ok ciddiye ald??????n?? paras??n??n ??o??unu o ??ekil i??lere kapt??rd??????n?? an" +
                            "latt??.");
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
                    textViewR.setText("Yan sokaktaki gecekondu sakini ????pheli siyah ara?? g??rm????" +
                            " olay g??n??.");
                    i331.setText("??????n yan??nda g??r??p g??rmedi??ini sor");
                    i332.setText("Saat ka??ta g??rd??????n?? sor");
                    i333.setText("????indekini g??r??p g??rmedi??ini sor");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Apartman??n bodrum kat??nda b??y??k bir depo var.");
                    i331.setText("Depo giri??ini incele");
                    i332.setText("??l??n??n deposunu incele");
                    i333.setText("??st ve alt kom??unun depolar??n?? incele");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("3. odada kameralar??n ba??l?? oldu??u bir bilgisayar var. Onun d??" +
                            "????nda buras?? da depo olarak kullan??l??yor gibi.");
                    i331.setText("??lk kameray?? incele");
                    i332.setText("??kinci kameray?? incele");
                    i333.setText("Depodaki malzemeleri incele");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("????pheli arabas??n?? kendi g??stermek istedi. Arabas?? siyah bir " +
                            "sedan.");
                    i331.setText("Araban??n bagaj??n?? incele");
                    i332.setText("Araban??n i??ini incele");
                    i333.setText("Araban??n durumunu de??erlendir");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Aile arabas?? beyaz renkli, genellikle eni??telerin tercih" +
                            " etti??i geni?? say??labilecek bir araba.");
                    i331.setText("Araban??n bagaj??n?? incele");
                    i332.setText("Araban??n i??ini incele");
                    i333.setText("Araban??n durumunu de??erlendir");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    i31.setVisibility(View.VISIBLE);
                    i32.setVisibility(View.VISIBLE);
                    i33.setVisibility(View.VISIBLE);
                    i331.setVisibility(View.GONE);
                    i332.setVisibility(View.GONE);
                    i333.setVisibility(View.GONE);
                    textViewR.setText("Araban??n i??inde makyaj malzemeleri var. Galiba trafikte " +
                            "makyaj yapan arkada??lardan.");
                }
                else if (textViewM.getText().toString().equals("??. fal bakt??ran??n evi")){
                    i31.setVisibility(View.VISIBLE);
                    i32.setVisibility(View.VISIBLE);
                    i33.setVisibility(View.VISIBLE);
                    i331.setVisibility(View.GONE);
                    i332.setVisibility(View.GONE);
                    i333.setVisibility(View.GONE);
                    textViewR.setText("??st kom??u, ????phelinin sipr??t??el ki??ilere ??ok sayg?? duydu??unu" +
                            " ve kendini k??t?? enerjilerden korudu??unu s??yledi.");
                }
            }
        });
        i331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Araban??n ????p??n yan??nda 3 dakika civar?? durdu??unu ondan sonra" +
                            " gitti??ini s??yledi.");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("Depo giri??indeki kilidi alt kom??u a??t?? 4 daire ve bakkal??n" +
                            " ayr?? ayr?? depolar?? var.");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("??lk kamera gelen arabalar?? g??steriyor ancak buradan hangi" +
                            " arabaya falc??n??n bindi??i vs. g??z??km??yor.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Araban??n bagaj??nda ilk yard??m malzemeleri var. Bir ka?? tane" +
                            " tamir e??yas?? da kenardaki kutuda duruyor.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Bagajda pek bir ??ey yok ancak koyun d????k??s?? var. ??lgin??...");
                }
            }
        });
        i332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Saat 6:30 da g??rd??????ne emin oldu??unu ????nk?? saate" +
                            " bakt??????n?? s??yledi ");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("??l??n??n deposunda bir ka?? ??elik kasa var. ??ifreleri 1453" +
                            " ya da 1234 bu kadar paray?? gizlemenin amac??n?? anlamad??m.");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    if (PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            getBoolean("Is4Suspect678",false)){
                        textViewR.setText("??kinci kameraya g??re ??l?? ????len fal bakt??ran kad??n??n" +
                                " arabas??na binmi??. Ve araba siyah renk bir sedan.");
                    }
                    else{
                        textViewR.setText("??l?? siyah bir sedana binmi??. Araban??n s??r??c??s?? kad??n.");
                    }

                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Araban??n i??inde multimedya sistemi var. Ara?? uzun s??redir" +
                            " temizlenmemi??.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Araban??n i??inde bir tablet var. Koltuklardan birine bebek" +
                            " koltu??u yerle??tirilmi??.");
                }

            }
        });
        i333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("????indekini ya da i??indekileri se??emedim. Ama korkmasam hemen" +
                            " gidip ne yapt??????n?? incelerdim.");
                }
                else if (textViewM.getText().toString().equals("Falc??n??n evi")){
                    textViewR.setText("??ki kom??u da g??stermeye raz?? oldu. ??st kom??unun deposunda" +
                            " eski e??yalar varken alt kom??unun deposunda sadece bir ka?? i??i bo??" +
                            " koli var.");
                }
                else if (textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("Depodaki malzemeler bakkalda sat??lanlarla ayn?? farkl?? bir " +
                            "??ey yok.");
                }
                else if (textViewM.getText().toString().equals("Ye??eninin evi")){
                    textViewR.setText("Araban??n d?????? i??inden daha temiz bir halde. Herhangi bir" +
                            " kaza belirtisi yok.");
                }
                else if (textViewM.getText().toString().equals("S. fal bakt??ran??n evi")){
                    textViewR.setText("Arac??n bak??ma ihtiyac?? oldu??u belli. Ayr??ca ara??taki Osman" +
                            "l?? tu??ras?? da biraz soyulmu??.");
                }

            }
        });
        i211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("????p??n ??n??nde bir araba duruyor ancak arabadan ????pe herhangi bir" +
                        " ??ey at??lm??yor");
            }
        });
        i212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Arabadan biri ????k??yor ve neredeyse kendi boyunda bir ????p??" +
                        " bagaj??ndan kald??r??p at??yor. ");
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
                textViewR.setText("Ak??am ????p????ler gelip ????p?? bo??altacakken ????pheli ????p dikkatlerini" +
                        " ??ekiyor. Gerisini ????zmek bana kald??.");
            }
        });
        i2121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Araban??n siyah bir sedan oldu??u a????k. Plakas?? tam okunmuyor an" +
                        "cak 34 le ba??l??yor.");

            }
        });
        i2122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Arabadan ????kan ki??i y??z??n?? kameraya hi?? d??nmeden ????p?? at??yor." +
                        " ????p?? atan??n kad??n oldu??unu ????karabildim ancak g????s??z bir kad??n olmad??????" +
                        " kendi kadar ????p?? at??????ndan belli.");

            }
        });
        i2123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Saat 18:29 da ????pe geliyor 18:32 de olay yerini terk ediyor.");

            }
        });
        i221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("????le saatlerinde i??e yarayabilecek bir ??ey yok");

            }
        });
        i222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("??kindi saatlerinde siyah bir sedan soka??a h??zl?? bir ??ekilde girip" +
                        " ilerideki ????p??n yan??nda duruyor.");
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
                textViewR.setText("Ak??am bir ????p arabas?? soka??a giriyor. 15 dakika sonra bir " +
                        "ambulans 20 dakika sonra iki polis otosu soka??a giriyor.");

            }
        });
        i2221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Araban??n i??inde bir ki??i var. Araban??n arkas??nda ise b??y??k" +
                        " bir ????p po??eti sallan??yor. ");
            }
        });
        i2222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Araban??n s??r??c??s?? buradan se??ilmiyor ancak ??ok ya??l?? olmayan" +
                        " bir kad??n gibi duruyor.");
            }
        });
        i2223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Saat 18:28 de soka??a giriyor");

            }
        });
        i23x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("D??kkan sahibi dikkat etmedim diyor");

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
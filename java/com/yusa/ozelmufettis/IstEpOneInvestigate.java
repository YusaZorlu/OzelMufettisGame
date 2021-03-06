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

public class IstEpOneInvestigate extends AppCompatActivity {
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
                Scon,Context.BIND_AUTO_CREATE);
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
        setContentView(R.layout.activity_ist_ep_one_investigate);
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
        final int[] variableForB2 = {0};
        // buttons and textView
        final TextView textViewR = findViewById(R.id.textViewR);
        final TextView TextViewM = findViewById(R.id.textViewM);

        Button buttonP1 = findViewById(R.id.button63);
        Button buttonP2 = findViewById(R.id.button54);
        Button buttonP3 = findViewById(R.id.button57);
        Button buttonP4 = findViewById(R.id.button58);
        Button toBack = findViewById(R.id.button145);

        final TextView textViewM1 = findViewById(R.id.textViewM1);
        final TextView textViewM2 = findViewById(R.id.textViewM2);
        final TextView textViewM3 = findViewById(R.id.textViewM3);
        final TextView textViewM4 = findViewById(R.id.textViewM4);

        final Button button0 = findViewById(R.id.button0);
        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);
        final Button button5 = findViewById(R.id.button5);
        final Button button6 = findViewById(R.id.button6);
        final Button button7 = findViewById(R.id.button7);
        final Button button8 = findViewById(R.id.button8);
        final Button button9 = findViewById(R.id.button9);
        final Button button10 = findViewById(R.id.button10);
        final Button button11 = findViewById(R.id.button11);
        final Button button12 = findViewById(R.id.button12);
        final Button button13 = findViewById(R.id.button13);
        final Button button14 = findViewById(R.id.button14);
        final Button button15 = findViewById(R.id.button15);
        final Button button16 = findViewById(R.id.button16);
        final Button button17 = findViewById(R.id.button17);
        final Button button18 = findViewById(R.id.button18);
        final Button button19 = findViewById(R.id.button19);
        final Button button20 = findViewById(R.id.button20);
        final Button button21 = findViewById(R.id.button21);
        final Button button22 = findViewById(R.id.button22);
        final Button button23 = findViewById(R.id.button23);
        final Button button24 = findViewById(R.id.button24);
        final Button button25 = findViewById(R.id.button25);
        final Button button26 = findViewById(R.id.button26);
        final Button button27 = findViewById(R.id.button27);
        final Button button28 = findViewById(R.id.button28);
        final Button button29 = findViewById(R.id.button29);
        final Button button30 = findViewById(R.id.button30);
        final Button button31 = findViewById(R.id.button31);
        final Button button32 = findViewById(R.id.button32);
        final Button button33 = findViewById(R.id.button33);
        final Button button34 = findViewById(R.id.button34);
        final Button button35 = findViewById(R.id.button35);
        final Button button36 = findViewById(R.id.button36);
        final Button button37 = findViewById(R.id.button37);
        final Button button38 = findViewById(R.id.button38);
        final Button button39 = findViewById(R.id.button39);
        final Button button40 = findViewById(R.id.button40);
        final Button button41 = findViewById(R.id.button41);
        final Button button42 = findViewById(R.id.button042);
        final Button button43 = findViewById(R.id.button043);
        final Button button44 = findViewById(R.id.button044);
        // onclick methods

        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("place3is1",false)){
            buttonP3.setVisibility(View.GONE);
        }
        else buttonP3.setVisibility(View.VISIBLE);
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("place4is1",false)){
            buttonP4.setVisibility(View.GONE);
        }
        else buttonP4.setVisibility(View.VISIBLE);

        buttonP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM1.setVisibility(View.VISIBLE);
                textViewM2.setVisibility(View.GONE);
                textViewM3.setVisibility(View.GONE);
                textViewM4.setVisibility(View.GONE);

                button0.setVisibility(View.VISIBLE);
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                button6.setVisibility(View.GONE);
                button7.setVisibility(View.GONE);
                button8.setVisibility(View.GONE);
                button9.setVisibility(View.GONE);
                button10.setVisibility(View.GONE);
                button11.setVisibility(View.GONE);
                button12.setVisibility(View.GONE);
                button13.setVisibility(View.GONE);
                button14.setVisibility(View.GONE);
                button15.setVisibility(View.GONE);
                button16.setVisibility(View.GONE);
                button17.setVisibility(View.GONE);
                button18.setVisibility(View.GONE);
                button19.setVisibility(View.GONE);
                button20.setVisibility(View.GONE);
                button21.setVisibility(View.GONE);
                button22.setVisibility(View.GONE);
                button23.setVisibility(View.GONE);
                button24.setVisibility(View.GONE);
                button25.setVisibility(View.GONE);
                button26.setVisibility(View.GONE);
                button27.setVisibility(View.GONE);
                button28.setVisibility(View.GONE);
                button29.setVisibility(View.GONE);
                button30.setVisibility(View.GONE);
                button31.setVisibility(View.GONE);
                button32.setVisibility(View.GONE);
                button33.setVisibility(View.GONE);
                button34.setVisibility(View.GONE);
                button35.setVisibility(View.GONE);
                button36.setVisibility(View.GONE);
                button37.setVisibility(View.GONE);
                button38.setVisibility(View.GONE);
                button39.setVisibility(View.GONE);
                button40.setVisibility(View.GONE);
                button41.setVisibility(View.GONE);
                button42.setVisibility(View.GONE);
                button43.setVisibility(View.GONE);
                button44.setVisibility(View.GONE);




            }
        });
        buttonP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM1.setVisibility(View.GONE);
                textViewM2.setVisibility(View.VISIBLE);
                textViewM3.setVisibility(View.GONE);
                textViewM4.setVisibility(View.GONE);

                button0.setVisibility(View.GONE);
                button1.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.GONE);
                button7.setVisibility(View.GONE);
                button8.setVisibility(View.GONE);
                button9.setVisibility(View.GONE);
                button10.setVisibility(View.GONE);
                button11.setVisibility(View.GONE);
                button12.setVisibility(View.GONE);
                button13.setVisibility(View.GONE);
                button14.setVisibility(View.GONE);
                button15.setVisibility(View.GONE);
                button16.setVisibility(View.GONE);
                button17.setVisibility(View.GONE);
                button18.setVisibility(View.GONE);
                button19.setVisibility(View.GONE);
                button20.setVisibility(View.GONE);
                button21.setVisibility(View.GONE);
                button22.setVisibility(View.GONE);
                button23.setVisibility(View.GONE);
                button24.setVisibility(View.GONE);
                button25.setVisibility(View.GONE);
                button26.setVisibility(View.GONE);
                button27.setVisibility(View.GONE);
                button28.setVisibility(View.GONE);
                button29.setVisibility(View.GONE);
                button30.setVisibility(View.GONE);
                button31.setVisibility(View.GONE);
                button32.setVisibility(View.GONE);
                button33.setVisibility(View.GONE);
                button34.setVisibility(View.GONE);
                button35.setVisibility(View.GONE);
                button36.setVisibility(View.GONE);
                button37.setVisibility(View.GONE);
                button38.setVisibility(View.GONE);
                button39.setVisibility(View.GONE);
                button40.setVisibility(View.GONE);
                button41.setVisibility(View.GONE);
                button42.setVisibility(View.GONE);
                button43.setVisibility(View.GONE);
                button44.setVisibility(View.GONE);




            }
        });
        buttonP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM1.setVisibility(View.GONE);
                textViewM2.setVisibility(View.GONE);
                textViewM3.setVisibility(View.VISIBLE);
                textViewM4.setVisibility(View.GONE);

                button0.setVisibility(View.GONE);
                button1.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.GONE);
                button7.setVisibility(View.GONE);
                button8.setVisibility(View.GONE);
                button9.setVisibility(View.GONE);
                button10.setVisibility(View.GONE);
                button11.setVisibility(View.GONE);
                button12.setVisibility(View.GONE);
                button13.setVisibility(View.GONE);
                button14.setVisibility(View.GONE);
                button15.setVisibility(View.GONE);
                button16.setVisibility(View.GONE);
                button17.setVisibility(View.GONE);
                button18.setVisibility(View.GONE);
                button19.setVisibility(View.GONE);
                button20.setVisibility(View.GONE);
                button21.setVisibility(View.GONE);
                button22.setVisibility(View.GONE);
                button23.setVisibility(View.GONE);
                button24.setVisibility(View.GONE);
                button25.setVisibility(View.GONE);
                button26.setVisibility(View.GONE);
                button27.setVisibility(View.GONE);
                button28.setVisibility(View.GONE);
                button29.setVisibility(View.GONE);
                button30.setVisibility(View.GONE);
                button31.setVisibility(View.GONE);
                button32.setVisibility(View.GONE);
                button33.setVisibility(View.GONE);
                button34.setVisibility(View.GONE);
                button35.setVisibility(View.GONE);
                button36.setVisibility(View.GONE);
                button37.setVisibility(View.GONE);
                button38.setVisibility(View.GONE);
                button39.setVisibility(View.GONE);
                button40.setVisibility(View.GONE);
                button41.setVisibility(View.GONE);
                button42.setVisibility(View.GONE);
                button43.setVisibility(View.GONE);
                button44.setVisibility(View.GONE);




            }
        });
        buttonP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM1.setVisibility(View.GONE);
                textViewM2.setVisibility(View.GONE);
                textViewM3.setVisibility(View.GONE);
                textViewM4.setVisibility(View.VISIBLE);

                button0.setVisibility(View.GONE);
                button1.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                button6.setVisibility(View.GONE);
                button7.setVisibility(View.GONE);
                button8.setVisibility(View.GONE);
                button9.setVisibility(View.GONE);
                button10.setVisibility(View.GONE);
                button11.setVisibility(View.GONE);
                button12.setVisibility(View.GONE);
                button13.setVisibility(View.GONE);
                button14.setVisibility(View.GONE);
                button15.setVisibility(View.GONE);
                button16.setVisibility(View.GONE);
                button17.setVisibility(View.GONE);
                button18.setVisibility(View.GONE);
                button19.setVisibility(View.GONE);
                button20.setVisibility(View.GONE);
                button21.setVisibility(View.GONE);
                button22.setVisibility(View.GONE);
                button23.setVisibility(View.GONE);
                button24.setVisibility(View.GONE);
                button25.setVisibility(View.GONE);
                button26.setVisibility(View.GONE);
                button27.setVisibility(View.GONE);
                button28.setVisibility(View.GONE);
                button29.setVisibility(View.GONE);
                button30.setVisibility(View.GONE);
                button31.setVisibility(View.GONE);
                button32.setVisibility(View.GONE);
                button33.setVisibility(View.GONE);
                button34.setVisibility(View.GONE);
                button35.setVisibility(View.GONE);
                button36.setVisibility(View.GONE);
                button37.setVisibility(View.GONE);
                button38.setVisibility(View.GONE);
                button39.setVisibility(View.GONE);
                button40.setVisibility(View.GONE);
                button41.setVisibility(View.GONE);
                button42.setVisibility(View.VISIBLE);
                button43.setVisibility(View.VISIBLE);
                button44.setVisibility(View.VISIBLE);

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Telefon, K??yafetler ve c??zdan ????kt?? ??zerinden");
                button0.setVisibility(View.GONE);
                button1.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                button6.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);
                button8.setVisibility(View.VISIBLE);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Olay yeri polisler kan??t toplad??ktan sonra temizlenmi??");
                button0.setVisibility(View.GONE);
                button1.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                button9.setVisibility(View.VISIBLE);
                button10.setVisibility(View.VISIBLE);
                button11.setVisibility(View.VISIBLE);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Etraftaki insanlar 3 ki??iyle konu??may?? tavsiye ediyor.");
                button0.setVisibility(View.GONE);
                button1.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                button12.setVisibility(View.VISIBLE);
                button13.setVisibility(View.VISIBLE);
                button14.setVisibility(View.VISIBLE);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (textViewM2.getVisibility() == View.VISIBLE){
                textViewR.setText("Salonda bir bilgisayar var dolab??n ??st??nde notlar var ve" +
                        " koltu??un alt??nda dikkat ??eken bir ??ey var ");
                button3.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                button15.setVisibility(View.VISIBLE);
                button16.setVisibility(View.VISIBLE);
                button17.setVisibility(View.VISIBLE);
            }
            else if (textViewM3.getVisibility() == View.VISIBLE){
                textViewR.setText("Salonda sadece bir koltuk ve bir televizyon var");
            }
        }
    });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                if (textViewM2.getVisibility() == View.VISIBLE){
                    textViewR.setText("Yap??l?? bir yatak, eski bir dolap ve Allaha emanet" +
                            " bir ??al????ma masas?? var");
                    button18.setVisibility(View.VISIBLE);
                    button19.setVisibility(View.VISIBLE);
                    button20.setVisibility(View.VISIBLE);
                }
                else if (textViewM3.getVisibility() == View.VISIBLE){
                    textViewR.setText("Eski bir bilgisayar k??????k bir dolap ve odan??n " +
                            "kenar??nda bir ??ifreli kasa ");
                    button24.setVisibility(View.VISIBLE);
                    button25.setVisibility(View.VISIBLE);
                    button26.setVisibility(View.VISIBLE);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                if (textViewM2.getVisibility() == View.VISIBLE){
                    textViewR.setText("D??rt katl?? kap??c??s?? olan eski bir apartman. ");
                    button21.setVisibility(View.VISIBLE);
                    button22.setVisibility(View.VISIBLE);
                    button23.setVisibility(View.VISIBLE);
                }
                else if (textViewM3.getVisibility() == View.VISIBLE){
                    textViewR.setText("Alt?? katl?? orta halli kameras?? olan bir apartman. ");
                    button27.setVisibility(View.VISIBLE);
                    button28.setVisibility(View.VISIBLE);
                    button29.setVisibility(View.VISIBLE);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Telefonun ??ifresi yok i??inde sim kart?? da duruyor");
                button6.setVisibility(View.GONE);
                button7.setVisibility(View.GONE);
                button8.setVisibility(View.GONE);
                button30.setVisibility(View.VISIBLE);
                button31.setVisibility(View.VISIBLE);
                button32.setVisibility(View.VISIBLE);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("k??yafetler kirli ve kan i??erisinde s??rt??nda bir mermi deli??i var");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("C??zdanda ailesinin ve sevgilisinin resmi var." +
                        " Bir ka?? tane de kredi kart??");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Ceset ??zerinde sevgilisinin ve etraftaki e??yalarda akrabas?? " +
                        "oldu??unu d??????nd??????m??z dna ????kt?? olay yerinde dna bulunamad??");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Cesedin etraf??nda iki mermi kovan?? ,bir k??r??k i??ki ??i??esi," +
                        " eldivenler ve ??ok??a kan var");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Silahla yak??n mesafeden vurularak ??ld??r??lme.");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Day?? ben 2 el silah duydum korktum polisi arad??m.");
                variableForB2[0] = 1;
                button12.setVisibility(View.GONE);
                button13.setVisibility(View.GONE);
                button14.setVisibility(View.GONE);
                button33.setVisibility(View.VISIBLE);
                button34.setVisibility(View.VISIBLE);
                button35.setVisibility(View.VISIBLE);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Ben bakkalda tv izliyodum ses duymad??m ama" +
                        " insanlar toplanmaya gidince cesedi g??rd??m");
                variableForB2[0] = 2;
                button12.setVisibility(View.GONE);
                button13.setVisibility(View.GONE);
                button14.setVisibility(View.GONE);
                button33.setVisibility(View.VISIBLE);
                button34.setVisibility(View.VISIBLE);
                button35.setVisibility(View.VISIBLE);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Arkadan ses duydum d??n??p bakt??m erkek" +
                        " oldu??unu d??????nd??????m biri ko??uyordu y??z??n?? g??remedim");
                variableForB2[0] = 3;
                button12.setVisibility(View.GONE);
                button13.setVisibility(View.GONE);
                button14.setVisibility(View.GONE);
                button33.setVisibility(View.VISIBLE);
                button34.setVisibility(View.VISIBLE);
                button35.setVisibility(View.VISIBLE);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("??nternet ge??mi??i temizlenmi??, oyunlar" +
                        " d??????nda herhangi bir ??ey g??z??km??yor.");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Koltu??un alt??nda bir s??r?? su ??i??esi var rahmetli pasakl??ym????.");
            }
        });button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("notlar: pazardan don atlet, domates al, aliye borcunu ??de, " +
                        "avukat bul tarlay?? g??r????");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("temiz bir yast??k ve yorgan var yast??????n alt??nda okuma kitab?? var");
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("K??yafet ,??anta, ayakkab?? bir ka?? mahkeme dosyas?? var");
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Bor??lar??n?? tuttu??u bir defter var onun d??????nda" +
                        " masa ittirilse k??r??lacak gibi duruyor");
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Bir terlik var ayakkab??lar??n?? i??eride tutuyor olmal??");
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Merdivenler tertemiz kim temizliyorsa i??inde iyiymi??.");
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Ev sahibi ??st kom??u ayak??st?? konu??mak istemedi " +
                        "3 ki??i konu??mak istedi");
                button21.setVisibility(View.GONE);
                button22.setVisibility(View.GONE);
                button23.setVisibility(View.GONE);
                button36.setVisibility(View.VISIBLE);
                button37.setVisibility(View.VISIBLE);
                button38.setVisibility(View.VISIBLE);
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Benim ??zelim karde?? ama ??srar ettiysen a??ay??m kasay??." +
                        " (Kasan??n i??inde bir tabanca ve bir ka?? resim var.)");
                button24.setVisibility(View.GONE);
                button25.setVisibility(View.GONE);
                button26.setVisibility(View.GONE);
                button39.setVisibility(View.VISIBLE);
                button40.setVisibility(View.VISIBLE);
                button41.setVisibility(View.VISIBLE);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Bilgisayarda ??nemli bir ??ey g??z??km??yor");
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Sadece k??yafet ve yeni y??kanm???? bir ayakkab?? var.");
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Dairenin ??n??nde bir ka?? tane ??amur i??inde ayakkab?? var.");
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kamera kay??tlar??nda ????pheli bir ??ey g??z??km??yor. Olay??n" +
                        " oldu??u ak??am kuzen a????r?? sarho?? de??il gibi.");
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kar???? kom??u hakk??nda fazla bir ??ey bilmedi??ini ama " +
                        "agresif davran????lar??n?? g??rd??????n?? s??yledi.");
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Son mesajlar \nEv sahibi: ayakkab??lar?? kap??n??n" +
                        " ??n??nden al merdiven y??kanacak\n A??kito: cnm" +
                        " yar??n ak??am sinemaya gidek mi?");
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Hobileri d??????nda avukat numaralar?? ve arazi anla??mazl?????? " +
                        "ile ilgili hukuki bilgilgiler");
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("sevgilisi ve kaydedilmemi?? bir numara. Numara kullan??m d??????");
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (variableForB2[0] ==1){
                    textViewR.setText("+Sence ne zaman olmu??tur olay \n - Silah sesini ak??am " +
                            "8 de duydum ");
                }
                else if (variableForB2[0] ==2){
                    textViewR.setText("+ Sence ne zaman olmu??tur cinayet? \n - Ben g??rd??????mde" +
                            " saat 21 i ge??mi??ti");
                }
                else if(variableForB2[0] ==3){
                    textViewR.setText("+ Sence ne zaman olmu??tur cinayet \nSaate bakt??????mda 20 yi" +
                            " k??s??r ge??iyordu saat 20 de oldu??una eminim");
                }
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (variableForB2[0] ==1){
                    textViewR.setText("+????pheli birini g??rd??n??z m??? \n - Olay??n ??okundan dikkat etmedim ");
                }
                else if (variableForB2[0] ==2){
                    textViewR.setText("+ ????pheli birini g??rd??n??z m??? \n - Kameraya bak??nca " +
                            "arkas??na tabanca saklayan bir adam g??rd??m ama y??z?? net g??z??km??yor.");
                }
                else if(variableForB2[0] ==3){
                    textViewR.setText("+ ????pheli birini g??rd??n??z m???\n Dedi??im adam i??te" +
                            " ayr??ca adam elinden bir ??i??e f??rlatt??");
                }
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (variableForB2[0] ==1){
                    textViewR.setText("+??l??y?? g??rd??n m??? \n - Polisi arad??m ama olay yerinde de??ildim ");
                }
                else if (variableForB2[0] ==2){
                    textViewR.setText("+??l??y?? g??rd??n m??? \n - Ben g??rd??????mde her yer kan i??erisindeydi");
                }
                else if(variableForB2[0] ==3){
                    textViewR.setText("+ ??l??y?? g??rd??n peki sonras?? \n - ??lk yard??m yapt??k" +
                            " kurtaramad??k ba??kalar?? da ambulans ve polisi aram????.");
                }
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+??l?? hakk??nda bildi??iniz bir ??ey var m?? \n -Pek yok. " +
                        "??yi bir insand??, selamla????rd??k");
            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+??l?? hakk??nda bildi??iniz bir ??ey var m?? \n-Bir ka?? kere" +
                        " akrabas??n??n biriyle kavga etmi??li??i var apartma??n ??n??nde.");
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+??l?? hakk??nda bildi??iniz bir ??ey var m?? \n- Kuzeni beni sorarsa" +
                        " s??yleme demi??ti galiba kavgal??lard??");
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("-Tabancam ruhsatl??d??r gerisi seni ilgilendirmez");
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kendimi korumak i??in tabii ki");
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+G??zel resimler neden asm??yorsun \n -Mant??kl?? bi ara asay??m");
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Bir ka?? pazarc?? olay g??n?? pazar kapanana kadar" +
                        " 4. ????phelinin pazarda oldu??una ??ahit");
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Zab??ta dikkat etmedi??ini s??yledi");
            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("????pheli 4 kameralarda en son 22:30 da pazar??n orda g??r??lm????");
            }
        });
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpOne.class);
                startActivity(intent);
            }
        });

    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), IstEpOne.class);
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
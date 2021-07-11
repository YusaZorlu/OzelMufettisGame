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
                textViewR.setText("Telefon, Kıyafetler ve cüzdan çıktı üzerinden");
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
                textViewR.setText("Olay yeri polisler kanıt topladıktan sonra temizlenmiş");
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
                textViewR.setText("Etraftaki insanlar 3 kişiyle konuşmayı tavsiye ediyor.");
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
                textViewR.setText("Salonda bir bilgisayar var dolabın üstünde notlar var ve" +
                        " koltuğun altında dikkat çeken bir şey var ");
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
                    textViewR.setText("Yapılı bir yatak, eski bir dolap ve Allaha emanet" +
                            " bir çalışma masası var");
                    button18.setVisibility(View.VISIBLE);
                    button19.setVisibility(View.VISIBLE);
                    button20.setVisibility(View.VISIBLE);
                }
                else if (textViewM3.getVisibility() == View.VISIBLE){
                    textViewR.setText("Eski bir bilgisayar küçük bir dolap ve odanın " +
                            "kenarında bir şifreli kasa ");
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
                    textViewR.setText("Dört katlı kapıcısı olan eski bir apartman. ");
                    button21.setVisibility(View.VISIBLE);
                    button22.setVisibility(View.VISIBLE);
                    button23.setVisibility(View.VISIBLE);
                }
                else if (textViewM3.getVisibility() == View.VISIBLE){
                    textViewR.setText("Altı katlı orta halli kamerası olan bir apartman. ");
                    button27.setVisibility(View.VISIBLE);
                    button28.setVisibility(View.VISIBLE);
                    button29.setVisibility(View.VISIBLE);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Telefonun şifresi yok içinde sim kartı da duruyor");
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
                textViewR.setText("kıyafetler kirli ve kan içerisinde sırtında bir mermi deliği var");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Cüzdanda ailesinin ve sevgilisinin resmi var." +
                        " Bir kaç tane de kredi kartı");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Ceset üzerinde sevgilisinin ve etraftaki eşyalarda akrabası " +
                        "olduğunu düşündüğümüz dna çıktı olay yerinde dna bulunamadı");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Cesedin etrafında iki mermi kovanı ,bir kırık içki şişesi," +
                        " eldivenler ve çokça kan var");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Silahla yakın mesafeden vurularak öldürülme.");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Dayı ben 2 el silah duydum korktum polisi aradım.");
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
                textViewR.setText("+Ben bakkalda tv izliyodum ses duymadım ama" +
                        " insanlar toplanmaya gidince cesedi gördüm");
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
                textViewR.setText("+Arkadan ses duydum dönüp baktım erkek" +
                        " olduğunu düşündüğüm biri koşuyordu yüzünü göremedim");
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
                textViewR.setText("İnternet geçmişi temizlenmiş, oyunlar" +
                        " dışında herhangi bir şey gözükmüyor.");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Koltuğun altında bir sürü su şişesi var rahmetli pasaklıymış.");
            }
        });button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("notlar: pazardan don atlet, domates al, aliye borcunu öde, " +
                        "avukat bul tarlayı görüş");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("temiz bir yastık ve yorgan var yastığın altında okuma kitabı var");
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kıyafet ,çanta, ayakkabı bir kaç mahkeme dosyası var");
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Borçlarını tuttuğu bir defter var onun dışında" +
                        " masa ittirilse kırılacak gibi duruyor");
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Bir terlik var ayakkabılarını içeride tutuyor olmalı");
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Merdivenler tertemiz kim temizliyorsa işinde iyiymiş.");
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Ev sahibi üst komşu ayaküstü konuşmak istemedi " +
                        "3 kişi konuşmak istedi");
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
                textViewR.setText("+Benim özelim kardeş ama ısrar ettiysen açayım kasayı." +
                        " (Kasanın içinde bir tabanca ve bir kaç resim var.)");
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
                textViewR.setText("Bilgisayarda önemli bir şey gözükmüyor");
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Sadece kıyafet ve yeni yıkanmış bir ayakkabı var.");
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Dairenin önünde bir kaç tane çamur içinde ayakkabı var.");
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kamera kayıtlarında şüpheli bir şey gözükmüyor. Olayın" +
                        " olduğu akşam kuzen aşırı sarhoş değil gibi.");
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Karşı komşu hakkında fazla bir şey bilmediğini ama " +
                        "agresif davranışlarını gördüğünü söyledi.");
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Son mesajlar \nEv sahibi: ayakkabıları kapının" +
                        " önünden al merdiven yıkanacak\n Aşkito: cnm" +
                        " yarın akşam sinemaya gidek mi?");
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Hobileri dışında avukat numaraları ve arazi anlaşmazlığı " +
                        "ile ilgili hukuki bilgilgiler");
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("sevgilisi ve kaydedilmemiş bir numara. Numara kullanım dışı");
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (variableForB2[0] ==1){
                    textViewR.setText("+Sence ne zaman olmuştur olay \n - Silah sesini akşam " +
                            "8 de duydum ");
                }
                else if (variableForB2[0] ==2){
                    textViewR.setText("+ Sence ne zaman olmuştur cinayet? \n - Ben gördüğümde" +
                            " saat 21 i geçmişti");
                }
                else if(variableForB2[0] ==3){
                    textViewR.setText("+ Sence ne zaman olmuştur cinayet \nSaate baktığımda 20 yi" +
                            " küsür geçiyordu saat 20 de olduğuna eminim");
                }
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (variableForB2[0] ==1){
                    textViewR.setText("+Şüpheli birini gördünüz mü? \n - Olayın şokundan dikkat etmedim ");
                }
                else if (variableForB2[0] ==2){
                    textViewR.setText("+ Şüpheli birini gördünüz mü? \n - Kameraya bakınca " +
                            "arkasına tabanca saklayan bir adam gördüm ama yüzü net gözükmüyor.");
                }
                else if(variableForB2[0] ==3){
                    textViewR.setText("+ Şüpheli birini gördünüz mü?\n Dediğim adam işte" +
                            " ayrıca adam elinden bir şişe fırlattı");
                }
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (variableForB2[0] ==1){
                    textViewR.setText("+Ölüyü gördün mü? \n - Polisi aradım ama olay yerinde değildim ");
                }
                else if (variableForB2[0] ==2){
                    textViewR.setText("+Ölüyü gördün mü? \n - Ben gördüğümde her yer kan içerisindeydi");
                }
                else if(variableForB2[0] ==3){
                    textViewR.setText("+ Ölüyü gördün peki sonrası \n - İlk yardım yaptık" +
                            " kurtaramadık başkaları da ambulans ve polisi aramış.");
                }
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Ölü hakkında bildiğiniz bir şey var mı \n -Pek yok. " +
                        "İyi bir insandı, selamlaşırdık");
            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Ölü hakkında bildiğiniz bir şey var mı \n-Bir kaç kere" +
                        " akrabasının biriyle kavga etmişliği var apartmaın önünde.");
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Ölü hakkında bildiğiniz bir şey var mı \n- Kuzeni beni sorarsa" +
                        " söyleme demişti galiba kavgalılardı");
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("-Tabancam ruhsatlıdır gerisi seni ilgilendirmez");
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kendimi korumak için tabii ki");
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Güzel resimler neden asmıyorsun \n -Mantıklı bi ara asayım");
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Bir kaç pazarcı olay günü pazar kapanana kadar" +
                        " 4. şüphelinin pazarda olduğuna şahit");
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Zabıta dikkat etmediğini söyledi");
            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Şüpheli 4 kameralarda en son 22:30 da pazarın orda görülmüş");
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
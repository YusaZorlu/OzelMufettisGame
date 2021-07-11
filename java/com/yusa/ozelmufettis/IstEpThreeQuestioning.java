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

public class IstEpThreeQuestioning extends AppCompatActivity {
    TextView rightText;
    TextView midText;
    Button q1;
    Button q2;
    Button q3;
    Button q11;
    Button q12;
    Button q13;
    Button q21;
    Button q22;
    Button q23;
    Button q231;
    Button q232;
    Button q233;
    Button q2321;
    Button q2322;
    Button q2323;
    Button q2331;
    Button q2332;
    Button q2333;
    Button q31;
    Button q32;
    Button q33;
    Button s1;
    Button s2;
    Button s3;
    Button s4;
    Button s5;
    Button s6;
    Button s7;
    Button s8;
    Button s9;
    Button s10;


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
        setContentView(R.layout.activity_ist_ep_three_questioning);
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

        rightText = findViewById(R.id.textView17);
        midText = findViewById(R.id.textView15);

        s1 = findViewById(R.id.is3s1);
        s2 = findViewById(R.id.is3s2);
        s3 = findViewById(R.id.is3s3);
        s4 = findViewById(R.id.is3s4);
        s5 = findViewById(R.id.is3s5);
        s6 = findViewById(R.id.is3s6);
        s7 = findViewById(R.id.is3s7);
        s8 = findViewById(R.id.is3s8);
        s9 = findViewById(R.id.is3s9);
        s10 = findViewById(R.id.is3s10);

        q1 = findViewById(R.id.is3Q1);
        q2 = findViewById(R.id.is3Q2);
        q3 = findViewById(R.id.is3Q3);
        q11 = findViewById(R.id.is3Q11);
        q12 = findViewById(R.id.is3Q12);
        q13 = findViewById(R.id.is3Q13);
        q21 = findViewById(R.id.is3Q21);
        q22 = findViewById(R.id.is3Q22);
        q23 = findViewById(R.id.is3Q23);
        q31 = findViewById(R.id.is3Q31);
        q32 = findViewById(R.id.is3Q32);
        q33 = findViewById(R.id.is3Q33);
        q231 = findViewById(R.id.is3Q231);
        q232 = findViewById(R.id.is3Q232);
        q233 = findViewById(R.id.is3Q233);
        q2321 = findViewById(R.id.is3Q2321);
        q2322 = findViewById(R.id.is3Q2322);
        q2323 = findViewById(R.id.is3Q2323);
        q2331 = findViewById(R.id.is3Q2331);
        q2332 = findViewById(R.id.is3Q2332);
        q2333 = findViewById(R.id.is3Q2333);


        // onclick listeners
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Ali");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Arif");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Burak");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Demir");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Emir");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Ersin");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Hakan");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Hayri");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Mehmet");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midText.setText("Orhan");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.GONE);
                q2322.setVisibility(View.GONE);
                q2323.setVisibility(View.GONE);
                q2331.setVisibility(View.GONE);
                q2332.setVisibility(View.GONE);
                q2333.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });


        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q11.setVisibility(View.VISIBLE);
                q12.setVisibility(View.VISIBLE);
                q13.setVisibility(View.VISIBLE);
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Sabah Ersinin" +
                            " bağrışına uyandım. Sonra ambulansı ve polisi aradık.");
                    q13.setText("yatağında kan gördün mü");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Sabah odada telefonda" +
                            " takılıyordum içeriden bağırış sesleri geldi gidip baktığımda" +
                            " ölmüş halde bulduk.");
                    q13.setText("olmaması gereken bir şey gördünüz mü");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Ben uyuyordum," +
                            " uyandığımda çoktan ambulans ve polisi aramışlardı.");
                    q13.setText("Normalde en erken kim kalkar");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Tuvalete kalkmıştım" +
                            " sonra Emirin bağırışını duydum. Ersinle beraber ambulansı" +
                            " ve polisi aradık.");
                    q13.setText("Tuvalete kalktığında ses duymuş muydun");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Uyuyordum. Uyandığımda" +
                            " ambulansı aradık dedi arkadaşlar ambulansı bekledik beraber.");
                    q13.setText("Sabah seni kaldıran kimdi");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("Aynı odada kalıyorduk. Uyandığımda kafasının üzerine yastık" +
                            " basılmış haldeydi. Dokundum ittirdim kalkmayınca bağırdım ve sonra " +
                            "Demir geldi beraber ambulansı aradık.");
                    q13.setText("Normalde aranızda en çabuk kim sinirlenir");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Üst katta yatıyordum ben." +
                            "Anlatacak pek bir şey olmadı Ali benden daha iyi anlatır.");
                    q13.setText("ölüyle kavgalı olan var mıydı");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Ben hayri. Ben o sabah" +
                            " uyuyordum.Ben Ersinin bağırmasına uyandım. Ben Ersinin yanına gittim." +
                            " Ben ve Ersin,Ali, Arif,Emir, Orhan, polisi bekledik ");
                    q13.setText("Cümlelere neden hep ben le başlıyorsun");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Uyandım. Öldüğünü gördüm." +
                            " Ambulanslar geldi. Bence Ersine sorun çünkü ilk o görmüş öldüğünü");
                    q13.setText("Sabah seni kaldıran kimdi");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Dün sabahı anlatabilir misin?\n-Uykum çok açıktır." +
                            " Ersin bağırır bağırmaz kalktım ben gelesiye ambulansı aramışlar" +
                            " beraber bekledik bir iki arkadaş daha geldi de.");
                    q13.setText("odasında şüphe verici bir şey gördün mü");
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
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n- Akşam çiğköfteli" +
                            " eğlence yaptık ben akşam ayıktım ama saat 1 de uyudum.");
                    q23.setText("Evi ne zaman tuttunuz");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Akşamki eğlenceden" +
                            " sonra salonda sızmışım.");
                    q23.setText("Kimin sinirleri çabuk bozulur");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n- Gece 3 e kadar" +
                            " laptoptan ben, Emir, Mehmet, ölen arkadaşımız ve Hakan Counter oynadık.");
                    q23.setText("Oyunda ne oldu");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Partiledik çiğ köfteyşi gömdüük" +
                            ". En son kafam güzeldi, kafayı koydum yattım gece 2 gibi.");
                    q23.setText("Aranızda gruplaşma var mı");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Gece Counter oynadık" +
                            " sonra odama geçtim telefona bakıp yattım.");
                    q23.setText("Telefonu bıraktığında saat kaçtı");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Benim aklım yerinde" +
                            " değildi desem. Çiğköfteden sonrasını hatırlamıyorum keşke ayık " +
                            "olsaydım en azından kim öldürdü bilirdim.");
                    q23.setText("Oda arkadaşın hakkında");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Akşam bişiler gömdük." +
                            " Geceye kadar akradaşlarla oyundaydık");
                    q23.setText("Oyun içinde ne oldu");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n- Ben hayri. Ben gece" +
                            " odamdaydım. Ben kız arkadaşımla 4 e kadar konuştum. Ben 4:30 gibi uyudum.");
                    q23.setText("Son baktığında saat kaçtı");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Akşam parti yaptık" +
                            " gece counter girdik. Ölen arkadaş bizi iyi oynamıyoruz diye tersledi" +
                            " ama ciddi bir şey değil gibiydi 3 çeyrekde ben uyudum odada en son" +
                            " Hayri en son kız arkadaşıyla konuşuyordu.");
                    q23.setText("En çok seni mi terslerdi");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Gece direkt aklımdan" +
                            " silinmiş. Galiba 5 kişi toplanıp rekabetçi counter girmişti arkadaşlar.");
                    q23.setText("Emin misin");
                }

            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q31.setVisibility(View.VISIBLE);
                q32.setVisibility(View.VISIBLE);
                q33.setVisibility(View.VISIBLE);
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n-Aramızdan" +
                            " biri olduğuna eminsek bence Orhan.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n-Belki Hayri olabilir birbirini" +
                            " çok sevmezlerdi zaten Hayrinin konuşması da bir değişik");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n-Orhandan şüpheleniyorum.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n- Ersinden tabii ki ama" +
                            " emin olamıyorum.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n-Hayriyi sevmezdi.Bence Hayri.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n - Benim gözümde en şüpheli" +
                            " kişi Hakan... pardon Hayri diyecektim karıştı.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n- Emirden şüpheleniyorum.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n-Ben Ersinden şüpheleniyorum.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n- Emir bence.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Kimden şüpheleniyorsun?\n- Ersin olabilir.");
                }

            }
        });

        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Odada tek başına mıydın?\n- Hakanla kalıyordum" +
                            " kalktığımda yatıyordu odada.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Odada tek başına mıydın?\n- Burak vardı normalde ama" +
                            " ben salonda sızmışım.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Odada tek başına mıydın?\n- Arif salonda sızınca evet tek" +
                            " başımaydım.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Odada tek başına mıydın?\n-Evet tek başımaydım.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Odada tek başına mıydın?\n- Mehmetle aynı odadaydık ben" +
                            " kalktığımda odada değildi ama.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Odada tek başına mıydın?\n-Ölüyle aynı odadaydım... ");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Odada tek başına mıydın?\n-Ali benden önce kalkmış ben" +
                            " kalktığımda ondan öğrendim olanları.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Odada tek başına mıydın?\n- Ben tek başımaydım. Evet.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Odada tek başına mıydın?\n-Emirle kalıyorduk. oyundan " +
                            "sonra geçtik odaya. ");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Odada tek başına mıydın?\n- Evet");
                }

            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır, niye ki?");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır, herkes" +
                            " şaşkınlık içerisindeydi");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır, mutlu " +
                            "ya da eğlenmiş görünen biri yoktu.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır. Bu soruyla" +
                            " neye ulaşmaya çalışıyorsunuz?");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır, panik" +
                            " olmuştuk.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır, dikkat" +
                            " edemedim de zaten olayın şokundan.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır. Ben " +
                            "şüpheli bir davranış görmedim.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Tepkisine şaşırdığın birisi var mıydı?\n- Hayır yok.");
                }

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Ölünün yatağında kan gördün mü?\n-Kan görmediğime" +
                            " eminim banyolarda da kan görmedim.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Odanın içerisinde olmaması gereken bir şey gördünüz mü?\n" +
                            "-Hayır ama ölünün üstünde bir altında bir iki yastık vardı. Normalde " +
                            "iki yastık kullanmazdı.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("is3placeQ1",true).apply();
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Normalde en erken kim kalkar.\n-Ali de Ersin de erkencidir" +
                            " normalde.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Tuvalete kalktığında ses duymuş muydun?\n-Uyandığımdan ölüyü" +
                            " görene kadar şüpheli bir ses duymadım ben uyurken" +
                            " öldürüldüpüne eminim.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Sabah seni kaldıran kimdi?\n-Ali kaldırdı galiba.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Normalde aranızda en çabuk kim sinirlenir?\n-Emir çok kolay" +
                            " sinirlenir.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Aranızda ölüyle kavgalı olan var mıydı?\n-Hayır ama Hayriyi" +
                            " çok sevmezdi.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Sürekli cümleye başlamanın geçmişi var mıdır?\n-Ben bu" +
                            " şekilde konuşmayı seviyorum. Sağlık sorunu ya da tikim yok mesela bu" +
                            " cümlede kullanmadım.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Sabah seni kaldıran kimdi?\n- Aliydi.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Ölünün odasında şüphe verici bir şey gördün mü?\n- Kafasının" +
                            " üstündeki yastıkla boğulduğunu düşünürsek ikinci yastık incelenmeli.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("is3placeQ1",true).apply();
                }

            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Hayır" +
                            " çünkü erken yattım.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Salonda" +
                            " sızdığım için bir fikrim yok.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Arifi" +
                            " kaldırıp yatağa götürmeye çalıştım kalkmadı. Sabah 6 da bile anca ayakta" +
                            " duruyordu.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Arifin" +
                            " mecali olduğunu düşünmüyorum.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Yok.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-" +
                            "Bilemiyorum ama sessizce odaya girmek için ayık olmak gerekir gibi.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Arifin" +
                            " olmadığından yüzde 99 eminim.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Ben" +
                            " telefonla konuştuktan sonra Arifi hala sağlam uyurken gördüm.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Yok.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Yapmadığına kesinlikle emin olduğun biri var mı?\n-Benim" +
                            " gece geneli hafızam silinmiş.");
                }


            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n- Ben yatarken hala" +
                            " oyun oynuyorlardı.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Akşam saatlerinde" +
                            " gördüm.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Oyundan sonra odama" +
                            " gittim yattım gece 3 gibiydi.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Gece 2 gibi oyundaydı.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n- 4 gibi oyundan sonra" +
                            " sonra yatıp uyudum tabi.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Akşam gördüm ama tam" +
                            " saat veremiyorum.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Oyun bittikten sonra" +
                            " 3 buçuk gibi ben yatarken Ersinle oyun hakkında tartışıyorlardı.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Ben telefon" +
                            " konuşmasından önce oyundayken gördüm.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Üç çeyrekte odama" +
                            " çekildim en son Hakan Ersin ve ölü arkadaş kalmıştı.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Benim aklımda bir " +
                            "şey yok oyun oynayan ekibe sorun derim.");
                }

            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q231.setVisibility(View.VISIBLE);
                q232.setVisibility(View.VISIBLE);
                q233.setVisibility(View.VISIBLE);
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Bu evi tutmaya ne zaman karar verdiniz?\n-Yaklaşık 2 ay önce");
                    q231.setText("Evi kim seçti");
                    q232.setText("Kirası çok mu");
                    q233.setText("Sabıkası olan var mı");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Aranızda sinirleri çabuk bozulan birisi var mı?\n-Emirin s" +
                            "inirleri çok çabuk bozulur.");
                    q231.setText("Sabıkası var mı");
                    q232.setText("Sinirlenince davranışı");
                    q233.setText("Ailesinde durumu");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Oyunda neler oldu?\n-Nasıl yani?");
                    q231.setText("Mesela kavga");
                    q232.setText("Mesela hassas değerlere hakaret");
                    q233.setText("Mesela küfürleşme");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Arkadaşlarının arasında gruplaşma var mı?\n-Gruplaşma değil" +
                            " de herkesin daha samimi olduğu birileri var diyelim.");
                    q231.setText("Senin kim");
                    q232.setText("Ölünün kim");
                    q233.setText("Diğerlerinin kim");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Telefonu bıraktığında saat kaçtı?\n-4 buçuk gibiydi.");
                    q231.setText("Ses duydun mu");
                    q232.setText("Varsayalım ki");
                    q233.setText("Telefonda ne yapıyordun");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Oda arkadaşın yani ölen arkadaş hakkında daha detaylı bilgi" +
                            " verebilir misin?\n-Mesela ne hakkında?");
                    q231.setText("En iyi anlaştığı kim");
                    q232.setText("Borcu var mıydı");
                    q233.setText("Kavga etmeyi sever mi");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oyun boyunca neler oldu anlatabilir misin?\n-Yenildik.");
                    q231.setText("Ciddi mi oynadınız");
                    q232.setText("Öncesi tartışma oldu mu");
                    q233.setText("Sonrası tartışma oldu mu");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Saate baktığında saat en son kaçtı?\n-Ben baktığımda " +
                            "4 buçuk gibiydi");
                    q231.setText("Ses duydun mu");
                    q232.setText("Yatmadan ne yaptın");
                    q233.setText("Dikkatini çeken bir şey");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+En çok seni mi tersledi?\n-Hayır " +
                            "Emirle daha çok tersleştiler");
                    q231.setText("Senle kavga ettiler mi");
                    q232.setText("Aranızda siyasi tartışma oldu mu");
                    q233.setText("Hep böyle tersler mi");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Geceye dair bir şey hatırlamadığına emin misin?\n-Eminim.");
                }
                q231.setText("Son kararın mı");
                q232.setText("Muhebettin güzel mi");
                q233.setText("Zararlı alışkanlığın var mı");
            }
        });
        q231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Bu evi seçen kimdi?\n-O işleri Orhan halletmişti.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Emirin sabıkası var mı?\n-Hayır ama olmaya yaklaştı.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Mesela birisiyle kavga?\n-Hayır olmadı.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Senin en iyi arkadaşın?\n-Orhanla en iyi arkadaşız.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Uyuyana kadar herhangi bir ses duydun mu?\n-Birisi" +
                            " tuvalete gitti galiba.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Aranızda en iyi anlaştığı kişi?\n-Benle en iyi anlaşırdı.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oyunu ciddi mi oynadınız?\n-Ölen arkadaş hırslı olduğundan" +
                            " her oyunu ciddi oynardı.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Ses duydun mu?\n- Ben ses duymadım, hayır.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Ölen arkadaş ya da Emir senle kavga ettiler mi?\n-" +
                            "Hayır. Birbirleriyle didişiyorlardı.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Son kararın mı?\n-Son kararım.");
                }

            }
        });
        q232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2321.setVisibility(View.VISIBLE);
                q2322.setVisibility(View.VISIBLE);
                q2323.setVisibility(View.VISIBLE);
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Peki sizin için kirası çok mu? \n-Hayır.");
                    q2321.setText("Maddi durumu kötü olan var mı");
                    q2322.setText("Sen ödemedin tartışması oldu mu");
                    q2323.setText("Yaş farkı çok mu");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Sinirlendiğinde nasıl davranır?\n-Genellikle duvara yumruk" +
                            " atar.");
                    q2321.setText("Başkalarına yasıtır mı");
                    q2322.setText("Tedavi gördü mü");
                    q2323.setText("Pişman olursa ne yapar");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Mesela birilerinin hassas değerlerine hakaret?\n-Hayır.");
                    q2321.setText("Alıngan biri var mı");
                    q2322.setText("Hakaret için öldürecek birisi var mı");
                    q2323.setText("Çok uğraştığı birisi var mı");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ölünün en iyi arkadaşı?\n-Ersin en yakın dostuydu.");
                    q2321.setText("Ersinle kavgaları oldu mu");
                    q2322.setText("Ersin öldürebilecek birisi mi");
                    q2323.setText("Ersinle problemli biri var mı");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Varsayalım kameraların kör noktası olsa duyar mıydın" +
                            " içeri gireni?\n-Evet duyardım.");
                    q2321.setText("Peki uykun derin midir");
                    q2322.setText("Ses yalıtımı iyi midir");
                    q2323.setText("Ölü güçlü müydü");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Birisine borcu var mıydı?\n-Bana 50 lira borcu vardı.");
                    q2321.setText("Daha çok borçlu olduğu var mı");
                    q2322.setText("Borcu neye harcardı");
                    q2323.setText("Zararlı alışkanlıkları var mı");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oyun öncesinde ciddi bir tartışma olmuş muydu?\n-Normal" +
                            " sohbet etmiştik.");
                    q2321.setText("Oyuna gelmeyenler hakkında");
                    q2322.setText("Herkes aynı odada mıydı");
                    q2323.setText("Sizi kimler izledi");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Yatmadan önce bir şey yaptın mı?\n-Tuvalete gidip geldim.");
                    q2321.setText("Giderken gözüne çarpan bir şey");
                    q2322.setText("Ölünün odasından geçtin mi");
                    q2323.setText("Saat kaçtı");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Aranızda siyasi tartışma benzeri ciddi tartışmalar olur mu?\n" +
                            "-Pek olmaz.");
                    q2321.setText("Açıklar mısın");
                    q2322.setText("Dışladığınız oldu mu");
                    q2323.setText("Aranızda niye kadın yok");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Muhabbeti güzel birisine benziyorsun?\n-Öyle derler bazen.");
                    q2321.setText("Ailen ne işle meşgul");
                    q2322.setText("Çalışıyor musun");
                    q2323.setText("Kardeşin var mı");
                }
            }
        });
        q233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q231.setVisibility(View.GONE);
                q232.setVisibility(View.GONE);
                q233.setVisibility(View.GONE);
                q2331.setVisibility(View.VISIBLE);
                q2332.setVisibility(View.VISIBLE);
                q2333.setVisibility(View.VISIBLE);
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Peki aranızda sabıkası olan var mıydı?\n-Arif alkollü araba" +
                            " kullanıp ehliyeti kaptırdı diye duymuştum.");
                    q2331.setText("Alkollüyken saldırganlaşır mı");
                    q2332.setText("Kavgaya girmiş midir");
                    q2333.setText("Alkolik midir");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Ailesinde sabıkası olan var mıydı peki?\n-Babası" +
                            " kavgaya karışmış.");
                    q2331.setText("Sebebi ne");
                    q2332.setText("Tehlikeli biri mi");
                    q2333.setText("Şiddet yanlısı mı");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Birileriyle küfürleşmiş miydi?\n-Herkese bol bol söverdi" +
                            " zaten.");
                    q2331.setText("Sinirlerine hakim midir");
                    q2332.setText("Hep oynar mısınız");
                    q2333.setText("En çok kime sövdü");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Diğerlerinin en iyi arkadaşı?\n-Mesela kim?");
                    q2331.setText("Mesela Hayri");
                    q2332.setText("Mesela Emir");
                    q2333.setText("Mesela Arif");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Telefonda ne yapıyordun?\n-İnternette geziniyordum.");
                    q2331.setText("Geçmişine bakabilir miyim");
                    q2332.setText("Dışardan imdat deseler duyar mısın");
                    q2333.setText("Merdivenlerden inseler duyar mısın");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Kavga etmeyi sever miydi?\n-Sözlü evet.");
                    q2331.setText("Fiziksel kavga sever mi");
                    q2332.setText("Ciddiye biner miydi");
                    q2333.setText("Sinirleri çabuk bozulan var mı");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oyun sonrası tartışma oldu mu?\n-Emirle ciddi" +
                            " tartışıyorlardı. Ben odama gittim.");
                    q2331.setText("Fiziksel temas oldu mu");
                    q2332.setText("Sakinleştirdiniz mi");
                    q2333.setText("Sen gidince ses geldi mi");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Sevgilinle konuşurken dikkatini çeken bir şey oldu mu?\n-Ben " +
                            "salonda hararetli bir tartışma duydum.");
                    q2331.setText("Kimleri duydun");
                    q2332.setText("Vurdu kırdı duydun mu");
                    q2333.setText("Ayırmaya gittin mi");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Her oyunda bu kadar çok tersler miydi?\n Hayır bu sefer " +
                            "abartmıştı.");
                    q2331.setText("Açıklar mısın");
                    q2332.setText("Arkandan kavgaya girişmiş olabilirler mi");
                    q2333.setText("Seviyeleriniz ne");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Zararlı bir alışkanlığın var mı?\n- Yasalsa ve zararlıysa " +
                            "bende kesin vardır.");
                    q231.setVisibility(View.VISIBLE);
                    q232.setVisibility(View.VISIBLE);
                    q233.setVisibility(View.VISIBLE);
                    q2331.setVisibility(View.GONE);
                    q2332.setVisibility(View.GONE);
                    q2333.setVisibility(View.GONE);
                }
            }
        });
        q2321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Maddi durumu kötü olan birisi var mı aranızda?\n-Hayır yok.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Başka insanlara yansıtır mıydı?\n-Lisedeyken sık sık kavga" +
                            " ederdi sonradan bıraktı kavgacılığı en azından.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Aranızda alıngan biri var mı?\n-Hayri bazen çok" +
                            " alınganlık yapar.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ersinle hiç kavgaları oldu mu?\n-Olsa bile hemen" +
                            " barışırlardı.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Peki uykun derin midir?\n- Yorgunsam evet yoksa hayır.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Daha çok borçlu olduğu biri var mı?\n-Orhana 200 lira civarı" +
                            " borcu vardı.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Peki oyuna gelmeyenlerden ayık diyebileceğimiz kimler vardı?" +
                            "\n-Aliyle Hayri ama Ali erken yattı. ");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Tuvalete giderken gözüne bir şey çarptı mı?\n-Benim " +
                            "gözüme çarpmadı.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Pek olmaz derken açabilir misin?\n-Kimse kimseye karışmaz" +
                            " ama şakalaşırken bazen lafı geçebilir.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Ailen ne işle meşgul?\n-Devlette doktorlar.");
                }

            }
        });
        q2322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Yani sen eksik ödedin benzeri bir tartışma olmadı?" +
                            "\n-Olmadı.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Hiç tedavi gördü mü?\n-İlaç yazacaklar zaten diye gitmedi" +
                            " hiç.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Birisi hakaret etse öldürecek birisi var mı?\n-Yoktur umarım.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ersin sinirlenip adam öldürebilecek birisi" +
                            " midir?\n-Kesinlikle hayır.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Bu evde ses yalıtımı çok iyi midir?\n-Hayır hatta kötü diye" +
                            "bilirim.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Borç aldığında ne için harcardı?\n-İndirimde oyun alırdı" +
                            " mesela.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("Hepiniz aynı odada mı oynadınız?\n-Hepimiz salondaydık evet.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("Ölünün odasının önünden geçtin mi?\n-Hayır geçmedim.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Peki başka bir sebeple dışladığınız birisi oldu mu?\n-" +
                            "Kesinlikle olmadı.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Çalışıyor musun?\n-Sadece öğrenciyim çalışmıyorum.");
                }

            }
        });
        q2323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Aranızda yaş farkı çok muydu?\n Bir kaç yaş var en fazla.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Pişman olsa ne yapardı?\n-Dışarı yansıtmamaya çalışırdı.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Ölünün özellikle uğraştığı birisi var mı genelde?\n-Hayır yok.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ersinle problemi olan birisi var mı?\n-Hayır yok.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Ölen arkadaşını fiziksel kuvvetle öldürmek zor mudur?\n-" +
                            "Çok güçlü biri değildi zaten olabilir.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Zararlı alışkanlıkları var mıydı?\n-Hayır yoktu.Oyun " +
                            "bağımlılığını saymazsak tabi.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oynarken sizi izleyen birileri var mıydı?\n-Arifle Hayri bir" +
                            " süre izledi sonra Arif sızdı, Hayri de telefon konuşması yapacağım diye" +
                            " gitti gelmedi.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Saat kaçtı?\n-Ben saat 4 den sonra olduğuna " +
                            "eminim ama tam vaktini söyleyemiyorum.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Alakasız bir soru ama aranızda neden kadın yok?\n-Bilmem ki.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Kardeşin var mı?\n-2 erkek kardeşim var.");
                }

            }
        });
        q2331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Arif alkol alınca saldırganlaşır mı?\n-Pek sayılmaz.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Konusu nedir?\n-Komşu esnafı dövmüş.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Ölen arkadaş sinirlerine hakim olabilen birisi midir?\n-" +
                            "Pek değil.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Mesela Hayri?\n-Burakla Arif.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Telefon geçmişine bakabilir miyim?\n-Hayır!");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Fiziksel kavga?\n-Hayır zaten güçlü biri değildi.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Fiziksel temas oldu mu?\n-Hayır görmedim.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Kimler tartıştı?\n-Ben Emirle ölen arkadaşın sesini duydum." +
                            " Bir de Mehmet.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Nasıl yani?\n-Herkes yavaş yavaş yatmaya giderken" +
                            " hala söyleniyordu.");
                }


            }
        });
        q2332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Arif hiç kavgaya karıştı mı?\n-Hayır karışmadı.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Tehlikeli biri midir?\n-Hayır hatta bize yardım eder.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Her zaman oynar mısınız?\n-Hayır nadiren oynarız.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Mesela Emir?\n-Aliyle araları en iyiydi.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+İmdat çığlığı gelse duyar mıydın?\n-Evet büyük ihtimalle.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Kavgaları ciddiye biner miydi?\n-Bazen... Daha doğrusu" +
                            " nadiren.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Sakinleştirmeyi denediniz mi?\n- Evet ama hala sövüyolardı" +
                            " birbirlerine.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Vurdu kırdı duydun mu?\n-Hayır. Duymadım.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Sen yatağa gidince arkandan kavgaya durmuş olabilirler mi?\n-" +
                            "Zannetmiyorum duyardım çünkü.");
                }
            }
        });
        q2333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Alkol bağımlısı mıdır?\n-Sürekli almaz ama aldığında da" +
                            " sızana kadar içer.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Şiddet yanlısı mıdır?\n-Kendimi ezdirmem gerekirse fiziksel" +
                            " müdahalede bulunurum der.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+En çok kime sövdü?\n-Emir çok kötü oynuyordu en çok ona.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Mesela Arif?\n-Burakla çocukluktan arkadaşlar.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Merdivenlerden birisi inse duyar mıydın?\n-Kesinlikle " +
                            "uyanırdım.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Aranızda siniri en çabuk bozulan kim?\n-Emir var ama birini" +
                            " öldürmeyeceğini düşünüyorum.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Sen gidince ses duydun mu?\n-Duymadım.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Gürültüye yani tartışmayı ayırmaya gittin mi?\n-" +
                            "Hayır ama oyun başında onları izliyordum.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Oyunda seviyeleriniz ne merak ettim?\n-Rahmetli gümüş 3 dü" +
                            " biz ise gümüş 1 iz.");
                }

            }
        });

        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Gece gördüm Orhanı.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Akşam gördüm" +
                            " en son çiğköte yiyoduk.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Tam hatırlayamıyorum.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Gece 1 küsürde sanki.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Sevgilisiyle " +
                            "konuşmaya odasına gitmişti.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Gece gördüm.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Oyundan sonra " +
                            "salondaydılar.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Ben gece 12 de" +
                            " gördüm.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?" +
                            "\n-Ölü de o da oyundaydılar işte.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Ölmeden önce en son ne zaman gördün?\n-Gece gördüm.");
                }

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Uykusu derin değil bence " +
                            "sessiz bir cinayetse bile duyardı.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Araları çok iyi değildi " +
                            "ölen arkadaş da terslemeyi sever.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Evi de o ayarladı odaları da o" +
                            " dağıttı. Bir de derin uyumaz hiç.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Oda arkadaşı. Her ne kadar o" +
                            " gece sağlam olmasa da odana birisi girse duyarsın.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Sevgilimle konuşacağım diye gitti" +
                            " o arada plan yapmış olabilir.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Çok iyi anlaşamazlardı. Bir de " +
                            "o gece ayıkmış.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Kavgaları daha da ciddileşmiş" +
                            " olabilir ben yokken.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Ben basitçe düşündüm" +
                            " ve oda arkadaşı.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Oyundan sonra tartışıyorlardı" +
                            " Emir de biraz kinci diyebilirim.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Şüphelenme sebebin nedir?\n-Çünkü aynı odadaydılar.");
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Hayır.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Hayır, en " +
                            "azından zannetmiyorum.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Hayır.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Yok.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Hayır.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Hayır diye biliyorum.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Hayır.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Ben karışmadı diye" +
                            " biliyorum.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Hayır ama kavgalara" +
                            " girmişliği var.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Önceden bir suça karışmış mıdır?\n-Yok, karışmadı.");
                }

            }
        });

    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), IstEpThree.class);
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
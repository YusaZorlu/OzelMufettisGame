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
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-Sabah Ersinin" +
                            " ba??r??????na uyand??m. Sonra ambulans?? ve polisi arad??k.");
                    q13.setText("yata????nda kan g??rd??n m??");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-Sabah odada telefonda" +
                            " tak??l??yordum i??eriden ba????r???? sesleri geldi gidip bakt??????mda" +
                            " ??lm???? halde bulduk.");
                    q13.setText("olmamas?? gereken bir ??ey g??rd??n??z m??");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-Ben uyuyordum," +
                            " uyand??????mda ??oktan ambulans ve polisi aram????lard??.");
                    q13.setText("Normalde en erken kim kalkar");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-Tuvalete kalkm????t??m" +
                            " sonra Emirin ba????r??????n?? duydum. Ersinle beraber ambulans??" +
                            " ve polisi arad??k.");
                    q13.setText("Tuvalete kalkt??????nda ses duymu?? muydun");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-Uyuyordum. Uyand??????mda" +
                            " ambulans?? arad??k dedi arkada??lar ambulans?? bekledik beraber.");
                    q13.setText("Sabah seni kald??ran kimdi");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("Ayn?? odada kal??yorduk. Uyand??????mda kafas??n??n ??zerine yast??k" +
                            " bas??lm???? haldeydi. Dokundum ittirdim kalkmay??nca ba????rd??m ve sonra " +
                            "Demir geldi beraber ambulans?? arad??k.");
                    q13.setText("Normalde aran??zda en ??abuk kim sinirlenir");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-??st katta yat??yordum ben." +
                            "Anlatacak pek bir ??ey olmad?? Ali benden daha iyi anlat??r.");
                    q13.setText("??l??yle kavgal?? olan var m??yd??");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-Ben hayri. Ben o sabah" +
                            " uyuyordum.Ben Ersinin ba????rmas??na uyand??m. Ben Ersinin yan??na gittim." +
                            " Ben ve Ersin,Ali, Arif,Emir, Orhan, polisi bekledik ");
                    q13.setText("C??mlelere neden hep ben le ba??l??yorsun");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-Uyand??m. ??ld??????n?? g??rd??m." +
                            " Ambulanslar geldi. Bence Ersine sorun ????nk?? ilk o g??rm???? ??ld??????n??");
                    q13.setText("Sabah seni kald??ran kimdi");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+D??n sabah?? anlatabilir misin?\n-Uykum ??ok a????kt??r." +
                            " Ersin ba????r??r ba????rmaz kalkt??m ben gelesiye ambulans?? aram????lar" +
                            " beraber bekledik bir iki arkada?? daha geldi de.");
                    q13.setText("odas??nda ????phe verici bir ??ey g??rd??n m??");
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
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n- Ak??am ??i??k??fteli" +
                            " e??lence yapt??k ben ak??am ay??kt??m ama saat 1 de uyudum.");
                    q23.setText("Evi ne zaman tuttunuz");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Ak??amki e??lenceden" +
                            " sonra salonda s??zm??????m.");
                    q23.setText("Kimin sinirleri ??abuk bozulur");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n- Gece 3 e kadar" +
                            " laptoptan ben, Emir, Mehmet, ??len arkada????m??z ve Hakan Counter oynad??k.");
                    q23.setText("Oyunda ne oldu");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Partiledik ??i?? k??ftey??i g??md????k" +
                            ". En son kafam g??zeldi, kafay?? koydum yatt??m gece 2 gibi.");
                    q23.setText("Aran??zda grupla??ma var m??");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Gece Counter oynad??k" +
                            " sonra odama ge??tim telefona bak??p yatt??m.");
                    q23.setText("Telefonu b??rakt??????nda saat ka??t??");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Benim akl??m yerinde" +
                            " de??ildi desem. ??i??k??fteden sonras??n?? hat??rlam??yorum ke??ke ay??k " +
                            "olsayd??m en az??ndan kim ??ld??rd?? bilirdim.");
                    q23.setText("Oda arkada????n hakk??nda");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Ak??am bi??iler g??md??k." +
                            " Geceye kadar akrada??larla oyundayd??k");
                    q23.setText("Oyun i??inde ne oldu");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n- Ben hayri. Ben gece" +
                            " odamdayd??m. Ben k??z arkada????mla 4 e kadar konu??tum. Ben 4:30 gibi uyudum.");
                    q23.setText("Son bakt??????nda saat ka??t??");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Ak??am parti yapt??k" +
                            " gece counter girdik. ??len arkada?? bizi iyi oynam??yoruz diye tersledi" +
                            " ama ciddi bir ??ey de??il gibiydi 3 ??eyrekde ben uyudum odada en son" +
                            " Hayri en son k??z arkada????yla konu??uyordu.");
                    q23.setText("En ??ok seni mi terslerdi");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Evvelsi geceyi anlatabilir misin?\n-Gece direkt akl??mdan" +
                            " silinmi??. Galiba 5 ki??i toplan??p rekabet??i counter girmi??ti arkada??lar.");
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
                    rightText.setText("+Kimden ????pheleniyorsun?\n-Aram??zdan" +
                            " biri oldu??una eminsek bence Orhan.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n-Belki Hayri olabilir birbirini" +
                            " ??ok sevmezlerdi zaten Hayrinin konu??mas?? da bir de??i??ik");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n-Orhandan ????pheleniyorum.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n- Ersinden tabii ki ama" +
                            " emin olam??yorum.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n-Hayriyi sevmezdi.Bence Hayri.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n - Benim g??z??mde en ????pheli" +
                            " ki??i Hakan... pardon Hayri diyecektim kar????t??.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n- Emirden ????pheleniyorum.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n-Ben Ersinden ????pheleniyorum.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n- Emir bence.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Kimden ????pheleniyorsun?\n- Ersin olabilir.");
                }

            }
        });

        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n- Hakanla kal??yordum" +
                            " kalkt??????mda yat??yordu odada.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n- Burak vard?? normalde ama" +
                            " ben salonda s??zm??????m.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n- Arif salonda s??z??nca evet tek" +
                            " ba????mayd??m.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n-Evet tek ba????mayd??m.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n- Mehmetle ayn?? odadayd??k ben" +
                            " kalkt??????mda odada de??ildi ama.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n-??l??yle ayn?? odadayd??m... ");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n-Ali benden ??nce kalkm???? ben" +
                            " kalkt??????mda ondan ????rendim olanlar??.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n- Ben tek ba????mayd??m. Evet.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n-Emirle kal??yorduk. oyundan " +
                            "sonra ge??tik odaya. ");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Odada tek ba????na m??yd??n?\n- Evet");
                }

            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r, niye ki?");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r, herkes" +
                            " ??a??k??nl??k i??erisindeydi");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r, mutlu " +
                            "ya da e??lenmi?? g??r??nen biri yoktu.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r. Bu soruyla" +
                            " neye ula??maya ??al??????yorsunuz?");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r, panik" +
                            " olmu??tuk.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r, dikkat" +
                            " edemedim de zaten olay??n ??okundan.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r. Ben " +
                            "????pheli bir davran???? g??rmedim.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Tepkisine ??a????rd??????n birisi var m??yd???\n- Hay??r yok.");
                }

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+??l??n??n yata????nda kan g??rd??n m???\n-Kan g??rmedi??ime" +
                            " eminim banyolarda da kan g??rmedim.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Odan??n i??erisinde olmamas?? gereken bir ??ey g??rd??n??z m???\n" +
                            "-Hay??r ama ??l??n??n ??st??nde bir alt??nda bir iki yast??k vard??. Normalde " +
                            "iki yast??k kullanmazd??.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("is3placeQ1",true).apply();
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Normalde en erken kim kalkar.\n-Ali de Ersin de erkencidir" +
                            " normalde.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Tuvalete kalkt??????nda ses duymu?? muydun?\n-Uyand??????mdan ??l??y??" +
                            " g??rene kadar ????pheli bir ses duymad??m ben uyurken" +
                            " ??ld??r??ld??p??ne eminim.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Sabah seni kald??ran kimdi?\n-Ali kald??rd?? galiba.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Normalde aran??zda en ??abuk kim sinirlenir?\n-Emir ??ok kolay" +
                            " sinirlenir.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Aran??zda ??l??yle kavgal?? olan var m??yd???\n-Hay??r ama Hayriyi" +
                            " ??ok sevmezdi.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+S??rekli c??mleye ba??laman??n ge??mi??i var m??d??r?\n-Ben bu" +
                            " ??ekilde konu??may?? seviyorum. Sa??l??k sorunu ya da tikim yok mesela bu" +
                            " c??mlede kullanmad??m.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Sabah seni kald??ran kimdi?\n- Aliydi.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+??l??n??n odas??nda ????phe verici bir ??ey g??rd??n m???\n- Kafas??n??n" +
                            " ??st??ndeki yast??kla bo??uldu??unu d??????n??rsek ikinci yast??k incelenmeli.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("is3placeQ1",true).apply();
                }

            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Hay??r" +
                            " ????nk?? erken yatt??m.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Salonda" +
                            " s??zd??????m i??in bir fikrim yok.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Arifi" +
                            " kald??r??p yata??a g??t??rmeye ??al????t??m kalkmad??. Sabah 6 da bile anca ayakta" +
                            " duruyordu.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Arifin" +
                            " mecali oldu??unu d??????nm??yorum.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Yok.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-" +
                            "Bilemiyorum ama sessizce odaya girmek i??in ay??k olmak gerekir gibi.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Arifin" +
                            " olmad??????ndan y??zde 99 eminim.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Ben" +
                            " telefonla konu??tuktan sonra Arifi hala sa??lam uyurken g??rd??m.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Yok.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Yapmad??????na kesinlikle emin oldu??un biri var m???\n-Benim" +
                            " gece geneli haf??zam silinmi??.");
                }


            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n- Ben yatarken hala" +
                            " oyun oynuyorlard??.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Ak??am saatlerinde" +
                            " g??rd??m.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Oyundan sonra odama" +
                            " gittim yatt??m gece 3 gibiydi.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Gece 2 gibi oyundayd??.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n- 4 gibi oyundan sonra" +
                            " sonra yat??p uyudum tabi.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Ak??am g??rd??m ama tam" +
                            " saat veremiyorum.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Oyun bittikten sonra" +
                            " 3 bu??uk gibi ben yatarken Ersinle oyun hakk??nda tart??????yorlard??.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Ben telefon" +
                            " konu??mas??ndan ??nce oyundayken g??rd??m.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-???? ??eyrekte odama" +
                            " ??ekildim en son Hakan Ersin ve ??l?? arkada?? kalm????t??.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Benim akl??mda bir " +
                            "??ey yok oyun oynayan ekibe sorun derim.");
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
                    rightText.setText("+Bu evi tutmaya ne zaman karar verdiniz?\n-Yakla????k 2 ay ??nce");
                    q231.setText("Evi kim se??ti");
                    q232.setText("Kiras?? ??ok mu");
                    q233.setText("Sab??kas?? olan var m??");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Aran??zda sinirleri ??abuk bozulan birisi var m???\n-Emirin s" +
                            "inirleri ??ok ??abuk bozulur.");
                    q231.setText("Sab??kas?? var m??");
                    q232.setText("Sinirlenince davran??????");
                    q233.setText("Ailesinde durumu");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Oyunda neler oldu?\n-Nas??l yani?");
                    q231.setText("Mesela kavga");
                    q232.setText("Mesela hassas de??erlere hakaret");
                    q233.setText("Mesela k??f??rle??me");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Arkada??lar??n??n aras??nda grupla??ma var m???\n-Grupla??ma de??il" +
                            " de herkesin daha samimi oldu??u birileri var diyelim.");
                    q231.setText("Senin kim");
                    q232.setText("??l??n??n kim");
                    q233.setText("Di??erlerinin kim");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Telefonu b??rakt??????nda saat ka??t???\n-4 bu??uk gibiydi.");
                    q231.setText("Ses duydun mu");
                    q232.setText("Varsayal??m ki");
                    q233.setText("Telefonda ne yap??yordun");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Oda arkada????n yani ??len arkada?? hakk??nda daha detayl?? bilgi" +
                            " verebilir misin?\n-Mesela ne hakk??nda?");
                    q231.setText("En iyi anla??t?????? kim");
                    q232.setText("Borcu var m??yd??");
                    q233.setText("Kavga etmeyi sever mi");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oyun boyunca neler oldu anlatabilir misin?\n-Yenildik.");
                    q231.setText("Ciddi mi oynad??n??z");
                    q232.setText("??ncesi tart????ma oldu mu");
                    q233.setText("Sonras?? tart????ma oldu mu");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Saate bakt??????nda saat en son ka??t???\n-Ben bakt??????mda " +
                            "4 bu??uk gibiydi");
                    q231.setText("Ses duydun mu");
                    q232.setText("Yatmadan ne yapt??n");
                    q233.setText("Dikkatini ??eken bir ??ey");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+En ??ok seni mi tersledi?\n-Hay??r " +
                            "Emirle daha ??ok tersle??tiler");
                    q231.setText("Senle kavga ettiler mi");
                    q232.setText("Aran??zda siyasi tart????ma oldu mu");
                    q233.setText("Hep b??yle tersler mi");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Geceye dair bir ??ey hat??rlamad??????na emin misin?\n-Eminim.");
                }
                q231.setText("Son karar??n m??");
                q232.setText("Muhebettin g??zel mi");
                q233.setText("Zararl?? al????kanl??????n var m??");
            }
        });
        q231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Bu evi se??en kimdi?\n-O i??leri Orhan halletmi??ti.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Emirin sab??kas?? var m???\n-Hay??r ama olmaya yakla??t??.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Mesela birisiyle kavga?\n-Hay??r olmad??.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Senin en iyi arkada????n?\n-Orhanla en iyi arkada????z.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Uyuyana kadar herhangi bir ses duydun mu?\n-Birisi" +
                            " tuvalete gitti galiba.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Aran??zda en iyi anla??t?????? ki??i?\n-Benle en iyi anla????rd??.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oyunu ciddi mi oynad??n??z?\n-??len arkada?? h??rsl?? oldu??undan" +
                            " her oyunu ciddi oynard??.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Ses duydun mu?\n- Ben ses duymad??m, hay??r.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+??len arkada?? ya da Emir senle kavga ettiler mi?\n-" +
                            "Hay??r. Birbirleriyle didi??iyorlard??.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Son karar??n m???\n-Son karar??m.");
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
                    rightText.setText("+Peki sizin i??in kiras?? ??ok mu? \n-Hay??r.");
                    q2321.setText("Maddi durumu k??t?? olan var m??");
                    q2322.setText("Sen ??demedin tart????mas?? oldu mu");
                    q2323.setText("Ya?? fark?? ??ok mu");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Sinirlendi??inde nas??l davran??r?\n-Genellikle duvara yumruk" +
                            " atar.");
                    q2321.setText("Ba??kalar??na yas??t??r m??");
                    q2322.setText("Tedavi g??rd?? m??");
                    q2323.setText("Pi??man olursa ne yapar");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Mesela birilerinin hassas de??erlerine hakaret?\n-Hay??r.");
                    q2321.setText("Al??ngan biri var m??");
                    q2322.setText("Hakaret i??in ??ld??recek birisi var m??");
                    q2323.setText("??ok u??ra??t?????? birisi var m??");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+??l??n??n en iyi arkada?????\n-Ersin en yak??n dostuydu.");
                    q2321.setText("Ersinle kavgalar?? oldu mu");
                    q2322.setText("Ersin ??ld??rebilecek birisi mi");
                    q2323.setText("Ersinle problemli biri var m??");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Varsayal??m kameralar??n k??r noktas?? olsa duyar m??yd??n" +
                            " i??eri gireni?\n-Evet duyard??m.");
                    q2321.setText("Peki uykun derin midir");
                    q2322.setText("Ses yal??t??m?? iyi midir");
                    q2323.setText("??l?? g????l?? m??yd??");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Birisine borcu var m??yd???\n-Bana 50 lira borcu vard??.");
                    q2321.setText("Daha ??ok bor??lu oldu??u var m??");
                    q2322.setText("Borcu neye harcard??");
                    q2323.setText("Zararl?? al????kanl??klar?? var m??");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oyun ??ncesinde ciddi bir tart????ma olmu?? muydu?\n-Normal" +
                            " sohbet etmi??tik.");
                    q2321.setText("Oyuna gelmeyenler hakk??nda");
                    q2322.setText("Herkes ayn?? odada m??yd??");
                    q2323.setText("Sizi kimler izledi");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Yatmadan ??nce bir ??ey yapt??n m???\n-Tuvalete gidip geldim.");
                    q2321.setText("Giderken g??z??ne ??arpan bir ??ey");
                    q2322.setText("??l??n??n odas??ndan ge??tin mi");
                    q2323.setText("Saat ka??t??");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Aran??zda siyasi tart????ma benzeri ciddi tart????malar olur mu?\n" +
                            "-Pek olmaz.");
                    q2321.setText("A????klar m??s??n");
                    q2322.setText("D????lad??????n??z oldu mu");
                    q2323.setText("Aran??zda niye kad??n yok");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Muhabbeti g??zel birisine benziyorsun?\n-??yle derler bazen.");
                    q2321.setText("Ailen ne i??le me??gul");
                    q2322.setText("??al??????yor musun");
                    q2323.setText("Karde??in var m??");
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
                    rightText.setText("+Peki aran??zda sab??kas?? olan var m??yd???\n-Arif alkoll?? araba" +
                            " kullan??p ehliyeti kapt??rd?? diye duymu??tum.");
                    q2331.setText("Alkoll??yken sald??rganla????r m??");
                    q2332.setText("Kavgaya girmi?? midir");
                    q2333.setText("Alkolik midir");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Ailesinde sab??kas?? olan var m??yd?? peki?\n-Babas??" +
                            " kavgaya kar????m????.");
                    q2331.setText("Sebebi ne");
                    q2332.setText("Tehlikeli biri mi");
                    q2333.setText("??iddet yanl??s?? m??");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Birileriyle k??f??rle??mi?? miydi?\n-Herkese bol bol s??verdi" +
                            " zaten.");
                    q2331.setText("Sinirlerine hakim midir");
                    q2332.setText("Hep oynar m??s??n??z");
                    q2333.setText("En ??ok kime s??vd??");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Di??erlerinin en iyi arkada?????\n-Mesela kim?");
                    q2331.setText("Mesela Hayri");
                    q2332.setText("Mesela Emir");
                    q2333.setText("Mesela Arif");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Telefonda ne yap??yordun?\n-??nternette geziniyordum.");
                    q2331.setText("Ge??mi??ine bakabilir miyim");
                    q2332.setText("D????ardan imdat deseler duyar m??s??n");
                    q2333.setText("Merdivenlerden inseler duyar m??s??n");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Kavga etmeyi sever miydi?\n-S??zl?? evet.");
                    q2331.setText("Fiziksel kavga sever mi");
                    q2332.setText("Ciddiye biner miydi");
                    q2333.setText("Sinirleri ??abuk bozulan var m??");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oyun sonras?? tart????ma oldu mu?\n-Emirle ciddi" +
                            " tart??????yorlard??. Ben odama gittim.");
                    q2331.setText("Fiziksel temas oldu mu");
                    q2332.setText("Sakinle??tirdiniz mi");
                    q2333.setText("Sen gidince ses geldi mi");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Sevgilinle konu??urken dikkatini ??eken bir ??ey oldu mu?\n-Ben " +
                            "salonda hararetli bir tart????ma duydum.");
                    q2331.setText("Kimleri duydun");
                    q2332.setText("Vurdu k??rd?? duydun mu");
                    q2333.setText("Ay??rmaya gittin mi");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Her oyunda bu kadar ??ok tersler miydi?\n Hay??r bu sefer " +
                            "abartm????t??.");
                    q2331.setText("A????klar m??s??n");
                    q2332.setText("Arkandan kavgaya giri??mi?? olabilirler mi");
                    q2333.setText("Seviyeleriniz ne");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Zararl?? bir al????kanl??????n var m???\n- Yasalsa ve zararl??ysa " +
                            "bende kesin vard??r.");
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
                    rightText.setText("+Maddi durumu k??t?? olan birisi var m?? aran??zda?\n-Hay??r yok.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Ba??ka insanlara yans??t??r m??yd???\n-Lisedeyken s??k s??k kavga" +
                            " ederdi sonradan b??rakt?? kavgac??l?????? en az??ndan.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Aran??zda al??ngan biri var m???\n-Hayri bazen ??ok" +
                            " al??nganl??k yapar.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ersinle hi?? kavgalar?? oldu mu?\n-Olsa bile hemen" +
                            " bar??????rlard??.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Peki uykun derin midir?\n- Yorgunsam evet yoksa hay??r.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Daha ??ok bor??lu oldu??u biri var m???\n-Orhana 200 lira civar??" +
                            " borcu vard??.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Peki oyuna gelmeyenlerden ay??k diyebilece??imiz kimler vard???" +
                            "\n-Aliyle Hayri ama Ali erken yatt??. ");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Tuvalete giderken g??z??ne bir ??ey ??arpt?? m???\n-Benim " +
                            "g??z??me ??arpmad??.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Pek olmaz derken a??abilir misin?\n-Kimse kimseye kar????maz" +
                            " ama ??akala????rken bazen laf?? ge??ebilir.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Ailen ne i??le me??gul?\n-Devlette doktorlar.");
                }

            }
        });
        q2322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Yani sen eksik ??dedin benzeri bir tart????ma olmad???" +
                            "\n-Olmad??.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Hi?? tedavi g??rd?? m???\n-??la?? yazacaklar zaten diye gitmedi" +
                            " hi??.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Birisi hakaret etse ??ld??recek birisi var m???\n-Yoktur umar??m.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ersin sinirlenip adam ??ld??rebilecek birisi" +
                            " midir?\n-Kesinlikle hay??r.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Bu evde ses yal??t??m?? ??ok iyi midir?\n-Hay??r hatta k??t?? diye" +
                            "bilirim.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Bor?? ald??????nda ne i??in harcard???\n-??ndirimde oyun al??rd??" +
                            " mesela.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("Hepiniz ayn?? odada m?? oynad??n??z?\n-Hepimiz salondayd??k evet.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("??l??n??n odas??n??n ??n??nden ge??tin mi?\n-Hay??r ge??medim.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Peki ba??ka bir sebeple d????lad??????n??z birisi oldu mu?\n-" +
                            "Kesinlikle olmad??.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+??al??????yor musun?\n-Sadece ????renciyim ??al????m??yorum.");
                }

            }
        });
        q2323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Aran??zda ya?? fark?? ??ok muydu?\n Bir ka?? ya?? var en fazla.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Pi??man olsa ne yapard???\n-D????ar?? yans??tmamaya ??al??????rd??.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+??l??n??n ??zellikle u??ra??t?????? birisi var m?? genelde?\n-Hay??r yok.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Ersinle problemi olan birisi var m???\n-Hay??r yok.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+??len arkada????n?? fiziksel kuvvetle ??ld??rmek zor mudur?\n-" +
                            "??ok g????l?? biri de??ildi zaten olabilir.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Zararl?? al????kanl??klar?? var m??yd???\n-Hay??r yoktu.Oyun " +
                            "ba????ml??l??????n?? saymazsak tabi.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Oynarken sizi izleyen birileri var m??yd???\n-Arifle Hayri bir" +
                            " s??re izledi sonra Arif s??zd??, Hayri de telefon konu??mas?? yapaca????m diye" +
                            " gitti gelmedi.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Saat ka??t???\n-Ben saat 4 den sonra oldu??una " +
                            "eminim ama tam vaktini s??yleyemiyorum.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Alakas??z bir soru ama aran??zda neden kad??n yok?\n-Bilmem ki.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+Karde??in var m???\n-2 erkek karde??im var.");
                }

            }
        });
        q2331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Arif alkol al??nca sald??rganla????r m???\n-Pek say??lmaz.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Konusu nedir?\n-Kom??u esnaf?? d??vm????.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+??len arkada?? sinirlerine hakim olabilen birisi midir?\n-" +
                            "Pek de??il.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Mesela Hayri?\n-Burakla Arif.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Telefon ge??mi??ine bakabilir miyim?\n-Hay??r!");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Fiziksel kavga?\n-Hay??r zaten g????l?? biri de??ildi.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Fiziksel temas oldu mu?\n-Hay??r g??rmedim.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Kimler tart????t???\n-Ben Emirle ??len arkada????n sesini duydum." +
                            " Bir de Mehmet.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Nas??l yani?\n-Herkes yava?? yava?? yatmaya giderken" +
                            " hala s??yleniyordu.");
                }


            }
        });
        q2332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Arif hi?? kavgaya kar????t?? m???\n-Hay??r kar????mad??.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+Tehlikeli biri midir?\n-Hay??r hatta bize yard??m eder.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+Her zaman oynar m??s??n??z?\n-Hay??r nadiren oynar??z.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Mesela Emir?\n-Aliyle aralar?? en iyiydi.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+??mdat ??????l?????? gelse duyar m??yd??n?\n-Evet b??y??k ihtimalle.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Kavgalar?? ciddiye biner miydi?\n-Bazen... Daha do??rusu" +
                            " nadiren.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Sakinle??tirmeyi denediniz mi?\n- Evet ama hala s??v??yolard??" +
                            " birbirlerine.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+Vurdu k??rd?? duydun mu?\n-Hay??r. Duymad??m.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Sen yata??a gidince arkandan kavgaya durmu?? olabilirler mi?\n-" +
                            "Zannetmiyorum duyard??m ????nk??.");
                }
            }
        });
        q2333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+Alkol ba????ml??s?? m??d??r?\n-S??rekli almaz ama ald??????nda da" +
                            " s??zana kadar i??er.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+??iddet yanl??s?? m??d??r?\n-Kendimi ezdirmem gerekirse fiziksel" +
                            " m??dahalede bulunurum der.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+En ??ok kime s??vd???\n-Emir ??ok k??t?? oynuyordu en ??ok ona.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+Mesela Arif?\n-Burakla ??ocukluktan arkada??lar.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+Merdivenlerden birisi inse duyar m??yd??n?\n-Kesinlikle " +
                            "uyan??rd??m.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+Aran??zda siniri en ??abuk bozulan kim?\n-Emir var ama birini" +
                            " ??ld??rmeyece??ini d??????n??yorum.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+Sen gidince ses duydun mu?\n-Duymad??m.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+G??r??lt??ye yani tart????may?? ay??rmaya gittin mi?\n-" +
                            "Hay??r ama oyun ba????nda onlar?? izliyordum.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+Oyunda seviyeleriniz ne merak ettim?\n-Rahmetli g??m???? 3 d??" +
                            " biz ise g??m???? 1 iz.");
                }

            }
        });

        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Gece g??rd??m Orhan??.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Ak??am g??rd??m" +
                            " en son ??i??k??te yiyoduk.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Tam hat??rlayam??yorum.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Gece 1 k??s??rde sanki.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Sevgilisiyle " +
                            "konu??maya odas??na gitmi??ti.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Gece g??rd??m.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Oyundan sonra " +
                            "salondayd??lar.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Ben gece 12 de" +
                            " g??rd??m.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?" +
                            "\n-??l?? de o da oyundayd??lar i??te.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+??lmeden ??nce en son ne zaman g??rd??n?\n-Gece g??rd??m.");
                }

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+????phelenme sebebin nedir?\n-Uykusu derin de??il bence " +
                            "sessiz bir cinayetse bile duyard??.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+????phelenme sebebin nedir?\n-Aralar?? ??ok iyi de??ildi " +
                            "??len arkada?? da terslemeyi sever.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+????phelenme sebebin nedir?\n-Evi de o ayarlad?? odalar?? da o" +
                            " da????tt??. Bir de derin uyumaz hi??.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+????phelenme sebebin nedir?\n-Oda arkada????. Her ne kadar o" +
                            " gece sa??lam olmasa da odana birisi girse duyars??n.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+????phelenme sebebin nedir?\n-Sevgilimle konu??aca????m diye gitti" +
                            " o arada plan yapm???? olabilir.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+????phelenme sebebin nedir?\n-??ok iyi anla??amazlard??. Bir de " +
                            "o gece ay??km????.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+????phelenme sebebin nedir?\n-Kavgalar?? daha da ciddile??mi??" +
                            " olabilir ben yokken.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+????phelenme sebebin nedir?\n-Ben basit??e d??????nd??m" +
                            " ve oda arkada????.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+????phelenme sebebin nedir?\n-Oyundan sonra tart??????yorlard??" +
                            " Emir de biraz kinci diyebilirim.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+????phelenme sebebin nedir?\n-????nk?? ayn?? odadayd??lar.");
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (midText.getText().toString().equals("Ali")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Hay??r.");
                }
                else if (midText.getText().toString().equals("Arif")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Hay??r, en " +
                            "az??ndan zannetmiyorum.");
                }
                else if (midText.getText().toString().equals("Burak")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Hay??r.");
                }
                else if (midText.getText().toString().equals("Demir")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Yok.");
                }
                else if (midText.getText().toString().equals("Emir")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Hay??r.");
                }
                else if (midText.getText().toString().equals("Ersin")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Hay??r diye biliyorum.");
                }
                else if (midText.getText().toString().equals("Hakan")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Hay??r.");
                }
                else if (midText.getText().toString().equals("Hayri")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Ben kar????mad?? diye" +
                            " biliyorum.");
                }
                else if (midText.getText().toString().equals("Mehmet")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Hay??r ama kavgalara" +
                            " girmi??li??i var.");
                }
                else if (midText.getText().toString().equals("Orhan")){
                    rightText.setText("+??nceden bir su??a kar????m???? m??d??r?\n-Yok, kar????mad??.");
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
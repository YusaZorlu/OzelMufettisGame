package com.yusa.ozelmufettis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IstEpOneQuestioning extends AppCompatActivity {

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
        setContentView(R.layout.activity_ist_ep_one_questioning);
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
        final Button toBack = findViewById(R.id.button456);
        final TextView textViewMid = findViewById(R.id.textView7);
        final TextView textViewMidA = findViewById(R.id.textView7a);
        final TextView textViewMidB = findViewById(R.id.textView7b);
        final TextView textViewMidC = findViewById(R.id.textView7c);
        final TextView textViewMidD = findViewById(R.id.textView7d);
        final TextView textViewMidE = findViewById(R.id.textView7e);
        final TextView textViewRight = findViewById(R.id.textView5);
        final Button upButton =  findViewById(R.id.button70);
        final Button upButtonX0 = findViewById(R.id.button70x0);
        final Button upButtonX1 = findViewById(R.id.button70x1);
        final Button upButtonX4 = findViewById(R.id.button70x4);
        final Button midButton = findViewById(R.id.button71);
        final Button midButtonX0 = findViewById(R.id.button71x0);
        final Button midButtonX1 = findViewById(R.id.button71x1);
        final Button midButtonX4 = findViewById(R.id.button71x4);
        final Button lowButton = findViewById(R.id.button44);
        final Button lowButtonX0 = findViewById(R.id.button44x0);
        final Button lowButtonX1 = findViewById(R.id.button44x1);
        final Button lowButtonX4 = findViewById(R.id.button44x4);
        final Button AButton = findViewById(R.id.button63);
        final Button BButton = findViewById(R.id.button54);
        final Button CButton = findViewById(R.id.button57);
        final Button DButton = findViewById(R.id.button58);
        final Button EButton = findViewById(R.id.button59);
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("IsSuspect3",false)){
            CButton.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("IsSuspect4", false)){
            DButton.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("IsSuspect5",false)){
            EButton.setVisibility(View.GONE);
        }
        // onClickListeners of Buttons
        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IstEpOne.class);
                startActivity(intent);
            }
        });
        AButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMid.setVisibility(View.GONE);
                textViewMidA.setVisibility(View.VISIBLE);
                textViewMidB.setVisibility(View.GONE);
                textViewMidC.setVisibility(View.GONE);
                textViewMidD.setVisibility(View.GONE);
                textViewMidE.setVisibility(View.GONE);
                upButton.setVisibility(View.VISIBLE);
                midButton.setVisibility(View.VISIBLE);
                lowButton.setVisibility(View.VISIBLE);
                upButtonX0.setVisibility(View.GONE);
                upButtonX1.setVisibility(View.GONE);
                upButtonX4.setVisibility(View.GONE);
                midButtonX0.setVisibility(View.GONE);
                midButtonX1.setVisibility(View.GONE);
                midButtonX4.setVisibility(View.GONE);
                lowButtonX0.setVisibility(View.GONE);
                lowButtonX1.setVisibility(View.GONE);
                lowButtonX4.setVisibility(View.GONE);

            }
        });
        BButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMid.setVisibility(View.GONE);
                textViewMidA.setVisibility(View.GONE);
                textViewMidB.setVisibility(View.VISIBLE);
                textViewMidC.setVisibility(View.GONE);
                textViewMidD.setVisibility(View.GONE);
                textViewMidE.setVisibility(View.GONE);
                upButton.setVisibility(View.VISIBLE);
                midButton.setVisibility(View.VISIBLE);
                lowButton.setVisibility(View.VISIBLE);
                upButtonX0.setVisibility(View.GONE);
                upButtonX1.setVisibility(View.GONE);
                upButtonX4.setVisibility(View.GONE);
                midButtonX0.setVisibility(View.GONE);
                midButtonX1.setVisibility(View.GONE);
                midButtonX4.setVisibility(View.GONE);
                lowButtonX0.setVisibility(View.GONE);
                lowButtonX1.setVisibility(View.GONE);
                lowButtonX4.setVisibility(View.GONE);
            }
        });
        CButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMid.setVisibility(View.GONE);
                textViewMidA.setVisibility(View.GONE);
                textViewMidB.setVisibility(View.GONE);
                textViewMidC.setVisibility(View.VISIBLE);
                textViewMidD.setVisibility(View.GONE);
                textViewMidE.setVisibility(View.GONE);
                upButton.setVisibility(View.VISIBLE);
                midButton.setVisibility(View.VISIBLE);
                lowButton.setVisibility(View.VISIBLE);
                upButtonX0.setVisibility(View.GONE);
                upButtonX1.setVisibility(View.GONE);
                upButtonX4.setVisibility(View.GONE);
                midButtonX0.setVisibility(View.GONE);
                midButtonX1.setVisibility(View.GONE);
                midButtonX4.setVisibility(View.GONE);
                lowButtonX0.setVisibility(View.GONE);
                lowButtonX1.setVisibility(View.GONE);
                lowButtonX4.setVisibility(View.GONE);
            }
        });
        DButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMid.setVisibility(View.GONE);
                textViewMidA.setVisibility(View.GONE);
                textViewMidB.setVisibility(View.GONE);
                textViewMidC.setVisibility(View.GONE);
                textViewMidD.setVisibility(View.VISIBLE);
                textViewMidE.setVisibility(View.GONE);
                upButton.setVisibility(View.VISIBLE);
                midButton.setVisibility(View.VISIBLE);
                lowButton.setVisibility(View.VISIBLE);
                upButtonX0.setVisibility(View.GONE);
                upButtonX1.setVisibility(View.GONE);
                upButtonX4.setVisibility(View.GONE);
                midButtonX0.setVisibility(View.GONE);
                midButtonX1.setVisibility(View.GONE);
                midButtonX4.setVisibility(View.GONE);
                lowButtonX0.setVisibility(View.GONE);
                lowButtonX1.setVisibility(View.GONE);
                lowButtonX4.setVisibility(View.GONE);
            }
        });
        EButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMid.setVisibility(View.GONE);
                textViewMidA.setVisibility(View.GONE);
                textViewMidB.setVisibility(View.GONE);
                textViewMidC.setVisibility(View.GONE);
                textViewMidD.setVisibility(View.GONE);
                textViewMidE.setVisibility(View.VISIBLE);
                upButton.setVisibility(View.VISIBLE);
                midButton.setVisibility(View.VISIBLE);
                lowButton.setVisibility(View.VISIBLE);
                upButtonX0.setVisibility(View.GONE);
                upButtonX1.setVisibility(View.GONE);
                upButtonX4.setVisibility(View.GONE);
                midButtonX0.setVisibility(View.GONE);
                midButtonX1.setVisibility(View.GONE);
                midButtonX4.setVisibility(View.GONE);
                lowButtonX0.setVisibility(View.GONE);
                lowButtonX1.setVisibility(View.GONE);
                lowButtonX4.setVisibility(View.GONE);
            }
        });
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Evdeydim evim k???? mahallesinde ");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.VISIBLE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.VISIBLE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.VISIBLE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.GONE);

                    upButtonX0.setText("Evde ne yap??yordun");
                    midButtonX0.setText("Evde senden ba??ka birisi ya????yor mu");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Neredeydin o g??n ? \n ????teydim ak??am ??ld??????n?? duydum ");

                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.VISIBLE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.VISIBLE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.VISIBLE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.GONE);
                    upButtonX0.setText("Sevgilisinin borcunu sor");
                    midButtonX0.setText("??ld??????n?? kimden ????rendin");
                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Neredeydin cinayet g??n??? \n -Sahilde i??tim baya sonra eve gittim");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.VISIBLE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.VISIBLE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.VISIBLE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.GONE);
                    upButtonX0.setText("Yan??nda biri var m??yd??");
                    midButtonX0.setText("??lmesi i??ine gelmi?? gibi");
                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("place4is1",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni yer ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    textViewRight.setText("+Neredeydin cinayet g??n??? \n -Pazarda don sat??yordum.");
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("place4is1",true).apply();
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.VISIBLE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.VISIBLE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.VISIBLE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.GONE);
                    upButtonX0.setText("Yan??nda biri var m??yd??");
                    midButtonX0.setText("Pazarda ??al????ma sebebin ne");
                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Evde han??mla dizi izliyordum");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.VISIBLE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.VISIBLE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.VISIBLE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.GONE);
                    upButtonX0.setText("Yan??nda biri var m??yd??");
                    midButtonX0.setText("Kiray?? geciktirir miydi");
                }
            }
        });

        upButtonX0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Evde ne yap??yordun \n -T??m g??n boyac??yla evi boyuyorduk");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText(" -Sevgilinin bor??lar?? hakk??nda d??????ncen? \n" +
                            " -Beni borcu ilgilendirmiyor kendi param?? da kazan??yorum hem");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Yan??nda biri var m??yd??? \n -T??m g??n tek ba????mayd??m");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Yan??nda biri var m??yd??? \n -Hemen yan taraf??mda bi amca" +
                            " vard?? ama g??zleri ??ok g??rm??yor galiba arada o??luyla kar????t??r??yor beni.");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Yan??nda biri var m??yd??? \n -Han??mla izliyorduk dedim" +
                            " han??m vard?? tek");

                }
            }
        });
        upButtonX1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aran??zda bir olay oldu mu? \n " +
                            "-3 5 bin borcu vard?? ama kavgam??z olmad??");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aran??zda bir olay oldu mu? \n"
                            +"-Biraz k??skan??t?? ama kar??ncay?? bile incitmezdi");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aran??zda bir olay oldu mu? \n"+
                            "-Ohooo... S??rekli kavga s??vmedik akrabam kalmad??yd?? en son");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aran??zda bir olay oldu mu? \n"+
                            "??lk sevgili olduklar?? zaman biraz ters davrand??m ama 2 y??l oldu defter kapand??");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aran??zda bir olay oldu mu? \n"+
                            "Bir kez kira zamm??na s??vm????t?? be??enmiyosan terket demi??tim");

                }

            }
        });
        upButtonX4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+????phelenme sebebin ne? \n " +
                            "- Dedelerinin tarlalar??n?? b??l????ememi??lerdi");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+????phelenme sebebin ne? \n "+
                            "-Tak??nt??l??yd?? hem de sab??kas?? da var.");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+????phelenme sebebin ne? \n "+
                            "-S??k??nt??l?? biriydi ??demediyse kiray?? s??km????t??r kafas??na");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+????phelenme sebebin ne? \n "+
                            "-Bilmiyorum dedim ya");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+????phelenme sebebin ne? \n "+
                            "-Arada apartman??n ??n??nde ba????r??yodu bi ka?? kere ben kovdum zorla");

                }

            }
        });
        midButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Arkada????y??m... daha do??rusu arkada????yd??m.");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.VISIBLE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.VISIBLE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.VISIBLE);
                    lowButtonX4.setVisibility(View.GONE);
                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Sevgilisiydim. 2 y??ld??r. ");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.VISIBLE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.VISIBLE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.VISIBLE);
                    lowButtonX4.setVisibility(View.GONE);
                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Kuzeniyim, kendisi teyzemin o??lu olurdu.");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.VISIBLE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.VISIBLE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.VISIBLE);
                    lowButtonX4.setVisibility(View.GONE);
                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Ba????m yok, eski sevgilimin sevgilisi o ??ikayet etmi??tir");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.VISIBLE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.VISIBLE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.VISIBLE);
                    lowButtonX4.setVisibility(View.GONE);
                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Kirac??m olur kendisi");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.VISIBLE);
                    upButtonX4.setVisibility(View.GONE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.VISIBLE);
                    midButtonX4.setVisibility(View.GONE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.VISIBLE);
                    lowButtonX4.setVisibility(View.GONE);
                }
            }
        });
        midButtonX0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Evde senden ba??ka biri ya????yor mu? \n " +
                            "- Yok bazen arkada??lar ziyarete gelince geceyi ge??irirler sadece.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+??ld??????n?? kimden ????rendin \n"+
                            " - Doktorlar ailesine ula??amay??nca beni arad??lar");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-??lmesi i??ine gelmi?? gibi? \n"+
                            "Yalan yok i??ime geldi d??rd??r??ndan da miras pay??ndan da kurtuldum");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Eski sevgilin sab??kal?? dedi ondan m?? burda ??al??????yorsun?"
                    + " \n Evet, Banka soymaya ??al????t??m olmay??nca hapiste bele?? yemek yedim bi s??re."
                    );

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kiray?? aksat??r m??yd?? \n - Hay??r");

                }
            }
        });
        midButtonX1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Hakk??nda ne d??????n??yordunuz? \n " +
                            "- ??yi adamd?? ama sa??a sola ??ok borcu vard??.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz? \n "+"-Seviyordum onu...");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz? \n "
                            +"K??t?? d??????n??yordum. Allah belas??n?? versin");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz? \n "+
                            "O kad??na iyi katlanm???? 2 y??l ??yle diyeyim.");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Hakk??nda ne d??????n??yordunuz? \n "+
                            "??ok d??z adamd?? i??kisi yoktu s??k??nt??s?? da pek yoktu");

                }

            }
        });
        midButtonX4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimdir , ??l??n??n nesidir? \n " +
                            "- Kuzeni hatta tek kuzeni olur.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimdir , necidir? \n " +
                            "- Benim eski sevgilim i??te.");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimdir , ??l??n??n nesidir? \n " +
                            "- Ev sahibi.");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimdir , ??l??n??n nesidir? \n " +
                            "- Kafa m?? buluyosun."+"\n+Pardon hatlar kar????t??");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Kimdir , ??l??n??n nesidir? \n " +
                            "- Kuzeni i??te ba??ka kuzeni duymad??m zaten.");

                }

            }
        });
        lowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimden ????pheleniyorsun\n-Kuzeninden ????pheleniyorum");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("IsSuspect3",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).edit().putBoolean
                            ("IsSuspect3",true).apply();
                    CButton.setVisibility(View.VISIBLE);
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.VISIBLE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.VISIBLE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.VISIBLE);
                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimden ????pheleniyorsun\n-Benim eskiden ????pheleniyorum");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("IsSuspect4",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).edit().putBoolean
                            ("IsSuspect4",true).apply();
                    DButton.setVisibility(View.VISIBLE);
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.VISIBLE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.VISIBLE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.VISIBLE);
                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("\"+Kimden ????pheleniyorsun\n" +
                            "-Apartmandaki Pa??adan ????pheleniyorum");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("IsSuspect5",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).edit().putBoolean
                            ("IsSuspect5",true).apply();
                    EButton.setVisibility(View.VISIBLE);
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.VISIBLE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.VISIBLE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.VISIBLE);
                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimden ????pheleniyorsun" +
                            "\n-2 y??ld??r g??rmedim kendisini. Bilmiyorum");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.VISIBLE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.VISIBLE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.VISIBLE);
                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimden ????pheleniyorsun\n-Kuzeninden ????pheleniyorum");
                    upButton.setVisibility(View.GONE);
                    midButton.setVisibility(View.GONE);
                    lowButton.setVisibility(View.GONE);
                    upButtonX0.setVisibility(View.GONE);
                    upButtonX1.setVisibility(View.GONE);
                    upButtonX4.setVisibility(View.VISIBLE);
                    midButtonX0.setVisibility(View.GONE);
                    midButtonX1.setVisibility(View.GONE);
                    midButtonX4.setVisibility(View.VISIBLE);
                    lowButtonX0.setVisibility(View.GONE);
                    lowButtonX1.setVisibility(View.GONE);
                    lowButtonX4.setVisibility(View.VISIBLE);
                }
            }
        });
        lowButtonX0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+??ahidin var m??? \n " +
                            "-Boyac?? ??ahidim ayr??ca isterseniz kameralara bak??n.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+??ahidin var m??? \n " +
                            "-Patrona sorun s??yler 5 dk izin bile vermez zaten");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+??ahidin var m??? \n " +
                            "-Ald??????m b??feyi s??yleyebilirim ba??ka yok.");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+??ahidin var m??? \n " +
                            "-Pazarda g??ren olmu??tur y??z??m?? mutlaka.");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+??ahidin var m??? \n " +
                            "-Han??mla izliyoz dedim ya.");

                }
            }
        });
        lowButtonX1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son g??rd??????n??zde ruh hali nas??ld??? \n " +
                            "-Biraz dalg??nd??.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son g??rd??????n??zde ruh hali nas??ld??? \n " +
                            "-Bor??lara can?? s??k??lm????t??.");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son g??rd??????n??zde ruh hali nas??ld??? \n " +
                            "-Baya ??fkeliydi sevmezdi o da beni");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son g??rd??????n??zde ruh hali nas??ld??? \n " +
                            "-Mutluydu o zamanlar");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son g??rd??????n??zde ruh hali nas??ld??? \n " +
                            "-Telefonda baya k??f??rle??mi??ti kuzeniyle sinirliydi.");

                }
            }
        });
        lowButtonX4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede ya??ar? \n " +
                            "-Kara Caddesinde diye biliyorum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("place3is1",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni yer ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                            .edit().putBoolean("place3is1",true).apply();

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede ya??ar? \n " +
                            "-Bana uzak Allaha yak??n bir yerde bilmem.");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede ya??ar? \n -??st kat??nda ayn?? apartmanda");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede ya??ar? \n " +
                            "-Splinter usta kanalizasyonda ya????yor onu sorduysan");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede ya??ar? \n " +
                            "-Yak??n bir yerde kendisine sorun.");

                }

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
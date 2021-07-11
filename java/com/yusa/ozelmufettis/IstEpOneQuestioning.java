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
                    textViewRight.setText("Evdeydim evim kış mahallesinde ");
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

                    upButtonX0.setText("Evde ne yapıyordun");
                    midButtonX0.setText("Evde senden başka birisi yaşıyor mu");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Neredeydin o gün ? \n İşteydim akşam öldüğünü duydum ");

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
                    midButtonX0.setText("Öldüğünü kimden öğrendin");
                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Neredeydin cinayet günü? \n -Sahilde içtim baya sonra eve gittim");
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
                    upButtonX0.setText("Yanında biri var mıydı");
                    midButtonX0.setText("Ölmesi işine gelmiş gibi");
                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("place4is1",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni yer keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    textViewRight.setText("+Neredeydin cinayet günü? \n -Pazarda don satıyordum.");
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
                    upButtonX0.setText("Yanında biri var mıydı");
                    midButtonX0.setText("Pazarda çalışma sebebin ne");
                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Evde hanımla dizi izliyordum");
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
                    upButtonX0.setText("Yanında biri var mıydı");
                    midButtonX0.setText("Kirayı geciktirir miydi");
                }
            }
        });

        upButtonX0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Evde ne yapıyordun \n -Tüm gün boyacıyla evi boyuyorduk");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText(" -Sevgilinin borçları hakkında düşüncen? \n" +
                            " -Beni borcu ilgilendirmiyor kendi paramı da kazanıyorum hem");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Yanında biri var mıydı? \n -Tüm gün tek başımaydım");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Yanında biri var mıydı? \n -Hemen yan tarafımda bi amca" +
                            " vardı ama gözleri çok görmüyor galiba arada oğluyla karıştırıyor beni.");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Yanında biri var mıydı? \n -Hanımla izliyorduk dedim" +
                            " hanım vardı tek");

                }
            }
        });
        upButtonX1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aranızda bir olay oldu mu? \n " +
                            "-3 5 bin borcu vardı ama kavgamız olmadı");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aranızda bir olay oldu mu? \n"
                            +"-Biraz kıskançtı ama karıncayı bile incitmezdi");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aranızda bir olay oldu mu? \n"+
                            "-Ohooo... Sürekli kavga sövmedik akrabam kalmadıydı en son");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aranızda bir olay oldu mu? \n"+
                            "İlk sevgili oldukları zaman biraz ters davrandım ama 2 yıl oldu defter kapandı");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Aranızda bir olay oldu mu? \n"+
                            "Bir kez kira zammına sövmüştü beğenmiyosan terket demiştim");

                }

            }
        });
        upButtonX4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şüphelenme sebebin ne? \n " +
                            "- Dedelerinin tarlalarını bölüşememişlerdi");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şüphelenme sebebin ne? \n "+
                            "-Takıntılıydı hem de sabıkası da var.");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şüphelenme sebebin ne? \n "+
                            "-Sıkıntılı biriydi ödemediyse kirayı sıkmıştır kafasına");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şüphelenme sebebin ne? \n "+
                            "-Bilmiyorum dedim ya");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şüphelenme sebebin ne? \n "+
                            "-Arada apartmanın önünde bağırıyodu bi kaç kere ben kovdum zorla");

                }

            }
        });
        midButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("Arkadaşıyım... daha doğrusu arkadaşıydım.");
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
                    textViewRight.setText("Sevgilisiydim. 2 yıldır. ");
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
                    textViewRight.setText("Kuzeniyim, kendisi teyzemin oğlu olurdu.");
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
                    textViewRight.setText("Bağım yok, eski sevgilimin sevgilisi o şikayet etmiştir");
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
                    textViewRight.setText("Kiracım olur kendisi");
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
                    textViewRight.setText("+Evde senden başka biri yaşıyor mu? \n " +
                            "- Yok bazen arkadaşlar ziyarete gelince geceyi geçirirler sadece.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Öldüğünü kimden öğrendin \n"+
                            " - Doktorlar ailesine ulaşamayınca beni aradılar");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Ölmesi işine gelmiş gibi? \n"+
                            "Yalan yok işime geldi dırdırından da miras payından da kurtuldum");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Eski sevgilin sabıkalı dedi ondan mı burda çalışıyorsun?"
                    + " \n Evet, Banka soymaya çalıştım olmayınca hapiste beleş yemek yedim bi süre."
                    );

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kirayı aksatır mıydı \n - Hayır");

                }
            }
        });
        midButtonX1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Hakkında ne düşünüyordunuz? \n " +
                            "- İyi adamdı ama sağa sola çok borcu vardı.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz? \n "+"-Seviyordum onu...");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz? \n "
                            +"Kötü düşünüyordum. Allah belasını versin");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz? \n "+
                            "O kadına iyi katlanmış 2 yıl öyle diyeyim.");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz? \n "+
                            "Çok düz adamdı içkisi yoktu sıkıntısı da pek yoktu");

                }

            }
        });
        midButtonX4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimdir , ölünün nesidir? \n " +
                            "- Kuzeni hatta tek kuzeni olur.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimdir , necidir? \n " +
                            "- Benim eski sevgilim işte.");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimdir , ölünün nesidir? \n " +
                            "- Ev sahibi.");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimdir , ölünün nesidir? \n " +
                            "- Kafa mı buluyosun."+"\n+Pardon hatlar karıştı");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("-Kimdir , ölünün nesidir? \n " +
                            "- Kuzeni işte başka kuzeni duymadım zaten.");

                }

            }
        });
        lowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Kimden şüpheleniyorsun\n-Kuzeninden şüpheleniyorum");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("IsSuspect3",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni şüpheli keşfettin"
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
                    textViewRight.setText("+Kimden şüpheleniyorsun\n-Benim eskiden şüpheleniyorum");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("IsSuspect4",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni şüpheli keşfettin"
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
                    textViewRight.setText("\"+Kimden şüpheleniyorsun\n" +
                            "-Apartmandaki Paşadan Şüpheleniyorum");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("IsSuspect5",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni şüpheli keşfettin"
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
                    textViewRight.setText("+Kimden şüpheleniyorsun" +
                            "\n-2 yıldır görmedim kendisini. Bilmiyorum");
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
                    textViewRight.setText("+Kimden şüpheleniyorsun\n-Kuzeninden şüpheleniyorum");
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
                    textViewRight.setText("+Şahidin var mı? \n " +
                            "-Boyacı şahidim ayrıca isterseniz kameralara bakın.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şahidin var mı? \n " +
                            "-Patrona sorun söyler 5 dk izin bile vermez zaten");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şahidin var mı? \n " +
                            "-Aldığım büfeyi söyleyebilirim başka yok.");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şahidin var mı? \n " +
                            "-Pazarda gören olmuştur yüzümü mutlaka.");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Şahidin var mı? \n " +
                            "-Hanımla izliyoz dedim ya.");

                }
            }
        });
        lowButtonX1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son gördüğünüzde ruh hali nasıldı? \n " +
                            "-Biraz dalgındı.");

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son gördüğünüzde ruh hali nasıldı? \n " +
                            "-Borçlara canı sıkılmıştı.");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son gördüğünüzde ruh hali nasıldı? \n " +
                            "-Baya öfkeliydi sevmezdi o da beni");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son gördüğünüzde ruh hali nasıldı? \n " +
                            "-Mutluydu o zamanlar");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Son gördüğünüzde ruh hali nasıldı? \n " +
                            "-Telefonda baya küfürleşmişti kuzeniyle sinirliydi.");

                }
            }
        });
        lowButtonX4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMidA.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede yaşar? \n " +
                            "-Kara Caddesinde diye biliyorum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpOneQuestioning.this).getBoolean("place3is1",false)){
                        Toast.makeText(IstEpOneQuestioning.this,"Yeni yer keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                            .edit().putBoolean("place3is1",true).apply();

                }
                else if (textViewMidB.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede yaşar? \n " +
                            "-Bana uzak Allaha yakın bir yerde bilmem.");

                }
                else if (textViewMidC.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede yaşar? \n -Üst katında aynı apartmanda");

                }
                else if (textViewMidD.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede yaşar? \n " +
                            "-Splinter usta kanalizasyonda yaşıyor onu sorduysan");

                }
                else if (textViewMidE.getVisibility() == View.VISIBLE){
                    textViewRight.setText("+Nerede yaşar? \n " +
                            "-Yakın bir yerde kendisine sorun.");

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
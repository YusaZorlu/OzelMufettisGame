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

public class AntEpOneInvestigate extends AppCompatActivity {
    TextView textViewR;
    TextView textViewM;
    Button p1;
    Button p2;
    Button p3;
    Button p4;
    Button p5;
    Button p6;
    Button p7;
    Button p8;
    Button p9;
    Button i1;
    Button i2;
    Button i3;

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
        setContentView(R.layout.activity_ant_ep_one_investigate);
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
        textViewM = findViewById(R.id.textViewM11);
        textViewR = findViewById(R.id.textViewR7);
        p1 = findViewById(R.id.button131);
        p2 = findViewById(R.id.button132);
        p3 = findViewById(R.id.button133);
        p4 = findViewById(R.id.button134);
        p5 = findViewById(R.id.button135);
        p6 = findViewById(R.id.button136);
        p7 = findViewById(R.id.button137);
        p8 = findViewById(R.id.button138);
        p9 = findViewById(R.id.button139);

        i1 = findViewById(R.id.button128);
        i2 = findViewById(R.id.button129);
        i3 = findViewById(R.id.button130);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Olay yeri");
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("G??venli??in odas??");
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("305. oda");
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("306. oda");
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("307. oda");
            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("308. oda");
            }
        });
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("309. oda");
            }
        });
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("310. oda");
            }
        });
        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("311. oda");
            }
        });
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ant1Places",false)){
            p3.setVisibility(View.GONE);
            p4.setVisibility(View.GONE);
            p5.setVisibility(View.GONE);
            p6.setVisibility(View.GONE);
            p7.setVisibility(View.GONE);
            p8.setVisibility(View.GONE);
            p9.setVisibility(View.GONE);
        }

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("??l??n??n ??zerinden bir meyve b????a???? ????kt??. Otelin mutfa????na ait." +
                            " Bir de 309. odaya ait bir kart ????kt??.");
                }
                else if (textViewM.getText().toString().equals("G??venli??in odas??")){
                    textViewR.setText("Kamera kay??tlar?? d??????nda kan??t say??labilecek bir ??ey yok.");
                }
                else if (textViewM.getText().toString().equals("305. oda")){
                    textViewR.setText("Dna ??rne??i gerekirse diye okuma kitab?? var.");
                }
                else if (textViewM.getText().toString().equals("306. oda")){
                    textViewR.setText("Dna ??rne??i gerekirse in??aat projeleri olan bir dosya var.");
                }
                else if (textViewM.getText().toString().equals("307. oda")){
                    textViewR.setText("Kan??t olarak say??l??r m?? bilmem ama k??rm??z?? re??eteli ila??" +
                            "lar var ne i??e yarad??????n?? bilmedi??im.");
                }
                else if (textViewM.getText().toString().equals("308. oda")){
                    textViewR.setText("D??n ak??amdan kalma oda servisi taba???? var. Plastik ??atal?? var" +
                            " ama plastik b????a???? yok");
                }
                else if (textViewM.getText().toString().equals("309. oda")){
                    textViewR.setText("Telefonunda otel sakinlerinden herhangi birisinin numaras??" +
                            " yok ileti??imleri olmam???? mobilden.");
                }
                else if (textViewM.getText().toString().equals("310. oda")){
                    textViewR.setText("Dna ??rne??i gerekirse diye makyaj malzemeleri var.");
                }
                else if (textViewM.getText().toString().equals("311. oda")){
                    textViewR.setText("Dna ??rne??i gerekirse diye protein tozu kutusu var.");
                }

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Otelin 3. kat??ndaki bir koridor. Bu koridordaki odalar" +
                            " tek ki??ilik.Koridorda 3 kamera var.");
                }
                else if (textViewM.getText().toString().equals("G??venli??in odas??")){
                    textViewR.setText("K??????k ancak klimal?? bir oda. Zemin katta ve olay yerine uzak.");
                }
                else if (textViewM.getText().toString().equals("305. oda")){
                    textViewR.setText("Bu kattaki di??er odalar gibi tek ki??ilik yatak i??inde " +
                            "????phelinin giysileri olan bir dolap ve pencere ??n??nde bir komidin var.");
                }
                else if (textViewM.getText().toString().equals("306. oda")){
                    textViewR.setText("Di??er odalardan farkl?? olarak 306. oda sakininin dolab??nda " +
                            "sadece iki ??ort bir pantolon ve ???? t-shirt var.");
                }
                else if (textViewM.getText().toString().equals("307. oda")){
                    textViewR.setText("Di??er odalardan farkl?? olarak 307. odada her ??ey ??ok " +
                            "da????n??k halde b??rak??lm???? ve bir ka?? e??yaya zarar verilmi??.");
                }
                else if (textViewM.getText().toString().equals("308. oda")){
                    textViewR.setText("Di??er odalardan farkl?? olarak 308. odada bir ka?? diyet" +
                            " kitab?? var.");
                }
                else if (textViewM.getText().toString().equals("309. oda")){
                    textViewR.setText("Kurban??n odas?? normal bir ??ekilde b??rak??lm????. Odas??na " +
                            "temizlik??i d??????nda birisi girmi?? gibi g??z??km??yor.");
                }
                else if (textViewM.getText().toString().equals("310. oda")){
                    textViewR.setText("Bu kattaki di??er odalar gibi tek ki??ilik yatak i??inde " +
                            "????phelinin giysileri olan bir dolap ve pencere ??n??nde bir komidin var.");
                }
                else if (textViewM.getText().toString().equals("311. oda")){
                    textViewR.setText("Di??er odalardan farkl?? olarak 311. odada otelin havlular??ndan" +
                            " fazlaca var.");
                }

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Meyve b????a???? kesinlikle cinayet aleti olmal??");
                }
                else if (textViewM.getText().toString().equals("G??venli??in odas??")){
                    textViewR.setText("??arj aleti yamulmu??. Telefonu ??arjda ??ok kullan??yor olmal??.");
                }
                else if (textViewM.getText().toString().equals("305. oda")){
                    textViewR.setText("Yatak g??zel toplanm????. Dolap g??zel toplanm????. Her ??ey d??zenli.");
                }
                else if (textViewM.getText().toString().equals("306. oda")){
                    textViewR.setText("Yata????n i??inde ??arj aleti ve kulakl??k ????kt??. Dolapta ise " +
                            "t??m oteli y??katacak kadar ??ampuan var.");
                }
                else if (textViewM.getText().toString().equals("307. oda")){
                    textViewR.setText("Dolapta Rus??a s??zl??k, valiz ve k??yafetler var. Ama hem yatak" +
                            " hem de dolap da????n??k.");
                }
                else if (textViewM.getText().toString().equals("308. oda")){
                    textViewR.setText("Yatak ve Dolap normal. Komidinin ??zerinde ve yerde yemek" +
                            " kal??nt??lar?? var. Komidinin i??inde de Antalya'da gezilecek yerler yazan" +
                            " bir bro????r ve kulak t??ka??lar?? var.");
                }
                else if (textViewM.getText().toString().equals("309. oda")){
                    textViewR.setText("Odada her ??ey olmas?? gerekti??i gibi. Zorla giri?? olmu?? gibi" +
                            " g??r??lm??yor. Dolapta bir laptop var ama ??ifreli.");
                }
                else if (textViewM.getText().toString().equals("310. oda")){
                    textViewR.setText("Dolapta bir ayna var. Komidinin i??inde de ortalama makyaj " +
                            "malzemeleri. Yatak ise g??zel toplanm????.");
                }
                else if (textViewM.getText().toString().equals("311. oda")){
                    textViewR.setText("Dolap ve yatak normal ama odan??n kalan??n?? ??evirebildi??i " +
                            "kadar spor salonuna ??evirmi??.");
                }

            }
        });

    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), AntEpOne.class);
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
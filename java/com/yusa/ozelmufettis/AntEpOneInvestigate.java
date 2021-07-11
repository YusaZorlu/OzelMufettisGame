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
                textViewM.setText("Güvenliğin odası");
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
                    textViewR.setText("Ölünün üzerinden bir meyve bıçağı çıktı. Otelin mutfağına ait." +
                            " Bir de 309. odaya ait bir kart çıktı.");
                }
                else if (textViewM.getText().toString().equals("Güvenliğin odası")){
                    textViewR.setText("Kamera kayıtları dışında kanıt sayılabilecek bir şey yok.");
                }
                else if (textViewM.getText().toString().equals("305. oda")){
                    textViewR.setText("Dna örneği gerekirse diye okuma kitabı var.");
                }
                else if (textViewM.getText().toString().equals("306. oda")){
                    textViewR.setText("Dna örneği gerekirse inşaat projeleri olan bir dosya var.");
                }
                else if (textViewM.getText().toString().equals("307. oda")){
                    textViewR.setText("Kanıt olarak sayılır mı bilmem ama kırmızı reçeteli ilaç" +
                            "lar var ne işe yaradığını bilmediğim.");
                }
                else if (textViewM.getText().toString().equals("308. oda")){
                    textViewR.setText("Dün akşamdan kalma oda servisi tabağı var. Plastik çatalı var" +
                            " ama plastik bıçağı yok");
                }
                else if (textViewM.getText().toString().equals("309. oda")){
                    textViewR.setText("Telefonunda otel sakinlerinden herhangi birisinin numarası" +
                            " yok iletişimleri olmamış mobilden.");
                }
                else if (textViewM.getText().toString().equals("310. oda")){
                    textViewR.setText("Dna örneği gerekirse diye makyaj malzemeleri var.");
                }
                else if (textViewM.getText().toString().equals("311. oda")){
                    textViewR.setText("Dna örneği gerekirse diye protein tozu kutusu var.");
                }

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Otelin 3. katındaki bir koridor. Bu koridordaki odalar" +
                            " tek kişilik.Koridorda 3 kamera var.");
                }
                else if (textViewM.getText().toString().equals("Güvenliğin odası")){
                    textViewR.setText("Küçük ancak klimalı bir oda. Zemin katta ve olay yerine uzak.");
                }
                else if (textViewM.getText().toString().equals("305. oda")){
                    textViewR.setText("Bu kattaki diğer odalar gibi tek kişilik yatak içinde " +
                            "şüphelinin giysileri olan bir dolap ve pencere önünde bir komidin var.");
                }
                else if (textViewM.getText().toString().equals("306. oda")){
                    textViewR.setText("Diğer odalardan farklı olarak 306. oda sakininin dolabında " +
                            "sadece iki şort bir pantolon ve üç t-shirt var.");
                }
                else if (textViewM.getText().toString().equals("307. oda")){
                    textViewR.setText("Diğer odalardan farklı olarak 307. odada her şey çok " +
                            "dağınık halde bırakılmış ve bir kaç eşyaya zarar verilmiş.");
                }
                else if (textViewM.getText().toString().equals("308. oda")){
                    textViewR.setText("Diğer odalardan farklı olarak 308. odada bir kaç diyet" +
                            " kitabı var.");
                }
                else if (textViewM.getText().toString().equals("309. oda")){
                    textViewR.setText("Kurbanın odası normal bir şekilde bırakılmış. Odasına " +
                            "temizlikçi dışında birisi girmiş gibi gözükmüyor.");
                }
                else if (textViewM.getText().toString().equals("310. oda")){
                    textViewR.setText("Bu kattaki diğer odalar gibi tek kişilik yatak içinde " +
                            "şüphelinin giysileri olan bir dolap ve pencere önünde bir komidin var.");
                }
                else if (textViewM.getText().toString().equals("311. oda")){
                    textViewR.setText("Diğer odalardan farklı olarak 311. odada otelin havlularından" +
                            " fazlaca var.");
                }

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Olay yeri")){
                    textViewR.setText("Meyve bıçağı kesinlikle cinayet aleti olmalı");
                }
                else if (textViewM.getText().toString().equals("Güvenliğin odası")){
                    textViewR.setText("Şarj aleti yamulmuş. Telefonu şarjda çok kullanıyor olmalı.");
                }
                else if (textViewM.getText().toString().equals("305. oda")){
                    textViewR.setText("Yatak güzel toplanmış. Dolap güzel toplanmış. Her şey düzenli.");
                }
                else if (textViewM.getText().toString().equals("306. oda")){
                    textViewR.setText("Yatağın içinde şarj aleti ve kulaklık çıktı. Dolapta ise " +
                            "tüm oteli yıkatacak kadar şampuan var.");
                }
                else if (textViewM.getText().toString().equals("307. oda")){
                    textViewR.setText("Dolapta Rusça sözlük, valiz ve kıyafetler var. Ama hem yatak" +
                            " hem de dolap dağınık.");
                }
                else if (textViewM.getText().toString().equals("308. oda")){
                    textViewR.setText("Yatak ve Dolap normal. Komidinin üzerinde ve yerde yemek" +
                            " kalıntıları var. Komidinin içinde de Antalya'da gezilecek yerler yazan" +
                            " bir broşür ve kulak tıkaçları var.");
                }
                else if (textViewM.getText().toString().equals("309. oda")){
                    textViewR.setText("Odada her şey olması gerektiği gibi. Zorla giriş olmuş gibi" +
                            " görülmüyor. Dolapta bir laptop var ama şifreli.");
                }
                else if (textViewM.getText().toString().equals("310. oda")){
                    textViewR.setText("Dolapta bir ayna var. Komidinin içinde de ortalama makyaj " +
                            "malzemeleri. Yatak ise güzel toplanmış.");
                }
                else if (textViewM.getText().toString().equals("311. oda")){
                    textViewR.setText("Dolap ve yatak normal ama odanın kalanını çevirebildiği " +
                            "kadar spor salonuna çevirmiş.");
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
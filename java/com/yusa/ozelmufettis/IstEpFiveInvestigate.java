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

public class IstEpFiveInvestigate extends AppCompatActivity {
    TextView textViewR;
    TextView textViewM;
    Button p1;
    Button p2;
    Button i1;
    Button i2;
    Button i3;
    Button i11;
    Button i12;
    Button i13;
    Button i21;
    Button i22;
    Button i23;


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
        setContentView(R.layout.activity_ist_ep_five_investigate);
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

        textViewM = findViewById(R.id.textViewM8);
        textViewR = findViewById(R.id.textViewR4);
        p1 = findViewById(R.id.is5p1);
        p2 = findViewById(R.id.is5p2);

        i1 = findViewById(R.id.is5I1);
        i2 = findViewById(R.id.is5I2);
        i3 = findViewById(R.id.is5I3);
        i11= findViewById(R.id.is5I11);
        i12= findViewById(R.id.is5I12);
        i13= findViewById(R.id.is5I13);
        i21= findViewById(R.id.is5I21);
        i22= findViewById(R.id.is5I22);
        i23= findViewById(R.id.is5I23);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Polis Belgeleri");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);

                i1.setText("Kaybın evinin inceleme belgesi");
                i2.setText("Kaybın bulunduğu kamera kayıtları belgesi");
                i3.setText("İfadelerle sorgulamaları karşılaştır");
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kaybın sosyal medyası");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i1.setText("O gün kimlerle görüştüğünü incele");
                i2.setText("Son paylaşımlarını incele");
                i3.setText("Arkadaşlarında hangi şüpheliler var incele");
            }
        });
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is5Place2",false)){
            p2.setVisibility(View.GONE);
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
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Kaybın ev incelemesindeki ev ile şu an karısının yaşadığı ev" +
                            " aynı.");
                    i11.setText("Ev içinin inceleme belgesi");
                    i12.setText("Ev dışının inceleme belgesi");
                    i13.setText("Evde toplanan kanıtların belgesi");
                }
                else if (textViewM.getText().toString().equals("Kaybın sosyal medyası")){
                    textViewR.setText("O gün karısı, borçlu olduğu arkadaşı ve iş " +
                            "arkadaşıyla yazışmış.");
                    i11.setText("Eşiyle mesajları incele");
                    i12.setText("Borçlu olduğu arkadaşıyla mesajları incele");
                    i13.setText("İş arkadaşıyla mesajları incele");
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Bulunduğu yerlerden evin girişi ve kardeşlerinin buluştuğu " +
                            "kafenin kamera kayıtları mevcut.");
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Kaybın sosyal medyası")){
                    textViewR.setText("Son paylaşımları kişisel gelişimle alakalı özlü sözler ve" +
                            " kendin ol gibi paylaşımlar.");
                }

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("10 yıl önceki ifadelerle " +
                            "sorguladıklarımın verdiği ifadeler arasında zıtlaşan bir ifade yok.");
                }
                else if (textViewM.getText().toString().equals("Kaybın sosyal medyası")){
                    textViewR.setText("Arkadaşları listesinde hangi şüpheliler yok diye bakınca " +
                            "yan komşusu hariç herkesi arkadaşı eklemiş.");
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Evin içinde kaybın kaçmasına yönelik en ufak bir kanıt bile " +
                            "bulunmadı. Karısı öldürmüş olsa bile evde bir ize rastlanmadı.");
                }
                else if (textViewM.getText().toString().equals("Kaybın sosyal medyası")){
                    textViewR.setText("Karısıyla aşkımlı öpücüklü mesajlar var.");
                }
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Evin dışında kamera olduğu belirtilmiş. Kameranın kayıtları da" +
                            "belgenin içerisinde zaten.");
                }
                else if (textViewM.getText().toString().equals("Kaybın sosyal medyası")){
                    textViewR.setText("Borç aldığı arkadaşı: Kardeşim para bana lazım versen artık.\n" +
                            "Kayıp: Abi ben de o işi halletmiştim iki güne yollayacağım hesaba koyunca\n" +
                            "Borç aldığı arkadaşı: Tamam.");
                }
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Evde ciddi bir kanıt toplanmamış sadece bilgisayar ve eşi" +
                            "nin telefonunu incelemişler ve şüpheli bir şeye rastlamamışlar.");
                }
                else if (textViewM.getText().toString().equals("Kaybın sosyal medyası")){
                    textViewR.setText("Kayıp: Ben geç kalacağım.\nİş arkadaşı:Tamam öğle yemeğine" +
                            " klasik lokantaya gel oradan benim arabayla geçeriz\nKayıp: Tamamdır" +
                            " oldu bil.");
                }
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Evin girişindeki kamerada her şey normal. Evden sakin bir şekilde" +
                        " çıkıyor.");
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kafedeki kameralar kafenin dışında mutlu bir biçimde kardeş" +
                        "leriyle vedalaştığı görülüyor.");
            }
        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kaybın kıyafetleri spor gömlek ve kot pantolon. Gündelik kıyafetler.");

            }
        });

    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), IstEpFive.class);
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
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

                i1.setText("Kayb??n evinin inceleme belgesi");
                i2.setText("Kayb??n bulundu??u kamera kay??tlar?? belgesi");
                i3.setText("??fadelerle sorgulamalar?? kar????la??t??r");
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kayb??n sosyal medyas??");
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                i3.setVisibility(View.VISIBLE);
                i11.setVisibility(View.GONE);
                i12.setVisibility(View.GONE);
                i13.setVisibility(View.GONE);
                i21.setVisibility(View.GONE);
                i22.setVisibility(View.GONE);
                i23.setVisibility(View.GONE);
                i1.setText("O g??n kimlerle g??r????t??????n?? incele");
                i2.setText("Son payla????mlar??n?? incele");
                i3.setText("Arkada??lar??nda hangi ????pheliler var incele");
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
                    textViewR.setText("Kayb??n ev incelemesindeki ev ile ??u an kar??s??n??n ya??ad?????? ev" +
                            " ayn??.");
                    i11.setText("Ev i??inin inceleme belgesi");
                    i12.setText("Ev d??????n??n inceleme belgesi");
                    i13.setText("Evde toplanan kan??tlar??n belgesi");
                }
                else if (textViewM.getText().toString().equals("Kayb??n sosyal medyas??")){
                    textViewR.setText("O g??n kar??s??, bor??lu oldu??u arkada???? ve i?? " +
                            "arkada????yla yaz????m????.");
                    i11.setText("E??iyle mesajlar?? incele");
                    i12.setText("Bor??lu oldu??u arkada????yla mesajlar?? incele");
                    i13.setText("???? arkada????yla mesajlar?? incele");
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Bulundu??u yerlerden evin giri??i ve karde??lerinin bulu??tu??u " +
                            "kafenin kamera kay??tlar?? mevcut.");
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.GONE);
                    i3.setVisibility(View.GONE);
                    i21.setVisibility(View.VISIBLE);
                    i22.setVisibility(View.VISIBLE);
                    i23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Kayb??n sosyal medyas??")){
                    textViewR.setText("Son payla????mlar?? ki??isel geli??imle alakal?? ??zl?? s??zler ve" +
                            " kendin ol gibi payla????mlar.");
                }

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("10 y??l ??nceki ifadelerle " +
                            "sorgulad??klar??m??n verdi??i ifadeler aras??nda z??tla??an bir ifade yok.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n sosyal medyas??")){
                    textViewR.setText("Arkada??lar?? listesinde hangi ????pheliler yok diye bak??nca " +
                            "yan kom??usu hari?? herkesi arkada???? eklemi??.");
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Evin i??inde kayb??n ka??mas??na y??nelik en ufak bir kan??t bile " +
                            "bulunmad??. Kar??s?? ??ld??rm???? olsa bile evde bir ize rastlanmad??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n sosyal medyas??")){
                    textViewR.setText("Kar??s??yla a??k??ml?? ??p??c??kl?? mesajlar var.");
                }
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Evin d??????nda kamera oldu??u belirtilmi??. Kameran??n kay??tlar?? da" +
                            "belgenin i??erisinde zaten.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n sosyal medyas??")){
                    textViewR.setText("Bor?? ald?????? arkada????: Karde??im para bana laz??m versen art??k.\n" +
                            "Kay??p: Abi ben de o i??i halletmi??tim iki g??ne yollayaca????m hesaba koyunca\n" +
                            "Bor?? ald?????? arkada????: Tamam.");
                }
            }
        });
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Polis Belgeleri")){
                    textViewR.setText("Evde ciddi bir kan??t toplanmam???? sadece bilgisayar ve e??i" +
                            "nin telefonunu incelemi??ler ve ????pheli bir ??eye rastlamam????lar.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n sosyal medyas??")){
                    textViewR.setText("Kay??p: Ben ge?? kalaca????m.\n???? arkada????:Tamam ????le yeme??ine" +
                            " klasik lokantaya gel oradan benim arabayla ge??eriz\nKay??p: Tamamd??r" +
                            " oldu bil.");
                }
            }
        });
        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Evin giri??indeki kamerada her ??ey normal. Evden sakin bir ??ekilde" +
                        " ????k??yor.");
            }
        });
        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kafedeki kameralar kafenin d??????nda mutlu bir bi??imde karde??" +
                        "leriyle vedala??t?????? g??r??l??yor.");
            }
        });
        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("Kayb??n k??yafetleri spor g??mlek ve kot pantolon. G??ndelik k??yafetler.");

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
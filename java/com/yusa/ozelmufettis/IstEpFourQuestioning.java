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

public class IstEpFourQuestioning extends AppCompatActivity {
    TextView textViewM;
    TextView textViewR;
    Button s1;
    Button s2;
    Button s3;
    Button s4;
    Button s5;
    Button s6;
    Button s7;
    Button s8;
    Button q1;
    Button q2;
    Button q3;
    Button q11;
    Button q12;
    Button q13;
    Button q131;
    Button q132;
    Button q133;
    Button q21;
    Button q22;
    Button q23;
    Button q221;
    Button q222;
    Button q223;
    Button q31;
    Button q32;
    Button q33;
    Button q311;
    Button q312;
    Button q313;
    Button q331;
    Button q332;
    Button q333;
    Button q4;
    Button q5;
    Button q6;
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
        setContentView(R.layout.activity_ist_ep_four_questioning);
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
        textViewM = findViewById(R.id.textView20);
        textViewR = findViewById(R.id.textView19);

        q1 = findViewById(R.id.isE4Q1);
        q2 = findViewById(R.id.isE4Q2);
        q3 = findViewById(R.id.isE4Q3);
        q11 = findViewById(R.id.isE4Q11);
        q12 = findViewById(R.id.isE4Q12);
        q13 = findViewById(R.id.isE4Q13);
        q131 = findViewById(R.id.isE4Q131);
        q132 = findViewById(R.id.isE4Q132);
        q133 = findViewById(R.id.isE4Q133);
        q21 = findViewById(R.id.isE4Q21);
        q22 = findViewById(R.id.isE4Q22);
        q23 = findViewById(R.id.isE4Q23);
        q221 = findViewById(R.id.isE4Q221);
        q222 = findViewById(R.id.isE4Q222);
        q223 = findViewById(R.id.isE4Q223);
        q31 = findViewById(R.id.isE4Q31);
        q32 = findViewById(R.id.isE4Q32);
        q33 = findViewById(R.id.isE4Q33);
        q311 = findViewById(R.id.isE4Q311);
        q312 = findViewById(R.id.isE4Q312);
        q313 = findViewById(R.id.isE4Q313);
        q331 = findViewById(R.id.isE4Q331);
        q332 = findViewById(R.id.isE4Q332);
        q333 = findViewById(R.id.isE4Q333);
        q4 = findViewById(R.id.isE4Q4);
        q5 = findViewById(R.id.isE4Q5);
        q6 = findViewById(R.id.isE4Q6);

        s1 = findViewById(R.id.button73);
        s2 = findViewById(R.id.button74);
        s3 = findViewById(R.id.button75);
        s4 = findViewById(R.id.button76);
        s5 = findViewById(R.id.button77);
        s6 = findViewById(R.id.button78);
        s7 = findViewById(R.id.button79);
        s8 = findViewById(R.id.button80);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Alt Kom??u");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("??st Kom??u");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Falc??n??n Kedisi");
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.VISIBLE);
                q5.setVisibility(View.VISIBLE);
                q6.setVisibility(View.VISIBLE);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Bakkal");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Falc??n??n Ye??eni");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Sabah Fal Bakt??ran");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("????len Fal Bakt??ran");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("??kindi Fal Bakt??ran");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q311.setVisibility(View.GONE);
                q312.setVisibility(View.GONE);
                q313.setVisibility(View.GONE);
                q331.setVisibility(View.GONE);
                q332.setVisibility(View.GONE);
                q333.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
                q5.setVisibility(View.GONE);
                q6.setVisibility(View.GONE);
            }
        });
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Suspect4",false)){
            s4.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Suspect5",false)){
            s5.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is4Suspect678",false)){
            s6.setVisibility(View.GONE);
            s7.setVisibility(View.GONE);
            s8.setVisibility(View.GONE);
        }
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q11.setVisibility(View.VISIBLE);
                q12.setVisibility(View.VISIBLE);
                q13.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+D??n neredeydin?\n-T??m g??n evdeydim.");
                    q13.setText("D??n apartmanda ne g??rd??n veya duydun");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+D??n neredeydin?\n-Arkada??ta g??ndeydim. Sonra pazara gittim." +
                            " Pazardan sonra markete gittim.");
                    q13.setText("Ne zamand??r falc??l??k yap??yordu");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+D??n neredeydin?\n-Bakkaldayd??m ye??enim.");
                    q13.setText("D??n ????pheli bir ??ey g??rd??n m??");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place3",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place3",true).apply();
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+D??n neredeydin?\n-Sabahtan halama gittim sonra i??leri halle" +
                            "dip evdeki valizi haz??rlamaya eve gittim.");
                    q13.setText("Valizi ne i??in haz??rlad??n");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+D??n neredeydin?\n-Sabah fal bakt??rd??m, sonra pazara gittim," +
                            " sonra eve d??nd??m gittim.");
                    q13.setText("Evin buraya yak??n m??");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+D??n neredeydin?\n-????len uyand??m, fal bakt??rd??m,sonra eve" +
                            " gittim yemek yiyip uyudum.");
                    q13.setText("Psikolojini anlamak i??in soru sorabilir miyim");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+D??n neredeydin?\n-Sabah evi d??zenledeim." +
                            "????leden sonra falc??dayd??m");
                    q13.setText("Psikolojini anlamak i??in soru sorabilir miyim");
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
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+??l??y?? ne kadar zamand??r tan??yorsun?\n-Buraya " +
                            "ta????d??????mdan beri kom??uyuz.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+??l??y?? ne kadar zamand??r tan??yorsun?\n-3 y??l ??nce ben buraya" +
                            " ta????nd??????m zaman tan????m????t??k.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+??l??y?? ne kadar zamand??r tan??yorsun?\n-Yedi sekiz y??ld??r.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+??l??y?? ne kadar zamand??r tan??yorsun?\n-??ocuklu??umdan beri" +
                            " tan??rd??m.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+??l??y?? ne kadar zamand??r tan??yorsun?\n-1 ayd??r. ??????nc?? fal" +
                            " bakt??r??????md??");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+??l??y?? ne kadar zamand??r tan??yorsun?\n-Bir y??l civar??" +
                            " diyebilirim.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+??l??y?? ne kadar zamand??r tan??yorsun?\n-???? y??ld??r gelece??imi" +
                            " incelettiriyordum.");
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
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+??evresi onu sever miydi?\n-Falc??l??????n?? severlerdi ama" +
                            " sevmeyenleri de vard??.");
                    q33.setText("D??n m????teri gelmi?? miydi");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+??evresi onu sever miydi?\n-Alt kom??u severdi ben sevmezdim.");
                    q33.setText("Tek ba????na m?? ya??ar");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+??evresi onu sever miydi?\n-Ben sevmezdim, ??evresini hi?? " +
                            "bilmem.");
                    q33.setText("Apartmandaki bo?? daire senin mi");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+??evresi onu sever miydi?\n-Biz severdik ama ??evrede " +
                            "sevmeyenleri varm???? ??ld??????ne g??re.");
                    q33.setText("Psikolojik rahats??zl?????? var m??yd??");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+??evresi onu sever miydi?\n-Bana bir arkada?? ??vd??. " +
                            "??yi olmasa ??vmezdi herhalde.");
                    q33.setText("Di??er fal bakt??ranlar?? tan??yor musun");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+??evresi onu sever miydi?\n-I????.... Evet.");
                    q33.setText("Aran??zda samimiyet var m??yd??");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+??evresi onu sever miydi?\n-Evet ??ok spritual biriydi.");
                    q33.setText("Falc??, sen ????karken sana bir ??ey dedi mi");
                }

            }
        });
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Ba??ka bir adresim" +
                            " yok, burada ya??ar??m.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Benim mi?\n+Evet\n-Buras??.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Kar???? apartman ama d??n gece" +
                            " bakkalda yatt??m gitmeye ????endim eve.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-??stanbuldaki evim Karaa??a??" +
                            " Mahallesinde");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place4",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place4",true).apply();
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Hac?? Mahallesi, Hoca Sokak, ??mam" +
                            " Apartman?? 3. katta oturuyorum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place5",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place5",true).apply();
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Sar??yerde Ye??ilyer Mahallesinde" +
                            " oturuyorum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place6",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place6",true).apply();
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Ev adresini verebilir misin?\n-Konum atay??m hemen bir dakika.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Place7",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni mekan ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Place7",true).apply();
                }

            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+??ahidin var m???\n-Kocam var evde o ??ahit.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+??ahidin var m???\n-Pazar?? bilmem ama g??ndeki herkes ??ahit" +
                            " olur.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+??ahidin var m???\n-Kameralar??m var bi de gece sigara almaya" +
                            " gelen elemanlar?? bulursan tamam.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+??ahidin var m???\n-??kindi vaktine kadar arkada??lar ??ahit" +
                            " olur bana i??teki.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+??ahidin var m???\n-Evdeki ??ocuklarla marketteki kasiyer.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+??ahidin var m???\n-??ahidim yok ya.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+??ahidin var m???\n-Falc??dan ????k??nca k??zlarla gezdim onlar " +
                            "??ahit.");
                }

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q131.setVisibility(View.VISIBLE);
                q132.setVisibility(View.VISIBLE);
                q133.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+D??n apartmanda neler g??rd??n ya da duydun?\n-Anormal bir " +
                            "??eyler hay??r.");
                    q131.setText("En son ne zaman g??rd??n");
                    q132.setText("Herhangi bir ses duydun mu");
                    q133.setText("Apartman??n kameras?? var m??");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Ne zamand??r falc??l??k yap??yordu?\n-En az??ndan ben" +
                            " ta????nd??????mdan beri yapt??????n?? biliyorum..");
                    q131.setText("Daha ??nce tehdit edildi mi");
                    q132.setText("M????terileri sabit mi");
                    q133.setText("Yabanc??lar rahats??z eder miydi");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+????pheli bir ??ey g??rd??n m???\n-Kad??n??n birisi arabam ??urada" +
                            " gel binelim dedi.");
                    q131.setText("Ne g??rd??n");
                    q132.setText("Ne zaman g??rd??n");
                    q133.setText("Ba??ka bir ??ey oldu mu");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Valizi ne i??in haz??rlad??n\n-Ankaraya gidece??im yar??n.");
                    q131.setText("Daha ??ok nerede ya??ars??n");
                    q132.setText("Saat ka??ta evine d??nd??n");
                    q133.setText("Bana uygun bi cinayet var m??");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Evin buraya yak??n m???\n-Evet ama hemen yan sokak da de??il.");
                    q131.setText("Neyle gidip geldin");
                    q132.setText("Maddi durumun iyi mi");
                    q133.setText("??l??n??n bulundu??u yeri biliyor musun");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Psikolojini anlamak i??in bir ka?? soru soraca????m uygun mudur?" +
                            "\n-Olur");
                    q131.setText("Normalde ??ok uyur musun");
                    q132.setText("Psikolo??a gittin mi");
                    q133.setText("??abuk mu sinirlenirsin");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Psikolojini anlamak i??in bir ka?? soru soraca????m uygun mudur?" +
                            "\n-Tamam");
                    q131.setText("Psikolojik rahats??zl??????n var m??");
                    q132.setText("??abuk mu sinirlenirsin");
                    q133.setText("Hi?? sab??kan var m??");
                }

            }
        });
        q131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+En son ne zaman g??rd??n?\n-1 gibi konu??tuk");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Daha ??nce tehdit edildi mi?\n-Beddua edenler oldu en fazla");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ne g??rd??n?\n-Kad??n??n birisi ??ok de??i??ik hareketler yap??yordu.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Daha ??ok nerede ya??ars??n?\n-Ankarada ya??ar??m.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Neyle gelip gittin?\n-Belediye otob??s??yle.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Normalde ??ok uyur musun?\n- Genellikle hay??r.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Hi?? psikolojik rahats??zl??????n??z var m???\n-Azc??k tak??nt??l??y??m" +
                            " can??m.");
                }

            }
        });
        q132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Herhangi bir ses ya da yard??m ??????l?????? duydun mu?\n-Hay??r");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+M????terileri sabit mi yoksa de??i??ken mi?\n-Valla ben benzer" +
                            " tipler s??k s??k gelir.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ne zaman g??rd??n?\n- ??kindi g??rd??m ye??enim.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+D??n evine saat ka??ta d??nd??n evine?\n-Saat 20 de eve d??nd??m.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Maddi durumun iyi midir?\n-Evet zaten fal??m?? zevkine ba" +
                            "kt??r??yorum");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Herhangi bir psikolojik destek ald??n m???\n-Yok niye gidecek" +
                            "mi??im ki?");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+??abuk sinirlenir misin?\n-Bazen, g??n??mde de??ilken.");
                }

            }
        });
        q133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Apartman kamera kay??tlar?? var m???\n-Bakkal??n var silmediyse.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Apartmana yabanc??lar??n girmesi rahats??z ediyor mu sizi?\n-" +
                            "Ben de bakkal da rahats??z??z.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Ne zaman g??rd??n?\n-??kindi saatlerinde.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Benim i??in uygun cinayet var m?? ????zmelik?\n-Bunu ????zebilirsen" +
                            " Ankara'da var.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+??l??n??n bulundu??u yeri biliyor musun?\n-Valla polisler s??yle" +
                            "yince il??eyi bile zor ????kard??m.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+??abuk sinirlenen birisi misin?\n-Hay??r de??ilim.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Hi?? sab??kan var m???\n-Yok ki. Niye olsun?");
                }

            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Senin ??ld??rmemen i??in bir sebep s??yle?\n-Evliyim, " +
                            "gen?? say??l??r??m.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Senin ??ld??rmemen i??in bir sebep s??yle?\n-Avukat tutacak" +
                            " param bile yok ki.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Senin ??ld??rmemen i??in bir sebep s??yle?\n-Ye??enim halime" +
                            " baksana nas??l ??ld??rey??m?");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Senin ??ld??rmemen i??in bir sebep s??yle?\n-Akrabam?? niye" +
                            " ??ld??reyim Allah r??zas?? i??in");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Senin ??ld??rmemen i??in bir sebep s??yle?\n-??olu??um ??ocu??um " +
                            "var benim.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Senin ??ld??rmemen i??in bir sebep s??yle?\n-Param var benim.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Senin ??ld??rmemen i??in bir sebep s??yle?\n-Ay bende kar??ncay??" +
                            " incitecek k??t?? enerji yok ki.");
                }

            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    textViewR.setText("+??kinizin aras?? nas??ld???\n-Aram??z iyiydi s??k s??k sohbet e" +
                            "derdik.");
                    q222.setText("Di??er kom??ularla aras?? nas??ld??");
                    q223.setText("Esnafla aras?? nas??ld??");
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+??kinizin aras?? nas??ld???\n-Anla??amazd??k ama kin beslemezdim.");
                    q222.setText("Senden daha ??ok sevmeyen var m??");
                    q223.setText("Apartmanda ka?? daire dolu");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+??kinizin aras?? nas??ld???\n-Sevmiyordum, aram??z k??t??yd??");
                    q222.setText("Al????veri??i nereden yapard??");
                    q223.setText("D??n g??r??lt?? duydun mu");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+??kinizin aras?? nas??ld???\n-??yiydi ama arada kavga etti??imiz" +
                            " olurdu");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q222.setText("Kom??ular??n?? tan??yor musun");
                    q223.setText("Peki ??l??m tehditi alm???? m??yd??");
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+??kinizin aras?? nas??ld???\n-??ok bir aram??z yoktu ama iyiydi.");

                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+??kinizin aras?? nas??ld???\n-Bir y??ld??r geldi??ime g??re iyiydi.");
                    q222.setText("Evli misiniz");
                    q223.setText("Bir yere davet ettin mi");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+??kinizin aras?? nas??ld???\n-Severdim ablam gibiydi.");
                }

            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+??yi para kazan??r m??yd???\n-Evet");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+??yi para kazan??r m??yd???\n-G??nah olmasa ertesi g??n ba??lar??m.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+??yi para kazan??r m??yd???\n-Galiba kazan??yor ama nedense bana" +
                            " olan borcunu hala ??dememekte ??srarc??.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+??yi para kazan??r m??yd???\n-??ki ??niversite okudum" +
                            " halam benden zengin");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+??yi para kazan??r m??yd???\n-1 seans?? 350 lira ??yle diyeyim.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+??yi para kazan??r m??yd???\n-Benden ????kan parayla voleyi" +
                            " vurmu??tur.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+??yi para kazan??r m??yd???\n-Ben s??k gitmezdim ama s??k gidip" +
                            " gelenler zengin etmi??tir.");
                }

            }
        });
        q221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Hi?? kavga ettiniz mi?\n-Hi?? kavga etmedik.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Hi?? kavga ettiniz mi?\n-Laf atm??????md??r ama hi?? kavga olmad??.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Hi?? kavga ettiniz mi?\n-Borcunu ??deyene kadar gelme dedim.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Hi?? kavga ettiniz mi?\n-Dedi??im gibi en son d??n lafl?? " +
                            "bir kavgam??z oldu ama ciddi de??ildi.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Hi?? kavga ettiniz mi?\n-Ciddi tart????mad??k ya.");
                }

            }
        });
        q222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Di??er kom??ularla aras?? nas??ld???\n-Falc??l??k yapmas?? rahats??z" +
                            " ederdi.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Senden daha ??ok sevmeyen birisi var m???\n-Bakkal var.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Al????veri??i nereden yapard???\n-??leri sokaktaki zincir" +
                            " marketten.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Kom??ular??n?? tan??yor musun?\n-Alt kom??usunu tan??yorum bir tek.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Evli misiniz?\n-Hay??r kocam olacaktan bo??and??m ???? ay ??nce.");
                }

            }
        });
        q223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Buradaki esnafla aralar?? bozuk muydu?\n-Hepsiyle de??il ama" +
                            " a????a????daki bakkalla aras?? bozuktu.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Apartmanda sadece 3 daire mi dolu?\n-Evet 4. daire bo??.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+D??n apartmanda g??r??lt?? duydun mu?\n-TV a????kt?? dikkat etmedim.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Peki hi?? ??l??m tehditi ald??????n?? duydun mu?\n-Lafta tehdit " +
                            "edildi??ini biliyorum da ??l??mle tehdit eden duymad??m.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+??l??y?? bir yere davet etmi?? miydin o g??n?\n-Hay??r etmedim.");
                }

            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+??ld??rd??????nden ????phelendi??in birsi var m???\n-Apartman??n " +
                            "bakkal??ndan.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Suspect4",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                    q311.setVisibility(View.VISIBLE);
                    q312.setVisibility(View.VISIBLE);
                    q313.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+??ld??rd??????nden ????phelendi??in birsi var m???\n-Bilemiyorum ama" +
                            " bakkal ??ld??rd??yse ??a????rmam.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is4Suspect4",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is4Suspect4",true).apply();
                    s4.setVisibility(View.VISIBLE);
                    q311.setVisibility(View.VISIBLE);
                    q312.setVisibility(View.VISIBLE);
                    q313.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+??ld??rd??????nden ????phelendi??in birsi var m???\n-Ye??eni olabilir" +
                            " buraya gelip gidiyor arada.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpFourQuestioning.this).getBoolean("Is4Suspect5",false)){
                        Toast.makeText(IstEpFourQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpFourQuestioning.this).
                            edit().putBoolean("Is4Suspect5",true).apply();
                    s5.setVisibility(View.VISIBLE);
                    q311.setVisibility(View.VISIBLE);
                    q312.setVisibility(View.VISIBLE);
                    q313.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+??ld??rd??????nden ????phelendi??in birsi var m???\n-Yok. Bakkal??" +
                            " sevmezdi ama ??ld??rd??????n?? zannetmiyorum.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+??ld??rd??????nden ????phelendi??in birsi var m???\n-????phelendi??im " +
                            "birisi yok.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+??ld??rd??????nden ????phelendi??in birsi var m???\n-Hay??r, yok.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+??ld??rd??????nden ????phelendi??in birsi var m???\n- Benden ??nce fal" +
                            " bakt??ran kad??n farkl?? davran??yordu.");
                    q311.setVisibility(View.VISIBLE);
                    q312.setVisibility(View.VISIBLE);
                    q313.setVisibility(View.VISIBLE);
                }

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+S??k g??r????t?????? arkada??lar???\n-Benle s??k g??r??????rd??.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+S??k g??r????t?????? arkada??lar???\n-Alt kom??u ve bir ka?? akrabas??.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+S??k g??r????t?????? arkada??lar???\n-Samimiyetim yok bilmem.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+S??k g??r????t?????? arkada??lar???\n-Alt kom??usu, benim annem mesela.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+S??k g??r????t?????? arkada??lar???\n-Ben ????karken alt kom??uyla konu??u" +
                            "yordu.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+S??k g??r????t?????? arkada??lar???\n-Benle ve alt kom??usu.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+S??k g??r????t?????? arkada??lar???\n-Bilmiyorum ben ya.");
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q331.setVisibility(View.VISIBLE);
                q332.setVisibility(View.VISIBLE);
                q333.setVisibility(View.VISIBLE);
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+D??n m????terisi gelmi?? miydi?\n-Evet g??rd??m geldi??ini.");
                    q331.setText("Peki fal bakmaya gelenlere nerden ula??abilirim");
                    q332.setText("M????terisi ??ok mudur");
                    q333.setText("Daha ??nce tehdit edildi mi");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Tek ba????na m?? ya????yor?\n-E??i ??lm???? zaten ??ocuklar?? da yokmu??." +
                            "Yani evet.");
                    q331.setText("Ba??ka akrabas?? var m??");
                    q332.setText("Tan??d??????n??z arkada????");
                    q333.setText("??l??n??n sigara al????kanl?????? var m??");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Apartmandaki bo?? daire senin mi?\n-Yok ama" +
                            " sahibini tan??yorum.");
                    q331.setText("Neden ??u an bo??");
                    q332.setText("Mahallenin maddi durumu nas??l");
                    q333.setText("??yi para kazan??yor musun");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+??l??n??n psikolojik rahats??zl?????? var m??yd???\n-Yoktu neden" +
                            " sordun ki?");
                    q331.setText("Falc??l????a ne zaman ba??lad??");
                    q332.setText("\"??nl??\" bir falc?? m??yd??");
                    q333.setText("Nas??l fal bakard??");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Fal bakmaya gelen di??erlerini tan??yor musun?\n-Hay??r sadece" +
                            " tavsiye veren arkada????m?? biliyorum.");
                    q331.setText("Daha ??nceden fal bakt??r??yor muydunuz");
                    q332.setText("Falc??dan ????kt??????n??zda saat ka??t??");
                    q333.setText("Sabah fal bakt??r??rken bir y??z??nde s??k??nt?? g??rd??n??z m??");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Aran??zda bir samimiyet var m??yd???\n-Evet.");
                    q331.setText("Beraber vakit ge??irir misiniz");
                    q332.setText("O g??n size ????phe verici davran?????? oldu mu");
                    q333.setText("En son saat ka??ta konu??tunuz");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Falc??dan ????karken sana bir ??ey dedi mi?\n-Biraz konu??tuk" +
                            " asl??nda");
                    q331.setText("Ne konuda konu??tunuz");
                    q332.setText("Saat konu??tu??unuzda ka??t??");
                    q333.setText("Y??z??nde korku g??rd??n m??");
                }

            }
        });
        q311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Nerede ya??ar?\n-Bilmiyorum ama bakkalda bulabilirsiniz.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Nerede ya??ar?\n-Mahallede bir yerlerde.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Nerede ya??ar?\n-Yak??nlarda k??????k bir evi var ye??eninin.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Nerede ya??ar?\n-Tan??m??yorum ki bileyim.");
                }

            }
        });
        q312.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Paras?? varken bile borcunu ona " +
                            "??demezdi.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Galiba bakkala biraz bor?? takm????.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-S??zl?? de olsa kavga ettiler.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+????phelenme sebebin nedir?\n-Dedi??im gibi. Bulu??tuktan" +
                            " sonra ??ld??rm???? olabilir.");
                }

            }
        });
        q313.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Fiziksel ??zellikleri nelerdir?\n-Ya??l??, ??i??man bir adam.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Fiziksel ??zellikleri nelerdir?\n-Ya??l??, ak sa??l?? bi abi.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Fiziksel ??zellikleri nelerdir?\n-Asl??nda ??ok hat??rlam??yorum" +
                            " ama uzun sa??l??, sakall?? bir gen??ti.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Fiziksel ??zellikleri nelerdir?\n-Baya kal??pl?? mask??len bir " +
                            "kad??nd??. Kavga etsek beni kesin d??verdi.");
                }

            }
        });
        q331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Peki gelenlere nereden ula??abilirim?\n-Not ald?????? bir defter" +
                            " vard?? evinde.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Ba??ka akrabas??n?? tan??yor musun?\n-Hay??r, tan??m??yorum.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Daire neden bo?? ??u an?\n-Ev sahibi pahal??dan kiraya koymu??" +
                            " bence normal.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Falc??l????a ne zaman ba??lad???\n-10 y??l ??nce diyebilirim.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Daha ??nceden ba??kas??na fal bakt??r??yor muydun?\n-Parayla hay??r.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+Beraber vakit ge??irir miydiniz?\n-Evet, bazen.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Ne konusunda konu??tunuz?\n-????len gelen kad??nla yeme??e gide" +
                            "ce??ini s??yledi. ??ok da samimi de??illerdi anlad??????m.");
                }

            }
        });
        q332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+M????terisi ??ok mudur?\n-??ok diyemem ama s??k gelir ??o??u m????" +
                            "terisi.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Tan??d??????n??z arkada?????\n-Sadece iki alt kattaki kom??um.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Mahallenin sosyoekonomik durumu yani mahalleli zengin mi?\n-" +
                            "Orta ??st diyeyim ye??enim.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+\"??nl??\" bir falc?? m??yd???\n-??ok ??nl?? say??lmaz ama mahallede" +
                            ", civarda bilinirdi");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Falc??dan ????kt??????nda saat ka??t???\n-11 bu??uk gibiydi saat.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+O g??n size ????phe verici bir davran?????? oldu mu?\n-Evet bir ??ey" +
                            "lerden korktu??u belliydi.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+????kt??????n??zda saat ka??t???\n- 4 bu??uk gibiydi.");
                }

            }
        });
        q333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Alt Kom??u")){
                    textViewR.setText("+Daha ??nce tehdit edildi mi?\n-Hay??r, edilse s??ylerdi.");
                }
                else if(textViewM.getText().toString().equals("??st Kom??u")){
                    textViewR.setText("+Alakas??z bir soru ama ??l??n??n sigara gibi zaral?? bir al????kan" +
                            "l?????? var m???\n-Hay??r, yok.");
                }
                else if(textViewM.getText().toString().equals("Bakkal")){
                    textViewR.setText("+Alakas??z bir soru ama iyi para kazan??yor musun?\n-Yok ye??enim" +
                            " hi?? sorma.");
                }
                else if(textViewM.getText().toString().equals("Falc??n??n Ye??eni")){
                    textViewR.setText("+Nas??l fal bakard???\n-Tam nas??l bakt??????n?? bilmiyorum ama " +
                            "bir??eylere bak??p gelecek tahmin eden basit falc??lardand??.");
                }
                else if(textViewM.getText().toString().equals("Sabah Fal Bakt??ran")){
                    textViewR.setText("+Sabah fal bakt??r??rken falc??da bir s??k??nt??" +
                            " g??rd??n??z m???\n-Hay??r g??rmedim.");
                }
                else if(textViewM.getText().toString().equals("????len Fal Bakt??ran")){
                    textViewR.setText("+En son saat ka??ta g??rd??n falc??y???\n -????len 1 gibi g??rd??m.");
                }
                else if(textViewM.getText().toString().equals("??kindi Fal Bakt??ran")){
                    textViewR.setText("+Y??z??nde korku g??rd??n m?? ??l??n??n?\n- Hay??r g??rmedim, mutluydu.");
                }

            }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Ok??anmay?? sever misin?\n-Miyav!\n+Sevelim bakal??m");
            }
        });
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Sen mi ??ld??rd??n sahibini?\n-T??ssss. Me????????????v\n+Tamam sald??rma b" +
                        "i??i demedim");
            }
        });
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Mama sever misin?\n-Miyav miyav!\n+Al hepsi senin olsun.");
            }
        });
    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), IstEpFour.class);
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
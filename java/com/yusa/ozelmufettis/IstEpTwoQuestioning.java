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

public class IstEpTwoQuestioning extends AppCompatActivity {
    TextView textViewMid;
    TextView textViewRight;
    Button q1;
    Button q2;
    Button q3;
    Button q11;
    Button q12;
    Button q13;
    Button q12x;
    Button q131;
    Button q132;
    Button q133;
    Button q21;
    Button q22;
    Button q23;
    Button q211;
    Button q212;
    Button q213;
    Button q31;
    Button q32;
    Button q33;
    Button q321;
    Button q322;
    Button q323;
    Button sus1;
    Button sus2;
    Button sus3;
    Button sus4;
    Button sus5;
    Button sus6;
    Button sus7;
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
        setContentView(R.layout.activity_ist_ep_two_questioning);
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
        textViewMid = findViewById(R.id.textView6);
        textViewRight= findViewById(R.id.textView8);
        sus1 = findViewById(R.id.button50);
        sus2 = findViewById(R.id.button56);
        sus3 = findViewById(R.id.button60);
        sus4 = findViewById(R.id.button53);
        sus5 = findViewById(R.id.button55);
        sus6 = findViewById(R.id.button51);
        sus7 = findViewById(R.id.button52);

        q1 = findViewById(R.id.isE2Q1);
        q2 = findViewById(R.id.isE2Q2);
        q3 = findViewById(R.id.isE2Q3);
        q11 = findViewById(R.id.isE2Q11);
        q12 = findViewById(R.id.isE2Q12);
        q13 = findViewById(R.id.isE2Q13);
        q12x = findViewById(R.id.isE2Q12x);
        q131 = findViewById(R.id.isE2Q131);
        q132 = findViewById(R.id.isE2Q132);
        q133 = findViewById(R.id.isE2Q133);
        q21 = findViewById(R.id.isE2Q21);
        q22 = findViewById(R.id.isE2Q22);
        q23 = findViewById(R.id.isE2Q23);
        q211 = findViewById(R.id.isE2Q211);
        q212 = findViewById(R.id.isE2Q212);
        q213 = findViewById(R.id.isE2Q213);
        q31 = findViewById(R.id.isE2Q31);
        q32 = findViewById(R.id.isE2Q32);
        q33 = findViewById(R.id.isE2Q33);
        q321 = findViewById(R.id.isE2Q321);
        q322 = findViewById(R.id.isE2Q322);
        q323 = findViewById(R.id.isE2Q323);

        // suspect visibility
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is2Suspect4",false)){
            sus4.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is2Suspect5",false)){
            sus5.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is2Suspect6",false)){
            sus6.setVisibility(View.GONE);
        }
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Is2Suspect7",false)){
            sus7.setVisibility(View.GONE);
        }

        // suspect onclick listeners
        sus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Ölünün Karısı");
                textViewRight.setText("+Merhaba, eşinizin ölümü konusunda bazı sorular sormam gerekiyor.");

            }
        });
        sus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Villa Güvenliği");
                textViewRight.setText("+Merhaba, işlenen cinayet hakkında sormam gereken bazı" +
                        " sorular var");
            }
        });
        sus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Temizlik Görevlisi");
                textViewRight.setText("+Merhaba, ölü hakkında bazı sorular sormam gerekiyor.");
            }
        });
        sus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Ölünün Kardeşi");
                textViewRight.setText("+Merhaba, kardeşinizin" +
                        " ölümü konusunda bazı sorular sormam gerekiyor.");
            }
        });
        sus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Ölünün Metresi");
                textViewRight.setText("+Merhaba, size yakın zamanda işlenen cinayet hakkında" +
                        " bazı sorular sormam gerekiyor.");

            }
        });
        sus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Ölünün Komşusu");
                textViewRight.setText("+Merhaba, komşunuzun ölümü konusunda" +
                        " bazı sorular sormam gerekiyor.");
            }
        });
        sus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.GONE);
                q131.setVisibility(View.GONE);
                q132.setVisibility(View.GONE);
                q133.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.GONE);
                q212.setVisibility(View.GONE);
                q213.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q321.setVisibility(View.GONE);
                q322.setVisibility(View.GONE);
                q323.setVisibility(View.GONE);
                textViewMid.setText("Metresin Kardeşi");
                textViewRight.setText("+Merhaba, size bazı sorular sormam gerekiyor.");
            }
        });

        // question button onclick listeners
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q11.setVisibility(View.VISIBLE);
                q12.setVisibility(View.VISIBLE);
                q13.setVisibility(View.VISIBLE);
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Olay zamanı neredeydin?\n" +
                            "-Çocuğumla beraber annemlerdeydim.");
                    q13.setText("Kocanızın, annenizdeyken planı var mıydı");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Olay zamanı neredeydin?\n" +
                            "-Arkadaşlarla maç izledik sonra kritiğini yaptık.");
                    q13.setText("Neden maçı ölüyle izlemedin");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Olay zamanı neredeydin?\n" +
                            "-Evimde uyuyordum.");
                    q13.setText("Günün hangi vaktinde giderdin");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Olay zamanı neredeydin?\n" +
                            "-İşler biriktiği için ek mesaideydim.");
                    q13.setText("Neden karısına acıdığını söyledin");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Olay zamanı neredeydin?\n" +
                            "-Kıyafet almak için 4 gibi çıktım geceye kadar dışarıdaydım.");
                    q13.setText("Evde kimle yaşıyorsun");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Olay zamanı neredeydin?\n" +
                            "-Bahçemde kuzenlerimle mangal yapıyordum.");
                    q13.setText("Hakkınızda kötü konuşanlar varmış");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Olay zamanı neredeydin?\n" +
                            "-Kardeşimle evde tv izliyorduk.");
                    q13.setText("Kardeşinizin ilişkisi hakkında düşünceniz");
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
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Ölüyle alakan nedir?\n-6 yıldır evli karısıyım");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Ölüyle alakan nedir?\n-Villanın güvenliği olmam dışında" +
                            " arada beraber maç izlerdik yani arkadaşlığımız vardı.");

                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Ölüyle alakan nedir?\n-Bu villanın temizlik işleri" +
                            " uzun süredir bende");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Ölüyle alakan nedir?\n-Öz kardeşiyim ama uzun süredir" +
                            " görüşmüyoruz.");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Ölüyle alakan nedir?\n-Sevgilisiyim diyelim.");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Ölüyle alakan nedir?\n-Yan komşusu oluyorum.");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Ölüyle alakan nedir?\n-Kardeşimin güya sevgilisi");

                }
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Birisinden şüpheleniyor musunuz?\n" +
                            "-Eşimin kardeşinden şüpheleniyorum");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect4",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect4",true).apply();
                    sus4.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Birisinden şüpheleniyor musunuz?\n" +
                            "-Yan villanın sahibinden şüpheleniyorum.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect6",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect6",true).apply();
                    sus6.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Birisinden şüpheleniyor musunuz?\n" +
                            "-Metresi cadı kadından şüpheleniyorum.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect5",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect5",true).apply();
                    sus5.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Birisinden şüpheleniyor musunuz?\n" +
                            "-Metresi olma ihtimali yüksek duyduysa karısı da ölürmüş olabilir");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect5",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect5",true).apply();
                    sus5.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Birisinden şüpheleniyor musunuz?\n" +
                            "-Karısı öldürmüştür.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Birisinden şüpheleniyor musunuz?\n" +
                            "-Adam zengindi parası için öldürmüşlerdir ama isim yok aklımda.");
                    q1.setVisibility(View.VISIBLE);
                    q2.setVisibility(View.VISIBLE);
                    q3.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Birisinden şüpheleniyor musunuz?\n" +
                            "-Bu saçmalığa katlanamayıp öldürmüştür karısı.");
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
            }
        });
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Villaya ne kadar uzaktı? \n -Boğazın karşı tarafında");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Villaya ne kadar uzaktı? \n" +
                            " -15 ya da20 dakika olabilir emin değilim.");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Villaya ne kadar uzaktı? \n -Arabayla 45 dakika sürüyor.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Villaya ne kadar uzaktı? \n -Baya uzak");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Villaya ne kadar uzaktı? \n -Gezdiğim yerler yakın" +
                            " ama evim uzak");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Villaya ne kadar uzaktı? \n -Hocam seni" +
                            " kim dedektif yaptı merak ettim de.");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Villaya ne kadar uzaktı? \n -Arabayla yarım saat.");
                }
            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q12x.setVisibility(View.VISIBLE);
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Şahidin var mı? \n -Annem ve çocuğum var");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Şahidin var mı? \n -Sabahlayan arkadaşlarım var");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Şahidin var mı? \n -Hayır tek başıma yaşıyorum");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Şahidin var mı? \n -İş yerindeki arkadaşlar var.");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Şahidin var mı? \n -Kardeşim evden çıktığımı gördü");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Şahidin var mı? \n -Ailem kuzenlerim hepsi şahit olur");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Şahidin var mı? \n -Kardeşim");
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
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+O akşam için kocanızın planı var mıydı?" +
                            " \n -Evde maç izleyecekti");
                    q131.setText("Maç izlemeye birini davet eder miydi");
                    q132.setText("Annenize sık sık gider misiniz");
                    q133.setText("Kocanız yalnız kalmayı sever mi");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Onu neden maç izlemeye" +
                            " davet etmedin? \n -Arkadaşlarımı tanımıyordu");
                    q131.setText("Senden başkasıyla izler miydi");
                    q132.setText("Kameralara senin dışında ulaşabilecek kişiler kimler");
                    q133.setText("Maç izliyorum demesi yalan mıydı");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Günün hangi vakti temizliğe giderdin? \n" +
                            " -Sabah 9 gibi genellikle.");
                    q131.setText("Saat kaçta çıkardın");
                    q132.setText("Temizlik malzemelerinde eksik var mıydı");
                    q133.setText("Villa yolu tenha mıdır");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Karısına acıdığını söylemişsin, niye? \n" +
                            " -Bu sevgili/metres olaylarından dolayı.");
                    q131.setText("Daha önce de eşini aldatmış mıydı");
                    q132.setText("Karısının cinayet işleyecek akrabası var mı");
                    q133.setText("Metresin bu duruma alınacak bir akrabası var mı");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Evde birisiyle mi yaşıyorsun? \n -Kardeşimle yaşıyorum");
                    q131.setText("İlişkiniz olduğunu kim biliyor");
                    q132.setText("Kardeşinle iyi anlaşır mısınız");
                    q133.setText("Sık sık o mekanlara gider miydiniz");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Hakkınızda kötü konuşanlar var? \n -Ölünün itine çok sövmüşümdür" +
                            " düzgün it olsa korurdu sahibini zaten");
                    q131.setText("Komşunla çok kavga eder miydin");
                    q132.setText("Evlerinizin güvenlik sistemi benziyor mu");
                    q133.setText("Villa çalışanları hakkında ne düşünüyorsun");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Kardeşinizin ilişkiai hakkında ne düşünüyorsunuz?" +
                            " \n -Bir şekilde bitmesi gerekiyordu bitti.");
                    q131.setText("Hiç yüz yüze tanıştınız mı");
                    q132.setText("Kardeşiniz onun evine hiç gitmiş miydi");
                    q133.setText("Maddi durumunuz nasıl");
                }
            }
        });
        q12x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("Ölünün Karısı")){
                   textViewRight.setText("+Peki kanıtlayabilir misin?\n-Köprüden geçtim yani evet");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Peki kanıtlayabilir misin?\n-Kanıtım yok ama dediğim gibi" +
                            " arkadaşlar var.");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Peki kanıtlayabilir misin?\n-Villaya" +
                            " gitmediğimi kanıtlayabilirim çevredeki kameralardan");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Peki kanıtlayabilir misin?\n-Kesinlike, evet");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Peki kanıtlayabilir misin?\n-Gittiğim yerlerin kamera" +
                            " kayıtları kanıtlar.");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Peki kanıtlayabilir misin?\n-Storyler sayılırsa evet.");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Peki kanıtlayabilir misin?\n-Yok. Şahit yetmiyor mu?");
                }
            }
        });
        q131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Maç izlemeye birini davet etmiş miydi\n-" +
                            "Hayır bazen güvelikle izlerlerdi ama.");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Senden başkasıyla maç izlermiydi?\n" +
                            " -Metres olaylarından önce bazen kardeşiyle izlerdi");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Bugün temizlik malzemelerinde eksik gördünüz mü?\n-Hayır.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Eşini daha önceden aldatır mıydı?\n-Hayır.");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+İlişkiniz olduğunu kimler biliyordu?\n-Kardeşi,kardeşim," +
                            "güvenlik,belki temizlikçi.");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Çok kavga eder miydiniz?\n-Takım ve köpeği konusunda " +
                            "çok takışırdık ama fiziksel kavgamız olmadı");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Ölüyle hiç yüz yüze görüştünüz mü? \n-Hayır");
                }
            }
        });
        q132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("Annenize sık sık ziyarete gider miydiniz?" +
                            "\n-Haftada iki kez genellikle");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Kameralara senden başka erişebilecekler?\n-Karısı," +
                            "metresi,şifresini hala değiştirmediğini biliyorlarsa komşusu ve kardeşi");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Peki saat kaçta çıkardın villadan?\n-13 gibi.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Karısının cinayet işlemek istese yardım alabileceği" +
                            " birisi var mı?\n-Yok, olmadığına emin sayılırım.");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Kardeşinle iyi anlaşır mıydınız\n-Sevgilimden haz " +
                            "etmezdi ama pek kavga da etmedik");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Evlerinizin güvenlik sistemi benziyormuş?\n Aynı" +
                            " yere yaptırdık şifresini aynı koydularsa şaşırmam," +
                            " şifreyi değiştirmem lazım.");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Kardeşiniz onun evine gitmiş miydi?\n-Nadiren" +
                            " gidiyordu galiba ama daha çok dışarıda buluşuyorlardı ben hiç" +
                            " bırakmadım onu");
                }
            }
        });
        q133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Kocanız yalnız kalmayı seviyor gibi?\n-Evet,annene " +
                            "git istersen dediği de oluyor");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Maç izliyorum diye yalan söylediği oluyor muydu?\n" +
                            "-Bazen metresiyle buluşacağı zamanlar");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Villa yolu tenha mıdır?" +
                            "-İstanbul için kesinlikle.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Metresinin bu durumdan alınacak bir" +
                            " akrabası/eski sevgilisi var mıdır?\n-Evet bir erkek kardeşi var");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect7",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect7",true).apply();
                    sus7.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("Sık sık o mekanlara gidermiydiniz özellikle sevgilinizle?" +
                            "Hayır daha elit yerleri tercih ederim genellikle");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("Villa çalışanları hakkında ne düşünüyorsunuz?" +
                            "\n-Normal insanlar ama güvenliğe biraz kılım.");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Maddi durumunuz nasıl?\n-Fakirim ama aç gezmem");
                }
            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q211.setVisibility(View.VISIBLE);
                q212.setVisibility(View.VISIBLE);
                q213.setVisibility(View.VISIBLE);
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+En son ne konuştunuz\n-Maç bitti ben yatıyorum dedi.");
                    q211.setText("22'den sonra iletişiminiz oldu mu");
                    q212.setText("Öldüğünü ne zaman öğrendin");
                    q213.setText("Daha sonra onla konuşmuş olabilecek biri var mı");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+En son ne konuştunuz\n-Akşam yarın erken gel" +
                            " dedi ben arkadaşlara gitmeden");
                    q211.setText("Daha sonra iletişiminiz oldu mu");
                    q212.setText("Ne zaman öldüğünü öğrendin");
                    q213.setText("O gece onunla konuşmuş olabilecek başkası var mı");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+En son ne konuştunuz\n-Zam yapmak istemediğini söyledi.");
                    q211.setText("Herkese karşı cimri midir");
                    q212.setText("Çalışanlarına karşı saygılı mıdır");
                    q213.setText("Başka kadınlara para yedirir mi");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+En son ne konuştunuz\n-Bayramda bayramlaşmıştık.");
                    q211.setText("Karısı biliyor mu");
                    q212.setText("Metresi tek başına mı yaşar");
                    q213.setText("Ortak konuştuğunuz biri var mı");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+En son ne konuştunuz\n-Canımlı cicimli konuşmalar.");
                    q211.setText("Hiç tartışmış mıydınız");
                    q212.setText("Kardeşinle arası nasıldı");
                    q213.setText("Karısından boşanmayı düşünmüş müydü");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+En son ne konuştunuz\n-Evin bakımını kime yaptırdın" +
                            " ev ahıra dönmüş dedi ben de kızdım tabi.");
                    q211.setText("Sen de sinirlenip vurdun mu");
                    q212.setText("Eşi konusunda ne düşünüyorsun");
                    q213.setText("Köpeği yabancılara karşı gürültülü müdür");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("Kardeşimin telefonuna baktım bana sen kimsin dedi. ");
                    q211.setText("Kardeşinle hiç kavga ettiniz mi");
                    q212.setText("Sabıkan varmış doğru mu");
                    q213.setText("Peki o gün birisiyle telefonda konuştun mu");
                }
            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Bildiğiniz sosyal medyası var mı?\n-Linkedin i var.");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Bildiğiniz sosyal medyası var mı?\n-Benim feys" +
                            " var ama onu göremedim baktığımda");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Bildiğiniz sosyal medyası var mı?\n-Sosyal medya ne? " +
                            "Öyle şeyler kullanmıyorum.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Bildiğiniz sosyal medyası var mı?\n-Linkedini" +
                            " ve twitterı var");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Bildiğiniz sosyal medyası var mı?\n-Twitterdan" +
                            " konuşuyorduk biz.");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Bildiğiniz sosyal medyası var mı?\n-Hiç dikkat etmedim");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Bildiğiniz sosyal medyası var mı?\n-Umrumda değil.");
                }
            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz?\n-Benimle eskisi kadar çok " +
                            "ilgilenmiyordu ama hala seviyorduk birbirimizi");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz?\n- Biraz çakaldı ama" +
                            " maaş vaktini geciktirmezdi muhabbeti de iyiydi");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz?\n- Birbirimize fazla" +
                            " karışmazdık eşini aldatan pis biri olsa da zararsızdı");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz?\n-Son bir kaç yıldır eskisi" +
                            " gibi değildi ama aynı karından çıktık sonuçta");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz?\n-Kocam olmalıydı ama olmadı.");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz?\n-Birbirimize söver dururduk.");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Hakkında ne düşünüyordunuz?\n-Karısını aldatan " +
                            "adam iğrençtir. Kardeşimle aldatması daha iğrenç.");
                }
            }
        });
        q211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Daha sonra iletişim kurdunuz mu?-Hayır gece" +
                            " mesajıma dönmedi");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Daha sonra iletişim kurdunuz mu?-11 de " +
                            "gol oldu diye mesajlaştık.");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Herkese karşı cimri midir?\n-Cimriliğini bilmem ama " +
                            "karısından para saklamazdı");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Karısı aldatıldığını bilmiyor değil mi?\n" +
                            "-Bilmediğini düşünüyorum");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Hiç tartışmış mıydınız?\n -Boşan o kadından benimle evlen" +
                            " dedim kabul etmedi ama.");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Sen de sinirlenip vurdun mu?\n-Yok canım silahım yok ki" +
                            "olsa da vuracak kadar salak değilim.");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Kardeşinle bu konuda hiç kavga ettiniz mi bu konuda?\n-Sözlü evet.");
                }
            }
        });
        q212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Öldüğünü ne zaman öğrendin?\n-Sonraki sabah yani bugün.");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Öldüğünü ne zaman öğrendin?\n-Daha yeni öğrendim.");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Çalışanlarına karşı saygılı mıdır?\n-Evet, kaba birisi " +
                            "değildi. Saygılı davranırdı yani.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Metresi tek başına mı yaşıyor?\n-Hayır kardeşi var ve " +
                            "kavgacı sabıkalı birisi.");
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect7",true).apply();
                    sus7.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Kardeşinle arası nasıldı?\n-Tanışmıyorlardı sadece ismen biliyorlardı birbirini.");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("+Eşi hakkında ne düşünüyorsun\n-Saf birisi kardeşime çok" +
                            " zeki olsa katlanamazdı");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Sabıkan var mı?\n-Aileme küfretmişti ben de bıçakladım" +
                            " bir kaç yıl önce. Allahtan ölmediydi.");
                }
            }
        });
        q213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Daha sonra onla konuşmuş olabilecek birisi?\n-Bildiğim" +
                            " birisi yok");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Daha sonra onla konuşmuş olabilecek birisi?\n" +
                            "-Metresini aramıştır ev boşken.");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Başkalarına para yedirir miydi?\n-Metresine biraz.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+İkinizin de konuştuğu birisi var mı?\n-O " +
                            "villanın temizlikçisi bir kaç defa gelmişti benim eve de");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Karısından boşanmayı hiç düşündü mü?\n-Ben sorduğumda" +
                            " beni hep geçiştiriyordu");
                }
                else if (textViewMid.getText().equals("Ölünün Komşusu")){
                    textViewRight.setText("Köpeği yabancılara gürültülü müdür?\n-Evet dün akşamki" +
                            " gürültüsü ondan dolayı olabilir");
                }
                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("Peki o gün telefonda biriyle konuştunuz mu? \n" +
                            "Hayır meşguldüm.");
                }
            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Neden ondan şüpheleniyorsun?\n-İlginç bir şekilde" +
                            " bana acıdığını söylüyordu");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Neden ondan şüpheleniyorsun?\n" +
                            "-2 gün önce köpek gürültüsünden kavga etmişlerdi");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Neden ondan şüpheleniyorsun?\n-Boşanmazsan seni" +
                            " öldürürüm dediğini duydum.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Neden ondan şüpheleniyorsun?\n-Kıskanç bir kadın evli " +
                            "biriyle ilişkisi olanın kendisi olduğu halde.");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Neden ondan şüpheleniyorsun?\n-Kıskançlık?");
                }

                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Neden ondan şüpheleniyorsun?\n-Düz mantık gittim.");
                }
            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q32.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("Detay verebilir misin?\n-Hangi konuda?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("Detay verebilir misin?\n-Nasıl detay?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("Detay verebilir misin?\n-Hangi konuda" +
                            "? Adını mı istiyorsun?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("Detay verebilir misin?\n-Hangi konuda?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("Detay verebilir misin?\n- Nasıl? hangi konuda?");
                    q321.setVisibility(View.VISIBLE);
                    q322.setVisibility(View.VISIBLE);
                    q323.setVisibility(View.VISIBLE);
                }

                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("Detay verebilir misin?\n-Senden daha az tanıyorum detay " +
                            "verebileceğim bir şey yok.");
                    q32.setVisibility(View.VISIBLE);
                    q31.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Fiziksel özellikleri nedir?\n-Kardeşime çok benziyor" +
                            " sadece saçları daha gür");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Fiziksel özellikleri nedir?\n- Kısa şişko bir adam");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Fiziksel özellikleri nedir?\n-20lerinin başında" +
                            " kızıl saçlı, zayıf sayılır.");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Fiziksel özellikleri nedir?\n-Genç kızıl saçı " +
                            "vardı en son.");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Fiziksel özellikleri nedir?\n-Sarışın ve benden çirkin.");
                }

                else if (textViewMid.getText().equals("Metresin Kardeşi")){
                    textViewRight.setText("+Fiziksel özellikleri nedir?\n-Kardeşime sor.");
                }
            }
        });
        q321.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("Ölünün Karısı")){
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Loc3",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni yer keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    textViewRight.setText("+Nerede yaşar?\n-Kadıköy taraflarında, adresini vereyim.");
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Loc3",true).apply();
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Nerede yaşar?\n-Hemen yan villa, göstereyim");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Loc4",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni yer keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Loc4",true).apply();
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Nerede yaşar?\n- Bizim mahallede Doğru apartmanda." +
                            " Üç apartman solumda.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Loc2",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni yer keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Loc5",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni yer keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Loc2",true).apply();
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Loc5",true).apply();
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Nerede yaşar?\n-Bilmiyorum villa çalışanlarına" +
                            " sorabilirsin");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Nerede yaşar?\n-Aynı evde yaşarlar.");
                }
            }
        });
        q322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("+Ölünün tam olarak nesi olur?\n-Öz kardeşi");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("+Ölünün tam olarak nesi olur?\n-Sadece komşusu başka" +
                            " bağları yok");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("+Ölünün tam olarak nesi olur?\n- Sevgilisi??");
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("+Ölünün tam olarak nesi olur?\n-Karısını aldattığı kadın");
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("+Ölünün tam olarak nesi olur?\n-Tahmin et..." +
                            " İpucu vereyim 6 harfli baş harfi k");
                }
            }
        });
        q323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewMid.getText().equals("Ölünün Karısı")){
                    textViewRight.setText("Önceden bir suça karışmış mıdır?\n-Hayır ama bu devird" +
                            "e belli mi olur");
                }
                else if (textViewMid.getText().equals("Villa Güvenliği")){
                    textViewRight.setText("Önceden bir suça karışmış mıdır?\n-Tanımam ama" +
                            " karışmış olabilir");
                }
                else if (textViewMid.getText().equals("Temizlik Görevlisi")){
                    textViewRight.setText("Önceden bir suça karışmış mıdır?\n-Kendisi değil ama " +
                            "kardeşinin adam yaralaması vardı.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect7",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect7",true).apply();
                    sus7.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Kardeşi")){
                    textViewRight.setText("Önceden bir suça karışmış mıdır?\n-Dolandırıcı olabilir" +
                            " onun dışında kardeşi hakkında adam yaralama gibi bir şeyler duydum.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (IstEpTwoQuestioning.this).getBoolean("Is2Suspect7",false)){
                        Toast.makeText(IstEpTwoQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(IstEpTwoQuestioning.this).
                            edit().putBoolean("Is2Suspect7",true).apply();
                    sus7.setVisibility(View.VISIBLE);
                }
                else if (textViewMid.getText().equals("Ölünün Metresi")){
                    textViewRight.setText("Önceden bir suça karışmış mıdır?\n-Kıskançık" +
                            "cinayetleri sabıkaya çok bakmıyor ama duymadım.");
                }
            }
        });

    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), IstEpTwo.class);
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
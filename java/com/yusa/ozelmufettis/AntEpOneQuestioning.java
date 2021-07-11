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

public class AntEpOneQuestioning extends AppCompatActivity {
    TextView textViewR;
    TextView textViewM;
    Button s1;
    Button s2;
    Button s3;
    Button s4;
    Button s5;
    Button s6;
    Button s7;
    Button s8;
    Button s9;
    Button q1;
    Button q2;
    Button q3;
    Button q4;
    Button q21;
    Button q22;
    Button q23;
    Button q31;
    Button q32;
    Button q33;

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
        setContentView(R.layout.activity_ant_ep_one_questioning);
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
        textViewM = findViewById(R.id.textView32);
        textViewR = findViewById(R.id.textView31);
        s1 = findViewById(R.id.button119);
        s2 = findViewById(R.id.button120);
        s3 = findViewById(R.id.button121);
        s4 = findViewById(R.id.button122);
        s5 = findViewById(R.id.button123);
        s6 = findViewById(R.id.button124);
        s7 = findViewById(R.id.button125);
        s8 = findViewById(R.id.button126);
        s9 = findViewById(R.id.button127);

        q1 = findViewById(R.id.at1Q1);
        q2 = findViewById(R.id.at1Q2);
        q3 = findViewById(R.id.at1Q3);
        q21 = findViewById(R.id.at1Q21);
        q22 = findViewById(R.id.at1Q22);
        q23 = findViewById(R.id.at1Q23);
        q31 = findViewById(R.id.at1Q31);
        q32 = findViewById(R.id.at1Q32);
        q33 = findViewById(R.id.at1Q33);
        q4 = findViewById(R.id.at1Q4);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Otel sahibi");
                textViewR.setText("+Yine karşılaştık...\n-Evet keşke iyi karşılaşsak.");
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.VISIBLE);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Merhabalar.\n-Merhaba");
                textViewM.setText("Otel temizlikçisi");
                q2.setText("Elinde bir kanıt var mı");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Merhaba.\n-Merhaba sana da.");
                textViewM.setText("Otel güvenliği");
                q2.setText("Elinde bir kanıt var mı");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Pardon size bazı sorular sormam gerekiyor\n-Tamam.");
                textViewM.setText("305. oda sakini");
                q2.setText("Kurbanı tanıyor musun");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Pardon size bazı sorular sormam gerekiyor\n-Tamam olur.");
                textViewM.setText("306. oda sakini");
                q2.setText("Kurbanı tanıyor musun");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Pardon size bazı sorular sormam gerekiyor\n-Tamam sor.");
                textViewM.setText("307. oda sakini");
                q2.setText("Kurbanı tanıyor musun");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Pardon size bazı sorular sormam gerekiyor\n-Tamam.");
                textViewM.setText("308. oda sakini");
                q2.setText("Kurbanı tanıyor musun");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Pardon size bazı sorular sormam gerekiyor\n-Okey, sor.");
                textViewM.setText("310. oda sakini");
                q2.setText("Kurbanı tanıyor musun");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
            }
        });
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Pardon size bazı sorular sormam gerekiyor\n-Tamam.");
                textViewM.setText("311. oda sakini");
                q2.setText("Kurbanı tanıyor musun");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
                q4.setVisibility(View.GONE);
            }
        });
        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
                .getBoolean("Ant1Suspects",false)){
            s4.setVisibility(View.GONE);
            s5.setVisibility(View.GONE);
            s6.setVisibility(View.GONE);
            s7.setVisibility(View.GONE);
            s8.setVisibility(View.GONE);
            s9.setVisibility(View.GONE);
        }

        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlikçisi")){
                    textViewR.setText("+Hangi odada kalıyorsun?\n-Burada kaldığım bir oda yok." +
                            " Sabah geliyorum işimi yapıp akşam evime gidiyorum servisle.");
                }
                else if (textViewM.getText().toString().equals("Otel güvenliği")){
                    textViewR.setText("+Hangi odada kalıyorsun?\n-Otelde çalışırken güvenlik " +
                            "odasındayım.");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Hangi odada kalıyorsun?\n-305. odada kalıyorum.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Hangi odada kalıyorsun?\n-305. ya da 306. odada kalıyorum.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Hangi odada kalıyorsun?\n-307. odada kalıyorum");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Hangi odada kalıyorsun?\n-3. katta 8. odada kalıyorum.");
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Hangi odada kalıyorsun?\n-310da kalıyorum");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Hangi odada kalıyorsun?\n-311. odada tek başıma kalıyorum.");
                }
            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewM.getText().toString().equals("Otel temizlikçisi")){
                    textViewR.setText("+Elinde bir kanıt var mı?\n-O katta değildim olay zamanı ve" +
                            " elimde kanıt yok.");
                }
                else if (textViewM.getText().toString().equals("Otel güvenliği")){
                    q21.setText("305. oda önündeki kamerayı incele");
                    q22.setText("308. oda önündeki kamerayı incele");
                    q23.setText("310. oda önündeki kamerayı incele");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                    textViewR.setText("+Elinde bir kanıt var mı?\n-Elimde bir kanıt yok ama kamera" +
                            "ları beraber inceleyelim");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Kurbanı tanımıyorum ama ailesinin" +
                            " başı sağolsun.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Yemekte kısa bir muhabbet etmiştik.");
                    q21.setText("Kurbanla ne kadar konuştunuz");
                    q22.setText("Kurbanın ruh hali nasıl görünüyordu");
                    q23.setText("Başka BİR ODA SAKİNİYLE KURBAN HAKKINDA KONUŞMUŞ MUYDUN");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Tanıyorum. İyi bir kadındı keşke" +
                            " ölmeseydi.");
                    q21.setText("Kurbanla ne kadar konuştunuz");
                    q22.setText("Kurbanın ruh hali nasıl görünüyordu");
                    q23.setText("Başka BİR ODA SAKİNİYLE KURBAN HAKKINDA KONUŞMUŞ MUYDUN");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Evet yan odadaydı 309. odada.");
                    q21.setText("Kurbanla ne kadar konuştunuz");
                    q22.setText("Kurbanın ruh hali nasıl görünüyordu");
                    q23.setText("Başka BİR ODA SAKİNİYLE KURBAN HAKKINDA KONUŞMUŞ MUYDUN");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Yan odamda kalan kadın mıydı?" +
                            "\n+Evet.\n-Tanıyorum.");
                    q21.setText("Kurbanla ne kadar konuştunuz");
                    q22.setText("Kurbanın ruh hali nasıl görünüyordu");
                    q23.setText("Başka BİR ODA SAKİNİYLE KURBAN HAKKINDA KONUŞMUŞ MUYDUN");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Hayır, tanımıyorum.");
                }
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlikçisi")){
                    textViewR.setText("+Olay olduğu an neredeydin ve ne yapıyordun?\n-" +
                            "İki alt kattaydım. Olay olan kata da ben bakardım " +
                            "normalde ama oradan ayrılalı 1 saat oluyordu");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Otel güvenliği")){
                    textViewR.setText("+Olay olduğu an neredeydin ve ne yapıyordun?\n-Güvenlik" +
                            " odasında telefonla oynuyordum. Kameralara olay olmadıkça bakmam.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Olay olduğu an neredeydin ve ne yapıyordun?\n-Açık büfede" +
                            " ne varsa yiyordum. O gün normalden biraz geç kalkmıştım.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Olay olduğu an neredeydin ve ne yapıyordun?\n-Odamdaydım," +
                            " uyuyordum. Çığlığı duyunca uyandım.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Olay olduğu an neredeydin ve ne yapıyordun?\n-Restoranta" +
                            " gidiyordum yaklaşık on dakika öncesinde.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Olay olduğu an neredeydin ve ne yapıyordun?\n-Odamda " +
                            "uzanıyordum. Bugün Aspendosa gitme planım vardı.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Olay olduğu an neredeydin ve ne yapıyordun?\n-Uyuyordum " +
                            "şimdi sen kapıyı tıklayınca uyandım.");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Olay olduğu an neredeydin ve ne yapıyordun?\n-Otelin spor" +
                            " salonunda spor yapıyordum.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel güvenliği")){
                    textViewR.setText("+305. oda kamerası sabah 7:30 saatlerinde uzun boylu " +
                            "bir adam elinde bir spor çantayla koridordan geçiyor. Saat 11 de " +
                            "uzun ince birisi kameranın önünden geçiyor ama yüzü seçilemiyor.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Kurbanla ne kadar ne konuştunuz?\n-Yemekte havadan sudan, " +
                            "nerelisin, ne iş yaparsın diye konuştuk");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Kurbanla ne kadar ne konuştunuz?\n-Çok konuştuk." +
                            " Sık sık konuşurduk.");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Kurbanla ne kadar ne konuştunuz?\n-Bir kaç kere gürültü " +
                            "yaptığı için konuştum kendisiyle.");
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Kurbanla ne kadar ne konuştunuz?\n-Az konuştuk. Ayaküstü" +
                            " kapı önünde muhabbet etmiştik.");
                }
            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel güvenliği")){
                    textViewR.setText("+308. odadan sabah 9:30 gibi çıkıp 10:45 gibi odaya geri" +
                            " giriyor oda sakini. Olay " +
                            "anı bu kameranın kör noktasında gerçekleşiyor gibi.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Kurbanın ruh hali nasıl görünüyordu?\n-Mutsuz gibiydi." +
                            " Sorduğumda \"Boşver senin de keyfin kaçmasın\" dedi.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Kurbanın ruh hali nasıl görünüyordu?\n-Normaldi bence");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Kurbanın ruh hali nasıl görünüyordu?\n-Uyarmaya gittiğimde" +
                            " normal geldi bana.");
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Kurbanın ruh hali nasıl görünüyordu?\n-307 deki adam beni" +
                            " rahatsız ediyor şizofreni fln olabilir hakkımda alakasız şeyler" +
                            " söylüyor dedi.");
                }
            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel güvenliği")){
                    textViewR.setText("+310. odanın önündeki kameraya göre katil saat 11 de " +
                            "kaçarak uzaklaşıyor. Katilin yüzü" +
                            " hiç gözükmüyor ama uzun boylu ve erkek olduğu belli.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Başka bir oda sakiniyle kurban hakkında konuştun mu?\n-308." +
                            " odadakiyle koridorda ayaküstü konuştuk kurbanın yaptığı gürültü hakkında.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Başka bir oda sakiniyle kurban hakkında konuştun mu?\n-308." +
                            " odadaki arkadaşımla konuştum. Ölü hakkında kötü düşünüyordu.");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Başka bir oda sakiniyle kurban hakkında konuştun mu?\n-306," +
                            "307 ve 310. oda sakinleriyle konuştum. Bu arada 307 deki adamın " +
                            "kadın hakkında bir dediği bir dediğini tutmuyordu. Sıkıntılı bir tip.");
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Başka bir oda sakiniyle kurban hakkında konuştun mu?\n-308" +
                            " deki genç sesten rahatsız olup olmadığımı sormuştu ölen kadın hakkında");
                }
            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlikçisi")){
                    textViewR.setText("+Çığlıktan önce hiç ses duydun mu?\n-Senin duyduğundan" +
                            " daha azını duymuşumdur.");
                }
                else if (textViewM.getText().toString().equals("Otel güvenliği")){
                    textViewR.setText("+Çığlıktan önce hiç ses duydun mu?\n-Hocam buradan nasıl ses" +
                            " duyayım.");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Çığlıktan önce hiç ses duydun mu?\n-Sabah 10 gibi" +
                            " temizlikçinin sesine uyanmıştım. Cinayetle alakalı bir ses duymadım.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Çığlıktan önce hiç ses duydun mu?\n-Rüyamda bir şey " +
                            "duymuştum ama işine yaramaz.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Çığlıktan önce hiç ses duydun mu?\n-Hayır duymadım.");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Çığlıktan önce hiç ses duydun mu?\n-Hemen öncesinde " +
                            "şizofren misin adam seni tanımıyorum bile diye konuştu. Yardım istese" +
                            " çıkardım yardıma.");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Çığlıktan önce hiç ses duydun mu?\n-Ben çığlık duymadım.");
                }
            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlikçisi")){
                    textViewR.setText("+Sen koridora çıktığında kaçan birisini gördün mü?\n-" +
                            "Ben koridora çıktığımda sen çoktan gelmiştin.");
                }
                else if (textViewM.getText().toString().equals("Otel güvenliği")){
                    textViewR.setText("+Sen koridora çıktığında kaçan birisini gördün mü?\n-Olay" +
                            " yerine hala gitmedim ondan dolayı bu soruyu başkasına sor derim.");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Sen koridora çıktığında kaçan birisini gördün mü?\n-Hayır." +
                            " Sabah 10 da kimse koşmuyordu.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Sen koridora çıktığında kaçan birisini gördün mü?\n-Ben" +
                            " çıktığımda koridorun sonunda bir karartı " +
                            "gördüm başka bir oda sakiniyle kadını kurtarmaya çalıştık.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Sen koridora çıktığında kaçan birisini gördün mü?\n-Hayır " +
                            "ama olay sırasında orada olsam kesinlikle yakalar ve gününü gösterirdim");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Sen koridora çıktığında kaçan birisini gördün mü?\n-Evet. " +
                            "Atletik birisiydi ama hızlıca kayboldu kim olduğundan emin değilim.");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Sen koridora çıktığında kaçan birisini gördün mü?\n-" +
                            "Koridora 7 buçukta çıktım ben. Biri koşsa otelden atılırdı herhalde.");
                }
            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlikçisi")){
                    textViewR.setText("+Peki sen kimsin ve kendini tanıtabilir misin?\n-Yaşlı," +
                            " emekliliğe gün sayan bir kadınım ben.");
                }
                else if (textViewM.getText().toString().equals("Otel güvenliği")){
                    textViewR.setText("+Peki sen kimsin ve kendini tanıtabilir misin?\n-Tembel," +
                            " şişman bir güvenliğim. Kameralara bakar paramı alırım.");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tanıtabilir misin?\n-Görebileceğin" +
                            " üzere başörtülü bir kadınım. Memurum, 9-5 çalışırım, kimseyi öldürmem.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tanıtabilir misin?\n-Adım Arif," +
                            " 34 yaşındayım, 7 nesildir İstanbulluyum, inşaat işim var.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tanıtabilir misin?\n- 29 " +
                            "yaşındayım, işsizim kısa mesafede çok hızlıyım.");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tanıtabilir misin?\n-Diyet " +
                            "yapmadan önce kendime kıyak yapmak için buraya gelmiş şişman" +
                            " bir adamım. Gürültüden nefret ederim.");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tanıtabilir misin?\n-İkinci ligde" +
                            " orta saha oyuncusuyum. Tatil için buraya geldim.");
                }
            }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Bana kamera kayıtlarını ve o kattaki sakinlerin isimlerini" +
                        " verebilir" +
                        " misin?\n-Tamam güvenlikle bak da kameralarda öldüren net gözükmüyor.");
                if (!PreferenceManager.getDefaultSharedPreferences
                        (getApplicationContext()).getBoolean("Ant1Places",false)){
                    Toast.makeText(AntEpOneQuestioning.this,"Yeni mekanlar keşfettin"
                            , Toast.LENGTH_LONG).show();
                }
                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                        edit().putBoolean("Ant1Places",true).apply();
                s4.setVisibility(View.VISIBLE);
                s5.setVisibility(View.VISIBLE);
                s6.setVisibility(View.VISIBLE);
                s7.setVisibility(View.VISIBLE);
                s8.setVisibility(View.VISIBLE);
                s9.setVisibility(View.VISIBLE);
                if (!PreferenceManager.getDefaultSharedPreferences
                        (getApplicationContext()).getBoolean("Ant1Suspects",false)){
                    Toast.makeText(AntEpOneQuestioning.this,"Yeni şüpheliler keşfettin"
                            , Toast.LENGTH_LONG).show();
                }
                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                        edit().putBoolean("Ant1Suspects",true).apply();

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
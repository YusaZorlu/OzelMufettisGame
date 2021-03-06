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
                textViewR.setText("+Yine kar????la??t??k...\n-Evet ke??ke iyi kar????la??sak.");
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
                textViewM.setText("Otel temizlik??isi");
                q2.setText("Elinde bir kan??t var m??");
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
                textViewM.setText("Otel g??venli??i");
                q2.setText("Elinde bir kan??t var m??");
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
                textViewR.setText("+Pardon size baz?? sorular sormam gerekiyor\n-Tamam.");
                textViewM.setText("305. oda sakini");
                q2.setText("Kurban?? tan??yor musun");
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
                textViewR.setText("+Pardon size baz?? sorular sormam gerekiyor\n-Tamam olur.");
                textViewM.setText("306. oda sakini");
                q2.setText("Kurban?? tan??yor musun");
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
                textViewR.setText("+Pardon size baz?? sorular sormam gerekiyor\n-Tamam sor.");
                textViewM.setText("307. oda sakini");
                q2.setText("Kurban?? tan??yor musun");
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
                textViewR.setText("+Pardon size baz?? sorular sormam gerekiyor\n-Tamam.");
                textViewM.setText("308. oda sakini");
                q2.setText("Kurban?? tan??yor musun");
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
                textViewR.setText("+Pardon size baz?? sorular sormam gerekiyor\n-Okey, sor.");
                textViewM.setText("310. oda sakini");
                q2.setText("Kurban?? tan??yor musun");
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
                textViewR.setText("+Pardon size baz?? sorular sormam gerekiyor\n-Tamam.");
                textViewM.setText("311. oda sakini");
                q2.setText("Kurban?? tan??yor musun");
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
                if (textViewM.getText().toString().equals("Otel temizlik??isi")){
                    textViewR.setText("+Hangi odada kal??yorsun?\n-Burada kald??????m bir oda yok." +
                            " Sabah geliyorum i??imi yap??p ak??am evime gidiyorum servisle.");
                }
                else if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    textViewR.setText("+Hangi odada kal??yorsun?\n-Otelde ??al??????rken g??venlik " +
                            "odas??nday??m.");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Hangi odada kal??yorsun?\n-305. odada kal??yorum.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Hangi odada kal??yorsun?\n-305. ya da 306. odada kal??yorum.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Hangi odada kal??yorsun?\n-307. odada kal??yorum");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Hangi odada kal??yorsun?\n-3. katta 8. odada kal??yorum.");
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Hangi odada kal??yorsun?\n-310da kal??yorum");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Hangi odada kal??yorsun?\n-311. odada tek ba????ma kal??yorum.");
                }
            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewM.getText().toString().equals("Otel temizlik??isi")){
                    textViewR.setText("+Elinde bir kan??t var m???\n-O katta de??ildim olay zaman?? ve" +
                            " elimde kan??t yok.");
                }
                else if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    q21.setText("305. oda ??n??ndeki kameray?? incele");
                    q22.setText("308. oda ??n??ndeki kameray?? incele");
                    q23.setText("310. oda ??n??ndeki kameray?? incele");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                    textViewR.setText("+Elinde bir kan??t var m???\n-Elimde bir kan??t yok ama kamera" +
                            "lar?? beraber inceleyelim");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Kurban?? tan??m??yorum ama ailesinin" +
                            " ba???? sa??olsun.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Yemekte k??sa bir muhabbet etmi??tik.");
                    q21.setText("Kurbanla ne kadar konu??tunuz");
                    q22.setText("Kurban??n ruh hali nas??l g??r??n??yordu");
                    q23.setText("Ba??ka B??R ODA SAK??N??YLE KURBAN HAKKINDA KONU??MU?? MUYDUN");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Tan??yorum. ??yi bir kad??nd?? ke??ke" +
                            " ??lmeseydi.");
                    q21.setText("Kurbanla ne kadar konu??tunuz");
                    q22.setText("Kurban??n ruh hali nas??l g??r??n??yordu");
                    q23.setText("Ba??ka B??R ODA SAK??N??YLE KURBAN HAKKINDA KONU??MU?? MUYDUN");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Evet yan odadayd?? 309. odada.");
                    q21.setText("Kurbanla ne kadar konu??tunuz");
                    q22.setText("Kurban??n ruh hali nas??l g??r??n??yordu");
                    q23.setText("Ba??ka B??R ODA SAK??N??YLE KURBAN HAKKINDA KONU??MU?? MUYDUN");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Yan odamda kalan kad??n m??yd???" +
                            "\n+Evet.\n-Tan??yorum.");
                    q21.setText("Kurbanla ne kadar konu??tunuz");
                    q22.setText("Kurban??n ruh hali nas??l g??r??n??yordu");
                    q23.setText("Ba??ka B??R ODA SAK??N??YLE KURBAN HAKKINDA KONU??MU?? MUYDUN");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q21.setVisibility(View.VISIBLE);
                    q22.setVisibility(View.VISIBLE);
                    q23.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Hay??r, tan??m??yorum.");
                }
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlik??isi")){
                    textViewR.setText("+Olay oldu??u an neredeydin ve ne yap??yordun?\n-" +
                            "??ki alt kattayd??m. Olay olan kata da ben bakard??m " +
                            "normalde ama oradan ayr??lal?? 1 saat oluyordu");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    textViewR.setText("+Olay oldu??u an neredeydin ve ne yap??yordun?\n-G??venlik" +
                            " odas??nda telefonla oynuyordum. Kameralara olay olmad??k??a bakmam.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Olay oldu??u an neredeydin ve ne yap??yordun?\n-A????k b??fede" +
                            " ne varsa yiyordum. O g??n normalden biraz ge?? kalkm????t??m.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Olay oldu??u an neredeydin ve ne yap??yordun?\n-Odamdayd??m," +
                            " uyuyordum. ??????l?????? duyunca uyand??m.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Olay oldu??u an neredeydin ve ne yap??yordun?\n-Restoranta" +
                            " gidiyordum yakla????k on dakika ??ncesinde.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Olay oldu??u an neredeydin ve ne yap??yordun?\n-Odamda " +
                            "uzan??yordum. Bug??n Aspendosa gitme plan??m vard??.");
                    q1.setVisibility(View.GONE);
                    q2.setVisibility(View.GONE);
                    q3.setVisibility(View.GONE);
                    q31.setVisibility(View.VISIBLE);
                    q32.setVisibility(View.VISIBLE);
                    q33.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Olay oldu??u an neredeydin ve ne yap??yordun?\n-Uyuyordum " +
                            "??imdi sen kap??y?? t??klay??nca uyand??m.");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Olay oldu??u an neredeydin ve ne yap??yordun?\n-Otelin spor" +
                            " salonunda spor yap??yordum.");
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
                if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    textViewR.setText("+305. oda kameras?? sabah 7:30 saatlerinde uzun boylu " +
                            "bir adam elinde bir spor ??antayla koridordan ge??iyor. Saat 11 de " +
                            "uzun ince birisi kameran??n ??n??nden ge??iyor ama y??z?? se??ilemiyor.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Kurbanla ne kadar ne konu??tunuz?\n-Yemekte havadan sudan, " +
                            "nerelisin, ne i?? yapars??n diye konu??tuk");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Kurbanla ne kadar ne konu??tunuz?\n-??ok konu??tuk." +
                            " S??k s??k konu??urduk.");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Kurbanla ne kadar ne konu??tunuz?\n-Bir ka?? kere g??r??lt?? " +
                            "yapt?????? i??in konu??tum kendisiyle.");
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Kurbanla ne kadar ne konu??tunuz?\n-Az konu??tuk. Ayak??st??" +
                            " kap?? ??n??nde muhabbet etmi??tik.");
                }
            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    textViewR.setText("+308. odadan sabah 9:30 gibi ????k??p 10:45 gibi odaya geri" +
                            " giriyor oda sakini. Olay " +
                            "an?? bu kameran??n k??r noktas??nda ger??ekle??iyor gibi.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Kurban??n ruh hali nas??l g??r??n??yordu?\n-Mutsuz gibiydi." +
                            " Sordu??umda \"Bo??ver senin de keyfin ka??mas??n\" dedi.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Kurban??n ruh hali nas??l g??r??n??yordu?\n-Normaldi bence");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Kurban??n ruh hali nas??l g??r??n??yordu?\n-Uyarmaya gitti??imde" +
                            " normal geldi bana.");
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Kurban??n ruh hali nas??l g??r??n??yordu?\n-307 deki adam beni" +
                            " rahats??z ediyor ??izofreni fln olabilir hakk??mda alakas??z ??eyler" +
                            " s??yl??yor dedi.");
                }
            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    textViewR.setText("+310. odan??n ??n??ndeki kameraya g??re katil saat 11 de " +
                            "ka??arak uzakla????yor. Katilin y??z??" +
                            " hi?? g??z??km??yor ama uzun boylu ve erkek oldu??u belli.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Ba??ka bir oda sakiniyle kurban hakk??nda konu??tun mu?\n-308." +
                            " odadakiyle koridorda ayak??st?? konu??tuk kurban??n yapt?????? g??r??lt?? hakk??nda.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Ba??ka bir oda sakiniyle kurban hakk??nda konu??tun mu?\n-308." +
                            " odadaki arkada????mla konu??tum. ??l?? hakk??nda k??t?? d??????n??yordu.");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Ba??ka bir oda sakiniyle kurban hakk??nda konu??tun mu?\n-306," +
                            "307 ve 310. oda sakinleriyle konu??tum. Bu arada 307 deki adam??n " +
                            "kad??n hakk??nda bir dedi??i bir dedi??ini tutmuyordu. S??k??nt??l?? bir tip.");
                }
                else if (textViewM.getText().toString().equals("310. oda sakini")){
                    textViewR.setText("+Ba??ka bir oda sakiniyle kurban hakk??nda konu??tun mu?\n-308" +
                            " deki gen?? sesten rahats??z olup olmad??????m?? sormu??tu ??len kad??n hakk??nda");
                }
            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlik??isi")){
                    textViewR.setText("+??????l??ktan ??nce hi?? ses duydun mu?\n-Senin duydu??undan" +
                            " daha az??n?? duymu??umdur.");
                }
                else if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    textViewR.setText("+??????l??ktan ??nce hi?? ses duydun mu?\n-Hocam buradan nas??l ses" +
                            " duyay??m.");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+??????l??ktan ??nce hi?? ses duydun mu?\n-Sabah 10 gibi" +
                            " temizlik??inin sesine uyanm????t??m. Cinayetle alakal?? bir ses duymad??m.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+??????l??ktan ??nce hi?? ses duydun mu?\n-R??yamda bir ??ey " +
                            "duymu??tum ama i??ine yaramaz.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+??????l??ktan ??nce hi?? ses duydun mu?\n-Hay??r duymad??m.");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+??????l??ktan ??nce hi?? ses duydun mu?\n-Hemen ??ncesinde " +
                            "??izofren misin adam seni tan??m??yorum bile diye konu??tu. Yard??m istese" +
                            " ????kard??m yard??ma.");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+??????l??ktan ??nce hi?? ses duydun mu?\n-Ben ??????l??k duymad??m.");
                }
            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlik??isi")){
                    textViewR.setText("+Sen koridora ????kt??????nda ka??an birisini g??rd??n m???\n-" +
                            "Ben koridora ????kt??????mda sen ??oktan gelmi??tin.");
                }
                else if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    textViewR.setText("+Sen koridora ????kt??????nda ka??an birisini g??rd??n m???\n-Olay" +
                            " yerine hala gitmedim ondan dolay?? bu soruyu ba??kas??na sor derim.");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Sen koridora ????kt??????nda ka??an birisini g??rd??n m???\n-Hay??r." +
                            " Sabah 10 da kimse ko??muyordu.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Sen koridora ????kt??????nda ka??an birisini g??rd??n m???\n-Ben" +
                            " ????kt??????mda koridorun sonunda bir karart?? " +
                            "g??rd??m ba??ka bir oda sakiniyle kad??n?? kurtarmaya ??al????t??k.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Sen koridora ????kt??????nda ka??an birisini g??rd??n m???\n-Hay??r " +
                            "ama olay s??ras??nda orada olsam kesinlikle yakalar ve g??n??n?? g??sterirdim");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Sen koridora ????kt??????nda ka??an birisini g??rd??n m???\n-Evet. " +
                            "Atletik birisiydi ama h??zl??ca kayboldu kim oldu??undan emin de??ilim.");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Sen koridora ????kt??????nda ka??an birisini g??rd??n m???\n-" +
                            "Koridora 7 bu??ukta ????kt??m ben. Biri ko??sa otelden at??l??rd?? herhalde.");
                }
            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Otel temizlik??isi")){
                    textViewR.setText("+Peki sen kimsin ve kendini tan??tabilir misin?\n-Ya??l??," +
                            " emeklili??e g??n sayan bir kad??n??m ben.");
                }
                else if (textViewM.getText().toString().equals("Otel g??venli??i")){
                    textViewR.setText("+Peki sen kimsin ve kendini tan??tabilir misin?\n-Tembel," +
                            " ??i??man bir g??venli??im. Kameralara bakar param?? al??r??m.");
                }
                else if (textViewM.getText().toString().equals("305. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tan??tabilir misin?\n-G??rebilece??in" +
                            " ??zere ba????rt??l?? bir kad??n??m. Memurum, 9-5 ??al??????r??m, kimseyi ??ld??rmem.");
                }
                else if (textViewM.getText().toString().equals("306. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tan??tabilir misin?\n-Ad??m Arif," +
                            " 34 ya????nday??m, 7 nesildir ??stanbulluyum, in??aat i??im var.");
                }
                else if (textViewM.getText().toString().equals("307. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tan??tabilir misin?\n- 29 " +
                            "ya????nday??m, i??sizim k??sa mesafede ??ok h??zl??y??m.");
                }
                else if (textViewM.getText().toString().equals("308. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tan??tabilir misin?\n-Diyet " +
                            "yapmadan ??nce kendime k??yak yapmak i??in buraya gelmi?? ??i??man" +
                            " bir adam??m. G??r??lt??den nefret ederim.");
                }
                else if (textViewM.getText().toString().equals("311. oda sakini")){
                    textViewR.setText("+Peki sen kimsin ve kendini tan??tabilir misin?\n-??kinci ligde" +
                            " orta saha oyuncusuyum. Tatil i??in buraya geldim.");
                }
            }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewR.setText("+Bana kamera kay??tlar??n?? ve o kattaki sakinlerin isimlerini" +
                        " verebilir" +
                        " misin?\n-Tamam g??venlikle bak da kameralarda ??ld??ren net g??z??km??yor.");
                if (!PreferenceManager.getDefaultSharedPreferences
                        (getApplicationContext()).getBoolean("Ant1Places",false)){
                    Toast.makeText(AntEpOneQuestioning.this,"Yeni mekanlar ke??fettin"
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
                    Toast.makeText(AntEpOneQuestioning.this,"Yeni ????pheliler ke??fettin"
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
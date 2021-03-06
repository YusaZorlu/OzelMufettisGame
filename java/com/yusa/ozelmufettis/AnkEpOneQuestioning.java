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

public class AnkEpOneQuestioning extends AppCompatActivity {
    TextView textViewR;
    TextView textViewM;
    Button s1;
    Button s2;
    Button s3;
    Button s4;
    Button s5;
    Button s6;
    Button q1;
    Button q2;
    Button q3;
    Button q21;
    Button q22;
    Button q23;
    Button q221;
    Button q222;
    Button q223;
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
        setContentView(R.layout.activity_ank_ep_one_questioning);
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
        textViewM = findViewById(R.id.textView28);
        textViewR = findViewById(R.id.textView26);
        s1 = findViewById(R.id.button92);
        s2 = findViewById(R.id.button93);
        s3 = findViewById(R.id.button94);
        s4 = findViewById(R.id.button95);
        s5 = findViewById(R.id.button96);
        s6 = findViewById(R.id.button97);

        q1 = findViewById(R.id.akE1Q1);
        q2 = findViewById(R.id.akE1Q2);
        q3 = findViewById(R.id.akE1Q3);
        q21 = findViewById(R.id.akE1Q21);
        q22 = findViewById(R.id.akE1Q22);
        q23 = findViewById(R.id.akE1Q23);
        q221 = findViewById(R.id.akE1Q221);
        q222 = findViewById(R.id.akE1Q222);
        q223 = findViewById(R.id.akE1Q223);
        q31 = findViewById(R.id.akE1Q31);
        q32 = findViewById(R.id.akE1Q32);
        q33 = findViewById(R.id.akE1Q33);


        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Uzman di????i");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Yeni di????i");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Erkek asistan");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kad??n asistan");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Di??er hasta");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Motorlu kurye");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q221.setVisibility(View.GONE);
                q222.setVisibility(View.GONE);
                q223.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        if (!PreferenceManager.getDefaultSharedPreferences
                (getApplicationContext()).getBoolean("AnkSuspect6",false)){
            s6.setVisibility(View.GONE);
        }
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+????phelendi??in birisi var m???\n-????phelendi??im birisi yok ancak" +
                            " kimin ??ld??rd??????n?? merak ediyorum.");
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+????phelendi??in birisi var m???\n-Asistandan ????pheleniyorum." +
                            " Gen?? olan asistandan. Sebebi de sevgilisinin eski sevgilisiymi??" +
                            "kurban. Tabi bunu di??er asistandan duydum.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+????phelendi??in birisi var m???\n-Kuryeden ????pheleniyorum ????nk??" +
                            " o geldikten k??sa s??re sonra ??ld??.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("AnkSuspect6",false)){
                        Toast.makeText(AnkEpOneQuestioning.this,"Yeni ????pheli ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("AnkSuspect6",true).apply();
                    s6.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+????phelendi??in birisi var m???\n-Di??er asistandan " +
                            "????pheleniyorum ????nk?? ??l??n??n eski k??z arkada????yla sevgiliymi??.");
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+????phelendi??in birisi var m???\n-Bilmiyorum ama di????ide bir " +
                            "s??r?? kamera var ve bu kameralar??n ??al????mad??????n?? " +
                            "sadece personelden birileri biliyordur.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+????phelendi??in birisi var m???\n-Bilmiyorum ????nk?? sipari??leri" +
                            " verip ????kt??m ben.");
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

                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Kurban bulundu??u zaman ne yap??yordun?\n-Di??er hastay?? oper" +
                            "asyona haz??rl??yordum. Anesteziyi haz??rlam????t??m.");
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+Kurban bulundu??u zaman ne yap??yordun?\n-Yemek yiyordum." +
                            " Saat ????len 1 civarlar??yd??.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Kurban bulundu??u zaman ne yap??yordun?\n-Doktorlar??n " +
                            "muayneleri i??in malzemeleri haz??rl??yordum.");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Kurban bulundu??u zaman ne yap??yordun?\n-Sigara i??meye " +
                            "balkona ????km????t??m. Balkon bekleme odas??nda bu arada.");
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+Kurban bulundu??u zaman ne yap??yordun?\n-Di????inin yan??ndayd??m" +
                            "dolgu i??in haz??rlan??rken ??ok s??k????t??m. Tuvalete gidince cesedi g??rd??m.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Kurban bulundu??u zaman ne yap??yordun?\n-Motorumla" +
                            " restoranta geri d??n??yordum b??y??k ihtimalle.");
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

                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Bu muaynehanenin sahibiyim." +
                            " Buray?? a??al?? 9 y??l di?? hekimli??ine ba??layal?? 11 y??l oluyor.");
                    q31.setText("Di??er hekimi sor");
                    q32.setText("Asistanlar?? sor");
                    q33.setText("Olay an??na dair kan??t sor");
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Ge??en sene mezun oldum. " +
                            "Yeni bir di?? hekimi oldu??umdan isim yapmak i??in burada ??al??????yorum.");
                    q31.setText("Maa????n iyi midir");
                    q32.setText("Asistanlar hakk??nda d??????ncen");
                    q33.setText("O saat i??inde ses duydun mu");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-21 ya????nday??m ??niversite " +
                            "okumak yerine burada ??al????maya karar verdim. 6 ayd??r ??al??????yorum.");
                    q31.setText("Hekimler hakk??nda ne d??????n??yorsun");
                    q32.setText("Di??er asistan hakk??nda ne d??????n??yorsun");
                    q33.setText("Dinlenme odas??nda di??er hastay?? g??rd??n m??");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-34 ya????nday??m, polisiye" +
                            " dizi severim. Onun d??????nda 9 y??ld??r yani muaynehane " +
                            "a????ld??????ndan beri burada ??al??????yorum.");
                    q31.setText("Hekimler hakk??nda ne d??????n??yorsun");
                    q32.setText("Di??er asistan hakk??nda ne d??????n??yorsun");
                    q33.setText("Hangi odadan tuveleti duymak en zor");
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-Antalya'da otel sahibiyim." +
                            " Beni bu sa??ma sapan cinayette ????pheli olmaktan kurtar??rsan sana en kra" +
                            "l??ndan bir tatil ayarlar??m.");
                    q31.setText("Otel g??zel mi");
                    q32.setText("Hi?? ??????l??k ya da ses duymu?? muydun muayne zaman??");
                    q33.setText("Hekimler hakk??nda ne d??????n??yorsun");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Kendini bana tan??tabilir misin?\n-19 ya????nday??m, ??niversitede" +
                            " okurken ek i?? olarak kuryelik yap??yorum.");
                    q31.setText("Hangi restorant??n kuryesisin");
                    q32.setText("Buraya s??k gelir misin");
                    q33.setText("Saat ka??ta girdin ve kurban ya????yor muydu");
                }
            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Tek ba????na m??yd??n o s??rada?\n-Di??er hasta yan??mdayd?? ama" +
                            " asistanlar?? daha ??a????rmam????t??m");
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+Tek ba????na m??yd??n o s??rada?\n-Asistan han??m da" +
                            " yeme??ini yiyordu ama benden ??nce ????kt?? yemekten.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Tek ba????na m??yd??n o s??rada?\n-Evet tek ba????mayd??m. Di??er as" +
                            "istan yan??mda de??ildi.");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Tek ba????na m??yd??n o s??rada?\n-Balkonda tek ba????mayd??m." +
                            " Zaten k??????k bir balkon.");
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+Tek ba????na m??yd??n o s??rada?\n-Dedi??im gibi hekimin yan??ndayd??m" +
                            " ama asistan?? gelmemi??ti daha");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Tek ba????na m??yd??n o s??rada?\n-Evet tek ba????mayd??m.");
                }
            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Normalde ben muayne ederdim, uzun " +
                            "s??reli m????terim diyebilirim.");
                    q223.setText("Randevuyu hanginizden alm????t??");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Pek tan??m??yorum. ??lk defa bana " +
                            "muayne olmaya gelmi??ti.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Biraz tan??yorum, ??evreden diyelim.");
                    q223.setText("Detay verebilir misin");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Teyzemin ??ocu??u. S??k s??k g??r????mez" +
                            "dik ama buray?? ben tavsiye etmi??tim.");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q223.setText("Akraban nas??l birisiydi");
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Hay??r ama tuvalete gitti??imde cesedi " +
                            "bulan benim.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Kurban?? tan??yor musun?\n-Kim oldu??una dair en ufak " +
                            "bir fikrim yok.");
                }
            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Peki kurban bulunmadan bir ka?? dakika ??nce ne " +
                            "yap??yordun?\n-Kahve i??tiydim hastam haz??r olana kadar.");
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+Peki kurban bulunmadan bir ka?? dakika ??nce ne " +
                            "yap??yordun?\n-Motor kuryeden yeme??imi alm????t??m 10 dakika ??nce.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Peki kurban bulunmadan bir ka?? dakika ??nce ne " +
                            "yap??yordun?\n-Bekleme odas??nda tak??l??yordum 5 dakika ??ncesine kadar.");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Peki kurban bulunmadan bir ka?? dakika ??nce ne " +
                            "yap??yordun?\n-Dinlenme odas??nda ald??????m yeme??i yiyordum.");
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+Peki kurban bulunmadan bir ka?? dakika ??nce ne" +
                            " yap??yordun?\n-Bekleme odas??ndayd??m. 12:50 gibi girdim odaya zaten. " +
                            "Kurban da bir ka?? dakika sonra tuvalete gitti ama gelmedi.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Peki kurban bulunmadan bir ka?? dakika ??nce ne " +
                            "yap??yordun?\n-Sipari??leri teslim ettim i??te.");
                }
            }
        });
        q221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Aran??zda s??k??nt?? var m??yd???\n-Hay??r yoktu. Olsa bile " +
                            "ortal?????? yak??p y??kmad?????? s??rece m????teri m????teridir.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Aran??zda s??k??nt?? var m??yd???\n-Birazc??k vard?? ama ??u" +
                            " an anlatamayaca????m.");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Aran??zda s??k??nt?? var m??yd???\n-Aram??zda akrabal??k ili??kisi" +
                            " d??????nda iyi ya da k??t?? bir ??ey yoktu.");
                }
            }
        });
        q222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Peki kurban??n kavgal?? ya da problemli oldu??u birisi " +
                            "var m???\n-Bilmiyorum ama geldi??i zaman mutlu de??il gibiydi.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Peki kurban??n kavgal?? ya da problemli oldu??u birisi " +
                            "var m???\n-Var bildi??im birileri. Kendisi iyi biri de??ildi zaten");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Peki kurban??n kavgal?? ya da problemli oldu??u birisi " +
                            "var m???\n-6 ay ??nce yeni asistan i??e al??n??nca, ala ala bu sala???? m??" +
                            " ald??n??z demi??ti bana.");
                }
            }
        });
        q223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Randevuyu hangi hekimden alm????t???\n- Di??er di?? hekimi a" +
                            "rkada??tan alm????t?? ben yo??un oldu??um ve acelesi oldu??u i??in.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Detay verebilir misin?\n- Arkada?? ortam??m??z yak??n yani. Ama" +
                            " birbirimizle samimi de??iliz.");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Akraban oldu??una g??re az ??ok bilirsin. Kurban nas??l biriydi" +
                            "?\n-??yi birisiydi genel olarak ama biraz egolu ve baz?? tak??nt??lar??" +
                            " vard??.");
                }
            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Di??er hekim nas??l birisi?\n-Gen??, h??rsl?? bir arkada??.");
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+Maa????n iyi midir?\n-??ok iyi de??il ancak ortalaman??n ??zerinde.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Hekimler hakk??nda ne d??????n??yorsun?\n-??yi insanlar, severim.");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Di?? hekimleri hakk??nda ne d??????n??yorsun?\n-????lerini iyi " +
                            "yap??yorlar, maa????m?? da geciktirmiyorlar. Bence yeterince iyi insanlar.");
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+Otel g??zel mi?\n- Belek'te 5 y??ld??zl?? bir otel. ??ok g??zel.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Hangi restorant??n kuryesisin?\n- Karde??ler Kebap House diye" +
                            " bir yer.");
                }
            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Asistanlar hakk??nda ne diyebilirsin?\n- ????te d??zg??nler ama" +
                            " i??lerini bilemem.");
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+Asistanlar hakk??nda ne diyebilirsin?\n-Bana ters davran??" +
                            "??lar?? olmad?? hi??.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Di??er asistan hakk??nda ne d??????n??yorsun?\n- De??i??ik bir kad??n" +
                            ", pek konu??mad??k.");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Di??er asistan hakk??ndaki d??????ncelerin nedir?\n- Biraz agresif" +
                            " bir gen?? ama olay??n?? g??rmedim.");
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+Hi?? ??????l??k ya da ses duydun mu?\n- Bir ka?? t??k??rt?? duymu??tum" +
                            "1 civar?? ama emin de??ilim");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Buraya s??k s??k gelir misin?\n-Haftada 2, 3 g??n gelirim.");
                }
            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman di????i")){
                    textViewR.setText("+Peki olay an??na dair bir kan??t var m?? kameralar gibi?\n-" +
                            "Kameralara bakt??m da kay??t alm??yorlarm????, bozukmu??.");
                }
                else if (textViewM.getText().toString().equals("Yeni di????i")){
                    textViewR.setText("+O saat i??erisinde anormal bir ses duydun mu?\n-Kulakl??k " +
                            "tak??yordum, duymad??m.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Dinlenme odas??nda di??er hastay?? g??rd??n m???\n- Emin de??ilim.");
                }
                else if (textViewM.getText().toString().equals("Kad??n asistan")){
                    textViewR.setText("+Hangi odadan tuvaleti duymak en zor?\n- En uzak oda bekleme" +
                            " odas??.");
                }
                else if (textViewM.getText().toString().equals("Di??er hasta")){
                    textViewR.setText("+Di?? hekimleri hakk??nda ne d??????n??yorsunuz?\n- T??rkiyedeki" +
                            " en iyi di?? hekimlerinden birisi buran??n sahibi.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Saat ka??ta girdin ve girdi??inde kurban ya????yor muydu?\n-" +
                            "12:55 gibi girdim ve galiba ya????yordu.");
                }
            }
        });



    }
    public void toBack(View view){
        Intent intent = new Intent(getApplicationContext(), AnkEpOne.class);
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
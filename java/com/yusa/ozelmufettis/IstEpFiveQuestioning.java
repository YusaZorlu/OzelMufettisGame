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

public class IstEpFiveQuestioning extends AppCompatActivity {
    TextView textViewR;
    TextView textViewM;
    Button q1;
    Button q2;
    Button q3;
    Button q11;
    Button q12;
    Button q13;
    Button q21;
    Button q22;
    Button q23;
    Button q31;
    Button q32;
    Button q33;
    Button s1;
    Button s2;
    Button s3;
    Button s4;
    Button s5;
    Button s6;
    Button s7;

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
        setContentView(R.layout.activity_ist_ep_five_questioning);
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
        textViewR = findViewById(R.id.textView19);
        textViewM = findViewById(R.id.textView20);

        s1 = findViewById(R.id.is5s1);
        s2 = findViewById(R.id.is5s2);
        s3 = findViewById(R.id.is5s3);
        s4 = findViewById(R.id.is5s4);
        s5 = findViewById(R.id.is5s5);
        s6 = findViewById(R.id.is5s6);
        s7 = findViewById(R.id.is5s7);

        q1 = findViewById(R.id.isE5Q1);
        q2 = findViewById(R.id.isE5Q2);
        q3 = findViewById(R.id.isE5Q3);
        q11 = findViewById(R.id.isE5Q11);
        q12 = findViewById(R.id.isE5Q12);
        q13 = findViewById(R.id.isE5Q13);
        q21 = findViewById(R.id.isE5Q21);
        q22 = findViewById(R.id.isE5Q22);
        q23 = findViewById(R.id.isE5Q23);
        q31 = findViewById(R.id.isE5Q31);
        q32 = findViewById(R.id.isE5Q32);
        q33 = findViewById(R.id.isE5Q33);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kayb??n kar??s??");
                textViewR.setText("Merhabalar size baz?? sorular soraca????m");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);

            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kayb??n k??z karde??i");
                textViewR.setText("Merhabalar size bir ka?? sorular soraca????m");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);

            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kayb??n erkek karde??i");
                textViewR.setText("Merhabalar size karde??inizin kayb??yla alakal?? sorular soraca????m");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);

            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kayb??n i?? arkada????");
                textViewR.setText("??yi g??nler size baz?? sorular soraca????m");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kayb??n yan kom??usu");
                textViewR.setText("Merhabalar size sormam gereken sorular var");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kayb??n bor??. ol. arkada????");
                textViewR.setText("Merhabalar size baz?? sorular soraca????m");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewM.setText("Kayb??n askerlik arkada????");
                textViewR.setText("Merhabalar size bir ka?? sorular sormam gerekiyor");
                q1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q3.setVisibility(View.VISIBLE);
                q11.setVisibility(View.GONE);
                q12.setVisibility(View.GONE);
                q13.setVisibility(View.GONE);
                q21.setVisibility(View.GONE);
                q22.setVisibility(View.GONE);
                q23.setVisibility(View.GONE);
                q31.setVisibility(View.GONE);
                q32.setVisibility(View.GONE);
                q33.setVisibility(View.GONE);
            }
        });

        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q1.setVisibility(View.GONE);
                q2.setVisibility(View.GONE);
                q3.setVisibility(View.GONE);
                q11.setVisibility(View.VISIBLE);
                q12.setVisibility(View.VISIBLE);
                q13.setVisibility(View.VISIBLE);


                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    q12.setText("Karde??leriyle problemi var m??yd??");
                    q13.setText("??al????t?????? yer nas??l bir yerdi");
                    textViewR.setText("+Kayboldu??u g??n neredeydin?\n-O sabah bana i??e gitmeden" +
                            " ??nce karde??lerimle halletmem gereken i?? var dedi. O i??e gittikten sonra" +
                            " ben de i??e gittim, ak??ama kadar i??teydim.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Kayboldu??u g??n neredeydin?\n-Sabahtan karde??lerimle tarlay??" +
                            " b??l????t??k. Sonra kaybolan karde??im ben i??e gidiyorum dedi. Di??er " +
                            "karde??imle ben de kafeye gittik sonra da da????ld??k.");
                    q12.setText("Di??er karde??in kaybolan??n arkas??ndan konu??m???? muydu");
                    q13.setText("Kay??pla en son ne zaman konu??tun");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Kayboldu??u g??n neredeydin?\n-Bilader ve bac??mla sabah" +
                            " miras i??ini hallettik .Bilader saat 11 gibi" +
                            " gidince bac??mla kafeye oturduk. ????leden " +
                            "sonra ben market al????veri??ine gittim, ak??am da han??mla evdeydik.");
                    q12.setText("O g??n kayboldu??una emin misin");
                    q13.setText("Karde??in intihar etmi?? olabilir mi");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Kayboldu??u g??n neredeydin?\n-Emlak ofisimizdeydim. ??kindi " +
                            "saatlerinde i??ten ????kt??m arabay?? y??katmaya gittim." +
                            " Ak??am da eve gidip yatt??m");
                    q12.setText("Emlak ofisi karl?? m??yd??");
                    q13.setText("Neden arabay?? y??katt??n");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Kayboldu??u g??n neredeydin?\n-Sabah i??e gittim, ????len araba" +
                            " satmaya bulu??maya diye ????kt??m ama satamad??m. Ordan eve" +
                            " ge??tim ak??am ailemle gezmeye ????kt??k.");
                    q12.setText("Kay??pla o g??n g??r????t??n m??");
                    q13.setText("Evle i?? yeri ne kadar uzak");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Kayboldu??u g??n neredeydin?\n-T??m g??n k??ydeydim." +
                            " Tarla bi??tim, meyve toplad??m. Ak??am 8 de yola ????kt??m");
                    q12.setText("Neden k??yde ya??am??yorsun");
                    q13.setText("??stanbulda olmad??????n?? kan??tlayabilir misin");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Kayboldu??u g??n neredeydin?\n-O aralar i?? arad??????mdan ????len" +
                            " 1 e kadar evdeydim. Sonra pazara ????kt??m pazardan sonra yine evdeydim.");
                    q12.setText("Pazarda tan??d??kla kar????la??t??n m??");
                    q13.setText("Kay??pla en son ne zaman konu??tun");
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

                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+O zamandan bu zamana ne de??i??ti?\n-??lk ba??ta karde??leriyle" +
                            " aram??z a????ld??.Bir ka?? y??l ge??tikten sonra askerlik arkada????yla" +
                            " samimiyetimiz artt??. ??imdi ni??anl??y??z.");
                    q21.setText("Karde??leriyle aran niye a????ld??");
                    q22.setText("Askerlik arkada????yla ne zaman tan????t??n");
                    q23.setText("Bor??lu oldu??u arkada???? nas??l davrand??");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+O zamandan bu zamana ne de??i??ti?\n-E??i ??nce bizi su??lad??," +
                            " sonra i?? arkada???? geldi nereye kayboldu diye bize sordu. Tarlan??n" +
                            " karde??imize d????en pay??n?? da bor??lu " +
                            "oldu??u borcunu isteyip duran arkada????na verdik.");
                    q21.setText("E??i, kaybolduktan sonra nas??l davrand??");
                    q22.setText("???? arkada???? kaybolduktan sonra nas??l davrand??");
                    q23.setText("Askerlik arkada???? hakk??nda ne d??????n??yorsun");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+O zamandan bu zamana ne de??i??ti?\n-Kar??s?? olacak kad??n beni" +
                            " su??lad??, ben de onu sildim. Biladerin  bor??lar?? da kapad??k. Onun d??????nda" +
                            "Kar??s??yla askerlik arkada???? sevgili olmu??lar.");
                    q21.setText("Kom??usu hakk??nda ne d??????n??yorsun");
                    q22.setText("Kay??pla aras?? en k??t?? olan");
                    q23.setText("Askerlik arkada????yla aras?? nas??ld??");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+O zamandan bu zamana ne de??i??ti?\n-Kar??s??, kocas??n??n haklar" +
                            "??ndan k??????k bir mebla kar????l?????? vazge??ti??ini s??yledi. Kay??p ortak gidi" +
                            "nce i??i b??y??tt??m. Bu sene de evlenece??im.");
                    q21.setText("Kar??s?? neden kocas??n?? beklemedi");
                    q22.setText("????i b??y??tmek i??in ne yapt??n");
                    q23.setText("Karde??leriyle ileti??imin oldu mu");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+O zamandan bu zamana ne de??i??ti?\n-??ocuklar??m b??y??d??, ben" +
                            " de ya??land??m. Bir de" +
                            " galiba kaybolan kom??unun kar??s?? ba??kas??yla berabermi??.");
                    q21.setText("Maddi durumun o zamanlar iyi miydi");
                    q22.setText("Kayb??n e??i kimi ne zaman bulmu??");
                    q23.setText("Kayb??n i?? arkada????n?? tan??yor musun");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+O zamandan bu zamana ne de??i??ti?\n-Arkada?? kayboldu i??te." +
                            " Onun d??????nda babam vefat etti. Kayb??n borcunu da karde??leri ??dedi.");
                    q21.setText("Ba????n sa??olsun");
                    q22.setText("Borcu ??demeyi kim teklif etti");
                    q23.setText("Kayb??n askerlik arkada????n?? tan??yor musun");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+O zamandan bu zamana ne de??i??ti?\n-???? buldum. Kaybolan" +
                            " arkada?? bir ka?? sene gelmeyince e??iyle samimi olduk sonra" +
                            " ni??anland??k i??te.Art??k gelse de ??lse de bo??anacaklar zaten.");
                    q21.setText("Nas??l bir i?? buldun");
                    q22.setText("Kayb??n e??iyle nerede ne zaman tan????t??n");
                    q23.setText("Karde??leriyle hi?? g??r????t??n m??");
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

                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+Seni su??layanlar hakk??nda ne cevap verebilirsin?\n-" +
                            "Kocam?? ??ld??recek birisi de??ilim bu bir. ??kincisi de kocam?? bulmak i??in" +
                            " karde??lerinden bile ??ok u??ra??t??m.");
                    q33.setText("Neden bo??anmad??n");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Seni su??layanlar hakk??nda ne cevap verebilirsin?\n-Tarla i??in" +
                            " ??ld??recek olsam mirastan ona kalan k??sm?? bor??land?????? arkada????na" +
                            " vermezdim. Hem de insan karde??ini ??ld??r??r m???");
                    q33.setText("Bor??lu oldu??u arkada???? hakk??nda d??????n??yorsun");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Seni su??layanlar hakk??nda ne cevap verebilirsin?\n-Ben " +
                            "dindar bir adam??m ??ld??rmemem i??in ilk sebep. ??kincisi de" +
                            " karde??imi ??ld??recek birisi asla olmad??m olamam. Ak??l var mant??k var.");
                    q33.setText("Elinde kan??t olabilecek bir ??eyler var m??");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Seni su??layanlar hakk??nda ne cevap verebilirsin?\n-" +
                            "Sa??ma sapan konu??uyorlar derim. Bir problemim olsa adam gibi s??ylerdim.");
                    q33.setText("Seninle en son yaz????t?????? saat");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Seni su??layanlar hakk??nda ne cevap verebilirsin?\n-Yahu" +
                            " tamam kaybolan arkada????n hayran?? de??ildim de sanki adamla" +
                            " kavgal??y??z, kan daval??y??z gibi ????phelenmi??ler.");
                    q33.setText("Kay??pla aras?? k??t?? olan var m??");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Seni su??layanlar hakk??nda ne cevap verebilirsin?\n-Adam" +
                            " ??ld??rmeyecek birisi oldu??umu s??yleyeyim. Ondan sonra da bana " +
                            "borcu olan adam?? niye ??ld??reyim" +
                            " di??er taraftan havale g??nderecek hali yok.");
                    q33.setText("Yan kom??usu hakk??nda ne d??????n??yorsun");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Seni su??layanlar hakk??nda ne cevap verebilirsin?\n-Su??lar??n??" +
                            " bana y??k??yorlar. Devremi niye ??ld??reyim deli miyim.");
                    q33.setText("Bana sunabilece??in bir kan??t var m??");
                }

            }
        });
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+O g??n tek ba????na kald??????n vakit oldu mu?\n-Evden i??e" +
                            " giderken ve i??ten eve gelirken tek ba????mayd??m.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+O g??n tek ba????na kald??????n vakit oldu mu?\n-Kafeden sonra" +
                            " annemin yan??na gittim. Annemin yan??nda kal??yordum zaten.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+O g??n tek ba????na kald??????n vakit oldu mu?\n-Evde tek " +
                            "ya????yorum yani evdeyken ??ahidim yok ama eve girdi??imi g??ren olmu??tur.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+O g??n tek ba????na kald??????n vakit oldu mu?\n-Ofiste tek" +
                            " ba????mayd??m ancak ????leden sonra birden sonra " +
                            "gelen giden m????teriler oldu.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+O g??n tek ba????na kald??????n vakit oldu mu?\n-Hep birisiyle " +
                            "beraberdim. Evde de i??te de arabay?? satmaya ??al??????rken de.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+O g??n tek ba????na kald??????n vakit oldu mu?\n-Gece 2 de" +
                            " ??stanbul'a d??nene kadar " +
                            "tek ba????mayd??m, han??mla ??ocuklar ??stanbulda evdeydi.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+O g??n tek ba????na kald??????n vakit oldu mu?\n-Evde tek ba????ma" +
                            "ya????yordum, pazara da tek ba????ma gittim.");
                }

            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+Kocan??n, karde??leriyle problemi var m??yd???\n-Normalde" +
                            " yoktu ama para herkesi bozabilir.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Kaybolan karde??in gidince di??er karde??in arkas??ndan k??t??" +
                            " konu??tu mu?\n-Hay??r, hatta iyi konu??tu ????nk?? iyi yeri ona b??rakt??yd??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+O g??n kayboldu??una eminsiniz de??il mi?\n-Evet ????nk?? ??nceki" +
                            " g??n kar??s??yla birlikteydi ve en son o g??n duyduk.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Emlak ofisiniz o zaman da karl?? m??yd???\n- Evet ancak " +
                            "??u anki kadar de??il.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+O g??n kay??pla hi?? g??r????t??n??z m???\n- Zannetmiyorum yani " +
                            "konu??tu??umu ya da arad??????m?? hat??rlam??yorum.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Neden k??yde de??il de ??stanbul'da ya????yorsun?\n-??ocuklar " +
                            "okusun diye. Bu devirde k??yde okunmaz.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Pazarla bir tan??d??kla kar????la??t??n m???\n-Hat??rlam??yorum ki" +
                            " 10 y??l ??ncesi.");
                }

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+??al????t?????? yer nas??l bir yer?\n-Emlak sat???? ofisi yani" +
                            " emlak????. ??ki ki??i ??al??????yorlard??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Kay??pla en son ne zaman konu??tun?\n- Dedi??im gibi miras" +
                            " i??ini hallederken olay g??n??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Karde??in o g??n ??ok k??t?? bir haber alsa intihar edebilecek " +
                            "birisi mi?\n-Hay??r de??il. Zaten o g??n gayet mutluydu.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Neden araba y??katmaya gittin?\n-Araba batt?????? i??in" +
                            " y??katt??m ba??ka niye olsun ki?");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Evle i?? aras?? ne kadar uzak?\n-Arabayla 15 " +
                            "dakika ya var ya yok.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+O g??n ??stanbulda olmad??????n?? kan??tlayabilir misin?\n-K??y " +
                            "kahvesine u??ram????t??m. Orada beni g??renler" +
                            " vard?? ama ??u an isim verecek kadar hat??rlam??yorum.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Kay??pla en son ne zaman konu??tun?\n-Kayboldu??u g??nlerde" +
                            " konu??mu??tum ancak ??ok hat??rlam??yorum.");
                }

            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+Senin aran kocan??n karde??leriyle neden a????ld???\n- ??lk ba??ta" +
                            " benim ????phelerim, daha sonra da kocam??n askerlik arkada????yla" +
                            " yakla??mamdan rahats??zl??k duydular.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+E??i kaybolduktan sonra karde??inizin kar??s?? nas??l davrand???\n-" +
                            "??nce bizi su??lad??. ??ok sonra gitti kocas??n??n asker arkada????yla " +
                            "sevgili oldu.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Peki kom??usundan ????phelenen birileri varm???? siz ne " +
                            "d??????n??yorsunuz?\n-Cahil bir adamd?? ama o ??ld??rse biladerin kar??s??" +
                            " bizi de??il onu su??lard?? herhalde.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Kar??s?? neden kocas??n??n d??nmesini beklemedi?\n- Onu kar??s??na " +
                            "sorun bence. Ben bilmiyorum");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Maddi durumun iyi miydi, ??u an iyi mi?\n-O zamanlar k??t??" +
                            " say??l??rd?? ama ??imdi ????k??r iyiyiz.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Ba????n sa??olsun?\n-Hepimizin sa??olsun.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Nas??l i?? buldun ve ??ok borcun var m??yd???\n-??ok borcum " +
                            "yoktu. Kasiyerli??e ba??lad??m.");
                }

            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+Askerlik arkada???? yani ??u anki ni??anl??nla ne zaman " +
                            "nerede tan????t??n?\n-Kocam tan????t??rm????t?? kaybolmadan iki ???? y??l ??nce.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Kayb??n i?? arkada????n??n davran????lar?? nas??l?\n- Garip bir adam" +
                            ". De??i??ik davran????lar?? vard??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Kay??p karde??inle aras?? en k??t?? olan kimdi?\n-Bor??lu " +
                            "oldu??u arkada???? vard?? oydu. Biraz paras??na d????k??n bir adamd??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+????i b??y??tmek i??in ne yapt??n peki?\n-Meslek s??rr?? o." +
                            " S??yleyemem.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Kayb??n e??i ne zaman kimi bulmu???\n-??l??n??n asker arkada???? " +
                            "m?? neymi??. 4-5 sene ??nce bulmu??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Borcu ??demeyi onlar m?? teklif etti sen mi istedin?\n-Ben" +
                            " bir ka?? kere telefonda s??yledim. " +
                            "Bor??lar??n varl??????n?? kan??tlay??nca  ??dedi karde??leri.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Kayb??n e??iyle nerede ve ne zaman tan????t??n?\n- 12 sene ??nce" +
                            " kaybolan arkada????m tan????t??rm????t?? ama ili??kimiz o " +
                            "kaybolduktan bir ka?? sene sonra ba??lad??.");
                }

            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+Kocan??n aras?? bor??lu oldu??u arkada????yla nas??ld???\n-??lk " +
                            "ba??ta borcundan m?? ka????yor diye beni darlad?? ancak sonradan olay?? an" +
                            "lad??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Askerlik arkada???? hakk??nda ne d??????n??yorsun?\n-Bence" +
                            " sa??ma sapan bir adam. Akli dengesinden bile ????phe duyuyorum.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Karde??inin, askerlik arkada????yla aras?? nas??ld???\n-??ok iyi" +
                            " de??il gibiydi ama k??t?? de de??ildi.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Karde??leriyle bir ileti??imin oldu mu?\n-Kayboldu??unu" +
                            " onlardan ????rendim. Onun d??????nda pek yok.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Kayb??n i?? arkada????n?? tan??yor musun?\n-Tek ba????na ??al????m??yor" +
                            " muymu??. ???? arkada???? oldu??unu bile bilmiyordum.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Askerlik arkada???? hakk??nda ne d??????n??yorsun?\n-??ok " +
                            "tan??m??yorum ama biraz sap??k adamm???? diye duydum.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Karde??leriyle hi?? g??r????t??n??z m???\n-Selam verdim bor??lu" +
                            " ????kt??m. Ondan beridir hay??r.");
                }

            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+Peki sen kimden ????pheleniyorsun ve neden?\n-Ben erkek ka" +
                            "rde??inden ????pheleniyorum ????nk?? halletmesi gere" +
                            "ken i??in miras i??i oldu??unu ????rendim.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Peki sen kimden ????pheleniyorsun ve neden?\n-Karde??imin i??" +
                            " arkada????ndan ????pheleniyorum" +
                            " ????nk?? i??e gidece??im dedi ve ortal??ktan yok oldu.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Peki sen kimden ????pheleniyorsun ve neden?\n-Valla ben " +
                            "askerlik arkada????ndan ????pheleniyorum" +
                            " ????nk?? karde??imin kar??s??yla ili??kileri varm????.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Peki sen kimden ????pheleniyorsun ve neden?\n-Kar???? kom??u" +
                            "sundan ????pheleniyorum ????nk?? ofise gelmeden ??nce kom??uyla i??im " +
                            "var demi??ti ve ofise gelmedi.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Peki sen kimden ????pheleniyorsun ve neden?\n-Kar??s??ndan." +
                            " ????nk?? ??ok uyumlu tipler de??illerdi ve" +
                            " askerlik arkada????yla ili??kisi mi neyi varm????.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Peki sen kimden ????pheleniyorsun ve neden?\n-Ben kar??s??ndan" +
                            " ????pheleniyorum. ????nk?? kad??n biraz parag??z" +
                            " gibiydi kocas??n??n borcunu ??demedi.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Peki sen kimden ????pheleniyorsun ve neden?\n-Erkek karde??i " +
                            "??ld??rmez de k??z karde??i manyak bir kad??nd?? o ??ld??rm???? olabilir.");
                }

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun ve" +
                            " niye?\n-Bor??lu oldu??u arkada???? parag??z ama ??ld??rm???? gibi davranmad?? hi??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun ve " +
                            "niye?\n-Karde??ime kefil olurum tabii ki.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun ve" +
                            " niye?\n-Karde??im d??????nda ba??ka kime kefil olay??m ki.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun" +
                            " ve niye?\n-Kimseye kefil olmam ama kar??s?? ??ld??rmemi??tir.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil" +
                            " olursun ve niye?\n-Kendime kefil olurum, kime olcam?");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil" +
                            " olursun ve niye?\n-Karde??lerinin ??ld??rmedi??ine inan??yorum ????nk?? " +
                            "parama ????kmediler.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun ve niye" +
                            "?\n-Ni??anl??m yani kar??s?? yapmam????t??r. ??yle bir insan de??il.");
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kayb??n kar??s??")){
                    textViewR.setText("+Neden bo??anmad??n kocandan kaybolunca?\n-????nk?? ??ld??????ne dair" +
                            " hala bir kan??t yok. Yak??nda bo??anaca????m ama.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n k??z karde??i")){
                    textViewR.setText("+Bor??lu oldu??u arkada???? hakk??nda ne d??????n??yorsun?\n-??ok " +
                            "bencil ve parag??z bir adam.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n erkek karde??i")){
                    textViewR.setText("+Elinde kan??t olabilecek bir ??eyler var m???\n-Sosyal medya" +
                            " hesaplar??ndan birini ??ifremi " +
                            "unuttumla ele ge??irdim size vereyim ??ifresini.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is5Place2",false)){
                        Toast.makeText(IstEpFiveQuestioning.this,"Yeni incelenecek" +
                                        " kan??t ke??fettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is5Place2",true).apply();
                }
                else if (textViewM.getText().toString().equals("Kayb??n i?? arkada????")){
                    textViewR.setText("+Seninle en son ne zaman yaz????t???\n- Saat 11 gibi.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n yan kom??usu")){
                    textViewR.setText("+Kay??pla aras?? en k??t?? olan?\n-Bilmiyorum o kadar.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n bor??. ol. arkada????")){
                    textViewR.setText("+Yan kom??usu hakk??nda ne d??????n??yorsun?\n-Kendisini " +
                            "tan??m??yorum ama ??ok sevse ya da nefret etse ismini anard??.");
                }
                else if (textViewM.getText().toString().equals("Kayb??n askerlik arkada????")){
                    textViewR.setText("+Bana sunabilece??in ipucu var m???\n-Yok. Olsa polislere" +
                            " verirdim 10 y??l ??nce.");
                }

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
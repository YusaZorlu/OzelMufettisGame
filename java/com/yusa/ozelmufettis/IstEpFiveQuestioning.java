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
                textViewM.setText("Kaybın karısı");
                textViewR.setText("Merhabalar size bazı sorular soracağım");
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
                textViewM.setText("Kaybın kız kardeşi");
                textViewR.setText("Merhabalar size bir kaç sorular soracağım");
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
                textViewM.setText("Kaybın erkek kardeşi");
                textViewR.setText("Merhabalar size kardeşinizin kaybıyla alakalı sorular soracağım");
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
                textViewM.setText("Kaybın iş arkadaşı");
                textViewR.setText("İyi günler size bazı sorular soracağım");
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
                textViewM.setText("Kaybın yan komşusu");
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
                textViewM.setText("Kaybın borç. ol. arkadaşı");
                textViewR.setText("Merhabalar size bazı sorular soracağım");
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
                textViewM.setText("Kaybın askerlik arkadaşı");
                textViewR.setText("Merhabalar size bir kaç sorular sormam gerekiyor");
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


                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    q12.setText("Kardeşleriyle problemi var mıydı");
                    q13.setText("Çalıştığı yer nasıl bir yerdi");
                    textViewR.setText("+Kaybolduğu gün neredeydin?\n-O sabah bana işe gitmeden" +
                            " önce kardeşlerimle halletmem gereken iş var dedi. O işe gittikten sonra" +
                            " ben de işe gittim, akşama kadar işteydim.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Kaybolduğu gün neredeydin?\n-Sabahtan kardeşlerimle tarlayı" +
                            " bölüştük. Sonra kaybolan kardeşim ben işe gidiyorum dedi. Diğer " +
                            "kardeşimle ben de kafeye gittik sonra da dağıldık.");
                    q12.setText("Diğer kardeşin kaybolanın arkasından konuşmış muydu");
                    q13.setText("Kayıpla en son ne zaman konuştun");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Kaybolduğu gün neredeydin?\n-Bilader ve bacımla sabah" +
                            " miras işini hallettik .Bilader saat 11 gibi" +
                            " gidince bacımla kafeye oturduk. Öğleden " +
                            "sonra ben market alışverişine gittim, akşam da hanımla evdeydik.");
                    q12.setText("O gün kaybolduğuna emin misin");
                    q13.setText("Kardeşin intihar etmiş olabilir mi");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Kaybolduğu gün neredeydin?\n-Emlak ofisimizdeydim. İkindi " +
                            "saatlerinde işten çıktım arabayı yıkatmaya gittim." +
                            " Akşam da eve gidip yattım");
                    q12.setText("Emlak ofisi karlı mıydı");
                    q13.setText("Neden arabayı yıkattın");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Kaybolduğu gün neredeydin?\n-Sabah işe gittim, öğlen araba" +
                            " satmaya buluşmaya diye çıktım ama satamadım. Ordan eve" +
                            " geçtim akşam ailemle gezmeye çıktık.");
                    q12.setText("Kayıpla o gün görüştün mü");
                    q13.setText("Evle iş yeri ne kadar uzak");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Kaybolduğu gün neredeydin?\n-Tüm gün köydeydim." +
                            " Tarla biçtim, meyve topladım. Akşam 8 de yola çıktım");
                    q12.setText("Neden köyde yaşamıyorsun");
                    q13.setText("İstanbulda olmadığını kanıtlayabilir misin");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Kaybolduğu gün neredeydin?\n-O aralar iş aradığımdan öğlen" +
                            " 1 e kadar evdeydim. Sonra pazara çıktım pazardan sonra yine evdeydim.");
                    q12.setText("Pazarda tanıdıkla karşılaştın mı");
                    q13.setText("Kayıpla en son ne zaman konuştun");
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

                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+O zamandan bu zamana ne değişti?\n-İlk başta kardeşleriyle" +
                            " aramız açıldı.Bir kaç yıl geçtikten sonra askerlik arkadaşıyla" +
                            " samimiyetimiz arttı. Şimdi nişanlıyız.");
                    q21.setText("Kardeşleriyle aran niye açıldı");
                    q22.setText("Askerlik arkadaşıyla ne zaman tanıştın");
                    q23.setText("Borçlu olduğu arkadaşı nasıl davrandı");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+O zamandan bu zamana ne değişti?\n-Eşi önce bizi suçladı," +
                            " sonra iş arkadaşı geldi nereye kayboldu diye bize sordu. Tarlanın" +
                            " kardeşimize düşen payını da borçlu " +
                            "olduğu borcunu isteyip duran arkadaşına verdik.");
                    q21.setText("Eşi, kaybolduktan sonra nasıl davrandı");
                    q22.setText("İş arkadaşı kaybolduktan sonra nasıl davrandı");
                    q23.setText("Askerlik arkadaşı hakkında ne düşünüyorsun");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+O zamandan bu zamana ne değişti?\n-Karısı olacak kadın beni" +
                            " suçladı, ben de onu sildim. Biladerin  borçları da kapadık. Onun dışında" +
                            "Karısıyla askerlik arkadaşı sevgili olmuşlar.");
                    q21.setText("Komşusu hakkında ne düşünüyorsun");
                    q22.setText("Kayıpla arası en kötü olan");
                    q23.setText("Askerlik arkadaşıyla arası nasıldı");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+O zamandan bu zamana ne değişti?\n-Karısı, kocasının haklar" +
                            "ından küçük bir mebla karşılığı vazgeçtiğini söyledi. Kayıp ortak gidi" +
                            "nce işi büyüttüm. Bu sene de evleneceğim.");
                    q21.setText("Karısı neden kocasını beklemedi");
                    q22.setText("İşi büyütmek için ne yaptın");
                    q23.setText("Kardeşleriyle iletişimin oldu mu");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+O zamandan bu zamana ne değişti?\n-Çocuklarım büyüdü, ben" +
                            " de yaşlandım. Bir de" +
                            " galiba kaybolan komşunun karısı başkasıyla berabermiş.");
                    q21.setText("Maddi durumun o zamanlar iyi miydi");
                    q22.setText("Kaybın eşi kimi ne zaman bulmuş");
                    q23.setText("Kaybın iş arkadaşını tanıyor musun");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+O zamandan bu zamana ne değişti?\n-Arkadaş kayboldu işte." +
                            " Onun dışında babam vefat etti. Kaybın borcunu da kardeşleri ödedi.");
                    q21.setText("Başın sağolsun");
                    q22.setText("Borcu ödemeyi kim teklif etti");
                    q23.setText("Kaybın askerlik arkadaşını tanıyor musun");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+O zamandan bu zamana ne değişti?\n-İş buldum. Kaybolan" +
                            " arkadaş bir kaç sene gelmeyince eşiyle samimi olduk sonra" +
                            " nişanlandık işte.Artık gelse de ölse de boşanacaklar zaten.");
                    q21.setText("Nasıl bir iş buldun");
                    q22.setText("Kaybın eşiyle nerede ne zaman tanıştın");
                    q23.setText("Kardeşleriyle hiç görüştün mü");
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

                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Seni suçlayanlar hakkında ne cevap verebilirsin?\n-" +
                            "Kocamı öldürecek birisi değilim bu bir. İkincisi de kocamı bulmak için" +
                            " kardeşlerinden bile çok uğraştım.");
                    q33.setText("Neden boşanmadın");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Seni suçlayanlar hakkında ne cevap verebilirsin?\n-Tarla için" +
                            " öldürecek olsam mirastan ona kalan kısmı borçlandığı arkadaşına" +
                            " vermezdim. Hem de insan kardeşini öldürür mü?");
                    q33.setText("Borçlu olduğu arkadaşı hakkında düşünüyorsun");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Seni suçlayanlar hakkında ne cevap verebilirsin?\n-Ben " +
                            "dindar bir adamım öldürmemem için ilk sebep. İkincisi de" +
                            " kardeşimi öldürecek birisi asla olmadım olamam. Akıl var mantık var.");
                    q33.setText("Elinde kanıt olabilecek bir şeyler var mı");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Seni suçlayanlar hakkında ne cevap verebilirsin?\n-" +
                            "Saçma sapan konuşuyorlar derim. Bir problemim olsa adam gibi söylerdim.");
                    q33.setText("Seninle en son yazıştığı saat");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Seni suçlayanlar hakkında ne cevap verebilirsin?\n-Yahu" +
                            " tamam kaybolan arkadaşın hayranı değildim de sanki adamla" +
                            " kavgalıyız, kan davalıyız gibi şüphelenmişler.");
                    q33.setText("Kayıpla arası kötü olan var mı");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Seni suçlayanlar hakkında ne cevap verebilirsin?\n-Adam" +
                            " öldürmeyecek birisi olduğumu söyleyeyim. Ondan sonra da bana " +
                            "borcu olan adamı niye öldüreyim" +
                            " diğer taraftan havale gönderecek hali yok.");
                    q33.setText("Yan komşusu hakkında ne düşünüyorsun");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Seni suçlayanlar hakkında ne cevap verebilirsin?\n-Suçlarını" +
                            " bana yıkıyorlar. Devremi niye öldüreyim deli miyim.");
                    q33.setText("Bana sunabileceğin bir kanıt var mı");
                }

            }
        });
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+O gün tek başına kaldığın vakit oldu mu?\n-Evden işe" +
                            " giderken ve işten eve gelirken tek başımaydım.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+O gün tek başına kaldığın vakit oldu mu?\n-Kafeden sonra" +
                            " annemin yanına gittim. Annemin yanında kalıyordum zaten.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+O gün tek başına kaldığın vakit oldu mu?\n-Evde tek " +
                            "yaşıyorum yani evdeyken şahidim yok ama eve girdiğimi gören olmuştur.");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+O gün tek başına kaldığın vakit oldu mu?\n-Ofiste tek" +
                            " başımaydım ancak öğleden sonra birden sonra " +
                            "gelen giden müşteriler oldu.");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+O gün tek başına kaldığın vakit oldu mu?\n-Hep birisiyle " +
                            "beraberdim. Evde de işte de arabayı satmaya çalışırken de.");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+O gün tek başına kaldığın vakit oldu mu?\n-Gece 2 de" +
                            " İstanbul'a dönene kadar " +
                            "tek başımaydım, hanımla çocuklar İstanbulda evdeydi.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+O gün tek başına kaldığın vakit oldu mu?\n-Evde tek başıma" +
                            "yaşıyordum, pazara da tek başıma gittim.");
                }

            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Kocanın, kardeşleriyle problemi var mıydı?\n-Normalde" +
                            " yoktu ama para herkesi bozabilir.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Kaybolan kardeşin gidince diğer kardeşin arkasından kötü" +
                            " konuştu mu?\n-Hayır, hatta iyi konuştu çünkü iyi yeri ona bıraktıydı.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+O gün kaybolduğuna eminsiniz değil mi?\n-Evet çünkü önceki" +
                            " gün karısıyla birlikteydi ve en son o gün duyduk.");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Emlak ofisiniz o zaman da karlı mıydı?\n- Evet ancak " +
                            "şu anki kadar değil.");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+O gün kayıpla hiç görüştünüz mü?\n- Zannetmiyorum yani " +
                            "konuştuğumu ya da aradığımı hatırlamıyorum.");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Neden köyde değil de İstanbul'da yaşıyorsun?\n-Çocuklar " +
                            "okusun diye. Bu devirde köyde okunmaz.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Pazarla bir tanıdıkla karşılaştın mı?\n-Hatırlamıyorum ki" +
                            " 10 yıl öncesi.");
                }

            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Çalıştığı yer nasıl bir yer?\n-Emlak satış ofisi yani" +
                            " emlakçı. İki kişi çalışıyorlardı.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Kayıpla en son ne zaman konuştun?\n- Dediğim gibi miras" +
                            " işini hallederken olay günü.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Kardeşin o gün çok kötü bir haber alsa intihar edebilecek " +
                            "birisi mi?\n-Hayır değil. Zaten o gün gayet mutluydu.");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Neden araba yıkatmaya gittin?\n-Araba battığı için" +
                            " yıkattım başka niye olsun ki?");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Evle iş arası ne kadar uzak?\n-Arabayla 15 " +
                            "dakika ya var ya yok.");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+O gün İstanbulda olmadığını kanıtlayabilir misin?\n-Köy " +
                            "kahvesine uğramıştım. Orada beni görenler" +
                            " vardı ama şu an isim verecek kadar hatırlamıyorum.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Kayıpla en son ne zaman konuştun?\n-Kaybolduğu günlerde" +
                            " konuşmuştum ancak çok hatırlamıyorum.");
                }

            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Senin aran kocanın kardeşleriyle neden açıldı?\n- İlk başta" +
                            " benim şüphelerim, daha sonra da kocamın askerlik arkadaşıyla" +
                            " yaklaşmamdan rahatsızlık duydular.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Eşi kaybolduktan sonra kardeşinizin karısı nasıl davrandı?\n-" +
                            "Önce bizi suçladı. Çok sonra gitti kocasının asker arkadaşıyla " +
                            "sevgili oldu.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Peki komşusundan şüphelenen birileri varmış siz ne " +
                            "düşünüyorsunuz?\n-Cahil bir adamdı ama o öldürse biladerin karısı" +
                            " bizi değil onu suçlardı herhalde.");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Karısı neden kocasının dönmesini beklemedi?\n- Onu karısına " +
                            "sorun bence. Ben bilmiyorum");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Maddi durumun iyi miydi, şu an iyi mi?\n-O zamanlar kötü" +
                            " sayılırdı ama şimdi şükür iyiyiz.");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Başın sağolsun?\n-Hepimizin sağolsun.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Nasıl iş buldun ve çok borcun var mıydı?\n-Çok borcum " +
                            "yoktu. Kasiyerliğe başladım.");
                }

            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Askerlik arkadaşı yani şu anki nişanlınla ne zaman " +
                            "nerede tanıştın?\n-Kocam tanıştırmıştı kaybolmadan iki üç yıl önce.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Kaybın iş arkadaşının davranışları nasıl?\n- Garip bir adam" +
                            ". Değişik davranışları vardı.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Kayıp kardeşinle arası en kötü olan kimdi?\n-Borçlu " +
                            "olduğu arkadaşı vardı oydu. Biraz parasına düşkün bir adamdı.");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+İşi büyütmek için ne yaptın peki?\n-Meslek sırrı o." +
                            " Söyleyemem.");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Kaybın eşi ne zaman kimi bulmuş?\n-Ölünün asker arkadaşı " +
                            "mı neymiş. 4-5 sene önce bulmuş.");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Borcu ödemeyi onlar mı teklif etti sen mi istedin?\n-Ben" +
                            " bir kaç kere telefonda söyledim. " +
                            "Borçların varlığını kanıtlayınca  ödedi kardeşleri.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Kaybın eşiyle nerede ve ne zaman tanıştın?\n- 12 sene önce" +
                            " kaybolan arkadaşım tanıştırmıştı ama ilişkimiz o " +
                            "kaybolduktan bir kaç sene sonra başladı.");
                }

            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Kocanın arası borçlu olduğu arkadaşıyla nasıldı?\n-İlk " +
                            "başta borcundan mı kaçıyor diye beni darladı ancak sonradan olayı an" +
                            "ladı.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Askerlik arkadaşı hakkında ne düşünüyorsun?\n-Bence" +
                            " saçma sapan bir adam. Akli dengesinden bile şüphe duyuyorum.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Kardeşinin, askerlik arkadaşıyla arası nasıldı?\n-Çok iyi" +
                            " değil gibiydi ama kötü de değildi.");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Kardeşleriyle bir iletişimin oldu mu?\n-Kaybolduğunu" +
                            " onlardan öğrendim. Onun dışında pek yok.");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Kaybın iş arkadaşını tanıyor musun?\n-Tek başına çalışmıyor" +
                            " muymuş. İş arkadaşı olduğunu bile bilmiyordum.");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Askerlik arkadaşı hakkında ne düşünüyorsun?\n-Çok " +
                            "tanımıyorum ama biraz sapık adammış diye duydum.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Kardeşleriyle hiç görüştünüz mü?\n-Selam verdim borçlu" +
                            " çıktım. Ondan beridir hayır.");
                }

            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Peki sen kimden şüpheleniyorsun ve neden?\n-Ben erkek ka" +
                            "rdeşinden şüpheleniyorum çünkü halletmesi gere" +
                            "ken işin miras işi olduğunu öğrendim.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Peki sen kimden şüpheleniyorsun ve neden?\n-Kardeşimin iş" +
                            " arkadaşından şüpheleniyorum" +
                            " çünkü işe gideceğim dedi ve ortalıktan yok oldu.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Peki sen kimden şüpheleniyorsun ve neden?\n-Valla ben " +
                            "askerlik arkadaşından şüpheleniyorum" +
                            " çünkü kardeşimin karısıyla ilişkileri varmış.");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Peki sen kimden şüpheleniyorsun ve neden?\n-Karşı komşu" +
                            "sundan şüpheleniyorum çünkü ofise gelmeden önce komşuyla işim " +
                            "var demişti ve ofise gelmedi.");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Peki sen kimden şüpheleniyorsun ve neden?\n-Karısından." +
                            " Çünkü çok uyumlu tipler değillerdi ve" +
                            " askerlik arkadaşıyla ilişkisi mi neyi varmış.");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Peki sen kimden şüpheleniyorsun ve neden?\n-Ben karısından" +
                            " şüpheleniyorum. Çünkü kadın biraz paragöz" +
                            " gibiydi kocasının borcunu ödemedi.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Peki sen kimden şüpheleniyorsun ve neden?\n-Erkek kardeşi " +
                            "öldürmez de kız kardeşi manyak bir kadındı o öldürmüş olabilir.");
                }

            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun ve" +
                            " niye?\n-Borçlu olduğu arkadaşı paragöz ama öldürmüş gibi davranmadı hiç.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun ve " +
                            "niye?\n-Kardeşime kefil olurum tabii ki.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun ve" +
                            " niye?\n-Kardeşim dışında başka kime kefil olayım ki.");
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun" +
                            " ve niye?\n-Kimseye kefil olmam ama karısı öldürmemiştir.");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil" +
                            " olursun ve niye?\n-Kendime kefil olurum, kime olcam?");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil" +
                            " olursun ve niye?\n-Kardeşlerinin öldürmediğine inanıyorum çünkü " +
                            "parama çökmediler.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Peki birisine kefil olacak olsan kime kefil olursun ve niye" +
                            "?\n-Nişanlım yani karısı yapmamıştır. Öyle bir insan değil.");
                }

            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Kaybın karısı")){
                    textViewR.setText("+Neden boşanmadın kocandan kaybolunca?\n-Çünkü öldüğüne dair" +
                            " hala bir kanıt yok. Yakında boşanacağım ama.");
                }
                else if (textViewM.getText().toString().equals("Kaybın kız kardeşi")){
                    textViewR.setText("+Borçlu olduğu arkadaşı hakkında ne düşünüyorsun?\n-Çok " +
                            "bencil ve paragöz bir adam.");
                }
                else if (textViewM.getText().toString().equals("Kaybın erkek kardeşi")){
                    textViewR.setText("+Elinde kanıt olabilecek bir şeyler var mı?\n-Sosyal medya" +
                            " hesaplarından birini şifremi " +
                            "unuttumla ele geçirdim size vereyim şifresini.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("Is5Place2",false)){
                        Toast.makeText(IstEpFiveQuestioning.this,"Yeni incelenecek" +
                                        " kanıt keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("Is5Place2",true).apply();
                }
                else if (textViewM.getText().toString().equals("Kaybın iş arkadaşı")){
                    textViewR.setText("+Seninle en son ne zaman yazıştı?\n- Saat 11 gibi.");
                }
                else if (textViewM.getText().toString().equals("Kaybın yan komşusu")){
                    textViewR.setText("+Kayıpla arası en kötü olan?\n-Bilmiyorum o kadar.");
                }
                else if (textViewM.getText().toString().equals("Kaybın borç. ol. arkadaşı")){
                    textViewR.setText("+Yan komşusu hakkında ne düşünüyorsun?\n-Kendisini " +
                            "tanımıyorum ama çok sevse ya da nefret etse ismini anardı.");
                }
                else if (textViewM.getText().toString().equals("Kaybın askerlik arkadaşı")){
                    textViewR.setText("+Bana sunabileceğin ipucu var mı?\n-Yok. Olsa polislere" +
                            " verirdim 10 yıl önce.");
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
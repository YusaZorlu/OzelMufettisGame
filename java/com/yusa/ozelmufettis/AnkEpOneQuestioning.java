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
                textViewM.setText("Uzman dişçi");
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
                textViewM.setText("Yeni dişçi");
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
                textViewM.setText("Kadın asistan");
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
                textViewM.setText("Diğer hasta");
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
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Şüphelendiğin birisi var mı?\n-Şüphelendiğim birisi yok ancak" +
                            " kimin öldürdüğünü merak ediyorum.");
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+Şüphelendiğin birisi var mı?\n-Asistandan şüpheleniyorum." +
                            " Genç olan asistandan. Sebebi de sevgilisinin eski sevgilisiymiş" +
                            "kurban. Tabi bunu diğer asistandan duydum.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Şüphelendiğin birisi var mı?\n-Kuryeden şüpheleniyorum çünkü" +
                            " o geldikten kısa süre sonra öldü.");
                    if (!PreferenceManager.getDefaultSharedPreferences
                            (getApplicationContext()).getBoolean("AnkSuspect6",false)){
                        Toast.makeText(AnkEpOneQuestioning.this,"Yeni şüpheli keşfettin"
                                , Toast.LENGTH_LONG).show();
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).
                            edit().putBoolean("AnkSuspect6",true).apply();
                    s6.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Şüphelendiğin birisi var mı?\n-Diğer asistandan " +
                            "şüpheleniyorum çünkü ölünün eski kız arkadaşıyla sevgiliymiş.");
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Şüphelendiğin birisi var mı?\n-Bilmiyorum ama dişçide bir " +
                            "sürü kamera var ve bu kameraların çalışmadığını " +
                            "sadece personelden birileri biliyordur.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Şüphelendiğin birisi var mı?\n-Bilmiyorum çünkü siparişleri" +
                            " verip çıktım ben.");
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

                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Kurban bulunduğu zaman ne yapıyordun?\n-Diğer hastayı oper" +
                            "asyona hazırlıyordum. Anesteziyi hazırlamıştım.");
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+Kurban bulunduğu zaman ne yapıyordun?\n-Yemek yiyordum." +
                            " Saat öğlen 1 civarlarıydı.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Kurban bulunduğu zaman ne yapıyordun?\n-Doktorların " +
                            "muayneleri için malzemeleri hazırlıyordum.");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Kurban bulunduğu zaman ne yapıyordun?\n-Sigara içmeye " +
                            "balkona çıkmıştım. Balkon bekleme odasında bu arada.");
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Kurban bulunduğu zaman ne yapıyordun?\n-Dişçinin yanındaydım" +
                            "dolgu için hazırlanırken çok sıkıştım. Tuvalete gidince cesedi gördüm.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Kurban bulunduğu zaman ne yapıyordun?\n-Motorumla" +
                            " restoranta geri dönüyordum büyük ihtimalle.");
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

                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Bu muaynehanenin sahibiyim." +
                            " Burayı açalı 9 yıl diş hekimliğine başlayalı 11 yıl oluyor.");
                    q31.setText("Diğer hekimi sor");
                    q32.setText("Asistanları sor");
                    q33.setText("Olay anına dair kanıt sor");
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Geçen sene mezun oldum. " +
                            "Yeni bir diş hekimi olduğumdan isim yapmak için burada çalışıyorum.");
                    q31.setText("Maaşın iyi midir");
                    q32.setText("Asistanlar hakkında düşüncen");
                    q33.setText("O saat içinde ses duydun mu");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-21 yaşındayım üniversite " +
                            "okumak yerine burada çalışmaya karar verdim. 6 aydır çalışıyorum.");
                    q31.setText("Hekimler hakkında ne düşünüyorsun");
                    q32.setText("Diğer asistan hakkında ne düşünüyorsun");
                    q33.setText("Dinlenme odasında diğer hastayı gördün mü");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-34 yaşındayım, polisiye" +
                            " dizi severim. Onun dışında 9 yıldır yani muaynehane " +
                            "açıldığından beri burada çalışıyorum.");
                    q31.setText("Hekimler hakkında ne düşünüyorsun");
                    q32.setText("Diğer asistan hakkında ne düşünüyorsun");
                    q33.setText("Hangi odadan tuveleti duymak en zor");
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-Antalya'da otel sahibiyim." +
                            " Beni bu saçma sapan cinayette şüpheli olmaktan kurtarırsan sana en kra" +
                            "lından bir tatil ayarlarım.");
                    q31.setText("Otel güzel mi");
                    q32.setText("Hiç çığlık ya da ses duymuş muydun muayne zamanı");
                    q33.setText("Hekimler hakkında ne düşünüyorsun");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Kendini bana tanıtabilir misin?\n-19 yaşındayım, üniversitede" +
                            " okurken ek iş olarak kuryelik yapıyorum.");
                    q31.setText("Hangi restorantın kuryesisin");
                    q32.setText("Buraya sık gelir misin");
                    q33.setText("Saat kaçta girdin ve kurban yaşıyor muydu");
                }
            }
        });
        q21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Tek başına mıydın o sırada?\n-Diğer hasta yanımdaydı ama" +
                            " asistanları daha çağırmamıştım");
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+Tek başına mıydın o sırada?\n-Asistan hanım da" +
                            " yemeğini yiyordu ama benden önce çıktı yemekten.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Tek başına mıydın o sırada?\n-Evet tek başımaydım. Diğer as" +
                            "istan yanımda değildi.");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Tek başına mıydın o sırada?\n-Balkonda tek başımaydım." +
                            " Zaten küçük bir balkon.");
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Tek başına mıydın o sırada?\n-Dediğim gibi hekimin yanındaydım" +
                            " ama asistanı gelmemişti daha");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Tek başına mıydın o sırada?\n-Evet tek başımaydım.");
                }
            }
        });
        q22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Normalde ben muayne ederdim, uzun " +
                            "süreli müşterim diyebilirim.");
                    q223.setText("Randevuyu hanginizden almıştı");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Pek tanımıyorum. İlk defa bana " +
                            "muayne olmaya gelmişti.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Biraz tanıyorum, çevreden diyelim.");
                    q223.setText("Detay verebilir misin");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Teyzemin çocuğu. Sık sık görüşmez" +
                            "dik ama burayı ben tavsiye etmiştim.");
                    q21.setVisibility(View.GONE);
                    q22.setVisibility(View.GONE);
                    q23.setVisibility(View.GONE);
                    q223.setText("Akraban nasıl birisiydi");
                    q221.setVisibility(View.VISIBLE);
                    q222.setVisibility(View.VISIBLE);
                    q223.setVisibility(View.VISIBLE);
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Hayır ama tuvalete gittiğimde cesedi " +
                            "bulan benim.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Kurbanı tanıyor musun?\n-Kim olduğuna dair en ufak " +
                            "bir fikrim yok.");
                }
            }
        });
        q23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Peki kurban bulunmadan bir kaç dakika önce ne " +
                            "yapıyordun?\n-Kahve içtiydim hastam hazır olana kadar.");
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+Peki kurban bulunmadan bir kaç dakika önce ne " +
                            "yapıyordun?\n-Motor kuryeden yemeğimi almıştım 10 dakika önce.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Peki kurban bulunmadan bir kaç dakika önce ne " +
                            "yapıyordun?\n-Bekleme odasında takılıyordum 5 dakika öncesine kadar.");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Peki kurban bulunmadan bir kaç dakika önce ne " +
                            "yapıyordun?\n-Dinlenme odasında aldığım yemeği yiyordum.");
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Peki kurban bulunmadan bir kaç dakika önce ne" +
                            " yapıyordun?\n-Bekleme odasındaydım. 12:50 gibi girdim odaya zaten. " +
                            "Kurban da bir kaç dakika sonra tuvalete gitti ama gelmedi.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Peki kurban bulunmadan bir kaç dakika önce ne " +
                            "yapıyordun?\n-Siparişleri teslim ettim işte.");
                }
            }
        });
        q221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Aranızda sıkıntı var mıydı?\n-Hayır yoktu. Olsa bile " +
                            "ortalığı yakıp yıkmadığı sürece müşteri müşteridir.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Aranızda sıkıntı var mıydı?\n-Birazcık vardı ama şu" +
                            " an anlatamayacağım.");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Aranızda sıkıntı var mıydı?\n-Aramızda akrabalık ilişkisi" +
                            " dışında iyi ya da kötü bir şey yoktu.");
                }
            }
        });
        q222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Peki kurbanın kavgalı ya da problemli olduğu birisi " +
                            "var mı?\n-Bilmiyorum ama geldiği zaman mutlu değil gibiydi.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Peki kurbanın kavgalı ya da problemli olduğu birisi " +
                            "var mı?\n-Var bildiğim birileri. Kendisi iyi biri değildi zaten");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Peki kurbanın kavgalı ya da problemli olduğu birisi " +
                            "var mı?\n-6 ay önce yeni asistan işe alınınca, ala ala bu salağı mı" +
                            " aldınız demişti bana.");
                }
            }
        });
        q223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Randevuyu hangi hekimden almıştı?\n- Diğer diş hekimi a" +
                            "rkadaştan almıştı ben yoğun olduğum ve acelesi olduğu için.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Detay verebilir misin?\n- Arkadaş ortamımız yakın yani. Ama" +
                            " birbirimizle samimi değiliz.");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Akraban olduğuna göre az çok bilirsin. Kurban nasıl biriydi" +
                            "?\n-İyi birisiydi genel olarak ama biraz egolu ve bazı takıntıları" +
                            " vardı.");
                }
            }
        });
        q31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Diğer hekim nasıl birisi?\n-Genç, hırslı bir arkadaş.");
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+Maaşın iyi midir?\n-Çok iyi değil ancak ortalamanın üzerinde.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Hekimler hakkında ne düşünüyorsun?\n-İyi insanlar, severim.");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Diş hekimleri hakkında ne düşünüyorsun?\n-İşlerini iyi " +
                            "yapıyorlar, maaşımı da geciktirmiyorlar. Bence yeterince iyi insanlar.");
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Otel güzel mi?\n- Belek'te 5 yıldızlı bir otel. Çok güzel.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Hangi restorantın kuryesisin?\n- Kardeşler Kebap House diye" +
                            " bir yer.");
                }
            }
        });
        q32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Asistanlar hakkında ne diyebilirsin?\n- İşte düzgünler ama" +
                            " içlerini bilemem.");
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+Asistanlar hakkında ne diyebilirsin?\n-Bana ters davranı" +
                            "şları olmadı hiç.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Diğer asistan hakkında ne düşünüyorsun?\n- Değişik bir kadın" +
                            ", pek konuşmadık.");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Diğer asistan hakkındaki düşüncelerin nedir?\n- Biraz agresif" +
                            " bir genç ama olayını görmedim.");
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Hiç çığlık ya da ses duydun mu?\n- Bir kaç tıkırtı duymuştum" +
                            "1 civarı ama emin değilim");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Buraya sık sık gelir misin?\n-Haftada 2, 3 gün gelirim.");
                }
            }
        });
        q33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textViewM.getText().toString().equals("Uzman dişçi")){
                    textViewR.setText("+Peki olay anına dair bir kanıt var mı kameralar gibi?\n-" +
                            "Kameralara baktım da kayıt almıyorlarmış, bozukmuş.");
                }
                else if (textViewM.getText().toString().equals("Yeni dişçi")){
                    textViewR.setText("+O saat içerisinde anormal bir ses duydun mu?\n-Kulaklık " +
                            "takıyordum, duymadım.");
                }
                else if (textViewM.getText().toString().equals("Erkek asistan")){
                    textViewR.setText("+Dinlenme odasında diğer hastayı gördün mü?\n- Emin değilim.");
                }
                else if (textViewM.getText().toString().equals("Kadın asistan")){
                    textViewR.setText("+Hangi odadan tuvaleti duymak en zor?\n- En uzak oda bekleme" +
                            " odası.");
                }
                else if (textViewM.getText().toString().equals("Diğer hasta")){
                    textViewR.setText("+Diş hekimleri hakkında ne düşünüyorsunuz?\n- Türkiyedeki" +
                            " en iyi diş hekimlerinden birisi buranın sahibi.");
                }
                else if (textViewM.getText().toString().equals("Motorlu kurye")){
                    textViewR.setText("+Saat kaçta girdin ve girdiğinde kurban yaşıyor muydu?\n-" +
                            "12:55 gibi girdim ve galiba yaşıyordu.");
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
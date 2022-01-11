package com.example.separate_collection_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class SearchScreenActivity extends AppCompatActivity {
    Button camera_screenBtn, gallery_screenBtn;
        //탭
    Button seperate_screenBtn;

    ListView listview = null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);

        //리스트
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        //리스트 데이터
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a1),
                "신문지", "분류 : 종 이 류", "분리수거 방법 : 물기에 젖지 않도록 하고 반듯하게 펴서 차곡 차곡 쌓은 후 묶어서 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a2),
                "책자,공책, 달력, 쇼핑백", "분류 : 종 이 류", "분리수거 방법 : 비닐 코팅된 표지, 스프링 등은 제거 후 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a3),
                "종이컵, 종이팩", "분류 : 종 이 류", "분리수거 방법 : 내용물을 비우고 물로 헹군 후 압착하여 봉투에 넣거나 반드시 일반폐지와 분리배출해야 재활용 가능") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a4),
                "상자류", "분류 : 종 이 류", "분리수거 방법 : 비닐코팅 부분, 테이프, 철핀 등을 제거하고 압착한 후 끈으로 묶어서 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a5),
                "음식용 캔", "분류 : 캔 류", "분리수거 방법 : 내용물을 비우고 물로 헹군 후 압착하여 배출" ) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a6),
                "기타캔 (부탄가스, 살충제 용기)", "분류 : 캔 류", "분리수거 방법 : 플라스틱 병뚜껑을 제거하고, 구멍을 뚫어 내용물을 비운 후 압착하여 배출") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a7),
                "술병, 음료수병, 기타잡병", "분류 : 병 류", "분리수거 방법 : 병뚜껑을 제거한 후 내용물을 비우고 물로 헹구어 배출\n" +
                        "※담배꽁초 등 이물질 투입금지 ") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a8),
                "고철(철사,못,철판 등)", "분류 : 고 철", "분리수거 방법 : 이물질이 섞이지 않도록 한 후 고철과 비철(알루미늄, 구리 등)로 구별하여 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a9),
                "면섬유, 기타 의류", "분류 : 의 류", "분리수거 방법 : 물기에 젖지 않도록 하고 마대 등에 담거나 끈으로 묶어서 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a10),
                "페트병", "분류 : 플 라 스 틱 류", "분리수거 방법 : 내용물을 비우고 부착 상표 등을 제거한 후 압착하여 배출") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a11),
                "샴푸병, 세제병 등 병모양의 용기", "분류 : 플 라 스 틱 류", "분리수거 방법 : 내용물을 비우고 다른 재질로된 뚜껑이나 부착 상표를 제거한 후 압착하여 배출\n") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a12),
                "계란용기 등, 플라스틱받침대", "분류 : 플 라 스 틱 류", "분리수거 방법 : 이물질을 제거한 후 차곡 차곡 쌓은 후 묶어서 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a13),
                "스티로폼", "분류 : 플 라 스 틱 류", "분리수거 방법 : 내용물을 완전히 비우고 부착상표 등을 제거한 후 끈으로 묶어서 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a14),
                "장판", "분류 : 플 라 스 틱 류", "분리수거 방법 : 장판에 붙어 있는 테이프, 접착제 등을 제거한 후 묶어서 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a15),
                "컵라면 용기", "분류 : 플 라 스 틱 류", "분리수거 방법 : 뚜껑을 제거한 후 내용물을 비우고 깨끗이 헹구어 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a16),
                "물통, 바가지 등 생활용품류", "분류 : 플 라 스 틱 류", "분리수거 방법 : 내용물을 깨끗이 비우고 마대(봉투)에 넣거나 끈으로 묶어서 배출") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a17),
                "1회용 비닐봉투", "분류 : 플 라 스 틱 류", "분리수거 방법 : 이물질은 제거한 후 흰색과 유색으로 구별하여 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a18),
                "필름류(과자, 라면)봉지", "분류 : 플 라 스 틱 류", "분리수거 방법 : 이물질(내용물,물기)은 반드시 제거 후 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a19),
                "폐건전지", "분류 : 건 전 지\t", "분리수거 방법 : 자체 폐건전지 수거함에 배출") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a20),
                "폐형광등", "분류 : 건 전 지\t", "분리수거 방법 : 자체 폐형광등 수거함에 배출") ;




        //카메라 검색
        camera_screenBtn = (Button) findViewById(R.id.camera_search);

        camera_screenBtn.setOnClickListener((v) -> {
            Intent intent_camera = new Intent(getApplicationContext(), SearchCameraScreenActivity.class);
            startActivity(intent_camera);
        });

        //이미지 검색
        gallery_screenBtn = (Button) findViewById(R.id.gallery_search);

        gallery_screenBtn.setOnClickListener((v) -> {
            Intent intent_gallery = new Intent(getApplicationContext(), SearchGalleryScreenActivity.class);
            startActivity(intent_gallery);
        });

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);

        //분리수거 기준
        seperate_screenBtn = (Button) findViewById(R.id.seperate_screen_btn);

        seperate_screenBtn.setOnClickListener((v) -> {
            Intent intent_seperate = new Intent(getApplicationContext(), SeperateScreenActivity.class);
            startActivity(intent_seperate);
        });



    }
}
package com.example.tabtab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.viewpager);
        Adapter adapter = new Adapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        // viewpage 와 tab 연동
        TabLayout tab = findViewById(R.id.tab);
        tab.setupWithViewPager(vp); // 왜 글자가 사라지냐?

        // 이 밑으로는 이미지를 넣을때 필요한 부분

//        ArrayList<Integer> images = new ArrayList<>();
//        images.add(R.drawable.ic_launcher_background);
//        images.add(R.drawable.bbb);
//        images.add(R.drawable.ccc);
//        images.add(R.drawable.ddd);
//        images.add(R.drawable.eee);
//
//        for(int i=0; i<3; i++) tab.getTabAt(i).setIcon(MediaStore.Images.(i));
    }
}

// 출처 https://godog.tistory.com/entry/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EB%B7%B0%ED%8E%98%EC%9D%B4%EC%A0%80-%ED%83%AD-%EB%A0%88%EC%9D%B4%EC%95%84%EC%9B%83-%EA%B5%AC%ED%98%84-1-%EC%A2%8C%EC%9A%B0%EB%A1%9C-%EB%B0%80%EC%96%B4%EC%84%9C-%ED%8E%98%EC%9D%B4%EC%A7%80-%EC%A0%84%ED%99%98
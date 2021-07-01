package com.example.tabtab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class Adapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> items;
    private ArrayList<String> itext = new ArrayList<String>();
    // 탭과 연동하여 탭의 텍스트가 사라졌다.. 이를 표시해주기 위한 코드인듯;;

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) { //getPageTitle로 제목 가져옴
        return itext.get(position);
    }

    public Adapter(@NonNull FragmentManager fm) {
        super(fm);
        items = new ArrayList<Fragment>();
        items.add(new fragment1());
        items.add(new fragment2());
        items.add(new fragment3());
        items.add(new fragment4());
        items.add(new fragment5());

        itext.add("Tab1");
        itext.add("Tab2");
        itext.add("Tab3");
        itext.add("Tab4");
        itext.add("Tab5");
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
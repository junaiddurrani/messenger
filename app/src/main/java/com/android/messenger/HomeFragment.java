package com.android.messenger;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private View mView;
    private TabLayout tabs;
    private ViewPager viewPager;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.fragment_home, container, false);

        tabs = mView.findViewById(R.id.tabs);
        viewPager = mView.findViewById(R.id.viewPager);

        tabs.setupWithViewPager(viewPager);
        setupWithViewPager(viewPager);

        return mView;
    }

    private void setupWithViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFrag(new MessagesFragment(), "Messages");
        adapter.addFrag(new ActiveFragment(), "Active");
        adapter.addFrag(new GroupFragment(), "Groups");
        adapter.addFrag(new CallsFragment(), "Calls");
        viewPager.setAdapter(adapter);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragmentList = new ArrayList<>();
        private List<String> titleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFrag(Fragment name, String title) {
            fragmentList.add(name);
            titleList.add(title);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titleList.get(position);
        }
    }
}

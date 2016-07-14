package com.sd.dongqiu.FiveFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sd.dongqiu.Adapter.ShujupagerAdapter;
import com.sd.dongqiu.R;

/**
 * Created by mr on 2016/7/5.
 */
public class fragment_shuju extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shuju, container, false);
        ShujupagerAdapter pagerAdaper = new ShujupagerAdapter(getChildFragmentManager(), getContext());
        viewPager = (ViewPager) view.findViewById(R.id.shuju_tab_viewpager);
        viewPager.setAdapter(pagerAdaper);

        tabLayout = (TabLayout) view.findViewById(R.id.shuju_tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

}

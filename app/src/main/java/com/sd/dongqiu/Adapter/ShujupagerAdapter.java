package com.sd.dongqiu.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sd.dongqiu.FiveFragment.ShujuPageFragment;
import com.sd.dongqiu.bean.Constants;

/**
 * Created by Administrator on 2016/7/11.
 */
public class ShujupagerAdapter extends FragmentPagerAdapter {


    private Context context;

    public ShujupagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }
//传递id，和当前fragment标号
    @Override
    public Fragment getItem(int position) {

        return ShujuPageFragment.newInstance(Constants.IDS[position],position);
    }

    @Override
    public int getCount() {
        return Constants.TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Constants.TITLES[position];
    }
}

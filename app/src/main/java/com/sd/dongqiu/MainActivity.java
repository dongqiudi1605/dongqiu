package com.sd.dongqiu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.widget.RadioGroup;

import com.sd.dongqiu.FiveFragment.fragment_add;
import com.sd.dongqiu.FiveFragment.fragment_index;
import com.sd.dongqiu.FiveFragment.fragment_quanzi;
import com.sd.dongqiu.FiveFragment.fragment_shuju;
import com.sd.dongqiu.FiveFragment.fragment_zhibo;

public class MainActivity extends myActivity {
    Fragment fragment_add,fragment_index,fragment_zhibo,fragment_quanzi,fragment_shuju;
    private RadioGroup mradioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();

        mradioGroup = (RadioGroup) findViewById(R.id.radio_group);
        mradioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                switch(checkedId){
                    case R.id.rb_index:
                        switchFragment(fragment_index);
                        break;
                    case R.id.rb_zhibo:
                        switchFragment(fragment_zhibo);
                        break;
                    case R.id.rb_add:
                        switchFragment(fragment_add);
                        break;
                    case R.id.rb_quanzi:
                        switchFragment(fragment_quanzi);
                        break;
                    case R.id.rb_shuju:
                        switchFragment(fragment_shuju);
                        break;
                }

                }
            });
        initFragment();
    }

    private void initToolBar(){

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }

    /**
     * 初始化Fragment
     */
    private void initFragment() {
        fragment_index=new fragment_index();
        fragment_zhibo=new fragment_zhibo();
        fragment_add=new fragment_add();
        fragment_quanzi=new fragment_quanzi();
        fragment_shuju=new fragment_shuju();
        //第一步：开始事务
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        //第二步：通过事务对象的add方法将fragment添加到容器中
        transaction.add(R.id.fragment_container,fragment_index);
        transaction.add(R.id.fragment_container,fragment_zhibo);
        transaction.add(R.id.fragment_container,fragment_add);
        transaction.add(R.id.fragment_container,fragment_quanzi);
        transaction.add(R.id.fragment_container,fragment_shuju);
        //第三步：隐藏后面三个fragment
        transaction.hide(fragment_zhibo);
        transaction.hide(fragment_add);
        transaction.hide(fragment_quanzi);
        transaction.hide(fragment_shuju);
        //第四步：提交事务
        transaction.commit();
    }

    /**
     * 切换fragment
     */
    private void switchFragment(Fragment fragment){
        //第一步：开始事务
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        //第二步：将所有的fragment都隐藏，再将要显示的fragment显示出来
        transaction.hide(fragment_index);
        transaction.hide(fragment_zhibo);
        transaction.hide(fragment_add);
        transaction.hide(fragment_quanzi);
        transaction.hide(fragment_shuju);
        transaction.show(fragment);
        //第三步：提交事务
        transaction.commit();
    }

}


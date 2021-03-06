package com.sd.dongqiu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.sd.dongqiu.FiveFragment.fragment_add;
import com.sd.dongqiu.FiveFragment.fragment_index;
import com.sd.dongqiu.FiveFragment.fragment_quanzi;
import com.sd.dongqiu.FiveFragment.fragment_shuju;
import com.sd.dongqiu.FiveFragment.fragment_zhibo;

public class MainActivity extends myActivity {
    Fragment fragment_add,fragment_index,fragment_zhibo,fragment_quanzi,fragment_shuju;
    private RadioGroup mradioGroup;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
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

    private void init(){
        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
    }

    private void initToolBar(){

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        toolbar.setNavigationIcon(R.mipmap.demo_tab_icon_contact_normal);
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

    /**
     * 侧拉菜单的点击事件
     */
    public void Side_pull_menu(View view) {
        switch (view.getId()) {
            case R.id.login_tv:
                Log.d("MainActivity", "注册/登录");
                break;
            case R.id.user_icon_link:
                Log.d("MainActivity", "@我的");
                break;
            case R.id.user_icon_praise:
                Log.d("MainActivity", "赞我的");
                break;
            case R.id.user_icon_reply:
                Log.d("MainActivity", "回复我的");
                break;
            case R.id.user_icon_collect:
                Log.d("MainActivity", "我的收藏");
                break;
            case R.id.user_icon_message:
                Log.d("MainActivity", "我的消息");
                break;
            case R.id.user_icon_order:
                Log.d("MainActivity", "我的订单");
                break;
            case R.id.my_ouzoubei:
                Log.d("MainActivity", "欧洲杯宝典");
                break;
            case R.id.my_zhongchao:
                Log.d("MainActivity", "中超");
                break;
            case R.id.my_jiaolian:
                Log.d("MainActivity", "我是教练");
                break;
            case R.id.user_icon_feedback:
                Log.d("MainActivity", "反馈");
                break;
            case R.id.user_icon_search:
                Log.d("MainActivity", "搜索");
                break;
            case R.id.user_icon_setting:
                Log.d("MainActivity", "设置");
                break;
        }
        //关闭左边的滑动菜单
        drawerLayout.closeDrawer(Gravity.LEFT);
    }

    /**
     * toolbar左侧的图标的点击事件
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //判断左边的侧拉菜单是否打开
                if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    drawerLayout.closeDrawer(Gravity.LEFT);
                } else {
                    drawerLayout.openDrawer(Gravity.LEFT);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * 后退按钮
     * 如果侧拉菜单打开，按1次后退按钮，关闭侧拉菜单。
     * 侧拉菜单时，2s内按2次后退按钮，退出应用。
     */
    private long exitTime = 0;

    @Override
    public void onBackPressed() {
        //如果侧拉菜单打开，则关闭侧拉菜单，否则直接退出应用
        if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
            drawerLayout.closeDrawer(Gravity.LEFT);
        } else if ((System.currentTimeMillis() - exitTime) > 2000) {  //System.currentTimeMillis()无论何时调用，肯定大于2000
            Toast.makeText(getApplicationContext(), "再按一次退出懂球帝", Toast.LENGTH_LONG).show();
            exitTime = System.currentTimeMillis();
        } else {
            exitTime = 0;
            finish();
            System.exit(0);
        }
    }
}
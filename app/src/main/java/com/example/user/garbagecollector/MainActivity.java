package com.example.user.garbagecollector;


import android.content.pm.ActivityInfo;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    //AutomationShopFragment automationShopFragment;
    GarbageRecyclingFragment garbageRecyclingFragment;
    //UpgradeShopFragment upgradeShopFragmentActivity;
    FragmentTransaction fTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        if(getSupportActionBar() != null) getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //инициализация игрового фрагмента
        garbageRecyclingFragment = new GarbageRecyclingFragment();
        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.fragmentMainLayout, garbageRecyclingFragment);
        fTrans.commit();
    }

    public void switchToUpgradeShopFragment(View view) {
        
    }

    public void switchAutomationShopFragment(View view) {
    }

    public void switchToGarbageRecyclingFragment(View view) {
    }
}

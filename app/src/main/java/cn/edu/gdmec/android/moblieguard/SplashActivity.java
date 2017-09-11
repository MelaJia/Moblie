package cn.edu.gdmec.android.moblieguard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        System.out.print("你好！");
        System.out.print("sha！");
        System.out.println("lll");
    }
}

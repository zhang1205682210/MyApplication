package com.example.zhangxiaoyu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("请输入一个正整数：∂");
        System.out.println("i");
      debugDemo();
    }
private  void  debugDemo()
{
    for (int i = 0; i < 10; i ++)
    {
        System.out.println("请输入一个正整数：∂");
        System.out.println("i");

    }
}}

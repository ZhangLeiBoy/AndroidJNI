package com.albert.demo;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.albert.androidjnidemo.R;
import com.albert.demo.util.NativeMethod;
import com.albert.demo.util.NativeMethodSum;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    //静态代码块 引入资源
//    static {
//        System.loadLibrary("native-lib");
//    }
//
//    //声明一个本地方法，java -> C
//    public native String helloFormC();

    private Button btn, btn2, btn3;
    private Context context;
    private int nums[] = {2,3,4,5,6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                showToast(NativeMethod.helloFormC());
                break;
            case R.id.btn2:
                showToast(NativeMethodSum.sum(2, 4) + "");
                break;
            case R.id.btn3:
                int[] result = NativeMethodSum.twoSum(nums, 7);
                showToast(result[0] + "  |  " + result[1] );
                break;
        }
    }

    private void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
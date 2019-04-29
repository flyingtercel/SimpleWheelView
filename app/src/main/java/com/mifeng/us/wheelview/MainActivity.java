package com.mifeng.us.wheelview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mifeng.us.widget.WheelView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private WheelView mWheelView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWheelView = findViewById(R.id.mWheelView);

        initDate();
    }

    private void initDate() {
        ArrayList<String>list = new ArrayList<>();
        for(int i=0;i<15;i++){
            list.add("滑动数据第"+i+"个条目");
        }
        mWheelView.setData(list);

    }
}

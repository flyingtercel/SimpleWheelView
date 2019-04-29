package com.mifeng.us.wheelview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mifeng.us.widget.WheelView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private WheelView mWheelView;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWheelView = findViewById(R.id.mWheelView);
        mTextView = findViewById(R.id.mTextView);

        initDate();
    }

    private void initDate() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add("滑动数据第" + i + "个条目");
        }
        mWheelView.setData(list);

        /*对滑动时间做监听*/
        mWheelView.setOnSelectListener(new WheelView.OnSelectListener() {
            @Override
            public void endSelect(int id, String value) {
                mTextView.setText(value);
            }

            @Override
            public void selecting(int id, String value) {
                mTextView.setText(value);
            }
        });
    }
}
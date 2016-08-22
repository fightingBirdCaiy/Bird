package com.caiy.bird;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yongc on 16/8/22.
 */
public class ButterKnifeActivity extends FragmentActivity {

    @BindView(R.id.butterknife_tv)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);

        initView();
    }

    private void initView(){
        ButterKnife.bind(this);

        textView.setText("通过ButterKnife绑定后设置的文本内容");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

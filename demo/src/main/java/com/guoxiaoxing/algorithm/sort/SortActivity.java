package com.guoxiaoxing.algorithm.sort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.guoxiaoxing.algorithm.demo.R;

public class SortActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvSort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
        mTvSort = (TextView) findViewById(R.id.tv_sort);

        findViewById(R.id.btn_sort).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sort:
                int[] data = {2, 3, 4, 1, 6, 5, 10, 9, 8, 7};
                int[] dest = SortUtils.insertSort(data);
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < dest.length; i++) {
                    result.append(dest[i]);
                    if (i != dest.length - 1) {
                        result.append(", ");
                    }
                }
                mTvSort.setText(result.toString());
                break;
        }
    }
}

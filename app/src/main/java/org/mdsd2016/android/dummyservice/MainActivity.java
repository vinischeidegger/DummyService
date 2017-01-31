package org.mdsd2016.android.dummyservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStartService = (Button) findViewById(R.id.btn_start_service);
        btnStartService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_start_service:
                Log.d(this.TAG, "Button clicked");
                break;
            case R.id.btn_start_bound_service:
                break;
            case R.id.btn_start_internet_service:
                break;
            default:
                break;
        }

    }
}

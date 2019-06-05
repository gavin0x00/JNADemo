package me.newtrekwang.jnademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import me.newtrekwang.jnademo.utils.Clibrary;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Clibrary.INSTANCE.add(1,2);
                Log.d(TAG, "onClick: >>>getInt: "+result);
                Toast.makeText(MainActivity.this, "getInt:"+result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

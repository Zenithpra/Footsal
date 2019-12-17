package com.zenith.footsal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.zenith.footsal.R.id.btnlogin;

public class MainActivity extends AppCompatActivity {

    ImageView ivlogo;
    TextView tvuser, tvpass;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivlogo =findViewById(R.id.ivlogo);
        tvuser =findViewById(R.id.tvuser);
        tvpass = findViewById(R.id.tvpass);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}

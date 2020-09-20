package com.example.practical10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();
    ImageView imageView;
    TextView textView;
    Button btn_alpha,btn_scale,btn_rotate,btn_move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView4);
        textView = findViewById(R.id.textView);
        btn_alpha = findViewById(R.id.btn_alpha);
        btn_scale = findViewById(R.id.btn_scale);
        btn_rotate = findViewById(R.id.btn_rotate);
        btn_move = findViewById(R.id.btn_move);

        btn_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG,"btn_alpha click");
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha_anim);
                Animation alpha_blink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha_blink_anim);
                imageView.startAnimation(alpha);
                textView.startAnimation(alpha_blink);
            }
        });

        btn_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anim);
                imageView.startAnimation(scale);
                textView.startAnimation(scale);
            }
        });

        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anim);
                imageView.startAnimation(rotate);
                textView.startAnimation(rotate);
            }
        });

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_anim);
                imageView.startAnimation(move);
                textView.startAnimation(move);
            }
        });
    }
}
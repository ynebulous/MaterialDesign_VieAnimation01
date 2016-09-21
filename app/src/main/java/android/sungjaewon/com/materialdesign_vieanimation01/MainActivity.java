package android.sungjaewon.com.materialdesign_vieanimation01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlpha;
    Button btnRotate;
    Button btnScale;
    Button btnTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlpha= (Button) findViewById(R.id.btnAlpha);

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 미리 정의된 애니메이션 xml을 로드한다.
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                        // 2. 애니메이션을 뷰에 적용하고 실행한다.
               btnAlpha.startAnimation(animation);
            }
        });

        btnRotate= (Button) findViewById(R.id.btnRotate);

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 미리 정의된 애니메이션 xml을 로드한다.
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                // 2. 애니메이션을 뷰에 적용하고 실행한다.
                btnRotate.startAnimation(animation);
            }
        });

        btnScale= (Button) findViewById(R.id.btnScale);

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 미리 정의된 애니메이션 xml을 로드한다.
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                // 2. 애니메이션을 뷰에 적용하고 실행한다.
                btnScale.startAnimation(animation);
            }
        });

        btnTranslate= (Button) findViewById(R.id.btnTranslate);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 미리 정의된 애니메이션 xml을 로드한다.
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                // 2. 애니메이션을 뷰에 적용하고 실행한다.
                btnTranslate.startAnimation(animation);
            }
        });
    }



}

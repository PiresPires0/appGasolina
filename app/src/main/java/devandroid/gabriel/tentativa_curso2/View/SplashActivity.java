package devandroid.gabriel.tentativa_curso2.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import devandroid.gabriel.tentativa_curso2.R;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
public static final int TIME_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        comutar_tela_splash();

    }

    private void comutar_tela_splash() {
        new Handler().postDelayed(() -> {
            Intent Tela_Principal = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(Tela_Principal);
            finish();
        },TIME_SPLASH);
    }


}
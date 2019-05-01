package ajn.kpu.kuispengetahuanumum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity  {

    ImageView logo;
    Button mainkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        mainkan = findViewById(R.id.mainkan);
        logo = findViewById(R.id.logo);
    }

    public void Pindah(View view){
        Intent intent = new Intent(HomeActivity.this, QuizActivity.class);
        startActivity(intent);
    }

}

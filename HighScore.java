package ajn.kpu.kuispengetahuanumum;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static ajn.kpu.kuispengetahuanumum.R.layout.high_score;

public class HighScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(high_score);

        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("Skor", 0);
        txtScore.setText("Skormu: " + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("Skor Tinggi",0);
        if(highscore >= score)
            txtHighScore.setText("Skor Tinggi: "+ highscore);
        else
        {
            txtHighScore.setText("Skor Tinggi Baru: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("Skor Tinggi", score);
            editor.commit();
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(HighScore.this, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}

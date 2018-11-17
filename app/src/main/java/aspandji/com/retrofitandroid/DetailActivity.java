package aspandji.com.retrofitandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView txtJudul = findViewById(R.id.txtJudul);
        TextView txtSub = findViewById(R.id.txtSub);
        TextView txtRating = findViewById(R.id.txtRating);
        TextView txtSummary = findViewById(R.id.txtSummary);

        Intent getI = getIntent();
        String judul = getI.getStringExtra("judul");
        String sub = "Release Date: "+getI.getStringExtra("tanggal");
        String rating = "Rating: "+getI.getStringExtra("rating");
        String summary= getI.getStringExtra("deskripsi");

        txtJudul.setText(judul);
        txtSub.setText(sub);
        txtRating.setText(rating);
        txtSummary.setText(summary);
    }
}

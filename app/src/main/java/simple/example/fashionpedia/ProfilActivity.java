package simple.example.fashionpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import simple.example.fashionpedia.model.Fashion;

public class ProfilActivity extends AppCompatActivity {

    Fashion fashion;
    TextView txJudul,txModel,txMerek,txDeskripsi;
    ImageView ivFotoFashion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_merek);
        Intent intent = getIntent();
        fashion = (Fashion) intent.getSerializableExtra(DaftarFashionActivity.FASHION_TERPILIH);
        inisialisasiView();
        tampilkanProfil(fashion);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txModel = findViewById(R.id.txModel);
        txMerek = findViewById(R.id.txMerek);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoFashion = findViewById(R.id.gambarFashion);
    }


    private void tampilkanProfil(Fashion fashion) {
        Log.d("Profil","Menampilkan "+fashion.getModel());
        txJudul.setText(fashion.getModel());
        txModel.setText(fashion.getModel());
        txMerek.setText(fashion.getMerek());
        txDeskripsi.setText(fashion.getDeskripsi());
        ivFotoFashion.setImageDrawable(this.getDrawable(fashion.getDrawableRes()));
    }




}
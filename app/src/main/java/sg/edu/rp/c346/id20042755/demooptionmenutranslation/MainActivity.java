package sg.edu.rp.c346.id20042755.demooptionmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText, tvTranslatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.tvTranslatedText);
        tvTranslatedText2 = findViewById(R.id.tvTranslatedText2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);//inflate means use this.
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.englishSelection){
            tvTranslatedText.setText("Hello");
            tvTranslatedText2.setText("Bye");
        }
        else if(item.getItemId() == R.id.italianSelection){
            tvTranslatedText.setText("Ciao");
            tvTranslatedText2.setText("Addio");
        }
        return super.onOptionsItemSelected(item);
    }
}
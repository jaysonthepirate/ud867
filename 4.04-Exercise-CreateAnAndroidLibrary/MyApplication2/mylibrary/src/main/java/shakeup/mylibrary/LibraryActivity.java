package shakeup.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        String newJoke = getIntent().getStringExtra("joke");

        TextView textView = (TextView) findViewById(R.id.joke_text);
        textView.setText(newJoke);
    }
}

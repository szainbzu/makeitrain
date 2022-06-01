package edu.cs.birzeit.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtValue;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValue = findViewById(R.id.txtValue);
    }

    public void btnAddClick(View view) {
        counter+=2000;
        NumberFormat nformat = NumberFormat.getCurrencyInstance();
        String str = String.valueOf(nformat.format(counter));
        txtValue.setText(str);
    }
}
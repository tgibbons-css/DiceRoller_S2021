package tgibbons.diceroller_s2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnRoll;
    TextView tvDieValue;
    Dice die;

    // New lines
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        die = new Dice();
        tvDieValue = findViewById(R.id.textViewDie);
        btnRoll = findViewById(R.id.buttonRoll);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btnRoll.setText(die.roll(6).toString());
                tvDieValue.setText(die.roll(6).toString());
            }
        });
    }
}
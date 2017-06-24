package com.example.android.harrypotterquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the magic button is clicked.
     */
    public void magicButton(View view) {
        // Result
        int result = 0;
        String userLevel = "";

        // First Q.
        EditText motherName = (EditText) findViewById(R.id.motherName);

        if (motherName.getText().toString().equals("Lily")) {
            result = result + 1;
        }

        // Second Q.
        CheckBox stoneCheckbox = (CheckBox) findViewById(R.id.stoneCheckbox);
        CheckBox wandCheckbox = (CheckBox) findViewById(R.id.wandCheckbox);
        CheckBox coatCheckbox = (CheckBox) findViewById(R.id.coatCheckbox);
        CheckBox hatCheckbox = (CheckBox) findViewById(R.id.hatCheckbox);

        if (stoneCheckbox.isChecked() && wandCheckbox.isChecked() && coatCheckbox.isChecked() && !hatCheckbox.isChecked()) {
            result = result + 1;
        }

        // Third Q.

        RadioButton ronMarriedHermione = (RadioButton) findViewById(R.id.ronRadioButton);

        if (ronMarriedHermione.isChecked()) {
            result = result + 1;
        }

        // Fourth Q.
        RadioButton sixthBook = (RadioButton) findViewById(R.id.sixthBookRadioButton);

        if (sixthBook.isChecked()) {
            result = result + 1;
        }

        // Fifth Q.
        RadioButton snapeKilledDumbledor = (RadioButton) findViewById(R.id.snapeKillerRadioButton);

        if (snapeKilledDumbledor.isChecked()) {
            result = result + 1;
        }

        // User's Level

        if (result >= 4) {
            userLevel = getString(R.string.fullOfMagic);
        } else if (result == 2 || result == 3) {
            userLevel = getString(R.string.willBeGood);
        } else {
            userLevel = getString(R.string.muggle);
        }

        Toast.makeText(this, getString(R.string.message, result, userLevel), Toast.LENGTH_LONG).show();

    }
}

package com.example.easydatetimepickersample;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends FragmentActivity implements DatePickerDialog.OnDateSetListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String str = String.format(Locale.US, "%d/%d/%d", year, month + 1, dayOfMonth);
        textView.setText(str);
    }


    public void showDatePickerDialog(View v) {
        DialogFragment dialogFragment = new DatePick();
        dialogFragment.show(getSupportFragmentManager(), "datapicker");
    }


}

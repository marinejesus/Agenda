package com.example.agenda;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AgendaActivity extends AppCompatActivity {

    private Spinner spinnerLocal;
    private Spinner spinnerPagamento;
    private EditText editObs;
    private DatePicker data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        spinnerLocal = findViewById(R.id.spinnerLocal);
        spinnerPagamento = findViewById(R.id.spinnerPagamento);
        editObs = findViewById(R.id.editObs);
        data = findViewById(R.id.data);

        ArrayAdapter adapterLocal = ArrayAdapter.createFromResource(this,R.array.local,android.R.layout.simple_spinner_dropdown_item);
        spinnerLocal.setAdapter(adapterLocal);

        ArrayAdapter adapterPagamento = ArrayAdapter.createFromResource(this,R.array.Pagamento,android.R.layout.simple_spinner_dropdown_item);
        spinnerPagamento.setAdapter(adapterPagamento);

    }

    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear,
                                      int dayOfMonth) {



                   Calendar c = Calendar.getInstance();
                   c.set(Calendar.YEAR, year);
                   c.set(Calendar.MONTH, monthOfYear );
                   c.set(Calendar.DAY_OF_MONTH, dayOfMonth);


                    String data = String.valueOf(dayOfMonth) + " /"
                            + String.valueOf(monthOfYear+1) + " /" + String.valueOf(year);
                    Toast.makeText(AgendaActivity.this,
                            "DATA = " + data, Toast.LENGTH_SHORT)
                            .show();
                }
            };
}

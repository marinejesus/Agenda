package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {

private EditText editNome;
private EditText editCpf;
private EditText editEndereco;
private EditText editTelefone;
private EditText editEmail;
private Button btnSalvar;
private ClienteDao dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editNome = findViewById(R.id.EditNome);
        editCpf = findViewById(R.id.EditCpf);
        editEndereco = findViewById(R.id.EditEndereco);
        editTelefone = findViewById(R.id.EditTelefone);
        editEmail = findViewById(R.id.editEmail);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(clickSalvar);
    }

    View.OnClickListener clickSalvar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);

            startActivity(intent);
            finish();
        }
    };


}

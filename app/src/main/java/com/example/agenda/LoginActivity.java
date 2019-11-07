package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText editLogin;
    EditText editSenha;
    Button btnSalvar;
    TextView txtNovaSenha;
    TextView txtCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();

       String login = editLogin.getText().toString();
       String senha = editSenha.getText().toString();
       btnSalvar.setOnClickListener(clickSalvar);
       txtCadastrar.setOnClickListener(clickCadastrar);
       txtNovaSenha.setOnClickListener(clickSenha);
    }

    private void init() {
        editLogin = findViewById(R.id.editLogin);
        editSenha = findViewById(R.id.editSenha);
        btnSalvar = findViewById(R.id.btnSalvar);
        txtNovaSenha = findViewById(R.id.txtNovaSenha);
        txtCadastrar = findViewById(R.id.txtCasdastrar);
    }
//----------------------------------------------------------------
    View.OnClickListener clickSalvar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(LoginActivity.this, AgendaActivity.class);

            startActivity(intent);

        }
    };
 //----------------------------------------------------------------------

 View.OnClickListener clickCadastrar = new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);

         startActivity(intent);
     }
 }  ;

//----------------------------------------------------------

    View.OnClickListener clickSenha = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}

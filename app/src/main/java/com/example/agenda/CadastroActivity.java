package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

private EditText nome;
private EditText cpf;
private EditText endereco;
private EditText telefone;
private EditText email;
private Button salvar;
private ClienteDao dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = findViewById(R.id.EditNome);
        cpf = findViewById(R.id.EditCpf);
        endereco = findViewById(R.id.EditEndereco);
        telefone = findViewById(R.id.EditTelefone);
        email = findViewById(R.id.editEmail);
        salvar = findViewById(R.id.btnSalvar);
        dao = new ClienteDao(this);

        salvar.setOnClickListener(clickSalvar);
    }

    View.OnClickListener clickSalvar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Cliente c = new Cliente();
            c.setNome(nome.getText().toString());
            c.setCpf(cpf.getText().toString());
            c.setEndereco(endereco.getText().toString());
            c.setTelefone(telefone.getText().toString());
            c.setEmail(email.getText().toString());
            long id = dao.inserir(c);
            Toast.makeText(CadastroActivity.this, "Cliente enserido com sucesso", Toast.LENGTH_SHORT).show();


           // Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);

          //  startActivity(intent);
           // finish();
        }
    };


}

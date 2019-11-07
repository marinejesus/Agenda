package com.example.agenda;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ClienteDao {

    private Conexao conexao;
    private SQLiteDatabase agenda;

    public ClienteDao(Context context){
        conexao = new Conexao(context);
        agenda = conexao.getWritableDatabase();

    }

    public long inserir(Cliente cliente){
        ContentValues values = new ContentValues();
        values.put("nome", cliente.getNome());
        values.put("cpf",cliente.getCpf());
        values.put("endereco",cliente.getEndereco());
        values.put("telefone", cliente.getTelefone());
        values.put("email", cliente.getEmail());

        return agenda.insert("cliente", null, values);
    }
}

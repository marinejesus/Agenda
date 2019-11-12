package com.example.agenda;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

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

        public List<Cliente> obterTodos() {
            List<Cliente> clientes = new ArrayList<>();
            Cursor cursor = agenda.query("cliente", new String[]{"id", "nome", "cpf", "endereco", "telefone", "email"},
                    null, null, null, null, null);
            while (cursor.moveToNext()) {
                Cliente c = new Cliente();
                c.setId(cursor.getInt(0));
                c.setNome(cursor.getString(1));
                c.setCpf(cursor.getString(2));
                c.setEndereco(cursor.getString(3));
                c.setTelefone(cursor.getString(4));
                c.setEmail(cursor.getString(5));

            }
            return clientes;

        }
}



package com.example.agenda;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {


   public Conexao(Context context){
        super(context, "nome", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table if not exists cliente (" +
                "id integer primary key AUTOINCREMENT" +
                ", nome varchar(30) not null" +
                ", cpf varchar(15)" +
                ", endereco varchar(30) " +
                ", telefone varchar(15)" +
                ", email varchar(30))";

        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int il) {

    }
    public void inserir(String nome, String cpf, String endereco, String telefone, String email){


        ContentValues contentValues = new ContentValues();
        contentValues.put("nome", nome);
        contentValues.put("cpf", cpf);
        contentValues.put("endereco", endereco);
        contentValues.put("telefone", telefone);
        contentValues.put("email", email);
        getWritableDatabase().insert("pessoa", null, contentValues);

    }

    public  boolean salvar(Integer id, String nome, String cpf, String endereco, String telefone, String email){
       int retorno = 0;
       ContentValues contentValues = new ContentValues();
       contentValues.put("nome", nome);
       contentValues.put("cpf",cpf);
       contentValues.put("endereco", endereco);
       contentValues.put("telefone", telefone);
       contentValues.put("email", email);

       if(id == null){
           long x = getWritableDatabase().insert("cliente", null, contentValues);
           retorno = Integer.parseInt(x + "");
       }else{
           retorno = getWritableDatabase().update("cliente", contentValues, "id=" + id, null);
       }
       return  retorno==0?false:true;
    }
}


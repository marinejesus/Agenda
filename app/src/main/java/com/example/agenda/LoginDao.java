package com.example.agenda;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LoginDao {
    private Conexao conexao;
    private SQLiteDatabase agenda;

    public LoginDao(Context context){
        conexao = new Conexao(context);
        agenda = conexao.getWritableDatabase();

    }


   // public boolean update(Login login){
        ContentValues values = new ContentValues();
   // }


}

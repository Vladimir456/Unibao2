package com.example.unibao;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class contenido extends AppCompatActivity {
    AlertDialog ventana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);

    }
    public void bpb(View view ){
        Calendar calendar = Calendar.getInstance();
        final int h = calendar.get(Calendar.HOUR_OF_DAY);
        final int m = calendar.get(Calendar.MINUTE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if((h == 7  || h == 10 || h == 13 || h == 15 ||h == 18 || h == 21) && m <= 15  ) {
            builder.setMessage("BAÑO NO DISPONIBLE");
            builder.create();
            ventana = builder.show();
        }
        else
        {

            builder.setMessage("BAÑO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
    }
    public void b4(View view ){
        Calendar calendar = Calendar.getInstance();
        final int h = calendar.get(Calendar.HOUR_OF_DAY);
        final int m = calendar.get(Calendar.MINUTE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if((h == 7  || h == 10 || h == 13 || h == 15 ||h == 18 || h == 21) && m <= 30 && m > 15  ) {
            builder.setMessage("BAÑO NO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
        else
        {

            builder.setMessage("BAÑO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
    }
    public void b6(View view ){
        Calendar calendar = Calendar.getInstance();
        final int h = calendar.get(Calendar.HOUR_OF_DAY);
        final int m = calendar.get(Calendar.MINUTE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if((h == 7  || h == 10 || h == 13 || h == 15 ||h == 18 || h == 21) && m > 30 && m <= 45  ) {
            builder.setMessage("BAÑO NO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
        else
        {

            builder.setMessage("BAÑO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
    }
    public void b8(View view ){
        Calendar calendar = Calendar.getInstance();
        final int h = calendar.get(Calendar.HOUR_OF_DAY);
        final int m = calendar.get(Calendar.MINUTE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if((h == 7  || h == 10 || h == 13 || h == 15 ||h == 18 || h == 21) && m > 45 && m <= 59  ) {
            builder.setMessage("BAÑO NO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
        else
        {

            builder.setMessage("BAÑO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
    }
    public void b10(View view ){
        Calendar calendar = Calendar.getInstance();
        final int h = calendar.get(Calendar.HOUR_OF_DAY);
        final int m = calendar.get(Calendar.MINUTE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if((h == 8  || h == 11 || h == 14 || h == 16 ||h == 19 || h == 22) && m <= 15  ) {
            builder.setMessage("BAÑO NO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
        else
        {

            builder.setMessage("BAÑO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
    }
    public void b14(View view ){
        Calendar calendar = Calendar.getInstance();
        final int h = calendar.get(Calendar.HOUR_OF_DAY);
        final int m = calendar.get(Calendar.MINUTE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if((h == 8  || h == 11 || h == 14 || h == 16 ||h == 19 || h == 22) && m > 30 && m <= 45  ) {
            builder.setMessage("BAÑO NO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
        else
        {

            builder.setMessage("BAÑO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }

    }
    public void b12(View view ){
        Calendar calendar = Calendar.getInstance();
        final int h = calendar.get(Calendar.HOUR_OF_DAY);
        final int m = calendar.get(Calendar.MINUTE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if((h == 8  || h == 11 || h == 14 || h == 16 ||h == 19 || h == 22) && m <= 30 && m > 15  ) {
            builder.setMessage("BAÑO NO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
        else
        {

            builder.setMessage("BAÑO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }

    }
    public void b17(View view ){
        Calendar calendar = Calendar.getInstance();
        final int h = calendar.get(Calendar.HOUR_OF_DAY);
        final int m = calendar.get(Calendar.MINUTE);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if((h == 8  || h == 11 || h == 14 || h == 16 ||h == 19 || h == 22) && m > 45 && m <= 59  ) {
            builder.setMessage("BAÑO NO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
        else
        {

            builder.setMessage("BAÑO DISPONIBLE ");
            builder.create();
            ventana = builder.show();
        }
    }
public void salir(View view){

    Intent intent = new Intent(contenido.this , MainActivity.class);
    startActivity(intent);
}

}


package br.com.senai.appandroidlista;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListaDeNomes extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] nomes = {"Roberta", "Rosilene", "Robson"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, nomes);
        setListAdapter(arrayAdapter);


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String nome = (String) this.getListAdapter().getItem(position);
        Toast.makeText(this, "Você selecionou: " + nome, Toast.LENGTH_SHORT).show();
    }
}
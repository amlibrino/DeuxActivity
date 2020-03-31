package org.afpa.deuxactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TroisiemeAtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troisieme_ativity);

        // Récupération de listview
        ListView listView = (ListView)findViewById(R.id.listView);
        //Création des users
        UserAccount hamid = new UserAccount("hamid","admin", true);
        UserAccount jason = new UserAccount("jason","user", true);
        UserAccount tristan = new UserAccount("tristan","guest",false);
        //Création de la liste
        UserAccount[] users = new UserAccount[]{hamid,jason,tristan};
        //Création de l'adapter
        ArrayAdapter<UserAccount> arrayAdapter = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1,users);
        //Affectation de l'adapter
        listView.setAdapter(arrayAdapter);
    }
}

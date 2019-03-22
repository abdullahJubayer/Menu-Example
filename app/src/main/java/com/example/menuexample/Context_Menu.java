package com.example.menuexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Context_Menu extends AppCompatActivity {

    TextView longClick;
    Button popup_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context__menu);

        longClick=findViewById(R.id.text_long);
        popup_menu=findViewById(R.id.popup_menu_id) ;

        registerForContextMenu(longClick);


        popup_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Context_Menu.this,Popup_Menu.class));
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.download_menu_id) {
            Toast.makeText(Context_Menu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.copy_menu_id) {
            Toast.makeText(Context_Menu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}

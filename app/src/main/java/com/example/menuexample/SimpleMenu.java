package com.example.menuexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SimpleMenu extends AppCompatActivity {
    Button nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_menu_);


        nxt=findViewById(R.id.second_page);
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SimpleMenu.this,MenuGroup.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.wifi_menu_id:
                Toast.makeText(SimpleMenu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.internet_menu_id:
                Toast.makeText(SimpleMenu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting_menu_id:
                Toast.makeText(SimpleMenu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.exit_menu_id:
                Toast.makeText(SimpleMenu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;

        }
    }

}

package com.example.menuexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuGroup extends AppCompatActivity {
    Button runtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_group);

        runtime=findViewById(R.id.run_time_menu_id);
        runtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Intent(MenuGroup.this,RuntimeChangemenu.class);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_group,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_id_A:
                Toast.makeText(MenuGroup.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_id_B:
                Toast.makeText(MenuGroup.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_id_C:
                Toast.makeText(MenuGroup.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_id_AA:
                Toast.makeText(MenuGroup.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_id_BB:
                Toast.makeText(MenuGroup.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_id_CC:
                Toast.makeText(MenuGroup.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_AAA:
                Toast.makeText(MenuGroup.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_BBB:
                Toast.makeText(MenuGroup.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;

        }
    }

}

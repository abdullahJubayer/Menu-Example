package com.example.menuexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class RuntimeChangemenu extends AppCompatActivity {

    LinearLayout linearLayout;
    Button contextMenu;
    boolean red=false;
    boolean sky=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runtime_changemenu);


        linearLayout=findViewById(R.id.parent_layout);

        contextMenu=findViewById(R.id.context_menu);
        contextMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RuntimeChangemenu.this,Context_Menu.class));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.run_time_change_menu,menu);
        return true;
    }


    //when need to change menu run time
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemRed=menu.findItem(R.id.menu_red_id);
        MenuItem menuItemSky=menu.findItem(R.id.menu_sky_id);
        if (red){
            menuItemRed.setVisible(false);
            menuItemSky.setVisible(true);

        }else if (sky){
            menuItemSky.setVisible(false);
            menuItemRed.setVisible(true);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_red_id:
                red=true;
                sky=false;
                Toast.makeText(RuntimeChangemenu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                linearLayout.setBackground(getDrawable(R.color.colorRed));
                return true;

            case R.id.menu_sky_id:
                red=false;
                sky=true;
                Toast.makeText(RuntimeChangemenu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                linearLayout.setBackground(getDrawable(R.color.colorsky));
                return true;
            default:
                return false;
        }
    }
}

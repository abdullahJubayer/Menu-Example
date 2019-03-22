package com.example.menuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Popup_Menu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button popup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup__menu);

        popup=findViewById(R.id.popup_m_id);

        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu=new PopupMenu(Popup_Menu.this,popup);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(Popup_Menu.this);
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId()){
            case R.id.create_menu_id:
                Toast.makeText(Popup_Menu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.delete_menu_id:
                Toast.makeText(Popup_Menu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.clear_menu_id:
                Toast.makeText(Popup_Menu.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;

        }
    }
}

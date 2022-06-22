package com.example.video;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.video.common.Common;
import com.thebluealliance.spectrum.SpectrumPalette;

public class PaintActivity extends AppCompatActivity implements SpectrumPalette.OnColorSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);

        SpectrumPalette spectrumPalette = findViewById(R.id.palette);
        spectrumPalette.setOnColorSelectedListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();
            if(id ==R.id.action_save){

            }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onColorSelected(int color) {
        Common.COLOR_SELECTED = color;
    }
}
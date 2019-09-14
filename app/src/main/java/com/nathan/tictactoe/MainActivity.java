package com.nathan.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import static com.nathan.tictactoe.R.id.btnMidRight;
import static com.nathan.tictactoe.R.id.btnNewGame;
import static com.nathan.tictactoe.R.id.content;

public class MainActivity extends AppCompatActivity {

    private View screen;
    //buttons
    private Button btnTopLeft;
    private Button btnTopMiddle;
    private Button btnTopRight;
    private Button btnMidLeft;
    private Button btnMiddle;
    private Button btnMidRight;
    private Button btnBottomLeft;
    private Button btnBottomMiddle;
    private Button btnBottomRight;

    private Button btnNewGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TODO: Link CLick Events to Buttons
        //TODO: Implement Board Reset Function

        //Screen
        screen = findViewById(content);
        //screen.setOnClickListener(this);
        //Top Row
        btnTopLeft = findViewById(R.id.btnTopLeft);
        btnTopMiddle = findViewById(R.id.btnTopMiddle);
        btnTopRight = findViewById(R.id.btnTopRight);
        //Middle Row
        btnMidLeft = findViewById(R.id.btnMidLeft);
        btnMiddle = findViewById(R.id.btnMiddle);
        btnMidRight = findViewById(R.id.btnMidRight);
        //Bottom Row
        btnBottomLeft = findViewById(R.id.btnBottomLeft);
        btnBottomMiddle = findViewById(R.id.btnBottomMiddle);
        btnBottomRight = findViewById(R.id.btnBottomRight);
        //New Game
        btnNewGame = findViewById(R.id.btnNewGame);
        //btnNewGame.setOnClickListener(this);
        ResetBoard();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void ResetBoard() {
        //Top Row
        btnTopLeft.setText(R.string.btnBlank);
        btnTopMiddle.setText(R.string.btnBlank);
        btnTopRight.setText(R.string.btnBlank);
        //Middle Row
        btnMidLeft.setText(R.string.btnBlank);
        btnMiddle.setText(R.string.btnBlank);
        btnMidRight.setText(R.string.btnBlank);
        //Bottom Row
        btnBottomLeft.setText(R.string.btnBlank);
        btnBottomMiddle.setText(R.string.btnBlank);
        btnBottomRight.setText(R.string.btnBlank);

    }
}


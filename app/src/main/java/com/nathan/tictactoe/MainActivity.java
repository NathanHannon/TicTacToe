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
    private boolean isX = true;
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

    private View.OnClickListener resetListener = new View.OnClickListener() {
        @Override
        public void onClick(View screen) {
            ResetBoard();
        }
    };
    private View.OnClickListener boardListener = new View.OnClickListener() {
        @Override
        public void onClick(View screen) {
            if(isX)
            {
                //btnBottomRight.setText(R.string.btnX);
                isX = false;
            }
            else
            {
                //btnBottomRight.setText(R.string.btnO);
                isX = true;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TODO: Link CLick Events to Buttons
        //TODO: Implement Board Reset Function

        //Screen
        //screen = findViewById(content);
        //screen.setOnClickListener(boardListener);
        //Top Row
        btnTopLeft = findViewById(R.id.btnTopLeft);
        btnTopLeft.setOnClickListener(boardListener);
        btnTopMiddle = findViewById(R.id.btnTopMiddle);
        btnTopMiddle.setOnClickListener(boardListener);
        btnTopRight = findViewById(R.id.btnTopRight);
        btnTopRight.setOnClickListener(boardListener);
        //Middle Row
        btnMidLeft = findViewById(R.id.btnMidLeft);
        btnMidLeft.setOnClickListener(boardListener);
        btnMiddle = findViewById(R.id.btnMiddle);
        btnMiddle.setOnClickListener(boardListener);
        btnMidRight = findViewById(R.id.btnMidRight);
        btnMidRight.setOnClickListener(boardListener);
        //Bottom Row
        btnBottomLeft = findViewById(R.id.btnBottomLeft);
        btnBottomLeft.setOnClickListener(boardListener);
        btnBottomMiddle = findViewById(R.id.btnBottomMiddle);
        btnBottomMiddle.setOnClickListener(boardListener);
        btnBottomRight = findViewById(R.id.btnBottomRight);
        btnBottomRight.setOnClickListener(boardListener);
        //New Game
        Button btnNewGame = findViewById(R.id.btnNewGame);
        btnNewGame.setOnClickListener(resetListener);
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


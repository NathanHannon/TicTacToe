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
import static com.nathan.tictactoe.R.string.O;
import static com.nathan.tictactoe.R.string.X;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Top Row
        btnTopLeft = findViewById(R.id.btnTopLeft);
        btnTopLeft.setOnClickListener(this);
        btnTopMiddle = findViewById(R.id.btnTopMiddle);
        btnTopMiddle.setOnClickListener(this);
        btnTopRight = findViewById(R.id.btnTopRight);
        btnTopRight.setOnClickListener(this);
        //Middle Row
        btnMidLeft = findViewById(R.id.btnMidLeft);
        btnMidLeft.setOnClickListener(this);
        btnMiddle = findViewById(R.id.btnMiddle);
        btnMiddle.setOnClickListener(this);
        btnMidRight = findViewById(R.id.btnMidRight);
        btnMidRight.setOnClickListener(this);
        //Bottom Row
        btnBottomLeft = findViewById(R.id.btnBottomLeft);
        btnBottomLeft.setOnClickListener(this);
        btnBottomMiddle = findViewById(R.id.btnBottomMiddle);
        btnBottomMiddle.setOnClickListener(this);
        btnBottomRight = findViewById(R.id.btnBottomRight);
        btnBottomRight.setOnClickListener(this);
        //New Game
        Button btnNewGame = findViewById(R.id.btnNewGame);
        btnNewGame.setOnClickListener(this);
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
    @Override
    public void onClick(View v)
    {
        //Switch Statement for determining which button was clicked.
        switch (v.getId())
        {
            case R.id.btnTopLeft:
                if (isX)
                {
                    btnTopLeft.setText(X);
                    isX=false;
                }
                else
                {
                    btnTopLeft.setText(O);
                    isX=true;
                }
                break;
            case R.id.btnTopMiddle:
                if (isX)
                {
                    btnTopMiddle.setText(X);
                    isX=false;
                }
                else
                {
                    btnTopMiddle.setText(X);
                    isX=true;
                }
                break;
            case R.id.btnTopRight:
                if (isX)
                {
                    btnTopRight.setText(X);
                    isX=false;
                }
                else
                {
                    btnTopRight.setText(O);
                    isX=true;
                }
                break;
            case R.id.btnMidLeft:
                if (isX)
                {
                    btnMidLeft.setText(X);
                    isX=false;
                }
                else
                {
                    btnMidLeft.setText(O);
                    isX=true;
                }
                break;
            case R.id.btnMiddle:
                if (isX)
                {
                    btnMiddle.setText(X);
                    isX=false;
                }
                else
                {
                    btnMiddle.setText(O);
                    isX=true;
                }
                break;
            case R.id.btnMidRight:
                if (isX)
                {
                    btnMidRight.setText(X);
                    isX=false;
                }
                else
                {
                    btnMidRight.setText(O);
                    isX=true;
                }
                break;
            case R.id.btnBottomLeft:
                if (isX)
                {
                    btnBottomLeft.setText(X);
                    isX=false;
                }
                else
                {
                    btnBottomLeft.setText(O);
                    isX = true;
                }
                break;
            case R.id.btnBottomMiddle:
                if (isX)
                {
                    btnBottomMiddle.setText(X);
                    isX=false;
                }
                else
                {
                    btnBottomMiddle.setText(O);
                    isX = true;
                }
                break;
            case R.id.btnBottomRight:
                if (isX)
                {
                    btnBottomRight.setText(X);
                    isX=false;
                }
                else
                {
                    btnBottomRight.setText(O);
                    isX = true;
                }
                break;
            case R.id.btnNewGame:
            {
                ResetBoard();
            }
        }
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


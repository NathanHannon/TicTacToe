package com.nathan.tictactoe;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static com.nathan.tictactoe.R.string.Blank;
import static com.nathan.tictactoe.R.string.O;
import static com.nathan.tictactoe.R.string.X;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
    private TextView msgGameStatus;

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
        //Message Box
        msgGameStatus = findViewById(R.id.msgGameStatus);
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
                    btnTopLeft.setEnabled(false);
                }
                else
                {
                    btnTopLeft.setText(O);
                    isX=true;
                    btnTopLeft.setEnabled(false);
                }
                break;
            case R.id.btnTopMiddle:
                if (isX)
                {
                    btnTopMiddle.setText(X);
                    isX=false;
                    btnTopMiddle.setEnabled(false);
                }
                else
                {
                    btnTopMiddle.setText(O);
                    isX=true;
                    btnTopMiddle.setEnabled(false);
                }
                break;
            case R.id.btnTopRight:
                if (isX)
                {
                    btnTopRight.setText(X);
                    isX=false;
                    btnTopRight.setEnabled(false);
                }
                else
                {
                    btnTopRight.setText(O);
                    isX=true;
                    btnTopRight.setEnabled(false);
                }
                break;
            case R.id.btnMidLeft:
                if (isX)
                {
                    btnMidLeft.setText(X);
                    isX=false;
                    btnMidLeft.setEnabled(false);
                }
                else
                {
                    btnMidLeft.setText(O);
                    isX=true;
                    btnMidLeft.setEnabled(false);
                }
                break;
            case R.id.btnMiddle:
                if (isX)
                {
                    btnMiddle.setText(X);
                    isX=false;
                    btnMiddle.setEnabled(false);
                }
                else
                {
                    btnMiddle.setText(O);
                    isX=true;
                    btnMiddle.setEnabled(false);
                }
                break;
            case R.id.btnMidRight:
                if (isX)
                {
                    btnMidRight.setText(X);
                    isX=false;
                    btnMidRight.setEnabled(false);
                }
                else
                {
                    btnMidRight.setText(O);
                    isX=true;
                    btnMidRight.setEnabled(false);
                }
                break;
            case R.id.btnBottomLeft:
                if (isX)
                {
                    btnBottomLeft.setText(X);
                    isX=false;
                    btnBottomLeft.setEnabled(false);
                }
                else
                {
                    btnBottomLeft.setText(O);
                    isX = true;
                    btnBottomLeft.setEnabled(false);
                }
                break;
            case R.id.btnBottomMiddle:
                if (isX)
                {
                    btnBottomMiddle.setText(X);
                    isX=false;
                    btnBottomMiddle.setEnabled(false);
                }
                else
                {
                    btnBottomMiddle.setText(O);
                    isX = true;
                    btnBottomMiddle.setEnabled(false);
                }
                break;
            case R.id.btnBottomRight:
                if (isX)
                {
                    btnBottomRight.setText(X);
                    isX=false;
                    btnBottomRight.setEnabled(false);
                }
                else
                {
                    btnBottomRight.setText(O);
                    isX = true;
                    btnBottomRight.setEnabled(false);
                }
                break;
            case R.id.btnNewGame:
            {
                ResetBoard();
            }
            break;
        }
        CheckWinner();
    }
    public void ResetBoard() {
        //Top Row
        btnTopLeft.setText(Blank);
        btnTopMiddle.setText(Blank);
        btnTopRight.setText(Blank);
        btnTopLeft.setEnabled(true);
        btnTopMiddle.setEnabled(true);
        btnTopRight.setEnabled(true);
        //Middle Row
        btnMidLeft.setText(Blank);
        btnMiddle.setText(Blank);
        btnMidRight.setText(Blank);
        btnMidLeft.setEnabled(true);
        btnMiddle.setEnabled(true);
        btnMidRight.setEnabled(true);
        //Bottom Row
        btnBottomLeft.setText(Blank);
        btnBottomMiddle.setText(Blank);
        btnBottomRight.setText(Blank);
        btnBottomLeft.setEnabled(true);
        btnBottomMiddle.setEnabled(true);
        btnBottomRight.setEnabled(true);

        msgGameStatus.setText(Blank);

    }

    public void CheckWinner()
    {   //Top Row
        if (btnTopRight.getText().toString().equals(btnTopMiddle.getText().toString())
                && btnTopMiddle.getText().toString().equals(btnTopLeft.getText().toString())
                && btnTopLeft.getText().toString().equals(btnTopRight.getText().toString()))
        {
            msgGameStatus.setText(btnTopRight.getText().toString() + " Wins!");
        }
        //Middle Row
        else if (btnMidRight.getText().toString().equals(btnMiddle.getText().toString())
                && btnMiddle.getText().toString().equals(btnMidLeft.getText().toString())
                && btnMidLeft.getText().toString().equals(btnMidRight.getText().toString()))
        {
            msgGameStatus.setText(btnMidRight.getText().toString() + " Wins!");
        }
        //Bottom Row
        else if (btnBottomRight.getText().toString().equals(btnBottomMiddle.getText().toString())
                && btnBottomMiddle.getText().toString().equals(btnBottomLeft.getText().toString())
                && btnBottomLeft.getText().toString().equals(btnBottomRight.getText().toString()))
        {
            msgGameStatus.setText(btnBottomLeft.getText().toString() + " Wins!");
        }
        //Left Column
        else if (btnTopLeft.getText().toString().equals(btnMidLeft.getText().toString())
                && btnMidLeft.getText().toString().equals(btnBottomLeft.getText().toString())
                && btnBottomLeft.getText().toString().equals(btnTopLeft.getText().toString()))
        {
            msgGameStatus.setText(btnTopLeft.getText().toString() + " Wins!");
        }
        //Middle Column
        else if (btnTopMiddle.getText().toString().equals(btnMiddle.getText().toString())
                && btnMiddle.getText().toString().equals(btnBottomMiddle.getText().toString())
                && btnBottomMiddle.getText().toString().equals(btnTopMiddle.getText().toString()))
        {
            msgGameStatus.setText(btnTopMiddle.getText().toString() + " Wins!");
        }
        //Right Column
        else if (btnTopRight.getText().toString().equals(btnMidRight.getText().toString())
                && btnMidRight.getText().toString().equals(btnBottomRight.getText().toString())
                && btnBottomRight.getText().toString().equals(btnTopRight.getText().toString()))
        {
            msgGameStatus.setText(btnTopRight.getText().toString() + " Wins!");
        }
        //Left Diagonal (from Top)
        else if (btnTopLeft.getText().toString().equals(btnMiddle.getText().toString())
                && btnMiddle.getText().toString().equals(btnBottomRight.getText().toString())
                && btnBottomRight.getText().toString().equals(btnTopLeft.getText().toString()))
        {
            msgGameStatus.setText(btnTopLeft.getText().toString() + " Wins!");
        }
        //Right Diagonal (from Top)
        else if (btnTopRight.getText().toString().equals(btnMiddle.getText().toString())
                && btnMiddle.getText().toString().equals(btnBottomLeft.getText().toString())
                && btnBottomLeft.getText().toString().equals(btnBottomRight.getText().toString()))
        {
            msgGameStatus.setText(btnTopRight.getText().toString() + " Wins!");
        }
        else
        {
            msgGameStatus.setText("Tie!");
        }
    }
}


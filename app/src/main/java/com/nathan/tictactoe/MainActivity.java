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
    Button buttonGrid[][]= new Button[3][3];
    private TextView msgGameStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Top Row
        buttonGrid[0][0] = findViewById(R.id.btnTopLeft);
        buttonGrid[0][1] = findViewById(R.id.btnTopMiddle);
        buttonGrid[0][2] = findViewById(R.id.btnTopRight);
        //Middle Row
        buttonGrid[1][0] = findViewById(R.id.btnMidLeft);
        buttonGrid[1][1] = findViewById(R.id.btnMiddle);
        buttonGrid[1][2] = findViewById(R.id.btnMidRight);
        //Bottom Row
        buttonGrid[2][0] = findViewById(R.id.btnBottomLeft);
        buttonGrid[2][1] = findViewById(R.id.btnBottomMiddle);
        buttonGrid[2][2] = findViewById(R.id.btnBottomRight);
        //New Game
        Button btnNewGame = findViewById(R.id.btnNewGame);
        //Message Box
        msgGameStatus = findViewById(R.id.msgGameStatus);
        //OnClick Listeners
        buttonGrid[0][0].setOnClickListener(this);
        buttonGrid[0][1].setOnClickListener(this);
        buttonGrid[0][2].setOnClickListener(this);
        buttonGrid[1][0].setOnClickListener(this);
        buttonGrid[1][1].setOnClickListener(this);
        buttonGrid[1][2].setOnClickListener(this);
        buttonGrid[2][0].setOnClickListener(this);
        buttonGrid[2][1].setOnClickListener(this);
        buttonGrid[2][2].setOnClickListener(this);
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
                    buttonGrid[0][0].setText(X);
                    isX=false;
                    buttonGrid[0][0].setEnabled(false);
                }
                else
                {
                    buttonGrid[0][0].setText(O);
                    isX=true;
                    buttonGrid[0][0].setEnabled(false);
                }
                break;
            case R.id.btnTopMiddle:
                if (isX)
                {
                    buttonGrid[0][1].setText(X);
                    isX=false;
                    buttonGrid[0][1].setEnabled(false);
                }
                else
                {
                    buttonGrid[0][1].setText(O);
                    isX=true;
                    buttonGrid[0][1].setEnabled(false);
                }
                break;
            case R.id.btnTopRight:
                if (isX)
                {
                    buttonGrid[0][2].setText(X);
                    isX=false;
                    buttonGrid[0][2].setEnabled(false);
                }
                else
                {
                    buttonGrid[0][2].setText(O);
                    isX=true;
                    buttonGrid[0][2].setEnabled(false);
                }
                break;
            case R.id.btnMidLeft:
                if (isX)
                {
                    buttonGrid[1][0].setText(X);
                    isX=false;
                    buttonGrid[1][0].setEnabled(false);
                }
                else
                {
                    buttonGrid[1][0].setText(O);
                    isX=true;
                    buttonGrid[1][0].setEnabled(false);
                }
                break;
            case R.id.btnMiddle:
                if (isX)
                {
                    buttonGrid[1][1].setText(X);
                    isX=false;
                    buttonGrid[1][1].setEnabled(false);
                }
                else
                {
                    buttonGrid[1][1].setText(O);
                    isX=true;
                    buttonGrid[1][1].setEnabled(false);
                }
                break;
            case R.id.btnMidRight:
                if (isX)
                {
                    buttonGrid[1][2].setText(X);
                    isX=false;
                    buttonGrid[1][2].setEnabled(false);
                }
                else
                {
                    buttonGrid[1][2].setText(O);
                    isX=true;
                    buttonGrid[1][2].setEnabled(false);
                }
                break;
            case R.id.btnBottomLeft:
                if (isX)
                {
                    buttonGrid[2][0].setText(X);
                    isX=false;
                    buttonGrid[2][0].setEnabled(false);
                }
                else
                {
                    buttonGrid[2][0].setText(O);
                    isX = true;
                    buttonGrid[2][0].setEnabled(false);
                }
                break;
            case R.id.btnBottomMiddle:
                if (isX)
                {
                    buttonGrid[2][1].setText(X);
                    isX=false;
                    buttonGrid[2][1].setEnabled(false);
                }
                else
                {
                    buttonGrid[2][1].setText(O);
                    isX = true;
                    buttonGrid[2][1].setEnabled(false);
                }
                break;
            case R.id.btnBottomRight:
                if (isX)
                {
                    buttonGrid[2][2].setText(X);
                    isX=false;
                    buttonGrid[2][2].setEnabled(false);
                }
                else
                {
                    buttonGrid[2][2].setText(O);
                    isX = true;
                    buttonGrid[2][2].setEnabled(false);
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
        buttonGrid[0][0].setText(Blank);
        buttonGrid[0][1].setText(Blank);
        buttonGrid[0][2].setText(Blank);
        buttonGrid[0][0].setEnabled(true);
        buttonGrid[0][1].setEnabled(true);
        buttonGrid[0][2].setEnabled(true);
        //Middle Row
        buttonGrid[1][0].setText(Blank);
        buttonGrid[1][1].setText(Blank);
        buttonGrid[1][2].setText(Blank);
        buttonGrid[1][0].setEnabled(true);
        buttonGrid[1][1].setEnabled(true);
        buttonGrid[1][2].setEnabled(true);
        //Bottom Row
        buttonGrid[2][0].setText(Blank);
        buttonGrid[2][1].setText(Blank);
        buttonGrid[2][2].setText(Blank);
        buttonGrid[2][0].setEnabled(true);
        buttonGrid[2][1].setEnabled(true);
        buttonGrid[2][2].setEnabled(true);

        msgGameStatus.setText(Blank);
    }

    public void CheckWinner()
    {   //Top Row
        if (buttonGrid[0][2].getText().toString().equals(buttonGrid[0][1].getText().toString())
                && buttonGrid[0][1].getText().toString().equals(buttonGrid[0][0].getText().toString())
                && buttonGrid[0][0].getText().toString().equals(buttonGrid[0][2].getText().toString()))
        {
            msgGameStatus.setText(buttonGrid[0][2].getText().toString() + " Wins!");
        }
        //Middle Row
        else if (buttonGrid[1][2].getText().toString().equals(buttonGrid[1][1].getText().toString())
                && buttonGrid[1][1].getText().toString().equals(buttonGrid[1][0].getText().toString())
                && buttonGrid[1][0].getText().toString().equals(buttonGrid[1][2].getText().toString()))
        {
            msgGameStatus.setText(buttonGrid[1][2].getText().toString() + " Wins!");
        }
        //Bottom Row
        else if (buttonGrid[2][2].getText().toString().equals(buttonGrid[2][1].getText().toString())
                && buttonGrid[2][1].getText().toString().equals(buttonGrid[2][0].getText().toString())
                && buttonGrid[2][0].getText().toString().equals(buttonGrid[2][2].getText().toString()))
        {
            msgGameStatus.setText(buttonGrid[2][0].getText().toString() + " Wins!");
        }
        //Left Column
        else if (buttonGrid[0][0].getText().toString().equals(buttonGrid[1][0].getText().toString())
                && buttonGrid[1][0].getText().toString().equals(buttonGrid[2][0].getText().toString())
                && buttonGrid[2][0].getText().toString().equals(buttonGrid[0][0].getText().toString()))
        {
            msgGameStatus.setText(buttonGrid[0][0].getText().toString() + " Wins!");
        }
        //Middle Column
        else if (buttonGrid[0][1].getText().toString().equals(buttonGrid[1][1].getText().toString())
                && buttonGrid[1][1].getText().toString().equals(buttonGrid[2][1].getText().toString())
                && buttonGrid[2][1].getText().toString().equals(buttonGrid[0][1].getText().toString()))
        {
            msgGameStatus.setText(buttonGrid[0][1].getText().toString() + " Wins!");
        }
        //Right Column
        else if (buttonGrid[0][2].getText().toString().equals(buttonGrid[1][2].getText().toString())
                && buttonGrid[1][2].getText().toString().equals(buttonGrid[2][2].getText().toString())
                && buttonGrid[2][2].getText().toString().equals(buttonGrid[0][2].getText().toString()))
        {
            msgGameStatus.setText(buttonGrid[0][2].getText().toString() + " Wins!");
        }
        //Left Diagonal (from Top)
        else if (buttonGrid[0][0].getText().toString().equals(buttonGrid[1][1].getText().toString())
                && buttonGrid[1][1].getText().toString().equals(buttonGrid[2][2].getText().toString())
                && buttonGrid[2][2].getText().toString().equals(buttonGrid[0][0].getText().toString()))
        {
            msgGameStatus.setText(buttonGrid[0][0].getText().toString() + " Wins!");
        }
        //Right Diagonal (from Top)
        else if (buttonGrid[0][2].getText().toString().equals(buttonGrid[1][1].getText().toString())
                && buttonGrid[1][1].getText().toString().equals(buttonGrid[2][0].getText().toString())
                && buttonGrid[2][0].getText().toString().equals(buttonGrid[2][2].getText().toString()))
        {
            msgGameStatus.setText(buttonGrid[0][2].getText().toString() + " Wins!");
        }
        else
        {
            msgGameStatus.setText("Tie!");
        }
    }
}


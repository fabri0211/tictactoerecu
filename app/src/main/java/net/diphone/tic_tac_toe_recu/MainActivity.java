package net.diphone.tic_tac_toe_recu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9 ;
    int turn;
    int draw;
    Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        playAgainButton = (Button) findViewById(R.id.playAgainButton);
        turn = 1;
        draw = 1;

        playAgainButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        });

        b1.setOnClickListener(view -> {
            if(b1.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b1.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b1.setText("O");
                }
            }
            endGame();
            draw++;
        });
        b2.setOnClickListener(view -> {
            if(b2.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b2.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b2.setText("O");
                }
            }
            endGame();
            draw++;
        });
        b3.setOnClickListener(view -> {
            if(b3.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b3.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b3.setText("O");
                }
            }
            endGame();
            draw++;
        });
        b4.setOnClickListener(view -> {
            if(b4.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b4.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b4.setText("O");
                }
            }
            endGame();
            draw++;
        });
        b5.setOnClickListener(view -> {
            if(b5.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b5.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b5.setText("O");
                }
            }
            endGame();
            draw++;
        });
        b6.setOnClickListener(view -> {
            if(b6.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b6.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b6.setText("O");
                }
            }
            endGame();
            draw++;
        });
        b7.setOnClickListener(view -> {
            if(b7.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b7.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b7.setText("O");
                }
            }
            endGame();
            draw++;
        });
        b8.setOnClickListener(view -> {
            if(b8.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b8.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b8.setText("O");
                }
            }
            endGame();
            draw++;
        });
        b9.setOnClickListener(view -> {
            if(b9.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b9.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b9.setText("O");
                }
            }
            endGame();
            draw++;
        });
    }

    public void endGame () {
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;
        boolean winnerX = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if(a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winnerX), Toast.LENGTH_LONG).show();
            end = true;
            winnerX = true;
        }
        if(a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winnerX), Toast.LENGTH_LONG).show();
            end = true;
            winnerX = true;
        }
        if(a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winnerX), Toast.LENGTH_LONG).show();
            end = true;
            winnerX = true;
        }
        if(b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winnerX), Toast.LENGTH_LONG).show();
            end = true;
            winnerX = true;
        }
        if(c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winnerX), Toast.LENGTH_LONG).show();
            end = true;
            winnerX = true;
        }
        if(d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winnerX), Toast.LENGTH_LONG).show();
            end = true;
            winnerX = true;
        }
        if(g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winnerX), Toast.LENGTH_LONG).show();
            end = true;
            winnerX = true;
        }
        if(g.equals("X") && e.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winnerX), Toast.LENGTH_LONG).show();
            end = true;
            winnerX = true;
        }


        if(a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winner0), Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winner0), Toast.LENGTH_LONG).show();
            end = true;
        }
        if(a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winner0), Toast.LENGTH_LONG).show();
            end = true;
        }
        if(b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winner0), Toast.LENGTH_LONG).show();
            end = true;
        }
        if(c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winner0), Toast.LENGTH_LONG).show();
            end = true;
        }
        if(d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winner0), Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winner0), Toast.LENGTH_LONG).show();
            end = true;
        }
        if(g.equals("O") && e.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.winner0), Toast.LENGTH_LONG).show();
            end = true;
        }

        if(end) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String currentDateandTime = sdf.format(new Date());

            FirebaseDatabase database = FirebaseDatabase.getInstance("https://examen-db47f-default-rtdb.europe-west1.firebasedatabase.app/");
            DatabaseReference myRef = database.getReference("partidas");

            Map<String, String> map = new HashMap<>();
            map.put(currentDateandTime, winnerX ? "X" : "O");
            myRef.push().setValue(map);

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            playAgainButton.setVisibility(View.VISIBLE);
            finish();
        }

        if (draw == 9 && !end ) {
            Toast.makeText(MainActivity.this, "Draw Game!", Toast.LENGTH_LONG).show();
            playAgainButton.setVisibility(View.VISIBLE);
        }
    }
}
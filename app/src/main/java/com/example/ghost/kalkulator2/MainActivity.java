package com.example.ghost.kalkulator2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnC,btnDel;
    EditText income,outcome;
    TextView result;
    String tempIncome,tempOutcome;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.txtVal);

        income = (EditText)findViewById(R.id.txtIn);
        outcome = (EditText)findViewById(R.id.txtOut);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
                String textIncome = income.getText().toString();
                String textOutcome = outcome.getText().toString();

                if(textIncome.equals("")||textOutcome.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Insert Data Income/Outcome.", Toast.LENGTH_SHORT).show();
                }else{
                    try {
                        int incomeV = Integer.parseInt(textIncome.trim());
                        int outcomeV = Integer.parseInt(textOutcome.trim());
                        int calculate = incomeV - outcomeV;
                        result.setText(Integer.toString(calculate));
                        Toast.makeText(MainActivity.this, "Calculate", Toast.LENGTH_SHORT).show();

                    }catch (NumberFormatException e){

                    }
                }
            }
        });

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btnC = (Button)findViewById(R.id.btnClr);
        btnDel = (Button)findViewById(R.id.btnDel);



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
    public void onClick(View v) {

        tempIncome = income.getText().toString();
        tempOutcome = outcome.getText().toString();
        switch (v.getId()) {
            case R.id.btn1:
                String btnText1 = btn1.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText1);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText1);


                        } else {
                            income.setText(tempIncome + btnText1);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText1);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText1);
                        } else {
                            outcome.setText(tempOutcome + btnText1);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn2:
                String btnText2 = btn2.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText2);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText2);


                        } else {
                            income.setText(tempIncome + btnText2);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText2);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText2);
                        } else {
                            outcome.setText(tempOutcome + btnText2);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn3:
                String btnText3 = btn3.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText3);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText3);


                        } else {
                            income.setText(tempIncome + btnText3);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText3);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText3);
                        } else {
                            outcome.setText(tempOutcome + btnText3);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn4:
                String btnText4 = btn4.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText4);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText4);


                        } else {
                            income.setText(tempIncome + btnText4);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText4);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText4);
                        } else {
                            outcome.setText(tempOutcome + btnText4);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn5:
                String btnText5 = btn5.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText5);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText5);


                        } else {
                            income.setText(tempIncome + btnText5);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText5);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText5);
                        } else {
                            outcome.setText(tempOutcome + btnText5);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn6:
                String btnText6 = btn6.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText6);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText6);


                        } else {
                            income.setText(tempIncome + btnText6);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText6);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText6);
                        } else {
                            outcome.setText(tempOutcome + btnText6);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn7:
                String btnText7 = btn7.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText7);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText7);


                        } else {
                            income.setText(tempIncome + btnText7);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText7);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText7);
                        } else {
                            outcome.setText(tempOutcome + btnText7);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn8:
                String btnText8 = btn8.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText8);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText8);


                        } else {
                            income.setText(tempIncome + btnText8);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText8);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText8);
                        } else {
                            outcome.setText(tempOutcome + btnText8);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn9:
                String btnText9 = btn9.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText9);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText9);


                        } else {
                            income.setText(tempIncome + btnText9);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText9);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText9);
                        } else {
                            outcome.setText(tempOutcome + btnText9);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btn0:
                String btnText0 = btn0.getText().toString();
                if (value == 1) {
                    if (income.getText().toString().equals("")) {
                        income.setText(btnText0);
                    } else {
                        int position = income.getSelectionEnd();

                        if (position != tempIncome.length()) {
                            //untuk insert sesuai posisi cursor
                            income.getText().insert(position, btnText0);


                        } else {
                            income.setText(tempIncome + btnText0);
                        }
                    }
                    income.setSelection(income.getText().length());
                }

                if (value == 2) {
                    if (outcome.getText().toString().equals("")) {
                        outcome.setText(btnText0);
                    } else {
                        int position = outcome.getSelectionEnd();
                        if (position != tempOutcome.length()) {
                            //untuk insert sesuai posisi cursor
                            outcome.getText().insert(position, btnText0);
                        } else {
                            outcome.setText(tempOutcome + btnText0);
                        }
                    }
                    outcome.setSelection(outcome.getText().length());
                }
                break;

            case R.id.btnDel:
                int positionIn = income.getSelectionEnd();
                int positionOut= outcome.getSelectionEnd();

                if(value==1){
                    if(income.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "No Data", Toast.LENGTH_SHORT).show();
                    }else{
                        if (positionIn > 0) {
                            income.getText().delete(positionIn - 1, positionIn);
                        } else {
                            //income.getText().delete(position, position + 1);
                        }
                        //income.setSelection(income.getText().length());
                    }
                }

                if(value==2){
                    if(outcome.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "No Data.", Toast.LENGTH_SHORT).show();
                    }else {
                        if (positionOut > 0) {
                            outcome.getText().delete(positionOut - 1, positionOut);
                        } else {
                            //outcome.getText().delete(position, position + 1);
                        }
                        //outcome.setSelection(outcome.getText().length());
                    }
                }
                break;

            case R.id.btnClr:
                income.setText("");
                outcome.setText("");
                result.setText("0");
                break;
        }

    }
}

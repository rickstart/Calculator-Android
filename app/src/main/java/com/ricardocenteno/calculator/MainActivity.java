package com.ricardocenteno.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtResult;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSum, btnLess, btnMult, btnCE, btnEqual;
    private int oper1, oper2;
    private int action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.txtResult);
        btn1 = findViewById(R.id.txt1);
        btn2 = findViewById(R.id.txt2);
        btn3 = findViewById(R.id.txt3);
        btn4 = findViewById(R.id.txt4);
        btn5 = findViewById(R.id.txt5);
        btn6 = findViewById(R.id.txt6);
        btn7 = findViewById(R.id.txt7);
        btn8 = findViewById(R.id.txt8);
        btn9 = findViewById(R.id.txt9);
        btnSum = findViewById(R.id.txtSum);
        btnLess = findViewById(R.id.txtLess);
        btnMult = findViewById(R.id.txtMult);
        btnCE = findViewById(R.id.txtCE);
        btnEqual = findViewById(R.id.txtEqual);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnLess.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnEqual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String result = "";
        switch (v.getId()){
            case R.id.txt1:
                result = (action==0)?txtResult.getText().toString()+btn1.getText():btn1.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txt2:
                result = (action==0)?txtResult.getText().toString()+btn2.getText():btn2.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txt3:
                result = (action==0)?txtResult.getText().toString()+btn3.getText():btn3.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txt4:
                result = (action==0)?txtResult.getText().toString()+btn4.getText():btn4.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txt5:
                result = (action==0)?txtResult.getText().toString()+btn5.getText():btn5.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txt6:
                result = (action==0)?txtResult.getText().toString()+btn6.getText():btn6.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txt7:
                result = (action==0)?txtResult.getText().toString()+btn7.getText():btn7.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txt8:
                result = (action==0)?txtResult.getText().toString()+btn8.getText():btn8.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txt9:
                result = (action==0)?txtResult.getText().toString()+btn9.getText():btn9.getText().toString();
                txtResult.setText(result);
                break;
            case R.id.txtSum:
                if (oper1==0) {
                    oper1 = Integer.parseInt(txtResult.getText().toString());
                    txtResult.setText("");
                    action = 1;
                }else {
                    oper1 = operation();
                    txtResult.setText(oper1 + "");
                    action = 1;
                }
                break;
            case R.id.txtLess:
                if (oper1==0) {
                    oper1 = Integer.parseInt(txtResult.getText().toString());
                    txtResult.setText("");
                    action = 2;
                }else {
                    oper1 = operation();
                    txtResult.setText(oper1 + "");
                    action = 2;
                }

                break;
            case R.id.txtMult:
                if (oper1==0) {
                    oper1 = Integer.parseInt(txtResult.getText().toString());
                    txtResult.setText("");
                    action = 3;
                }else {
                    oper1 = operation();
                    txtResult.setText(oper1 + "");
                    action = 3;
                }
                break;
            case R.id.txtEqual:
                oper1 = operation();
                txtResult.setText(oper1 + "");
                action =0;
                break;
            case R.id.txtCE:
                oper1 =0;
                action=0;
                txtResult.setText("");
                break;
        }

    }

    public int operation(){
        int a = Integer.parseInt(txtResult.getText().toString());
        int res = 0;
        if (action == 1)
            res = oper1 + a;
        if (action == 2)
            res = oper1 - a;
        if (action == 3)
            res = oper1 * a;
        if (action == 0)
            res = a;
        return res;
    }
}

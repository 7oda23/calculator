package com.example.elshahed.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button num0,num1,num2, num3, num4, num5, num6, num7,num8,num9, plus, minus, by, divide, equal,clear;
    public TextView n1,n2,sign,result,equalv;
    calc c=new calc();
    public int flag;
    public void onclick(final Button b )
    {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    n1.append(b.getText().toString());
                }
                else {
                    n2.append(b.getText().toString());
                }

            }
        });
    }
    public void sonclick(final Button b )
    {
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1.getText().toString()=="")
                {
                    Toast.makeText(MainActivity.this,"please enter the first number first",Toast.LENGTH_SHORT).show();

                }
                sign.setText(b.getText().toString());
                flag=1;
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flag=0;
        num0= findViewById(R.id.num0);
        num1= findViewById(R.id.num1);
        num2= findViewById(R.id.num2);
        num3= findViewById(R.id.num3);
        num4= findViewById(R.id.num4);
        num5= findViewById(R.id.num5);
        num6= findViewById(R.id.num6);
        num7= findViewById(R.id.num7);
        num8= findViewById(R.id.num8);
        num9= findViewById(R.id.num9);
        plus= findViewById(R.id.plus);
        minus= findViewById(R.id.minus);
        by=findViewById(R.id.by);
        divide=findViewById(R.id.divide);
        equal=findViewById(R.id.equal);
        n1 = findViewById(R.id.n1);
        n2= findViewById(R.id.n2);
        sign= findViewById(R.id.sign);
        result=findViewById(R.id.result);
        equalv=findViewById(R.id.equalv);
        clear= findViewById(R.id.clear);
        onclick(num0);
        onclick(num1);
        onclick(num2);
        onclick(num3);
        onclick(num4);
        onclick(num6);
        onclick(num5);
        onclick(num7);
        onclick(num8);
        onclick(num9);
        sonclick(plus);
        sonclick(minus);
        sonclick(divide);
        sonclick(by);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equalv.setText("=");
                if(n2.getText().toString()=="")
                {
                    Toast.makeText(MainActivity.this,"please enter the seconed number",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(sign.getText().toString().equals(plus.getText().toString()))
                    {
                        result.setText(""+c.sum(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()) ));
                    }
                    else if(sign.getText().toString().equals(minus.getText().toString()))
                    {
                        result.setText(""+c.min(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()) ));
                    }
                    else if(sign.getText().toString().equals(by.getText().toString()))
                    {
                        result.setText(""+c.by(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString())) );
                    }
                    else if(sign.getText().toString().equals(divide.getText().toString()))
                    {
                        result.setText(""+c.div(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString())) );
                    }
                }


            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1.setText("");
                n2.setText("");
                sign.setText("");
                equalv.setText("");
                result.setText("");
                flag= 0 ;
            }
        });


    }
}

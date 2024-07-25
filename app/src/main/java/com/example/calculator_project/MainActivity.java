package com.example.calculator_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button clear, moduler, ex, divid, seven, eight, nine, mul, four, five, six, minus, one, two, three, plus, dzero,
            zero, dot, equal;

    TextView display;
    String temp,t,operator;
    int n1,n2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = findViewById(R.id.clear);
        moduler = findViewById(R.id.moduler);
        ex = findViewById(R.id.ex);
        divid = findViewById(R.id.divid);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        mul = findViewById(R.id.mul);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        minus = findViewById(R.id.minus);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        plus = findViewById(R.id.plus);
        dzero = findViewById(R.id.dzero);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        display = findViewById(R.id.display);




        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        dzero.setOnClickListener(this);
        zero.setOnClickListener(this);
        ex.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        equal.setOnClickListener(this);
        mul.setOnClickListener(this);
        moduler.setOnClickListener(this);
        clear.setOnClickListener(this);
        dot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId()==one.getId())
        {
            temp=display.getText().toString();
            t=temp+"1";
            display.setText(""+t);
        }
        if (v.getId()==two.getId())
        {
            temp=display.getText().toString();
            t=temp+"2";
            display.setText(""+t);
        }
        if(v.getId()==three.getId())
        {
            temp=display.getText().toString();
            t=temp+"3";
            display.setText(""+t);
        }
        if(v.getId()==four.getId())
        {
            temp=display.getText().toString();
            t=temp+"4";
            display.setText(""+t);
        }
        if(v.getId()==five.getId())
        {
            temp=display.getText().toString();
            t=temp+"5";
            display.setText(""+t);
        }
        if(v.getId()==six.getId())
        {
            temp=display.getText().toString();
            t=temp+"6";
            display.setText(""+t);
        }
        if(v.getId()==seven.getId())
        {
            temp=display.getText().toString();
            t=temp+"7";
            display.setText(""+t);
        }
        if(v.getId()==eight.getId())
        {
            temp=display.getText().toString();
            t=temp+"8";
            display.setText(""+t);
        }
        if(v.getId()==nine.getId())
        {
            temp=display.getText().toString();
            t=temp+"9";
            display.setText(""+t);
        }
        if(v.getId()==dzero.getId())
        {
            temp=display.getText().toString();
            t=temp+"00";
            display.setText(""+t);
        }
        if(v.getId()==zero.getId())
        {
            temp=display.getText().toString();
            t=temp+"0";
            display.setText(""+t);
       }
        if(v.getId()==dot.getId())

        {
            temp=display.getText().toString();
            t=temp+".";
            display.setText(""+t);
        }
        if(v.getId()==plus.getId())
        {
            n1= Integer.parseInt(display.getText().toString());
            operator="plus";
            display.setText(n1+"");
        }
        if(v.getId()==minus.getId())
        {
            n1= Integer.parseInt(display.getText().toString());
            operator="minus";
            display.setText(n1+"");
        }
        if(v.getId()==mul.getId())

        {
            n1= Integer.parseInt((display.getText().toString()));
            operator="mul";
            display.setText(n1+"");
        }
        if(v.getId()==moduler.getId())
        {
            n1= Integer.parseInt(((display.getText().toString())));
            operator="moduler";
            display.setText(n1+"");
        }
        if(v.getId()==divid.getId())
        {
            n1= Integer.parseInt((display.getText().toString()));
            operator="divid";
            display.setText(n1+"");
        }

        if (v.getId()==clear.getId())
        {
            display.setText("");
        }


        if (v.getId()==equal.getId())
        {
            n2= Integer.parseInt(display.getText().toString());
            if(operator.equals("plus"))
            {
                sum=n1+n2;
            }
            if(operator.equals("minus"))
            {
                sum=n1-n2;
            }
            if(operator.equals("divid"))
            {
                sum=n1/n2;
            }
            if(operator.equals("moduler"))
            {
                sum=n1%n2;
            }
            if(operator.equals("mul"))
            {
                sum=n1*n2;
            }

            display.setText(""+sum);
        }
        if(v.getId()==ex.getId())
        {
            temp=display.getText().toString();
            temp=temp.substring(0,display.getText().toString().length()-1);

            display.setText(temp);
        }
    }
}
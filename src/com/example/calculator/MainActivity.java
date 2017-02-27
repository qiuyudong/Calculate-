package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity  implements OnClickListener{

    //声明一些控件
    Button btn0=null;
    Button btn1=null;
    Button btn2=null;
    Button btn3=null;
    Button btn4=null;
    Button btn5=null;
    Button btn6=null;
    Button btn7=null;
    Button btn8=null;
    Button btn9=null;
    Button btn10=null;
    Button btnBackspace=null;
    Button btnCE=null;
    Button btnC=null;
    Button btnAdd=null;
    Button btnSub=null;
    Button btnMul=null;
    Button btnDiv=null;
    Button btnEqu=null;
    TextView tvResult=null;
    //声明两个参数。接收tvResult前后的值
    double num1=0,num2=0;
    double Result=0;//计算结果
    int op=0;//判断操作数，
    boolean isClickEqu=false;//判断是否按了“=”按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //从布局文件中获取控件，
        btn0=(Button)findViewById(R.id.zero);
        btn1=(Button)findViewById(R.id.one);
        btn2=(Button)findViewById(R.id.two);
        btn3=(Button)findViewById(R.id.three);
        btn4=(Button)findViewById(R.id.four);
        btn5=(Button)findViewById(R.id.five);
        btn6=(Button)findViewById(R.id.six);
        btn7=(Button)findViewById(R.id.seven);
        btn8=(Button)findViewById(R.id.eight);
        btn9=(Button)findViewById(R.id.nine);
        btn10=(Button)findViewById(R.id.point);
        btnBackspace=(Button)findViewById(R.id.backspace);
        btnCE=(Button)findViewById(R.id.ce);
     
        btnEqu=(Button)findViewById(R.id.equal);
        btnAdd=(Button)findViewById(R.id.add);
        btnSub=(Button)findViewById(R.id.subtract);
        btnMul=(Button)findViewById(R.id.multiply);
        btnDiv=(Button)findViewById(R.id.divide);
        tvResult=(TextView)findViewById(R.id.edittext);

        //添加监听\
        btnBackspace.setOnClickListener(this);
        btnCE.setOnClickListener(this);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this); 
        btn10.setOnClickListener(this);

        
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEqu.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        //btnBackspace和CE--------------------
        case R.id.backspace:
            String myStr=tvResult.getText().toString();
            try {
                tvResult.setText(myStr.substring(0, myStr.length()-1));
            } catch (Exception e) {
                tvResult.setText("");
            }

            break;
        case R.id.ce:
            tvResult.setText(null);
            break;

            //btn0--9---------------------------
        case R.id.zero:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString=tvResult.getText().toString();
            myString+="0";
            tvResult.setText(myString);
            break;
        case R.id.one:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString1=tvResult.getText().toString();
            myString1+="1";
            tvResult.setText(myString1);
            break;
        case R.id.two:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString2=tvResult.getText().toString();
            myString2+="2";
            tvResult.setText(myString2);
            break;
        case R.id.three:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString3=tvResult.getText().toString();
            myString3+="3";
            tvResult.setText(myString3);
            break;
        case R.id.four:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString4=tvResult.getText().toString();
            myString4+="4";
            tvResult.setText(myString4);
            break;
        case R.id.five:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString5=tvResult.getText().toString();
            myString5+="5";
            tvResult.setText(myString5);
            break;
        case R.id.six:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString6=tvResult.getText().toString();
            myString6+="6";
            tvResult.setText(myString6);
            break;
        case R.id.seven:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString7=tvResult.getText().toString();
            myString7+="7";
            tvResult.setText(myString7);
            break;
        case R.id.eight:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString8=tvResult.getText().toString();
            myString8+="8";
            tvResult.setText(myString8);
            break;
        case R.id.nine:
            if(isClickEqu)
            {
                tvResult.setText(null);
                isClickEqu=false;
            }
            String myString9=tvResult.getText().toString();
            myString9+="9";
            tvResult.setText(myString9);
            break;
        case R.id.point:
             String myString10=tvResult.getText().toString();
             if(myString10.indexOf(".") != -1) //判断字符串中是否已经包含了小数点，如果有就什么也不做
             {
                 
             } 
             else //如果没有小数点 
             {        
                 if(myString10.equals("0"))//如果开始为0，
                     tvResult.setText(("0" + ".").toString());
                 else if(myString10.equals(""))//如果初时显示为空，就什么也不做
                 {    
                     
                 }
                 else
                     tvResult.setText(myString10 + ".");
             }
             break;
            //btn+-*/=--------------------------------
        case R.id.add:            
            String myStringAdd=tvResult.getText().toString();
            if(myStringAdd.equals(null))
            {
                return;
            }
            num1=Double.valueOf(myStringAdd);
            tvResult.setText(null);
            op=1;
            isClickEqu=false;
            break;

        case R.id.subtract:
            String myStringSub=tvResult.getText().toString();
            if(myStringSub.equals(null))
            {
                return;
            }
            num1=Double.valueOf(myStringSub);
            tvResult.setText(null);
            op=2;
            isClickEqu=false;
            break;
        case R.id.multiply:
            String myStringMul=tvResult.getText().toString();
            if(myStringMul.equals(null))
            {
                return;
            }
            num1=Double.valueOf(myStringMul);
            tvResult.setText(null);
            op=3;
            isClickEqu=false;
            break;
        case R.id.divide:
            String myStringDiv=tvResult.getText().toString();
            if(myStringDiv.equals(null))
            {
                return;
            }
            num1=Double.valueOf(myStringDiv);
            tvResult.setText(null);
            op=4;
            isClickEqu=false;
            break;
        case R.id.equal:
            String myStringEqu=tvResult.getText().toString();
            if(myStringEqu.equals(null))
            {
                return;
            }
            num2=Double.valueOf(myStringEqu);
            tvResult.setText(null);
            switch (op) {
            case 0:
                Result=num2;
                break;
            case 1:
                Result=num1+num2;
                break;
            case 2:
                Result=num1-num2;
                break;
            case 3:
                Result=num1*num2;
                break;
            case 4:
                Result=num1/num2;
                break;
            default:
                Result=0;
                break;
            }
            tvResult.setText(String.valueOf(Result));
            isClickEqu=true;
            break;

        default:
            break;
        }
    } 
}

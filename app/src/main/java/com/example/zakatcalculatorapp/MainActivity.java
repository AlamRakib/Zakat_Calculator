package com.example.zakatcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3;
    Button button;
    TextView textView1,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        button = findViewById(R.id.CalculateButton);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String S1 = editText1.getText().toString();
                Float gold = Float.parseFloat(S1);
                String S2 = editText2.getText().toString();
                Float silver = Float.parseFloat(S2);
                String S3 = editText3.getText().toString();
                Float CashAmount = Float.parseFloat(S3);





                float Total_amount_of_gold = gold;

                textView1.setText(" " +Total_amount_of_gold + "taka" + "\n");


                float Total_amount_of_silver = silver;

                textView1.setText( " "+ Total_amount_of_silver + "taka" + "\n");

                textView1.setText( " " +CashAmount + "\n");



                float Total_Asset = Total_amount_of_gold + Total_amount_of_silver + CashAmount;
                textView1.setText("Total Asset : " + Total_Asset);

                if(Total_Asset>79590){

                    float zakat = (float) (Total_Asset * 0.025);
                    textView2.setText("your zakat is: " + zakat);

                }
                else{
                    textView2.setText("yo will not able to pay zakat");
                }





            }
        });
    }


}
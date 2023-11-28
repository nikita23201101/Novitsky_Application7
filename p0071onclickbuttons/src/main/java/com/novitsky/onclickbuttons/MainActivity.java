package com.novitsky.onclickbuttons;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        //создаем обработчик нажатия
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //меняем текст в TextView (tvOut)
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        //присвоим обработчик кнопки ОК (btnOk)
        btnOk.setOnClickListener(oclBtnOk);
        View.OnClickListener oclbtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //меняем текст в TextView (tvOut)
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        btnCancel.setOnClickListener(oclbtnCancel);
    }
}
package com.example.raddiobutton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 獲取從上一個Activity傳遞過來的數據
        Intent intent = getIntent();
        String output1 = intent.getStringExtra("output1");
        int money = intent.getIntExtra("money", 0);

        // 在相應的TextView中顯示計算結果和其他相關信息
        TextView output = findViewById(R.id.outputTxv);
        output.setText(output1 + " 金額：" + money);

        // 返回按鈕的點擊事件
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 返回到 MainActivity
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

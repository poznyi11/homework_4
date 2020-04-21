package by.ivpo.homework_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goActivityOnlyCl (View view){
        Intent intent = new Intent(this, OnlyCL.class);
        startActivity(intent);
    }

    public void goActivityWithoutCl (View view){
        Intent intent = new Intent(this, WithoutCL.class);
        startActivity(intent);
    }

}

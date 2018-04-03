package com.hangoclong.junit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmail(String email) {
      return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public float divisionTwoNumber(float numberOne, float numberTwo) {
            return numberOne/numberTwo;
    }

}

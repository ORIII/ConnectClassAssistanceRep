package com.aclass.connect.connectclassassistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button mTeacherLogin, mStudentLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mTeacherLogin = findViewById(R.id.teacherLogin);
        mStudentLogin = findViewById(R.id.studentLogin);

        mTeacherLogin.setOnClickListener(this);
        mStudentLogin.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.teacherLogin:
                startActivity(new Intent(this, TeacherLoginActivity.class));
                break;
            case R.id.studentLogin:
                startActivity(new Intent(this, StudentLoginActivity.class));
                break;
        }
    }
}

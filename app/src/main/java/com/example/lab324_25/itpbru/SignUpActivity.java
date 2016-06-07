package com.example.lab324_25.itpbru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText nameEditText, surnameEditText, userEditText, passwordEditText;
    private String nameString, surnameString, userString, passwordString;
    private  static  final String ur1Upload = "http://switfcodingthai.com/pbru2/add_user_master.php"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind widget
        nameEditText = (EditText) findViewById(R.id.editText);
        surnameEditText = (EditText) findViewById(R.id.editText2);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);

    }   // Main method

    public void clickSignUpSign(View view) {
        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Click Space
        if (checkSpace()) {
            //True
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง", "กรุณากรอกให้ครบทุกช่อง");
        } else {
            //False
            uploadValueToServer();
        }


    }   // clickSign

    private void uploadValueToServer() {
    }   // upload

    private boolean checkSpace() {

        boolean result = true;

        result = nameString.equals("") || surnameString.equals("") ||
                userString.equals("") || passwordString.equals("");
        return result;
    }


}   // Main Class



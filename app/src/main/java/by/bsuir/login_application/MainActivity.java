package by.bsuir.login_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String CORRECT_USERNAME = "admin";
    final String CORRECT_PASSWORD = "admin";

    private TextInputEditText etUsername;
    private TextInputEditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_login).setOnClickListener(this);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);

    }

    @Override
    public void onClick(View view) {
        if (isInputDataCorrect()) {
            startActivity(new Intent(this, WelcomeActivity.class));
        } else {
            Toast.makeText(this, "Введенные данные неверны", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isInputDataCorrect() {
        String inputUsername = String.valueOf(etUsername.getText());
        String inputPassword = String.valueOf(etPassword.getText());
        return inputUsername.equals(CORRECT_USERNAME) && inputPassword.equals(CORRECT_PASSWORD);
    }
}

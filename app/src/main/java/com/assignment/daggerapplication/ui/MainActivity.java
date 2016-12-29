package com.assignment.daggerapplication.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.assignment.daggerapplication.DaggerApplication;
import com.assignment.daggerapplication.R;
import com.assignment.daggerapplication.api.NetworkApi;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.assignment.daggerapplication.R.id.password_EditText;

public class MainActivity extends Activity {


    @Inject
    NetworkApi networkApi;
    @BindView(R.id.username_EditText)
    EditText usernameEditText;
    @BindView(password_EditText)
    EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((DaggerApplication) getApplication()).getComponent().inject(this);
        usernameEditText = ButterKnife.findById(MainActivity.this, R.id.username_EditText);
        passwordEditText = ButterKnife.findById(MainActivity.this, password_EditText);

    }

    @OnClick(R.id.btn_submit)
    public void onSubmitClick(View view) {
        NetworkApi networkApi = new NetworkApi();
        if (usernameEditText.getText().toString() != null && passwordEditText.getText().toString() != null)
            if (networkApi.validateUser(usernameEditText.getText().toString(), passwordEditText.getText().toString()))
                showToast(getString(R.string.valid_credentials));
            else
                showToast(getString(R.string.invalid_credentials));
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}

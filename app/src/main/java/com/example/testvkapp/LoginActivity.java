package com.example.testvkapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKScope;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;


public class LoginActivity extends AppCompatActivity {

    private static final String[] scopes = new String[]{
            VKScope.WALL,
            VKScope.VIDEO,
            VKScope.NOHTTPS
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signIn = findViewById(R.id.vk_sign_in_btn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        VKSdk.login(this, scopes);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        VKCallback<VKAccessToken> callback = new VKCallback<VKAccessToken>() {

            @Override
            public void onResult(VKAccessToken res) {
                Intent intent = new Intent(getApplicationContext(), VideoListActivity.class);
                startActivity(intent);
            }

            @Override
            public void onError(VKError error) {

                if(!error.errorMessage.isEmpty()) {
                    new AlertDialog.Builder(getApplicationContext())
                            .setTitle(R.string.authorization_failed)
                            .setMessage(error.errorMessage)
                            .setPositiveButton("OK", null)
                            .show();
                }
            }
        };

        if (!VKSdk.onActivityResult(requestCode, resultCode, data, callback)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}

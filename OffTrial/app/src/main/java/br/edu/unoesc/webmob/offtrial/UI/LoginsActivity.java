package br.edu.unoesc.webmob.offtrial.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;

import java.sql.SQLException;

import br.edu.unoesc.webmob.offtrial.R;
import br.edu.unoesc.webmob.offtrial.helper.DatabaseHelper;
import br.edu.unoesc.webmob.offtrial.model.Usuario;

@EActivity(R.layout.activity_logins)
@Fullscreen
@WindowFeature(Window.FEATURE_NO_TITLE)
public class LoginsActivity extends AppCompatActivity {
    @Bean
    DatabaseHelper dh;


    @ViewById
    EditText EdtLogin;

    @ViewById
    EditText EdtSenha;

    public void login(View v) {
        String strLogin = EdtLogin.getText().toString();
        String strSenha = EdtSenha.getText().toString();


        if (strLogin != null &&
                strSenha != null &&
                !strLogin.trim().isEmpty() &&
                !strSenha.trim().isEmpty()) {

            Usuario u = dh.validaLogin(strLogin, strSenha);


            if (u != null) {
                Intent itPrincipal = new Intent(this, PrincipalActivity.class);
                startActivity(itPrincipal);
            } else {
                Toast.makeText(this, "Usuário e/ou senha inválidos!", Toast.LENGTH_LONG).show();
                EdtLogin.setText("");
                EdtSenha.setText("");
                EdtLogin.requestFocus();
            }
        }
    }

    public void sair(View v) {
        finish();
        System.exit(0);
    }
}

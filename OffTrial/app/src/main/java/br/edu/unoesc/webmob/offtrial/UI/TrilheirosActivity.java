package br.edu.unoesc.webmob.offtrial.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;

import br.edu.unoesc.webmob.offtrial.R;

@EActivity(R.layout.activity_trilheiros)
public class TrilheirosActivity extends AppCompatActivity {
    @ViewById
    EditText EdtNomeTrilheiro;

    @ViewById
    EditText edtIdadeTrilheiro;

    public void Salver(View v) {

    }

    public void Cancelar(View v) {
        finish();
    }
}

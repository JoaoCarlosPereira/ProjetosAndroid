package br.edu.unoesc.webmob.offtrial.UI;

import android.graphics.Color;

import org.androidannotations.annotations.sharedpreferences.DefaultInt;
import org.androidannotations.annotations.sharedpreferences.DefaultString;
import org.androidannotations.annotations.sharedpreferences.SharedPref;

@SharedPref
public interface Configuracao {

    // The field name will have default value "John"
    @DefaultInt(Color.RED)
    int cor();

    @DefaultString("Valor padrão")
    String parametro();
}
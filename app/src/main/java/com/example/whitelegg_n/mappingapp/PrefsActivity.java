package com.example.whitelegg_n.mappingapp;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by whitelegg_n on 12/02/2018.
 */

public class PrefsActivity extends PreferenceActivity{

    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}

package com.example.whitelegg_n.mappingapp;

import android.preference.PreferenceActivity;
import android.os.Bundle;

/**
 * Created by whitelegg_n on 12/02/2018.
 */

public class PreferencesActivity extends PreferenceActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.addPreferencesFromResource(R.xml.preferences);
    }
}

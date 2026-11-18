package com.example.android.notepad;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/** Settings that apply to both the note list and the editor. */
public class SettingsActivity extends PreferenceActivity {
    private static final String KEY_FONT_SIZE = "font_size";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

    /** Returns the font size selected in the settings screen. */
    public static float getFontSize(Context context) {
        String value = PreferenceManager.getDefaultSharedPreferences(context)
                .getString(KEY_FONT_SIZE, "20");
        return Float.parseFloat(value);
    }
}

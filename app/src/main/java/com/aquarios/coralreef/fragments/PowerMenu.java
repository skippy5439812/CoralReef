package com.aquarios.coralreef.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.aquarios.coralreef.R;
import com.aquarios.coralreef.activities.UnicornActivity;

public class PowerMenu extends UnicornActivity {

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.powermenu_title));

        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new PowerMenuFragment()).commit();
    }

    public static class PowerMenuFragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            addPreferencesFromResource(R.xml.powermenu);
        }
    }
}

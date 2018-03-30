package com.example.julien.smartown.Location;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


/**
 * Created by Julien on 17/03/2018 for Smartown
 */

public class LocalisationPreference extends ListPreference {

    public LocalisationPreference(Context context, AttributeSet attrs) {
        //google api key : AIzaSyDGSvF9l6o7yEYXG1l8xLg2pQn5fTWpJag
        super(context, attrs);
    }

    public LocalisationPreference(Context context) {
        super(context);
    }

    @Override
    protected View onCreateDialogView() {
        ListView view = new ListView(getContext());
        view.setAdapter(adapter());
        setEntryValues(entryValues());
        setValueIndex(0);
        return view;
    }

    private ListAdapter adapter() {
        return new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1);
    }

    private CharSequence[] entryValues() {
        return new String[]{""};
    }
}

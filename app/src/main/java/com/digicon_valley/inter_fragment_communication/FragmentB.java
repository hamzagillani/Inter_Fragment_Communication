package com.digicon_valley.inter_fragment_communication;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {
         TextView text;
         String data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_b, container, false);
            if (savedInstanceState==null){



            }else {

                data=savedInstanceState.getString("text");
               TextView text1= v.findViewById(R.id.text_show);
               text1.setText(data);
            }

            return v;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text = getActivity().findViewById(R.id.text_show);
    }

    @Override
    public void onSaveInstanceState( Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);

    }

    public void changeText(String data) {

        this.data=data;
        text.setText(data);
    }
}

package com.digicon_valley.inter_fragment_communication;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment implements View.OnClickListener {
            private Button button;
             int counter=0;
             Communicator comm;
    boolean isClicked = false;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState==null){
            counter=0;
        }else {
          counter=savedInstanceState.getInt("counter",0);
        }
    }

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm=(Communicator) getActivity();
        button=getActivity().findViewById(R.id.btn_count);
        button.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }

    @Override
    public void onClick(View v) {



          /*  if (isClicked) {
                v.setBackgroundColor(Color.BLUE);
                isClicked=false;
            } else v.setBackgroundColor(Color.TRANSPARENT);
                isClicked=true;
*/

            counter++;
            comm.respond("The Button was Clicked " + counter + " Times");




          /*  if (true) {
                v.setBackgroundColor(Color.RED);
            } else if (true) {
                v.setBackgroundColor(Color.YELLOW);
            } else if (true) {
                v.setBackgroundColor(Color.TRANSPARENT);
            } else if (true) {
                v.setBackgroundColor(Color.GREEN);
            } else if (true) {
                v.setBackgroundColor(Color.GRAY);
            } else if (true) {
                v.setBackgroundColor(Color.WHITE);
            }*/
            //else v.setBackgroundColor(Color.MAGENTA);}


/*
        if (true) {
            v.setBackgroundColor(Color.BLUE);

            if else
                v.setBackgroundColor(Color.YELLOW);
            else v.setBackgroundColor(Color.RED);
        }*/


        }
    }

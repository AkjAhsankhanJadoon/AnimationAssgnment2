package com.example.assignment2;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link controls#newInstance} factory method to
 * create an instance of this fragment.
 */
public class controls extends Fragment {

    private Button attack, crouch, run ,jump ,idle;
    private   myListener listener;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public controls() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment controls.
     */
    // TODO: Rename and change types and number of parameters
    public static controls newInstance(String param1, String param2) {
        controls fragment = new controls();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener= (myListener) context;
        }catch (ClassCastException exp)
        {
            throw new ClassCastException(context.toString()+"No InterfaCE");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_controls, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listener.ButtonClicked(0);
        attack = getActivity().findViewById(R.id.attack);
        run = getActivity().findViewById(R.id.run);
        idle = getActivity().findViewById(R.id.idle);
        jump = getActivity().findViewById(R.id.jump);
        crouch = getActivity().findViewById(R.id.crouch);

        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.ButtonClicked(1);
            }
        });
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.ButtonClicked(2);
            }
        });
        crouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.ButtonClicked(3);
            }
        });
        idle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.ButtonClicked(4);
            }
        });
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.ButtonClicked(5);
            }
        });


    }

    public interface myListener{

        public void ButtonClicked(int action);
    }


}
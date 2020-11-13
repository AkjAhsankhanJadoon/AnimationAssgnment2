package com.example.assignment2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link animation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class animation extends Fragment {

    AnimationDrawable attack,run,sit,jump,idle;
    ImageView myimageview;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public animation() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment animation.
     */
    // TODO: Rename and change types and number of parameters
    public static animation newInstance(String param1, String param2) {
        animation fragment = new animation();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animation, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        myimageview= getActivity().findViewById(R.id.myimage);

    }
    public void startAnimation(int action)
    {

        switch (action)
        {
            case 1:
            {
                myimageview.setImageResource(R.drawable.aniattack);
                attack = (AnimationDrawable) myimageview.getDrawable();
                attack.start();
                    break;
            }
            case 2:
            {
                myimageview.setImageResource(R.drawable.anijump);
                jump = (AnimationDrawable) myimageview.getDrawable();
                jump.start();
                break;

            }
            case 3:
            {
                myimageview.setImageResource(R.drawable.anisit);
                sit = (AnimationDrawable) myimageview.getDrawable();
                sit.start();
                break;

            }
            case 4:
            {
                myimageview.setImageResource(R.drawable.aniidle);
                idle = (AnimationDrawable) myimageview.getDrawable();
                idle.start();
                break;
            }
            case 5:
            {
                myimageview.setImageResource(R.drawable.anirun);
                run = (AnimationDrawable) myimageview.getDrawable();
                run.start();
                break;

            }





        }



    }


}
















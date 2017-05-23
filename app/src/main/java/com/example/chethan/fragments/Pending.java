package com.example.chethan.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Chethan on 5/20/2017.
 */

public class Pending extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pending, container, false);
//        ImageButton click = (ImageButton) rootView.findViewById(R.id.check);
//        click.setOnClickListener(new View.OnClickListener() {
//         @Override
//          public void onClick(View view) {
//             Finshed finshed = new Finshed();
//             FragmentManager manager = getFragmentManager();
//             manager.beginTransaction().replace(R.id.recyclerview2,finshed).commit();
//
//         }
//        });

        return rootView;
    }
}

package com.bgoyal.healthmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    GridView gridView;

    public HomeFragment() {
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        gridView = (GridView) view.findViewById(R.id.gridView);

        GridAdapter adapter = new GridAdapter(getContext());
        adapter.addItem("Water",R.drawable.icon_water);
        adapter.addItem("Blood Pressure", R.drawable.icon_blood_pressure);
        adapter.addItem("Glucose Monitor", R.drawable.icon_glucose_monitor);
        adapter.addItem("Medicines", R.drawable.icon_medicine);

        gridView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
        return view;
    }
}

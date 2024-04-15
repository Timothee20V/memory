package com.example.memory.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.memory.databinding.FragmentHeaderBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HeaderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HeaderFragment extends Fragment {


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String IMAGE = String.valueOf(0);
    private static final String TITLE = "param2";
    private static final String DESCRITION = null;

    private int image;
    private String title;
    private String description;

    public HeaderFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param imageID     Parameter 1.
     * @param title       Parameter 2.
     * @param description Parameter 3.
     * @return A new instance of fragment HeaderFragment.
     */
    public static HeaderFragment newInstance(int imageID, String title, String description) {
        HeaderFragment fragment = new HeaderFragment();
    // TODO: Rename and change types and number of parameters
        Bundle args = new Bundle();
        args.putInt(IMAGE, imageID);
        args.putString(TITLE, title);
        args.putString(DESCRITION, description);
        fragment.setArguments(args);
        return fragment;
    }

    public static HeaderFragment newInstance(int imageID, String title) {
        HeaderFragment fragment = new HeaderFragment();
        Bundle args = new Bundle();
        args.putInt(IMAGE, imageID);
        args.putString(TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            image = getArguments().getInt(IMAGE);
            title = getArguments().getString(TITLE);
            description = getArguments().getString(DESCRITION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentHeaderBinding binding = FragmentHeaderBinding.inflate(inflater, container, false);
        binding.titleView.setText(title);
        if(description != "null") {
            binding.descriptionView.setText(description);
        }
        binding.imageView.setImageDrawable(getResources().getDrawable(image));
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}
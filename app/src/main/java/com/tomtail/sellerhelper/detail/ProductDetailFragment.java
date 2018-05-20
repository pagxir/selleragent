package com.tomtail.sellerhelper.detail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tomtail.sellerhelper.R;

public class ProductDetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.customer_detail_content, container, false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }
}

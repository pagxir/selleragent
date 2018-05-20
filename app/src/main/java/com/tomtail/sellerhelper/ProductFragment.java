package com.tomtail.sellerhelper;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class ProductFragment extends Fragment implements IEditable {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.product_content, container, false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onAddNew(Context context) {
    }
}

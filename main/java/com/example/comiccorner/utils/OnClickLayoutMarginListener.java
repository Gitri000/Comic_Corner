package com.example.comiccorner.utils;


import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

interface OnClickLayoutMarginItemListener {
    void onClick(Context context, View v, int position, int spanIndex, RecyclerView.State state);
}

package com.hyphenate.chatuidemo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hyphenate.chatuidemo.R;
import com.hyphenate.easeui.utils.EaseUserUtils;

import java.util.List;

/**
 * Created by apple on 2017/9/5.
 */

public class ChatListAdapter extends BaseQuickAdapter<String,BaseViewHolder> {


    public ChatListAdapter(int layoutResId, List<String> data) {
        super(R.layout.em_grid_owner, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {


    }
}

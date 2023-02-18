package ru.synergy.rvcontentprovaiderwithsql.tablemoc;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import ru.synergy.rvcontentprovaiderwithsql.CursorRecyclerViewAdapter;

public class CostomCursorRecyclerViewAdapter extends CursorRecyclerViewAdapter {

    public CostomCursorRecyclerViewAdapter(Context context, Cursor cursor){
        super(context, cursor);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(mContext).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new CostomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, Cursor cursor) {

        CostomViewHolder holder = (CostomViewHolder) viewHolder;
        cursor.moveToPosition(cursor.getPosition());
        holder.setData(cursor);
    }

    @Override
    public int getItemCount() {
        return super.getItemCount();
    }

    @Override
    public int getItemViewType(int position) {
       return 0;
    }
}

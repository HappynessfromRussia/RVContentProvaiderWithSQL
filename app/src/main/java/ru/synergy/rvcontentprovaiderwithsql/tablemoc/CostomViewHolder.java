package ru.synergy.rvcontentprovaiderwithsql.tablemoc;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import ru.synergy.rvcontentprovaiderwithsql.R;

public class CostomViewHolder extends RecyclerView.ViewHolder {

    public TextView textView1;


    public CostomViewHolder(View itemView) {
        super(itemView);
        textView1 = (TextView) itemView.findViewById(android.R.id.text1);
    }

    @SuppressLint("Range")
    public void setData(Cursor c){
        textView1.setText(c.getString(c.getColumnIndex("text")));
    }

}

package com.example.oranmoshe.lishi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import  android.widget.ListView;

import java.util.List;

/**
 * Created by oranmoshe on 11/12/15.
 */
public class CustomAdapter extends BaseAdapter
{

    LayoutInflater inflater;
    List<ListViewItem> items;

    public CustomAdapter(Activity context, List<ListViewItem> items) {
        super();

        this.items = items;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        ListViewItem item = items.get(position);

        View vi=convertView;

        if(convertView==null)
            vi = inflater.inflate(R.layout.custom_row, null);

        TextView textView = (TextView)vi.findViewById(R.id.textViewName);
        textView.setText(item.GetTaskName());


        return vi;
    }
}

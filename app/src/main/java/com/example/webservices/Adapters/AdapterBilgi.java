package com.example.webservices.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.webservices.Models.Bilgiler;
import com.example.webservices.R;

import java.util.List;

public class AdapterBilgi extends BaseAdapter {

    List<Bilgiler> list;
    Context context;

    public AdapterBilgi(List<Bilgiler> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        TextView txuserid=convertView.findViewById(R.id.userId);
        TextView txid=convertView.findViewById(R.id.id);
        TextView txtitle=convertView.findViewById(R.id.title);
        TextView txbody=convertView.findViewById(R.id.body);

        txuserid.setText(""+list.get(position).getUserId());
        txid.setText(""+list.get(position).getId());
        txtitle.setText(""+list.get(position).getTitle());
        txbody.setText(""+list.get(position).getBody());


         return convertView;
    }
}

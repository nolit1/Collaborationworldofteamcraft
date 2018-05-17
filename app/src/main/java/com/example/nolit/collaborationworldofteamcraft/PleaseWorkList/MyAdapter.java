package com.example.nolit.collaborationworldofteamcraft.PleaseWorkList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.squareup.picasso.Picasso;

import com.example.nolit.collaborationworldofteamcraft.ListItem;
import com.example.nolit.collaborationworldofteamcraft.R;

import java.util.List;

/*Это адаптер, его нужно переписать под наши нужны
* В теории не сильно поменяется, но все же. Сейчас это мой другой код
*
*
* */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> mListItems;
    //private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder{
        // each data item is just a string in this case
        public TextView textViewHead;
        public ImageView imageView;

        //Может тут надо несколько параметров, так как несколько текстовых полей
        public ViewHolder(View itemView) {
            super(itemView);
            textViewHead = itemView.findViewById(R.id.title);
            imageView = itemView.findViewById(R.id.image);
        }
        /**
         * Логин
         * Регистрация
         * Главный список
         * Просмотр записи
         * Создание
         * Успех
         * Личный кабинет (список записей, ответы)
         */
    }

  //   Provide a suitable constructor (depends on the kind of listItems)
    public MyAdapter(List<ListItem> mylistItems) {
        mListItems = mylistItems;
        //this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        final ListItem listItem = mListItems.get(position);
//        holder.textViewHead.setText(listItem.getmTitle());
//        holder.textViewHead.setText(listItem.getmAuthor());
//        holder.textViewHead.setText(listItem.getmCount());
        //Picasso.with(context).load(listItem.getImageUrl()).placeholder(R.drawable.image).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mListItems.size();
    }
}

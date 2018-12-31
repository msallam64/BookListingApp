package com.example.mohamedsallam.booklistingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class BookAdpter extends ArrayAdapter<Book> {

    public BookAdpter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Book currentBook = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.bookTitleTextView);
        title.setText(currentBook.getmBookTitle());

        TextView author = (TextView) listItemView.findViewById(R.id.bookAuthorTextView);
        author.setText(currentBook.getmBookAuthor());

        return listItemView;
    }
}
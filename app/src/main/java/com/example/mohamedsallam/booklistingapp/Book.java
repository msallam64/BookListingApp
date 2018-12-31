package com.example.mohamedsallam.booklistingapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {

    private String mBookTitle;
    private String mBookAuthor;


    protected Book(String booktitle, String bookAuth) {
        mBookTitle = booktitle;
        mBookAuthor = bookAuth;
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getmBookTitle() {
        return mBookTitle;
    }

    public String getmBookAuthor() {
        return mBookAuthor;
    }

    protected Book(Parcel p) {
        mBookAuthor = p.readString();
        mBookTitle = p.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mBookTitle);
        parcel.writeString(mBookAuthor);
    }
}
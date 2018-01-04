package com.zxbin.aidlstudy;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/12/27.
 */

public class Book implements Parcelable {
    private String name;
    private int price;

    protected Book(Parcel in) {
        name = in.readString();
        price = in.readInt();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book() {
    }

    //方便打印数据
    @Override
    public String toString() {
        return "name : " + name + " , price : " + price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(price);
    }
}


<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#6049D0"
    tools:context=".FirstStickerActivity">

    <TextView
        android:id="@+id/priceText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="230dp"
        android:text="@string/price"
        android:textColor="#FFFFFF"
        android:textSize="24dp" />

    <TextView
        android:id="@+id/priceNum"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="250dp"
        android:text="@string/_10"
        android:textColor="#FFFFFF"
        android:textSize="24dp" />

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_below="@id/priceNum"
        android:layout_centerHorizontal="true"
        android:layout_centerVertical="true"
        android:background="@drawable/backgroundforstickers">

    </RelativeLayout>

</RelativeLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
package ru.mephi.java.chapter01.lab02.Extra07;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;


public class Form {

    private final List<NameValuePair> params;

    public static Form form() {
        System.out.println("Change");
        return new Form();
    }

    Form() {
        super();
        this.params = new ArrayList<NameValuePair>();
    }

    public Form add(final String name, final String value) {
        this.params.add(new BasicNameValuePair(name, value));
        return this;
    }

    public List<NameValuePair> build() {
        return new ArrayList<NameValuePair>(this.params);
    }

}



package ru.mephi.java.chapter02.lab06.Extra;

public class Manager {

    private String someManagerField;

    public Manager (String someManagerField){
        this.someManagerField = someManagerField;
    }

    public String getSomeManagerField() {
        return someManagerField;
    }

    public void setSomeManagerField(String someManagerField) {
        this.someManagerField = someManagerField;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "someManagerField='" + someManagerField + '\'' +
                '}';
    }
}

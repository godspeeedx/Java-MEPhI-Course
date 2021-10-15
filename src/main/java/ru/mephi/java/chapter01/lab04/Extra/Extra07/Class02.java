package ru.mephi.java.chapter01.lab04.Extra.Extra07;

public class Class02 {
    private boolean a2;
    public Class01 next;


    public Class02(boolean a2){
        this.a2 = a2;
    }

    public boolean getA2(){
        return this.a2;
    }

    public void setA2(boolean a2){
        this.a2 = a2;
    }

    public Class01 getNext(){
        return this.next;
    }

    public void setNext(Class01 next){
        this.next = next;
    }
}
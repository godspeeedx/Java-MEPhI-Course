package ru.mephi.java.chapter01.lab02.ex03;

// Может ли модифицирующий метод вообще возвращать что-нибудь, кроме типа void?
// Можно ли создать метод доступа с возвращаемым типом void, т.е. ничего фактически не возвращающий?
// Приведите по возможности примеры таких методов.

public class Konfeta {

    private String color;
    private boolean edible;
    private int amount;

    public Konfeta() {
        color = "Green";
        edible = true;
        amount = 1;
    }

    public void setColor(String color) { // Мутатор
        this.color = color;
    }


    public int eat(int amount) { //Мутатор, возвращающий int.
        this.amount -= amount;
        return amount;
    }

    public boolean getEdible() { //Аксессор
        return this.edible;
    }

    public String getColor() { // Аксессор
        return this.color;
    }

    public int getAmount() { // Аксессор
        return this.amount;
    }

    public void setSameColor(Konfeta konf){ //Аксессор, который не изменяет объект и ничего не возвращает.
        konf.setColor(this.getColor());
    }

}


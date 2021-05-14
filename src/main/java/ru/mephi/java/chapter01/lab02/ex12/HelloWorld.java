package ru.mephi.java.chapter01.lab02.ex12;

// Создайте исходный файл HelloWorld. java, где класс HelloWorld объявляется в пакете chOl.secOl.
// Разметите его в каком-нибудь каталоге, но только не в подкаталоге chOl/secOl.
// Выполните из этого каталога команду javac HelloWorld.java. Получите ли вы в итоге файл класса и где именно?
// Затем выполните команду java HelloWorld. Что при этом произойдет и почему? (Подсказка: выполните команду
// javap HelloWorld и проанализируйте полученное предупреждающее сообщение.) И наконец, попробуйте
// выполнить команду javac -d . HelloWorld. java. Почему такой способ лучше?

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}

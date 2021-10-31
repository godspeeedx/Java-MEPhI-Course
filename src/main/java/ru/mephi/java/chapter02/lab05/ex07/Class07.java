package ru.mephi.java.chapter02.lab05.ex07;

public class Class07 {

    public static void main(String[] args) {
        System.out.println("too lazy");
        /*
        Если исключение будет выброшено в основном коде и в методе close(),
        то приоритетнее будет первое исключение,
        а второе исключение будет подавлено,
        но информация о нем сохранится
        (с помощью метода Throwable.addSuppressed(Throwable exception),
        который вызывается неявно Java компилятором (и соотв. getSuppressed))
        Если просто try-catch-finally и закрываем ресурс в finally,
        то изначальное исключение пропадет (будет только, например, NullPointerEx,
        а его причину, например, FileNotFoundEx, программист не узнает)
         */
    }
}

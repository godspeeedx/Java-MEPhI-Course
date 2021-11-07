package ru.mephi.java.chapter02.lab05.Extra.Extra2;

import ru.mephi.java.chapter02.lab05.Extra.Extra2.Choices.Choice;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        RegisteredCommands.init();
        System.out.println("Загружаем из файла или из строки?");
        String choice = in.next();
        Choice ch = null;
        try {
            ch = check(choice);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
        try {
            Objects.requireNonNull(ch).execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static Choice check(String choice) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String what;
        try {
            what = RegisteredCommands.registeredCommands.get(choice);
        } catch (NullPointerException e) {
            throw new NullPointerException("Такой команды нет");
        }
        return (Choice) Class.forName(what).getConstructor().newInstance();
    }
}

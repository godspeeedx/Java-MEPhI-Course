//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.mephi.java.chapter01.lab02.Extra07.FileSystem.Monitor;

import Structure.struct.FileSystem;
import Structure.struct.iCommand;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ActualProgram {
    static MonitorClass monitor = new MonitorClass(new FileSystem("", 0, 0, 0));

    public ActualProgram() {
    }

    public static void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Доброе утро! Вас приветствует группа С18-501!");
        System.out.println("Загружаем систему или создаем новую?");

        while(true) {
            String choice = sc.nextLine();
            if (choice.equals("СОЗДАЕМ")) {
                monitor.createSystem();
                break;
            }

            if (choice.equals("ЗАГРУЖАЕМ")) {
                monitor.downloadSystem();
                break;
            }

            System.out.println("Ничего не понятно! Пожалуйста, соберитесь с мыслями и попробуйте еще раз!");
        }

    }

    private static void tryToSave() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сохранить текущую систему? Все изменения будут потеряны.");

        while(true) {
            String choice = sc.nextLine();
            if (choice.equals("ДА")) {
                monitor.saveSystem();
                break;
            }

            if (choice.equals("НЕТ")) {
                break;
            }

            System.out.println("Пожалуйста, соберитесь и дайте нормальный и связный ответ.");
        }

    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        init();

        while(true) {
            System.out.print("$");
            String command = sc.nextLine();
            iCommand commandObject = monitor.runFunction(command);
            commandObject.execute(monitor.fs);
        }
    }
}

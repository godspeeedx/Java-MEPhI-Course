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
        System.out.println("������ ����! ��� ������������ ������ �18-501!");
        System.out.println("��������� ������� ��� ������� �����?");

        while(true) {
            String choice = sc.nextLine();
            if (choice.equals("�������")) {
                monitor.createSystem();
                break;
            }

            if (choice.equals("���������")) {
                monitor.downloadSystem();
                break;
            }

            System.out.println("������ �� �������! ����������, ���������� � ������� � ���������� ��� ���!");
        }

    }

    private static void tryToSave() {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������� ������� �������? ��� ��������� ����� ��������.");

        while(true) {
            String choice = sc.nextLine();
            if (choice.equals("��")) {
                monitor.saveSystem();
                break;
            }

            if (choice.equals("���")) {
                break;
            }

            System.out.println("����������, ���������� � ����� ���������� � ������� �����.");
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

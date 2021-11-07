package ru.mephi.java.chapter02.lab05.Extra.Extra2;

import ru.mephi.java.chapter02.lab05.Extra.Extra2.Choices.Fiile;
import ru.mephi.java.chapter02.lab05.Extra.Extra2.Choices.Stroka;

import java.util.HashMap;
import java.util.Map;

public class RegisteredCommands {

    public static Map<String, String> registeredCommands = new HashMap<>();
    public static void init() {
        registeredCommands.put("Файл", Fiile.class.getName());
        registeredCommands.put("Строка", Stroka.class.getName());
    }

}

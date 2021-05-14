package ru.mephi.java.chapter01.lab02.Extra07.Monitor;

import Functions.ChangeFileSize;
import Functions.CreateFile;
import Functions.CreateSystem;
import Functions.Defragmentation;
import Functions.DeleteFile;
import Functions.DownloadSystem;
import Functions.Print;
import Functions.PrintInAlphabetOrder;
import Functions.SaveSystem;
import Structure.struct.FileSystem;
import Structure.struct.iCommand;
import Structure.struct.iMonitor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonitorClass implements iMonitor {
   FileSystem fs;
   iCommand actualCommand;
   Map registredCommands = new HashMap();

   MonitorClass(FileSystem fs) {
      this.fs = fs;
   }

   public iCommand runFunction(String commandName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
      this.registredCommands.put("СОЗДАТЬ ФАЙЛ", CreateFile.class.getName());
      String commandClassName = (String)this.registredCommands.get(commandName);
      Constructor constr = Class.forName(commandClassName).getConstructor(iMonitor.class, FileSystem.class);
      iCommand command = (iCommand)constr.newInstance(this, this.fs);
      return command;
   }

   public void changeFileSize() {
      this.actualCommand = new ChangeFileSize(this, this.fs);
      this.actualCommand.execute(this.fs);
   }

   public void createFile() {
      this.actualCommand = new CreateFile(this, this.fs);
      this.actualCommand.execute(this.fs);
   }

   public void createSystem() {
      this.actualCommand = new CreateSystem(this, this.fs);
      this.fs = new FileSystem("", 0, 0, 0);
      this.actualCommand.execute(this.fs);
   }

   public void defragmentation() {
      this.actualCommand = new Defragmentation(this, this.fs);
      this.actualCommand.execute(this.fs);
   }

   public void deleteFile() {
      this.actualCommand = new DeleteFile(this, this.fs);
      this.actualCommand.execute(this.fs);
   }

   public void downloadSystem() {
      this.actualCommand = new DownloadSystem(this, this.fs);
      this.actualCommand.execute(this.fs);
   }

   public void printSystem() {
      this.actualCommand = new Print(this, this.fs);
      this.actualCommand.execute(this.fs);
   }

   public void printSystemInOrder() {
      this.actualCommand = new PrintInAlphabetOrder(this, this.fs);
      this.actualCommand.execute(this.fs);
   }

   public void saveSystem() {
      this.actualCommand = new SaveSystem(this, this.fs);
      this.actualCommand.execute(this.fs);
   }

   public void help() {
   }

   public void info() {
   }

   public void writeMessage(String userMessage) {
      System.out.println(userMessage);
   }

   public String readString(String userMessage) {
      Scanner sc = new Scanner(System.in);
      System.out.println(userMessage);
      String str = sc.nextLine();
      return str;
   }

   public int readFileSize(String userMessage) {
      Scanner in = new Scanner(System.in);
      System.out.println(userMessage);
      boolean check = true;
      int fileLength = 0;

      while(true) {
         while(check) {
            fileLength = in.nextInt();
            if (fileLength >= 0 && fileLength <= FileSystem.systemSize) {
               check = false;
            } else {
               System.out.println("Длина файла некорректна");
               System.out.println("Введите новую длину файла");
            }
         }

         return fileLength;
      }
   }

   public int readSystemSize(String userMessage) {
      Scanner sc = new Scanner(System.in);
      System.out.println(userMessage);
      int num = sc.nextInt();
      return num;
   }

   public int readMaxSegmentNum(String userMessage) {
      Scanner sc = new Scanner(System.in);
      System.out.println(userMessage);
      int num = sc.nextInt();
      return num;
   }

   public int readMaxDataNum(String userMessage) {
      Scanner sc = new Scanner(System.in);
      System.out.println(userMessage);
      int num = sc.nextInt();
      return num;
   }
}

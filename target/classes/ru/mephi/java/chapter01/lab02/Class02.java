package ru.mephi.java.chapter01.lab02.ex02;

import java.util.Random;
import java.util.Scanner;

public class Class02 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int i = in.nextInt();
      System.out.println(i);
      System.out.println("in.nextInt СЏРІР»СЏРµС‚СЃСЏ РјРµС‚РѕРґРѕРј-Р°РєСЃРµСЃСЃРѕСЂРѕРј, С‚Р°Рє РєР°Рє РЅРµ РёР·РјРµРЅСЏРµС‚ РѕР±СЉРµРєС‚, РґР»СЏ РєРѕС‚РѕСЂРѕРіРѕ РѕРЅ РІС‹Р·С‹РІР°РµС‚СЃСЏ. Рђ РІРѕР·РІСЂР°С‰Р°РµС‚ РёРЅС‚РѕРІС‹Р№ \"С‚РѕРєРµРЅ\" Рё РїСЂРёСЃРІР°РёРІР°РµС‚ РµРіРѕ Р·РЅР°С‡РµРЅРёРµ РїРµСЂРµРјРµРЅРЅРѕР№");
      Random generator = new Random();
      int j = generator.nextInt(i);
      System.out.println(j);
      System.out.println("generator.nextInt СЏРІР»СЏРµС‚СЃСЏ РјРµС‚РѕРґРѕРј-РјСѓС‚Р°С‚РѕСЂРѕРј, С‚Р°Рє РєР°Рє РёР·РјРµРЅСЏРµС‚ РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚СЊ Р“РЎР§, СѓР±РёСЂР°СЏ РёР· РЅРµРµ С‡РёСЃР»Рѕ, РєРѕС‚РѕСЂРѕРµ СЃС‡РёС‚Р°Р» (???)");
   }
}

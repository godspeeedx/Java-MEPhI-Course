package ru.mephi.java.chapter01.lab01.ex12;

// В состав комплекта разработки Java Development Kit входит архивный файл src. zip с исходным кодом библиотеки Java.
// Разархивируйте этот файл и с помощью избранного вами инструментального средства для поиска текста найдите в этом
// исходном коде примеры применения последовательностей операторов break и continue с меткой. Выберите один из этих
// примеров и перепишите его без оператора с меткой.


public class Class12 {
    public static void main(String[] args) {
        System.out.println("Смотрим на классы!");
    }

    private int match(byte[] src, byte[] b, byte[] lastOcc, byte[] optoSft) {
        int len = src.length;
        int last = b.length - len;
        int i = 0;
        next:
        while (i <= last) {
            for (int j = (len - 1); j >= 0; j--) {
                byte c = b[i + j];
                if (c >= ' ' && c <= 'z') {
                    if (c >= 'a') c -= 32;
                    if (c != src[j]) {
                        int badShift = lastOcc[c - 32];
                        i += Math.max(j + 1 - badShift, optoSft[j]);
                        continue next;
                    }
                } else {
                    i += len;
                    continue next;
                }
            }
            return i;
        }
        return -1;
    }

    private int matchImproved(byte[] src, byte[] b, byte[] lastOcc, byte[] optoSft) {
        int len = src.length;
        int last = b.length - len;
        int i = 0;
        while (i <= last) {
            boolean flag = false;
            for (int j = (len - 1); j >= 0; j--) {
                byte c = b[i + j];
                if (c >= ' ' && c <= 'z') {
                    if (c >= 'a') c -= 32;
                    if (c != src[j]) {
                        int badShift = lastOcc[c - 32];
                        i += Math.max(j + 1 - badShift, optoSft[j]);
                        flag = true;
                        break;
                    }
                } else {

                    i += len;
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            return i;
        }
        return -1;
    }

}

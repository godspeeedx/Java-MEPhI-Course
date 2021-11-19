package ru.mephi.java.chapter02.lab05.Extra.Extra3;

public class Class3 {

    public static int checkPassword1(String password) {
        char[] chArray = password.toCharArray();

        if (password.equals("")) {
            return -1;
        }

        if (chArray.length < 4) {
            return -2;
        }

        if (chArray.length > 8) {
            return -3;
        }
        return 1;
    }

    public static String checkPassword2(String password) throws MyException {
        char[] chArray = password.toCharArray();

        if (password.equals("")) {
            throw new MyException("������ �� ����� ���� ������ �������");
        }

        if (chArray.length < 4) {
            throw new MyException("������ ������ ��������� ������ 4-� ��������");
        }

        if (chArray.length > 8) {
            throw new MyException("������ ������ ��������� �� ������ 8-�� ��������");
        }
        return password;
    }

    public static void main(String[] args) throws MyException {
        String pw1 = "what";
        //-------------------------------------------------
        System.out.println("---Error Code---");
        int res = checkPassword1(pw1);
        if (res == -1){
            System.out.println("������ �� ����� ���� ������ �������");
        } else {
            if (res == -2){
                System.out.println("������ ������ ��������� ������ 4-� ��������");
            } else {
                if (res == -3){
                    System.out.println("������ ������ ��������� �� ������ 8-�� ��������");
                } else {
                    System.out.println("������ ������");
                }
            }
        }
        System.out.println("----------------");
        //-------------------------------------------------------------------------------------------
        System.out.println("---Exceptions---");
        System.out.println("������ " + checkPassword2(pw1) + " ������");
        System.out.println("----------------");
    }
}

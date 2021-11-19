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
            throw new MyException("Пароль не может быть пустой строкой");
        }

        if (chArray.length < 4) {
            throw new MyException("Пароль должен содержать больше 4-х символов");
        }

        if (chArray.length > 8) {
            throw new MyException("Пароль должен содержать не больше 8-ми символов");
        }
        return password;
    }

    public static void main(String[] args) throws MyException {
        String pw1 = "what";
        //-------------------------------------------------
        System.out.println("---Error Code---");
        int res = checkPassword1(pw1);
        if (res == -1){
            System.out.println("Пароль не может быть пустой строкой");
        } else {
            if (res == -2){
                System.out.println("Пароль должен содержать больше 4-х символов");
            } else {
                if (res == -3){
                    System.out.println("Пароль должен содержать не больше 8-ми символов");
                } else {
                    System.out.println("Пароль принят");
                }
            }
        }
        System.out.println("----------------");
        //-------------------------------------------------------------------------------------------
        System.out.println("---Exceptions---");
        System.out.println("Пароль " + checkPassword2(pw1) + " принят");
        System.out.println("----------------");
    }
}

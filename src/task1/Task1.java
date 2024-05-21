package task1;

import java.util.Scanner;

public class Task11 {
    //11.Пусть пользователь вводит поля класса FileInformation, но в одну строку; формат придумайте сами.
    // Считайте ввод пользователя и из него создайте экземпляр класса.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String name = arr[0];
        String massage = arr[1];
        FileInformation fileInformation = new FileInformation(name,massage);
        builder.insert(0,"Экземпля класса FileInformation создан:\n");
        builder.append(fileInformation);
        String str1 = builder.toString();
        System.out.println(str1);

    }
}
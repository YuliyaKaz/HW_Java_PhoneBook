package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        UserCommand ucomm = new UserCommand();
        boolean running = true;
        while (running == true) {
            book.add(ucomm.askName(), ucomm.askPhoneNumber());
            running = isRunningAvailable(ucomm);
        }
        book.read();
    }

    private static boolean isRunningAvailable(UserCommand ucomm) {
        return !ucomm.askCommand().toLowerCase().equals("quit");
    }
}
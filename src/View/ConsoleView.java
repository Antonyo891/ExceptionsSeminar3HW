package View;

import java.util.Scanner;

import Interface.View;

public class ConsoleView implements View {
    private Scanner console;
    private String request;


    public ConsoleView(String request) {
        this.console = new Scanner(System.in);
        this.request = request;
    }

    @Override
    public String Get() {
        System.out.print(request);
        return console.nextLine();

    }

    @Override
    public void Set(String request) {
        this.request = request;
    }

    
}

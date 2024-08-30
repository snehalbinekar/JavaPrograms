package ex_Conditions;

import java.util.Scanner;

public class Lab048_WebBrowser {
    public static void main(String[] args){
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the browser name!, where you want to execute the program");
        String BrowserName = sc.next();
        BrowserName = BrowserName.toLowerCase();

        switch(BrowserName){
            case "chrome":
                System.out.println("Starting the ChromeBrowser");
                break;
            case "firefox":
                System.out.println("Starting the Firefox");
                break;
            case "edge":
                System.out.println("Starting the Edge");
                break;
            default:
                System.out.println("No idea which browser is this");
                break;

        }

    }
}

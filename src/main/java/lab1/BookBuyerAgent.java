package lab1;

import jade.core.Agent;

// "C:\Program Files\Java\jdk-9.0.1\bin\javac.exe" -cp jade.jar lab1.BookBuyerAgent.java
// java -cp jade.jar jade.Boot -gui Peter:examples.hello.HelloWorldAgent

// -gui -gui bb:examples.bookTrading.lab1.BookBuyerAgent(f.m.dostoyevsky_-_crime_and_punishment)
public class  BookBuyerAgent extends Agent {

    protected void setup() {
        // Printout a welcome message
        System.out.println("Hello! Buyer-agent" + getAID().getName() + " is ready.");
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

}
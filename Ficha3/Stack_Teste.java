package Teste;

public class Stack_Teste {

    public static void main (String [] args){
        Stack s;
        s = new Stack();

        System.out.println("empty?" + s.empty());

        s.push("first");
        s.push("snd");
        s.push("rd");

        System.out.println("Top: " + s.top());
        System.out.println(s.toString());
    }



}

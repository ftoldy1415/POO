package Teste;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<String> st;

    public Stack(){
        this.st = new ArrayList<String>();
    }

    public Stack (List<String> st){
        this.st = new ArrayList<>();
        for (String s : st)
            this.st.add(s);
    }

    public boolean empty()
    { return this.st.isEmpty(); }

    public int stackSize()
    { return this.st.size(); }

    public void push(String s){
        this.st.add(s);
    }

    public String top(){
        return this.st.get(this.st.size()-1);
    }

    public void pop(){
        this.st.remove(this.st.size()-1);
    }

    public String toString() {
        String sr = "Stack : \n";
        for (String s : this.st)
            sr += s + "\n";
        return sr;
    }

}

package org.example;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // testing
        String ops1 = main.mathFunction(1,2,3);
        System.out.println(ops1);

        String ops2 = main.mathFunction(2,2,4);
        System.out.println(ops2);

        String ops3 = main.mathFunction(3,-3,-9);
        System.out.println(ops3);

        String ops4 = main.mathFunction(1,2,-1);
        System.out.println(ops4);

        String ops5 = main.mathFunction(3,3,1);
        System.out.println(ops5);

        String ops6 = main.mathFunction(7,1,11);
        System.out.println(ops6);

    }

    public String mathFunction( int Number1, int Number2, int Number3){
        StringBuilder output = new StringBuilder();
        if(Number1 + Number2 == Number3){
            output.append("+");
        }
        if(Number1 - Number2 == Number3){
            output.append("-");
        }
        if(Number1 * Number2 == Number3){
            output.append("*");
        }
        if(Number1 / Number2 == Number3){
            output.append("/");
        }
        if(output.isEmpty()){
            return "None";
        }
        return output.toString();
    }
}
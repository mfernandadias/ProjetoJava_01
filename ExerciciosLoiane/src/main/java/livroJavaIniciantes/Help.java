package livroJavaIniciantes;

public class Help {
    public static void main(String[] args)
    throws java.io.IOException{
        char choice;

        System.out.println("Help on: ");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("Choose one: ");
        choice = (char) System.in.read();

        switch(choice){
            case '1':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement: ");
                System.out.println("else statement; ");
                break;
            case '2':
                System.out.println("The if: \n");
                System.out.println("switch (expression)  ");
                System.out.println("else statement; ");
                break;
            default:
                System.out.println("Selection not found");

        }

    }

}

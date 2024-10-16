package livroJavaIniciantes.operadoresBitwire;

public class UpCase {
    public static void main(String[] args){
        char ch;

        for(int i = 0; i < 10; i++){
            ch = (char) ('a' +  i);
            System.out.println(ch);

            //essa instrução desativa o 6ª bit
            ch = (char)((int) ch & 65503); //agora ch é maiuscula

            System.out.print(ch + " ");
        }
    }
}

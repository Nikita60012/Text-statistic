import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        textCounter();
    }

    public static void textCounter(){
        String symbol;
        int spase = 0;
        int allCount = 0;
        String[] words;
        try(FileReader fr = new FileReader("Text.txt")) {
            String text = "";
            int c;

            while((c = fr.read()) != -1){
                System.out.print((char)c);
                text += (char)c;
                symbol = String.valueOf((char)c);
                allCount++;
                if (symbol.matches("\\s")){
                    spase++;
                }
            }

            words = text.split("\\s|!\\s|,\\s|\\?\\s|\\.\\s");

            System.out.println();
            System.out.println("Количество символов: " + allCount);
            System.out.println("Количество символов без пробелов: " + (allCount-spase));
            System.out.println("Количество слов: " + (words.length));
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
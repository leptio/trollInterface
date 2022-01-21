import org.fusesource.jansi.AnsiConsole;
import java.awt.*;
import java.util.Random;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Main {
    public Main(){
    }
    public static void flush(int num, int cap) throws InterruptedException {
        Random r = new Random();
        System.out.println( ansi().eraseScreen().fg(GREEN).a("Xcrlx encryption program: CLI autocall edition;").reset());
        System.out.print("System encrypting... "+ "|");
        for(int i=0; i<num;i++){
            System.out.print("=");
        }
        for(int i=cap;i>num;i--){
            System.out.print("-");
        }
        System.out.print("|");
        Thread.sleep(r.nextInt(650) + r.nextInt(500) + r.nextInt(300));
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) throws InterruptedException, AWTException {
	// write your code here
        Random r = new Random();
        AnsiConsole.systemInstall();
        Robot robot = new Robot();
        for(int i = 0;i<=65;i++){
            robot.mouseMove(r.nextInt(1920), r.nextInt(1080));
            flush(i,65);
        }


        System.out.println("Success! Encrypted " + r.nextInt(1000000) + " files. " + r.nextInt(100) +"% disk success on C:/, " + r.nextInt(100)+"% spread.");
        Thread.sleep(100000);
    }
}

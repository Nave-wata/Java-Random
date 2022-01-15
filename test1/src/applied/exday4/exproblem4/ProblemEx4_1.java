package applied.exday4.exproblem4;

public class ProblemEx4_1 {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone();

        funcPhone(cp);
        funcMailer(cp);
        funcComputer(cp);
    }

    // 電話としての処理
    public static void funcPhone(IPhone phone) {
        phone.callPhone();
        phone.recievePhone();
    }

    // メーラーとしての処理
    public static void funcMailer(IMailer mailer) {
        mailer.sendMail();
        mailer.recieveMail();
    }

    // コンピュータとしての処理
    public static void funcComputer(IComputer computer) {
        computer.playGame();
        computer.borwseWeb();
    }
}

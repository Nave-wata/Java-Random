package applied.exday4.exsample4;

public class CellPhone implements IPhone, IEmail {
    private String mailAddress, number;

    public CellPhone(String mailAddress, String number) {
        this.mailAddress = mailAddress;
        this.number = number;
    }

    public void sendMail(String address) {
        System.out.println(address + " に " + this.mailAddress + " からメールをｄします");
    }

    public void call(String number) {
        System.out.println(number + " に " + this.number + " から電話をかけます");
    }
}

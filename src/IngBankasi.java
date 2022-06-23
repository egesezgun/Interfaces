package src;

public class IngBankasi implements IBanka, IDeneme {
    private String bankName;
    private String terminalId;
    private String password;

    public IngBankasi(String bankName, String terminalId, String password){
        this.bankName=bankName;
        this.terminalId=terminalId;
        this.password=password;
    }
    @Override
    public boolean connect(String ipAddress){
        System.out.println(" Kullanıcı Ip : " + ipAddress);
        System.out.println("Makina Ip: " + this.hostIpAddress);
        return true;
    }
    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc){
        System.out.println("Bankadan cevap bekleniyor ");
        System.out.println(" İşlem başarılı oldu ");
        return true;
    }
    public String getBankName(){
        return bankName;
    }
    public void setBankName(String bankName){
        this.bankName=bankName;
    }
    public String getTerminalId(){
        return terminalId;
    }
    public void setTerminalId(String terminalId){
        this.terminalId=terminalId;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}

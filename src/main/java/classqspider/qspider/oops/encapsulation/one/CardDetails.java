package classqspider.qspider.oops.encapsulation.one;

import java.time.LocalDate;

public class CardDetails {
    private String name;
    private String bankname;
    private LocalDate date;
    private String cType;
    private int pin;
    private long num;
    private int cvv;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}

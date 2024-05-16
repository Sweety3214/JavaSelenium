package classqspider.qspider.oops.encapsulation;

public class Phone {
    private String pw;
    private String gallery;
    private String wChat;

    public Phone(String pw) {
        this.pw = pw;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getwChat() {
        return wChat;
    }

    public void setwChat(String wChat) {
        this.wChat = wChat;
    }


}

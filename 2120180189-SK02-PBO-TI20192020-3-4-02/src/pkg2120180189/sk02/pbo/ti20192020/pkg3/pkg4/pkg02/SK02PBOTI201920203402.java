package pkg2120180189.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;
public class SK02PBOTI201920203402 {
    public static void main(String[] args) {
        Aplikasi Whatsapp = new Aplikasi();
        Whatsapp.chat=100;        
        Whatsapp.videoCall=10;        
        Whatsapp.telefon=25;        
        System.out.println(Whatsapp.nama);
        System.out.println("Chat anda sekarang "+Whatsapp.chat);
        System.out.println("Anda tidak menjawab "+Whatsapp.telefon);
        System.out.println("Video call dari pacar anda "+Whatsapp.videoCall);
        Whatsapp.megirimGambar();
        Whatsapp.mengirimPesan(4, 2);
        Whatsapp.mengirimVideo(300);
        Whatsapp.grup(250);
    }
    
}

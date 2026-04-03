package Multiliple_Inheritanche;


class Camera{
    public void click_pics(){
        System.out.println("Clicking photos....");
    }
}

class MusicPlayer{
    public void playMusic(){
        System.out.println("Music playing..........");
    }
    public void powerOn(){
        System.out.println("Music Player power on");
    }
}
class Phone{
    public void call(){
        System.out.println("Phone is calling");
    }
}
class Smartphone extends Camera,musicPlayer,phone {
    // java does not support multiple inheritance
    // why ??
}
public class Test5{

    public static  void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.click_pics();
        smartphone.playMusic();
    }
}



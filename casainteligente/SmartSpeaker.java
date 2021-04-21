package casainteligente;


public class SmartSpeaker extends SmartDevice{
    private String channel;
    private int volume;
    public static final int MAX = 20;
    public static final int MIN = 0;


    public void volumeUp(){
        if(this.volume < MAX) this.volume++;
    }

    public void volumeDown(){
        if(this.volume > MIN) this.volume--;

    }

    //CONSTRUTORES
    public SmartSpeaker() {
        super();
        this.channel = "";
        this.volume = MIN;
    }

    public SmartSpeaker(String id) {
        super(id);
    }

    public SmartSpeaker(String id, String canal, int volume){
        super(id);
        this.channel = canal;
        if(volume > 20) this.volume = MAX;
        else if(volume < 0 ) this.volume = MIN;
        else this.volume = volume;
    }



    //GETTERS
    public String getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }


    //SETTERS

    public void setChannel(String canal) {
        this.channel = canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
package casainteligente;

public class SmartBulb extends SmartDevice{
    public static final int WARM = 2;
    public static final int NEUTRAL = 1;
    public static final int COLD = 0;
    private int tone;

    public SmartBulb(){
        super();
        this.tone = NEUTRAL;
    }

    public SmartBulb(String id, int tone) {
        super(id);
        this.tone = tone;
    }

    public SmartBulb(String id){
        super(id);
        this.tone = SmartBulb.NEUTRAL;
    }

    public int getTone() {
        return tone;
    }

    public void setTone(int tone) {
        if (tone >= 2) this.tone = WARM;
        else if (tone < 0) this.tone = COLD;
        else this.tone = tone;
    }
}

package casainteligente;

public class SmartBulb extends SmartDevice{
    public static final int WARM = 2;
    public static final int NEUTRAL = 0;
    public static final int COLD = 1;
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
        if (tone > 0) this.tone = WARM;
        if (tone < 0) this.tone = COLD;
        else this.tone = NEUTRAL;
    }
}

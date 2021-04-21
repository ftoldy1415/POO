package casainteligente;

public class SmartDevice {
    private String id;
    private boolean estado;

    public SmartDevice(){
        this.id = "";
        this.estado = true;
    }
    public SmartDevice(String id, boolean estado) {
        this.id = id;
        this.estado = estado;
    }
    public SmartDevice(String id){
        this.id = id;
        this.estado = true;
    }

    public  String getID() {
        return this.id;
    }

    public boolean getOn() {
        return this.estado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOn(boolean estado) {
        this.estado = estado;
    }

    public SmartDevice clone (SmartDevice a){
        SmartDevice result = new SmartDevice();
        result.id= a.id;
        result.estado = a.estado;
    }
}

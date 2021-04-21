package casainteligente;

public class SmartDevice {
    private String id;
    private boolean estado;

    public SmartDevice(){
        this.id = "";
        this.estado = false;
    }
    public SmartDevice(String id, boolean estado) {
        this.id = id;
        this.estado = estado;
    }
    public SmartDevice(String id){
        this.id = id;
        this.estado = false;
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

    public SmartDevice clone (){
        SmartDevice result = new SmartDevice();
        result.id= this.id;
        result.estado = this.estado;
        return result;
    }
}

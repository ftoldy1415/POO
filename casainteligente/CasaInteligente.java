package casainteligente;

import java.util.ArrayList;
import java.util.HashMap;

public class CasaInteligente {
    private String name;
    private ArrayList<SmartDevice> devices;
    private HashMap<String, ArrayList<String>> map;


    public CasaInteligente() {
        this.name = "";
        this.devices = new ArrayList<>();
        this.map = new HashMap<String, ArrayList<String>>();

    }

    public CasaInteligente(String name) {
        this.name = name;
        this.map = new HashMap<String, ArrayList<String>>();

    }


    public boolean existsDevice(String id){
        this.devices.stream().anyMatch(d -> d.getID().equals(id));
    }

    public void getDevice(String name){
        this.devices.stream().colle;
    }

    public void addDevice(SmartDevice a){
        this.devices.add(a);
    }

    public void addRoom(String name){
        this.map.putIfAbsent(name, new ArrayList<String>());
    }

    public void addToRoom(String room, String id){
        this.map.putIfAbsent(room, new ArrayList<String>());
    }

    public boolean hasRoom(String name){
        return this.map.containsKey(name);
    }

    public boolean roomHasDevice(String sala, String id){
        return this.map.values().contains(id);
    }

    public void setAllOn(boolean a){
        this.devices.stream().getDevice().setOn(true);
    }
}

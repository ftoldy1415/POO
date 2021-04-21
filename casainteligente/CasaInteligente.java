package casainteligente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
        this.devices = new ArrayList<>();
        this.map = new HashMap<String, ArrayList<String>>();


    }

    public boolean existsDevice(String id){
        return this.devices.stream().anyMatch(d -> d.getID().equals(id));
    }

    public SmartDevice getDevice(String id){
        /*
        for (SmartDevice s : this.devices)
            if (s.getID().equals(id)) return s.clone();
        return null;
         */
        Iterator<SmartDevice> sd = this.devices.iterator();
        SmartDevice a;
        while(sd.hasNext()){
            a = sd.next();
            if(a.getID().equals(id)) return a;
        }
        return null;
    }

    public void addDevice(SmartDevice a){
        this.devices.add(a);
    }

    public void addRoom(String name){
        this.map.putIfAbsent(name, new ArrayList<String>());
    }

    public void addToRoom(String room, String id){
        ArrayList<String> salaAtual = this.map.get(room);
        salaAtual.add(id);
        this.map.putIfAbsent(room, salaAtual);
    }

    public boolean hasRoom(String name){
        return this.map.containsKey(name);
    }

    public boolean roomHasDevice(String sala, String id){
        ArrayList<String> salaDevices = this.map.get(sala);
        return salaDevices.contains(id);
    }
/*
    versao 2
    public void setAllOn(boolean value){
        for (SmartDevice s : this.devices) s.setOn(value);
    }
 */
    public void setAllOn(boolean value){
        Iterator<SmartDevice> sd = this.devices.iterator();
        SmartDevice a;

        while(sd.hasNext()){
            a = sd.next();
            a.setOn(value);
        }
    }
}

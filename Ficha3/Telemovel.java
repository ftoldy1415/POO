package Teste;

public class Telemovel {

    private String Marca;
    private String Modelo;
    private double resolX;
    private double resolY;
    private int storageText;
    private String[] texts;
    private int storagePics;
    private int storageApps;
    private int storageTotal = storagePics + storageApps;
    private byte ocupado;
    private int apps;
    private int pics;
    private String[] names;


    //METODOS

    //a)

    public boolean existeEspaco(int numeroBytes){
        int storageFinal = this.ocupado + numeroBytes;
        int storage = this.storageText + this.storageTotal;
        boolean result = (storageFinal < storage);
        return result;
    }

    //b)
    public void instalaApp(String nome, int tamanho) {
        int i = 0;
        if (existeEspaco(tamanho)){
            for (; i<this.names.length && this.names[i] != "" ;i++);
            this.names[i++] = nome;
            this.ocupado += tamanho;
        }
    }

    //c)
    public void recebeMsg(String msg){
        int i = 0;
        for (;i<this.texts.length && this.texts[i] != "";i++);
        if (i < this.texts.length){
            this.texts[i] = msg;
            this.ocupado += (byte)msg.length();
        }
    }

    //d)
    public double tamMedioApps(){
        int napps = getApps();
        int armazenamento = getStorageApps();
        return (napps/armazenamento);
    }

    //e)
    public String maiorMsg(){
        int size = this.texts[0].length();
        String result = this.texts[0];
        for (int i = 0; i<this.texts.length ; i++){
            if (this.texts[i].length() > size){
                size = this.texts[i].length();
                result = this.texts[i];
            }
        }
        return result;
    }

    //f)
    public void removeApp(String nome, int tamanho){
         int i = 0;
         for (;i<this.names.length && this.names[i] != nome ;i++);
         if (i<this.names.length){
             this.names[i] = "";
             this.ocupado -= tamanho;
         }
    }

    //CONSTRUTORES

    public Telemovel (){
        this.Marca = "Samsung";
        this.Modelo= "A20";
        this.resolX = 1920;
        this.resolY = 1080;
        this.storageText = 200;
        this.texts = new String[200];
        this.storageTotal = 220;
        this.storagePics = 200;
        this.storageApps = 20;
        this.ocupado = 50;
        this.apps = 3;
        this.pics = 20;
        this.names = new String[this.storageApps];
        this.names[0] = "Instagram";
        this.names[1] = "Messenger";
        this.names[2] = "Discord";
    }

    public Telemovel(String marca, String modelo, double resolX, double resolY, int storageText, int storageTotal, int storagePics, int storageApps, byte ocupado, int apps, int pics, String[] names) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.resolX = resolX;
        this.resolY = resolY;
        this.storageText = storageText;
        this.storageTotal = storageTotal;
        this.storagePics = storagePics;
        this.storageApps = storageApps;
        this.ocupado = ocupado;
        this.apps = apps;
        this.pics = pics;
        this.names = names;
    }

    public Telemovel (Telemovel t){
        this.Marca = t.getMarca();
        this.Modelo = t.getModelo();
        this.resolX= t.getResolX();
        this.resolY = t.getResolY();
        this.storageText = t.getStorageText();
        this.storageTotal = t.getStorageTotal();
        this.storagePics = t.getStoragePics();
        this.storageApps = t.getStorageApps();
        this.ocupado = t.getOcupado();
        this.apps = t.getApps();
        this.pics = t.getPics();
        this.names = t.getNames();
    }




    //GETTERS

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public double getResolX() {
        return resolX;
    }

    public double getResolY() {
        return resolY;
    }

    public String[] getTexts() {
        return texts;
    }

    public int getStorageText() {
        return storageText;
    }

    public int getStorageTotal() {
        return storageTotal;
    }

    public int getStoragePics() {
        return storagePics;
    }

    public int getStorageApps() {
        return storageApps;
    }

    public byte getOcupado() {
        return ocupado;
    }

    public int getApps() {
        return apps;
    }

    public int getPics() {
        return pics;
    }

    public String[] getNames() {
        return names;
    }



    //SETTERS


    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setResolX(double resolX) {
        this.resolX = resolX;
    }

    public void setResolY(double resolY) {
        this.resolY = resolY;
    }

    public void setTexts(String[] texts) {
        this.texts = texts;
    }

    public void setStorageText(int storageText) {
        this.storageText = storageText;
    }

    public void setStorageTotal(int storageTotal) {
        this.storageTotal = storageTotal;
    }

    public void setStoragePics(int storagePics) {
        this.storagePics = storagePics;
    }

    public void setStorageApps(int storageApps) {
        this.storageApps = storageApps;
    }

    public void setOcupado(byte ocupado) {
        this.ocupado = ocupado;
    }

    public void setApps(int apps) {
        this.apps = apps;
    }

    public void setPics(int pics) {
        this.pics = pics;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}

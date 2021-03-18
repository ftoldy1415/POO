package Teste;

import java.util.*;
import java.time.LocalDate;
public class YoutubeVideo {



    private String nome;
    private byte[] conteudo;
    private int maxVidSize;
    private int maxComments;
    private LocalDate upDate;
    private int resolX;
    private int resolY;
    private double duracaoMin;
    private double duracaoSec;
    private int likeCount;
    private int dislikeCount;
    private ArrayList<String> comments;


    //Métodos

    //b)
    public void insereComentario(String comentario){
        this.comments.add(comentario);
    }

    //c
    public long daysLater(){
        LocalDate today = LocalDate.now();
        long years = today.getYear() - upDate.getYear();
        long dias  = (years * 365) + today.getDayOfYear() - upDate.getDayOfYear();

        return dias;
    }


    //d
    public void thumbsUp(){
        this.likeCount++;
    }


    //CONSTRUTORES


    public YoutubeVideo() {
        this.nome = "";
        this.maxComments = 1000;
        this.maxVidSize = 400;
        this.conteudo = new byte[400];
        this.upDate = LocalDate.of(2021, 3, 16);
        this.resolX = 1920;
        this.resolY = 1080;
        this.duracaoMin=2;
        this.duracaoSec = getDuracaoMin() * 60;
        this.likeCount = 30;
        this.dislikeCount = 15;
        this.comments = new ArrayList<String>(maxComments);
        this.comments.add("AAAAAA");
        this.comments.add("BBBBBB");
        this.comments.add("CCCCCC");

    }

    public YoutubeVideo(String nome, byte[] conteudo, int maxVidSize, int maxComments,LocalDate uPDate, int resolX, int resolY, double duracaoMin, double duracaoSec, int likeCount, int dislikeCount, ArrayList<String> comments) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.maxVidSize = maxVidSize;
        this.maxComments = maxComments;
        this.resolX = resolX;
        this.resolY = resolY;
        this.upDate = uPDate;
        this.duracaoMin = duracaoMin;
        this.duracaoSec = duracaoSec;
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
        this.comments = new ArrayList<String>(maxComments);
        for (String comm : comments){
            this.comments.add(comm);
        }
    }



    public YoutubeVideo(YoutubeVideo yt){
        this.nome = yt.getNome();
        this.conteudo = yt.getConteudo();
        this.maxVidSize = yt.getMaxVidSize();
        this.maxComments = yt.getMaxComments();
        this.resolX = yt.getResolX();
        this.resolY = yt.getResolY();
        this.upDate= yt.getUpDate();
        this.duracaoMin = yt.getDuracaoMin();
        this.duracaoSec = yt.getDuracaoSec();
        this.likeCount = yt.getLikeCount();
        this.dislikeCount = yt.getDislikeCount();
        this.comments = new ArrayList<String>(yt.comments.size());
        for (String comm : yt.comments){
            String copia = comm;
            this.comments.add(copia);
        }
    }


    //GETTERS


    public LocalDate getUpDate() {
        return upDate;
    }

    public String getNome() {
        return nome;
    }

    public byte[] getConteudo() {
        return conteudo;
    }

    public int getMaxVidSize() {
        return maxVidSize;
    }

    public int getMaxComments() {
        return maxComments;
    }

    public int getResolX() {
        return resolX;
    }

    public int getResolY() {
        return resolY;
    }

    public double getDuracaoMin() {
        return duracaoMin;
    }

    public double getDuracaoSec() {
        return duracaoSec;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getDislikeCount() {
        return dislikeCount;
    }

    public ArrayList<String> getComments() {
        return comments;
    }


    //SETTERS


    public void setUpDate(LocalDate upDate) {
        this.upDate = upDate;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }

    public void setMaxVidSize(int maxVidSize) {
        this.maxVidSize = maxVidSize;
    }

    public void setMaxComments(int maxComments) {
        this.maxComments = maxComments;
    }

    public void setResolX(int resolX) {
        this.resolX = resolX;
    }

    public void setResolY(int resolY) {
        this.resolY = resolY;
    }

    public void setDuracaoMin(double duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public void setDuracaoSec(double duracaoSec) {
        this.duracaoSec = duracaoSec;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

//TO STRING


    public String toString() {
        return "YoutubeVideo{" +
                "nome='" + nome + '\'' + "\n" +
                ", maxVidSize=" + maxVidSize + "\n" +
                ", maxComments=" + maxComments + "\n" +
                ", upDate=" + upDate + "\n" +
                ", resolX=" + resolX + "\n" +
                ", resolY=" + resolY + "\n" +
                ", duracaoMin=" + duracaoMin + "\n" +
                ", duracaoSec=" + duracaoSec + "\n" +
                ", likeCount=" + likeCount + "\n" +
                ", dislikeCount=" + dislikeCount + "\n" +
                ", comments=" + comments + "\n" +
                '}';
    }



}

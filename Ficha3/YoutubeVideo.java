package Teste;

import java.util.Date;

public class YoutubeVideo {



    private String nome;
    private byte[] conteudo;
    private int maxVidSize;
    private int maxComments;
    private Date upDate;
    private int resolX;
    private int resolY;
    private double duracaoMin;
    private double duracaoSec;
    private int likeCount;
    private int dislikeCount;
    private String[] comments;


    //Métodos

    //b)
    public void insereComentario(String comentario){
        int i = 0;
        for (;i < this.maxComments && this.comments[i] != null;i++);
        if (i<this.maxComments){
            this.comments[i++] = comentario;
        }
    }

    //c
    public long daysLater(){
        Date today = new Date();
        long dif = today.getTime() - this.upDate.getTime();
        return (dif) / (24 * 60 * 60 * 1000);
    }


    //d
    public void thumbsUp(){
        this.likeCount++;
    }


    //CONSTRUTORES


    public YoutubeVideo() {
        this.nome = "";
        this.maxComments = 1000;
        this.maxVidSize = 4000000;
        this.conteudo = new byte[4000000];

        this.resolX = 1920;
        this.resolY = 1080;
        this.duracaoMin=0;
        this.duracaoSec = 0;
        this.likeCount = 0;
        this.dislikeCount = 0;
        this.comments = new String[1000];

    }

    public YoutubeVideo(String nome, byte[] conteudo, int maxVidSize, int maxComments, Date uPDate, int resolX, int resolY, double duracaoMin, double duracaoSec, int likeCount, int dislikeCount, String[] comments) {
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
        this.comments = comments;
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
        this.comments = yt.getComments();
    }


    //GETTERS


    public Date getUpDate() {
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

    public String[] getComments() {
        return comments;
    }


    //SETTERS


    public void setUpDate(Date upDate) {
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

    public void setComments(String[] comments) {
        this.comments = comments;
    }
}

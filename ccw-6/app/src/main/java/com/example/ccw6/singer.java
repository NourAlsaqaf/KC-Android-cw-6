package com.example.ccw6;

class Singer {
    private String singerName;
    private int singerPhoto;
    private int singerAge;

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getSingerPhoto() {
        return singerPhoto;
    }

    public void setSingerPhoto(int singerPhoto) {
        this.singerPhoto = singerPhoto;
    }

    public int getSingerAge() {
        return singerAge;
    }

    public void setSingerAge(int singerAge) {
        this.singerAge = singerAge;
    }

    public Singer(String singerName, int singerPhoto, int singerAge) {
        this.singerName = singerName;
        this.singerPhoto = singerPhoto;
        this.singerAge = singerAge;
    }
}


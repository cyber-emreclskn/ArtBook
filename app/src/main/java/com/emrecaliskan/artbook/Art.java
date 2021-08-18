package com.emrecaliskan.artbook;

public class Art {

    private String artname;
    private int id;

    public Art(String artname, int id) {
        this.artname = artname;
        this.id = id;
    }

    public String getArtname() {
        return artname;
    }

    public void setArtname(String artname) {
        this.artname = artname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

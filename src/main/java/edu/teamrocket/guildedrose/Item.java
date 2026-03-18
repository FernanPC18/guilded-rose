package edu.teamrocket.guildedrose;

final  class Item {
    private String name;
    private int sell_in;
    private int quality;

     Item (String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;}

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
     int getSell_in() {
        return sell_in;
    }
    void setSell_in(int sell_in) {
        this.sell_in = sell_in;
    }
     int getQuality() {
        return quality;
    }
     void setQuality(int quality) {
        this.quality = quality;
    }
}

package edu.teamrocket.guildedrose;

public class AgedBrie {

    private String name;
    private int sell_in;
    private int quality;
  
  public AgedBrie(String name, int sell_in, int quality) {
    this.name = name;
    this.sell_in = sell_in;
    this.quality = quality;}

    public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getSell_in() {
    return sell_in;
  }
  public void setSell_in(int sell_in) {
    this.sell_in = sell_in;
  }
    public int getQuality() {
    return quality;
  }
  public void setQuality(int quality) {
    this.quality = quality;
  }

    public void updateQuality() {
      if (getSell_in() > 0) {
        int value = 1;
        if(this.quality + value > 50) {
          this.quality = 50;
        }
      } else {
        int value = 2;
        if(this.quality + value >= 0) {
          this.quality += value;
        }
      }
      setSell_in(this.sell_in -= 1);
    }
}

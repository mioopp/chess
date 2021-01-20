package com.mioopp;

/**
 * @author mioopp
 * @create 2021-01-18 16:12
 */
public class ChessInfo {

  private String text;

  private String img;

  private int my;

  private String bl;

  private int[][] value;

  public ChessInfo(String text, String img, int my, String bl, int[][] value) {
    this.text = text;
    this.img = img;
    this.my = my;
    this.bl = bl;
    this.value = value;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public int getMy() {
    return my;
  }

  public void setMy(int my) {
    this.my = my;
  }

  public String getBl() {
    return bl;
  }

  public void setBl(String bl) {
    this.bl = bl;
  }

  public int[][] getValue() {
    return value;
  }

  public void setValue(int[][] value) {
    this.value = value;
  }
}

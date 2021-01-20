package com.mioopp.model;

import com.mioopp.ChessObject;
import com.mioopp.Constant;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * @author mioopp
 * @create 2021-01-18 16:02
 */
public class Dot implements ChessObject, Constant {

  private int x;

  private int y;

  private boolean isShow;

  private int[][] dots;

  private String img;

  public Dot(String img, int x, int y) {
    this.x = x;
    this.y = y;
    this.img = img;
    this.isShow = true;
    this.dots = new int[10][];
  }

  public void show(GraphicsContext gc) {
    for (int i = 0; i < this.dots.length; i++) {
      if (this.isShow) {
        gc.drawImage(new Image(getImage("/img/stype_1/"+this.img+".png")), spaceX * this.dots[i][0]+10  + pointStartX ,spaceY *  this.dots[i][1]+10 + pointStartY);
      }
    }
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public boolean isShow() {
    return isShow;
  }

  public void setShow(boolean show) {
    isShow = show;
  }

  public int[][] getDots() {
    return dots;
  }

  public void setDots(int[][] dots) {
    this.dots = dots;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }
}

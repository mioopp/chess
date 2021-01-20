package com.mioopp.model;

import com.mioopp.ChessObject;
import com.mioopp.Constant;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * @author mioopp
 * @create 2021-01-18 15:49
 */
public class Bg implements ChessObject, Constant {

  private int x;

  private int y;

  private String img;

  private boolean isShow;

  public Bg(String img, int x, int y) {
    this.x = x;
    this.y = y;
    this.img = img;
    this.isShow = true;
  }

  public void show(GraphicsContext gc) {
    if (this.isShow) {
      gc.drawImage(new Image(getImage("/img/stype_1/"+this.img+".png")), spaceX * this.x + pointStartX,
          spaceY * this.y + pointStartY);
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

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public boolean isShow() {
    return isShow;
  }

  public void setShow(boolean show) {
    isShow = show;
  }
}

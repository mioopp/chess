package com.mioopp.model;

import com.mioopp.js.ChessObject;
import com.mioopp.js.JsConstant;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * @author mioopp
 * @create 2021-01-18 15:54
 */
public class Pane implements ChessObject,JsConstant {

  private int x;

  private int y;

  private int newX;

  private int newY;

  private String img;

  private boolean isShow;

  public Pane(String img, int x, int y){
    this.x = x;
    this.y = y;
    this.newX = x;
    this.newY = y;
    this.isShow = true;
  }

  public void show(GraphicsContext gc){
    if (this.isShow) {
      gc.drawImage(new Image(getImage(this.img)), spaceX * this.x + pointStartX , spaceY *  this.y + pointStartY);
      gc.drawImage(new Image(getImage(this.img)), spaceX * this.newX + pointStartX  , spaceY *  this.newY + pointStartY);
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

  public int getNewX() {
    return newX;
  }

  public void setNewX(int newX) {
    this.newX = newX;
  }

  public int getNewY() {
    return newY;
  }

  public void setNewY(int newY) {
    this.newY = newY;
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

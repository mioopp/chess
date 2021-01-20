package com.mioopp.model;

import com.mioopp.chess.Chess;
import com.mioopp.js.ChessInfo;
import com.mioopp.js.ChessObject;
import com.mioopp.js.JsConstant;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * @author mioopp
 * @create 2021-01-18 15:15
 */
public class Man implements ChessObject,JsConstant {

  private String pater;

  private Integer x;

  private Integer y;

  private String key;

  private Integer my;

  private String text;

  private int[][] value;

  private Boolean isShow;

  private Integer alpha;

  private String[] ps;

  public Man(String key, int x, int y){
    this.pater = key.substring(0, 1);
    ChessInfo o =  chesses.get(this.pater);
    this.x = x;
    this.y = y;
    this.key = key;
    this.my = o.getMy();
    this.text = o.getText();
    this.value = o.getValue();
    this.isShow = true;
    this.alpha = 1;
  }

  public void show(GraphicsContext gc){
    if(this.isShow) {
      gc.save();
      gc.setGlobalAlpha(1);
      gc.drawImage(new Image(getImage("/img/stype_1/"+chesses.get(this.pater).getImg()+".png")), spaceX * x + pointStartX, spaceY * y + pointStartY);
      gc.restore();
    }
  }

  public String getPater() {
    return pater;
  }

  public void setPater(String pater) {
    this.pater = pater;
  }

  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Integer getMy() {
    return my;
  }

  public void setMy(Integer my) {
    this.my = my;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int[][] getValue() {
    return value;
  }

  public void setValue(int[][] value) {
    this.value = value;
  }

  public Boolean getShow() {
    return isShow;
  }

  public void setShow(Boolean show) {
    isShow = show;
  }

  public Integer getAlpha() {
    return alpha;
  }

  public void setAlpha(Integer alpha) {
    this.alpha = alpha;
  }

  public String[] getPs() {
    return ps;
  }

  public void setPs(String[] ps) {
    this.ps = ps;
  }
}

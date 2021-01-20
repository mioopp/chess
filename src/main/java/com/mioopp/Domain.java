package com.mioopp;

import com.mioopp.js.chess.Bg;
import com.mioopp.js.chess.Dot;
import com.mioopp.js.chess.Man;
import com.mioopp.js.chess.Pane;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

/**
 * @author mioopp
 * @create 2021-01-13 17:39
 */
public class Domain extends Application implements Constant {

  Map<String, Man> mans = new HashMap<>();

  public static void main(String[] args) {
      launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Canvas canvas = new Canvas(325, 402);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    canvas.setCursor(Cursor.HAND);
    initChess();
    draw(gc);
    StackPane stackPane = new StackPane(canvas);
    ImagePattern imagePattern = new ImagePattern(new Image(getImage("/img/stype_1/bg.jpg")), 0, 0, 0.5, 0.5, true);
    stackPane.setBackground((new Background(new BackgroundFill(imagePattern, CornerRadii.EMPTY, Insets.EMPTY))));
    Scene scene = new Scene(stackPane, 700, 600);
    stage.setScene(scene);
    stage.setResizable(false);
    stage.show();
  }

  private void draw(GraphicsContext gc) {
    for(ChessObject chessObject : chessObjects){
      chessObject.show(gc);
    }
  }

  private static void initChess(){
    Bg bg = new Bg("bg",0,0);
    Dot dot = new Dot("dot",0,0);
    dot.setShow(false);
    Pane pane = new Pane("pane",0,0);
    pane.setShow(false);
    chessObjects.add(bg);
    chessObjects.add(dot);
    chessObjects.add(pane);
    for (int i = 0; i < initMap.length; i++) {
      for (int n = 0; n < initMap[i].length; n++) {
        String key = initMap[i][n];
        if (key != null) {
          Man man = new Man(key,n,i);
          chessObjects.add(man);
        }
      }
    }
  }

  //  public static Man createMan(String key, int x, int y){
//
//  }
}

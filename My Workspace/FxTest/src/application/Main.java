package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();  //Creating a root node
		Scene scene = new Scene(root,600,600, Color.LIGHTSKYBLUE); // (root) adding the root node in Scene
		Stage stage = new Stage();
		
		
		Text text = new Text();
		text.setText("--JavaFX--");
		text.setX(50.0);
		text.setY(50.0);
		text.setFont(Font.font("Verdana",50));
		text.setFill(Color.LIMEGREEN);
		
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.RED);
		line.setOpacity(0.5);
		line.setRotate(45);
		
		
		Rectangle rectengle = new Rectangle();
		rectengle.setX(100);
		rectengle.setY(100);
		rectengle.setWidth(100);
		rectengle.setHeight(100);
		rectengle.setFill(Color.DEEPSKYBLUE);
		rectengle.setStrokeWidth(5);
		rectengle.setStroke(Color.ALICEBLUE);
		
		
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(
				200.0,200.0,
				300.0,300.0,
				200.0,300.0
				);
		triangle.setFill(Color.YELLOW);
		
		
		Circle circle = new Circle();
		circle.setCenterX(340);
		circle.setCenterY(340);
		circle.setRadius(50);
		circle.setFill(Color.CORAL);
		
		
		Image image = new Image("D:\\Android_Intern\\My Workspace\\FxTest\\src\\pizza.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(400);
		imageView.setY(400);
		
		
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectengle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);
		stage.setScene(scene);  // adding the secne in satge
		stage.show(); // and show the stage
	}
}

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creates a grid pane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Loads images
        Image flag1 = new Image("file:flag1.jpg");
        Image flag2 = new Image("file:flag2.jpg");
        Image flag6 = new Image("file:flag6.jpg");
        Image flag7 = new Image("file:flag7.jpg");

        // Adds images to ImageViews
        ImageView imageView1 = new ImageView(flag1);
        ImageView imageView2 = new ImageView(flag2);
        ImageView imageView3 = new ImageView(flag6);
        ImageView imageView4 = new ImageView(flag7);

        // Sets the preferred size for the image views
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(200);
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(200);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(200);
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(200);

        // Adds image views to grid pane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);

        // Creates scene and set it in the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Flag Grid Pane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
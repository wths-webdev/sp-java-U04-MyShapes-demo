# Simple JavaFX Drawing
* Stage
* Scene
* Ellipse
* Text
* StackPane

## Step 1: Application class
Write the complete `public class MyShapes extends Application`

## Step 2: Setup Stage, Scene, and StackPane
1. Write complete `start()` method:   
```java
@Override
public void start(Stage stage) throws Exception {
}
```
2. Create StackPane `stackPane`
3. Create Scene `scene`
4. Add `stackPane` to `scene`
5. Run file.
6. Comment out Java's `main()` method and run file.

## Step 3. Create ellipse
1. Create Ellipse:
```java
Ellipse ellipse = new Ellipse(110, 70);
```
2. Set ellipse fill color to lightblue
3. Add `ellipse` to `stackPane` using `stackPane.getChildren().addAll()`
4. Run file.

Questions to ask:
* Since we can change the fill color, how are fill and ellipse class related? A: Fill is a property of Ellipse

## Step 4. Add text
1. Create Text node `text` and "MyShapes" as string.
2. Set the font property:
```java
text.setFont(new Font("Arial Bold", 24));
```
3. Add `text` to `stackPane`
4. Run file.


## Sources
* [JavaFX Application Basic Structure](https://dev.java/learn/javafx/structure/)
* [Drawing with JavaFX Lesson 01 - Drawing Lines and Shapes](https://docs.google.com/presentation/d/1xJl4nWrmfpJ7u4j5qybEy-F9MQ0YnbczYyFwpifnQQs/edit?usp=sharing)


## Write the purpose of each import:
`import javafx.scene.Scene;`
* Purpose:
* Example method:

`import javafx.scene.layout.StackPane;`
* Purpose:
* Example method:

`import javafx.scene.paint.Color;`
* Purpose:
* Example method:

`import javafx.scene.shape.Ellipse;`
* Purpose:
* Example method:

`import javafx.scene.text.Font;`
* Purpose:
* Example method:

`import javafx.scene.text.Text;`
* Purpose:
* Example method:

`import javafx.stage.Stage;`
* Purpose:
* Example method:   

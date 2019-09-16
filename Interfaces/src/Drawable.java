
public interface Drawable {
void draw();
default void drawWithPen() {
	System.out.println("drawing with a black pen");
}
}

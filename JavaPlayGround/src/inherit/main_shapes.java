/*
 * Name: Jose Terrones Jr.
 * Purpose: This program will present a menu that gives the user options on shape choice.
 * The user can choose triangle, circle, rhombus, star, sphere.
 * Triangle will calculate area, circle will calculate area and perimeter.
 * rhombus will calculate area, star will calculate area, and sphere will
 * calculate area.
 */
package inherit;

public class main_shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu shapes = new menu();
		shapes.options();
		shapes.option_choice(shapes.getUserChoice());
	}
}

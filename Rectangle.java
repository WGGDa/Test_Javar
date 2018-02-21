package new3;
import java.util.Scanner;
public class Rectangle {

		int length;
		int width;
		public Rectangle(int length2, int width2) {
	length = length2;
	width = width2;
		}
		public int getarea() {
			int area = (width*length);
			return area;
		}
		public int getparamiter() {
			int paramiter = (2*width+2*length);
			return paramiter;
		}
}

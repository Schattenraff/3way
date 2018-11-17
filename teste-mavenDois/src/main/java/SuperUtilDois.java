import com.web.util.SuperUtil;

public class SuperUtilDois {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			String s;

			if (i == 0) {
				s = SuperUtil.escapeHTML("<h1> Testando </h1>");
				System.out.print(s);
			}
			if (i == 1) {
				s = SuperUtil.escapeHTML("<h1> o método </h1>");
				System.out.print(s);
			}

			if (i == 2) {
				s = SuperUtil.escapeHTML("<h1> SuperUtil </h1>");
				System.out.print(s);
			}

			if (i == 3) {
				s = SuperUtil.escapeHTML("<h1> .escapeHTML </h1>");
				System.out.print(s);
			}
		}
	}

}

import java.util.StringJoiner;

public class stringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner("],[" , "{", "}");
		sj.add("alpha");
		sj.add("theta");
		sj.add("gamma");
		
		String theResult = sj.toString();
	}

}

import java.util.ArrayList;

public class IPCuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ipAddres = "163.121.12.30";
		System.out.println(ipAddres);
		String[] ipParts = ipAddres.split("\\.");
		ArrayList<Integer> parts = new ArrayList<Integer>();
				for(String part:ipParts){
					parts.add(Integer.valueOf(part));
				}
				for(int x:parts){
					System.out.println(x);
				}
	}

}

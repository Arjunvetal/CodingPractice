import java.util.HashMap;
import java.util.Map;

//
//import java.util.HashMap;
//import java.util.Map;
//
// class FindTheOutput {
//
//    public static void main(String[] args) {
//
////        Map<String,String> map =new HashMap<>();
////
////        String e1 = new String("AJAY");
////        String e2 = new String("AJAY");
////        String e3 = new String("AJAY");
////
////        map.put(e1,"I");
////        map.put(e2,"M2");
////
////       // System.out.println(map.get(e1));
////       // System.out.println(map.get(e2));
//  }
//    }

class FindTheOutput{
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		
		String e1 = new String("AJAY");
		//String e2="AJAY";
		String e2 = new String("AJAY");
		String e3 = new String("AJAY");
		
		map.put(e1, "I");
		map.put(e2, "M2");
		
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		
	}
}

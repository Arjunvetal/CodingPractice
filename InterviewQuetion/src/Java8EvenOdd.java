import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Product{
	
	int id;
	String name;
	float price;
	
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
}
public class Java8EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		List<Integer> number=Arrays.asList(1,2,4,5,7,8,10);
//		
//		number.stream().filter(x->x%2!=0).forEach(System.out::println);
		
		List<Product> list=new ArrayList<>();
		list.add(new Product(1,"iphone1",55000));
		list.add(new Product(2,"iphone2",92001));
		list.add(new Product(3,"iphone4",50099));
		list.add(new Product(4,"iphone5",33000));
		list.add(new Product(5,"iphone6",45005));
		
		list.stream()
		.filter(p->p.price%2==0).forEach(System.out::println);
		
		//System.out.println(list);
		
		

	}

}

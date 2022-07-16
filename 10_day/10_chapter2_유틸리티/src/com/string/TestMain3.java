package com.string;

class Cat{
	String name;
	public Cat(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class TestMain3 {
	public static void main(String[] args) {

		Cat c = new Cat("야옹이");
		Cat c2 = new Cat("야옹이");

		System.out.println(c); // c.toString()
		System.out.println(c2);
		
		// c 와 c2가 같냐?
		//1. 주소값이 같냐?
		System.out.println(c == c2);
		
		//2. 실제값이 같냐?
		System.out.println(c.equals(c2)); // Object의 equals메서드를 사용했기 때문에  == 비교됨, 따라서 
		// 실제값 비교할려면 재정의해야된다. ( API 대부분이 미리 재정의됨 )
		
	}
}






package ch09.exam02;

public class A {
	//Field
	//Constructor
	//Method

	//Nested Class(Interface)
	//멤버 클래스(인터페이스)
	class B{
		public int field1;
		public B() {}
		public void method() {}
	}
	
	public static class C{
		public int field1;
		public C() {}
		public void method() {}
	}
	
	public void method() {
		class D{
			public int field1;
			public D() {}
			public void method() {}
		}
		D d = new D();
		d.field1=1;
		d.method();
	}
}

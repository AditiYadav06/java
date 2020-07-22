package vegetable1;
import java.lang.*;

abstract class vegetable1{
	String vegetable_color;
	abstract public  String toString();
}
class brinjal extends vegetable1{
	public String toString()
	{
		vegetable_color="Purpul";
		return vegetable_color;
	}
}
class potato extends vegetable1{
	public String toString()
	{
		vegetable_color="yellow";
		return vegetable_color;
	}
}
class tomato extends vegetable1{
	public String toString()
	{
		vegetable_color="red";
		return vegetable_color;
	}
}
 class vegetable{
	public static void main(String[] args){
		vegetable1 b=new brinjal();
		vegetable1 t=new tomato();
		vegetable1 p=new potato();
		System.out.println("Colour of potato:"+p.toString());
		System.out.println("Colour of tomato:"+t.toString());
		System.out.println("Colour of brinjal:"+b.toString());
	}
}

class areaoverload
{
    void area(float side)
    {
        System.out.println("the area of the square is "+Math.pow(side, 2)+" sq units");
    }
    void area(float length, float widht)
    {
        System.out.println("the area of the rectangle is "+length*widht+" sq units");
    }
    void area(double radius)
    {
        double z = 3.14 * radius * radius;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   areaoverload ob = new areaoverload();
	   ob.area(4);
	   ob.area(14,8);
	   ob.area(7.5);
        }
}
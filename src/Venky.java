
public class Venky
{
	public static void main(String[] args) 
	{
		Venky v=new Venky();
		System.out.println("java"+v.test());
	}
     public String test()// main()
     {
	 System.out.println(35);
	 return new Venky().test3(new Venky().test2())+new Venky().test4("here");	 
     }
     public int test2()//test()
     {
    	 System.out.println(25);
    	 return 25+5;
     }
     public String test3(int a)//test()
     {
    	System.out.println(15);
    	return "is";
   
     }
    public Venky()
     {
    	 System.out.println("start");
    	 
     }
    // private void exit(int i) {
		// TODO Auto-generated method stub
		
	
	public String test4(String s)//test()
     {
    	 System.out.println(45);
    	 return "awesome";
     }
}

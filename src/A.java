
class B
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
        System.out.println("One" + i);
    }
 
    {
        i = i++ + ++i;
        System.out.println("two" + i);
    }
}
 
class C extends B
{
    static
    {
        i = --i - i--;
        System.out.println("three" + i);
    }
 
    {
        i = ++i + i++;
        System.out.println("Four" + i);
    }
}
 
public class A
{
    public static void main(String[] args)
    {
        C b = new C();
 
        System.out.println(b.i);
    }
}
/**
 * 열거형 상수 출처: https://opentutorials.org/module/1226/8025
 */

package EXAM1807.enumExam;

public class Shoes {
    
	public String name;
    public int size;
    public Type type;  // WALKING, RUNNING, TRACKING, HIKING
    
    
    public static void main(String[] qrgs) {
    	
        Shoes shoes = new Shoes();
        
        shoes.name = "나이키";
        shoes.size = 230;
        shoes.type = Type.RUNNING;
         
        System.out.println("신발 이름 = " + shoes.name);
        System.out.println("신발 사이즈 = " + shoes.size);
        System.out.println("신발 종류 = " + shoes.type);
        
        for(Type type : Type.values()) {
            System.out.println(type);
        }
        System.out.println(shoes.type.ordinal());
        Type tp = Type.HIKING;
        System.out.println(tp.ordinal());
        
        Type tp1 = Type.WALKING;
        Type tp2 = Type.valueOf("WALKING");
         
        System.out.println(tp1);
        System.out.println(tp2);
        
        
    }//.main
    
}
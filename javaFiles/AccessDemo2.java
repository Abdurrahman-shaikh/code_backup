package mpkg;
import mypkg.AccessDemo1;
class AccessDemo2 extends AccessDemo1{
	public static void main(String[] args){
		AccessDemo2 ad=new AccessDemo2();
//		System.out.println(ad.a);
		System.out.println(ad.b);
//                System.out.println(ad.c);
                System.out.println(ad.d);
	}
}

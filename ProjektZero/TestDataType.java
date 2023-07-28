package ProjektZero;


import java.math.*;
import javax.swing.JOptionPane;

public class TestDataType {
	
	public static void main(String[]args) {
		testPrimitiveDataTyps();
		testBigNumber();
		
	}
	
	public static void testPrimitiveDataTyps() {
		byte byte1 = -128;
		System.out.println("byte1: " + byte1);
		
		short short1 = 32767;
		System.out.println("short1: " +short1);
		
		int int1 = 2144999999;
		System.out.println("int1: " +int1);
		
		int int2 = 2_144_999_999;
		System.out.println("byte1: " +int2);
		
		long long1 = 9_144_999_999_000_000_000L;
		System.out.println(long1);
		
		double double1= 1.4554D;
		System.out.println(double1);
		
		double double2 = 0.54e-300;
		System.out.println(double2);
		
		double double3 = 0.54e18;
		System.out.println(double3);
		
		double double4 = -.54e-18;
		System.out.println(double4);
		
		float float1 =  1.1234F;			
		System.out.println(float1);
		
		short short2 = -128;
		System.out.println(short2);
		
		long long2=  int1 ;
		System.out.println(long2);
		
		float float2 = long2;
								
		float float3 = 156324.2541F;
		
		
		long2 = (long) float3;
		
		
		//float float2 = long2;
		System.out.println(float2);
		
		short2 =(short) float2;
		
		char character1 = 'c' ;
		System.out.println("character1 : " + character1 );
		char character2 = 5200;
		System.out.println("character2 : " + character2 );
		char character3 ='\u00D1';
		System.out.println("character3 : " + character3 );
		char character4 = (char)-122;
		JOptionPane.showMessageDialog(null, character4);
		
		
	}
	
	public static void testBigNumber() {
		BigInteger bigint1 = new BigInteger("152158752156874252544");
		
		BigInteger bigint2 = new BigInteger("15215875215687425254454654564");
	
		BigInteger bigresule = bigint1.multiply(bigint2);
		
		System.out.println(bigresule);
	}
		
}

import java.util.*;
import java.io.*;
class student
{
public static void main(String args[])
{
Scanner name=new Scanner(System.in);
System.out.println("Enter the name:");
String str=name.nextLine();
Scanner reg=new Scanner(System.in);
System.out.println("Enter the reg number:");
int r=reg.nextInt();
int m1,m2,m3,m4,m5;
Scanner mark=new Scanner(System.in);
System.out.println("mark 1:");
m1=mark.nextInt();
System.out.println("mark 2:");
m2=mark.nextInt();
System.out.println("mark 3:");
m3=mark.nextInt();
System.out.println("mark 4:");
m4=mark.nextInt();
System.out.println("mark 5:");
m5=mark.nextInt();
int t=m1+m2+m3+m4+m5;
System.out.println("Total mark of the student:"+t);
int a=t/5;
System.out.println("Average mark of the student:"+a);
}}
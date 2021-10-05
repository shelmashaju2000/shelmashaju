import java.io.*;
class SalesMan
{
String scode;
String sname;
String place;
int samount;
double commission;
void readData() throws IOException
{DataInputStream dp=new DataInputStream(System.in);
System.out.println("Scode:");
scode=dp.readLine();
System.out.println("name:");
sname=dp.readLine();
System.out.println("Place:");
place=dp.readLine();
System.out.println("Amount:");
samount=Integer.parseInt(dp.readLine());
}
void calculateCommission()
{
 if (samount < 2000)
 commission=0.08* samount;
 else if (samount<=5000)
 commission=0.10 * samount;
 else if (samount> 5000)
 commission=.12* samount;
}
void display()
{
System.out.println("Salesman Name:"+ sname);
System.out.println("Sales Amount:"+samount);
System.out.println("Commission:"+commission);
}
}
class SalesManClassDemo
{public static void main(String args[])throws IOException
{SalesMan s[] =new SalesMan[2];
DataInputStream dp=new DataInputStream(System.in);
for(int i=0;i<2;i++)
{
s[i]=new SalesMan();
s[i].readData();
}
for(int i=0;i<2;i++)
{
s[i].calculateCommission();
}
System.out.println("Enter a Salesman code to search:");
String code=dp.readLine();
for(int i=0;i<2;i++)
{
 if (code.equals(s[i].scode))
 s[i].display();
}
} 
}
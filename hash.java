class stu{
String name;
int mobile;
String place;
stu (String name, int mobile, String place){
this.name=name;
this.mobile=mobile;
this.place=place;
} 
public int hashcode(){
return mobile;
}
}

class hash{
public static void main (String[]a){
stu s1=new stu("Venkatesh", 97039, "Narsaraopet");
stu s2=new stu("Nagaraju", 99510, "Ponnekallu");
stu s3=new stu("Rajesh", 95828, "Mancherial");
System.out.println(s1.hashcode());
System.out.println(s2.hashcode());
System.out.println(s3.hashcode());
}}
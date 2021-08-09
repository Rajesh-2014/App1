class stu{
String name;
int mobile;
int id;
String place;
stu (String name, int mobile, String place, int id){
this.name=name;
this.mobile=mobile;
this.place=place;
this.id=id;
}
public int hashcode(){
return mobile;
}}

public class str2{
public static void main (String[]a){
stu s1=new stu("Venkatesh", 97039, "Narsaraopet", 101);
stu s2=new stu("Nagaraju", 99510, "Ponnekallu",102);
stu s3=new stu("Rajesh", 95828, "Mancherial",103);
System.out.println(s1.hashcode());
System.out.println(s2);
System.out.println(s3);
}}
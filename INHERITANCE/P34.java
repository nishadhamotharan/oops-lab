class Content{
String title;
double Duration;
String artistName;

public Content(String c1,double c2,String c3){
this.title=c1;
this.Duration=c2;
this.artistName=c3;
}
void play(){
System.out.println("Title : "+title);
System.out.println("Duration : "+Duration);
}
void display(){
System.out.println("Artist Name : "+artistName);
}
}

class Song extends Content{
String genre;
public Song(String s1,double s2,String s3,String s4){
super(s1,s2,s3);
this.genre=s4;
}
void display(){
System.out.println("Song"+title +" Genre : "+genre);
}
}

class Podcast extends Content{
int episodeNumber;
public Podcast(String p1,double p2,String p3,int p4){
super(p1,p2,p3);
this.episodeNumber=p4;
}
void display(){
System.out.println("podcast : "+title+"Episode Number : "+episodeNumber);
}
}

class Audiobook extends Content{
int chapterCount;
public Audiobook(String a1,double a2,String a3,int a4){
super(a1,a2,a3);
this.chapterCount=a4;
}
void display(){
System.out.print("Audiobook : "+title+"Chapter Count"+chapterCount);
}
}
public class P34{
public static void main(String[] args){
Song S=new Song("Melody",3.5,"Arjit Singh","pop");
Podcast P=new Podcast("TechTalk",45.0,"John Doe",5);
Audiobook A=new Audiobook("Java Guide Chapters",120.0,"Jane Smith",12);

S.display();
P.display();
A.display();
}
}
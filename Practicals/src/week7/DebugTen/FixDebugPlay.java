package week7.DebugTen;

public class FixDebugPlay
{
   String title;
   String author;

   FixDebugPlay(String title, String author)
   {
      this.title = title;
      this.author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}
/*
1. Consider the design of the following class, Text that models an editor or editing text and
printing text.
class Text {
String text;
String author;
int length;
String getText() { ... }
void setText(String s) { ... }
String getAuthor() { ... }
void setAuthor(String s) { ... }
int getLength() { ... }
void setLength(int k) { ... }
//methods that change the text
void allLettersToUpperCase() { ... }
        void findSubTextAndDelete(String s) { ... }
        //method for formatting output
        void printText() { ... }
      }*/

public class Text
{
    private String text;
    private String author;
    private int length;

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }


}


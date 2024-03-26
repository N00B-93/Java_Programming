package Inheritance_And_Polymorphism.Book;

import java.util.Date;

interface LibraryBook extends Book
{
    void setDueDate(Date dueDate);
    String getCurrentHolder();
    Date getDueDate();
    void setCurrentHolder(String currentHolder);
}

package com.practice.test1;

public class Controller {

    private Book model;
    private View view;

    public Controller(Book model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setBookTitle(String title) {
        model.setTitle(title);
    }

    public String getBookTitle() {
        return model.getTitle();
    }

    public void setBookAuthor(String author) {
        model.setAuthor(author);
    }

    public String getBookAuthor() {
        return model.getAuthor();
    }

    public void updateView() {
        view.printBookDetails(model.getTitle(), model.getAuthor());
    }

}

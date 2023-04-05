package HW06;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import HW06.Files.Base.FileManager;
import HW06.Files.Managers.CsvContactFileManager;
import HW06.Models.*;
import HW06.Presenters.*;
import HW06.Views.*;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = null;
        ConsoleView consoleView = new ConsoleView(phoneBook);
        FileManager manager = new CsvContactFileManager("mycontacts.csv");
        try {
            if (manager.hasFile())
                phoneBook = new PhoneBook(new ArrayList<>(manager.readContacts()));
            else
                phoneBook = new PhoneBook();
            PhoneBookPresenter presenter = new PhoneBookPresenter(consoleView, phoneBook, manager);
            presenter.buttonClick();
        } catch (FileNotFoundException ex) {
            consoleView.printErrorMassage(ex.getMessage());
        }
    }

}
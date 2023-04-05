package HW06.Presenters;

import HW06.Files.Base.FileManager;
import HW06.Models.PhoneBook;
import HW06.Views.BaseView;

public class PhoneBookPresenter {
    private BaseView view;
    private FileManager fileManager;
    private PhoneBook phoneBook;

    public PhoneBookPresenter(BaseView view, PhoneBook phoneBook, FileManager fileManager) {
        this.view = view;
        this.phoneBook = phoneBook;
        this.fileManager = fileManager;
    }

    public void buttonClick() {
        view.showMenu();
    }
}

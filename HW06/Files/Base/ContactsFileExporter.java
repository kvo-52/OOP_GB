package HW06.Files.Base;

import java.io.FileNotFoundException;
import java.util.List;
import HW06.Models.*;

public interface ContactsFileExporter {
    void exportContacts(List<Contact> contacts, String fileName) throws FileNotFoundException;
}

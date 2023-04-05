package HW06.Files.Base;

import HW06.Models.*;
import java.io.FileNotFoundException;
import java.util.Collection;

public interface ContactsFileImporter {
    Collection<Contact> importContacts(String fileName) throws FileNotFoundException;
}

package HW06.Files.Importers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import HW06.Files.Base.ContactsFileExporter;
import HW06.Models.Contact;

public class CsvFileImporter implements ContactsFileExporter {

    // @Override
    public Collection<Contact> imporContacts (String fileName) throws FileNotFoundException {
        List<Contact> contacts = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(",");
                Contact contact = new Contact(fields[0], fields[1], fields[2], fields[3]);
                contacts.add(contact);
            }
        } catch (FileNotFoundException e) {
            throw e;
        }

        return contacts;
    }

    @Override
    public void exportContacts(List<Contact> contacts, String fileName) throws FileNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exportContacts'");
    }

}

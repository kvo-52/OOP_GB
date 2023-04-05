package HomeWork.HW06.Files.Managers;

import HomeWork.HW06.Files.Base.FileManager;

public class CsvContactFileManager extends FileManager {
    public CsvContactFileManager(String fileName) {
        super(new CsvFileExport(), new CsvFileImport(), fileName);
    }

}

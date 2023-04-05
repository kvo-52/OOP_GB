package HW06.Files.Managers;

import HW06.Files.Base.FileManager;
import HW06.Files.Exporters.CsvFileExporter;
import HW06.Files.Importers.CsvFileImporter;

public class CsvContactFileManager extends FileManager {
    public CsvContactFileManager(String fileName) {
        super(new CsvFileExporter(), new CsvFileImporter() , fileName);
    }

}

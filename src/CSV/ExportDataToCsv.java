package CSV;

import java.io.*;

public class ExportDataToCsv {
    public void exportData(String line) throws IOException {
        String path = "src/CSV/FruitExport.csv";
        File file = new File(path);
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(line);
        bw.newLine();
        bw.close();
        fw.close();
    }
}

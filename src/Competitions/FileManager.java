package Competitions;

import java.io.File;

class FileManager {

    static void creatDirectory () {
        File dirOfComp;
        System.out.println("Укажіть розміщення папки для змагань:");
        String path = ScanningHelper.inputString();
        System.out.println("Укажіть назву змагань:");
        String name = ScanningHelper.inputString();
        dirOfComp = new File (path, name);
        dirOfComp.mkdir();
    }
}

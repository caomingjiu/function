package Tao;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Tao
 */
public class FileServiceTest {
    public static void main(String[] args) {
        FileService fileService = type -> {
            class MyFileter  implements FileFilter {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().toLowerCase().endsWith(type);
                }
            }
            File file = new File("F:\\JavaTest");
            File[] files = file.listFiles(new MyFileter());
            for (File f:files){
                System.out.println(f);
            }
        };
        fileService.setFileName(".txt");
    }
    
}

package test;

/**
 * @author Tao
 */
public class FileFilterServiceTest {
    public static void main(String[] args) {
        FileFilterService fileFilterService = file -> {
            System.out.println(file);
        };

    }
}

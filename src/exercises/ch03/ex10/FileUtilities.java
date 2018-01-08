package exercises.ch03.ex10;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

/**
 * @author Chris Kimberley
 */
public class FileUtilities {

    public static File[] subdirectories(File directory) {
        //return directory.listFiles(x -> x.isDirectory());
        //return directory.listFiles(File::isDirectory);
        return directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }

    public static File[] filesWithExtension(File directory, String extension) {
        return directory.listFiles(x -> x.getName().endsWith(extension));
    }

    public static void fileSort(File[] files) {
        //ArrayLists.sort(files, comparing(File::isDirectory).reversed().thenComparing(File::getName));
        Arrays.sort(files, ((x, y) -> {
            if (x.isDirectory() == y.isDirectory()) {
                return x.getName().compareToIgnoreCase(y.getName());
            } else {
                return Boolean.compare(y.isDirectory(),x.isDirectory());
            }
        }));
    }

    public static void main(String[] args) {
        String homeDirectory = System.getProperty("user.home");
        File[] files1 = subdirectories(new File(homeDirectory, "Documents"));
        System.out.println("\nSUBDIRECTORIES");
        for (File file : files1) {
            System.out.println(file.getName());
        }

        File[] files2 = filesWithExtension(new File(homeDirectory, "Documents"), ".pages");
        System.out.println("\nFILES WITH GIVEN EXTENSION");
        for (File file : files2) {
            System.out.println(file.getName());
        }

        File[] files3 = filesWithExtension(new File(homeDirectory, "Music"), "");
        fileSort(files3);
        System.out.println("\nSORTED FILES");
        for (File file : files3) {
            System.out.println(file.getName());
        }
    }
}
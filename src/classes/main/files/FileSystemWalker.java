package classes.main.files;

import java.io.File;
import java.io.IOException;

public class FileSystemWalker {
    void printFileTree(String path) throws IOException {
        File file = new File(path);
        recursivePathPrint(file, 0);
    }

    void recursivePathPrint(File file, int level){
        if(file.isDirectory()){
            for(File childFile: file.listFiles()){
                if (childFile.isDirectory()) {
                    System.out.println(buildPrefix(level) + childFile.getName());
                }
                recursivePathPrint(childFile, level);
            }
            ++level;
        } else {
            System.out.println(buildPrefix(level + 1) + file.getName());
        }
    }

    private String buildPrefix(int level){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<level;i++){
            stringBuilder.append("  ");
        }
        return stringBuilder.toString();
    }
}

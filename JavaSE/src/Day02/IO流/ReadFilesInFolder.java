package Day02.IO流;

import java.io.File;
import java.util.LinkedList;

public class ReadFilesInFolder {
    public static void readFilesDir(String path){

        LinkedList<File> Dirlist = new LinkedList<File>();
        LinkedList<String> Filelist = new LinkedList<String>();
        File dir = new File(path);
        File[] files = dir.listFiles();

        for(File file : files){
            if(file.isDirectory()){
                Dirlist.add(file);
            }else{
                Filelist.add(file.getAbsolutePath());
                System.out.println(file.getAbsolutePath());
            }
        }

        File temp;
        while(!Dirlist.isEmpty()){
            temp = Dirlist.removeFirst();
            if(temp.isDirectory()){
                files = temp.listFiles();
                if(files == null) continue;
                for(File file : files){
                    if(file.isDirectory()){
                        Dirlist.add(file);
                    }else{
                        Filelist.add(file.getAbsolutePath());
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }else{
                System.out.println("-------------");
            }
        }
    }
}

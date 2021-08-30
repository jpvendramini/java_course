package module17.application2;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
//        String[] lines = new String[]{"Good morning!", "good afternoon", "Good evening!"};

//        String path = "c:\\Users\\appca\\Desktop\\out.txt";

//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
//            for (String line : lines){
//                bw.write(line);
//                bw.newLine();
//            }
//        }
//        catch (IOException e){
//            System.out.println("Error: " + e.getMessage());
//        }
//        try(BufferedReader br = new BufferedReader(new FileReader(path))){
//            String line = br.readLine();
//
//            while (line != null){
//                System.out.println(line);
//                line = br.readLine();
//            }
//        }
//        catch (IOException e){
//            System.out.println("Error: " + e.getMessage());
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a folder path: ");
//        String strPath = sc.nextLine();
//
//        File path = new File(strPath);
//
//        File[] folders = path.listFiles(File::isDirectory);
//
//        System.out.println("FOLDERS: ");
//        for (File folder : folders){
//            System.out.println(folder);
//        }
//
//        File[] files = path.listFiles(File::isFile);
//        System.out.println("FILES:");
//        for (File file : files){
//            System.out.println(file);
//        }
//
//        boolean success = new File(strPath + "\\subdir").mkdir();
//        System.out.println("Directory created with success: " + success);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getName: " + path.getParent());
        System.out.println("getName: " + path.getPath());
        System.out.println("getName: " + path.getAbsolutePath());

        sc.close();
    }

}

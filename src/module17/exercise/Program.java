package module17.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String args[]){
        String strPathFileIn = "c:\\Users\\appca\\Desktop\\products.txt";
        String strPathFileOut = "c:\\Users\\appca\\Desktop\\productsOut.txt";

        List<Produto> produtoList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(strPathFileIn))){
            String line = br.readLine();

            while (line != null){
                String[] separatedData = line.toString().split(",");
                System.out.println(separatedData[0]+ separatedData[1]+separatedData[2]);
                produtoList.add(new Produto(separatedData[0], Double.parseDouble(separatedData[1]), Integer.parseInt(separatedData[2])));
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        new File(strPathFileOut);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPathFileOut))){
            for (Produto produto : produtoList){
                bw.write(produto.getName() + "," + produto.total());
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}

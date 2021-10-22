package module19.exercicio3.application;

import module19.exercicio3.domain.Politian;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String args[]){
        try{
            String line = "";
            String splitBy = ",";
            Map<Politian, Integer> politianSet = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\appca\\Documents\\eleicao.txt"));
            while ((line = br.readLine()) != null){
                String[] candidates = line.split(splitBy);
                Politian politian = new Politian(candidates[0], Integer.parseInt(candidates[1]));
                if (politianSet.containsKey(politian)){
                    int value = politianSet.get(politian);
                    politianSet.put(politian, value + Integer.parseInt(candidates[1]));
                }else{
                    politianSet.put(new Politian(candidates[0], Integer.parseInt(candidates[1])),
                            Integer.parseInt(candidates[1]));
                }
            }
            for (Map.Entry<Politian, Integer> pair : politianSet.entrySet()){
                System.out.println(pair.getKey().getName() + ": " + pair.getValue());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
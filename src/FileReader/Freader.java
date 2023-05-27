package FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Freader {
    public static int[] read(String fname)
    {
        int[] list = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fname))) {
            ArrayList<Integer> listread=new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (String str : values) {
                    if (!str.isEmpty())
                        listread.add(Integer.parseInt(str.trim()));
                }
            }
            list = new int[listread.size()];
            for (int i=0;i<list.length;i++) {
                list[i] = listread.get(i);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return list;
    }

//    public static void main(String[] args) {
//        int[] arr = Freader.read("/home/mahmoud/Heap/3bt.txt");
//        for (int i:arr) {
//            System.out.println(i);
//        }
//    }
}

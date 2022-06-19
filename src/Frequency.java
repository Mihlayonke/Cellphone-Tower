
import java.util.*;
import java.util.Collections;
import java.util.List;

public class Frequency {

    List<Integer> frequencies;
    Cell [] cells;
    String [] cellsNames;
    int count;

    public Frequency(int num){
        cells = new Cell[num];
        cellsNames = new String [num];
        frequencies = new ArrayList<>();
    }

    public void generateFrequencies(){

        for (int i=0; i<6; i++){
            frequencies.add(110 + i);
        }
        Collections.shuffle(frequencies);
    }

    public void addCell(String cellName){

        cellsNames[count] = cellName;
        count++;
    }

    public void locateFrequency(){

        int i = 0;
        int index = 0;

        while (i < cells.length) {
            if (index == frequencies.size()) {
                index = 0;
            }
            int freq = frequencies.get(index);
            cells[i] = new Cell(freq, cellsNames[i]);
            i++;
            index++;

        }
    }
}

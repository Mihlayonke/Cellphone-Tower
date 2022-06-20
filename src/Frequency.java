
import java.util.*;
import java.util.Collections;
import java.util.List;

public class Frequency {

    List<Integer> frequencies;      //List of cells frequencies to set the frequency of each cell...
    Cell [] cellsList;              //List of cells...
    String [] cellsNames;           //List of cells names to set the name of each cell...
    int cellIndex;

    public Frequency(int cells){
        cellsList = new Cell[cells];
        cellsNames = new String [cells];
        frequencies = new ArrayList<>();
    }

    //This method generates 6 unique frequencies in range from 110 to 115...
    public void generateFrequencies(){

        for (int i=0; i<6; i++){
            frequencies.add(110 + i);
        }
        Collections.shuffle(frequencies);
    }

    //This method add cells names to a list of cells...
    public void addCell(String cellName){

        cellsNames[cellIndex] = cellName;
        cellIndex++;
    }

    //This method locate each frequency to each cell and name them...
    public void locateFrequency(){

        int i = 0;
        int index = 0;
        int freq;
        while (i < cellsList.length) {

            //This if-statement restarts index number for frequency list...
            if (index == frequencies.size()) {
                index = 0;
            }
            freq = frequencies.get(index);
            cellsList[i] = new Cell(freq, cellsNames[i]);
            i++;
            index++;

        }
    }
}

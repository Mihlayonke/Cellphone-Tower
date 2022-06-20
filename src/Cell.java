
public class Cell {

    int frequency;      //Frequency of a cell...
    String name;        //ID of a cell as name...

    public Cell(int frequency, String name){
        this.frequency = frequency;
        this.name = name;
    }

    //Return frequency of this cell...
    public int getFrequency(){
        return frequency;
    }

    //Return a id on this cell...
    public String getName(){
        return name;
    }
}


public class Area {

    Frequency frequency ;
    int [][] locations ;        //Double array for placing cells on their relevant locations...
    int cellIndex;

    public Area(int longitude, int latitude, int cells){
        locations = new int [longitude][latitude];
        frequency = new Frequency(cells);
    }

    //This method sets the area by placings cells on their relevant location in latitude and longitude...
    public void setArea(int longitude, int latitude){
        locations[longitude][latitude] = frequency.cellsList[cellIndex].getFrequency();
        cellIndex++;
    }

    //This method print out the graph of an area with cells frequencies...
    public void printArea(){
        System.out.println();

        //This for-loop aligns and prints the list of cells names at the top of a graph...
        for (int k=0; k<frequency.cellsList.length; k++){
            if (k == 0){
                System.out.print("    "+frequency.cellsList[k].getName()+"    ");
                continue;
            }
            System.out.print(frequency.cellsList[k].getName()+"    ");
        }
        System.out.println();

        //This for-loop aligns and prints the frequencies on their locations on an area...
        for (int i=0; i<locations.length; i++){
            System.out.print("-  ");

            for (int j=0; j<locations[i].length; j++){
                if (locations[j][i] < 10){
                    System.out.print(" ");
                }
                if (locations[j][i] == 0){
                    System.out.print("    ");
                    continue;
                }
                System.out.print(locations[j][i] + "  ");
            }
            System.out.println();
        }
    }
}

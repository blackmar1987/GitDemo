package SimpleDotCom;

public class SimpleDotComTestDrive {

public static void main (String[] args){

    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

    SimpleDotCom theDotCOm = new SimpleDotCom();

    int randomNum = (int)(Math.random()*5);

    int [] locations = {randomNum,randomNum+1,randomNum+2};

    theDotCOm.setLocationCells(locations);

    boolean isAlive = true;

    while(isAlive==true) {
        String guess = helper.getUserInput("Введите число");
        String result = theDotCOm.checkYourself(guess);
        numOfGuesses++;
        if(result.equals("Потопил")){
            isAlive = false;
            System.out.println("Вам потребовалось " + numOfGuesses + " попыток");
        }
    }


    }

}


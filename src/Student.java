class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores=scores;
    }


    char calculate(){
        char award;

        int totL=0;
        for (Integer x: testScores){
            totL+=x;
        }

        totL=totL/testScores.length;

        if (totL>=90){
            return 'O';
        }else if (totL>=80){
            return 'E';
        }else if (totL>=70){
            return 'A';
        }else if (totL>=55){
            return 'P';
        }else if (totL>=40){
            return 'D';
        }else
            return 'T';


    }
}
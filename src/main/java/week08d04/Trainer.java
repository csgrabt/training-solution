package week08d04;

public class Trainer {

    private CanMark mood;


    public Trainer(CanMark mood) {
        this.mood = mood;
    }
    public int giveMark() {
        return mood.giveMark();}

    public static void main(String[] args) {

     BadMood badMood = new BadMood();
     GoodMood goodMood = new GoodMood();


     Trainer trainer = new Trainer(badMood);
     Trainer trainer1 = new Trainer(goodMood);

        System.out.println(trainer.giveMark()  + ", " + trainer1.giveMark());




    }


}

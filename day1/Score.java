package day1;

public class Score {
    public static void main(String[] args) {
        int score = 70;
        String grade = "";
        if(score >= 90){
            grade="A";
        }else if(score < 90 && score >= 80){
            grade="B";
        }else if(score < 80 && score >= 70){
            grade = "C";
        }else if(score < 70 && score >= 60){
            grade = "D";
        }else{
            grade = "E";
        }System.out.println(score+"는"+grade+"입니다.");
    }
}

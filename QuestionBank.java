package ajn.kpu.kuispengetahuanumum;


import java.util.Random;

public class QuestionBank {

    String textQuestions [] = {
            "1. Negara terkaya di dunia adalah?",
            "2. Negara termiskin di dunia adalah?",
            "3. Sudut terkecil yang dibentuk jam pada pukul 04.00 adalah?",
            "4. Patung Sphinx terdapat di negara?",
            "5. Flashdisk 8 GB hanya bisa diisi data sebesar?"
    };

    // array of multiple choices for each question
    String multipleChoice [][] = {
            {"Indonesia", "Jepang", "Amerika", "Jerman", "Qatar"},
            {"Kongo", "Senegal", "Nepal", "Kamboja", "Falcon"},
            {"90 derajat", "100 derajat", "110 derajat", "120 derajat", "130 derajat"},
            {"Mesir", "Amerika", "Inggris", "China", "Australia"},
            {"7.0GB", "7.2GB", "7.4GB", "7.6GB", "7.8GB"}
    };

    String mCorrectAnswers[] = {"Qatar", "Kongo", "120 derajat", "Mesir", "7.2GB"};


    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

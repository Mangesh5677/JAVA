
import java.util.Scanner;

public class QuestionService{
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    public QuestionService(){
    questions[0] = new Question(
    1,
    "Which language is primarily used for Android development?",
    "Java",
    "Python",
    "HTML",
    "CSS",
    "Java"
);

questions[1] = new Question(
    2,
    "Which keyword is used to create an object in Java?",
    "class",
    "new",
    "this",
    "static",
    "new"
);

questions[2] = new Question(
    3,
    "Which loop is guaranteed to execute at least once?",
    "for",
    "while",
    "do-while",
    "enhanced for",
    "do-while"
);

questions[3] = new Question(
    4,
    "Which concept allows a class to inherit properties from another class?",
    "Polymorphism",
    "Encapsulation",
    "Inheritance",
    "Abstraction",
    "Inheritance"
);

questions[4] = new Question(
    5,
    "Which method is the entry point of a Java program?",
    "start()",
    "run()",
    "main()",
    "execute()",
    "main()"
);
    }

    public void playQuiz(){
        int i=0;
        for(Question q :questions){
        System.out.println("QuestionNo. :"+q.getId());
        System.out.println("Question:"+q.getQuestion());
        System.out.println("Option 1:"+q.getOpt1());
        System.out.println("Option 2:"+q.getOpt2());
        System.out.println("Option 3:"+q.getOpt3());
        System.out.println("Option 4:"+q.getOpt4());
        Scanner sc = new Scanner(System.in);
       
        selection[i]= sc.nextLine();
        i++;
    }

    for(String s : selection){
        System.out.println(s);
    }
}
}
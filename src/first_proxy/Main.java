package first_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new JavaTrainer();
        TrainingCenter trainingCenter = new TrainingCenter(trainer);
        Trainer stc = (Trainer) Proxy.newProxyInstance(TrainingCenter.class.getClassLoader(),
                new Class[]{Trainer.class}, trainingCenter);
        System.out.println("Without proxy");
        trainer.eat();
        trainer.talk();
        trainer.teach();

        System.out.println("With proxy");
        stc.teach();
        stc.talk();
        stc.eat();
    }
}

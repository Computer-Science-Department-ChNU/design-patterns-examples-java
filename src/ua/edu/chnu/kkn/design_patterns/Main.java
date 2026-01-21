package ua.edu.chnu.kkn.design_patterns;

import ua.edu.chnu.kkn.design_patterns.behavioral.BehavioralRunner;
import ua.edu.chnu.kkn.design_patterns.creational.CreationalRunner;
import ua.edu.chnu.kkn.design_patterns.structural.StructuralRunner;

public class Main {

    public static void main(String[] args) {
        CreationalRunner.run();
        StructuralRunner.run();
        BehavioralRunner.run();
    }
}

package Model.impl;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Model.Calculable;
import Model.NumberClass.ComplexNumber;

public class CalculatorWithLogger implements Calculable {
    private Logger logger;
    private FileHandler fileHandler;
    private SimpleFormatter formatter;
    private Calculator calculator;

    public CalculatorWithLogger() {
        this.calculator = new Calculator();
        logging();
    }

    private void logging() {
        try {
            logger = Logger.getLogger(CalculatorWithLogger.class.getName());
            fileHandler = new FileHandler("MyLogFile.log", true);
            logger.addHandler(fileHandler);
            formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
        calculator.updateComplexNumbers(num1, num2);
    }

    @Override
    public ComplexNumber getResult() {
        return calculator.getResult();
    }

    @Override
    public void addition() {
        calculator.addition();
        logger.info(String.format("Addition... (%s) + (%s) = %s\n",
                    calculator.getComplexNumber1(),
                    calculator.getComplexNumber2(),
                    calculator.getResult()));
        
    }

    @Override
    public void subtraction() {
        calculator.subtraction();
        logger.info(String.format("Subtraction... (%s) - (%s) = %s\n",
                    calculator.getComplexNumber1(),
                    calculator.getComplexNumber2(),
                    calculator.getResult()));
    }

    @Override
    public void division() {
        calculator.division();
        logger.info(String.format("Division... (%s) / (%s) = %s\n",
                    calculator.getComplexNumber1(),
                    calculator.getComplexNumber2(),
                    calculator.getResult()));
    }

    @Override
    public void multiplication() {
        calculator.multiplication();
        logger.info(String.format("Multiplication... (%s) * (%s) = %s\n",
                    calculator.getComplexNumber1(),
                    calculator.getComplexNumber2(),
                    calculator.getResult()));
    }
}
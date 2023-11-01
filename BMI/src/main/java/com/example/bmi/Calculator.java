package com.example.bmi;

public class Calculator {
    private double weight;
    private double height;
    private String unit;
    private double result;
    private String state;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void calculate()
    {
        if (this.unit.equals("Metric"))
        {
            this.result = this.weight / Math.pow(this.height,2);
        }
        if (this.unit.equals("English"))
        {
            this.result = 703 * this.weight / Math.pow(this.height,2);
        }

        if (this.result < 18.5)
        {
            this.state = "Underweight";
        }
        if (this.result  >= 18.5 && this.result <= 24.9)
        {
            this.state = "Normal";
        }
        if (this.result >= 25 && this.result <= 29.9)
        {
            this.state = "Overweight";
        }
        else
        {
            this.state = "Obese";
        }
    }
}

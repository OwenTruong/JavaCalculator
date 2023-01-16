package com.example;

public class BasicCalculator {
    int savedResult = 0;
    char prevOperation = '+';
    BasicCalculator() {
    }

    int add(int a, int b) {
        savedResult = a + b;
        return savedResult;
    }
    int add(int b) {
        savedResult += b;
        return savedResult;
    }

    int sub(int a, int b) {
        savedResult = a - b;
        return savedResult;
    }

    int sub(int b) {
        savedResult -= b;
        return savedResult;
    }

    int multiply(int a, int b) {
        savedResult = a * b;
        return savedResult;
    }

    int multiply(int b) {
        savedResult *= b;
        return savedResult;
    }

    int divide(int a, int b) {
        savedResult = a / b;
        return savedResult;
    }

    int divide(int b) {
        savedResult /= b;
        return savedResult;
    }

    int convertSign(int a) {
        savedResult = -a;
        return savedResult;
    }

    int convertSign() {
        savedResult = -savedResult;
        return savedResult;
    }

    int computeMod(int a, int divisor) {
        savedResult = a % divisor;
        return savedResult;
    }

    int computeMod(int divisor) {
        savedResult %= divisor;
        return savedResult;
    }

    int computeExp(int a, int exp) {
        savedResult = (int) Math.pow(a, exp);
        return savedResult;
    }

    int computeExp(int exp) {
        savedResult = (int) Math.pow(savedResult, exp);
        return savedResult;
    }
}

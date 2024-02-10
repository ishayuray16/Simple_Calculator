# Core artihmetic functions
class Artimetic:
    def add(num1, num2):
        return num1+num2
    def subtract(num1,num2):
        return num1-num2
    def multiply(num1,num2):
        return num1*num2
    def divide(num1,num2):
        return num1/num2
    def power(num1, num2):
        power = 0
        while num2>0:
            power*=num1
            num2-=1
        return power
    def rt(num1, num2):
        currentnum = 0
        while currentnum!=num1
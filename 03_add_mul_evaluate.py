#Create a program in python to define separate functions for (a) addition of three numbers (b) multiplication of 3 numbers (c) calculating the value of the equation (6t^3 + 1)^3 - (6t^3 - 1)^3 - (6t^2)^3 where t is an input value. Try breaking various sections of the equation into separate functions . You may provide the value of t within the program itself of take is as an user input using the python input() function 

def add(a, b, c):
   return a+b+c

def multiply(a, b, c = 1):
   return a*b*c

def cube(n):
    return multiply(n, n, n)

def square(n):
    return multiply(n, n)

def evaluate(t):
    term1 = cube(6 * cube(t) + 1) # (6t^3 + 1)^3
    term2 = cube(6 * cube(t) - 1) # (6t^3 - 1)^3
    term3 = cube(6 * square(t)) # (6t^2)^3
    return term1 - term2 - term3

flag = True

while flag:
    # Main Menu
    print('\n1. Add')
    print('2. Multiply')
    print('3. Evaluate')
    print('0. Exit')
    choice = int(input('Enter your choice: '))

    if choice in (1,2):
        print('Enter three numbers: ')
        numbers = [int(input()) for i in range(3)]
        num1, num2, num3 = numbers
        if choice == 1:
            print("Result of summation: %d" % add(num1, num2, num3))
        else:
            print("Result of multiplication: %d" % multiply(num1, num2, num3))
    elif choice == 3:
        t = int(input('Enter the value of t: '))
        print("Result of evaluation: %d" % evaluate(t))
    elif choice == 0:
        flag = False
    else:
        print("Wrong selection! Choose correct one !")
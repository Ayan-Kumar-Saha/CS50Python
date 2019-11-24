# 1. Create a program, in any language of your choice, to calculate the square root of a number. You may include calculating square root of a negative number as well, if you wish to. Needless to say, do not use any library functions / methods!

import math

def binary_search(number, low, high):
    mid = (low + high) / 2
    new_number = mid * mid

    if new_number == number or abs(new_number - number) < 0.0001:
        return mid
    elif new_number > number:
        return binary_search(number, low, mid)
    else:
        return binary_search(number, mid, high)

def find_sqrt(number):
    num = 1
    while True:
        if num * num == number:
            return num
        elif num * num > number:
            return binary_search(number, num-1, num)
        num += 1

number = int(input('Enter a number: '))
if number < 0:
    number = abs(number)
    print("The square root of %d is %.3fi" % (number,find_sqrt(number)))
else:
    print("The square root of %d is %.3f" % (number,find_sqrt(number)))

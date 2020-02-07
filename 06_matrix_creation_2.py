# Write a python program to create a n x m matrix where n is user input, and m is floor((n * 2) / 0.3) .

from math import floor

def get_input(n):

    m = floor((n * 2) / 0.3)

    numbers = []

    print('Enter the elements: ')

    for row in range(n):

        numbers.append( [ int(input()) for col in range(m) ] )

    return numbers


def display_matrix(numbers):

    print('\nThe matrix is row-major order\n')

    for row in numbers:

        for col in row:

            print(col, end = '\t')

        print("\n")


def main():

    n = int(input('Enter the number of rows: '))

    numbers = get_input(n)

    display_matrix(numbers)
    

main()
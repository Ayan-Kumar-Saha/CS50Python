# Write a python program to create a n x n matrix where n is an user input value. (Figure out how to take user inputs in python)

def get_input(n):

    numbers = []

    print('Enter the elements: ')

    for row in range(n):

        numbers.append( [ int(input()) for col in range(n) ] )

    return numbers


def display_matrix(numbers):

    print('\nThe matrix is row-major order\n')

    for row in numbers:

        for col in row:

            print(col, end = '\t')

        print("\n")


def main():

    n = int(input('Enter the order of the matrix: '))

    numbers = get_input(n)

    display_matrix(numbers)
    

main()
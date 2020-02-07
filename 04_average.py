#  Write a python program to find the average of all numbers within a list.

number_of_elements = int(input('Enter the number of elements: '))

numbers = [int(input()) for i in range(number_of_elements)]

print('Average is %.3f' % float(sum(numbers) / len(numbers)))

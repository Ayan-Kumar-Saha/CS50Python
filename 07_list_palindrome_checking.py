# Write a python program to create a list. Fill the list with user inputs. Check if the list is palindrome.


number_of_elements = int(input('Enter the number of elements: '))

numbers = [ int(input()) for i in range(number_of_elements) ]

copy = numbers.copy()

numbers.reverse()

if copy == numbers:

    print('The list is palindrome')

else:

    print('The list is not palindrome')

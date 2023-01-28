# Why am I doing this simple thing?
'''
    Well this is an amazing example of why I need to use maths in my program
    How maths can make my life easy and programming logics amazing

    How? - See the plan

         R P S <- Computer
         0 1 2
         -----
    R 0 |D L W 
    P 1 |W D L
    S 2 |L W D
    ^
    | 
    Me
'''
import random

rules = '''
    0 - Rock
    1 - Paper
    2 - Scissors
'''
print(rules)

my_choice = int(input('Enter a number between 0 or 2 : '))

computer_choice = random.randint(0,2)
print(f'Computer chose : {computer_choice}')

if my_choice is computer_choice:
    print('Draw')
    exit()

match my_choice:
    case 0 if computer_choice == 2:
        print('You Win!')
    case 1 if computer_choice == 0:
        print('You Win!')
    case 2 if computer_choice == 1:
        print('You Win!')
    case _:
        print('You Lose')
